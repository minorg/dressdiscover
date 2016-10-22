from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.models.object.object
import dressdiscover.api.models.object.object_entry


class ObjectCommandService(object):
    def delete_objects_by_collection_id(
        self,
        collection_id=None,
    ):
        '''
        :type collection_id: str
        :rtype: int
        '''

        if collection_id is None:
            raise ValueError('collection_id is required')
        if not isinstance(collection_id, dressdiscover.api.models.collection.collection_id.CollectionId):
            raise TypeError("expected collection_id to be a str but it is a %s" % getattr(__builtin__, 'type')(collection_id))

        delete_objects_by_collection_id_return_value = self._delete_objects_by_collection_id(collection_id=collection_id)

        if not isinstance(delete_objects_by_collection_id_return_value, (int, long)) and delete_objects_by_collection_id_return_value >= 0:
            raise TypeError(getattr(__builtin__, 'type')(delete_objects_by_collection_id_return_value))

        return delete_objects_by_collection_id_return_value

    def _delete_objects_by_collection_id(
        self,
        collection_id,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._delete_objects_by_collection_id')

    def put_object(
        self,
        id=None,  # @ReservedAssignment
        object=None,  # @ReservedAssignment
    ):
        '''
        :type id: str
        :type object: dressdiscover.api.models.object.object.Object
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, dressdiscover.api.models.object.object_id.ObjectId):
            raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))
        if object is None:
            raise ValueError('object is required')
        if not isinstance(object, dressdiscover.api.models.object.object.Object):
            raise TypeError("expected object to be a dressdiscover.api.models.object.object.Object but it is a %s" % getattr(__builtin__, 'type')(object))

        self._put_object(id=id, object=object)

    def _put_object(
        self,
        id,  # @ReservedAssignment
        object,  # @ReservedAssignment
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._put_object')

    def put_objects(
        self,
        objects=None,
    ):
        '''
        :type objects: tuple(dressdiscover.api.models.object.object_entry.ObjectEntry)
        '''

        if objects is None:
            raise ValueError('objects is required')
        if not (isinstance(objects, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.object.object_entry.ObjectEntry), objects))) == 0):
            raise TypeError("expected objects to be a tuple(dressdiscover.api.models.object.object_entry.ObjectEntry) but it is a %s" % getattr(__builtin__, 'type')(objects))

        self._put_objects(objects=objects)

    def _put_objects(
        self,
        objects,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._put_objects')

    def resummarize_objects(
        self,
    ):
        self._resummarize_objects()

    def _resummarize_objects(
        self,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._resummarize_objects')
