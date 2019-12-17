from dressdiscover.cms.etl.lib.pipeline._extractor import _Extractor


class OmekaClassicExtractor(_Extractor):
    def __init__(self, api_key: str, endpoint_url: str, **kwds):
        self.__api_key = api_key
        self.__endpoint_url = endpoint_url

    def extract(self, *, force: bool):
        pass
