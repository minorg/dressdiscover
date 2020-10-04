from pathlib import Path

from paradicms_etl._pipeline import _Pipeline
from paradicms_etl.extractors.existing_csv_file_extractor import (
    ExistingCsvFileExtractor,
)

from dressdiscover_etl.transformers.schcc_transformer import SchccTransformer


class SchccPipeline(_Pipeline):
    def __init__(self, data_dir_path: Path, **kwds):
        _Pipeline.__init__(
            self,
            extractor=ExistingCsvFileExtractor(
                csv_file_path=data_dir_path
                / "schcc"
                / "extracted"
                / "Smith CostumeCoreToolkit-MappingTemplate2 - Remediated.csv"
            ),
            id="schcc",
            transformer=SchccTransformer(),
            **kwds
        )


if __name__ == "__main__":
    SchccPipeline.main()
