import __builtin__
import costume.api.models.object.object


class ObjectCommandService(object):
    def delete_objects(
        self,
    ):
        self._delete_objects()

    def _delete_objects(
        self,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._delete_objects')

    def post_object(
        self,
        object=None,  # @ReservedAssignment
    ):
        '''
        :type object: costume.api.models.object.object.Object
        :rtype: str
        '''

        if object is None:
            raise ValueError('object is required')
        if not isinstance(object, costume.api.models.object.object.Object):
            raise TypeError("expected object to be a costume.api.models.object.object.Object but it is a %s" % getattr(__builtin__, 'type')(object))

        post_object_return_value = self._post_object(object=object)

        if not isinstance(post_object_return_value, basestring):
            raise TypeError(getattr(__builtin__, 'type')(post_object_return_value))

        return post_object_return_value

    def _post_object(
        self,
        object,  # @ReservedAssignment
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._post_object')
