from unittest.case import TestCase

from org.dressdiscover.api.models.collection import CollectionId
from org.dressdiscover.api.models.object import ObjectId
from org.slf4j import LoggerFactory, MarkerFactory
from org.thryft.native_ import Url


class _OmekaObjectStoreTest(TestCase):
    COLLECTION_ID = CollectionId.parse('vccc/1')
    ENDPOINT_URL = Url.parse('http://vcomeka.com/vccc')
    OBJECT_ID = ObjectId.parse('vccc/1/1000')
    LOGGER = LoggerFactory.getLogger('OmekaObjectStoreTest')
    LOG_MARKER = MarkerFactory.getMarker('OmekaObjectStoreTest')

    def _test_getObjectById(self):
        object_ = self._store.getObjectById(self.LOGGER, self.LOG_MARKER, self.OBJECT_ID)  # @UnusedVariable

    def _test_getObjectsByCollectionId(self):
        objects = self._store.getObjectsByCollectionId(self.COLLECTION_ID, self.LOGGER, self.LOG_MARKER)
        self.assertTrue(len(objects) > 0)
