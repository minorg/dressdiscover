from collections import Counter

from dressdiscover.api.models.collection.collection import Collection
from dressdiscover.api.models.collection.collection_entry import CollectionEntry
from dressdiscover.api.models.collection.collection_id import CollectionId
from dressdiscover.api.models.image.image import Image
from dressdiscover.api.models.image.image_version import ImageVersion
from dressdiscover.api.models.object.object import Object
from dressdiscover.api.models.object.object_entry import ObjectEntry
from dressdiscover.api.models.object.object_id import ObjectId
from dressdiscover.api.models.vocab import Vocab
from dressdiscover.api.models.vocab_ref import VocabRef
from dressdiscover.api.vocabularies.vra_core.agent.agent import Agent
from dressdiscover.api.vocabularies.vra_core.agent.agent_name import AgentName
from dressdiscover.api.vocabularies.vra_core.agent.agent_name_type import AgentNameType
from dressdiscover.api.vocabularies.vra_core.agent.agent_role import AgentRole
from dressdiscover.api.vocabularies.vra_core.agent.agent_set import AgentSet
from dressdiscover.api.vocabularies.vra_core.cultural_context.cultural_context_set import CulturalContextSet
from dressdiscover.api.vocabularies.vra_core.date.date import Date
from dressdiscover.api.vocabularies.vra_core.date.date_bound import DateBound
from dressdiscover.api.vocabularies.vra_core.date.date_set import DateSet
from dressdiscover.api.vocabularies.vra_core.date.date_type import DateType
from dressdiscover.api.vocabularies.vra_core.description.description import Description
from dressdiscover.api.vocabularies.vra_core.description.description_set import DescriptionSet
from dressdiscover.api.vocabularies.vra_core.inscription.inscription_set import InscriptionSet
from dressdiscover.api.vocabularies.vra_core.location.location_set import LocationSet
from dressdiscover.api.vocabularies.vra_core.material.material import Material
from dressdiscover.api.vocabularies.vra_core.material.material_set import MaterialSet
from dressdiscover.api.vocabularies.vra_core.material.material_type import MaterialType
from dressdiscover.api.vocabularies.vra_core.measurements.measurements import Measurements
from dressdiscover.api.vocabularies.vra_core.measurements.measurements_set import MeasurementsSet
from dressdiscover.api.vocabularies.vra_core.measurements.measurements_type import MeasurementsType
from dressdiscover.api.vocabularies.vra_core.relation.relation import Relation
from dressdiscover.api.vocabularies.vra_core.relation.relation_set import RelationSet
from dressdiscover.api.vocabularies.vra_core.relation.relation_type import RelationType
from dressdiscover.api.vocabularies.vra_core.rights.rights import Rights
from dressdiscover.api.vocabularies.vra_core.rights.rights_set import RightsSet
from dressdiscover.api.vocabularies.vra_core.rights.rights_type import RightsType
from dressdiscover.api.vocabularies.vra_core.subject.subject import Subject
from dressdiscover.api.vocabularies.vra_core.subject.subject_set import SubjectSet
from dressdiscover.api.vocabularies.vra_core.subject.subject_term import SubjectTerm
from dressdiscover.api.vocabularies.vra_core.subject.subject_term_type import SubjectTermType
from dressdiscover.api.vocabularies.vra_core.technique.technique_set import TechniqueSet
from dressdiscover.api.vocabularies.vra_core.textref.textref import Textref
from dressdiscover.api.vocabularies.vra_core.textref.textref_name import TextrefName
from dressdiscover.api.vocabularies.vra_core.textref.textref_name_type import TextrefNameType
from dressdiscover.api.vocabularies.vra_core.textref.textref_refid import TextrefRefid
from dressdiscover.api.vocabularies.vra_core.textref.textref_refid_type import TextrefRefidType
from dressdiscover.api.vocabularies.vra_core.textref.textref_set import TextrefSet
from dressdiscover.api.vocabularies.vra_core.title.title import Title
from dressdiscover.api.vocabularies.vra_core.title.title_set import TitleSet
from dressdiscover.api.vocabularies.vra_core.title.title_type import TitleType
from dressdiscover.api.vocabularies.vra_core.work_type.work_type import WorkType
from dressdiscover.api.vocabularies.vra_core.work_type.work_type_set import WorkTypeSet
from dressdiscover.lib.mappers.date_parser import DateParser
from dressdiscover.lib.mappers.dcmi_types import DCMI_TYPES, DCMI_TYPES_BASE_URL


