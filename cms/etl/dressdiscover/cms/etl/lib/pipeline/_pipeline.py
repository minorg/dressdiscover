from abc import ABC
from argparse import ArgumentParser

from dressdiscover.cms.etl.lib.pipeline._extractor import _Extractor
from dressdiscover.cms.etl.lib.pipeline._transformer import _Transformer


class _Pipeline(ABC):
    def __init__(self, *, extractor: _Extractor, id: str, transformer: _Transformer, **kwds):
        """
        Construct an extract-transform pipeline.
        :param extractor: extractor implementation
        :param id: unique identifier for this pipeline instance, may be adapted from arguments
        :param transformer: transformer implementation
        """
        self.extractor = extractor
        self.id = id
        self.transformer = transformer

    @classmethod
    def add_arguments(cls, argument_parser: ArgumentParser) -> None:
        """
        Add pipeline-specific arguments. The parsed arguments are passed to the constructor as keywords.
        """
