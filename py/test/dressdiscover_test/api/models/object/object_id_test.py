import unittest

from dressdiscover.api.models.object.invalid_object_id_exception import InvalidObjectIdException
from dressdiscover.api.models.object.object_id import ObjectId


class ObjectIdTest(unittest.TestCase):
    def test_parse(self):
        object_id = ObjectId.parse('x/y/z')
        self.assertEquals('x', object_id.collection_id.institution_id)
        self.assertEquals('x/y', object_id.collection_id)
        self.assertEquals('z', object_id.unqualified_object_id)

        for x in ('', ' ', 'x', 'x/y', 'x/y/z/t'):
            try:
                ObjectId.parse(x)
                self.fail()
            except InvalidObjectIdException:
                pass
