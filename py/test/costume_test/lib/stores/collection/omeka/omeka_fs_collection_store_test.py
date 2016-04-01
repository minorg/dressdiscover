from costume.lib.stores.collection.omeka.omeka_fs_collection_store import OmekaFsCollectionStore
from costume_test.lib.stores.collection.omeka._omeka_collection_store_test import _OmekaCollectionStoreTest


class OmekaFsCollectionStoreTest(_OmekaCollectionStoreTest):
    def __init__(self, *args, **kwds):
        _OmekaCollectionStoreTest.__init__(self, *args, **kwds)
        self._store = OmekaFsCollectionStore()

    def test_getCollectionById(self):
        self._test_getCollectionById()

    def test_getCollectionsByInstitutionId(self):
        self._test_getCollectionsByInstitutionId()
