from abc import ABC, abstractmethod
from io import IOBase
from typing import Optional, Union


class _PipelineStorage(ABC):
    @abstractmethod
    def get(self, key: str) -> Optional[IOBase]:
        """
        Get a file-like object associated with the given key
        """

    @abstractmethod
    def head(self, key: str) -> bool:
        """
        Check if a value is associated with the given key
        """

    @abstractmethod
    def put(self, key: str, value: Union[bytearray, IOBase]) -> None:
        """
        Put a file-like object or value associated with the given key
        """
        pass
