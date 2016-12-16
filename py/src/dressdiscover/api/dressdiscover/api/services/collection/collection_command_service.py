import __builtin__
import dressdiscover.api.models.collection.collection


class CollectionCommandService(object):
    def delete_collection_by_id(
        self,
        id=None,  # @ReservedAssignment
    ):
        '''
        :type id: str
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, basestring):
            raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))

        self._delete_collection_by_id(id=id)

    def _delete_collection_by_id(
        self,
        id,  # @ReservedAssignment
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._delete_collection_by_id')

    def delete_collections_by_institution_id(
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

        self._delete_collections_by_institution_id(institution_id=institution_id)

    def _delete_collections_by_institution_id(
        self,
        institution_id,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._delete_collections_by_institution_id')

    def put_collection(
        self,
        id=None,  # @ReservedAssignment
        collection=None,
    ):
        '''
        :type id: str
        :type collection: dressdiscover.api.models.collection.collection.Collection
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, basestring):
            raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))
        if collection is None:
            raise ValueError('collection is required')
        if not isinstance(collection, dressdiscover.api.models.collection.collection.Collection):
            raise TypeError("expected collection to be a dressdiscover.api.models.collection.collection.Collection but it is a %s" % getattr(__builtin__, 'type')(collection))

        self._put_collection(id=id, collection=collection)

    def _put_collection(
        self,
        id,  # @ReservedAssignment
        collection,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._put_collection')
