from paradicms.etl.lib.pipeline._pipeline import _Pipeline
from paradicms.etl.lib.pipeline.file_loader import FileLoader

from dressdiscover.cms.etl.lib.pipeline.costume_core.costume_core_extractor import CostumeCoreExtractor
from dressdiscover.cms.etl.lib.pipeline.costume_core.costume_core_transformer import CostumeCoreTransformer


class CostumeCorePipeline(_Pipeline):
    __ID = "costume_core"

    def __init__(self, **kwds):
        _Pipeline.__init__(
            self,
            extractor=CostumeCoreExtractor(),
            id=self.__ID,
            loader=FileLoader(pipeline_id=self.__ID),
            transformer=CostumeCoreTransformer(),
            **kwds
        )
