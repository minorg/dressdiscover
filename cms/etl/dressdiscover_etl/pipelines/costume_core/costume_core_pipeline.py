from configargparse import ArgParser
from paradicms_etl.pipelines._pipeline import _Pipeline

from dressdiscover_etl.pipelines.costume_core.costume_core_extractor import CostumeCoreExtractor
from dressdiscover_etl.pipelines.costume_core.costume_core_loader import CostumeCoreLoader
from dressdiscover_etl.pipelines.costume_core.costume_core_transformer import CostumeCoreTransformer


class CostumeCorePipeline(_Pipeline):
    ID = "costume_core"

    def __init__(self, *, ontology_version: str, **kwds):
        _Pipeline.__init__(
            self,
            extractor=CostumeCoreExtractor(),
            id=self.ID,
            loader=CostumeCoreLoader(),
            transformer=CostumeCoreTransformer(ontology_version=ontology_version),
            **kwds
        )

    @classmethod
    def add_arguments(cls, arg_parser: ArgParser, **kwds):
        _Pipeline.add_arguments(arg_parser, **kwds)
        arg_parser.add_argument("--ontology-version", required=True)


if __name__ == "__main__":
    CostumeCorePipeline.main()
   