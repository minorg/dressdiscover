from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.models.qa.answer_set
import dressdiscover.api.models.qa.qa_object
import dressdiscover.api.models.qa.question_set


class QaQueryService(object):
    def get_answer_set(
        self,
        object_id=None,
        question_set_id=None,
        user_id=None,
    ):
        '''
        :type object_id: str
        :type question_set_id: str
        :type user_id: str
        :rtype: dressdiscover.api.models.qa.answer_set.AnswerSet
        '''

        if object_id is None:
            raise ValueError('object_id is required')
        if not isinstance(object_id, basestring):
            raise TypeError("expected object_id to be a str but it is a %s" % getattr(__builtin__, 'type')(object_id))
        if question_set_id is None:
            raise ValueError('question_set_id is required')
        if not isinstance(question_set_id, basestring):
            raise TypeError("expected question_set_id to be a str but it is a %s" % getattr(__builtin__, 'type')(question_set_id))
        if user_id is None:
            raise ValueError('user_id is required')
        if not isinstance(user_id, basestring):
            raise TypeError("expected user_id to be a str but it is a %s" % getattr(__builtin__, 'type')(user_id))

        get_answer_set_return_value = self._get_answer_set(object_id=object_id, question_set_id=question_set_id, user_id=user_id)

        if not isinstance(get_answer_set_return_value, dressdiscover.api.models.qa.answer_set.AnswerSet):
            raise TypeError(getattr(__builtin__, 'type')(get_answer_set_return_value))

        return get_answer_set_return_value

    def _get_answer_set(
        self,
        object_id,
        question_set_id,
        user_id,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_answer_set')

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
