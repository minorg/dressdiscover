from costume.etl.omeka.omeka_extractor import OmekaExtractor


class HistoricDressOmekaExtractor(OmekaExtractor):
    def __init__(self, **kwds):
        OmekaExtractor.__init__(
            self,
            endpoint_url='http://historicdress.org/omeka2',
            institution_id='historicdress',
            **kwds
        )

    @classmethod
    def _add_institution_arguments(cls, argument_parser):
        pass
