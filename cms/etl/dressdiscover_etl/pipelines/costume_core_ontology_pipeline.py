from configargparse import ArgParser
from paradicms_etl._pipeline import _Pipeline
from paradicms_etl.extractors.airtable_extractor import AirtableExtractor
from paradicms_etl.loaders.composite_loader import CompositeLoader
from paradicms_etl.loaders.rdf_file_loader import RdfFileLoader

from dressdiscover_etl.loaders.costume_core_ontology_py_loader import (
    CostumeCoreOntologyPyLoader,
)
from dressdiscover_etl.loaders.costume_core_ontology_rdf_file_loader import (
    CostumeCoreOntologyRdfFileLoader,
)
from dressdiscover_etl.transformers.costume_core_ontology_transformer import (
    CostumeCoreOntologyTransformer,
)


class CostumeCoreOntologyPipeline(_Pipeline):
    ID = "costume_core_ontology"

    def __init__(self, *, airtable_api_key: str, ontology_version: str, **kwds):
        _Pipeline.__init__(
            self,
            extractor=AirtableExtractor(
                api_key=airtable_api_key,
                base_id="appfEYYWWn3CqSAxW",
                tables=(
                    "feature_values",
                    "features",
                    "feature_sets",
                    "rights_licenses",
                ),
                pipeline_id=self.ID,
                **kwds
            ),
            id=self.ID,
            loader=CompositeLoader(
                pipeline_id=self.ID,
                loaders=(
                    CostumeCoreOntologyPyLoader(pipeline_id=self.ID, **kwds),
                    CostumeCoreOntologyRdfFileLoader(
                        format="ttl", pipeline_id=self.ID, **kwds
                    ),
                    CostumeCoreOntologyRdfFileLoader(
                        format="xml", pipeline_id=self.ID, **kwds
                    ),
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
        arg_parser.add_argument("--airtable-api-key", required=True)
        arg_parser.add_argument("--ontology-version", required=True)


if __name__ == "__main__":
    CostumeCoreOntologyPipeline.main()
