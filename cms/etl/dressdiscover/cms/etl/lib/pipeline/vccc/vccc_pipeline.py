from paradicms.etl.lib.pipeline._pipeline import _Pipeline
from paradicms.etl.lib.pipeline.omeka_classic.omeka_classic_extractor import OmekaClassicExtractor

from dressdiscover.cms.etl.lib.path import DATA_DIR_PATH
from dressdiscover.cms.etl.lib.pipeline.vccc.costume_core_omeka_classic_transformer import \
    CostumeCoreOmekaClassicTransformer


class VcccPipeline(_Pipeline):
    def __init__(self, *, api_key: str, **kwds):
        _Pipeline.__init__(
            self,
            extractor=OmekaClassicExtractor(
                api_key=api_key,
                endpoint_url="https://vcomeka.com/vccc/",
            ),
            id="vccc",
            transformer=CostumeCoreOmekaClassicTransformer(
                institution_kwds={
                    "institution_name": "Vassar College Costume Collection",
                    "institution_rights": "Copyright Vassar College. All rights reserved.",
                    "institution_uri": "https://vcomeka.com/vccc/",
                },
                square_thumbnail_height_px=75,
                square_thumbnail_width_px=75,
            ),
            **kwds
        )

    @classmethod
    def add_arguments(cls, arg_parser):
        _Pipeline.add_arguments(arg_parser, data_dir_path_default=str(DATA_DIR_PATH))
        arg_parser.add_argument('--api-key', help="Omeka API key", required=True)


if __name__ == "__main__":
    VcccPipeline.main()
