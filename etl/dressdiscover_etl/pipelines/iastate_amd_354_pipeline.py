from typing import Optional

from paradicms_etl._loader import _Loader
from paradicms_etl._pipeline import _Pipeline
from paradicms_etl.extractors.existing_file_extractor import ExistingFileExtractor
from paradicms_etl.loaders.nop_loader import NopLoader

from dressdiscover_etl.transformers.iastate_amd_354_transformer import (
    IastateAmd354Transformer,
)


class IastateAmd354Pipeline(_Pipeline):
    ID = "iastate_amd_354"

    def __init__(self, loader: Optional[_Loader] = None, **kwds):
        _Pipeline.__init__(
            self,
            id=self.ID,
            extractor=ExistingFileExtractor(
                file_name="AMD 354 Image database.csv", pipeline_id=self.ID, **kwds
            ),
            loader=loader if loader else NopLoader(pipeline_id=self.ID, **kwds),
            transformer=IastateAmd354Transformer(pipeline_id=self.ID, **kwds),
            **kwds
        )


if __name__ == "__main__":
    IastateAmd354Pipeline.main()
