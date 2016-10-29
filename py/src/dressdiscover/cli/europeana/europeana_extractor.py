from dressdiscover.cli.oai_pmh._oai_pmh_extractor import _OaiPmhExtractor


class EuropeanaExtractor(_OaiPmhExtractor):
    def __init__(self, **kwds):
        _OaiPmhExtractor.__init__(
            self,
            endpoint_url='http://oai.europeana.eu/oaicat/OAIHandler',
            institution_id='europeana',
            metadata_prefix='edm',
            set_='2048208_Ag_EU_EuropeanaFashion_1015',
            **kwds
        )
