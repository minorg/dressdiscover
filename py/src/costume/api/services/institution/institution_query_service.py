from itertools import ifilterfalse
import __builtin__
import costume.api.models.institution.institution
import costume.api.models.institution.institution_entry
import costume.api.models.institution.institution_id


class InstitutionQueryService(object):
    def get_institution_by_id(
        self,
        id=None,  # @ReservedAssignment
    ):
        '''
        :type id: costume.api.models.institution.institution_id.InstitutionId
        :rtype: costume.api.models.institution.institution.Institution
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, costume.api.models.institution.institution_id.InstitutionId):
            raise TypeError("expected id to be a costume.api.models.institution.institution_id.InstitutionId but it is a %s" % getattr(__builtin__, 'type')(id))

        get_institution_by_id_return_value = self._get_institution_by_id(id=id)

        if not isinstance(get_institution_by_id_return_value, costume.api.models.institution.institution.Institution):
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
        :rtype: tuple(costume.api.models.institution.institution_entry.InstitutionEntry)
        '''

        get_institutions_return_value = self._get_institutions()

        if not (isinstance(get_institutions_return_value, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, costume.api.models.institution.institution_entry.InstitutionEntry), get_institutions_return_value))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(get_institutions_return_value))

        return get_institutions_return_value

    def _get_institutions(
        self,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_institutions')
