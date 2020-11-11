from pathlib import Path

from paradicms_etl._pipeline import _Pipeline
from paradicms_etl.extractors.existing_file_extractor import ExistingFileExtractor

from dressdiscover_etl.transformers.schcc_transformer import SchccTransformer


class SchccPipeline(_Pipeline):
    ID = "schcc"

    def __init__(self, **kwds):
        _Pipeline.__init__(
            self,
            extractor=ExistingFileExtractor(
                file_name="Smith CostumeCoreToolkit-MappingTemplate2 - Remediated.csv",
                pipeline_id=self.ID,
                **kwds
            ),
            id=self.ID,
            transformer=SchccTransformer(pipeline_id=self.ID, **kwds),
            **kwds
        )


if __name__ == "__main__":
    SchccPipeline.main()
