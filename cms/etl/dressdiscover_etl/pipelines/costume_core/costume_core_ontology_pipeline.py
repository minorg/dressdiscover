from configargparse import ArgParser
from paradicms_etl._pipeline import _Pipeline
from paradicms_etl.loaders.composite_loader import CompositeLoader
from paradicms_etl.loaders.rdf_file_loader import RdfFileLoader

from dressdiscover_etl.pipelines.costume_core.costume_core_ontology_csv_extractor import (
    CostumeCoreOntologyCsvExtractor,
)
from dressdiscover_etl.pipelines.costume_core.costume_core_ontology_py_loader import (
    CostumeCoreOntologyPyLoader,
)
from dressdiscover_etl.pipelines.costume_core.costume_core_ontology_transformer import (
    CostumeCoreOntologyTransformer,
)
from dressdiscover_etl.path import DATA_DIR_PATH


class CostumeCoreOntologyPipeline(_Pipeline):
    ID = "costume_core_ontology"

    def __init__(self, *, ontology_version: str, **kwds):
        _Pipeline.__init__(
            self,
            extractor=CostumeCoreOntologyCsvExtractor(pipeline_id=self.ID, **kwds),
            id=self.ID,
            loader=CompositeLoader(
                pipeline_id=self.ID,
                loaders=(
                    CostumeCoreOntologyPyLoader(pipeline_id=self.ID, **kwds),
                    RdfFileLoader(format="ttl", pipeline_id=self.ID, **kwds),
                    RdfFileLoader(format="xml", pipeline_id=self.ID, **kwds),
                ),
            ),
            transformer=CostumeCoreOntologyTransformer(
                ontology_version=ontology_version, pipeline_id=self.ID, **kwds
            ),
            **kwds
        )

    @classmethod
    def add_arguments(cls, arg_parser: ArgParser):
        _Pipeline.add_arguments(arg_parser)
        arg_parser.add_argument("--ontology-version", required=True)


if __name__ == "__main__":
    CostumeCoreOntologyPipeline.main()
