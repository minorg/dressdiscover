from dressdiscover.lib.services.collection.omeka_api_collection_query_service import OmekaApiCollectionQueryService
from dressdiscover_test.lib.services.collection._omeka_collection_query_service_test import _OmekaCollectionQueryServiceTest
from dressdiscover_test.lib.services.collection.omeka_api_test_credentials import OMEKA_API_TEST_ENDPOINT_URL, \
    OMEKA_API_TEST_API_KEY


class OmekaApiCollectionQueryServiceTest(_OmekaCollectionQueryServiceTest):
    def setUp(self):
        self._service = OmekaApiCollectionQueryService(api_key=OMEKA_API_TEST_API_KEY, endpoint_url=OMEKA_API_TEST_ENDPOINT_URL)

    def test_get_collection_by_id(self):
        self._test_get_collection_by_id()

    def test_get_collections_by_institution_id(self):
        self._test_get_collections_by_institution_id()

