import csv
import logging
from abc import ABC, abstractmethod
from argparse import ArgumentParser
from typing import Dict, Tuple

from style_synonyms.models.classification import Classification


class _Workflow(ABC):
    def __init__(self):
        self._logger = logging.getLogger(self.__class__.__name__)

    @classmethod
    def add_arguments(cls, arg_parser: ArgumentParser):
        pass

    @abstractmethod
    def analyze(self, classifications: Tuple[Classification, ...]):
        pass

    @property
    @abstractmethod
    def id(self) -> int:
        pass
