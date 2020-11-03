from pathlib import Path
from typing import Generator, Optional

from configargparse import ArgParser
from paradicms_etl._model import _Model
from paradicms_etl.image_archivers.s3_image_archiver import S3ImageArchiver
from paradicms_etl.loaders.gui.gui_data_loader import GuiDataLoader
from paradicms_etl.loaders.gui.gui_loader import GuiLoader
from paradicms_etl.loaders.gui.s3_gui_deployer import S3GuiDeployer
from paradicms_etl.models.collection import Collection
from paradicms_etl.models.image import Image
from paradicms_etl.models.institution import Institution
from paradicms_etl.models.object import Object
from paradicms_etl.models.property_definition import PropertyDefinition
from paradicms_etl.pipelines._composite_pipeline import _CompositePipeline

from dressdiscover_etl.pipelines.schcc_pipeline import SchccPipeline
from dressdiscover_etl.pipelines.uc_daap_vac_pipeline import UcDaapVacPipeline
from dressdiscover_etl.pipelines.vccc_pipeline import VcccPipeline


class UnionPipeline(_CompositePipeline):
    __ID = "union"

    def __init__(
        self,
        # costume_core_ontology_airtable_api_key: str,
        # costume_core_template_airtable_api_key: str,
        data_dir_path: Path,
        vccc_omeka_api_key: str,
        load_data_only: Optional[bool] = None,
        **kwds,
    ):
        if load_data_only:
            loader = GuiDataLoader(
                loaded_data_dir_path=data_dir_path / self.__ID / "loaded" / "data",
                pipeline_id=self.__ID,
                **kwds,
            )
        else:
            loader = GuiLoader(
                data_dir_path=data_dir_path,
                gui="union",
                deployer=S3GuiDeployer(
                    s3_bucket_name="union.dressdiscover.org", **kwds
                ),
                image_archiver=S3ImageArchiver(
                    s3_bucket_name="dressdiscover-images", **kwds
                ),
                sleep_s_after_image_download=0.5,
                pipeline_id=self.__ID,
                **kwds,
            )

        _CompositePipeline.__init__(
            self,
            id=self.__ID,
            loader=loader,
            pipelines=(
                # CostumeCoreOntologyPipeline(
                #     airtable_api_key=costume_core_ontology_airtable_api_key,
                #     data_dir_path=data_dir_path,
                #     loader=loader,
                #     ontology_version="0.0.0",
                #     **kwds,
                # ),
                # CostumeCoreTemplateAirtablePipeline(
                #     api_key=costume_core_template_airtable_api_key,
                #     loader=loader,
                #     **kwds,
                # ),
                SchccPipeline(data_dir_path=data_dir_path, loader=loader, **kwds),
                UcDaapVacPipeline(data_dir_path=data_dir_path, loader=loader, **kwds),
                VcccPipeline(
                    data_dir_path=data_dir_path,
                    loader=loader,
                    omeka_api_key=vccc_omeka_api_key,
                    **kwds,
                ),
            ),
            **kwds,
        )

    @classmethod
    def add_arguments(cls, arg_parser: ArgParser):
        _CompositePipeline.add_arguments(arg_parser)
        _CompositePipeline._add_aws_credentials_arguments(arg_parser)
        # arg_parser.add_argument(
        #     "--costume-core-ontology-airtable-api-key", required=True
        # )
        # arg_parser.add_argument(
        #     "--costume-core-template-airtable-api-key", required=True
        # )
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

        for pipeline in self._pipelines:
            self.loader.load(models=filter_models(pipeline.extract_transform(**kwds)))
        self.loader.flush()


if __name__ == "__main__":
    UnionPipeline.main()
