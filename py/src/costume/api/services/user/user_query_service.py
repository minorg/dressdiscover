import __builtin__
import costume.api.models.user.user
import costume.api.models.user.user_entry


class UserQueryService(object):
    def get_user_by_email_address(
        self,
        email_address=None,
    ):
        '''
        :type email_address: str
        :rtype: costume.api.models.user.user_entry.UserEntry
        '''

        if email_address is None:
            raise ValueError('email_address is required')
        if not isinstance(email_address, basestring):
            raise TypeError("expected email_address to be a str but it is a %s" % getattr(__builtin__, 'type')(email_address))

        get_user_by_email_address_return_value = self._get_user_by_email_address(email_address=email_address)

        if not isinstance(get_user_by_email_address_return_value, costume.api.models.user.user_entry.UserEntry):
            raise TypeError(getattr(__builtin__, 'type')(get_user_by_email_address_return_value))

        return get_user_by_email_address_return_value

    def _get_user_by_email_address(
        self,
        email_address,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_user_by_email_address')

    def get_user_by_id(
        self,
        id=None,  # @ReservedAssignment
    ):
        '''
        :type id: str
        :rtype: costume.api.models.user.user.User
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, basestring):
            raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))

        get_user_by_id_return_value = self._get_user_by_id(id=id)

        if not isinstance(get_user_by_id_return_value, costume.api.models.user.user.User):
            raise TypeError(getattr(__builtin__, 'type')(get_user_by_id_return_value))

        return get_user_by_id_return_value

    def _get_user_by_id(
        self,
        id,  # @ReservedAssignment
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_user_by_id')
