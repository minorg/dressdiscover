from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.models.collection.collection
import dressdiscover.api.models.collection.collection_entry


class CollectionQueryService(object):
    def get_collection_by_id(
        self,
        id=None,  # @ReservedAssignment
    ):
        '''
        :type id: str
        :rtype: dressdiscover.api.models.collection.collection.Collection
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, dressdiscover.api.models.collection.collection_id.CollectionId):
            raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))

        get_collection_by_id_return_value = self._get_collection_by_id(id=id)

        if not isinstance(get_collection_by_id_return_value, dressdiscover.api.models.collection.collection.Collection):
            raise TypeError(getattr(__builtin__, 'type')(get_collection_by_id_return_value))

        return get_collection_by_id_return_value

    def _get_collection_by_id(
        self,
        id,  # @ReservedAssignment
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_collection_by_id')

    def get_collections_by_ids(
        self,
        ids=None,
    ):
        '''
        :type ids: tuple(str)
        :rtype: tuple(dressdiscover.api.models.collection.collection.Collection)
        '''

        if ids is None:
            raise ValueError('ids is required')
        if not (isinstance(ids, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.collection.collection_id.CollectionId), ids))) == 0):
            raise TypeError("expected ids to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(ids))

        get_collections_by_ids_return_value = self._get_collections_by_ids(ids=ids)

        if not (isinstance(get_collections_by_ids_return_value, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.collection.collection.Collection), get_collections_by_ids_return_value))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(get_collections_by_ids_return_value))

        return get_collections_by_ids_return_value

    def _get_collections_by_ids(
        self,
        ids,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_collections_by_ids')

    def get_collections_by_institution_id(
        self,
        institution_id=None,
    ):
        '''
        :type institution_id: str
        :rtype: tuple(dressdiscover.api.models.collection.collection_entry.CollectionEntry)
        '''

        if institution_id is None:
            raise ValueError('institution_id is required')
        if not isinstance(institution_id, dressdiscover.api.models.institution.institution_id.InstitutionId):
            raise TypeError("expected institution_id to be a str but it is a %s" % getattr(__builtin__, 'type')(institution_id))

        get_collections_by_institution_id_return_value = self._get_collections_by_institution_id(institution_id=institution_id)

        if not (isinstance(get_collections_by_institution_id_return_value, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.collection.collection_entry.CollectionEntry), get_collections_by_institution_id_return_value))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(get_collections_by_institution_id_return_value))

        return get_collections_by_institution_id_return_value

    def _get_collections_by_institution_id(
        self,
        institution_id,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_collections_by_institution_id')
