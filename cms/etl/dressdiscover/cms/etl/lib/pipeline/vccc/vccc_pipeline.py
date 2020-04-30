from paradicms.etl.lib.pipeline._pipeline import _Pipeline
from paradicms.etl.lib.pipeline.omeka_classic.omeka_classic_extractor import OmekaClassicExtractor

from dressdiscover.cms.etl.lib.path import DATA_DIR_PATH
from dressdiscover.cms.etl.lib.pipeline.vccc.vccc_transformer import VccTransformer


class VcccPipeline(_Pipeline):
    def __init__(self, *, api_key: str, **kwds):
        _Pipeline.__init__(
            self,
            extractor=OmekaClassicExtractor(
                api_key=api_key,
                endpoint_url="https://vcomeka.com/vccc/",
            ),
            id="vccc",
            transformer=VccTransformer(),
            **kwds
        )

    @classmethod
    def add_arguments(cls, arg_parser):
        _Pipeline.add_arguments(arg_parser, data_dir_path_default=str(DATA_DIR_PATH))
        arg_parser.add_argument('--api-key', help="Omeka API key", required=True)


if __name__ == "__main__":
    VcccPipeline.main()
