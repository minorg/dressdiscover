from unittest.case import TestCase

from net.lab1318.costume.api.models.collection import CollectionId
from net.lab1318.costume.api.models.institution import InstitutionId
from org.slf4j import LoggerFactory, MarkerFactory


class _OmekaCollectionStoreTest(TestCase):
    INSTITUTION_ID = InstitutionId.parse('vccc')
    COLLECTION_ID = CollectionId.parse('vccc/1')
    LOGGER = LoggerFactory.getLogger('OmekaCollectionStoreTest')
    LOG_MARKER = MarkerFactory.getMarker('OmekaCollectionStoreTest')

    def _test_getCollectionById(self):
        collection = self._store.getCollectionById(self.COLLECTION_ID, self.LOGGER, self.LOG_MARKER)  # @UnusedVariable

    def _test_getCollectionsByInstitutionId(self):
        self._store.getCollectionsByInstitutionId(self.INSTITUTION_ID, self.LOGGER, self.LOG_MARKER)
