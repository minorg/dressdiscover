import __builtin__
import costume.api.models.collection.collection
import costume.api.models.institution.institution_id


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

    def delete_collections(
        self,
    ):
        self._delete_collections()

    def _delete_collections(
        self,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._delete_collections')

    def delete_collections_by_institution_id(
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

        self._delete_collections_by_institution_id(institution_id=institution_id)

    def _delete_collections_by_institution_id(
        self,
        institution_id,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._delete_collections_by_institution_id')

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
