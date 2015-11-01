from itertools import ifilterfalse
import __builtin__
import costume.api.models.institution.institution_id
import costume.api.models.object.object
import costume.api.models.object.object_entry


class ObjectQueryService(object):
    def get_object_by_id(
        self,
        id=None,  # @ReservedAssignment
    ):
        '''
        :type id: str
        :rtype: costume.api.models.object.object.Object
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, basestring):
            raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))

        get_object_by_id_return_value = self._get_object_by_id(id=id)

        if not isinstance(get_object_by_id_return_value, costume.api.models.object.object.Object):
            raise TypeError(getattr(__builtin__, 'type')(get_object_by_id_return_value))

        return get_object_by_id_return_value

    def _get_object_by_id(
        self,
        id,  # @ReservedAssignment
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_object_by_id')

    def get_objects(
        self,
    ):
        '''
        :rtype: tuple(costume.api.models.object.object_entry.ObjectEntry)
        '''

        get_objects_return_value = self._get_objects()

        if not (isinstance(get_objects_return_value, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, costume.api.models.object.object_entry.ObjectEntry), get_objects_return_value))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(get_objects_return_value))

        return get_objects_return_value

    def _get_objects(
        self,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_objects')

    def get_objects_by_collection_id(
        self,
        collection_id=None,
    ):
        '''
        :type collection_id: str
        :rtype: tuple(costume.api.models.object.object_entry.ObjectEntry)
        '''

        if collection_id is None:
            raise ValueError('collection_id is required')
        if not isinstance(collection_id, basestring):
            raise TypeError("expected collection_id to be a str but it is a %s" % getattr(__builtin__, 'type')(collection_id))

        get_objects_by_collection_id_return_value = self._get_objects_by_collection_id(collection_id=collection_id)

        if not (isinstance(get_objects_by_collection_id_return_value, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, costume.api.models.object.object_entry.ObjectEntry), get_objects_by_collection_id_return_value))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(get_objects_by_collection_id_return_value))

        return get_objects_by_collection_id_return_value

    def _get_objects_by_collection_id(
        self,
        collection_id,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_objects_by_collection_id')

    def get_objects_by_institution_id(
        self,
        institution_id=None,
    ):
        '''
        :type institution_id: costume.api.models.institution.institution_id.InstitutionId
        :rtype: tuple(costume.api.models.object.object_entry.ObjectEntry)
        '''

        if institution_id is None:
            raise ValueError('institution_id is required')
        if not isinstance(institution_id, costume.api.models.institution.institution_id.InstitutionId):
            raise TypeError("expected institution_id to be a costume.api.models.institution.institution_id.InstitutionId but it is a %s" % getattr(__builtin__, 'type')(institution_id))

        get_objects_by_institution_id_return_value = self._get_objects_by_institution_id(institution_id=institution_id)

        if not (isinstance(get_objects_by_institution_id_return_value, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, costume.api.models.object.object_entry.ObjectEntry), get_objects_by_institution_id_return_value))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(get_objects_by_institution_id_return_value))

        return get_objects_by_institution_id_return_value

    def _get_objects_by_institution_id(
        self,
        institution_id,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_objects_by_institution_id')
