from collections import OrderedDict
import java.util
import json
import logging

from costume.lib.stores.object.omeka.dcmi_types import DCMI_TYPES, \
    DCMI_TYPES_BASE_URL
from net.lab1318.costume.api.models import ModelMetadata, VocabRef, Vocab
from net.lab1318.costume.api.models.agent import AgentSet, Agent, AgentName, \
    AgentNameType, AgentRole
from net.lab1318.costume.api.models.cultural_context import CulturalContextSet
from net.lab1318.costume.api.models.date import DateType, DateBound, DateSet, \
    Date
from net.lab1318.costume.api.models.description import DescriptionSet, \
    Description
from net.lab1318.costume.api.models.image import Image, ImageVersion
from net.lab1318.costume.api.models.inscription import InscriptionSet
from net.lab1318.costume.api.models.location import LocationSet
from net.lab1318.costume.api.models.material import MaterialSet, Material, \
    MaterialType
from net.lab1318.costume.api.models.measurements import MeasurementsSet, \
    Measurements, MeasurementsType
from net.lab1318.costume.api.models.object import Object
from net.lab1318.costume.api.models.relation import RelationSet, Relation, \
    RelationType
from net.lab1318.costume.api.models.rights import RightsSet, Rights, RightsType
from net.lab1318.costume.api.models.subject import SubjectSet, Subject, \
    SubjectTerm, SubjectTermType
from net.lab1318.costume.api.models.technique import TechniqueSet
from net.lab1318.costume.api.models.textref import Textref, TextrefName, \
    TextrefNameType, TextrefRefid, TextrefRefidType, TextrefSet
from net.lab1318.costume.api.models.title import TitleSet, Title, TitleType
from net.lab1318.costume.api.models.work_type import WorkTypeSet, WorkType
import os.path


