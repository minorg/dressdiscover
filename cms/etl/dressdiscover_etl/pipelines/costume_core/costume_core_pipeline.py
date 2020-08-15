from configargparse import ArgParser
from paradicms_etl._pipeline import _Pipeline

from dressdiscover_etl.pipelines.costume_core.costume_core_extractor import CostumeCoreExtractor
from dressdiscover_etl.pipelines.costume_core.costume_core_loader import CostumeCoreLoader
from dressdiscover_etl.pipelines.costume_core.costume_core_transformer import CostumeCoreTransformer
from dressdiscover_etl.path import DATA_DIR_PATH


class CostumeCorePipeline(_Pipeline):
    ID = "costume_core"

    def __init__(self, *, ontology_version: str, **kwds):
        _Pipeline.__init__(
            self,
            extractor=CostumeCoreExtractor(data_dir_path=DATA_DIR_PATH, pipeline_id=self.ID),
            id=self.ID,
            loader=CostumeCoreLoader(data_dir_path=DATA_DIR_PATH, pipeline_id=self.ID),
            transformer=CostumeCoreTransformer(data_dir_path=DATA_DIR_PATH, ontology_version=ontology_version, pipeline_id=self.ID),
            **kwds
        )

    @classmethod
    def add_arguments(cls, arg_parser: ArgParser, **kwds):
        _Pipeline.add_arguments(arg_parser, **kwds)
        arg_parser.add_argument("--ontology-version", required=True)


if __name__ == "__main__":
    CostumeCorePipeline.main()
