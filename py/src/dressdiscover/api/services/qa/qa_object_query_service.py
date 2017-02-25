from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.models.qa.qa_object


class QaObjectQueryService(object):
    def get_object_by_id(
        self,
        id=None,  # @ReservedAssignment
    ):
        '''
        :type id: str
        :rtype: dressdiscover.api.models.qa.qa_object.QaObject
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, basestring):
            raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))

        get_object_by_id_return_value = self._get_object_by_id(id=id)

        if not isinstance(get_object_by_id_return_value, dressdiscover.api.models.qa.qa_object.QaObject):
            raise TypeError(getattr(__builtin__, 'type')(get_object_by_id_return_value))

        return get_object_by_id_return_value

    def _get_object_by_id(
        self,
        id,  # @ReservedAssignment
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_object_by_id')

    def get_objects(
        self,
    ):
        '''
        :rtype: tuple(dressdiscover.api.models.qa.qa_object.QaObject)
        '''

        get_objects_return_value = self._get_objects()

        if not (isinstance(get_objects_return_value, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.qa.qa_object.QaObject), get_objects_return_value))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(get_objects_return_value))

        return get_objects_return_value

    def _get_objects(
        self,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_objects')
