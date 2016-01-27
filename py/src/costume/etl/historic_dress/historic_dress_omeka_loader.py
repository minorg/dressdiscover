from datetime import datetime

import pytz

from costume.api.models.agent.agent import Agent
from costume.api.models.agent.agent_name import AgentName
from costume.api.models.agent.agent_name_type import AgentNameType
from costume.api.models.agent.agent_role import AgentRole
from costume.api.models.color.color_type import ColorType
from costume.api.models.cultural_context.cultural_context import CulturalContext
from costume.api.models.date.date import Date
from costume.api.models.date.date_bound import DateBound
from costume.api.models.date.date_time_granularity import DateTimeGranularity
from costume.api.models.date.date_type import DateType
from costume.api.models.description.description import Description
from costume.api.models.description.description_type import DescriptionType
from costume.api.models.inscription.inscription import Inscription
from costume.api.models.inscription.inscription_text import InscriptionText
from costume.api.models.inscription.inscription_text_type import InscriptionTextType
from costume.api.models.material.material import Material
from costume.api.models.material.material_type import MaterialType
from costume.api.models.measurements.measurements import Measurements
from costume.api.models.measurements.measurements_type import MeasurementsType
from costume.api.models.measurements.measurements_unit import MeasurementsUnit
from costume.api.models.structure.structure_type import StructureType
from costume.api.models.vocab import Vocab
from costume.api.models.vocab_ref import VocabRef
from costume.api.models.work_type.work_type import WorkType
from costume.etl.costume_core.costume_core_omeka_loader import CostumeCoreOmekaLoader
from costume.etl.dcmi_types import DCMI_TYPES_BASE_URL


