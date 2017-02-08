from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.models.qa.answer
import dressdiscover.api.models.qa.qa_object_id
import dressdiscover.api.models.qa.question_set_id


class AnswerSet(object):
    class Builder(object):
        def __init__(
            self,
            object_id=None,
            question_set_id=None,
            answers=None,
        ):
            '''
            :type object_id: str
            :type question_set_id: str
            :type answers: tuple(dressdiscover.api.models.qa.answer.Answer) or None
            '''

            self.__object_id = object_id
            self.__question_set_id = question_set_id
            self.__answers = answers

        def build(self):
            return AnswerSet(object_id=self.__object_id, question_set_id=self.__question_set_id, answers=self.__answers)

        @property
        def answers(self):
            '''
            :rtype: tuple(dressdiscover.api.models.qa.answer.Answer)
            '''

            return self.__answers

        @property
        def object_id(self):
            '''
            :rtype: str
            '''

            return self.__object_id

        @property
        def question_set_id(self):
            '''
            :rtype: str
            '''

            return self.__question_set_id

        def set_answers(self, answers):
            '''
            :type answers: tuple(dressdiscover.api.models.qa.answer.Answer) or None
            '''

            if answers is not None:
                if not (isinstance(answers, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.qa.answer.Answer), answers))) == 0):
                    raise TypeError("expected answers to be a tuple(dressdiscover.api.models.qa.answer.Answer) but it is a %s" % getattr(__builtin__, 'type')(answers))
                if len(answers) < 1:
                    raise ValueError("expected len(answers) to be >= 1, was %d" % len(answers))
            self.__answers = answers
            return self

        def set_object_id(self, object_id):
            '''
            :type object_id: str
            '''

            if object_id is None:
                raise ValueError('object_id is required')
            if not isinstance(object_id, basestring):
                raise TypeError("expected object_id to be a str but it is a %s" % getattr(__builtin__, 'type')(object_id))
            self.__object_id = object_id
            return self

        def set_question_set_id(self, question_set_id):
            '''
            :type question_set_id: str
            '''

            if question_set_id is None:
                raise ValueError('question_set_id is required')
            if not isinstance(question_set_id, basestring):
                raise TypeError("expected question_set_id to be a str but it is a %s" % getattr(__builtin__, 'type')(question_set_id))
            self.__question_set_id = question_set_id
            return self

        def update(self, answer_set):
            '''
            :type object_id: str
            :type question_set_id: str
            :type answers: tuple(dressdiscover.api.models.qa.answer.Answer) or None
            '''

            if isinstance(answer_set, AnswerSet):
                self.set_object_id(answer_set.object_id)
                self.set_question_set_id(answer_set.question_set_id)
                self.set_answers(answer_set.answers)
            elif isinstance(answer_set, dict):
                for key, value in answer_set.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(answer_set)
            return self

        @answers.setter
        def answers(self, answers):
            '''
            :type answers: tuple(dressdiscover.api.models.qa.answer.Answer) or None
            '''

            self.set_answers(answers)

        @object_id.setter
        def object_id(self, object_id):
            '''
            :type object_id: str
            '''

            self.set_object_id(object_id)

        @question_set_id.setter
        def question_set_id(self, question_set_id):
            '''
            :type question_set_id: str
            '''

            self.set_question_set_id(question_set_id)

    class FieldMetadata(object):
        OBJECT_ID = None
        QUESTION_SET_ID = None
        ANSWERS = None

        def __init__(self, name, type_, validation):
            object.__init__(self)
            self.__name = name
            self.__type = type_
            self.__validation = validation

        @property
        def name(self):
            return self.__name

        def __repr__(self):
            return self.__name

        def __str__(self):
            return self.__name

        @property
        def type(self):
            return self.__type

        @property
        def validation(self):
            return self.__validation

        @classmethod
        def values(cls):
            return (cls.OBJECT_ID, cls.QUESTION_SET_ID, cls.ANSWERS,)

    FieldMetadata.OBJECT_ID = FieldMetadata('object_id', dressdiscover.api.models.qa.qa_object_id.QaObjectId, None)
    FieldMetadata.QUESTION_SET_ID = FieldMetadata('question_set_id', dressdiscover.api.models.qa.question_set_id.QuestionSetId, None)
    FieldMetadata.ANSWERS = FieldMetadata('answers', tuple, {u'minLength': 1})

    def __init__(
        self,
        object_id,
        question_set_id,
        answers=None,
    ):
        '''
        :type object_id: str
        :type question_set_id: str
        :type answers: tuple(dressdiscover.api.models.qa.answer.Answer) or None
        '''

        if object_id is None:
            raise ValueError('object_id is required')
        if not isinstance(object_id, basestring):
            raise TypeError("expected object_id to be a str but it is a %s" % getattr(__builtin__, 'type')(object_id))
        self.__object_id = object_id

        if question_set_id is None:
            raise ValueError('question_set_id is required')
        if not isinstance(question_set_id, basestring):
            raise TypeError("expected question_set_id to be a str but it is a %s" % getattr(__builtin__, 'type')(question_set_id))
        self.__question_set_id = question_set_id

        if answers is not None:
            if not (isinstance(answers, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.qa.answer.Answer), answers))) == 0):
                raise TypeError("expected answers to be a tuple(dressdiscover.api.models.qa.answer.Answer) but it is a %s" % getattr(__builtin__, 'type')(answers))
            if len(answers) < 1:
                raise ValueError("expected len(answers) to be >= 1, was %d" % len(answers))
        self.__answers = answers

    def __eq__(self, other):
        if self.object_id != other.object_id:
            return False
        if self.question_set_id != other.question_set_id:
            return False
        if self.answers != other.answers:
            return False
        return True

    def __hash__(self):
        return hash((self.object_id,self.question_set_id,self.answers,))

    def __iter__(self):
        return iter((self.object_id, self.question_set_id, self.answers,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('object_id=' + "'" + self.object_id.encode('ascii', 'replace') + "'")
        field_reprs.append('question_set_id=' + "'" + self.question_set_id.encode('ascii', 'replace') + "'")
        if self.answers is not None:
            field_reprs.append('answers=' + repr(self.answers))
        return 'AnswerSet(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('object_id=' + "'" + self.object_id.encode('ascii', 'replace') + "'")
        field_reprs.append('question_set_id=' + "'" + self.question_set_id.encode('ascii', 'replace') + "'")
        if self.answers is not None:
            field_reprs.append('answers=' + repr(self.answers))
        return 'AnswerSet(' + ', '.join(field_reprs) + ')'

    @property
    def answers(self):
        '''
        :rtype: tuple(dressdiscover.api.models.qa.answer.Answer)
        '''

        return self.__answers

    @property
    def object_id(self):
        '''
        :rtype: str
        '''

        return self.__object_id

    @property
    def question_set_id(self):
        '''
        :rtype: str
        '''

        return self.__question_set_id

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.qa.answer_set.AnswerSet
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'object_id':
                init_kwds['object_id'] = iprot.read_string()
            elif ifield_name == 'question_set_id':
                init_kwds['question_set_id'] = iprot.read_string()
            elif ifield_name == 'answers':
                init_kwds['answers'] = tuple([dressdiscover.api.models.qa.answer.Answer.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        object_id=None,
        question_set_id=None,
        answers=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type object_id: str or None
        :type question_set_id: str or None
        :type answers: tuple(dressdiscover.api.models.qa.answer.Answer) or None
        :rtype: dressdiscover.api.models.qa.answer_set.AnswerSet
        '''

        if object_id is None:
            object_id = self.object_id
        if question_set_id is None:
            question_set_id = self.question_set_id
        if answers is None:
            answers = self.answers
        return self.__class__(object_id=object_id, question_set_id=question_set_id, answers=answers)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.qa.answer_set.AnswerSet
        '''

        oprot.write_struct_begin('AnswerSet')

        oprot.write_field_begin(name='object_id', type=11, id=None)
        oprot.write_string(self.object_id)
        oprot.write_field_end()

        oprot.write_field_begin(name='question_set_id', type=11, id=None)
        oprot.write_string(self.question_set_id)
        oprot.write_field_end()

        if self.answers is not None:
            oprot.write_field_begin(name='answers', type=15, id=None)
            oprot.write_list_begin(12, len(self.answers))
            for _0 in self.answers:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
