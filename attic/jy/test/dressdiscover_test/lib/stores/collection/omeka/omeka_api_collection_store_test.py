from dressdiscover.lib.stores.collection.omeka.omeka_api_collection_store import OmekaApiCollectionStore
from dressdiscover_test.lib.stores.collection.omeka._omeka_collection_store_test import _OmekaCollectionStoreTest
from dressdiscover_test.lib.stores.collection.omeka.omeka_api_test_credentials import OMEKA_API_TEST_ENDPOINT_URL, \
    OMEKA_API_TEST_API_KEY


class OmekaApiCollectionStoreTest(_OmekaCollectionStoreTest):
    def __init__(self, *args, **kwds):
        _OmekaCollectionStoreTest.__init__(self, *args, **kwds)
        self._store = OmekaApiCollectionStore(api_key=OMEKA_API_TEST_API_KEY, endpoint_url=OMEKA_API_TEST_ENDPOINT_URL)

    def test_getCollectionById(self):
        self._test_getCollectionById()

    def test_getCollectionsByInstitutionId(self):
        self._test_getCollectionsByInstitutionId()