class HistoricDressOmekaLoader(CostumeCoreOmekaLoader):
    class _ObjectBuilder(CostumeCoreOmekaLoader._ObjectBuilder):
        def __init__(self, **kwds):
            CostumeCoreOmekaLoader._ObjectBuilder.__init__(self, **kwds)
            self.earliest_date = None
            self.latest_date = None

        def build(self):
            if self.earliest_date is not None:
                if self.latest_date is not None:
                    self.dates.append(
                        Date.Builder()
                            .set_earliest_date(self.earliest_date)
                            .set_latest_date(self.latest_date)
                            .set_type(DateType.CREATION)
                            .build()
                    )
                else:
                    self._logger.warn("Omeka object %d has an Earliest Date but no Latest Date", self.omeka_item_id)
            elif self.latest_date is not None:
                self._logger.warn("Omeka object %d has a Latest Date but no Earliest Date", self.omeka_item_id)

            return CostumeCoreOmekaLoader._ObjectBuilder.build(self)

    def __init__(self, **kwds):
        CostumeCoreOmekaLoader.__init__(
            self,
            endpoint_url='http://historicdress.org/omeka2',
            institution_id='historicdress',
            institution_title="historicdress.org",
            institution_url="http://historicdress.org",
            **kwds
        )

    @classmethod
    def _add_institution_arguments(cls, argument_parser):
        pass

    def _load_item_element_dc_is_referenced_by(self, **kwds):
        pass

    def _load_item_element_itm_alternative_id(self, **kwds):
        pass

    def _load_item_element_itm_cataloger_name_and_date(self, **kwds):
        pass

    def _load_item_element_itm_csv(self, object_builder, text):
        pass

    def _load_item_element_itm_cultural_context(self, object_builder, text):
        object_builder.cultural_contexts.append(
            CulturalContext.Builder()
                .set_text(text)
                .build()
        )
        self._update_vocabulary_used('Item Type Metadata', 'Culture', text)

    def _load_item_element_itm_earliest_date(self, object_builder, text):
        if object_builder.earliest_date is not None:
            self._logger.warn("item %d has two Earliest Date elements", object_builder.omeka_item_id)
        object_builder.earliest_date = self.__parse_earliest_or_latest_date(object_builder, text)

    def _load_item_element_itm_family_history(self, object_builder, text):
        object_builder.descriptions.append(
            Description.Builder()
                .set_text(text)
                .set_type(DescriptionType.HISTORY)
                .build()
        )

    def _load_item_element_itm_inscription(self, object_builder, text):
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

    def _load_item_element_itm_latest_date(self, object_builder, text):
        if object_builder.latest_date is not None:
            self._logger.warn("item %d has two Latest Date elements", object_builder.omeka_item_id)
        object_builder.latest_date = self.__parse_earliest_or_latest_date(object_builder, text)

    def _load_item_element_itm_length(self, object_builder, text):
        object_builder.measurements.append(
            Measurements.Builder()
                .set_text(text)
                .set_type(MeasurementsType.LENGTH)
                .set_unit(MeasurementsUnit.IN)
                .build()
        )

    def _load_item_element_itm_main_color(self, **kwds):
        self._load_item_element_itm_color(type_=ColorType.PRIMARY, **kwds)

    def _load_item_element_itm_material(self, object_builder, text):
        object_builder.materials.append(
            Material.Builder()
                .set_text(text)
                .set_type(MaterialType.MEDIUM)
                .build()
        )
        self._update_vocabulary_used('Item Type Metadata', 'Material', text)

    def _load_item_element_itm_record_type(self, object_builder, text):
        if text == 'work':
            object_builder.work_types.append(
                WorkType.Builder()
                    .set_text(text)
                    .set_vocab_ref(
                        VocabRef.Builder()
                            .set_refid(text)
                            .set_vocab(Vocab.DCMI_TYPE)
                            .set_uri(DCMI_TYPES_BASE_URL + 'PhysicalObject')
                            .build()
                    )
                    .build()
            )
        else:
            raise NotImplementedError(text)

    def _load_item_element_itm_repository_name(self, **kwds):
        pass

    def _load_item_element_itm_physical_dimensions(self, object_builder, text):
        text_split = text.split('x', 2)

        length_text = text_split[0].strip()
        assert length_text.endswith('inches')
        length_text = length_text.split(' ', 2)[0]
        float(length_text)

        object_builder.measurements.append(
            Measurements.Builder()
                .set_text(length_text)
                .set_type(MeasurementsType.LENGTH)
                .set_unit(MeasurementsUnit.IN)
                .build()
        )

        width_text = text_split[1].strip()
        assert width_text.endswith('inches')
        width_text = width_text.split(' ', 2)[0]
        float(width_text)

        object_builder.measurements.append(
            Measurements.Builder()
                .set_text(width_text)
                .set_type(MeasurementsType.WIDTH)
                .set_unit(MeasurementsUnit.IN)
                .build()
        )

    def _load_item_element_itm_shawl_border_detail(self, object_builder, text):
        object_builder.structures.append(
            self._parse_structure(
                object_builder=object_builder,
                text=text,
                type_=StructureType(text='Shawl Border Detail', vocab_ref=self._COSTUME_CORE_VOCAB_REF)
            )
        )

    def _load_item_element_itm_shawl_border_type(self, object_builder, text):
        object_builder.structures.append(
            self._parse_structure(
                object_builder=object_builder,
                text=text,
                type_=StructureType(text='Shawl Border Type', vocab_ref=self._COSTUME_CORE_VOCAB_REF)
            )
        )

    def _load_item_element_itm_shawl_design_features(self, object_builder, text):
        object_builder.structures.append(
            self._parse_structure(
                object_builder=object_builder,
                text=text,
                type_=StructureType(text='Shawl Design Features', vocab_ref=self._COSTUME_CORE_VOCAB_REF)
            )
        )

    def _load_item_element_itm_shawl_field_detail(self, object_builder, text):
        object_builder.structures.append(
            self._parse_structure(
                object_builder=object_builder,
                text=text,
                type_=StructureType(text='Shawl Field Detail', vocab_ref=self._COSTUME_CORE_VOCAB_REF)
            )
        )

    def _load_item_element_itm_shawl_shape(self, object_builder, text):
        object_builder.structures.append(
            self._parse_structure(
                object_builder=object_builder,
                text=text,
                type_=StructureType(text='Shawl Shape', vocab_ref=self._COSTUME_CORE_VOCAB_REF)
            )
        )

    def _load_item_element_itm_snapdragon_order(self, **kwds):
        pass

    def _load_item_element_itm_snapdragon_work(self, **kwds):
        pass

    def _load_item_element_itm_warp_material(self, object_builder, text):
        object_builder.materials.append(
            Material.Builder()
                .set_text(text)
                .set_type(MaterialType.WARP)
                .build()
        )
        self._update_vocabulary_used('Item Type Metadata', 'Warp Material', text)

    def _load_item_element_itm_weft_material(self, object_builder, text):
        object_builder.materials.append(
            Material.Builder()
                .set_text(text)
                .set_type(MaterialType.WEFT)
                .build()
        )
        self._update_vocabulary_used('Item Type Metadata', 'Weft Material', text)

    def _load_item_element_itm_width(self, object_builder, text):
        object_builder.measurements.append(
            Measurements.Builder()
                .set_text(text)
                .set_type(MeasurementsType.WIDTH)
                .set_unit(MeasurementsUnit.IN)
                .build()
        )

    def _load_item_element_itm_worn_by(self, object_builder, text):
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

    def __parse_earliest_or_latest_date(self, object_builder, text):
        date_bound_builder = DateBound.Builder().set_text(text)

        parsed_date_time = None
        parsed_date_time_granularity = None

        try:
            year = int(text)
            parsed_date_time = datetime(year, 1, 1)
            parsed_date_time_granularity = DateTimeGranularity.YEAR
        except ValueError:
            pass

        if parsed_date_time is None:
            text_split = text.split('-', 2)
            if len(text_split) == 2:
                try:
                    year = int(text_split[0])
                    month = int(text_split[1])
                    parsed_date_time = datetime(year, month, 1)
                    parsed_date_time_granularity = DateTimeGranularity.MONTH
                except ValueError:
                    pass

        if parsed_date_time is None:
            self._logger.warn("unable to parse date '%s' from item %d", text, object_builder.omeka_item_id)
            return date_bound_builder.build()

        parsed_date_time = parsed_date_time.replace(tzinfo=pytz.utc)

        if parsed_date_time.year > datetime.now().year or parsed_date_time.year < 1000:
            self._logger.debug("parsed date time has year out of range: '%s' from '%s'", parsed_date_time, text)
            return

        date_bound_builder.set_parsed_date_time(parsed_date_time)
        date_bound_builder.set_parsed_date_time_granularity(parsed_date_time_granularity)

        return date_bound_builder.build()
