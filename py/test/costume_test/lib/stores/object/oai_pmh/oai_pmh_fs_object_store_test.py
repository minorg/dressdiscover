from os.path import os
import unittest

from net.lab1318.costume.api.models.collection import CollectionId
from net.lab1318.costume.api.models.object import ObjectId
from org.slf4j import LoggerFactory, MarkerFactory
from org.thryft.native_ import Uri

from costume.lib.stores.object.oai_pmh.oai_pmh_fs_object_store import OaiPmhFsObjectStore
from costume.lib.stores.object.txfc.txfc_oai_pmh_record_mapper import TxfcOaiPmhRecordMapper


class OaiPmhFsObjectStoreTest(unittest.TestCase):
    COLLECTION_ID = CollectionId.parse('untvca/txfc')
    OBJECT_ID = ObjectId.parse('untvca/txfc/info_ark_67531_metadc30028')
    LOGGER = LoggerFactory.getLogger('OaiPmhFsObjectStoreTest')
    LOG_MARKER = MarkerFactory.getMarker('OaiPmhFsObjectStoreTest')

    def _test_getObjectById(self):
        object_ = self.__store.getObjectById(self.LOGGER, self.LOG_MARKER, self.OBJECT_ID)  # @UnusedVariable

    def _test_getObjectsByCollectionId(self):
        objects = self.__store.getObjectsByCollectionId(self.COLLECTION_ID, self.LOGGER, self.LOG_MARKER)
        self.assertTrue(len(objects) > 0)

    def __init__(self, *args, **kwds):
        unittest.TestCase.__init__(self, *args, **kwds)
        data_dir_path = os.path.abspath(os.path.join(os.path.dirname(__file__), '..', '..', '..', '..', '..', '..', '..', 'data', 'extracted', 'untvca', 'txfc'))
        self.__store = \
            OaiPmhFsObjectStore(
                record_mapper=TxfcOaiPmhRecordMapper(),
                uri=Uri.parse(OaiPmhFsObjectStore.URI_SCHEME + ':/' + data_dir_path.replace(os.path.sep, '/'))
            )

    def test_getObjectById(self):
        object_ = self.__store.getObjectById(self.LOGGER, self.LOG_MARKER, self.OBJECT_ID)  # @UnusedVariable

    def test_getObjectsByCollectionId(self):
        objects = self.__store.getObjectsByCollectionId(self.COLLECTION_ID, self.LOGGER, self.LOG_MARKER)
        self.assertTrue(len(objects) > 0)
