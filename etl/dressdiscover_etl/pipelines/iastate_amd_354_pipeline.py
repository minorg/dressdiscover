from pathlib import Path

from configargparse import ArgParser
from paradicms_etl._pipeline import _Pipeline
from paradicms_etl.extractors.existing_file_extractor import ExistingFileExtractor
from paradicms_etl.image_archivers.s3_image_archiver import S3ImageArchiver
from paradicms_etl.loaders.gui.gui_loader import GuiLoader
from paradicms_etl.loaders.gui.s3_gui_deployer import S3GuiDeployer

from dressdiscover_etl.transformers.iastate_amd_354_transformer import (
    IastateAmd354Transformer,
)


class IastateAmd354Pipeline(_Pipeline):
    ID = "iastate_amd_354"

    def __init__(self, *, data_dir_path: Path, **kwds):
        _Pipeline.__init__(
            self,
            id=self.ID,
            extractor=ExistingFileExtractor(
                data_dir_path=data_dir_path,
                file_name="AMD 354 Image database.csv",
                pipeline_id=self.ID,
                **kwds,
            ),
            loader=GuiLoader(
                data_dir_path=data_dir_path,
                gui="bootstrap-collection",
                deployer=S3GuiDeployer(
                    s3_bucket_name="iastate-amd354.dressdiscover.org", **kwds
                ),
                image_archiver=S3ImageArchiver(
                    s3_bucket_name="dressdiscover-images", **kwds
                ),
                pipeline_id=self.ID,
                **kwds,
            ),
            transformer=IastateAmd354Transformer(pipeline_id=self.ID, **kwds),
            **kwds,
        )

    @classmethod
    def add_arguments(cls, arg_parser: ArgParser) -> None:
        _Pipeline.add_arguments(arg_parser)
        _Pipeline._add_aws_credentials_arguments(arg_parser)


if __name__ == "__main__":
    IastateAmd354Pipeline.main()
