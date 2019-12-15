from os.path import os

from dressdiscover.lib.stores.collection.omeka.omeka_fs_collection_store import OmekaFsCollectionStore
from dressdiscover_test.lib.stores.collection.omeka._omeka_collection_store_test import _OmekaCollectionStoreTest
from dressdiscover_test.lib.stores.collection.omeka.omeka_api_test_credentials import OMEKA_API_TEST_ENDPOINT_URL


class OmekaFsCollectionStoreTest(_OmekaCollectionStoreTest):
    def __init__(self, *args, **kwds):
        _OmekaCollectionStoreTest.__init__(self, *args, **kwds)
        self._store = \
            OmekaFsCollectionStore(
                data_directory_path=os.path.abspath(os.path.join(os.path.dirname(__file__), '..', '..', '..', '..', '..', '..', '..', 'data', 'extracted')),
                endpoint_url=OMEKA_API_TEST_ENDPOINT_URL
            )

    def test_getCollectionById(self):
        self._test_getCollectionById()

    def test_getCollectionsByInstitutionId(self):
        self._test_getCollectionsByInstitutionId()
