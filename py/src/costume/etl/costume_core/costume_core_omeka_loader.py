from collections import Counter
from datetime import datetime

import pytz

from costume.api.models.agent.agent import Agent
from costume.api.models.agent.agent_name import AgentName
from costume.api.models.agent.agent_name_type import AgentNameType
from costume.api.models.agent.agent_role import AgentRole
from costume.api.models.closure.closure import Closure
from costume.api.models.closure.closure_placement import ClosurePlacement
from costume.api.models.closure.closure_set import ClosureSet
from costume.api.models.closure.closure_type import ClosureType
from costume.api.models.color.color import Color
from costume.api.models.color.color_set import ColorSet
from costume.api.models.component.component import Component
from costume.api.models.component.component_set import ComponentSet
from costume.api.models.component.component_term import ComponentTerm
from costume.api.models.condition.condition import Condition
from costume.api.models.cultural_context.cultural_context import CulturalContext
from costume.api.models.date.date import Date
from costume.api.models.date.date_bound import DateBound
from costume.api.models.date.date_time_granularity import DateTimeGranularity
from costume.api.models.date.date_type import DateType
from costume.api.models.description.description import Description
from costume.api.models.description.description_type import DescriptionType
from costume.api.models.gender.gender import Gender
from costume.api.models.inscription.inscription import Inscription
from costume.api.models.inscription.inscription_text import InscriptionText
from costume.api.models.inscription.inscription_text_type import InscriptionTextType
from costume.api.models.location.location import Location
from costume.api.models.location.location_refid import LocationRefid
from costume.api.models.location.location_refid_type import LocationRefidType
from costume.api.models.location.location_type import LocationType
from costume.api.models.measurements.measurements import Measurements
from costume.api.models.measurements.measurements_type import MeasurementsType
from costume.api.models.measurements.measurements_unit import MeasurementsUnit
from costume.api.models.relation.relation import Relation
from costume.api.models.relation.relation_type import RelationType
from costume.api.models.structure.structure import Structure
from costume.api.models.structure.structure_set import StructureSet
from costume.api.models.structure.structure_type import StructureType
from costume.api.models.technique.technique import Technique
from costume.api.models.textref.textref import Textref
from costume.api.models.textref.textref_name import TextrefName
from costume.api.models.textref.textref_name_type import TextrefNameType
from costume.api.models.textref.textref_refid import TextrefRefid
from costume.api.models.textref.textref_refid_type import TextrefRefidType
from costume.api.models.view_type.view_type import ViewType
from costume.api.models.vocab import Vocab
from costume.api.models.vocab_ref import VocabRef
from costume.etl.costume_core.costume_core_controlled_vocabularies import COSTUME_CORE_CONTROLLED_VOCABULARIES
from costume.etl.omeka.omeka_loader import OmekaLoader


