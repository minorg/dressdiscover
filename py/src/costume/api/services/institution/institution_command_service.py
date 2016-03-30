import __builtin__
import costume.api.models.institution.institution


class InstitutionCommandService(object):
    def delete_institution_by_id(
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

        self._delete_institution_by_id(id=id)

    def _delete_institution_by_id(
        self,
        id,  # @ReservedAssignment
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._delete_institution_by_id')

    def put_institution(
        self,
        id=None,  # @ReservedAssignment
        institution=None,
    ):
        '''
        :type id: str
        :type institution: costume.api.models.institution.institution.Institution
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, basestring):
            raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))
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
