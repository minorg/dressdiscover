from paradicms_etl.pipeline._pipeline import _Pipeline
from paradicms_etl.pipeline.oai_pmh.oai_pmh_extractor import OaiPmhExtractor

from .tfc_transformer import TfcTransformer


class TfcPipeline(_Pipeline):
    """
    Pipeline for the Texas Fashion Collection (TFC)
    """

    def __init__(self, **kwds):
        _Pipeline.__init__(
            self,
            extractor=OaiPmhExtractor(
                endpoint_url="http://digital.library.unt.edu/explore/collections/TXFC/oai/",
                metadata_prefix="untl"
            ),
            id="tfc",
            transformer=TfcTransformer()
        )


if __name__ == "__main__":
    TfcPipeline.main()
