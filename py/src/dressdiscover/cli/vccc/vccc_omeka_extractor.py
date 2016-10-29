from dressdiscover.cli.omeka.omeka_extractor import OmekaExtractor


class VcccOmekaExtractor(OmekaExtractor):
    def __init__(self, **kwds):
        OmekaExtractor.__init__(
            self,
            endpoint_url='http://vcomeka.com/vccc',
            institution_id='vccc',
            **kwds
        )

    @classmethod
    def _add_institution_arguments(cls, argument_parser):
        pass
