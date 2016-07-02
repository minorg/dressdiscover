from com.google.common.collect import ImmutableList
from org.dressdiscover.api.services.object import NoSuchObjectException

from dressdiscover.lib.stores.object.omeka._omeka_object_store import _OmekaObjectStore
from dressdiscover.lib.stores.object.py_object_store_factory import PyObjectStoreFactory
from org.dressdiscover.lib.python import PythonApi
from yomeka.api.no_such_omeka_item_exception import NoSuchOmekaItemException
from yomeka.client.omeka_rest_api_client import OmekaRestApiClient


class OmekaApiObjectStore(_OmekaObjectStore):
    URI_SCHEME = 'omekaapi'

    def __init__(self, api_key, uri, **kwds):
        endpoint_url = 'http://' + str(uri.getAuthority().get()) + (uri.getPath().get() if uri.getPath().isPresent() else '')
        _OmekaObjectStore.__init__(self, endpoint_url=endpoint_url, uri=uri, **kwds)
        self.__api_client = OmekaRestApiClient(api_key=api_key, endpoint_url=endpoint_url)

    def getObjectById(self, logger, log_marker, object_id):
        try:
            omeka_item = self.__api_client.get_item(id=int(object_id.getUnqualifiedObjectId()))
        except NoSuchOmekaItemException:
            raise NoSuchObjectException
        return \
            self._map_omeka_item(
                collection_id=object_id.getCollectionId(),
                logger=logger,
                log_marker=log_marker,
                omeka_item=omeka_item,
                omeka_item_files=self.__api_client.get_all_files(item=omeka_item.id)
            )

    def getObjectsByCollectionId(self, collection_id, logger, log_marker):
        objects = []
        omeka_items = self.__api_client.get_all_items(collection=int(collection_id.getUnqualifiedCollectionId()))
        for omeka_item in omeka_items:
            objects.append(
                self._map_omeka_item(
                    collection_id=collection_id,
                    logger=logger,
                    log_marker=log_marker,
                    omeka_item=omeka_item,
                    omeka_item_files=self.__api_client.get_all_files(item=omeka_item.id),
                )
            )
        return ImmutableList.copyOf(objects)

PythonApi.getInstance().getObjectStoreFactoryRegistry().registerObjectStoreFactory(PyObjectStoreFactory(OmekaApiObjectStore), OmekaApiObjectStore.URI_SCHEME)
