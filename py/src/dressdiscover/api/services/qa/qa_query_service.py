from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.models.qa.qa_object
import dressdiscover.api.models.qa.question_set


class QaQueryService(object):
    def get_objects(
        self,
    ):
        '''
        :rtype: frozenset(dressdiscover.api.models.qa.qa_object.QaObject)
        '''

        get_objects_return_value = self._get_objects()

        if not (isinstance(get_objects_return_value, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.qa.qa_object.QaObject), get_objects_return_value))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(get_objects_return_value))

        return get_objects_return_value

    def _get_objects(
        self,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_objects')

    def get_question_sets(
        self,
        ids=None,
    ):
        '''
        :type ids: frozenset(str)
        :rtype: dict(str: dressdiscover.api.models.qa.question_set.QuestionSet)
        '''

        if ids is None:
            raise ValueError('ids is required')
        if not (isinstance(ids, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), ids))) == 0):
            raise TypeError("expected ids to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(ids))

        get_question_sets_return_value = self._get_question_sets(ids=ids)

        if not (isinstance(get_question_sets_return_value, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], dressdiscover.api.models.qa.question_set.QuestionSet), get_question_sets_return_value.iteritems()))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(get_question_sets_return_value))

        return get_question_sets_return_value

    def _get_question_sets(
        self,
        ids,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_question_sets')
