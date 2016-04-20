import json
from os.path import os

from com.google.common.collect import ImmutableList

from costume.api.services.collection.no_such_collection_exception import NoSuchCollectionException
from costume.lib.stores.collection.omeka._omeka_collection_store import _OmekaCollectionStore
from costume.lib.stores.collection.py_collection_store_factory import PyCollectionStoreFactory
from net.lab1318.costume.lib.python import PythonApi
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
        file_path = os.path.join(data_dir_path, str(institutionId), 'collections.json')
        with open(file_path) as f:
            omeka_collections = OmekaJsonParser().parse_collection_dicts(json.loads(f.read()))
            return ImmutableList.copyOf(self._resource_mapper.map_omeka_collection(
                                            collection_store_uri=self._uri,
                                            institution_id=institutionId,
                                            omeka_collection=omeka_collection,
                                        )
                                        for omeka_collection in omeka_collections)

PythonApi.getInstance().getCollectionStoreFactoryRegistry().registerCollectionStoreFactory(PyCollectionStoreFactory(OmekaFsCollectionStore), OmekaFsCollectionStore.URI_SCHEME)
