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
from costume.api.models.closure.closure import Closure
from costume.api.models.closure.closure_placement import ClosurePlacement
from costume.api.models.closure.closure_set import ClosureSet
from costume.api.models.closure.closure_type import ClosureType
from costume.api.models.collection.collection import Collection
from costume.api.models.color.color import Color
from costume.api.models.color.color_set import ColorSet
from costume.api.models.color.color_type import ColorType
from costume.api.models.component.component import Component
from costume.api.models.component.component_set import ComponentSet
from costume.api.models.component.component_term import ComponentTerm
from costume.api.models.condition.condition import Condition
from costume.api.models.cultural_context.cultural_context import CulturalContext
from costume.api.models.cultural_context.cultural_context_set import CulturalContextSet
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
from costume.api.models.measurements.measurements import Measurements
from costume.api.models.measurements.measurements_set import MeasurementsSet
from costume.api.models.measurements.measurements_type import MeasurementsType
from costume.api.models.measurements.measurements_unit import MeasurementsUnit
from costume.api.models.object.object import Object
from costume.api.models.object.object_entry import ObjectEntry
from costume.api.models.relation.relation import Relation
from costume.api.models.relation.relation_set import RelationSet
from costume.api.models.relation.relation_type import RelationType
from costume.api.models.rights.rights import Rights
from costume.api.models.rights.rights_set import RightsSet
from costume.api.models.rights.rights_type import RightsType
from costume.api.models.structure.structure import Structure
from costume.api.models.structure.structure_set import StructureSet
from costume.api.models.structure.structure_type import StructureType
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
from costume.api.models.view_type.view_type import ViewType
from costume.api.models.vocab import Vocab
from costume.api.models.vocab_ref import VocabRef
from costume.api.models.work_type.work_type import WorkType
from costume.api.models.work_type.work_type_set import WorkTypeSet
from costume.etl._loader import _Loader
from costume.etl.costume_core_controlled_vocabularies import COSTUME_CORE_CONTROLLED_VOCABULARIES


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
    class _ObjectBuilder(object):
        def __init__(
            self,
            endpoint_url,
            collection_id,
            institution_id,
            logger,
            omeka_collection_id,
            omeka_item_id,
        ):
            self.__institution_id = institution_id
            self.__object_builder = \
                Object.Builder()\
                    .set_collection_id(collection_id)\
                    .set_institution_id(institution_id)\
                    .set_model_metadata(_Loader._new_model_metadata())
            self.__logger = logger
            self.__omeka_collection_id = omeka_collection_id
            self.__omeka_item_id = omeka_item_id

            self.agents = []
            self.categories = []
            self.closure_placements = []
            self.closure_types = []
            self.component_builders_by_letter = {}
            self.colors = []
            self.cultural_contexts = []
            self.dc_date_builder = Date.Builder().set_type(DateType.CREATION)
            self.dc_date_certainty = None
            self.dates = []
            self.descriptions = []
            self.identifiers = []
            self.images = []
            self.inscriptions = []
            self.materials = []
            self.measurements = []
            self.relations = []
            self.structures = []
            self.structures_by_component_letter = {}
            self.structures_by_extent = {}
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
                self.__object_builder.set_agents(AgentSet.Builder().set_elements(tuple(self.agents)).build())
            if len(self.categories) > 0:
                self.__object_builder.set_categories(tuple(self.categories))
            if len(self.closure_placements) > 0 and len(self.closure_types) > 0:
                closures = []
                if len(self.closure_placements) == len(self.closure_types):
                    for closure_placement, closure_type in zip(self.closure_placements, self.closure_types):
                        closures.append(
                            Closure.Builder()
                                .set_placement(closure_placement)
                                .set_type(closure_type)
                                .build()
                        )
                elif len(self.closure_placements) == 1:
                    for closure_type in self.closure_types:
                        closures.append(
                            Closure.Builder()
                                .set_placement(self.closure_placements[0])
                                .set_type(closure_type)
                                .build()
                        )
                elif len(self.closure_types) == 1:
                    for closure_placement in self.closure_placements:
                        closures.append(
                            Closure.Builder()
                                .set_placement(closure_placement)
                                .set_type(self.closure_types[0])
                                .build()
                        )
                else:
                    self.__logger.warn("item %d has different numbers of closure placements and closure types: %d vs. %d", self.__omeka_item_id, len(self.closure_placements), len(self.closure_types))
                if len(closures) > 0:
                    self.__object_builder.set_closures(ClosureSet.Builder().set_elements(tuple(closures)).build())
            if len(self.component_builders_by_letter) > 0:
                components = []
                for letter, component_builder in self.component_builders_by_letter.iteritems():
                    structures = self.structures_by_component_letter.pop(letter, [])
                    structures.extend(self.structures_by_extent.pop(component_builder.term.text, []))
                    if len(structures) > 0:
                        component_builder.set_structures(StructureSet.Builder().set_elements(tuple(structures)).build())
                    component = component_builder.build()
                    components.append(component)
                for letter in self.structures_by_component_letter.iterkeys():
                    self.__logger.warn("structure(s) specified for unknown component %s on item %d", letter, self.__omeka_item_id)
                for letter in self.structures_by_extent.iterkeys():
                    self.__logger.warn("structure(s) specified for unknown extent %s on item %d", letter, self.__omeka_item_id)
                self.__object_builder.set_components(ComponentSet.Builder().set_elements(tuple(components)).build())
            if len(self.colors) > 0:
                self.__object_builder.set_colors(ColorSet.Builder().set_elements(tuple(self.colors)).build())
            if len(self.cultural_contexts) > 0:
                self.__object_builder.set_cultural_contexts(CulturalContextSet.Builder().set_elements(tuple(self.cultural_contexts)).build())
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
                self.__object_builder.set_dates(DateSet.Builder().set_elements(tuple(self.dates)).build())
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
                self.__object_builder.set_descriptions(DescriptionSet.Builder().set_elements(tuple(self.descriptions)).build())
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
                self.__object_builder.set_images(tuple(self.images))
            if len(self.inscriptions) > 0:
                self.__object_builder.set_inscriptions(InscriptionSet.Builder().set_elements(tuple(self.inscriptions)).build())
            if len(self.materials) > 0:
                self.__object_builder.set_materials(MaterialSet.Builder().set_elements(tuple(self.materials)).build())
            if len(self.measurements) > 0:
                self.__object_builder.set_measurements(MeasurementsSet.Builder().set_elements(tuple(self.measurements)).build())
            if len(self.relations) > 0:
                relation_texts = {}
                unique_relations = []
                for relation in self.relations:
                    if relation.text is None:
                        unique_relations.append(relation)
                    elif relation.text not in relation_texts:
                        unique_relations.append(relation)
                        relation_texts[relation.text] = None
                self.__object_builder.set_relations(RelationSet.Builder().set_elements(tuple(unique_relations)).build())
            if len(self.structures) > 0:
                self.__object_builder.set_structures(StructureSet.Builder().set_elements(tuple(self.structures)).build())
            if len(self.subjects) > 0:
                self.__object_builder.set_subjects(SubjectSet.Builder().set_elements(tuple(self.subjects)).build())
            if len(self.techniques) > 0:
                self.__object_builder.set_techniques(TechniqueSet.Builder().set_elements(tuple(self.techniques)).build())
            if len(self.textrefs) > 0:
                self.__object_builder.set_textrefs(TextrefSet.Builder().set_elements(tuple(self.textrefs)).build())
            if len(self.titles) > 0:
                self.__object_builder.set_titles(TitleSet.Builder().set_elements(tuple(self.titles)).build())
            else:
                raise ValueError('no titles')
            if len(self.work_types) > 0:
                self.__object_builder.set_work_types(WorkTypeSet.Builder().set_elements(tuple(self.work_types)).build())
            else:
                raise ValueError('no work types')

            return self.__object_builder.build()

        def __getattr__(self, attr):
            return getattr(self.__object_builder, attr)

        @property
        def omeka_collection_id(self):
            return self.__omeka_collection_id

        @property
        def omeka_item_id(self):
            return self.__omeka_item_id

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
        cls._add_institution_arguments(argument_parser)
        argument_parser.add_argument('--square-thumbnail-height-px', default=150)
        argument_parser.add_argument('--square-thumbnail-width-px', default=150)

    @classmethod
    def _add_institution_arguments(cls, argument_parser):
        argument_parser.add_argument('--endpoint-url', required=True)
        argument_parser.add_argument('--institution-id', required=True)
        argument_parser.add_argument('--institution-title', required=True)
        argument_parser.add_argument('--institution-url', required=True)

    def _load(self):
        self._load_institution()

    def _load_collection(self, collection_dict):
        omeka_collection_id = collection_dict['id']
        self._logger.debug("reading collection %d", omeka_collection_id)
        collection_id = self._institution_id + '/' + str(omeka_collection_id)

        collection_builder = \
            Collection.Builder()\
                .set_institution_id(self._institution_id)\
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

        with open(os.path.join(self._data_dir_path, self._institution_id, 'collection', str(omeka_collection_id), 'items.json')) as f:
            item_dicts = json.loads(f.read())
        self._logger.info("loading %d items from collection %d", len(item_dicts), omeka_collection_id)

        objects_by_id = \
            self._load_items(
                collection_id=collection_id,
                item_dicts=item_dicts,
                omeka_collection_id=omeka_collection_id
            )

        if len(objects_by_id) == 0:
            self._logger.info("collection %d has no objects, skipping", omeka_collection_id)
            return

        self._services.collection_command_service.put_collection(collection_id, collection)

        self._logger.info("putting %d objects to collection %d", len(objects_by_id), omeka_collection_id)
        self._services.object_command_service.put_objects(
            tuple(ObjectEntry(object_id, object_)
                  for object_id, object_ in objects_by_id.iteritems())
        )

    def _load_collections(self, collection_dicts):
        for collection_dict in collection_dicts:
            if not collection_dict['public']:
                omeka_collection_id = collection_dict['id']
                self._logger.info("collection %d is not public, skipping", omeka_collection_id)
                continue

            self._load_collection(collection_dict=collection_dict)

    def _load_institution(self):
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

        with open(os.path.join(self._data_dir_path, self._institution_id, 'collections.json')) as f:
            collection_dicts = json.loads(f.read())

        self._load_collections(collection_dicts=collection_dicts)

    def _load_item(self, collection_id, item_dict, omeka_collection_id):
        omeka_item_id = item_dict['id']

        object_builder = \
            self._ObjectBuilder(
                collection_id=collection_id,
                endpoint_url=self.__endpoint_url,
                institution_id=self._institution_id,
                logger=self._logger,
                omeka_collection_id=omeka_collection_id,
                omeka_item_id=omeka_item_id,
            )

        for element_text_dict in item_dict['element_texts']:
            text = element_text_dict['text'].strip()
            if len(text) == 0:
                continue
            element_set_name = element_text_dict['element_set']['name']
            element_name = element_text_dict['element']['name']

            self._load_item_element(
                element_name=element_name,
                element_set_name=element_set_name,
                object_builder=object_builder,
                text=text
            )

        self._load_item_files(
            files=item_dict.get('files', {}),
            object_builder=object_builder,
            omeka_item_id=omeka_item_id,
        )

        if len(object_builder.work_types) == 0:
            self._load_item_type(
                item_type=item_dict.get('item_type', {}),
                object_builder=object_builder
            )

        return object_builder.build()

    def _load_items(self, collection_id, item_dicts, omeka_collection_id):
        objects_by_id = OrderedDict()

        for item_i, item_dict in enumerate(item_dicts):
            omeka_item_id = item_dict['id']

            try:
                object_ = \
                    self._load_item(
                        collection_id,
                        item_dict=item_dict,
                        omeka_collection_id=omeka_collection_id,
                    )
            except ValueError, e:
                self._logger.debug("ignoring item %d from collection %d: %s", omeka_item_id, omeka_collection_id, str(e))
                continue

            object_id = collection_id + '/' + str(omeka_item_id)
            objects_by_id[object_id] = object_

            self._logger.debug("loaded %d/%d items from collection %d", item_i + 1, len(item_dicts), omeka_collection_id)

        return objects_by_id

    def _load_item_element(self, element_name, element_set_name, object_builder, text):
        if element_set_name == 'Dublin Core':
            method_name = '_load_item_element_dc_' + element_name.lower().replace(' ', '_')
            try:
                method = getattr(self, method_name)
            except AttributeError:
                self._logger.warn("no method %s, skipping item %d Dublin Core element %s: %s", method_name, object_builder.omeka_item_id, element_name, text.encode('ascii', 'ignore'))
                return
        elif element_set_name == 'Item Type Metadata':
            method_name = '_load_item_element_itm_' + element_name.lower().replace(' ', '_')
            try:
                method = getattr(self, method_name)
            except AttributeError:
                self._logger.warn("no method %s, skipping item %d Item Type Metadata element %s: %s", method_name, object_builder.omeka_item_id, element_name, text.encode('ascii', 'ignore'))
                return
        else:
            self._logger.warn("skipping item %s element set", element_set_name)
            return

        method(object_builder=object_builder, text=text)

    def _load_item_element_dc_abstract(self, object_builder, text):
        pass

    def _load_item_element_dc_alternative_title(self, object_builder, text):
        object_builder.titles.append(
            Title.Builder()
                .set_text(text)
                .set_type(TitleType.DESCRIPTIVE)
                .build()
        )

    def _load_item_element_dc_contributor(self, object_builder, text):
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

    def _load_item_element_dc_creator(self, object_builder, text):
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

    def _load_item_element_dc_date(self, object_builder, text):
        if object_builder.dc_date_builder.earliest_date is None:
            earliest_date, latest_date = self.__parse_date_range(text)
            object_builder.dc_date_builder.set_earliest_date(earliest_date).set_latest_date(latest_date)
        else:
            self._logger.warn("item %d in collection %d has two dates: %s", object_builder.omeka_item_id, object_builder.omeka_collection_id, text)

    def _load_item_element_dc_date_created(self, object_builder, text):
        earliest_date = self.__parse_date(text)
        object_builder.dates.append(
            Date.Builder()
                .set_earliest_date(earliest_date)
                .set_latest_date(earliest_date)
                .set_type(DateType.CREATION)
                .build()
        )

    def _load_item_element_dc_description(self, object_builder, text):
        object_builder.descriptions.append(
            Description.Builder()
                .set_text(text)
                .build()
        )

    def _load_item_element_dc_extent(self, object_builder, text):
        object_builder.measurements.append(
            Measurements.Builder()
                .set_text(text)
                .set_type(MeasurementsType.OTHER)
                .build()
        )

    def _load_item_element_dc_format(self, object_builder, text):
        pass

    def _load_item_element_dc_identifier(self, object_builder, text):
        if not text in object_builder.identifiers:
            object_builder.identifiers.append(text)
        object_builder.relations.append(
            Relation.Builder()
                .set_text(text)
                .set_type(RelationType.SOURCE_FOR)
                .build()
        )

    def _load_item_element_dc_language(self, object_builder, text):
        pass

    def _load_item_element_dc_medium(self, object_builder, text):
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

    def _load_item_element_dc_provenance(self, object_builder, text):
        object_builder.set_provenance(text)

    def _load_item_element_dc_relation(self, object_builder, text):
        object_builder.relations.append(
            Relation.Builder()
                .set_text(text)
                .set_type(RelationType.RELATED_TO)
                .build()
        )

    def _load_item_element_dc_rights(self, object_builder, text):
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

    def _load_item_element_dc_source(self, object_builder, text):
        object_builder.relations.append(
            Relation.Builder()
                .set_text(text)
                .set_type(RelationType.DERIVED_FROM)
                .build()
        )

    def _load_item_element_dc_spatial_coverage(self, object_builder, text):
        pass

    def _load_item_element_dc_subject(self, object_builder, text):
        for text_split in text.split(';'):
            text_split = text_split.strip()
            if len(text_split) == 0:
                continue
            object_builder.subjects.append(
                Subject.Builder()
                    .set_terms((
                        SubjectTerm.Builder()
                            .set_text(text_split)
                            .set_type(SubjectTermType.OTHER_TOPIC)
                            .build()
                    ,))
                    .build()
            )

    def _load_item_element_dc_temporal_coverage(self, object_builder, text):
        pass

    def _load_item_element_dc_title(self, object_builder, text):
        object_builder.titles.append(
            Title.Builder()
                .set_pref(True)
                .set_text(text)
                .set_type(TitleType.DESCRIPTIVE)
                .build()
        )

    def _load_item_element_dc_type(self, object_builder, text):
        work_type = self.__parse_work_type(text)
        if work_type is not None:
            object_builder.work_types.append(work_type)

    # Components
    def _load_item_element_itm_a(self, **kwds):
        self.__load_item_element_itm_component(letter='a', **kwds)

    def _load_item_element_itm_b(self, **kwds):
        self.__load_item_element_itm_component(letter='b', **kwds)

    def _load_item_element_itm_c(self, **kwds):
        self.__load_item_element_itm_component(letter='c', **kwds)

    def _load_item_element_itm_d(self, **kwds):
        self.__load_item_element_itm_component(letter='d', **kwds)

    def _load_item_element_itm_e(self, **kwds):
        self.__load_item_element_itm_component(letter='e', **kwds)

    def _load_item_element_itm_f(self, **kwds):
        self.__load_item_element_itm_component(letter='f', **kwds)

    def _load_item_element_itm_accession_number(self, object_builder, text):
        object_builder.textrefs.append(
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

    def _load_item_element_itm_accession_year(self, object_builder, text):
        try:
            year = int(text)
        except ValueError:
            self._logger.warn("unable to parse Accession Year '%s'", text)
            return
        earliest_date = \
            DateBound.Builder()\
                .set_parsed_date_time(datetime(year, 1, 1, tzinfo=pytz.UTC))\
                .set_parsed_date_time_granularity(DateTimeGranularity.YEAR)\
                .set_text(text)\
                .build()
        object_builder.dates.append(
            Date.Builder()
                .set_earliest_date(earliest_date)
                .set_latest_date(earliest_date)
                .set_type(DateType.ACCESSION)
                .build()
        )

    def _load_item_element_itm_bibliography(self, object_builder, text):
        object_builder.descriptions.append(
            Description.Builder()
                .set_text(text)
                .set_type(DescriptionType.BIBLIOGRAPHY)
                .build()
        )

    def _load_item_element_itm_biographical_text(self, object_builder, text):
        object_builder.descriptions.append(
            Description.Builder()
                .set_text(text)
                .set_type(DescriptionType.BIOGRAPHY)
                .build()
        )

    def _load_item_element_itm_cataloguer_with_date(self, object_builder, text):
        pass

    def _load_item_element_itm_category(self, object_builder, text):
        object_builder.categories.append(text)

    def _load_item_element_itm_classification(self, object_builder, text):
        object_builder.categories.append(text)

    def _load_item_element_itm_closure_placement(self, object_builder, text):
        if text not in COSTUME_CORE_CONTROLLED_VOCABULARIES['Closure Placement']:
            self._logger.warn("using uncontrolled closure placement %s from item %d", text, object_builder.omeka_item_id)
        object_builder.closure_placements.append(
            ClosurePlacement.Builder()\
                .set_text(text)\
                .set_vocab_ref(VocabRef(vocab=Vocab.COSTUME_CORE))\
                .build()
        )

    def _load_item_element_itm_closure_type(self, object_builder, text):
        if text not in COSTUME_CORE_CONTROLLED_VOCABULARIES['Closure Type']:
            self._logger.warn("using uncontrolled closure type %s from item %d", text, object_builder.omeka_item_id)
        object_builder.closure_types.append(
            ClosureType.Builder()\
                .set_text(text)\
                .set_vocab_ref(VocabRef(vocab=Vocab.COSTUME_CORE))\
                .build()
        )

    def _load_item_element_itm_color_main(self, **kwds):
        self.__load_item_element_itm_color(type_=ColorType.PRIMARY, **kwds)

    def _load_item_element_itm_color_secondary(self, **kwds):
        self.__load_item_element_itm_color(type_=ColorType.SECONDARY, **kwds)

    def __load_item_element_itm_color(self, object_builder, text, type_):
        text = text.lower()
        builder = \
            Color.Builder()\
                .set_text(text)\
                .set_type(type_)

        if text in COSTUME_CORE_CONTROLLED_VOCABULARIES['Main Color']:
            builder.set_vocab_ref(
                VocabRef.Builder()
                    .set_refid(text)
                    .set_vocab(Vocab.QUILT_INDEX)
                    .build()
            )
        else:
            self._logger.warn("color '%s' is not in Quilt Index list", text)

        object_builder.colors.append(builder.build())

    def __load_item_element_itm_component(self, letter, object_builder, text):
        letter = letter.lower()
        if letter in object_builder.component_builders_by_letter:
            self._logger.warn("component %s is defined twice on item %d", letter, object_builder.omeka_item_id)
            return
        object_builder.component_builders_by_letter[letter] = \
            Component.Builder()\
                .set_term(
                    ComponentTerm.Builder()
                        .set_text(text)
                        .build()
                )

    def _load_item_element_itm_condition(self, object_builder, text):
        object_builder.descriptions.append(
            Description.Builder()
                .set_text(text)
                .set_type(DescriptionType.CONDITION)
                .build()
        )

    def _load_item_element_itm_condition_term(self, object_builder, text):
        condition_str = text.upper().replace(' ', '_').rstrip('.')
        condition = getattr(Condition, condition_str)
        object_builder.set_condition(condition)

    def _load_item_element_itm_credit_line(self, object_builder, text):
        object_builder.descriptions.append(
            Description.Builder()
                .set_text(text)
                .set_type(DescriptionType.CREDIT)
                .build()
        )

    def _load_item_element_itm_culture(self, object_builder, text):
        object_builder.cultural_contexts.append(
            CulturalContext.Builder()
                .set_text(text)
                .build()
        )

    def _load_item_element_itm_date_certainty(self, object_builder, text):
        if text == 'circa':
            object_builder.dc_date_certainty = text
        elif text == 'designed in':
            object_builder.dc_date_builder.set_type(DateType.DESIGN)
        elif text == 'worn in':
            object_builder.dc_date_builder.set_type(DateType.PERFORMANCE)
        else:
            self._logger.warn("item %d in collection %d has unrecognized Date Certainty '%s'", object_builder.omeka_item_id, object_builder.omeka_collection_id, text)

    def _load_item_element_itm_date_earliest(self, object_builder, text):
        earliest_date = self.__parse_date(text)
        if object_builder.dc_date_builder.earliest_date is not None:
            self._logger.info(
                "replacing item %d's earliest date (%s) from Date with Date Earliest '%s' = %s",
                object_builder.omeka_item_id,
                object_builder.dc_date_builder.earliest_date,
                text,
                earliest_date
            )
        object_builder.dc_date_builder.earliest_date = earliest_date

    def _load_item_element_itm_date_latest(self, object_builder, text):
        latest_date = self.__parse_date(text)
        if object_builder.dc_date_builder.latest_date is not None:
            self._logger.info(
                "replacing item %d's latest date (%s) from Date with Date Earliest '%s' = %s",
                object_builder.omeka_item_id,
                object_builder.dc_date_builder.latest_date,
                text,
                latest_date
            )
        object_builder.dc_date_builder.latest_date = latest_date

    def _load_item_element_itm_description(self, object_builder, text):
        object_builder.descriptions.append(
            Description.Builder()
                .set_text(text)
                .build()
        )

    def _load_item_element_itm_description_main(self, object_builder, text):
        object_builder.descriptions.append(
            Description.Builder()
                .set_text(text)
                .set_type(DescriptionType.SUMMARY)
                .build()
        )

    def __load_item_element_itm_dimensions(self, object_builder, text, type_, extent=None, unit=None):
        builder = Measurements.Builder().set_text(text).set_type(type_)
        if extent is not None:
            builder.set_extent(extent)
        if unit is not None:
            builder.set_unit(unit)
        object_builder.measurements.append(builder.build())

    def _load_item_element_itm_dimensions_all(self, **kwds):
        self.__load_item_element_itm_dimensions(extent='all', type_=MeasurementsType.OTHER, **kwds)

    def _load_item_element_itm_dimensions_cb_length(self, **kwds):
        self.__load_item_element_itm_dimensions(extent='center back', type_=MeasurementsType.LENGTH, unit=MeasurementsUnit.IN, **kwds)

    def _load_item_element_itm_dimensions_chest(self, **kwds):
        self.__load_item_element_itm_dimensions(extent='chest', type_=MeasurementsType.WIDTH, unit=MeasurementsUnit.IN, **kwds)

    def _load_item_element_itm_dimensions_cf_length(self, **kwds):
        self.__load_item_element_itm_dimensions(extent='center front', type_=MeasurementsType.LENGTH, unit=MeasurementsUnit.IN, **kwds)

    def _load_item_element_itm_dimensions_hips(self, **kwds):
        self.__load_item_element_itm_dimensions(extent='hips', type_=MeasurementsType.WIDTH, unit=MeasurementsUnit.IN, **kwds)

    def _load_item_element_itm_dimensions_other(self, **kwds):
        self.__load_item_element_itm_dimensions(type_=MeasurementsType.OTHER, **kwds)

    def _load_item_element_itm_dimensions_waist(self, **kwds):
        self.__load_item_element_itm_dimensions(extent='waist', type_=MeasurementsType.WIDTH, unit=MeasurementsUnit.IN, **kwds)

    def _load_item_element_itm_donation_date(self, object_builder, text):
        earliest_date = self.__parse_date(text)
        object_builder.dates.append(
            Date.Builder()
                .set_earliest_date(earliest_date)
                .set_latest_date(earliest_date)
                .set_type(DateType.DONATION)
                .build()
        )

    def _load_item_element_itm_donor(self, object_builder, text):
        object_builder.agents.append(
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

    def _load_item_element_itm_exhibition_notes(self, object_builder, text):
        object_builder.descriptions.append(
            Description.Builder()
                .set_text(text)
                .set_type(DescriptionType.EXHIBITION)
                .build()
        )

    def _load_item_element_itm_exhibitions(self, object_builder, text):
        object_builder.relations.append(
            Relation.Builder()
                .set_text(text)
                .set_type(RelationType.EXHIBITED_AT)
                .build()
        )

    def _load_item_element_itm_gender(self, object_builder, text):
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

    def _load_item_element_itm_label(self, object_builder, text):
        text = text.strip("'").strip()
        if len(text) == 0:
            return
        object_builder.inscriptions.append(
            Inscription.Builder()
                .set_texts((
                    InscriptionText.Builder()
                        .set_text(text)
                        .set_type(InscriptionTextType.LABEL)
                        .build()
                ,))
                .build()
        )

    def _load_item_element_itm_location(self, object_builder, text):
        pass

    def _load_item_element_itm_mannequin(self, object_builder, text):
        pass

    def _load_item_element_itm_objectvr_link(self, object_builder, text):
        pass

    def _load_item_element_itm_original_format(self, object_builder, text):
        pass # For image items, the format of the subject of the image

    def _load_item_element_itm_private_information(self, object_builder, text):
        object_builder.descriptions.append(
            Description.Builder()
                .set_text(text)
                .set_type(DescriptionType.PRIVATE)
                .build()
        )

    def _load_item_element_itm_public_information(self, object_builder, text):
        object_builder.descriptions.append(
            Description.Builder()
                .set_text(text)
                .set_type(DescriptionType.PUBLIC)
                .build()
        )

    def _load_item_element_itm_quantity(self, object_builder, text):
        try:
            quantity = int(text)
        except ValueError:
            self._logger.warn("unparseable quantity: %s", text)
            return
        if object_builder.quantity is not None:
            assert object_builder.quantity == quantity, "%d vs. %d" % (object_builder.quantity, quantity)
        object_builder.set_quantity(quantity)

    def _load_item_element_itm_references(self, object_builder, text):
        object_builder.textrefs.append(
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

    def _load_item_element_itm_repository(self, object_builder, text):
        pass

    def _load_item_element_itm_source_identifier(self, object_builder, text):
        if not text in object_builder.identifiers:
            object_builder.identifiers.append(text)
        object_builder.relations.append(
            Relation.Builder()
                .set_text(text)
                .set_type(RelationType.DERIVED_FROM)
                .build()
        )

    def _load_item_element_itm_status_score(self, object_builder, text):
        pass

    def _load_item_element_itm_storage_layer(self, object_builder, text):
        pass

    def _load_item_element_itm_storage_location(self, object_builder, text):
        pass

    def __load_item_element_itm_structure(self, object_builder, text, type_):
        vocab_ref = VocabRef(vocab=Vocab.COSTUME_CORE)

        logger = self._logger
        def build_structure(structure_text):
            controlled_vocabulary = None
            for key, value in COSTUME_CORE_CONTROLLED_VOCABULARIES.iteritems():
                if key.lower() == 'structure ' + type_.text:
                    controlled_vocabulary = value
                    break
            if controlled_vocabulary is None:
                if type_.text == 'silhouette':
                    controlled_vocabulary = COSTUME_CORE_CONTROLLED_VOCABULARIES['Overall Silhouette']
                else:
                    logger.warn('unable to find controlled vocabulary for structure type %s', type_.text)

            if controlled_vocabulary is not None:
                if structure_text in controlled_vocabulary:
                    logger.debug("structure %s from item %d has controlled text '%s'", type_.text, object_builder.omeka_item_id, structure_text)
                elif structure_text.lower() in controlled_vocabulary:
                    structure_text = structure_text.lower()
                    logger.debug("structure %s from item %d has controlled text '%s' after lower-casing", type_.text, object_builder.omeka_item_id, structure_text)
                else:
                    logger.warn("structure %s from item %d has uncontrolled text '%s'", type_.text, object_builder.omeka_item_id, structure_text)

            return \
                Structure.Builder()\
                    .set_text(structure_text)\
                    .set_type(type_)\
                    .set_vocab_ref(vocab_ref)\
                    .build()

        lines = text.split("\n")
        if len(lines) == 1:
            for text_part in text.split(';'):
                text_part = text_part.strip()
                if len(text_part) == 0:
                    continue
                if len(text_part) > 2 and text_part[1] == ':':
                    # Form 'A: term'
                    letter = text_part[0].lower()
                    if not letter.isalpha():
                        raise NotImplementedError(text_part)
                    structure_text = text_part[2:].strip()
                    object_builder.structures_by_component_letter.setdefault(letter, []).append(build_structure(structure_text))
                elif text_part.endswith(')'):
                    # Form 'term (extent)'
                    open_p = text_part.rindex('(')
                    if open_p == -1:
                        object_builder.structures.append(build_structure(text_part))
                        continue
                    extent = text_part[open_p+1:-1]
                    structure_text = text_part[:open_p].strip()
                    if len(extent) == 1:
                        letter = extent.lower()
                        object_builder.structures_by_component_letter.setdefault(letter, []).append(build_structure(structure_text))
                    elif len(extent) > 0:
                        object_builder.structures_by_extent.setdefault(extent, []).append(build_structure(structure_text))
                    else:
                        raise NotImplementedError
                else:
                    # Form 'term'
                    object_builder.structures.append(build_structure(text_part))
        else:
            # One item, with each line form 'A: term'
            for line in lines:
                line = line.strip()
                if len(line) == 0:
                    continue
                if not (len(line) > 2 and line[1] == ':'):
                    raise NotImplementedError(line)
                letter = line[0].lower()
                if not letter.isalpha():
                    raise NotImplementedError(line)
                structure_text = line[2:].strip()
                object_builder.structures_by_component_letter.setdefault(letter, []).append(build_structure(structure_text))

    def _load_item_element_itm_structure_cut(self, **kwds):
        self.__load_item_element_itm_structure(type_=StructureType(text='cut', vocab_ref=VocabRef(vocab=Vocab.COSTUME_CORE)), **kwds)

    def _load_item_element_itm_structure_hem(self, **kwds):
        self.__load_item_element_itm_structure(type_=StructureType(text='hem', vocab_ref=VocabRef(vocab=Vocab.COSTUME_CORE)), **kwds)

    def _load_item_element_itm_structure_lining(self, **kwds):
        self.__load_item_element_itm_structure(type_=StructureType(text='lining', vocab_ref=VocabRef(vocab=Vocab.COSTUME_CORE)), **kwds)

    def _load_item_element_itm_structure_neckline(self, **kwds):
        self.__load_item_element_itm_structure(type_=StructureType(text='neckline', vocab_ref=VocabRef(vocab=Vocab.COSTUME_CORE)), **kwds)

    def _load_item_element_itm_structure_pants(self, **kwds):
        self.__load_item_element_itm_structure(type_=StructureType(text='pants', vocab_ref=VocabRef(vocab=Vocab.COSTUME_CORE)), **kwds)

    def _load_item_element_itm_structure_silhouette(self, **kwds):
        self.__load_item_element_itm_structure(type_=StructureType(text='silhouette', vocab_ref=VocabRef(vocab=Vocab.COSTUME_CORE)), **kwds)

    def _load_item_element_itm_structure_skirt(self, **kwds):
        self.__load_item_element_itm_structure(type_=StructureType(text='skirt', vocab_ref=VocabRef(vocab=Vocab.COSTUME_CORE)), **kwds)

    def _load_item_element_itm_structure_sleeves(self, **kwds):
        self.__load_item_element_itm_structure(type_=StructureType(text='sleeves', vocab_ref=VocabRef(vocab=Vocab.COSTUME_CORE)), **kwds)

    def _load_item_element_itm_structure_torso(self, **kwds):
        self.__load_item_element_itm_structure(type_=StructureType(text='torso', vocab_ref=VocabRef(vocab=Vocab.COSTUME_CORE)), **kwds)

    def _load_item_element_itm_structure_waist(self, **kwds):
        self.__load_item_element_itm_structure(type_=StructureType(text='waist', vocab_ref=VocabRef(vocab=Vocab.COSTUME_CORE)), **kwds)

    def _load_item_element_itm_suffix(self, object_builder, text):
        pass # Accession number suffix

    def _load_item_element_itm_technique(self, object_builder, text):
        for technique in text.split(';'):
            for technique in technique.split(','):
                technique = technique.strip()
                if len(technique) == 0:
                    continue
                object_builder.techniques.append(
                    Technique.Builder()
                        .set_text(technique)
                        .build()
                )

    def _load_item_element_itm_treatment(self, object_builder, text):
        pass

    def _load_item_element_itm_url(self, object_builder, text):
        pass # ObjectVR URL

    def _load_item_element_itm_view_type(self, object_builder, text):
        assert object_builder.view_type is None
        try:
            object_builder.set_view_type(getattr(ViewType, text.upper().replace(' ', '_')))
        except AttributeError:
            self._logger.error("item %d has unknown View Type '%s'", object_builder.omeka_item_id, text)

    def _load_item_element_itm_wearer(self, object_builder, text):
        object_builder.agents.append(
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

    def _load_item_files(
        self,
        files,
        object_builder,
        omeka_item_id
    ):
        try:
            files_count = files['count']
        except KeyError:
            files_count = 0

        if files_count > 0:
            file_dicts = []
            files_dir_path = os.path.join(self._data_dir_path, self._institution_id, 'files_by_item_id', str(omeka_item_id))
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

    def _load_item_type(self, item_type, object_builder):
        try:
            work_type_text = item_type['name']
        except (KeyError, TypeError):
            work_type_text = None
        if work_type_text is not None:
            work_type = self.__parse_work_type(work_type_text)
            if work_type is not None:
                object_builder.work_types.append(work_type)

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
                self._logger.debug("parsed date time has year out of range: '%s' from '%s'", parsed_date_time, text)
                return builder.build()

            builder.set_parsed_date_time(parsed_date_time)
            if parsed_date_time_granularity is not None:
                builder.set_parsed_date_time_granularity(parsed_date_time_granularity)
            self._logger.debug("parsed date '%s' from %s at granularity '%s'", parsed_date_time, text, parsed_date_time_granularity)

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
        self._logger.debug("parsed date range '%s' from '%s'", date_range, text)
        return date_range

    def __parse_work_type(self, text):
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
