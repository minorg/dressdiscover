from typing import Generator, List, Optional

from configargparse import ArgParser
from paradicms_etl._model import _Model
from paradicms_etl._pipeline import _Pipeline
from paradicms_etl.extractors.nop_extractor import NopExtractor
from paradicms_etl.loaders.gui_loader import GuiLoader
from paradicms_etl.loaders.json_directory_loader import JsonDirectoryLoader
from paradicms_etl.loaders.nop_loader import NopLoader
from paradicms_etl.models.collection import Collection
from paradicms_etl.models.image import Image
from paradicms_etl.models.institution import Institution
from paradicms_etl.models.object import Object
from paradicms_etl.models.property_definition import PropertyDefinition
from paradicms_etl.transformers.nop_transformer import NopTransformer

from dressdiscover_etl.pipelines.costume_core_airtable_pipeline import (
    CostumeCoreAirtablePipeline,
)
from dressdiscover_etl.pipelines.costume_core_ontology_pipeline import (
    CostumeCoreOntologyPipeline,
)
from dressdiscover_etl.pipelines.vccc_pipeline import VcccPipeline


class DressdiscoverPipeline(_Pipeline):
    __ID = "dressdiscover"

    def __init__(
        self,
        costume_core_ontology_airtable_api_key: str,
        costume_core_template_airtable_api_key: str,
        vccc_omeka_api_key: str,
        exclude_pipeline_id: Optional[List[str]] = None,
        include_pipeline_id: Optional[List[str]] = None,
        load_data_only: Optional[bool] = None,
        **kwds,
    ):
        _Pipeline.__init__(
            self,
            extractor=NopExtractor(pipeline_id=self.__ID, **kwds),
            id=self.__ID,
            loader=GuiLoader(
                load_data_only=bool(load_data_only), pipeline_id=self.__ID, **kwds
            ),
            transformer=NopTransformer(pipeline_id=self.__ID, **kwds),
            **kwds,
        )

        pipeline_ids = ["costume_core_ontology", "costume_core_template", "vccc"]
        exclude_pipeline_ids = tuple(exclude_pipeline_id) if exclude_pipeline_id else ()
        include_pipeline_ids = tuple(include_pipeline_id) if include_pipeline_id else ()

        for exclude_pipeline_id in exclude_pipeline_ids:
            if exclude_pipeline_id not in pipeline_ids:
                raise ValueError(f"unknown pipeline: {exclude_pipeline_id}")
        for include_pipeline_id in include_pipeline_ids:
            if include_pipeline_id not in pipeline_ids:
                raise ValueError(f"unknown pipeline: {include_pipeline_id}")

        for exclude_pipeline_id in exclude_pipeline_ids:
            pipeline_ids.remove(exclude_pipeline_id)
        if include_pipeline_ids:
            pipeline_ids = [
                pipeline_id
                for pipeline_id in pipeline_ids
                if pipeline_id in include_pipeline_ids
            ]

        pipelines = []
        for pipeline_id in pipeline_ids:
            if pipeline_id == "costume_core_ontology":
                pipelines.append(
                    CostumeCoreOntologyPipeline(
                        airtable_api_key=costume_core_ontology_airtable_api_key,
                        loader=self.loader,
                        ontology_version="0.0.0",
                        **kwds,
                    )
                )
            elif pipeline_id == "costume_core_template":
                pipelines.append(
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
                        **kwds,
                    )
                )
            elif pipeline_id == "vccc":
                pipelines.append(
                    VcccPipeline(
                        loader=self.loader, omeka_api_key=vccc_omeka_api_key, **kwds
                    )
                )
            else:
                raise NotImplementedError(pipeline_id)
        self.__pipelines = tuple(pipelines)

    @classmethod
    def add_arguments(cls, arg_parser: ArgParser):
        _Pipeline.add_arguments(arg_parser)
        arg_parser.add_argument(
            "--costume-core-ontology-airtable-api-key", required=True
        )
        arg_parser.add_argument(
            "--costume-core-template-airtable-api-key", required=True
        )
        arg_parser.add_argument("--exclude-pipeline-id", action="append")
        arg_parser.add_argument("--include-pipeline-id", action="append")
        arg_parser.add_argument(
            "--load-data-only",
            action="store_true",
            help="only load data, don't generate the GUI",
        )
        arg_parser.add_argument("--vccc-omeka-api-key", required=True)

    def extract_transform_load(self, **kwds):
        excluded_model_class_names = set()

        def filter_models(models: Generator[_Model, None, None]):
            for model in models:
                if isinstance(
                    model, (Collection, Image, Institution, Object, PropertyDefinition)
                ):
                    yield model
                elif model.__class__.__name__ not in excluded_model_class_names:
                    self._logger.info(
                        "filtering out %s model", model.__class__.__name__
                    )
                    excluded_model_class_names.add(model.__class__.__name__)

        for pipeline in self.__pipelines:
            self.loader.load(models=filter_models(pipeline.extract_transform(**kwds)))
        self.loader.flush()


if __name__ == "__main__":
    DressdiscoverPipeline.main()
