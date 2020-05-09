from paradicms_etl.pipeline._pipeline import _Pipeline
from paradicms_etl.pipeline.csv.existing_csv_file_extractor import ExistingCsvFileExtractor

from dressdiscover.cms.etl.path import DATA_DIR_PATH
from dressdiscover.cms.etl.pipeline.schcc.schcc_transformer import SchccTransformer


class SchccPipeline(_Pipeline):
    def __init__(self, **kwds):
        _Pipeline.__init__(
            self,
            extractor=ExistingCsvFileExtractor(
                csv_file_path=DATA_DIR_PATH / "schcc" / "extracted" / "Smith CostumeCoreToolkit-MappingTemplate2 - Remediated.csv"
            ),
            id="schcc",
            transformer=SchccTransformer(),
            **kwds
        )


if __name__ == "__main__":
    SchccPipeline.main()