class OmekaResourceMapper(object):
    class _ObjectBuilder(object):
        def __init__(
            self,
            endpoint_url,
            logger,
            log_marker,
            object_id,
            omeka_item
        ):
            self.__logger = logger
            self.__log_marker = log_marker
            self._object_builder = \
                Object.Builder()\
                    .set_collection_id(object_id.getCollectionId())\
                    .set_institution_id(object_id.getInstitutionId())
            self.__object_id = object_id
            self.__omeka_item = omeka_item

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
                            .set_href(str(endpoint_url) + 'items/show/' + str(omeka_item.id))
                            .set_text(str(endpoint_url) + 'items/show/' + str(omeka_item.id))
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
                    self.dc_date_builder.set_earliest_date(
                        DateBound.Builder(self.dc_date_builder.earliest_date)\
                            .set_circa(True)\
                            .build()
                        )
                    self.dc_date_builder.set_latest_date(
                        DateBound.Builder(self.dc_date_builder.latest_date)\
                            .set_circa(True)\
                            .build()
                    )
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
                        self.__logger.warn(self.__log_marker, "item {} has duplicate relation type={}, text={}", (self.__omeka_item.id, relation_builder.type, relation_builder.text))
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
        def logger(self):
            return self.__logger

        @property
        def log_marker(self):
            return self.__log_marker

        @property
        def object_id(self):
            return self.__object_id

        @property
        def omeka_item(self):
            return self.__omeka_item

    def __init__(self):
        object.__init__(self)
        self.__vocabulary_used = {}

    def map_omeka_collection(self, institution_id, omeka_collection):
        collection_id = CollectionId.parse(str(institution_id) + '/' + str(omeka_collection.id))

        collection_builder = Collection.Builder()
        collection_builder.set_institution_id(institution_id)

        for element_text in omeka_collection.element_texts:
            if len(element_text.text) == 0:
                continue

            if element_text.element_set.name == 'Dublin Core':
                if element_text.element.name == 'Contributor':
                    pass
                elif element_text.element.name == 'Description':
                    collection_builder.set_description(element_text.text)
                elif element_text.element.name == 'Title':
                    collection_builder.set_title(element_text.text)

        collection = collection_builder.build()

        return CollectionEntry(collection_id, collection)

    def map_omeka_item(
        self,
        collection_id,
        endpoint_url,
        logger,
        log_marker,
        omeka_item,
        omeka_item_files,
        square_thumbnail_height_px,
        square_thumbnail_width_px
    ):
        object_id = ObjectId.parse(str(collection_id) + '/' + str(omeka_item.id))

        object_builder = \
            self._ObjectBuilder(
                endpoint_url=endpoint_url,
                logger=logger,
                log_marker=log_marker,
                object_id=object_id,
                omeka_item=omeka_item
            )

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
            omeka_item=omeka_item,
            omeka_item_files=omeka_item_files,
            square_thumbnail_height_px=square_thumbnail_height_px,
            square_thumbnail_width_px=square_thumbnail_width_px
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

        return ObjectEntry(object_id, object_builder.build())

    def _map_omeka_item_element(self, element_name, element_set_name, object_builder, text):
        if element_set_name == 'Dublin Core':
            method_name = '_map_omeka_item_element_dc_' + element_name.lower().replace(' ', '_')
            try:
                method = getattr(self, method_name)
            except AttributeError:
                object_builder.logger.warn(object_builder.log_marker, "no method {}, skipping item {} Dublin Core element {}: {}", (method_name, object_builder.omeka_item.id, element_name, text.encode('ascii', 'ignore')))
                return
        elif element_set_name == 'Item Type Metadata':
            method_name = '_map_omeka_item_element_itm_' + element_name.lower().replace(' ', '_')
            try:
                method = getattr(self, method_name)
            except AttributeError:
                object_builder.logger.warn(object_builder.log_marker, "no method {}, skipping item {} Item Type Metadata element {}: {}", (method_name, object_builder.omeka_item.id, element_name, text.encode('ascii', 'ignore')))
                return
        else:
            object_builder.logger.warn(object_builder.log_marker, "skipping item {} element set", element_set_name)
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
        if object_builder.dc_date_builder.earliestDate is None:
            earliest_date, latest_date = self._parse_date_range(object_builder=object_builder, text=text)
            object_builder.dc_date_builder.set_earliest_date(earliest_date).set_latest_date(latest_date)
        else:
            object_builder.logger.warn(object_builder.log_marker, "item {} in collection {} has two dates: {}", (object_builder.omeka_item.id, object_builder.object_id.getCollectionId(), text))

    def _map_omeka_item_element_dc_date_created(self, object_builder, text):
        earliest_date = self._parse_date(object_builder=object_builder, text=text)
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
        object_builder.setProvenance(text)

    def _map_omeka_item_element_dc_relation(self, object_builder, text):
        object_builder.relation_builders.append(
            Relation.Builder()
                .set_text(text)
                .set_type(RelationType.RELATED_TO)
        )

    def _map_omeka_item_element_dc_rights(self, object_builder, text):
        object_builder.setRights(
            RightsSet.Builder()
                .set_elements((
                    Rights.Builder()
                        # .setRightsHolder(self.__institution_title)
                        .set_text(text)
                        .set_type(RightsType.UNDETERMINED)
                        .build(),
                ))
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
                            .build(),
                    ))
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
        omeka_item,
        omeka_item_files,
        square_thumbnail_height_px,
        square_thumbnail_width_px
    ):
        if omeka_item.files_count is None or omeka_item.files_count == 0:
            return

        for omeka_file in omeka_item_files:
            if not omeka_file.mime_type.startswith('image/'):
                continue

            original_image_height = original_image_width = None
            for element_text in omeka_file.element_texts:
                if element_text.element_set.name == 'Omeka Image File':
                    if element_text.element.name == 'Height':
                        original_image_height = int(element_text.text)
                    elif element_text.element.name == 'Width':
                        original_image_width = int(element_text.text)
