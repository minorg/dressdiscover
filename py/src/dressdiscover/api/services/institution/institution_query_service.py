from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.models.institution.institution
import dressdiscover.api.models.institution.institution_entry


class InstitutionQueryService(object):
    def get_institution_by_id(
        self,
        id=None,  # @ReservedAssignment
    ):
        '''
        :type id: str
        :rtype: dressdiscover.api.models.institution.institution.Institution
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, basestring):
            raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))

        get_institution_by_id_return_value = self._get_institution_by_id(id=id)

        if not isinstance(get_institution_by_id_return_value, dressdiscover.api.models.institution.institution.Institution):
            raise TypeError(getattr(__builtin__, 'type')(get_institution_by_id_return_value))

        return get_institution_by_id_return_value

    def _get_institution_by_id(
        self,
        id,  # @ReservedAssignment
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_institution_by_id')

    def get_institutions(
        self,
    ):
        '''
        :rtype: tuple(dressdiscover.api.models.institution.institution_entry.InstitutionEntry)
        '''

        get_institutions_return_value = self._get_institutions()

        if not (isinstance(get_institutions_return_value, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.institution.institution_entry.InstitutionEntry), get_institutions_return_value))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(get_institutions_return_value))

        return get_institutions_return_value

    def _get_institutions(
        self,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_institutions')

    def get_institutions_by_ids(
        self,
        ids=None,
    ):
        '''
        :type ids: tuple(str)
        :rtype: tuple(dressdiscover.api.models.institution.institution.Institution)
        '''

        if ids is None:
            raise ValueError('ids is required')
        if not (isinstance(ids, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), ids))) == 0):
            raise TypeError("expected ids to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(ids))

        get_institutions_by_ids_return_value = self._get_institutions_by_ids(ids=ids)

        if not (isinstance(get_institutions_by_ids_return_value, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.institution.institution.Institution), get_institutions_by_ids_return_value))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(get_institutions_by_ids_return_value))

        return get_institutions_by_ids_return_value

    def _get_institutions_by_ids(
        self,
        ids,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_institutions_by_ids')
