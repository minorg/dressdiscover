import java.util.Date

from com.google.common.collect import ImmutableList
from org.dressdiscover.api.models import Vocab
from org.dressdiscover.api.models import VocabRef
from org.dressdiscover.api.vocabularies.costume_core import CostumeCoreObject
from org.dressdiscover.api.vocabularies.costume_core.closure import Closure, \
    ClosureSet, ClosurePlacement, ClosureType
from org.dressdiscover.api.vocabularies.costume_core.color import ColorSet, \
    Color
from org.dressdiscover.api.vocabularies.costume_core.component import ComponentSet, \
    Component, ComponentTerm
from org.dressdiscover.api.vocabularies.costume_core.condition import Condition
from org.dressdiscover.api.vocabularies.costume_core.gender import Gender
from org.dressdiscover.api.vocabularies.costume_core.structure import StructureSet, \
    StructureType, Structure
from org.dressdiscover.api.vocabularies.vra_core.agent import Agent, AgentName, \
    AgentNameType, AgentRole
from org.dressdiscover.api.vocabularies.vra_core.cultural_context import CulturalContext
from org.dressdiscover.api.vocabularies.vra_core.date import DateBound, \
    DateTimeGranularity, Date, DateType
from org.dressdiscover.api.vocabularies.vra_core.description import Description, \
    DescriptionType
from org.dressdiscover.api.vocabularies.vra_core.inscription import Inscription, \
    InscriptionText, InscriptionTextType
from org.dressdiscover.api.vocabularies.vra_core.location import Location, \
    LocationRefid, LocationRefidType, LocationType
from org.dressdiscover.api.vocabularies.vra_core.measurements import Measurements, \
    MeasurementsType, MeasurementsUnit
from org.dressdiscover.api.vocabularies.vra_core.relation import Relation, \
    RelationType
from org.dressdiscover.api.vocabularies.vra_core.technique import Technique
from org.dressdiscover.api.vocabularies.vra_core.textref import Textref, \
    TextrefName, TextrefNameType, TextrefRefid, TextrefRefidType

from dressdiscover.lib.mappers.omeka.omeka_resource_mapper import OmekaResourceMapper
from org.dressdiscover.api.vocabularies.costume_core.view_type import ViewType


