from unittest.case import TestCase


class _OmekaCollectionStoreTest(TestCase):
    INSTITUTION_ID = InstitutionId.parse('vccc')
    COLLECTION_ID = CollectionId.parse('vccc/1')

    def test_get_collection_by_id(self):
        collection = self._service.get_collection_by_id(self.COLLECTION_ID)  # @UnusedVariable

    def test_get_collections_by_institution_id(self):
        self._store.get_collections_by_institution_id(self.INSTITUTION_ID)

