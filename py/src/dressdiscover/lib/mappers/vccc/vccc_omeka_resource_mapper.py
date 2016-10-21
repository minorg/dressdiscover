from org.dressdiscover.api.models.color import ColorType

from dressdiscover.lib.mappers.omeka.costume_core_omeka_resource_mapper import CostumeCoreOmekaResourceMapper


class VcccOmekaResourceMapper(CostumeCoreOmekaResourceMapper):
    def _map_omeka_item_element_itm_color_main(self, **kwds):
        self._map_omeka_item_element_itm_color(type_=ColorType.PRIMARY, **kwds)

    def _map_omeka_item_element_itm_color_secondary(self, **kwds):
        self._map_omeka_item_element_itm_color(type_=ColorType.SECONDARY, **kwds)

    def _map_omeka_item_element_itm_csv_file(self, object_builder, text):
        pass

    def _map_omeka_item_element_itm_donor_class_year(self, object_builder, text):
        pass

    def _map_omeka_item_element_itm_interviewee(self, object_builder, text):
        pass

    def _map_omeka_item_element_itm_interviewer(self, object_builder, text):
        pass

    def _map_omeka_item_element_itm_transcription(self, object_builder, text):
        # Interview transcriptions
        pass