class CostumeCoreOmekaResourceMapper(OmekaResourceMapper):
    _COSTUME_CORE_VOCAB_REF = VocabRef.builder().setVocab(Vocab.COSTUME_CORE).build()

    class _ObjectBuilder(OmekaResourceMapper._ObjectBuilder):
        def __init__(self, **kwds):
            OmekaResourceMapper._ObjectBuilder.__init__(self, **kwds)

            self.cc = {}
            self.closure_placements = []
            self.closure_types = []
            self.component_builders_by_letter = {}
            self.colors = []
            self.structures = []
            self.structures_by_component_letter = {}
            self.structures_by_extent = {}

        def build(self):
            cc_builder = None

            if len(self.cc) > 0:
                cc_builder = CostumeCoreObject.builder()
                for name, value in self.cc.iteritems():
                    cc_builder.set(name, value)

            if len(self.closure_placements) > 0 and len(self.closure_types) > 0:
                closures = []
                if len(self.closure_placements) == len(self.closure_types):
                    for closure_placement, closure_type in zip(self.closure_placements, self.closure_types):
                        closures.append(
                            Closure.builder()
                                .setPlacement(closure_placement)
                                .setType(closure_type)
                                .build()
                        )
                elif len(self.closure_placements) == 1:
                    for closure_type in self.closure_types:
                        closures.append(
                            Closure.builder()
                                .setPlacement(self.closure_placements[0])
                                .setType(closure_type)
                                .build()
                        )
                elif len(self.closure_types) == 1:
                    for closure_placement in self.closure_placements:
                        closures.append(
                            Closure.builder()
                                .setPlacement(closure_placement)
                                .setType(self.closure_types[0])
                                .build()
                        )
                else:
                    self.logger.warn(self.log_marker, "item {} has different numbers of closure placements and closure types: {} vs. {}", (self.omeka_item.id, len(self.closure_placements), len(self.closure_types)))
                if len(closures) > 0:
                    if cc_builder is None:
                        cc_builder = CostumeCoreObject.builder()
                    cc_builder.setClosureSets(ImmutableList.of(ClosureSet.builder().setElements(ImmutableList.copyOf(closures)).build()))

            if len(self.colors) > 0:
                if cc_builder is None:
                    cc_builder = CostumeCoreObject.builder()
                cc_builder.setColorSets(ImmutableList.of(ColorSet.builder().setElements(ImmutableList.copyOf(self.colors)).build()))

            if len(self.component_builders_by_letter) > 0:
                components = []
                for letter, component_builder in self.component_builders_by_letter.iteritems():
                    structures = self.structures_by_component_letter.pop(letter, [])
                    structures.extend(self.structures_by_extent.pop(component_builder.term.text, []))
                    if len(structures) > 0:
                        component_builder.setStructures(StructureSet.builder().setElements(ImmutableList.copyOf(structures)).build())
                    component = component_builder.build()
                    components.append(component)
                for letter in self.structures_by_component_letter.iterkeys():
                    self.logger.warn(self.log_marker, "structure(s) specified for unknown component {} on item {}", letter, self.omeka_item.id)
                for letter in self.structures_by_extent.iterkeys():
                    self.logger.warn(self.log_marker, "structure(s) specified for unknown extent {} on item {}", letter, self.omeka_item.id)
                if cc_builder is None:
                    cc_builder = CostumeCoreObject.builder()
                cc_builder.setComponentSets(ImmutableList.of(ComponentSet.builder().setElements(ImmutableList.copyOf(components)).build()))

            if len(self.structures) > 0:
                if cc_builder is None:
                    cc_builder = CostumeCoreObject.builder()
                cc_builder.setStructureSets(ImmutableList.of(StructureSet.builder().setElements(ImmutableList.copyOf(self.structures)).build()))

            if cc_builder is not None:
                self._object_builder.setCostumeCore(cc_builder.build())

            return OmekaResourceMapper._ObjectBuilder.build(self)

    # Components
    def _map_omeka_item_element_itm_a(self, **kwds):
        self.__map_omeka_item_element_itm_component(letter='a', **kwds)

    def _map_omeka_item_element_itm_b(self, **kwds):
        self.__map_omeka_item_element_itm_component(letter='b', **kwds)

    def _map_omeka_item_element_itm_c(self, **kwds):
        self.__map_omeka_item_element_itm_component(letter='c', **kwds)

    def _map_omeka_item_element_itm_d(self, **kwds):
        self.__map_omeka_item_element_itm_component(letter='d', **kwds)

    def _map_omeka_item_element_itm_e(self, **kwds):
        self.__map_omeka_item_element_itm_component(letter='e', **kwds)

    def _map_omeka_item_element_itm_f(self, **kwds):
        self.__map_omeka_item_element_itm_component(letter='f', **kwds)

    def _map_omeka_item_element_itm_accession_number(self, object_builder, text):
        object_builder.vra.setdefault('location', []).append(
            Location.builder()
                .setRefids(ImmutableList.of(
                    LocationRefid.builder()
                        .setText(text)
                        .setType(LocationRefidType.ACCESSION)
                        .build(),
                ))
                .setType(LocationType.REPOSITORY)
                .build()
        )

    def _map_omeka_item_element_itm_accession_year(self, object_builder, text):
        try:
            year = int(text)
        except ValueError:
            object_builder.logger.warn(object_builder.log_marker, "unable to parse Accession Year '{}'", text)
            return
        earliest_date = \
            DateBound.builder()\
                .setParsedDateTime(java.util.Date(year - 1900, 0, 1))\
                .setParsedDateTimeGranularity(DateTimeGranularity.YEAR)\
                .setText(text)\
                .build()
        object_builder.vra.setdefault('date', []).append(
            Date.builder()
                .setEarliestDate(earliest_date)
                .setLatestDate(earliest_date)
                .setType(DateType.ACCESSION)
                .build()
        )

    def _map_omeka_item_element_itm_bibliography(self, object_builder, text):
        object_builder.vra.setdefault('description', []).append(
            Description.builder()
                .setText(text)
                .setType(DescriptionType.BIBLIOGRAPHY)
                .build()
        )

    def _map_omeka_item_element_itm_biographical_text(self, object_builder, text):
        object_builder.vra.setdefault('description', []).append(
            Description.builder()
                .setText(text)
                .setType(DescriptionType.BIOGRAPHY)
                .build()
        )

    def _map_omeka_item_element_itm_cataloguer_with_date(self, object_builder, text):
        pass

    def _map_omeka_item_element_itm_category(self, object_builder, text):
        object_builder.dc.setdefault('subject', []).append(text)

    def _map_omeka_item_element_itm_classification(self, object_builder, text):
        object_builder.dc.setdefault('subject', []).append(text)

    def _map_omeka_item_element_itm_closure_placement(self, object_builder, text):
