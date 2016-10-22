import json
from os.path import os

from org.dressdiscover.api.services.collection import NoSuchCollectionException
from org.dressdiscover.lib.python import PythonApi

from dressdiscover.lib.stores._fs_store import _FsStore
from dressdiscover.lib.services.collection._omeka_collection_query_service import _OmekaCollectionStore
from dressdiscover.lib.stores.collection.py_collection_store_factory import PyCollectionStoreFactory
from yomeka.client.omeka_json_parser import OmekaJsonParser


class OmekaFsCollectionQueryService(_OmekaCollectionStore, _FsStore):
    URI_SCHEME = 'omekafs'

    def __init__(self, *args, **kwds):
        _OmekaCollectionStore.__init__(self, *args, **kwds)
        _FsStore.__init__(self, uri=self._uri)

    def getCollectionById(self, collectionId, logger, logMarker):
        collection_entries = self.getCollectionsByInstitutionId(collectionId.institutionId, logger, logMarker)
        for collection_entry in collection_entries:
            if collection_entry.id == collectionId:
                return collection_entry.model
        raise NoSuchCollectionException(collectionId)

    def getCollectionsByInstitutionId(self, institutionId, logger, logMarker):
        file_path = os.path.join(self._data_dir_path, str(institutionId), 'collections.json')
        with open(file_path) as f:
            return \
                self._map_omeka_collections(
                    institution_id=institutionId,
                    omeka_collections=OmekaJsonParser().parse_collection_dicts(json.loads(f.read()))
                )

PythonApi.getInstance().getCollectionStoreFactoryRegistry().registerCollectionStoreFactory(PyCollectionStoreFactory(OmekaFsCollectionStore), OmekaFsCollectionStore.URI_SCHEME)
