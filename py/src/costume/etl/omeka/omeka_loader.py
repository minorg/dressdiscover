from collections import OrderedDict
from datetime import datetime
import json
import os.path

import pytz

from costume.api.models.agent.agent import Agent
from costume.api.models.agent.agent_name import AgentName
from costume.api.models.agent.agent_name_type import AgentNameType
from costume.api.models.agent.agent_role import AgentRole
from costume.api.models.agent.agent_set import AgentSet
from costume.api.models.collection.collection import Collection
from costume.api.models.date.date import Date
from costume.api.models.date.date_bound import DateBound
from costume.api.models.date.date_set import DateSet
from costume.api.models.date.date_time_granularity import DateTimeGranularity
from costume.api.models.date.date_type import DateType
from costume.api.models.description.description import Description
from costume.api.models.description.description_set import DescriptionSet
from costume.api.models.description.description_type import DescriptionType
from costume.api.models.gender.gender import Gender
from costume.api.models.image.image import Image
from costume.api.models.image.image_version import ImageVersion
from costume.api.models.inscription.inscription import Inscription
from costume.api.models.inscription.inscription_set import InscriptionSet
from costume.api.models.inscription.inscription_text import InscriptionText
from costume.api.models.inscription.inscription_text_type import InscriptionTextType
from costume.api.models.institution.institution import Institution
from costume.api.models.material.material import Material
from costume.api.models.material.material_set import MaterialSet
from costume.api.models.material.material_type import MaterialType
from costume.api.models.object.object import Object
from costume.api.models.object.object_entry import ObjectEntry
from costume.api.models.rights.rights import Rights
from costume.api.models.rights.rights_set import RightsSet
from costume.api.models.rights.rights_type import RightsType
from costume.api.models.subject.subject import Subject
from costume.api.models.subject.subject_set import SubjectSet
from costume.api.models.subject.subject_term import SubjectTerm
from costume.api.models.subject.subject_term_type import SubjectTermType
from costume.api.models.technique.technique import Technique
from costume.api.models.technique.technique_set import TechniqueSet
from costume.api.models.textref.textref import Textref
from costume.api.models.textref.textref_name import TextrefName
from costume.api.models.textref.textref_name_type import TextrefNameType
from costume.api.models.textref.textref_refid import TextrefRefid
from costume.api.models.textref.textref_refid_type import TextrefRefidType
from costume.api.models.textref.textref_set import TextrefSet
from costume.api.models.title.title import Title
from costume.api.models.title.title_set import TitleSet
from costume.api.models.title.title_type import TitleType
from costume.api.models.vocab import Vocab
from costume.api.models.vocab_ref import VocabRef
from costume.api.models.work_type.work_type import WorkType
from costume.api.models.work_type.work_type_set import WorkTypeSet
from costume.etl._loader import _Loader


try:
    import dateparser.date
except ImportError:
    dateparser = None


DCMI_TYPES = (
    'Collection',
    'Dataset',
    'Event',
    'Image',
    'InteractiveResource',
    'MovingImage',
    'PhysicalObject',
    'Service',
    'Software',
    'Sound',
    'StillImage',
    'Text',
)

DCMI_TYPES_BASE_URL = 'http://purl.org/dc/dcmitype/'


class OmekaLoader(_Loader):
    def __init__(
        self,
        endpoint_url,
        institution_title,
        institution_url,
        square_thumbnail_height_px,
        square_thumbnail_width_px,
        **kwds
    ):
        _Loader.__init__(self, **kwds)
        if not endpoint_url.endswith('/'):
            endpoint_url = endpoint_url + '/'
        self.__endpoint_url = endpoint_url
        self.__institution_title = institution_title
        self.__institution_url = institution_url
        self.__square_thumbnail_height_px = square_thumbnail_height_px
        self.__square_thumbnail_width_px = square_thumbnail_width_px

    @classmethod
    def _add_arguments(cls, argument_parser):
        _Loader._add_arguments(argument_parser)
        argument_parser.add_argument('--endpoint-url', required=True)
        argument_parser.add_argument('--institution-id', required=True)
        argument_parser.add_argument('--institution-title', required=True)
        argument_parser.add_argument('--institution-url', required=True)
        argument_parser.add_argument('--square-thumbnail-height-px', default=150)
        argument_parser.add_argument('--square-thumbnail-width-px', default=150)

    def _load(self):
