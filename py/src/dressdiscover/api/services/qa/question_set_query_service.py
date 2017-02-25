from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.models.qa.question_set


class QuestionSetQueryService(object):
    def get_question_sets(
        self,
        ids=None,
    ):
        '''
        :type ids: tuple(str)
        :rtype: tuple(dressdiscover.api.models.qa.question_set.QuestionSet)
        '''

        if ids is None:
            raise ValueError('ids is required')
        if not (isinstance(ids, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), ids))) == 0):
            raise TypeError("expected ids to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(ids))

        get_question_sets_return_value = self._get_question_sets(ids=ids)

        if not (isinstance(get_question_sets_return_value, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.qa.question_set.QuestionSet), get_question_sets_return_value))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(get_question_sets_return_value))

        return get_question_sets_return_value

    def _get_question_sets(
        self,
        ids,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_question_sets')
