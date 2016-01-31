import __builtin__
import costume.api.models.user.user


class UserQueryService(object):
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
