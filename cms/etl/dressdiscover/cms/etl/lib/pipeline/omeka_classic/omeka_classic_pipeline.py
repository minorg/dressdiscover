from dressdiscover.cms.etl.lib.pipeline._pipeline import _Pipeline
from .omeka_classic_extractor import OmekaClassicExtractor
from .omeka_classic_transformer import OmekaClassicTransformer


class OmekaClassicPipeline(_Pipeline):
    def __init__(self, *, api_key: str, endpoint_url: str, **kwds):
        _Pipeline.__init__(
            self,
            extractor=OmekaClassicExtractor(api_key=api_key, endpoint_url=endpoint_url, **kwds),
            transformer=OmekaClassicTransformer(**kwds)
        )

    @classmethod
    def add_arguments(cls, argument_parser):
        argument_parser.add_argument('--api-key', required=True)
        argument_parser.add_argument("--endpoint-url", required=True)
        # argument_parser.add_argument("--institution-base-uri", required=True)
