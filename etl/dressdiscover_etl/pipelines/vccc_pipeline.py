from paradicms_etl._pipeline import _Pipeline
from paradicms_etl.extractors.omeka_classic_extractor import OmekaClassicExtractor

from dressdiscover_etl.transformers.vccc_transformer import VcccTransformer


class VcccPipeline(_Pipeline):
    __ID = "vccc"

    def __init__(self, *, omeka_api_key: str, **kwds):
        _Pipeline.__init__(
            self,
            extractor=OmekaClassicExtractor(
                api_key=omeka_api_key,
                endpoint_url="https://vcomeka.com/vccc/",
                pipeline_id=self.__ID,
                **kwds
            ),
            id=self.__ID,
            transformer=VcccTransformer(pipeline_id=self.__ID, **kwds),
            **kwds
        )

    @classmethod
    def add_arguments(cls, arg_parser):
        _Pipeline.add_arguments(arg_parser)
        arg_parser.add_argument("--omeka-api-key", help="Omeka API key", required=True)


if __name__ == "__main__":
    VcccPipeline.main()