#         if text not in COSTUME_CORE_CONTROLLED_VOCABULARIES['Closure Placement']:
#             object_builder.logger.warn(object_builder.log_marker, "using uncontrolled closure placement {} from item {}", text, object_builder.omeka_item.id)
        object_builder.closure_placements.append(
            ClosurePlacement.builder()\
                .setText(text)\
                .setVocabRef(self._COSTUME_CORE_VOCAB_REF)\
                .build()
        )

    def _map_omeka_item_element_itm_closure_type(self, object_builder, text):
#         if text not in COSTUME_CORE_CONTROLLED_VOCABULARIES['Closure Type']:
#             object_builder.logger.warn(object_builder.log_marker, "using uncontrolled closure type {} from item {}", text, object_builder.omeka_item.id)
        object_builder.closure_types.append(
            ClosureType.builder()\
                .setText(text)\
                .setVocabRef(self._COSTUME_CORE_VOCAB_REF)\
                .build()
        )

    def _map_omeka_item_element_itm_color(self, object_builder, text, type_):
        text = text.lower()
        builder = \
            Color.builder()\
                .setText(text)\
                .setType(type_)

#         if text in COSTUME_CORE_CONTROLLED_VOCABULARIES['Main Color']:
        builder.setVocabRef(
            VocabRef.builder()
                .setRefid(text)
                .setVocab(Vocab.QUILT_INDEX)
                .build()
        )
#         else:
#             object_builder.logger.warn(object_builder.log_marker, "color '{}' is not in Quilt Index list", text)

        object_builder.colors.append(builder.build())

    def __map_omeka_item_element_itm_component(self, letter, object_builder, text):
        letter = letter.lower()
        if letter in object_builder.component_builders_by_letter:
            object_builder.logger.warn(object_builder.log_marker, "component {} is defined twice on item {}", letter, object_builder.omeka_item.id)
            return
        object_builder.component_builders_by_letter[letter] = \
            Component.builder()\
                .setTerm(
                    ComponentTerm.builder()
                        .setText(text)
                        .build()
                )

    def _map_omeka_item_element_itm_condition(self, object_builder, text):
        object_builder.vra.setdefault('description', []).append(
            Description.builder()
                .setText(text)
                .setType(DescriptionType.CONDITION)
                .build()
        )

    def _map_omeka_item_element_itm_condition_term(self, object_builder, text):
        condition_str = text.upper().replace(' ', '_').rstrip('.')
        object_builder.cc['condition'] = getattr(Condition, condition_str)

    def _map_omeka_item_element_itm_credit_line(self, object_builder, text):
        object_builder.vra.setdefault('description', []).append(
            Description.builder()
                .setText(text)
                .setType(DescriptionType.CREDIT)
                .build()
        )

    def _map_omeka_item_element_itm_culture(self, object_builder, text):
        object_builder.vra.setdefault('cultural_context', []).append(
            CulturalContext.builder()
                .setText(text)
                .build()
        )

    def _map_omeka_item_element_itm_date_certainty(self, object_builder, text):
        pass
