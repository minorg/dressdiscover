from os.path import os

from org.thryft.native_ import Uri

from costume.lib.stores.object.omeka.omeka_fs_object_store import OmekaFsObjectStore
from costume_test.lib.stores.object.omeka._omeka_object_store_test import _OmekaObjectStoreTest


class OmekaFsObjectStoreTest(_OmekaObjectStoreTest):
    def __init__(self, *args, **kwds):
        _OmekaObjectStoreTest.__init__(self, *args, **kwds)
        data_dir_path = os.path.abspath(os.path.join(os.path.dirname(__file__), '..', '..', '..', '..', '..', '..', '..', 'data', 'extracted'))
        self._store = OmekaFsObjectStore(endpoint_url=self.ENDPOINT_URL, uri=Uri.parse('omekafs:/' + data_dir_path.replace(os.path.sep, '/')))

    def test_getObjectById(self):
        self._test_getObjectById()

    def test_getObjectsByCollectionId(self):
        self._test_getObjectsByCollectionId()
