from org.thryft.native_ import Uri

from dressdiscover.lib.stores.object.omeka.omeka_api_object_store import OmekaApiObjectStore
from costume_test.lib.stores.collection.omeka.omeka_api_test_credentials import OMEKA_API_TEST_API_KEY, \
    OMEKA_API_TEST_ENDPOINT_URL
from costume_test.lib.stores.object.omeka._omeka_object_store_test import _OmekaObjectStoreTest


class OmekaApiObjectStoreTest(_OmekaObjectStoreTest):
    def __init__(self, *args, **kwds):
        _OmekaObjectStoreTest.__init__(self, *args, **kwds)
        self._store = OmekaApiObjectStore(api_key=OMEKA_API_TEST_API_KEY, uri=Uri.parse(OMEKA_API_TEST_ENDPOINT_URL.replace('http://', 'omekaapi://')))

    def test_getObjectById(self):
        self._test_getObjectById()

    def test_getObjectsByCollectionId(self):
        self._test_getObjectsByCollectionId()
