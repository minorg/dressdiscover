import __builtin__
import costume.api.models.collection.collection


class CollectionCommandService(object):
    def delete_collections(
        self,
    ):
        self._delete_collections()

    def _delete_collections(
        self,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._delete_collections')

    def post_collection(
        self,
        collection=None,
    ):
        '''
        :type collection: costume.api.models.collection.collection.Collection
        :rtype: str
        '''

        if collection is None:
            raise ValueError('collection is required')
        if not isinstance(collection, costume.api.models.collection.collection.Collection):
            raise TypeError("expected collection to be a costume.api.models.collection.collection.Collection but it is a %s" % getattr(__builtin__, 'type')(collection))

        post_collection_return_value = self._post_collection(collection=collection)

        if not isinstance(post_collection_return_value, basestring):
            raise TypeError(getattr(__builtin__, 'type')(post_collection_return_value))

        return post_collection_return_value

    def _post_collection(
        self,
        collection,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._post_collection')
