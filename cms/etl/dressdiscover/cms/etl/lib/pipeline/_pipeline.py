from abc import ABC
from argparse import ArgumentParser

from dressdiscover.cms.etl.lib.pipeline._extractor import _Extractor
from dressdiscover.cms.etl.lib.pipeline._transformer import _Transformer


class _Pipeline(ABC):
    def __init__(self, *, extractor: _Extractor, transformer: _Transformer, **kwds):
        self.extractor = extractor
        self.transformer = transformer

    @classmethod
    def add_arguments(cls, argument_parser: ArgumentParser) -> None:
        """
        Add pipeline-specific arguments. The parsed arguments are passed to the constructor as keywords.
        """
