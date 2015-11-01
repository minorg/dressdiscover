from itertools import ifilterfalse
import __builtin__
import costume.api.models.collection.collection
import costume.api.models.collection.collection_entry


class CollectionQueryService(object):
    def get_collection_by_id(
        self,
        id=None,  # @ReservedAssignment
    ):
        '''
        :type id: str
        :rtype: costume.api.models.collection.collection.Collection
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, basestring):
            raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))

        get_collection_by_id_return_value = self._get_collection_by_id(id=id)

        if not isinstance(get_collection_by_id_return_value, costume.api.models.collection.collection.Collection):
            raise TypeError(getattr(__builtin__, 'type')(get_collection_by_id_return_value))

        return get_collection_by_id_return_value

    def _get_collection_by_id(
        self,
        id,  # @ReservedAssignment
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_collection_by_id')

    def get_collections(
        self,
    ):
        '''
        :rtype: tuple(costume.api.models.collection.collection_entry.CollectionEntry)
        '''

        get_collections_return_value = self._get_collections()

        if not (isinstance(get_collections_return_value, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, costume.api.models.collection.collection_entry.CollectionEntry), get_collections_return_value))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(get_collections_return_value))

        return get_collections_return_value

    def _get_collections(
        self,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_collections')
