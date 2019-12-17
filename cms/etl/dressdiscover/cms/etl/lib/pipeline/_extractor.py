from abc import ABC, abstractmethod
from typing import Dict, Optional
from urllib.request import urlopen

from dressdiscover.cms.etl.lib.pipeline._pipeline_storage import _PipelineStorage


class _Extractor(ABC):
    def __init__(self, storage: _PipelineStorage, **kwds):
        self._storage = storage

    def _download(self, from_url: str, force: bool = False) -> None:
        """
        Utility method to download a file from a URL to a local file path.
        """
        if not force and self._storage.head(from_url):
            self._logger.info(
                "%s already download and force not specified, skipping download",
                from_url)
            return

        self._logger.info("downloading %s to %s", from_url)
        f = urlopen(from_url)
        self._storage.put(from_url, f)
        self._logger.info("downloaded %s", from_url)

    @abstractmethod
    def extract(self, *, force: bool) -> Optional[Dict[str, object]]:
        """
        Extract data from a source.
        :param force: force extraction, ignoring any cached data
        :return a **kwds dictionary to merge with kwds to pass to transformer
        """
