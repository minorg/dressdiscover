import __builtin__
import costume.api.models.institution.institution_id
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
        :type institution_id: costume.api.models.institution.institution_id.InstitutionId
        '''

        if institution_id is None:
            raise ValueError('institution_id is required')
        if not isinstance(institution_id, costume.api.models.institution.institution_id.InstitutionId):
            raise TypeError("expected institution_id to be a costume.api.models.institution.institution_id.InstitutionId but it is a %s" % getattr(__builtin__, 'type')(institution_id))

        self._delete_objects_by_institution_id(institution_id=institution_id)

    def _delete_objects_by_institution_id(
        self,
        institution_id,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._delete_objects_by_institution_id')

    def post_object(
        self,
        object=None,  # @ReservedAssignment
    ):
        '''
        :type object: costume.api.models.object.object.Object
        :rtype: str
        '''

        if object is None:
            raise ValueError('object is required')
        if not isinstance(object, costume.api.models.object.object.Object):
            raise TypeError("expected object to be a costume.api.models.object.object.Object but it is a %s" % getattr(__builtin__, 'type')(object))

        post_object_return_value = self._post_object(object=object)

        if not isinstance(post_object_return_value, basestring):
            raise TypeError(getattr(__builtin__, 'type')(post_object_return_value))

        return post_object_return_value

    def _post_object(
        self,
        object,  # @ReservedAssignment
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._post_object')
