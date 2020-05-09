from paradicms_etl.pipeline._pipeline import _Pipeline

from dressdiscover.cms.etl.pipeline.costume_core.costume_core_extractor import CostumeCoreExtractor
from dressdiscover.cms.etl.pipeline.costume_core.costume_core_loader import CostumeCoreLoader
from dressdiscover.cms.etl.pipeline.costume_core.costume_core_transformer import CostumeCoreTransformer


class CostumeCorePipeline(_Pipeline):
    ID = "costume_core"

    def __init__(self, **kwds):
        _Pipeline.__init__(
            self,
            extractor=CostumeCoreExtractor(),
            id=self.ID,
            loader=CostumeCoreLoader(),
            transformer=CostumeCoreTransformer(),
            **kwds
        )


if __name__ == "__main__":
    CostumeCorePipeline.main()
   