from dressdiscover.api.services.collection.no_such_collection_exception import NoSuchCollectionException
from dressdiscover.lib.stores.collection.omeka._omeka_collection_query_service import _OmekaCollectionQueryService
from yomeka.api.no_such_omeka_collection_exception import NoSuchOmekaCollectionException
from yomeka.client.omeka_rest_api_client import OmekaRestApiClient


class OmekaApiCollectionQueryService(_OmekaCollectionQueryService):
    def __init__(self, api_key, endpoint_url, **kwds):
        _OmekaCollectionQueryService.__init__(self, endpoint_url=endpoint_url, **kwds)
        self.__api_client = OmekaRestApiClient(api_key=api_key, endpoint_url=endpoint_url)

    def _get_collection_by_id(self, collection_id):
        try:
            omeka_collection = self.__api_client.get_collection(int(collection_id.unqualified_collection_id))
        except NoSuchOmekaCollectionException:
            raise NoSuchCollectionException
        collection_entry = self._map_omeka_collection(institution_id=collection_id.institution_id, omeka_collection=omeka_collection)
        if collection_entry is not None:
            return collection_entry.model
        else:
            raise NoSuchCollectionException

    def _get_collections_by_institution_id(self, institution_id):
        return self._map_omeka_collections(institution_id=institution_id, omeka_collections=self.__api_client.get_all_collections())
