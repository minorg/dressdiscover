from typing import Optional

from paradicms_etl._loader import _Loader
from paradicms_etl._pipeline import _Pipeline
from paradicms_etl.loaders.composite_loader import CompositeLoader
from paradicms_etl.loaders.default_loader import DefaultLoader

from dressdiscover_etl.extractors.costume_core_airtable_extractor import (
    CostumeCoreAirtableExtractor,
)
from dressdiscover_etl.loaders.costume_core_property_extractor_csv_file_loader import (
    CostumeCorePropertyExtractorCsvFileLoader,
)
from dressdiscover_etl.transformers.costume_core_airtable_transformer import (
    CostumeCoreAirtableTransformer,
)


class CostumeCoreTemplateAirtablePipeline(_Pipeline):
    __BASE_ID = "appgU92SdGTwPIVNg"
    __ID = "costume-core-template-airtable"

    def __init__(self, api_key: str, loader: Optional[_Loader] = None, **kwds):
        if loader is None:
            loader = CompositeLoader(
                loaders=(
                    CostumeCorePropertyExtractorCsvFileLoader(
                        pipeline_id=self.__ID, **kwds
                    ),
                    DefaultLoader(pipeline_id=self.__ID, **kwds),
                ),
                pipeline_id=self.__ID,
                **kwds
            )

        _Pipeline.__init__(
            self,
            extractor=CostumeCoreAirtableExtractor(
                api_key=api_key, base_id=self.__BASE_ID, pipeline_id=self.__ID, **kwds
            ),
            id=self.__ID,
            loader=loader,
            transformer=CostumeCoreAirtableTransformer(
                base_id=self.__BASE_ID,
                collection_title="Costume Core Template Airtable",
                collection_uri="https://airtable.com/" + self.__BASE_ID,
                institution_name="Costume Core Template",
                institution_uri="http://www.ardenkirkland.com/costumecore/",
                institution_rights="Copyright Arden Kirkland. All rights reserved.",
                pipeline_id=self.__ID,
                **kwds
            ),
            **kwds
        )

    @classmethod
    def add_arguments(cls, arg_parser):
        _Pipeline.add_arguments(arg_parser)
        arg_parser.add_argument("--api-key", required=True)


if __name__ == "__main__":
    CostumeCoreTemplateAirtablePipeline.main()
