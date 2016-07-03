import json
from os.path import os

from org.dressdiscover.api.services.collection import NoSuchCollectionException
from org.dressdiscover.lib.python import PythonApi

from dressdiscover.lib.stores.collection.omeka._omeka_collection_store import _OmekaCollectionStore
from dressdiscover.lib.stores.collection.py_collection_store_factory import PyCollectionStoreFactory
from yomeka.client.omeka_json_parser import OmekaJsonParser


class OmekaFsCollectionStore(_OmekaCollectionStore):
    URI_SCHEME = 'omekafs'

    def getCollectionById(self, collectionId, logger, logMarker):
        collection_entries = self.getCollectionsByInstitutionId(collectionId.institutionId, logger, logMarker)
        for collection_entry in collection_entries:
            if collection_entry.id == collectionId:
                return collection_entry.model
        raise NoSuchCollectionException(collectionId)

    def getCollectionsByInstitutionId(self, institutionId, logger, logMarker):
        data_dir_path = self._uri.path.get()[1:].replace('/', os.path.sep)
        print self._uri.path.get(), data_dir_path
        file_path = os.path.join(data_dir_path, str(institutionId), 'collections.json')
        with open(file_path) as f:
            return \
                self._map_omeka_collections(
                    institution_id=institutionId,
                    omeka_collections=OmekaJsonParser().parse_collection_dicts(json.loads(f.read()))
                )

PythonApi.getInstance().getCollectionStoreFactoryRegistry().registerCollectionStoreFactory(PyCollectionStoreFactory(OmekaFsCollectionStore), OmekaFsCollectionStore.URI_SCHEME)
