from os.path import os
import urllib

from org.thryft.native_ import Uri

from dressdiscover.lib.stores.collection.omeka.omeka_fs_store import OmekaFsCollectionStore
from dressdiscover_test.lib.services.collection._omeka_collection_query_service_test import _OmekaCollectionStoreTest


class OmekaFsCollectionStoreTest(_OmekaCollectionStoreTest):
    def __init__(self, *args, **kwds):
        _OmekaCollectionStoreTest.__init__(self, *args, **kwds)
        data_dir_path = os.path.abspath(os.path.join(os.path.dirname(__file__), '..', '..', '..', '..', '..', '..', '..', 'data', 'extracted'))
        self._store = OmekaFsCollectionStore(uri=Uri.parse('omekafs:/' + urllib.pathname2url(data_dir_path)))

    def test_getCollectionById(self):
        self._test_getCollectionById()

    def test_getCollectionsByInstitutionId(self):
        self._test_getCollectionsByInstitutionId()
