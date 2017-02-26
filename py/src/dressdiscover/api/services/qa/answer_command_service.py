import __builtin__
import dressdiscover.api.models.qa.answer


class AnswerCommandService(object):
    def delete_answers(
        self,
    ):
        self._delete_answers()

    def _delete_answers(
        self,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._delete_answers')

    def put_answer(
        self,
        answer=None,
    ):
        '''
        :type answer: dressdiscover.api.models.qa.answer.Answer
        '''

        if answer is None:
            raise ValueError('answer is required')
        if not isinstance(answer, dressdiscover.api.models.qa.answer.Answer):
            raise TypeError("expected answer to be a dressdiscover.api.models.qa.answer.Answer but it is a %s" % getattr(__builtin__, 'type')(answer))

        self._put_answer(answer=answer)

    def _put_answer(
        self,
        answer,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._put_answer')
