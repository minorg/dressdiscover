from costume.etl.omeka.omeka_loader import OmekaLoader


class VcccOmekaLoader(OmekaLoader):
    def __init__(self, **kwds):
        OmekaLoader.__init__(
            self,
            endpoint_url='http://vcomeka.com/vccc',
            institution_id='vccc',
            institution_title="Vassar College Costume Collection",
            institution_url="http://vcomeka.com/vccc/",
            **kwds
        )

    @classmethod
    def _add_institution_arguments(cls, argument_parser):
        pass

    def _load_item_element_itm_csv_file(self, object_builder, text):
        pass

    def _load_item_element_itm_donor_class_year(self, object_builder, text):
        pass

    def _load_item_element_itm_interviewee(self, object_builder, text):
        pass

    def _load_item_element_itm_interviewer(self, object_builder, text):
        pass

    def _load_item_element_itm_transcription(self, object_builder, text):
        # Interview transcriptions
        pass