from unittest.case import TestCase

from org.dressdiscover.api.models.collection import CollectionId
from org.dressdiscover.api.models.institution import InstitutionId
from org.slf4j import LoggerFactory, MarkerFactory


class _OmekaCollectionStoreTest(TestCase):
    INSTITUTION_ID = InstitutionId.parse('vccc')
    COLLECTION_ID = CollectionId.parse('vccc/1')

    def __init__(self, *args, **kwds):
        TestCase.__init__(self, *args, **kwds)
        self.__logger = LoggerFactory.getLogger(self.__class__.__name__)
        self.__log_marker = MarkerFactory.getMarker(self.__class__.__name__)

    def _test_getCollectionById(self):
        collection = self._store.getCollectionById(self.COLLECTION_ID, self.__logger, self.__log_marker)  # @UnusedVariable

    def _test_getCollectionsByInstitutionId(self):
        self._store.getCollectionsByInstitutionId(self.INSTITUTION_ID, self.__logger, self.__log_marker)