#                             else:
#                                 print 'skipping image file element', element_name

            image_builder = Image.Builder()
            image_version_builder = ImageVersion.Builder().set_url(omeka_file.file_urls.original)
            if original_image_height is not None:
                image_version_builder.set_height_px(original_image_height)
            if original_image_width is not None:
                image_version_builder.set_width_px(original_image_width)
            image_builder.set_original(image_version_builder.build())
            if omeka_file.file_urls.fullsize is not None:
                image_builder.set_full_size(ImageVersion.Builder().set_url(omeka_file.file_urls.fullsize).build())
            if omeka_file.file_urls.square_thumbnail is not None:
                image_builder.set_square_thumbnail(
                    ImageVersion.Builder()
                        .set_height_px(square_thumbnail_height_px)
                        .set_url(omeka_file.file_urls.fullsize)
                        .set_width_px(square_thumbnail_width_px)
                        .build()
                )
            if omeka_file.file_urls.thumbnail is not None:
                image_builder.set_thumbnail(ImageVersion.Builder().set_url(omeka_file.file_urls.thumbnail).build())
            object_builder.images.append(image_builder.build())

    def _map_omeka_item_tags(self, object_builder, tag_names):
        object_builder.categories.extend(tag_names)

    def _map_omeka_item_type(self, object_builder, omeka_item_type):
        work_type = self._parse_work_type(omeka_item_type.name)
        if work_type is not None:
            object_builder.work_types.append(work_type)

    def _parse_date(self, object_builder, text):
        date_bound_builder = DateBound.Builder().set_text(text)

        if text.endswith('?'):
            date_bound_builder.setCirca(True)
            text = text[:-1]

        DateParser.parse_certain_date(
            date_bound_builder=date_bound_builder,
            text=text
        )

        return date_bound_builder.build()

    def _parse_date_range(self, object_builder, text):
        text_split = text.split('-', 1)
        if len(text_split) == 1:
            parsed_date = self._parse_date(object_builder=object_builder, text=text)
            date_range = parsed_date, parsed_date
        elif len(text_split) == 2:
            date_range = self._parse_date(object_builder=object_builder, text=text_split[0]), self._parse_date(object_builder=object_builder, text=text_split[1])
        else:
            raise NotImplementedError
        object_builder.logger.debug(object_builder.log_marker, "parsed date range '%s' from '%s'", date_range, text)
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

    def _update_vocabulary_used(self, element_set_name, element_name, text):
        self.__vocabulary_used.setdefault(element_set_name, {}).setdefault(element_name, Counter())[text] += 1
