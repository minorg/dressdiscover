from dressdiscover.cms.etl.lib.pipeline._pipeline import _Pipeline
from .omeka_classic_extractor import OmekaClassicExtractor
from .omeka_classic_transformer import OmekaClassicTransformer


class OmekaClassicPipeline(_Pipeline):
    def __init__(
            self, *,
            api_key: str,
            endpoint_url: str,
            institution_name: str,
            institution_uri: str,
            pipeline_id: str,
            **kwds
    ):
        _Pipeline.__init__(
            self,
            extractor=OmekaClassicExtractor(api_key=api_key, endpoint_url=endpoint_url),
            id=pipeline_id,
            transformer=OmekaClassicTransformer(institution_name=institution_name, institution_uri=institution_uri),
            **kwds
        )

    @classmethod
    def add_arguments(cls, argument_parser):
        argument_parser.add_argument('--api-key', help="Omeka API key", required=True)
        argument_parser.add_argument("--endpoint-url", help="Omeka API endpoint URL", required=True)
        argument_parser.add_argument("--institution-name", required=True)
        argument_parser.add_argument("--institution-uri", required=True)
        argument_parser.add_argument(
            '--pipeline-id',
            help='unique identifier for this pipeline, used to isolate its cache',
            required=True
        )
