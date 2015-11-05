import __builtin__
import costume.api.models.object.object


class ObjectCommandService(object):
    def delete_objects(
        self,
    ):
        self._delete_objects()

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
        '''

        if collection_id is None:
            raise ValueError('collection_id is required')
        if not isinstance(collection_id, basestring):
            raise TypeError("expected collection_id to be a str but it is a %s" % getattr(__builtin__, 'type')(collection_id))

        self._delete_objects_by_collection_id(collection_id=collection_id)

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
        '''

        if institution_id is None:
            raise ValueError('institution_id is required')
        if not isinstance(institution_id, basestring):
            raise TypeError("expected institution_id to be a str but it is a %s" % getattr(__builtin__, 'type')(institution_id))

        self._delete_objects_by_institution_id(institution_id=institution_id)

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
