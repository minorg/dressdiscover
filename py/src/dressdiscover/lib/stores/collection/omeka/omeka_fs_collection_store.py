import json
from os.path import os

from org.dressdiscover.api.services.collection import NoSuchCollectionException
from org.dressdiscover.lib.python import PythonApi

from dressdiscover.lib.stores._fs_store import _FsStore
from dressdiscover.lib.stores.collection.omeka._omeka_collection_store import _OmekaCollectionStore
from dressdiscover.lib.stores.collection.py_collection_store_factory import PyCollectionStoreFactory
from yomeka.client.omeka_json_parser import OmekaJsonParser


class OmekaFsCollectionStore(_OmekaCollectionStore, _FsStore):
    TYPE_STRING = 'omekafs'

    def __init__(self, *args, **kwds):
        _OmekaCollectionStore.__init__(self, *args, **kwds)
        _FsStore.__init__(self, **kwds)

    def _get_collection_by_id(self, collectionId, logger, logMarker):
        collection_entries = self.getCollectionsByInstitutionId(collectionId.institutionId, logger, logMarker)
        for collection_entry in collection_entries:
            if collection_entry.id == collectionId:
                return collection_entry.model
        raise NoSuchCollectionException.create(collectionId)

    def _get_collections_by_institution_id(self, institutionId, logger, logMarker):
        file_path = os.path.join(self._data_dir_path, str(institutionId), 'collections.json')
        with open(file_path) as f:
            return \
                self._map_omeka_collections(
                    institution_id=institutionId,
                    omeka_collections=OmekaJsonParser().parse_collection_dicts(json.loads(f.read()))
                )

if PythonApi.getInstance() is not None:
    PythonApi.getInstance().getCollectionStoreFactoryRegistry().registerCollectionStoreFactory(PyCollectionStoreFactory(OmekaFsCollectionStore), OmekaFsCollectionStore.TYPE_STRING)