#         DATETIME_NOW = datetime.now()
        endpoint_url = self.__endpoint_url
        institution_id = self._institution_id
        logger = self._logger

        self._services.institution_command_service.put_institution(
            self._institution_id,
            Institution.Builder()
                .set_data_rights(
                    RightsSet.Builder()
                        .set_elements((
                            Rights.Builder()
                                .set_rights_holder(self.__institution_title)
                                .set_text("Copyright %s %s" % (datetime.now().year, self.__institution_title))
                                .set_type(RightsType.COPYRIGHTED)
                                .build()

                        ,))
                        .build()
                )
                .set_model_metadata(self._new_model_metadata())
                .set_title(self.__institution_title)
                .set_url(self.__institution_url)
                .build()
        )

        with open(os.path.join(self._data_dir_path, institution_id, 'collections.json')) as f:
            collection_dicts = json.loads(f.read())


        seen_omeka_item_ids = {}

        for collection_dict in collection_dicts:
            omeka_collection_id = collection_dict['id']

            if not collection_dict['public']:
                logger.info("collection %d is not public, skipping", omeka_collection_id)
                continue

            logger.debug("reading collection %d", omeka_collection_id)
            collection_id = institution_id + '/' + str(omeka_collection_id)

            collection_builder = \
                Collection.Builder()\
                    .set_institution_id(institution_id)\
                    .set_model_metadata(self._new_model_metadata())

            for element_text_dict in collection_dict['element_texts']:
                text = element_text_dict['text']
                if len(text) == 0:
                    continue
                element_set_name = element_text_dict['element_set']['name']
                element_name = element_text_dict['element']['name']

                if element_set_name == 'Dublin Core':
                    if element_name == 'Contributor':
                        pass
                    elif element_name == 'Description':
                        collection_builder.set_description(text)
                    elif element_name == 'Title':
                        collection_builder.set_title(text)

            collection = collection_builder.build()

            # Don't put the collection until we're sure it has objects

            with open(os.path.join(self._data_dir_path, institution_id, 'collection', str(omeka_collection_id), 'items.json')) as f:
                item_dicts = json.loads(f.read())
            logger.info("loading %d items from collection %d", len(item_dicts), omeka_collection_id)

            objects_by_id = OrderedDict()
            for item_i, item_dict in enumerate(item_dicts):
                omeka_item_id = item_dict['id']
                if omeka_item_id in seen_omeka_item_ids:
                    raise RuntimeError('duplicate item id ' + str(omeka_item_id))
                seen_omeka_item_ids[omeka_item_id] = None

                object_id = collection_id + '/' + str(omeka_item_id)
                object_builder = \
                    Object.Builder()\
                        .set_collection_id(collection_id)\
                        .set_institution_id(institution_id)\
                        .set_model_metadata(self._new_model_metadata())

                agents = []
                categories = []
                dates = []
                descriptions = []
                identifiers = []
                include_object = True
                inscriptions = []
                materials = []
                subjects = []
                techniques = []
                textrefs = []
                titles = []
                work_types = []

                textrefs.append(
                    Textref.Builder()
                        .set_name(
                            TextrefName.Builder()
                                .set_text("Omeka item URL")
                                .set_type(TextrefNameType.ELECTRONIC)
                                .build()
                        )
                        .set_refid(
                            TextrefRefid.Builder()
                                .set_href(endpoint_url + 'items/show/' + str(omeka_item_id))
                                .set_text(endpoint_url + 'items/show/' + str(omeka_item_id))
                                .set_type(TextrefRefidType.URI)
                                .build()
                        )
                        .build()
                )

                for element_text_dict in item_dict['element_texts']:
                    text = element_text_dict['text'].strip()
                    if len(text) == 0:
                        continue
                    element_set_name = element_text_dict['element_set']['name']
                    element_name = element_text_dict['element']['name']

                    if element_set_name == 'Dublin Core':
                        if element_name == 'Alternative Title':
                            titles.append(
                                Title.Builder()
                                    .set_text(text)
                                    .set_type(TitleType.DESCRIPTIVE)
                                    .build()
                            )
                        elif element_name == 'Contributor':
                            agents.append(
                                Agent.Builder()
                                    .set_name(AgentName.Builder().set_text(text).set_type(AgentNameType.OTHER).build())
                                    .set_role(
                                        AgentRole.Builder()
                                            .set_text('contributor')
                                            .set_vocab_ref(
                                                    VocabRef.Builder().set_vocab(Vocab.DC).build()
                                            )
                                            .build()
                                        )
                                    .build()
                            )
                        elif element_name == 'Creator':
                            agents.append(
                                Agent.Builder()
                                    .set_name(AgentName.Builder().set_text(text).set_type(AgentNameType.OTHER).build())
                                    .set_role(
                                        AgentRole.Builder()
                                            .set_text('creator')
                                            .set_vocab_ref(
                                                    VocabRef.Builder().set_vocab(Vocab.DC).build()
                                            )
                                            .build()
                                        )
                                    .build()
                            )
                        elif element_name == 'Date':
                            earliest_date, latest_date = self.__parse_date_range(text)
                            dates.append(
                                Date.Builder()
                                    .set_earliest_date(earliest_date)
                                    .set_latest_date(latest_date)
                                    .set_type(DateType.CREATION)
                                    .build()
                            )
                        elif element_name == 'Description':
                            descriptions.append(
                                Description.Builder()
                                    .set_text(text)
                                    .build()
                            )
                        elif element_name == 'Identifier':
                            if not text in identifiers:
                                identifiers.append(text)
                        elif element_name == 'Medium':
                            text = text.strip("'")
                            for medium in text.split(';'):
                                for medium in medium.split(','):
                                    medium = medium.strip()
                                    if len(medium) == 0:
                                        continue
                                    materials.append(
                                        Material.Builder()
                                            .set_text(medium)
                                            .set_type(MaterialType.MEDIUM)
                                            .build()
                                    )
                        elif element_name == 'Provenance':
                            object_builder.set_provenance(text)
                        elif element_name == 'Rights':
                            object_builder.set_rights(
                                RightsSet.Builder()
                                    .set_elements((
                                        Rights.Builder()
                                            .set_rights_holder(self.__institution_title)
                                            .set_text(text)
                                            .set_type(RightsType.UNDETERMINED)
                                            .build()
                                    ,))
                                    .build()
                            )
                        elif element_name == 'Subject':
                            for text_split in text.split(';'):
                                text_split = text_split.strip()
                                if len(text_split) == 0:
                                    continue
                                subjects.append(
                                    Subject.Builder()
                                        .set_terms((
                                            SubjectTerm.Builder()
                                                .set_text(text_split)
                                                .set_type(SubjectTermType.OTHER_TOPIC)
                                                .build()
                                        ,))
                                        .build()
                                )
                        elif element_name == 'Title':
                            titles.append(
                                Title.Builder()
                                    .set_pref(True)
                                    .set_text(text)
                                    .set_type(TitleType.DESCRIPTIVE)
                                    .build()
                            )
                        elif element_name == 'Type':
                            type_ = text.strip().replace(' ', '')
                            if type_ in DCMI_TYPES:
                                if type_ in ('Image', 'PhysicalObject', 'StillImage'):
                                    work_types.append(
                                        WorkType.Builder()
                                            .set_text(type_)
                                            .set_vocab_ref(
                                                VocabRef.Builder()
                                                    .set_refid(type_)
                                                    .set_vocab(Vocab.DCMI_TYPE)
                                                    .set_uri(DCMI_TYPES_BASE_URL + type_)
                                                    .build()
                                            )
                                            .build()
                                    )
                                else:
                                    include_object = False
                                    break
                            else:
        #                         work_types.append(
        #                             WorkType.Builder()
        #                                 .set_text(text)
        #                                 .build()
        #                         )
                                include_object = False
                                break
                        else:
                            logger.warn("skipping item Dublin Core element %s: %s", element_name, text.encode('ascii', 'ignore'))
                    elif element_set_name == 'Item Type Metadata':
                        if element_name == 'Accession Number':
                            textrefs.append(
                                Textref.Builder()
                                    .set_name(
                                        TextrefName.Builder()
                                            .set_text("Accession number")
                                            .set_type(TextrefNameType.CATALOG)
                                            .build()
                                    )
                                    .set_refid(
                                        TextrefRefid.Builder()
                                            .set_text(text)
                                            .set_type(TextrefRefidType.OTHER)
                                            .build()
                                    )
                                    .build()
                            )
                        elif element_name == 'Category':
                            categories.append(text)
                        elif element_name == 'Classification':
                            categories.append(text)
                        elif element_name == 'Condition':
                            descriptions.append(
                                Description.Builder()
                                    .set_text(text)
                                    .set_type(DescriptionType.CONDITION)
                                    .build()
                            )
                        elif element_name == 'Description':
                            descriptions.append(
                                Description.Builder()
                                    .set_text(text)
                                    .build()
                            )
                        elif element_name == 'Description Main':
                            descriptions.append(
                                Description.Builder()
                                    .set_text(text)
                                    .set_type(DescriptionType.SUMMARY)
                                    .build()
                            )
                        elif element_name == 'Donation Date':
                            earliest_date = latest_date = self.__parse_date(text)
                            dates.append(
                                Date.Builder()
                                    .set_earliest_date(earliest_date)
                                    .set_latest_date(earliest_date)
                                    .set_type(DateType.DONATION)
                                    .build()
                            )
                        elif element_name == 'Donor':
                            agents.append(
                                Agent.Builder()
                                    .set_name(
                                        AgentName.Builder()
                                            .set_text(text)
                                            .set_type(AgentNameType.OTHER)
                                            .build()
                                        )
                                    .set_role(
                                        AgentRole.Builder()
                                            .set_text('donor')
                                            .build()
                                        )
                                    .build()
                            )
                        elif element_name == 'Exhibition Notes':
                            descriptions.append(
                                Description.Builder()
                                    .set_text(text)
                                    .set_type(DescriptionType.EXHIBITION)
                                    .build()
                            )
                        elif element_name == 'Gender':
                            text = text.lower().split(',')[0]
                            if text == 'female':
                                gender = Gender.FEMALE
                            elif text == 'male':
                                gender = Gender.MALE
                            else:
                                raise NotImplementedError(text)
                            if object_builder.gender is not None:
                                assert object_builder.gender == gender, "%s vs. %s" % (object_builder.gender, gender)
                            object_builder.set_gender(gender)
                        elif element_name == 'Label':
                            text = text.strip("'").strip()
                            if len(text) == 0:
                                continue
                            inscriptions.append(
                                Inscription.Builder()
                                    .set_texts((
                                        InscriptionText.Builder()
                                            .set_text(text)
                                            .set_type(InscriptionTextType.LABEL)
                                            .build()
                                    ,))
                                    .build()
                            )
                        elif element_name == 'Private Information':
                            descriptions.append(
                                Description.Builder()
                                    .set_text(text)
                                    .set_type(DescriptionType.PRIVATE)
                                    .build()
                            )
                        elif element_name == 'Public Information':
                            descriptions.append(
                                Description.Builder()
                                    .set_text(text)
                                    .set_type(DescriptionType.PUBLIC)
                                    .build()
                            )
                        elif element_name == 'Quantity':
                            try:
                                quantity = int(text)
                            except ValueError:
                                logger.warn("unparseable quantity: %s", text)
                                continue
                            if object_builder.quantity is not None:
                                assert object_builder.quantity == quantity, "%d vs. %d" % (object_builder.quantity, quantity)
                            object_builder.set_quantity(quantity)
                        elif element_name == 'References':
                            textrefs.append(
                                Textref.Builder()
                                    .set_name(
                                        TextrefName.Builder()
                                            .set_text(text)
                                            .set_type(TextrefNameType.CORPUS)
                                            .build()
                                    )
                                    .set_refid(
                                        TextrefRefid.Builder()
                                            .set_text("unparsed")
                                            .set_type(TextrefRefidType.CITATION)
                                            .build()
                                    )
                                    .build()
                            )
                        elif element_name == 'Source Identifier':
                            if not text in identifiers:
                                identifiers.append(text)
                        elif element_name == 'Technique':
                            for technique in text.split(';'):
                                for technique in technique.split(','):
                                    technique = technique.strip()
                                    if len(technique) == 0:
                                        continue
                                    techniques.append(
                                        Technique.Builder()
                                            .set_text(technique)
                                            .build()
                                    )
                        elif element_name == 'Wearer':
                            agents.append(
                                Agent.Builder()
                                    .set_name(
                                        AgentName.Builder()
                                            .set_text(text)
                                            .set_type(AgentNameType.PERSONAL)
                                            .build()
                                        )
                                    .set_role(
                                        AgentRole.Builder()
                                            .set_text('wearer')
                                            .build()
                                        )
                                    .build()
                            )
                        else:
                            logger.warn("skipping item Item Type Metadata element %s: %s", element_name, text.encode('ascii', 'ignore'))
                    else:
                        logger.warn("skipping item %s element set", element_set_name)

                if not include_object:
                    logger.info("excluding item %d", omeka_item_id)
                    continue

                if len(agents) > 0:
                    object_builder.set_agents(AgentSet.Builder().set_elements(tuple(agents)).build())
                if len(categories) > 0:
                    object_builder.set_categories(tuple(categories))
                if len(dates) > 0:
                    object_builder.set_dates(DateSet.Builder().set_elements(tuple(dates)).build())
                if len(descriptions) > 0:
                    description_texts = {}
                    description_i = 0
                    while description_i < len(descriptions):
                        description = descriptions[description_i]
                        if description.text in description_texts:
                            del descriptions[description_i]
                        else:
                            description_texts[description.text] = None
                            description_i = description_i + 1
                    object_builder.set_descriptions(DescriptionSet.Builder().set_elements(tuple(descriptions)).build())
                for identifier in identifiers:
                    textrefs.append(
                        Textref.Builder()
                            .set_name(
                                TextrefName.Builder()
                                    .set_text("Identifier")
                                    .set_type(TextrefNameType.CATALOG)
                                    .build()
                            )
                            .set_refid(
                                TextrefRefid.Builder()
                                    .set_text(identifier)
                                    .set_type(TextrefRefidType.OTHER)
                                    .build()
                            )
                            .build()
                    )
                if len(inscriptions) > 0:
                    object_builder.set_inscriptions(InscriptionSet.Builder().set_elements(tuple(inscriptions)).build())
                if len(materials) > 0:
                    object_builder.set_materials(MaterialSet.Builder().set_elements(tuple(materials)).build())
                if len(subjects) > 0:
                    object_builder.set_subjects(SubjectSet.Builder().set_elements(tuple(subjects)).build())
                if len(techniques) > 0:
                    object_builder.set_techniques(TechniqueSet.Builder().set_elements(tuple(techniques)).build())
                if len(textrefs) > 0:
                    object_builder.set_textrefs(TextrefSet.Builder().set_elements(tuple(textrefs)).build())
                if len(titles) > 0:
                    object_builder.set_titles(TitleSet.Builder().set_elements(tuple(titles)).build())
                else:
                    logger.warn("item %d has no titles, excluding", omeka_item_id)
                    continue
                if len(work_types) > 0:
                    object_builder.set_work_types(WorkTypeSet.Builder().set_elements(tuple(work_types)).build())
                else:
                    logger.warn("item %d has no work types, excluding", omeka_item_id)

                try:
                    files_count = item_dict['files']['count']
                except KeyError:
                    files_count = 0

                if files_count > 0:
                    file_dicts = []
                    files_dir_path = os.path.join(self._data_dir_path, institution_id, 'files_by_item_id', str(omeka_item_id))
                    if os.path.isdir(files_dir_path):
                        for file_file_path in os.listdir(files_dir_path):
                            if not file_file_path.endswith('.json'):
                                continue
                            file_file_path = os.path.join(files_dir_path, file_file_path)
                            if not os.path.isfile(file_file_path):
                                continue
                            with open(file_file_path, 'rb') as f:
                                file_dict = json.load(f)
                                file_dicts.append(file_dict)
                    images = []
                    for file_dict in file_dicts:
                        # file_id = file_dict['id']
                        file_mime_type = file_dict['mime_type']
                        if not file_mime_type.startswith('image/'):
                            continue

                        original_image_height = original_image_width = None
                        for element_text_dict in file_dict['element_texts']:
                            text = element_text_dict['text']
                            if len(text) == 0:
                                continue
                            element_set_name = element_text_dict['element_set']['name']
                            element_name = element_text_dict['element']['name']
                            if element_set_name == 'Omeka Image File':
                                if element_name == 'Height':
                                    original_image_height = int(text)
                                elif element_name == 'Width':
                                    original_image_width = int(text)
        #                             else:
        #                                 print 'skipping image file element', element_name

                        image_builder = Image.Builder()
                        image_versions_count = 0
                        for name, file_url in file_dict['file_urls'].iteritems():
                            if file_url is None or len(file_url) == 0:
                                continue
                            image_version_builder = ImageVersion.Builder().set_url(file_url)
                            if name == 'fullsize':
                                image_builder.set_full_size(image_version_builder.build())
                                image_versions_count = image_versions_count + 1
                            elif name == 'original':
                                if original_image_height is not None:
                                    image_version_builder.set_height_px(original_image_height)
                                if original_image_width is not None:
                                    image_version_builder.set_width_px(original_image_width)
                                image_builder.set_original(image_version_builder.build())
                                image_versions_count = image_versions_count + 1
                            elif name == 'square_thumbnail':
                                image_version_builder.set_height_px(self.__square_thumbnail_height_px)
                                image_version_builder.set_width_px(self.__square_thumbnail_width_px)
                                image_builder.set_square_thumbnail(image_version_builder.build())
                                image_versions_count = image_versions_count + 1
                            elif name == 'thumbnail':
                                image_builder.set_thumbnail(image_version_builder.build())
                                image_versions_count = image_versions_count + 1
                            else:
                                raise NotImplementedError(name)
                        if image_versions_count > 0:
                            images.append(image_builder.build())
                    if len(images) > 0:
                        object_builder.set_images(tuple(images))

                try:
                    object_ = object_builder.build()
                except ValueError:
                    logger.error("error building object from item %d", omeka_item_id, exc_info=True)
                    continue

                objects_by_id[object_id] = object_

                logger.debug("loaded %d/%d items from collection %d", item_i + 1, len(item_dicts), omeka_collection_id)

            if len(objects_by_id) == 0:
                logger.info("collection %d has no objects, skipping", omeka_collection_id)
                continue

            self._services.collection_command_service.put_collection(collection_id, collection)

            logger.info("putting %d objects to collection %d", len(objects_by_id), omeka_collection_id)
            self._services.object_command_service.put_objects(
                tuple(ObjectEntry(object_id, object_)
                      for object_id, object_ in objects_by_id.iteritems())
            )


    def __parse_date(self, text):
        builder = DateBound.Builder().set_text(text)

        if text.endswith('?'):
            builder.set_circa(True)
            text = text[:-1]

        parsed_date_time = None
        parsed_date_time_granularity = None

        try:
            year = int(text)
            parsed_date_time = datetime(year, 1, 1)
            parsed_date_time_granularity = DateTimeGranularity.YEAR
        except ValueError:
            pass

        if parsed_date_time is None:
            if dateparser is not None:
                parser = dateparser.date.DateDataParser(languages=('en',))
                date_data = parser.get_date_data(text)
                parsed_date_time = date_data['date_obj']
                if parsed_date_time is not None:
                    period = date_data['period']
                    if period == 'day':
                        parsed_date_time = parsed_date_time.replace(hour=0, minute=0, second=0, microsecond=0)
                        parsed_date_time_granularity = DateTimeGranularity.DAY
                    elif period == 'month':
                        parsed_date_time = parsed_date_time.replace(day=1, hour=0, minute=0, second=0, microsecond=0)
                        parsed_date_time_granularity = DateTimeGranularity.MONTH
                    elif period == 'year':
                        parsed_date_time = parsed_date_time.replace(day=1, month=1, hour=0, minute=0, second=0, microsecond=0)
                        parsed_date_time_granularity = DateTimeGranularity.YEAR
                    else:
                        raise NotImplementedError(period)

        if parsed_date_time is not None:
            parsed_date_time = parsed_date_time.replace(tzinfo=pytz.utc)

            if parsed_date_time.year > datetime.now().year or parsed_date_time.year < 1000:
                self._logger.warn("parsed date time has year out of range: '%s' from '%s'", parsed_date_time, text)
                return builder.build()

            builder.set_parsed_date_time(parsed_date_time)
            if parsed_date_time_granularity is not None:
                builder.set_parsed_date_time_granularity(parsed_date_time_granularity)
            self._logger.info("parsed date '%s' from %s at granularity '%s'", parsed_date_time, text, parsed_date_time_granularity)

        return builder.build()

    def __parse_date_range(self, text):
        text_split = text.split('-', 1)
        if len(text_split) == 1:
            parsed_date = self.__parse_date(text)
            date_range = parsed_date, parsed_date
        elif len(text_split) == 2:
            date_range = self.__parse_date(text_split[0]), self.__parse_date(text_split[1])
        else:
            raise NotImplementedError
        self._logger.info("parsed date range '%s' from '%s'", date_range, text)
        return date_range
