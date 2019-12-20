import logging
from abc import ABC, abstractmethod

from rdflib import Graph


class _Transformer(ABC):
    def __init__(self):
        self._logger = logging.getLogger(self.__class__.__name__)

    @abstractmethod
    def transform(self, **kwds) -> Graph:
        """
        Transform previously-extracted data.
        :param kwds: merged dictionary of initial extract kwds and the result of extract
        :return: Graph containing models
        """
