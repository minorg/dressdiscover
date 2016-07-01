from dressdiscover.etl.oai_pmh._oai_pmh_extractor import _OaiPmhExtractor


class TxfcExtractor(_OaiPmhExtractor):
    def __init__(self, **kwds):
        _OaiPmhExtractor.__init__(
            self,
            endpoint_url='http://digital.library.unt.edu/explore/collections/TXFC/oai/',
            institution_id='untvca',
            metadata_prefix='untl',
            **kwds
        )
