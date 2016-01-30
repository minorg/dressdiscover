import __builtin__
import costume.api.models.user.user


class UserCommandService(object):
    def delete_user_by_id(
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

        self._delete_user_by_id(id=id)

    def _delete_user_by_id(
        self,
        id,  # @ReservedAssignment
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._delete_user_by_id')

    def delete_users(
        self,
    ):
        self._delete_users()

    def _delete_users(
        self,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._delete_users')

    def put_user(
        self,
        id=None,  # @ReservedAssignment
        user=None,
    ):
        '''
        :type id: str
        :type user: costume.api.models.user.user.User
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, basestring):
            raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))
        if user is None:
            raise ValueError('user is required')
        if not isinstance(user, costume.api.models.user.user.User):
            raise TypeError("expected user to be a costume.api.models.user.user.User but it is a %s" % getattr(__builtin__, 'type')(user))

        self._put_user(id=id, user=user)

    def _put_user(
        self,
        id,  # @ReservedAssignment
        user,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._put_user')
