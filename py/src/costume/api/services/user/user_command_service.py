import __builtin__
import costume.api.models.user.user
import costume.api.models.user.user_bookmark


class UserCommandService(object):
    def delete_user_bookmark_by_id(
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

        self._delete_user_bookmark_by_id(id=id)

    def _delete_user_bookmark_by_id(
        self,
        id,  # @ReservedAssignment
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._delete_user_bookmark_by_id')

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

    def post_user(
        self,
        user=None,
    ):
        '''
        :type user: costume.api.models.user.user.User
        :rtype: str
        '''

        if user is None:
            raise ValueError('user is required')
        if not isinstance(user, costume.api.models.user.user.User):
            raise TypeError("expected user to be a costume.api.models.user.user.User but it is a %s" % getattr(__builtin__, 'type')(user))

        post_user_return_value = self._post_user(user=user)

        if not isinstance(post_user_return_value, basestring):
            raise TypeError(getattr(__builtin__, 'type')(post_user_return_value))

        return post_user_return_value

    def _post_user(
        self,
        user,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._post_user')

    def post_user_bookmark(
        self,
        user_bookmark=None,
    ):
        '''
        :type user_bookmark: costume.api.models.user.user_bookmark.UserBookmark
        :rtype: str
        '''

        if user_bookmark is None:
            raise ValueError('user_bookmark is required')
        if not isinstance(user_bookmark, costume.api.models.user.user_bookmark.UserBookmark):
            raise TypeError("expected user_bookmark to be a costume.api.models.user.user_bookmark.UserBookmark but it is a %s" % getattr(__builtin__, 'type')(user_bookmark))

        post_user_bookmark_return_value = self._post_user_bookmark(user_bookmark=user_bookmark)

        if not isinstance(post_user_bookmark_return_value, basestring):
            raise TypeError(getattr(__builtin__, 'type')(post_user_bookmark_return_value))

        return post_user_bookmark_return_value

    def _post_user_bookmark(
        self,
        user_bookmark,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._post_user_bookmark')

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