#         if text == 'circa':
#             object_builder.dc_date_certainty = text
#         elif text == 'designed in':
#             object_builder.dc_date_builder.setType(DateType.DESIGN)
#         elif text == 'worn in':
#             object_builder.dc_date_builder.setType(DateType.PERFORMANCE)
#         else:
#             object_builder.logger.warn(object_builder.log_marker, "item {} in has unrecognized Date Certainty '{}'", object_builder.omeka_item.id, text)

    def _map_omeka_item_element_itm_date_earliest(self, object_builder, text):
        pass
#         earliest_date = self._parse_date(object_builder=object_builder, text=text)
#         if object_builder.dc_date_builder.earliestDate is not None:
#             object_builder.logger.info(
#                 object_builder.log_marker,
#                 "replacing item {}'s earliest date ({}) from Date with Date Earliest '{}' = {}",
#                 (
#                     object_builder.omeka_item.id,
#                     object_builder.dc_date_builder.earliestDate,
#                     text,
#                     earliest_date
#                 )
#             )
#         object_builder.dc_date_builder.earliestDate = earliest_date

    def _map_omeka_item_element_itm_date_latest(self, object_builder, text):
        pass
#         latest_date = self._parse_date(object_builder=object_builder, text=text)
#         if object_builder.dc_date_builder.latestDate is not None:
#             object_builder.logger.info(
#                 object_builder.log_marker,
#                 "replacing item {}'s latest date ({}) from Date with Date Earliest '{}' = {}",
#                 (
#                     object_builder.omeka_item.id,
#                     object_builder.dc_date_builder.latestDate,
#                     text,
#                     latest_date
#                 )
#             )
#         object_builder.dc_date_builder.latestDate = latest_date

    def _map_omeka_item_element_itm_description(self, object_builder, text):
        object_builder.dc.setdefault('description', []).append(text)

    def _map_omeka_item_element_itm_description_main(self, object_builder, text):
        object_builder.vra.setdefault('description', []).append(
            Description.builder()
                .setText(text)
                .setType(DescriptionType.SUMMARY)
                .build()
        )

    def __map_omeka_item_element_itm_dimensions(self, object_builder, text, type_, extent=None, unit=None):
        builder = Measurements.builder().setText(text).setType(type_)
        if extent is not None:
            builder.setExtent(extent)
        if unit is not None:
            builder.setUnit(unit)
        object_builder.vra.setdefault('measurements', []).append(builder.build())

    def _map_omeka_item_element_itm_dimensions_all(self, **kwds):
        self.__map_omeka_item_element_itm_dimensions(extent='all', type_=MeasurementsType.OTHER, **kwds)

    def _map_omeka_item_element_itm_dimensions_cb_length(self, **kwds):
        self.__map_omeka_item_element_itm_dimensions(extent='center back', type_=MeasurementsType.LENGTH, unit=MeasurementsUnit.IN, **kwds)

    def _map_omeka_item_element_itm_dimensions_chest(self, **kwds):
        self.__map_omeka_item_element_itm_dimensions(extent='chest', type_=MeasurementsType.WIDTH, unit=MeasurementsUnit.IN, **kwds)

    def _map_omeka_item_element_itm_dimensions_cf_length(self, **kwds):
        self.__map_omeka_item_element_itm_dimensions(extent='center front', type_=MeasurementsType.LENGTH, unit=MeasurementsUnit.IN, **kwds)

    def _map_omeka_item_element_itm_dimensions_hips(self, **kwds):
        self.__map_omeka_item_element_itm_dimensions(extent='hips', type_=MeasurementsType.WIDTH, unit=MeasurementsUnit.IN, **kwds)

    def _map_omeka_item_element_itm_dimensions_other(self, **kwds):
        self.__map_omeka_item_element_itm_dimensions(type_=MeasurementsType.OTHER, **kwds)

    def _map_omeka_item_element_itm_dimensions_waist(self, **kwds):
        self.__map_omeka_item_element_itm_dimensions(extent='waist', type_=MeasurementsType.WIDTH, unit=MeasurementsUnit.IN, **kwds)

    def _map_omeka_item_element_itm_donation_date(self, object_builder, text):
        earliest_date = self._parse_date(object_builder=object_builder, text=text)
        object_builder.vra.setdefault('date', []).append(
            Date.builder()
                .setEarliestDate(earliest_date)
                .setLatestDate(earliest_date)
                .setType(DateType.DONATION)
                .build()
        )

    def _map_omeka_item_element_itm_donor(self, object_builder, text):
        object_builder.vra.setdefault('agent', []).append(
            Agent.builder()
                .setName(
                    AgentName.builder()
                        .setText(text)
                        .setType(AgentNameType.OTHER)
                        .build()
                    )
                .setRole(
                    AgentRole.builder()
                        .setText('donor')
                        .build()
                    )
                .build()
        )

    def _map_omeka_item_element_itm_exhibition_notes(self, object_builder, text):
        object_builder.vra.setdefault('description', []).append(
            Description.builder()
                .setText(text)
                .setType(DescriptionType.EXHIBITION)
                .build()
        )

    def _map_omeka_item_element_itm_exhibitions(self, object_builder, text):
        object_builder.relation_builders.append(
            Relation.builder()
                .setText(text)
                .setType(RelationType.EXHIBITED_AT)
        )

    def _map_omeka_item_element_itm_gender(self, object_builder, text):
        text = text.lower().split(',')[0]
        if text == 'female':
            gender = Gender.FEMALE
        elif text == 'male':
            gender = Gender.MALE
        else:
            raise NotImplementedError(text)
        if 'gender' in object_builder.cc:
            assert object_builder.cc['gender'] == gender, "%s vs. %s" % (object_builder.cc['gender'], gender)
        object_builder.cc['gender'] = gender

    def _map_omeka_item_element_itm_label(self, object_builder, text):
        text = text.strip("'").strip()
        if len(text) == 0:
            return
        object_builder.vra.setdefault('inscription', []).append(
            Inscription.builder()
                .setTexts(ImmutableList.of(
                    InscriptionText.builder()
                        .setText(text)
                        .setType(InscriptionTextType.LABEL)
                        .build()
                ))
                .build()
        )

    def _map_omeka_item_element_itm_location(self, object_builder, text):
        pass

    def _map_omeka_item_element_itm_mannequin(self, object_builder, text):
        pass

    def _map_omeka_item_element_itm_objectvr_link(self, object_builder, text):
        pass

    def _map_omeka_item_element_itm_original_format(self, object_builder, text):
        pass # For image items, the format of the subject of the image

    def _map_omeka_item_element_itm_private_information(self, object_builder, text):
        object_builder.vra.setdefault('description', []).append(
            Description.builder()
                .setText(text)
                .setType(DescriptionType.PRIVATE)
                .build()
        )

    def _map_omeka_item_element_itm_public_information(self, object_builder, text):
        object_builder.vra.setdefault('description', []).append(
            Description.builder()
                .setText(text)
                .setType(DescriptionType.PUBLIC)
                .build()
        )

    def _map_omeka_item_element_itm_quantity(self, object_builder, text):
        try:
            quantity = int(text)
        except ValueError:
            object_builder.logger.warn(object_builder.log_marker, "unparseable quantity: {}", text)
            return
        if 'quantity' in object_builder.cc:
            assert object_builder.cc['quantity'] == quantity, "%d vs. %d" % (object_builder.cc['quantity'], quantity)
        object_builder.cc['quantity'] = quantity

    def _map_omeka_item_element_itm_references(self, object_builder, text):
        object_builder.vra.setdefault('textref', []).append(
            Textref.builder()
                .setName(
                    TextrefName.builder()
                        .setText(text)
                        .setType(TextrefNameType.CORPUS)
                        .build()
                )
                .setRefid(
                    TextrefRefid.builder()
                        .setText("unparsed")
                        .setType(TextrefRefidType.CITATION)
                        .build()
                )
                .build()
        )

    def _map_omeka_item_element_itm_repository(self, object_builder, text):
        pass

    def _map_omeka_item_element_itm_source_identifier(self, object_builder, text):
        object_builder.dc.setdefault('identifier', []).append(text)
        object_builder.relation_builders.append(
            Relation.builder()
                .setText(text)
                .setType(RelationType.DERIVED_FROM)
        )

    def _map_omeka_item_element_itm_status_score(self, object_builder, text):
        pass

    def _map_omeka_item_element_itm_storage_layer(self, object_builder, text):
        pass

    def _map_omeka_item_element_itm_storage_location(self, object_builder, text):
        pass

    def __map_omeka_item_element_itm_structure(self, object_builder, text, type_):
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
                    object_builder.structures_by_component_letter.setdefault(letter, []).append(self._parse_structure(object_builder=object_builder, text=structure_text, type_=type_))
                elif text_part.endswith(')'):
                    # Form 'term (extent)'
                    open_p = text_part.rindex('(')
                    if open_p == -1:
                        object_builder.structures.append(self._parse_structure(object_builder=object_builder, text=text_part, type_=type_))
                        continue
                    extent = text_part[open_p+1:-1]
                    structure_text = text_part[:open_p].strip()
                    if len(extent) == 1:
                        letter = extent.lower()
                        object_builder.structures_by_component_letter.setdefault(letter, []).append(self._parse_structure(object_builder=object_builder, text=structure_text, type_=type_))
                    elif len(extent) > 0:
                        object_builder.structures_by_extent.setdefault(extent, []).append(self._parse_structure(object_builder=object_builder, text=structure_text, type_=type_))
                    else:
                        raise NotImplementedError
                else:
                    # Form 'term'
                    object_builder.structures.append(self._parse_structure(object_builder=object_builder, text=text_part, type_=type_))
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
                object_builder.structures_by_component_letter.setdefault(letter, []).append(self._parse_structure(object_builder=object_builder, text=structure_text, type_=type_))

    def _map_omeka_item_element_itm_structure_cut(self, **kwds):
        self.__map_omeka_item_element_itm_structure(type_=StructureType.builder().setText('Structure Cut').setVocabRef(self._COSTUME_CORE_VOCAB_REF).build(), **kwds)

    def _map_omeka_item_element_itm_structure_hem(self, **kwds):
        self.__map_omeka_item_element_itm_structure(type_=StructureType.builder().setText('Structure Lining').setVocabRef(self._COSTUME_CORE_VOCAB_REF).build(), **kwds)

    def _map_omeka_item_element_itm_structure_lining(self, **kwds):
        self.__map_omeka_item_element_itm_structure(type_=StructureType.builder().setText('Structure Lining').setVocabRef(self._COSTUME_CORE_VOCAB_REF).build(), **kwds)

    def _map_omeka_item_element_itm_structure_neckline(self, **kwds):
        self.__map_omeka_item_element_itm_structure(type_=StructureType.builder().setText('Structure Neckline').setVocabRef(self._COSTUME_CORE_VOCAB_REF).build(), **kwds)

    def _map_omeka_item_element_itm_structure_pants(self, **kwds):
        self.__map_omeka_item_element_itm_structure(type_=StructureType.builder().setText('Structure Pants').setVocabRef(self._COSTUME_CORE_VOCAB_REF).build(), **kwds)

    def _map_omeka_item_element_itm_structure_silhouette(self, **kwds):
        self.__map_omeka_item_element_itm_structure(type_=StructureType.builder().setText('Overall Silhouette').setVocabRef(self._COSTUME_CORE_VOCAB_REF).build(), **kwds)

    def _map_omeka_item_element_itm_structure_skirt(self, **kwds):
        self.__map_omeka_item_element_itm_structure(type_=StructureType.builder().setText('Structure Skirt').setVocabRef(self._COSTUME_CORE_VOCAB_REF).build(), **kwds)

    def _map_omeka_item_element_itm_structure_sleeves(self, **kwds):
        self.__map_omeka_item_element_itm_structure(type_=StructureType.builder().setText('Structure Sleeves').setVocabRef(self._COSTUME_CORE_VOCAB_REF).build(), **kwds)

    def _map_omeka_item_element_itm_structure_torso(self, **kwds):
        self.__map_omeka_item_element_itm_structure(type_=StructureType.builder().setText('Structure Torso').setVocabRef(self._COSTUME_CORE_VOCAB_REF).build(), **kwds)

    def _map_omeka_item_element_itm_structure_waist(self, **kwds):
        self.__map_omeka_item_element_itm_structure(type_=StructureType.builder().setText('Structure Waist').setVocabRef(self._COSTUME_CORE_VOCAB_REF).build(), **kwds)

    def _map_omeka_item_element_itm_suffix(self, object_builder, text):
        pass # Accession number suffix

    def _map_omeka_item_element_itm_technique(self, object_builder, text):
        for technique in text.split(';'):
            for technique in technique.split(','):
                technique = technique.strip()
                if len(technique) == 0:
                    continue
                object_builder.vra.setdefault('technique', []).append(
                    Technique.builder()
                        .setText(technique)
                        .build()
                )

    def _map_omeka_item_element_itm_treatment(self, object_builder, text):
        pass

    def _map_omeka_item_element_itm_url(self, object_builder, text):
        pass # ObjectVR URL

    def _map_omeka_item_element_itm_view_type(self, object_builder, text):
        assert 'view_type' not in object_builder.cc
        try:
            object_builder.cc['view_type'] = getattr(ViewType, text.upper().replace(' ', '_'))
        except AttributeError:
            object_builder.logger.error(object_builder.log_marker, "item {} has unknown View Type '{}'", object_builder.omeka_item.id, text)

    def _map_omeka_item_element_itm_wearer(self, object_builder, text):
        object_builder.vra.setdefault('agent', []).append(
            Agent.builder()
                .setName(
                    AgentName.builder()
                        .setText(text)
                        .setType(AgentNameType.PERSONAL)
                        .build()
                    )
                .setRole(
                    AgentRole.builder()
                        .setText('wearer')
                        .build()
                    )
                .build()
        )

    def _parse_structure(self, object_builder, text, type_):
#         try:
#             controlled_vocabulary = COSTUME_CORE_CONTROLLED_VOCABULARIES[type_.text]
#         except KeyError:
#             controlled_vocabulary = None
#             object_builder.logger.warn(object_builder.log_marker, 'unable to find controlled vocabulary for structure type {}', type_.text)
#
#         if controlled_vocabulary is not None:
#             if text in controlled_vocabulary:
#                 object_builder.logger.debug(object_builder.log_marker, "structure {} from item {} has controlled text '{}'", type_.text, object_builder.omeka_item.id, text)
#             elif text.lower() in controlled_vocabulary:
#                 text = text.lower()
#                 object_builder.logger.debug(object_builder.log_marker, "structure {} from item {} has controlled text '{}' after lower-casing", type_.text, object_builder.omeka_item.id, text)
#             else:
#                 object_builder.logger.warn(object_builder.log_marker, "structure {} from item {} has uncontrolled text '{}'", type_.text, object_builder.omeka_item.id, text)

        return \
            Structure.builder()\
                .setText(text)\
                .setType(type_)\
                .setVocabRef(self._COSTUME_CORE_VOCAB_REF)\
                .build()

