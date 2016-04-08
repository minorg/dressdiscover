from com.google.common.collect import ImmutableList

from costume.lib.stores.collection.omeka._omeka_collection_store import _OmekaCollectionStore
from yomeka.client.omeka_rest_api_client import OmekaRestApiClient


class OmekaApiCollectionStore(_OmekaCollectionStore):
    def __init__(self, api_key, **kwds):
        _OmekaCollectionStore.__init__(self, **kwds)
        self.__api_client = OmekaRestApiClient(api_key=api_key, endpoint_url='http://' + str(self._uri.getAuthority().get()) + (self._uri.getPath().get() if self._uri.getPath().isPresent() else ''))

    def getCollectionById(self, collectionId, logger, logMarker):
        omeka_collection = self.__api_client.get_collection_by_id(int(collectionId.getUnqualifiedCollectionId()))
        return \
            self._mapper.map_omeka_collection(
                collection_store_uri=self._uri,
                institution_id=collectionId.getInstitutionId(),
                omeka_collection=omeka_collection,
            )

    def getCollectionsByInstitutionId(self, institutionId, logger, logMarker):
        omeka_collections = self.__api_client.get_all_collections()
        return ImmutableList.copyOf(self._mapper.map_omeka_collection(
                                        collection_store_uri=self._uri,
                                        institution_id=institutionId,
                                        omeka_collection=omeka_collection,
                                    )
                                    for omeka_collection in omeka_collections)
