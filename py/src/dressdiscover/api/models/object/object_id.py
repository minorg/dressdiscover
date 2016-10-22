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

