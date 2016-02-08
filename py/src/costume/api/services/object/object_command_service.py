from itertools import ifilterfalse
import __builtin__
import costume.api.models.object.object
import costume.api.models.object.object_entry


class ObjectCommandService(object):
    def delete_objects(
        self,
    ):
        '''
        :rtype: int
        '''

        delete_objects_return_value = self._delete_objects()

        if not isinstance(delete_objects_return_value, (int, long)) and delete_objects_return_value >= 0:
            raise TypeError(getattr(__builtin__, 'type')(delete_objects_return_value))

        return delete_objects_return_value

    def _delete_objects(
        self,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._delete_objects')

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
        if not isinstance(collection_id, basestring):
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

    def delete_objects_by_institution_id(
        self,
        institution_id=None,
    ):
        '''
        :type institution_id: str
        :rtype: int
        '''

        if institution_id is None:
            raise ValueError('institution_id is required')
        if not isinstance(institution_id, basestring):
            raise TypeError("expected institution_id to be a str but it is a %s" % getattr(__builtin__, 'type')(institution_id))

        delete_objects_by_institution_id_return_value = self._delete_objects_by_institution_id(institution_id=institution_id)

        if not isinstance(delete_objects_by_institution_id_return_value, (int, long)) and delete_objects_by_institution_id_return_value >= 0:
            raise TypeError(getattr(__builtin__, 'type')(delete_objects_by_institution_id_return_value))

        return delete_objects_by_institution_id_return_value

    def _delete_objects_by_institution_id(
        self,
        institution_id,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._delete_objects_by_institution_id')

    def put_object(
        self,
        id=None,  # @ReservedAssignment
        object=None,  # @ReservedAssignment
    ):
        '''
        :type id: str
        :type object: costume.api.models.object.object.Object
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, basestring):
            raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))
        if object is None:
            raise ValueError('object is required')
        if not isinstance(object, costume.api.models.object.object.Object):
            raise TypeError("expected object to be a costume.api.models.object.object.Object but it is a %s" % getattr(__builtin__, 'type')(object))

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
        :type objects: tuple(costume.api.models.object.object_entry.ObjectEntry)
        '''

        if objects is None:
            raise ValueError('objects is required')
        if not (isinstance(objects, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, costume.api.models.object.object_entry.ObjectEntry), objects))) == 0):
            raise TypeError("expected objects to be a tuple(costume.api.models.object.object_entry.ObjectEntry) but it is a %s" % getattr(__builtin__, 'type')(objects))

        self._put_objects(objects=objects)

    def _put_objects(
        self,
        objects,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._put_objects')
