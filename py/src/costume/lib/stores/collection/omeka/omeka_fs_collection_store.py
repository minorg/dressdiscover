import json
from os.path import os

from com.google.common.collect import ImmutableList

from costume.lib.stores.collection.omeka._omeka_collection_store import _OmekaCollectionStore
from yomeka.client.omeka_json_parser import OmekaJsonParser
from costume.api.services.collection.no_such_collection_exception import NoSuchCollectionException


class OmekaFsCollectionStore(_OmekaCollectionStore):
    def getCollectionById(self, collectionId, logger, logMarker):
        collection_entries = self.getCollectionsByInstitutionId(collectionId.institutionId, logger, logMarker)
        for collection_entry in collection_entries:
            if collection_entry.id == collectionId:
                return collection_entry.model
        raise NoSuchCollectionException(collectionId)

    def getCollectionsByInstitutionId(self, institutionId, logger, logMarker):
        print self._url
        file_path = os.path.join(self.__data_dir_path, 'extracted', str(institutionId), 'collections.json')
        with open(file_path) as f:
            omeka_collections = OmekaJsonParser().parse_collection_dicts(json.loads(f.read()))
            return ImmutableList.copyOf(self._mapper.map_omeka_collection(
                                            collection_store_url=self._url,
                                            institution_id=institutionId,
                                            omeka_collection=omeka_collection,
                                        )
                                        for omeka_collection in omeka_collections)
