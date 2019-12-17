from abc import ABC, abstractmethod
from typing import Generator

from dressdiscover.cms.etl.lib.model._model import _Model


class _Transformer(ABC):
    @abstractmethod
    def transform(self, **kwds) -> Generator[_Model, None, None]:
        """
        Transform previously-extracted data.
        :param kwds: merged dictionary of initial extract kwds and the result of extract
        :return generator of transformed models
        """
