import os.path, sys
sys.path.append(os.path.join(os.path.dirname(__file__), '..'))
from _string_id import _StringId


class ObjectId(_StringId):
    def java_read_protocol_throws_checked(self):
        return ['org.dressdiscover.api.models.object.InvalidObjectIdException']

    def java_qname(self):
        return 'org.dressdiscover.api.models.object.ObjectId'

    def py_qname(self):
        return 'dressdiscover.api.models.object.object_id.ObjectId'

    def py_read_protocol_throws(self):
        return ['dressdiscover.api.models.object.InvalidObjectIdException']

    def py_repr(self):
        return """\
from dressdiscover.api.models.collection.collection_id import CollectionId
from dressdiscover.api.models.collection.invalid_collection_id_exception import InvalidCollectionIdException
from dressdiscover.api.models.object.invalid_object_id_exception import InvalidObjectIdException


class ObjectId(str):
    @classmethod
    def parse(cls, str_):
        if len(str_) == 0:
            raise InvalidObjectIdException("empty")
        split = str_.rsplit('/', 1)
        if len(split) != 2:
            raise InvalidObjectIdException("malformed object ID: " + str_)
        try:
            collection_id = CollectionId.parse(split[0].strip())
        except InvalidCollectionIdException, e:
            raise InvalidObjectIdException(str(e))
        unqualified_object_id = split[1].strip()
        if len(unqualified_object_id) == 0:
            raise InvalidObjectIdException("empty object id")
        parsed = cls(str_)
        parsed.__collection_id = collection_id
        parsed.__unqualified_object_id = unqualified_object_id
        return parsed

    @property
    def collection_id(self):
        return self.__collection_id

    @property
    def unqualified_object_id(self):
        return self.__unqualified_object_id
"""
