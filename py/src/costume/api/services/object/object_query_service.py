import __builtin__
import costume.api.models.object.object
import costume.api.models.object.object_query
import costume.api.services.object.get_objects_options
import costume.api.services.object.get_objects_result


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
        query=None,
    ):
        '''
        :type query: costume.api.models.object.object_query.ObjectQuery or None
        :rtype: int
        '''

        if query is not None:
            if not isinstance(query, costume.api.models.object.object_query.ObjectQuery):
                raise TypeError("expected query to be a costume.api.models.object.object_query.ObjectQuery but it is a %s" % getattr(__builtin__, 'type')(query))

        get_object_count_return_value = self._get_object_count(query=query)

        if not isinstance(get_object_count_return_value, (int, long)) and get_object_count_return_value >= 0:
            raise TypeError(getattr(__builtin__, 'type')(get_object_count_return_value))

        return get_object_count_return_value

    def _get_object_count(
        self,
        query,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_object_count')

    def get_objects(
        self,
        options=None,
        query=None,
    ):
        '''
        :type options: costume.api.services.object.get_objects_options.GetObjectsOptions
        :type query: costume.api.models.object.object_query.ObjectQuery or None
        :rtype: costume.api.services.object.get_objects_result.GetObjectsResult
        '''

        if options is None:
            raise ValueError('options is required')
        if not isinstance(options, costume.api.services.object.get_objects_options.GetObjectsOptions):
            raise TypeError("expected options to be a costume.api.services.object.get_objects_options.GetObjectsOptions but it is a %s" % getattr(__builtin__, 'type')(options))
        if query is not None:
            if not isinstance(query, costume.api.models.object.object_query.ObjectQuery):
                raise TypeError("expected query to be a costume.api.models.object.object_query.ObjectQuery but it is a %s" % getattr(__builtin__, 'type')(query))

        get_objects_return_value = self._get_objects(options=options, query=query)

        if not isinstance(get_objects_return_value, costume.api.services.object.get_objects_result.GetObjectsResult):
            raise TypeError(getattr(__builtin__, 'type')(get_objects_return_value))

        return get_objects_return_value

    def _get_objects(
        self,
        options,
        query,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_objects')
