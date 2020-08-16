from configargparse import ArgParser
from paradicms_etl._pipeline import _Pipeline
from paradicms_etl.extractors.nop_extractor import NopExtractor
from paradicms_etl.loaders.json_directory_loader import JsonDirectoryLoader
from paradicms_etl.transformers.nop_transformer import NopTransformer

from dressdiscover_etl.path import DATA_DIR_PATH
from dressdiscover_etl.pipelines.vccc.vccc_pipeline import VcccPipeline


class DressdiscoverPipeline(_Pipeline):
    __ID = "dressdiscover"

    def __init__(self, vccc_omeka_api_key: str, **kwds):
        _Pipeline.__init__(
            self,
            extractor=NopExtractor(pipeline_id=self.__ID, **kwds),
            id=self.__ID,
            loader=JsonDirectoryLoader(
                clean=True,
                pipeline_id=self.__ID,
                strategy=JsonDirectoryLoader.Strategy.FILE_PER_MODEL_TYPE,
            ),
            transformer=NopTransformer(pipeline_id=self.__ID, **kwds),
        )
        self.__pipelines = (
            VcccPipeline(loader=self.loader, omeka_api_key=vccc_omeka_api_key, **kwds),
        )

    @classmethod
    def add_arguments(cls, arg_parser: ArgParser):
        _Pipeline.add_arguments(arg_parser, data_dir_path_default=str(DATA_DIR_PATH))
        arg_parser.add_argument("--vccc-omeka-api-key", required=True)

    def extract_transform_load(self, **kwds):
        for pipeline in self.__pipelines:
            pipeline.extract_transform_load(**kwds)


if __name__ == "__main__":
    DressdiscoverPipeline.main()