class OmekaItemToObjectMapper(object):
    class _ObjectBuilder(object):
        def __init__(
            self,
            endpoint_url,
            collection_id,
            institution_id,
            logger,
            object_id,
            omeka_collection_id,
            omeka_item_id
        ):
            self.__institution_id = institution_id
            datetime_now = java.util.Date()
            self._object_builder = \
                Object.Builder()\
                    .set_collection_id(collection_id)\
                    .set_institution_id(institution_id)\
                    .set_model_metadata(ModelMetadata.Builder().set_ctime(datetime_now).set_mtime(datetime_now).build())
            self.__logger = logger
            self.__object_id = object_id
            self.__omeka_collection_id = omeka_collection_id
            self.__omeka_item_id = omeka_item_id

            self.agents = []
            self.categories = []
            self.cultural_contexts = []
            self.dc_date_builder = Date.Builder().set_type(DateType.CREATION)
            self.dc_date_certainty = None
            self.dates = []
            self.descriptions = []
            self.identifiers = []
            self.images = []
            self.inscriptions = []
            self.locations = []
            self.materials = []
            self.measurements = []
            self.relation_builders = []
            self.subjects = []
            self.techniques = []
            self.textrefs = []
            self.titles = []
            self.work_types = []

            self.textrefs.append(
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

        def build(self):
            if len(self.agents) > 0:
                self._object_builder.set_agents(AgentSet.Builder().set_elements(tuple(self.agents)).build())
            if len(self.categories) > 0:
                self._object_builder.set_categories(tuple(set(self.categories)))
            if len(self.cultural_contexts) > 0:
                self._object_builder.set_cultural_contexts(CulturalContextSet.Builder().set_elements(tuple(self.cultural_contexts)).build())
            if self.dc_date_builder.earliest_date is not None and self.dc_date_builder.latest_date is not None:
                if self.dc_date_certainty is not None:
                    assert self.dc_date_certainty == 'circa'
                    self.dc_date_builder.earliest_date =\
                        DateBound.Builder(**self.dc_date_builder.earliest_date.as_dict())\
                            .set_circa(True)\
                            .build()
                    self.dc_date_builder.latest_date =\
                        DateBound.Builder(**self.dc_date_builder.latest_date.as_dict())\
                            .set_circa(True)\
                            .build()
                self.dates.append(self.dc_date_builder.build())
            if len(self.dates) > 0:
                self._object_builder.set_dates(DateSet.Builder().set_elements(tuple(self.dates)).build())
            if len(self.descriptions) > 0:
                description_texts = {}
                description_i = 0
                while description_i < len(self.descriptions):
                    description = self.descriptions[description_i]
                    if description.text in description_texts:
                        del self.descriptions[description_i]
                    else:
                        description_texts[description.text] = None
                        description_i = description_i + 1
                self._object_builder.set_descriptions(DescriptionSet.Builder().set_elements(tuple(self.descriptions)).build())
            for identifier in self.identifiers:
                self.textrefs.append(
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
            if len(self.images) > 0:
                self._object_builder.set_images(tuple(self.images))
            if len(self.inscriptions) > 0:
                self._object_builder.set_inscriptions(InscriptionSet.Builder().set_elements(tuple(self.inscriptions)).build())
            if len(self.locations) > 0:
                self._object_builder.set_locations(LocationSet.Builder().set_elements(tuple(self.locations)).build())
            if len(self.materials) > 0:
                self._object_builder.set_materials(MaterialSet.Builder().set_elements(tuple(self.materials)).build())
            if len(self.measurements) > 0:
                self._object_builder.set_measurements(MeasurementsSet.Builder().set_elements(tuple(self.measurements)).build())
            if len(self.relation_builders) > 0:
                unique_relation_builders_by_text = {}
                for relation_builder in self.relation_builders:
                    assert relation_builder.text is not None
                    existing_relation_builders = unique_relation_builders_by_text.setdefault(relation_builder.text, [])
                    unique = True
                    for existing_relation_builder in existing_relation_builders:
                        if existing_relation_builder.type == relation_builder.type:
                            unique = False
                            break
                    if unique:
                        existing_relation_builders.append(relation_builder)
                    else:
                        self.__logger.warn("item %d has duplicate relation type=%s, text=%s", self.__omeka_item_id, relation_builder.type, relation_builder.text)
                unique_relation_builders = []
                for relation_builders in unique_relation_builders_by_text.values():
                    unique_relation_builders.extend(relation_builders)
                self._object_builder.set_relations(
                        RelationSet.Builder()
                            .set_elements(tuple(relation_builder.build()
                                                for relation_builder in unique_relation_builders))
                            .build())
            if len(self.subjects) > 0:
                self._object_builder.set_subjects(SubjectSet.Builder().set_elements(tuple(self.subjects)).build())
            if len(self.techniques) > 0:
                self._object_builder.set_techniques(TechniqueSet.Builder().set_elements(tuple(self.techniques)).build())
            if len(self.textrefs) > 0:
                self._object_builder.set_textrefs(TextrefSet.Builder().set_elements(tuple(self.textrefs)).build())
            if len(self.titles) > 0:
                self._object_builder.set_titles(TitleSet.Builder().set_elements(tuple(self.titles)).build())
            else:
                raise ValueError('no titles')
            if len(self.work_types) > 0:
                self._object_builder.set_work_types(WorkTypeSet.Builder().set_elements(tuple(self.work_types)).build())
            else:
                raise ValueError('no work types')

            return self._object_builder.build()

        def __getattr__(self, attr):
            return getattr(self._object_builder, attr)

        @property
        def object_id(self):
            return self.__object_id

        @property
        def omeka_collection_id(self):
            return self.__omeka_collection_id

        @property
        def omeka_item_id(self):
            return self.__omeka_item_id

    def __init__(self):
        object.__init__(self)
        self._logger = logging.getLogger(self.__class__.__module__ + '.' + self.__class__.__name__)

    def map_omeka_items(self, collection_id, omeka_collection, omeka_files_by_item_id, omeka_items):
        object_builders_by_id = \
            self._map_omeka_collection_items(
                collection_id=collection_id,
                omeka_collection=omeka_collection,
                omeka_files_by_item_id=omeka_files_by_item_id,
                omeka_items=omeka_items
            )

        self._logger.info("loaded %d objects from %d collections", len(object_builders_by_id), len(omeka_items))

        # All objects are parsed
        # Build a map of relations across collections
        relations = {}
        for object_id, object_builder in object_builders_by_id.iteritems():
            for relation_builder in object_builder.relation_builders:
                if relation_builder.text is None:
                    continue
                assert relation_builder.type is not None
                relations.setdefault(relation_builder.text, []).append(object_builder)
        # Link up relation relids
        for object_id, object_builder in object_builders_by_id.iteritems():
            for relation_builder in object_builder.relation_builders:
                if relation_builder.text is None:
                    continue
                related_object_builders = relations.get(relation_builder.text, None)
                if related_object_builders is None:
                    continue
                relids = \
                    frozenset(related_object_builder.object_id
                                for related_object_builder in related_object_builders
                                if related_object_builder.object_id != object_id)
                if len(relids) > 0:
                    relation_builder.relids = relids

        objects_by_id = OrderedDict()
        for object_id, object_builder in object_builders_by_id.iteritems():
            objects_by_id[object_id] = object_builder.build()

        return objects_by_id

    def _map_omeka_item(self, object_builder, omeka_item):
        for element_text in omeka_item.element_texts:
            text = element_text.text.strip()
            if len(text) == 0:
                continue

            self._map_omeka_item_element(
                element_name=element_text.element.name,
                element_set_name=element_text.element_set.name,
                object_builder=object_builder,
                text=text
            )

        self._map_omeka_item_files(
            object_builder=object_builder,
            omeka_item=omeka_item
        )

        if len(object_builder.work_types) == 0 and omeka_item.item_type is not None:
            self._map_omeka_item_type(
                object_builder=object_builder,
                omeka_item_type=omeka_item.item_type
            )

        tag_names = [tag.name for tag in omeka_item.tags]
        if len(tag_names) > 0:
            self._map_omeka_item_tags(
                object_builder=object_builder,
                tag_names=tuple(tag_names)
            )

    def _map_omeka_items(self, collection_id, omeka_collection, omeka_items):
        object_builders_by_id = OrderedDict()

        for omeka_item_i, omeka_item in enumerate(omeka_items):
            object_id = collection_id + '/' + str(omeka_item.id)

            object_builder = \
                self._ObjectBuilder(
                    collection_id=collection_id,
                    endpoint_url=self.__endpoint_url,
                    institution_id=self._institution_id,
                    logger=self._logger,
                    object_id=object_id,
                    omeka_item_id=omeka_item.id,
                )

            self._map_omeka_item(
                object_builder=object_builder,
                omeka_item=omeka_item
            )

            # Try to build the object here, even though we won't use the result,
            # so that we catch errors before adding objects to a collection.
            # This is to ensure that we don't create empty collections.
            try:
                object_builder.build()
            except ValueError, e:
                self._logger.info("ignoring object %s: %s", object_id, str(e))
                continue

            object_builders_by_id[object_id] = object_builder

            self._logger.debug("loaded %d/%d items from collection %d", omeka_item_i + 1, len(omeka_items), omeka_collection.id)

        return object_builders_by_id

    def _map_omeka_item_element(self, element_name, element_set_name, object_builder, text):
        if element_set_name == 'Dublin Core':
            method_name = '_map_omeka_item_element_dc_' + element_name.lower().replace(' ', '_')
            try:
                method = getattr(self, method_name)
            except AttributeError:
                self._logger.warn("no method %s, skipping item %d Dublin Core element %s: %s", method_name, object_builder.omeka_item_id, element_name, text.encode('ascii', 'ignore'))
                return
        elif element_set_name == 'Item Type Metadata':
            method_name = '_map_omeka_item_element_itm_' + element_name.lower().replace(' ', '_')
            try:
                method = getattr(self, method_name)
            except AttributeError:
                self._logger.warn("no method %s, skipping item %d Item Type Metadata element %s: %s", method_name, object_builder.omeka_item_id, element_name, text.encode('ascii', 'ignore'))
                return
        else:
            self._logger.warn("skipping item %s element set", element_set_name)
            return

        method(object_builder=object_builder, text=text)

    def _map_omeka_item_element_dc_abstract(self, object_builder, text):
        pass

    def _map_omeka_item_element_dc_alternative_title(self, object_builder, text):
        object_builder.titles.append(
            Title.Builder()
                .set_text(text)
                .set_type(TitleType.DESCRIPTIVE)
                .build()
        )

    def _map_omeka_item_element_dc_contributor(self, object_builder, text):
        # Ignore dc:contributor, which is a cataloguer name
        pass
#         object_builder.agents.append(
#             Agent.Builder()
#                 .set_name(AgentName.Builder().set_text(text).set_type(AgentNameType.OTHER).build())
#                 .set_role(
#                     AgentRole.Builder()
#                         .set_text('contributor')
#                         .set_vocab_ref(
#                                 VocabRef.Builder().set_vocab(Vocab.DC).build()
#                         )
#                         .build()
#                     )
#                 .build()
#         )

    def _map_omeka_item_element_dc_creator(self, object_builder, text):
        object_builder.agents.append(
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

    def _map_omeka_item_element_dc_date(self, object_builder, text):
        if object_builder.dc_date_builder.earliest_date is None:
            earliest_date, latest_date = self._parse_date_range(text)
            object_builder.dc_date_builder.set_earliest_date(earliest_date).set_latest_date(latest_date)
        else:
            self._logger.warn("item %d in collection %d has two dates: %s", object_builder.omeka_item_id, object_builder.omeka_collection_id, text)

    def _map_omeka_item_element_dc_date_created(self, object_builder, text):
        earliest_date = self._parse_date(text)
        object_builder.dates.append(
            Date.Builder()
                .set_earliest_date(earliest_date)
                .set_latest_date(earliest_date)
                .set_type(DateType.CREATION)
                .build()
        )

    def _map_omeka_item_element_dc_description(self, object_builder, text):
        object_builder.descriptions.append(
            Description.Builder()
                .set_text(text)
                .build()
        )

    def _map_omeka_item_element_dc_extent(self, object_builder, text):
        object_builder.measurements.append(
            Measurements.Builder()
                .set_text(text)
                .set_type(MeasurementsType.OTHER)
                .build()
        )

    def _map_omeka_item_element_dc_format(self, object_builder, text):
        self._update_vocabulary_used('Dublin Core', 'Format', text)

    def _map_omeka_item_element_dc_identifier(self, object_builder, text):
        if not text in object_builder.identifiers:
            object_builder.identifiers.append(text)
        object_builder.relation_builders.append(
            Relation.Builder()
                .set_text(text)
                .set_type(RelationType.SOURCE_FOR)
        )

    def _map_omeka_item_element_dc_language(self, object_builder, text):
        self._update_vocabulary_used('Dublin Core', 'Language', text)

    def _map_omeka_item_element_dc_medium(self, object_builder, text):
        text = text.strip("'")
        for medium in text.split(';'):
            for medium in medium.split(','):
                medium = medium.strip()
                if len(medium) == 0:
                    continue
                object_builder.materials.append(
                    Material.Builder()
                        .set_text(medium)
                        .set_type(MaterialType.MEDIUM)
                        .build()
                )
                self._update_vocabulary_used('Dublin Core', 'Medium', medium)

    def _map_omeka_item_element_dc_provenance(self, object_builder, text):
        object_builder.set_provenance(text)

    def _map_omeka_item_element_dc_relation(self, object_builder, text):
        object_builder.relation_builders.append(
            Relation.Builder()
                .set_text(text)
                .set_type(RelationType.RELATED_TO)
        )

    def _map_omeka_item_element_dc_rights(self, object_builder, text):
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

    def _map_omeka_item_element_dc_source(self, object_builder, text):
        object_builder.relation_builders.append(
            Relation.Builder()
                .set_text(text)
                .set_type(RelationType.DERIVED_FROM)
        )

    def _map_omeka_item_element_dc_spatial_coverage(self, object_builder, text):
        self._update_vocabulary_used('Dublin Core', 'Spatial Coverage', text)

    def _map_omeka_item_element_dc_subject(self, object_builder, text):
        for subject in text.split(';'):
            subject = subject.strip()
            if len(subject) == 0:
                continue
            object_builder.subjects.append(
                Subject.Builder()
                    .set_terms((
                        SubjectTerm.Builder()
                            .set_text(subject)
                            .set_type(SubjectTermType.OTHER_TOPIC)
                            .build()
                    ,))
                    .build()
            )
            self._update_vocabulary_used('Dublin Core', 'Subject', subject)

    def _map_omeka_item_element_dc_temporal_coverage(self, object_builder, text):
        self._update_vocabulary_used('Dublin Core', 'Temporal Coverage', text)

    def _map_omeka_item_element_dc_title(self, object_builder, text):
        object_builder.titles.append(
            Title.Builder()
                .set_pref(True)
                .set_text(text)
                .set_type(TitleType.DESCRIPTIVE)
                .build()
        )

    def _map_omeka_item_element_dc_type(self, object_builder, text):
        work_type = self._parse_work_type(text)
        if work_type is not None:
            object_builder.work_types.append(work_type)
        self._update_vocabulary_used('Dublin Core', 'Type', text)

    def _map_omeka_item_files(
        self,
        object_builder,
        omeka_item
    ):
        if omeka_item.files_count is None or omeka_item.files_count == 0:
            return

        file_dicts = []
        files_dir_path = os.path.join(self._data_dir_path, 'extracted', self._institution_id, 'files_by_item_id', str(omeka_item.id))
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
                object_builder.images.append(image_builder.build())

    def _map_omeka_item_tags(self, object_builder, tag_names):
        object_builder.categories.extend(tag_names)

    def _map_omeka_item_type(self, object_builder, omeka_item_type):
        work_type = self._parse_work_type(omeka_item_type.name)
        if work_type is not None:
            object_builder.work_types.append(work_type)

    def _parse_date(self, text):
        date_bound_builder = DateBound.Builder().set_text(text)

        if text.endswith('?'):
            date_bound_builder.set_circa(True)
            text = text[:-1]

        self._parse_certain_date(
            date_bound_builder=date_bound_builder,
            text=text
        )

        return date_bound_builder.build()

    def _parse_date_range(self, text):
        text_split = text.split('-', 1)
        if len(text_split) == 1:
            parsed_date = self._parse_date(text)
            date_range = parsed_date, parsed_date
        elif len(text_split) == 2:
            date_range = self._parse_date(text_split[0]), self._parse_date(text_split[1])
        else:
            raise NotImplementedError
        self._logger.debug("parsed date range '%s' from '%s'", date_range, text)
        return date_range

    def _parse_work_type(self, text):
        text = text.strip().replace(' ', '')
        if text in DCMI_TYPES:
            if text in ('Image', 'PhysicalObject', 'StillImage'):
                return \
                    WorkType.Builder()\
                        .set_text(text)\
                        .set_vocab_ref(
                            VocabRef.Builder()
                                .set_refid(text)\
                                .set_vocab(Vocab.DCMI_TYPE)\
                                .set_uri(DCMI_TYPES_BASE_URL + text)\
                                .build()
                        )\
                        .build()
