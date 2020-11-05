from paradicms_etl._pipeline import _Pipeline
from paradicms_etl.extractors.existing_file_extractor import ExistingFileExtractor
from paradicms_etl.extractors.omeka_classic_extractor import OmekaClassicExtractor

from dressdiscover_etl.transformers.penn_museum_transformer import PennMuseumTransformer
from dressdiscover_etl.transformers.vccc_transformer import VcccTransformer


class PennMuseumPipeline(_Pipeline):
    __ID = "penn_museum"

    def __init__(self, **kwds):
        _Pipeline.__init__(
            self,
            extractor=ExistingFileExtractor(
                file_name="all.csv", pipeline_id=self.__ID, **kwds
            ),
            id=self.__ID,
            transformer=PennMuseumTransformer(pipeline_id=self.__ID, **kwds),
            **kwds
        )


if __name__ == "__main__":
    PennMuseumPipeline.main()
