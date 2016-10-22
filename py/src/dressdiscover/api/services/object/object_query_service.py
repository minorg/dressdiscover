from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.models.object.object


class ObjectQueryService(object):
    def get_object_by_id(
        self,
        id=None,  # @ReservedAssignment
    ):
        '''
        :type id: str
        :rtype: dressdiscover.api.models.object.object.Object
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, dressdiscover.api.models.object.object_id.ObjectId):
            raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))

        get_object_by_id_return_value = self._get_object_by_id(id=id)

        if not isinstance(get_object_by_id_return_value, dressdiscover.api.models.object.object.Object):
            raise TypeError(getattr(__builtin__, 'type')(get_object_by_id_return_value))

        return get_object_by_id_return_value

    def _get_object_by_id(
        self,
        id,  # @ReservedAssignment
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_object_by_id')

    def get_objects_by_collection_id(
        self,
        id=None,  # @ReservedAssignment
    ):
        '''
        :type id: str
        :rtype: tuple(dressdiscover.api.models.object.object.Object)
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, dressdiscover.api.models.collection.collection_id.CollectionId):
            raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))

        get_objects_by_collection_id_return_value = self._get_objects_by_collection_id(id=id)

        if not (isinstance(get_objects_by_collection_id_return_value, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.object.object.Object), get_objects_by_collection_id_return_value))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(get_objects_by_collection_id_return_value))

        return get_objects_by_collection_id_return_value

    def _get_objects_by_collection_id(
        self,
        id,  # @ReservedAssignment
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_objects_by_collection_id')
