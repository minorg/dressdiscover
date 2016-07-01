from dressdiscover.api.services.collection.no_such_collection_exception import NoSuchCollectionException
from dressdiscover.lib.stores.collection.omeka._omeka_collection_store import _OmekaCollectionStore
from dressdiscover.lib.stores.collection.py_collection_store_factory import PyCollectionStoreFactory
from net.lab1318.costume.lib.python import PythonApi
from yomeka.api.no_such_omeka_collection_exception import NoSuchOmekaCollectionException
from yomeka.client.omeka_rest_api_client import OmekaRestApiClient


class OmekaApiCollectionStore(_OmekaCollectionStore):
    URI_SCHEME = 'omekaapi'

    def __init__(self, api_key, uri, **kwds):
        endpoint_url = 'http://' + str(uri.getAuthority().get()) + (uri.getPath().get() if uri.getPath().isPresent() else '')
        _OmekaCollectionStore.__init__(self, endpoint_url=endpoint_url, uri=uri, **kwds)
        self.__api_client = OmekaRestApiClient(api_key=api_key, endpoint_url=endpoint_url)

    def getCollectionById(self, collectionId, logger, logMarker):
        try:
            omeka_collection = self.__api_client.get_collection(int(collectionId.getUnqualifiedCollectionId()))
        except NoSuchOmekaCollectionException:
            raise NoSuchCollectionException
        collection_entry = self._map_omeka_collection(institution_id=collectionId.getInstitutionId(), omeka_collection=omeka_collection)
        if collection_entry is not None:
            return collection_entry.model
        else:
            raise NoSuchCollectionException

    def getCollectionsByInstitutionId(self, institutionId, logger, logMarker):
        return self._map_omeka_collections(institution_id=institutionId, omeka_collections=self.__api_client.get_all_collections())

PythonApi.getInstance().getCollectionStoreFactoryRegistry().registerCollectionStoreFactory(PyCollectionStoreFactory(OmekaApiCollectionStore), OmekaApiCollectionStore.URI_SCHEME)