class CostumeCoreOmekaLoader(OmekaLoader):
    _COSTUME_CORE_VOCAB_REF = vocab_ref=VocabRef(vocab=Vocab.COSTUME_CORE)

    class _ObjectBuilder(OmekaLoader._ObjectBuilder):
        def __init__(self, **kwds):
            OmekaLoader._ObjectBuilder.__init__(self, **kwds)

            self.closure_placements = []
            self.closure_types = []
            self.component_builders_by_letter = {}
            self.colors = []
            self.structures = []
            self.structures_by_component_letter = {}
            self.structures_by_extent = {}

        def build(self):
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
                    self._object_builder.set_closures(ClosureSet.Builder().set_elements(tuple(closures)).build())
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
                self._object_builder.set_components(ComponentSet.Builder().set_elements(tuple(components)).build())
            if len(self.colors) > 0:
                self._object_builder.set_colors(ColorSet.Builder().set_elements(tuple(self.colors)).build())
            if len(self.structures) > 0:
                self._object_builder.set_structures(StructureSet.Builder().set_elements(tuple(self.structures)).build())

            return OmekaLoader._ObjectBuilder.build(self)

    def _load(self, **kwds):
        self.__structure_counts_by_omeka_item_id = Counter()

        OmekaLoader._load(self, **kwds)

        print "Omeka items with most structure:"
        structure_count_items = list(self.__structure_counts_by_omeka_item_id.items())
        structure_count_items.sort(lambda left, right: -1 * cmp(left[1], right[1]))
        for structure_count_item in structure_count_items:
            print "%d,%d" % structure_count_item

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
        object_builder.locations.append(
            Location.Builder()
                .set_refids((
                    LocationRefid.Builder()
                        .set_text(text)
                        .set_type(LocationRefidType.ACCESSION)
                        .build(),
                ))
                .set_type(LocationType.REPOSITORY)
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
        self._update_vocabulary_used('Item Type Metadata', 'Category', text)

    def _load_item_element_itm_classification(self, object_builder, text):
        object_builder.categories.append(text)
        self._update_vocabulary_used('Item Type Metadata', 'Classification', text)

    def _load_item_element_itm_closure_placement(self, object_builder, text):
        self.__structure_counts_by_omeka_item_id[object_builder.omeka_item_id] += 1

        if text not in COSTUME_CORE_CONTROLLED_VOCABULARIES['Closure Placement']:
            self._logger.warn("using uncontrolled closure placement %s from item %d", text, object_builder.omeka_item_id)
        object_builder.closure_placements.append(
            ClosurePlacement.Builder()\
                .set_text(text)\
                .set_vocab_ref(self._COSTUME_CORE_VOCAB_REF)\
                .build()
        )
        self._update_vocabulary_used('Item Type Metadata', 'Closure Placement', text)

    def _load_item_element_itm_closure_type(self, object_builder, text):
        self.__structure_counts_by_omeka_item_id[object_builder.omeka_item_id] += 1

        if text not in COSTUME_CORE_CONTROLLED_VOCABULARIES['Closure Type']:
            self._logger.warn("using uncontrolled closure type %s from item %d", text, object_builder.omeka_item_id)
        object_builder.closure_types.append(
            ClosureType.Builder()\
                .set_text(text)\
                .set_vocab_ref(self._COSTUME_CORE_VOCAB_REF)\
                .build()
        )
        self._update_vocabulary_used('Item Type Metadata', 'Closure Type', text)

    def _load_item_element_itm_color(self, object_builder, text, type_):
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

        self._update_vocabulary_used('Item Type Metadata', 'Color', text)

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
        self._update_vocabulary_used('Item Type Metadata', 'Condition Term', text)

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
        self._update_vocabulary_used('Item Type Metadata', 'Culture', text)

    def _load_item_element_itm_date_certainty(self, object_builder, text):
        if text == 'circa':
            object_builder.dc_date_certainty = text
        elif text == 'designed in':
            object_builder.dc_date_builder.set_type(DateType.DESIGN)
        elif text == 'worn in':
            object_builder.dc_date_builder.set_type(DateType.PERFORMANCE)
        else:
            self._logger.warn("item %d in collection %d has unrecognized Date Certainty '%s'", object_builder.omeka_item_id, object_builder.omeka_collection_id, text)
        self._update_vocabulary_used('Item Type Metadata', 'Date Certainty', text)

    def _load_item_element_itm_date_earliest(self, object_builder, text):
        earliest_date = self._parse_date(text)
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
        latest_date = self._parse_date(text)
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
        earliest_date = self._parse_date(text)
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
        object_builder.relation_builders.append(
            Relation.Builder()
                .set_text(text)
                .set_type(RelationType.EXHIBITED_AT)
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
        self._update_vocabulary_used('Item Type Metadata', 'Gender', text)

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
        self._update_vocabulary_used('Item Type Metadata', 'Original Format', text)

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
        object_builder.relation_builders.append(
            Relation.Builder()
                .set_text(text)
                .set_type(RelationType.DERIVED_FROM)
        )

    def _load_item_element_itm_status_score(self, object_builder, text):
        pass

    def _load_item_element_itm_storage_layer(self, object_builder, text):
        pass

    def _load_item_element_itm_storage_location(self, object_builder, text):
        pass

    def __load_item_element_itm_structure(self, object_builder, text, type_):
        self.__structure_counts_by_omeka_item_id[object_builder.omeka_item_id] += 1

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

    def _load_item_element_itm_structure_cut(self, **kwds):
        self.__load_item_element_itm_structure(type_=StructureType(text='Structure Cut', vocab_ref=self._COSTUME_CORE_VOCAB_REF), **kwds)

    def _load_item_element_itm_structure_hem(self, **kwds):
        self.__load_item_element_itm_structure(type_=StructureType(text='Structure Lining', vocab_ref=self._COSTUME_CORE_VOCAB_REF), **kwds)

    def _load_item_element_itm_structure_lining(self, **kwds):
        self.__load_item_element_itm_structure(type_=StructureType(text='Structure Lining', vocab_ref=self._COSTUME_CORE_VOCAB_REF), **kwds)

    def _load_item_element_itm_structure_neckline(self, **kwds):
        self.__load_item_element_itm_structure(type_=StructureType(text='Structure Neckline', vocab_ref=self._COSTUME_CORE_VOCAB_REF), **kwds)

    def _load_item_element_itm_structure_pants(self, **kwds):
        self.__load_item_element_itm_structure(type_=StructureType(text='Structure Pants', vocab_ref=self._COSTUME_CORE_VOCAB_REF), **kwds)

    def _load_item_element_itm_structure_silhouette(self, **kwds):
        self.__load_item_element_itm_structure(type_=StructureType(text='Overall Silhouette', vocab_ref=self._COSTUME_CORE_VOCAB_REF), **kwds)

    def _load_item_element_itm_structure_skirt(self, **kwds):
        self.__load_item_element_itm_structure(type_=StructureType(text='Structure Skirt', vocab_ref=self._COSTUME_CORE_VOCAB_REF), **kwds)

    def _load_item_element_itm_structure_sleeves(self, **kwds):
        self.__load_item_element_itm_structure(type_=StructureType(text='Structure Sleeves', vocab_ref=self._COSTUME_CORE_VOCAB_REF), **kwds)

    def _load_item_element_itm_structure_torso(self, **kwds):
        self.__load_item_element_itm_structure(type_=StructureType(text='Structure Torso', vocab_ref=self._COSTUME_CORE_VOCAB_REF), **kwds)

    def _load_item_element_itm_structure_waist(self, **kwds):
        self.__load_item_element_itm_structure(type_=StructureType(text='Structure Waist', vocab_ref=self._COSTUME_CORE_VOCAB_REF), **kwds)

    def _load_item_element_itm_suffix(self, object_builder, text):
        pass # Accession number suffix

    def _load_item_element_itm_technique(self, object_builder, text):
        self.__structure_counts_by_omeka_item_id[object_builder.omeka_item_id] += 1

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
                self._update_vocabulary_used('Item Type Metadata', 'Technique', technique)

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

    def _parse_structure(self, object_builder, text, type_):
        try:
            controlled_vocabulary = COSTUME_CORE_CONTROLLED_VOCABULARIES[type_.text]
        except KeyError:
            controlled_vocabulary = None
            self._logger.warn('unable to find controlled vocabulary for structure type %s', type_.text)

        if controlled_vocabulary is not None:
            if text in controlled_vocabulary:
                self._logger.debug("structure %s from item %d has controlled text '%s'", type_.text, object_builder.omeka_item_id, text)
            elif text.lower() in controlled_vocabulary:
                text = text.lower()
                self._logger.debug("structure %s from item %d has controlled text '%s' after lower-casing", type_.text, object_builder.omeka_item_id, text)
            else:
                self._logger.warn("structure %s from item %d has uncontrolled text '%s'", type_.text, object_builder.omeka_item_id, text)

        self._update_vocabulary_used('Item Type Metadata', type_.text, text)

        return \
            Structure.Builder()\
                .set_text(text)\
                .set_type(type_)\
                .set_vocab_ref(self._COSTUME_CORE_VOCAB_REF)\
                .build()
