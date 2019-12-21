from typing import Tuple

from rdflib import Graph

from dressdiscover.cms.etl.lib.pipeline._transformer import _Transformer


class TfcTransformer(_Transformer):
    """
    Transformer for Texas Fashion Collection (TFC) XML records.
    """

    def transform(self, record_identifiers: Tuple[str, ...]) -> Graph:
        return Graph()
