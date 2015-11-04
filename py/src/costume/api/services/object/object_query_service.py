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

    def get_object_count(
        self,
    ):
        '''
        :rtype: int
        '''

        get_object_count_return_value = self._get_object_count()

        if not isinstance(get_object_count_return_value, (int, long)) and get_object_count_return_value >= 0:
            raise TypeError(getattr(__builtin__, 'type')(get_object_count_return_value))

        return get_object_count_return_value

    def _get_object_count(
        self,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_object_count')

    def get_object_count_by_collection_id(
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

        get_object_count_by_collection_id_return_value = self._get_object_count_by_collection_id(collection_id=collection_id)

        if not isinstance(get_object_count_by_collection_id_return_value, (int, long)) and get_object_count_by_collection_id_return_value >= 0:
            raise TypeError(getattr(__builtin__, 'type')(get_object_count_by_collection_id_return_value))

        return get_object_count_by_collection_id_return_value

    def _get_object_count_by_collection_id(
        self,
        collection_id,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_object_count_by_collection_id')

    def get_object_count_by_institution_id(
        self,
        institution_id=None,
    ):
        '''
        :type institution_id: costume.api.models.institution.institution_id.InstitutionId
        :rtype: int
        '''

        if institution_id is None:
            raise ValueError('institution_id is required')
        if not isinstance(institution_id, costume.api.models.institution.institution_id.InstitutionId):
            raise TypeError("expected institution_id to be a costume.api.models.institution.institution_id.InstitutionId but it is a %s" % getattr(__builtin__, 'type')(institution_id))

        get_object_count_by_institution_id_return_value = self._get_object_count_by_institution_id(institution_id=institution_id)

        if not isinstance(get_object_count_by_institution_id_return_value, (int, long)) and get_object_count_by_institution_id_return_value >= 0:
            raise TypeError(getattr(__builtin__, 'type')(get_object_count_by_institution_id_return_value))

        return get_object_count_by_institution_id_return_value

    def _get_object_count_by_institution_id(
        self,
        institution_id,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_object_count_by_institution_id')

    def get_objects(
        self,
        from_=None,
        size=None,
    ):
        '''
        :type from_: int
        :type size: int
        :rtype: tuple(costume.api.models.object.object_entry.ObjectEntry)
        '''

        if from_ is None:
            raise ValueError('from_ is required')
        if not isinstance(from_, (int, long)) and from_ >= 0:
            raise TypeError("expected from_ to be a int but it is a %s" % getattr(__builtin__, 'type')(from_))
        if size is None:
            raise ValueError('size is required')
        if not isinstance(size, (int, long)) and size >= 0:
            raise TypeError("expected size to be a int but it is a %s" % getattr(__builtin__, 'type')(size))

        get_objects_return_value = self._get_objects(from_=from_, size=size)

        if not (isinstance(get_objects_return_value, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, costume.api.models.object.object_entry.ObjectEntry), get_objects_return_value))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(get_objects_return_value))

        return get_objects_return_value

    def _get_objects(
        self,
        from_,
        size,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_objects')

    def get_objects_by_collection_id(
        self,
        collection_id=None,
        from_=None,
        size=None,
    ):
        '''
        :type collection_id: str
        :type from_: int
        :type size: int
        :rtype: tuple(costume.api.models.object.object_entry.ObjectEntry)
        '''

        if collection_id is None:
            raise ValueError('collection_id is required')
        if not isinstance(collection_id, basestring):
            raise TypeError("expected collection_id to be a str but it is a %s" % getattr(__builtin__, 'type')(collection_id))
        if from_ is None:
            raise ValueError('from_ is required')
        if not isinstance(from_, (int, long)) and from_ >= 0:
            raise TypeError("expected from_ to be a int but it is a %s" % getattr(__builtin__, 'type')(from_))
        if size is None:
            raise ValueError('size is required')
        if not isinstance(size, (int, long)) and size >= 0:
            raise TypeError("expected size to be a int but it is a %s" % getattr(__builtin__, 'type')(size))

        get_objects_by_collection_id_return_value = self._get_objects_by_collection_id(collection_id=collection_id, from_=from_, size=size)

        if not (isinstance(get_objects_by_collection_id_return_value, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, costume.api.models.object.object_entry.ObjectEntry), get_objects_by_collection_id_return_value))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(get_objects_by_collection_id_return_value))

        return get_objects_by_collection_id_return_value

    def _get_objects_by_collection_id(
        self,
        collection_id,
        from_,
        size,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_objects_by_collection_id')

    def get_objects_by_institution_id(
        self,
        institution_id=None,
        from_=None,
        size=None,
    ):
        '''
        :type institution_id: costume.api.models.institution.institution_id.InstitutionId
        :type from_: int
        :type size: int
        :rtype: tuple(costume.api.models.object.object_entry.ObjectEntry)
        '''

        if institution_id is None:
            raise ValueError('institution_id is required')
        if not isinstance(institution_id, costume.api.models.institution.institution_id.InstitutionId):
            raise TypeError("expected institution_id to be a costume.api.models.institution.institution_id.InstitutionId but it is a %s" % getattr(__builtin__, 'type')(institution_id))
        if from_ is None:
            raise ValueError('from_ is required')
        if not isinstance(from_, (int, long)) and from_ >= 0:
            raise TypeError("expected from_ to be a int but it is a %s" % getattr(__builtin__, 'type')(from_))
        if size is None:
            raise ValueError('size is required')
        if not isinstance(size, (int, long)) and size >= 0:
            raise TypeError("expected size to be a int but it is a %s" % getattr(__builtin__, 'type')(size))

        get_objects_by_institution_id_return_value = self._get_objects_by_institution_id(institution_id=institution_id, from_=from_, size=size)

        if not (isinstance(get_objects_by_institution_id_return_value, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, costume.api.models.object.object_entry.ObjectEntry), get_objects_by_institution_id_return_value))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(get_objects_by_institution_id_return_value))

        return get_objects_by_institution_id_return_value

    def _get_objects_by_institution_id(
        self,
        institution_id,
        from_,
        size,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_objects_by_institution_id')
