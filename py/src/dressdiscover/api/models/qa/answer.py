from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.models.qa.answer_value
import dressdiscover.api.models.qa.qa_object_id
import dressdiscover.api.models.qa.qa_user_id
import dressdiscover.api.models.qa.question_id
import dressdiscover.api.models.qa.question_set_id


class Answer(object):
    class Builder(object):
        def __init__(
            self,
            object_id=None,
            question_id=None,
            question_set_id=None,
            user_id=None,
            values=None,
        ):
            '''
            :type object_id: str
            :type question_id: str
            :type question_set_id: str
            :type user_id: str
            :type values: tuple(dressdiscover.api.models.qa.answer_value.AnswerValue)
            '''

            self.__object_id = object_id
            self.__question_id = question_id
            self.__question_set_id = question_set_id
            self.__user_id = user_id
            self.__values = values

        def build(self):
            return Answer(object_id=self.__object_id, question_id=self.__question_id, question_set_id=self.__question_set_id, user_id=self.__user_id, values=self.__values)

        @property
        def object_id(self):
            '''
            :rtype: str
            '''

            return self.__object_id

        @property
        def question_id(self):
            '''
            :rtype: str
            '''

            return self.__question_id

        @property
        def question_set_id(self):
            '''
            :rtype: str
            '''

            return self.__question_set_id

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

        def set_question_id(self, question_id):
            '''
            :type question_id: str
            '''

            if question_id is None:
                raise ValueError('question_id is required')
            if not isinstance(question_id, basestring):
                raise TypeError("expected question_id to be a str but it is a %s" % getattr(__builtin__, 'type')(question_id))
            self.__question_id = question_id
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

        def set_user_id(self, user_id):
            '''
            :type user_id: str
            '''

            if user_id is None:
                raise ValueError('user_id is required')
            if not isinstance(user_id, basestring):
                raise TypeError("expected user_id to be a str but it is a %s" % getattr(__builtin__, 'type')(user_id))
            self.__user_id = user_id
            return self

        def set_values(self, values):
            '''
            :type values: tuple(dressdiscover.api.models.qa.answer_value.AnswerValue)
            '''

            if values is None:
                raise ValueError('values is required')
            if not (isinstance(values, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.qa.answer_value.AnswerValue), values))) == 0):
                raise TypeError("expected values to be a tuple(dressdiscover.api.models.qa.answer_value.AnswerValue) but it is a %s" % getattr(__builtin__, 'type')(values))
            if len(values) < 1:
                raise ValueError("expected len(values) to be >= 1, was %d" % len(values))
            self.__values = values
            return self

        def update(self, answer):
            '''
            :type object_id: str
            :type question_id: str
            :type question_set_id: str
            :type user_id: str
            :type values: tuple(dressdiscover.api.models.qa.answer_value.AnswerValue)
            '''

            if isinstance(answer, Answer):
                self.set_object_id(answer.object_id)
                self.set_question_id(answer.question_id)
                self.set_question_set_id(answer.question_set_id)
                self.set_user_id(answer.user_id)
                self.set_values(answer.values)
            elif isinstance(answer, dict):
                for key, value in answer.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(answer)
            return self

        @property
        def user_id(self):
            '''
            :rtype: str
            '''

            return self.__user_id

        @property
        def values(self):
            '''
            :rtype: tuple(dressdiscover.api.models.qa.answer_value.AnswerValue)
            '''

            return self.__values

        @object_id.setter
        def object_id(self, object_id):
            '''
            :type object_id: str
            '''

            self.set_object_id(object_id)

        @question_id.setter
        def question_id(self, question_id):
            '''
            :type question_id: str
            '''

            self.set_question_id(question_id)

        @question_set_id.setter
        def question_set_id(self, question_set_id):
            '''
            :type question_set_id: str
            '''

            self.set_question_set_id(question_set_id)

        @user_id.setter
        def user_id(self, user_id):
            '''
            :type user_id: str
            '''

            self.set_user_id(user_id)

        @values.setter
        def values(self, values):
            '''
            :type values: tuple(dressdiscover.api.models.qa.answer_value.AnswerValue)
            '''

            self.set_values(values)

    class FieldMetadata(object):
        OBJECT_ID = None
        QUESTION_ID = None
        QUESTION_SET_ID = None
        USER_ID = None
        VALUES = None

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
            return (cls.OBJECT_ID, cls.QUESTION_ID, cls.QUESTION_SET_ID, cls.USER_ID, cls.VALUES,)

    FieldMetadata.OBJECT_ID = FieldMetadata('object_id', dressdiscover.api.models.qa.qa_object_id.QaObjectId, None)
    FieldMetadata.QUESTION_ID = FieldMetadata('question_id', dressdiscover.api.models.qa.question_id.QuestionId, None)
    FieldMetadata.QUESTION_SET_ID = FieldMetadata('question_set_id', dressdiscover.api.models.qa.question_set_id.QuestionSetId, None)
    FieldMetadata.USER_ID = FieldMetadata('user_id', dressdiscover.api.models.qa.qa_user_id.QaUserId, None)
    FieldMetadata.VALUES = FieldMetadata('values', tuple, {u'minLength': 1})

    def __init__(
        self,
        object_id,
        question_id,
        question_set_id,
        user_id,
        values,
    ):
        '''
        :type object_id: str
        :type question_id: str
        :type question_set_id: str
        :type user_id: str
        :type values: tuple(dressdiscover.api.models.qa.answer_value.AnswerValue)
        '''

        if object_id is None:
            raise ValueError('object_id is required')
        if not isinstance(object_id, basestring):
            raise TypeError("expected object_id to be a str but it is a %s" % getattr(__builtin__, 'type')(object_id))
        self.__object_id = object_id

        if question_id is None:
            raise ValueError('question_id is required')
        if not isinstance(question_id, basestring):
            raise TypeError("expected question_id to be a str but it is a %s" % getattr(__builtin__, 'type')(question_id))
        self.__question_id = question_id

        if question_set_id is None:
            raise ValueError('question_set_id is required')
        if not isinstance(question_set_id, basestring):
            raise TypeError("expected question_set_id to be a str but it is a %s" % getattr(__builtin__, 'type')(question_set_id))
        self.__question_set_id = question_set_id

        if user_id is None:
            raise ValueError('user_id is required')
        if not isinstance(user_id, basestring):
            raise TypeError("expected user_id to be a str but it is a %s" % getattr(__builtin__, 'type')(user_id))
        self.__user_id = user_id

        if values is None:
            raise ValueError('values is required')
        if not (isinstance(values, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.qa.answer_value.AnswerValue), values))) == 0):
            raise TypeError("expected values to be a tuple(dressdiscover.api.models.qa.answer_value.AnswerValue) but it is a %s" % getattr(__builtin__, 'type')(values))
        if len(values) < 1:
            raise ValueError("expected len(values) to be >= 1, was %d" % len(values))
        self.__values = values

    def __eq__(self, other):
        if self.object_id != other.object_id:
            return False
        if self.question_id != other.question_id:
            return False
        if self.question_set_id != other.question_set_id:
            return False
        if self.user_id != other.user_id:
            return False
        if self.values != other.values:
            return False
        return True

    def __hash__(self):
        return hash((self.object_id,self.question_id,self.question_set_id,self.user_id,self.values,))

    def __iter__(self):
        return iter((self.object_id, self.question_id, self.question_set_id, self.user_id, self.values,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('object_id=' + "'" + self.object_id.encode('ascii', 'replace') + "'")
        field_reprs.append('question_id=' + "'" + self.question_id.encode('ascii', 'replace') + "'")
        field_reprs.append('question_set_id=' + "'" + self.question_set_id.encode('ascii', 'replace') + "'")
        field_reprs.append('user_id=' + "'" + self.user_id.encode('ascii', 'replace') + "'")
        field_reprs.append('values=' + repr(self.values))
        return 'Answer(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('object_id=' + "'" + self.object_id.encode('ascii', 'replace') + "'")
        field_reprs.append('question_id=' + "'" + self.question_id.encode('ascii', 'replace') + "'")
        field_reprs.append('question_set_id=' + "'" + self.question_set_id.encode('ascii', 'replace') + "'")
        field_reprs.append('user_id=' + "'" + self.user_id.encode('ascii', 'replace') + "'")
        field_reprs.append('values=' + repr(self.values))
        return 'Answer(' + ', '.join(field_reprs) + ')'

    @property
    def object_id(self):
        '''
        :rtype: str
        '''

        return self.__object_id

    @property
    def question_id(self):
        '''
        :rtype: str
        '''

        return self.__question_id

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
        :rtype: dressdiscover.api.models.qa.answer.Answer
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'object_id' and ifield_id == 1:
                init_kwds['object_id'] = iprot.read_string()
            elif ifield_name == 'question_id' and ifield_id == 2:
                init_kwds['question_id'] = iprot.read_string()
            elif ifield_name == 'question_set_id' and ifield_id == 3:
                init_kwds['question_set_id'] = iprot.read_string()
            elif ifield_name == 'user_id' and ifield_id == 4:
                init_kwds['user_id'] = iprot.read_string()
            elif ifield_name == 'values' and ifield_id == 5:
                init_kwds['values'] = tuple([dressdiscover.api.models.qa.answer_value.AnswerValue.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        object_id=None,
        question_id=None,
        question_set_id=None,
        user_id=None,
        values=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type object_id: str or None
        :type question_id: str or None
        :type question_set_id: str or None
        :type user_id: str or None
        :type values: tuple(dressdiscover.api.models.qa.answer_value.AnswerValue) or None
        :rtype: dressdiscover.api.models.qa.answer.Answer
        '''

        if object_id is None:
            object_id = self.object_id
        if question_id is None:
            question_id = self.question_id
        if question_set_id is None:
            question_set_id = self.question_set_id
        if user_id is None:
            user_id = self.user_id
        if values is None:
            values = self.values
        return self.__class__(object_id=object_id, question_id=question_id, question_set_id=question_set_id, user_id=user_id, values=values)

    @property
    def user_id(self):
        '''
        :rtype: str
        '''

        return self.__user_id

    @property
    def values(self):
        '''
        :rtype: tuple(dressdiscover.api.models.qa.answer_value.AnswerValue)
        '''

        return self.__values

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.qa.answer.Answer
        '''

        oprot.write_struct_begin('Answer')

        oprot.write_field_begin(name='object_id', type=11, id=1)
        oprot.write_string(self.object_id)
        oprot.write_field_end()

        oprot.write_field_begin(name='question_id', type=11, id=2)
        oprot.write_string(self.question_id)
        oprot.write_field_end()

        oprot.write_field_begin(name='question_set_id', type=11, id=3)
        oprot.write_string(self.question_set_id)
        oprot.write_field_end()

        oprot.write_field_begin(name='user_id', type=11, id=4)
        oprot.write_string(self.user_id)
        oprot.write_field_end()

        oprot.write_field_begin(name='values', type=15, id=5)
        oprot.write_list_begin(12, len(self.values))
        for _0 in self.values:
            _0.write(oprot)
        oprot.write_list_end()
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
