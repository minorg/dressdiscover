from net.lab1318.costume.api.models.color import ColorType

from costume.lib.stores.object.costume_core.costume_core_omeka_item_to_object_mapper import CostumeCoreOmekaItemToObjectMapper


class VcccOmekaItemToObjectMapper(CostumeCoreOmekaItemToObjectMapper):
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
