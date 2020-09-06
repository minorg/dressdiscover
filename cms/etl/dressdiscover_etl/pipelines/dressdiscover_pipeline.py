from configargparse import ArgParser
from paradicms_etl._pipeline import _Pipeline
from paradicms_etl.extractors.nop_extractor import NopExtractor
from paradicms_etl.loaders.gui_loader import GuiLoader
from paradicms_etl.transformers.nop_transformer import NopTransformer

from dressdiscover_etl.pipelines.costume_core_airtable_pipeline import (
    CostumeCoreAirtablePipeline,
)
from dressdiscover_etl.pipelines.vccc_pipeline import VcccPipeline


class DressdiscoverPipeline(_Pipeline):
    __ID = "dressdiscover"

    def __init__(
        self,
        costume_core_template_airtable_api_key: str,
        vccc_omeka_api_key: str,
        **kwds
    ):
        _Pipeline.__init__(
            self,
            extractor=NopExtractor(pipeline_id=self.__ID, **kwds),
            id=self.__ID,
            loader=GuiLoader(pipeline_id=self.__ID, **kwds),
            transformer=NopTransformer(pipeline_id=self.__ID, **kwds),
        )
        self.__pipelines = (
            CostumeCoreAirtablePipeline(
                api_key=costume_core_template_airtable_api_key,
                base_id="appgU92SdGTwPIVNg",
                collection_title="Costume Core Template Airtable",
                collection_uri="https://airtable.com/tblUeStXG6w5MMGlF",
                pipeline_id="costume-core-template-airtable",
                institution_name="Costume Core",
                institution_uri="http://www.ardenkirkland.com/costumecore/version-0-4/",
                institution_rights="Copyright Arden Kirkland. All rights reserved.",
                loader=self.loader,
                **kwds
            ),
            VcccPipeline(loader=self.loader, omeka_api_key=vccc_omeka_api_key, **kwds),
        )

    @classmethod
    def add_arguments(cls, arg_parser: ArgParser):
        _Pipeline.add_arguments(arg_parser)
        arg_parser.add_argument(
            "--costume-core-template-airtable-api-key", required=True
        )
        arg_parser.add_argument("--vccc-omeka-api-key", required=True)

    def extract_transform_load(self, **kwds):
        for pipeline in self.__pipelines:
            self.loader.load(models=pipeline.extract_transform(**kwds))
        self.loader.flush()


if __name__ == "__main__":
    DressdiscoverPipeline.main()
