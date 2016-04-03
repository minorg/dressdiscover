from unittest.case import TestCase

from net.lab1318.costume.api.models.collection import CollectionId
from net.lab1318.costume.api.models.object import ObjectId
from org.slf4j import LoggerFactory, MarkerFactory


class _OmekaObjectStoreTest(TestCase):
    COLLECTION_ID = CollectionId.parse('vccc/1')
    OBJECT_ID = ObjectId.parse('vccc/1/1000')
    LOGGER = LoggerFactory.getLogger('OmekaObjectStoreTest')
    LOG_MARKER = MarkerFactory.getMarker('OmekaObjectStoreTest')

    def _test_getObjectById(self):
        object_ = self._store.getObjectById(self.LOGGER, self.LOG_MARKER, self.OBJECT_ID)  # @UnusedVariable
