import json

from dressdiscover.cms.etl.lib.pipeline._extractor import _Extractor
from yomeka.client.omeka_rest_api_client import OmekaRestApiClient


class OmekaClassicExtractor(_Extractor):
    def __init__(self, api_key: str, endpoint_url: str, **kwds):
        _Extractor.__init__(self, **kwds)
        self.__client = OmekaRestApiClient(api_key=api_key, endpoint_url=endpoint_url)
        self.__endpoint_url = endpoint_url

    def extract(self, *, force: bool):
        collections_key = self.__endpoint_url + " collections"
        files_key = self.__endpoint_url + " files"
        items_key = self.__endpoint_url + " items"

        if not self._storage.head(collections_key) or force:
            self._storage.put(collections_key, json.dumps(
                [json.loads(collection.json) for collection in self.__client.get_all_collections()]), force=force)
            self._storage.put(files_key,
                              json.dumps([json.loads(file_.json) for file_ in self.__client.get_all_files()]),
                              force=force)
            self._storage.put(items_key, json.dumps([json.loads(item.json) for item in self.__client.get_all_items()]),
                              force=force)

        return {
            "collections": json.loads(self._storage.get(collections_key)),
            "files": json.loads(self._storage.get(files_key)),
            "items": json.loads(self._storage.get(items_key))
        }
