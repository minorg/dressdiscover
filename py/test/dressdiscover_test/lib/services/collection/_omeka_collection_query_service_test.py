from unittest.case import TestCase

from dressdiscover.api.models.collection.collection_id import CollectionId
from dressdiscover.api.models.institution.institution_id import InstitutionId


class _OmekaCollectionQueryServiceTest(TestCase):
    INSTITUTION_ID = InstitutionId.parse('vccc')
    COLLECTION_ID = CollectionId.parse('vccc/1')

    def _test_get_collection_by_id(self):
        collection = self._service.get_collection_by_id(self.COLLECTION_ID)  # @UnusedVariable

    def _test_get_collections_by_institution_id(self):
        self._service.get_collections_by_institution_id(self.INSTITUTION_ID)

