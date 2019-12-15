from os.path import os
import unittest

from org.dressdiscover.api.models.collection import CollectionId
from org.dressdiscover.api.models.object import ObjectId
from org.slf4j import LoggerFactory, MarkerFactory

from dressdiscover.lib.stores.object.oai_pmh.oai_pmh_fs_object_store import OaiPmhFsObjectStore
from dressdiscover.lib.mappers.txfc.txfc_oai_pmh_record_mapper import TxfcOaiPmhRecordMapper


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
        self.__store = \
            OaiPmhFsObjectStore(
                data_directory_path=os.path.abspath(os.path.join(os.path.dirname(__file__), '..', '..', '..', '..', '..', '..', '..', 'data', 'extracted', 'untvca', 'txfc')),
                record_mapper=TxfcOaiPmhRecordMapper()
            )

    def test_getObjectById(self):
        object_ = self.__store.getObjectById(self.LOGGER, self.LOG_MARKER, self.OBJECT_ID)  # @UnusedVariable

    def test_getObjectsByCollectionId(self):
        objects = self.__store.getObjectsByCollectionId(self.COLLECTION_ID, self.LOGGER, self.LOG_MARKER)
        self.assertTrue(len(objects) > 0)
