from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.models.qa.question_definition


class QuestionSetDefinition(object):
    class Builder(object):
        def __init__(
            self,
            questions=None,
        ):
            '''
            :type questions: tuple(dressdiscover.api.models.qa.question_definition.QuestionDefinition)
            '''

            self.__questions = questions

        def build(self):
            return QuestionSetDefinition(questions=self.__questions)

        @property
        def questions(self):
            '''
            :rtype: tuple(dressdiscover.api.models.qa.question_definition.QuestionDefinition)
            '''

            return self.__questions

        def set_questions(self, questions):
            '''
            :type questions: tuple(dressdiscover.api.models.qa.question_definition.QuestionDefinition)
            '''

            if questions is None:
                raise ValueError('questions is required')
            if not (isinstance(questions, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.qa.question_definition.QuestionDefinition), questions))) == 0):
                raise TypeError("expected questions to be a tuple(dressdiscover.api.models.qa.question_definition.QuestionDefinition) but it is a %s" % getattr(__builtin__, 'type')(questions))
            if len(questions) < 1:
                raise ValueError("expected len(questions) to be >= 1, was %d" % len(questions))
            self.__questions = questions
            return self

        def update(self, question_set_definition):
            '''
            :type questions: tuple(dressdiscover.api.models.qa.question_definition.QuestionDefinition)
            '''

            if isinstance(question_set_definition, QuestionSetDefinition):
                self.set_questions(question_set_definition.questions)
            elif isinstance(question_set_definition, dict):
                for key, value in question_set_definition.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(question_set_definition)
            return self

        @questions.setter
        def questions(self, questions):
            '''
            :type questions: tuple(dressdiscover.api.models.qa.question_definition.QuestionDefinition)
            '''

            self.set_questions(questions)

    class FieldMetadata(object):
        QUESTIONS = None

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
            return (cls.QUESTIONS,)

    FieldMetadata.QUESTIONS = FieldMetadata('questions', tuple, {u'minLength': 1})

    def __init__(
        self,
        questions,
    ):
        '''
        :type questions: tuple(dressdiscover.api.models.qa.question_definition.QuestionDefinition)
        '''

        if questions is None:
            raise ValueError('questions is required')
        if not (isinstance(questions, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.qa.question_definition.QuestionDefinition), questions))) == 0):
            raise TypeError("expected questions to be a tuple(dressdiscover.api.models.qa.question_definition.QuestionDefinition) but it is a %s" % getattr(__builtin__, 'type')(questions))
        if len(questions) < 1:
            raise ValueError("expected len(questions) to be >= 1, was %d" % len(questions))
        self.__questions = questions

    def __eq__(self, other):
        if self.questions != other.questions:
            return False
        return True

    def __hash__(self):
        return hash(self.questions)

    def __iter__(self):
        return iter((self.questions,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('questions=' + repr(self.questions))
        return 'QuestionSetDefinition(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('questions=' + repr(self.questions))
        return 'QuestionSetDefinition(' + ', '.join(field_reprs) + ')'

    @property
    def questions(self):
        '''
        :rtype: tuple(dressdiscover.api.models.qa.question_definition.QuestionDefinition)
        '''

        return self.__questions

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.qa.question_set_definition.QuestionSetDefinition
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'questions':
                init_kwds['questions'] = tuple([dressdiscover.api.models.qa.question_definition.QuestionDefinition.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        questions=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type questions: tuple(dressdiscover.api.models.qa.question_definition.QuestionDefinition) or None
        :rtype: dressdiscover.api.models.qa.question_set_definition.QuestionSetDefinition
        '''

        if questions is None:
            questions = self.questions
        return self.__class__(questions=questions)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.qa.question_set_definition.QuestionSetDefinition
        '''

        oprot.write_struct_begin('QuestionSetDefinition')

        oprot.write_field_begin(name='questions', type=15, id=None)
        oprot.write_list_begin(12, len(self.questions))
        for _0 in self.questions:
            _0.write(oprot)
        oprot.write_list_end()
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
