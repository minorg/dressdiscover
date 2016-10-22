import unittest

from dressdiscover.api.models.collection.collection_id import CollectionId
from dressdiscover.api.models.collection.invalid_collection_id_exception import InvalidCollectionIdException


class CollectionIdTest(unittest.TestCase):
    def test_parse(self):
        collection_id = CollectionId.parse('x/y')
        self.assertEquals('x/y', collection_id)
        self.assertEquals('x', collection_id.institution_id)
        self.assertEquals('y', collection_id.unqualified_collection_id)

        for x in ('', ' ', 'x', 'x/y/z', 'x/'):
            try:
                CollectionId.parse(x)
                self.fail()
            except InvalidCollectionIdException:
                pass
