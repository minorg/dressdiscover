from os.path import os

from org.thryft.native_ import Uri

from dressdiscover.lib.stores.collection.omeka.omeka_fs_collection_store import OmekaFsCollectionStore
from dressdiscover_test.lib.stores.collection.omeka._omeka_collection_store_test import _OmekaCollectionStoreTest


class OmekaFsCollectionStoreTest(_OmekaCollectionStoreTest):
    def __init__(self, *args, **kwds):
        _OmekaCollectionStoreTest.__init__(self, *args, **kwds)
        data_dir_path = os.path.abspath(os.path.join(os.path.dirname(__file__), '..', '..', '..', '..', '..', '..', '..', 'data', 'extracted'))
        self._store = OmekaFsCollectionStore(uri=Uri.parse('omekafs:/' + data_dir_path.replace(os.path.sep, '/')))

    def test_getCollectionById(self):
        self._test_getCollectionById()

    def test_getCollectionsByInstitutionId(self):
        self._test_getCollectionsByInstitutionId()
