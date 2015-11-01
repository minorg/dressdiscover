import __builtin__
import costume.api.models.institution.institution
import costume.api.models.institution.institution_id


class InstitutionCommandService(object):
    def delete_institution_by_id(
        self,
        id=None,  # @ReservedAssignment
    ):
        '''
        :type id: costume.api.models.institution.institution_id.InstitutionId
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, costume.api.models.institution.institution_id.InstitutionId):
            raise TypeError("expected id to be a costume.api.models.institution.institution_id.InstitutionId but it is a %s" % getattr(__builtin__, 'type')(id))

        self._delete_institution_by_id(id=id)

    def _delete_institution_by_id(
        self,
        id,  # @ReservedAssignment
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._delete_institution_by_id')

    def delete_institutions(
        self,
    ):
        self._delete_institutions()

    def _delete_institutions(
        self,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._delete_institutions')

    def put_institution(
        self,
        id=None,  # @ReservedAssignment
        institution=None,
    ):
        '''
        :type id: costume.api.models.institution.institution_id.InstitutionId
        :type institution: costume.api.models.institution.institution.Institution
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, costume.api.models.institution.institution_id.InstitutionId):
            raise TypeError("expected id to be a costume.api.models.institution.institution_id.InstitutionId but it is a %s" % getattr(__builtin__, 'type')(id))
        if institution is None:
            raise ValueError('institution is required')
        if not isinstance(institution, costume.api.models.institution.institution.Institution):
            raise TypeError("expected institution to be a costume.api.models.institution.institution.Institution but it is a %s" % getattr(__builtin__, 'type')(institution))

        self._put_institution(id=id, institution=institution)

    def _put_institution(
        self,
        id,  # @ReservedAssignment
        institution,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._put_institution')
