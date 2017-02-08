from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.models.qa.question_id
import dressdiscover.api.models.qa.question_value


class Question(object):
    class Builder(object):
        def __init__(
            self,
            id=None,  # @ReservedAssignment
            text=None,
            values=None,
        ):
            '''
            :type id: str
            :type text: str
            :type values: tuple(dressdiscover.api.models.qa.question_value.QuestionValue) or None
            '''

            self.__id = id
            self.__text = text
            self.__values = values

        def build(self):
            return Question(id=self.__id, text=self.__text, values=self.__values)

        @property
        def id(self):  # @ReservedAssignment
            '''
            :rtype: str
            '''

            return self.__id

        def set_id(self, id):  # @ReservedAssignment
            '''
            :type id: str
            '''

            if id is None:
                raise ValueError('id is required')
            if not isinstance(id, basestring):
                raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))
            self.__id = id
            return self

        def set_text(self, text):
            '''
            :type text: str
            '''

            if text is None:
                raise ValueError('text is required')
            if not isinstance(text, basestring):
                raise TypeError("expected text to be a str but it is a %s" % getattr(__builtin__, 'type')(text))
            if text.isspace():
                raise ValueError("expected text not to be blank")
            if len(text) < 1:
                raise ValueError("expected len(text) to be >= 1, was %d" % len(text))
            self.__text = text
            return self

        def set_values(self, values):
            '''
            :type values: tuple(dressdiscover.api.models.qa.question_value.QuestionValue) or None
            '''

            if values is not None:
                if not (isinstance(values, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.qa.question_value.QuestionValue), values))) == 0):
                    raise TypeError("expected values to be a tuple(dressdiscover.api.models.qa.question_value.QuestionValue) but it is a %s" % getattr(__builtin__, 'type')(values))
                if len(values) < 1:
                    raise ValueError("expected len(values) to be >= 1, was %d" % len(values))
            self.__values = values
            return self

        @property
        def text(self):
            '''
            :rtype: str
            '''

            return self.__text

        def update(self, question):
            '''
            :type id: str
            :type text: str
            :type values: tuple(dressdiscover.api.models.qa.question_value.QuestionValue) or None
            '''

            if isinstance(question, Question):
                self.set_id(question.id)
                self.set_text(question.text)
                self.set_values(question.values)
            elif isinstance(question, dict):
                for key, value in question.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(question)
            return self

        @property
        def values(self):
            '''
            :rtype: tuple(dressdiscover.api.models.qa.question_value.QuestionValue)
            '''

            return self.__values

        @id.setter
        def id(self, id):  # @ReservedAssignment
            '''
            :type id: str
            '''

            self.set_id(id)

        @text.setter
        def text(self, text):
            '''
            :type text: str
            '''

            self.set_text(text)

        @values.setter
        def values(self, values):
            '''
            :type values: tuple(dressdiscover.api.models.qa.question_value.QuestionValue) or None
            '''

            self.set_values(values)

    class FieldMetadata(object):
        ID = None
        TEXT = None
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
            return (cls.ID, cls.TEXT, cls.VALUES,)

    FieldMetadata.ID = FieldMetadata('id', dressdiscover.api.models.qa.question_id.QuestionId, None)
    FieldMetadata.TEXT = FieldMetadata('text', str, {u'blank': False, u'minLength': 1})
    FieldMetadata.VALUES = FieldMetadata('values', tuple, {u'minLength': 1})

    def __init__(
        self,
        id,  # @ReservedAssignment
        text,
        values=None,
    ):
        '''
        :type id: str
        :type text: str
        :type values: tuple(dressdiscover.api.models.qa.question_value.QuestionValue) or None
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, basestring):
            raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))
        self.__id = id

        if text is None:
            raise ValueError('text is required')
        if not isinstance(text, basestring):
            raise TypeError("expected text to be a str but it is a %s" % getattr(__builtin__, 'type')(text))
        if text.isspace():
            raise ValueError("expected text not to be blank")
        if len(text) < 1:
            raise ValueError("expected len(text) to be >= 1, was %d" % len(text))
        self.__text = text

        if values is not None:
            if not (isinstance(values, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.qa.question_value.QuestionValue), values))) == 0):
                raise TypeError("expected values to be a tuple(dressdiscover.api.models.qa.question_value.QuestionValue) but it is a %s" % getattr(__builtin__, 'type')(values))
            if len(values) < 1:
                raise ValueError("expected len(values) to be >= 1, was %d" % len(values))
        self.__values = values

    def __eq__(self, other):
        if self.id != other.id:
            return False
        if self.text != other.text:
            return False
        if self.values != other.values:
            return False
        return True

    def __hash__(self):
        return hash((self.id,self.text,self.values,))

    def __iter__(self):
        return iter((self.id, self.text, self.values,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        if self.values is not None:
            field_reprs.append('values=' + repr(self.values))
        return 'Question(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        if self.values is not None:
            field_reprs.append('values=' + repr(self.values))
        return 'Question(' + ', '.join(field_reprs) + ')'

    @property
    def id(self):  # @ReservedAssignment
        '''
        :rtype: str
        '''

        return self.__id

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.qa.question.Question
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'id':
                init_kwds['id'] = iprot.read_string()
            elif ifield_name == 'text':
                init_kwds['text'] = iprot.read_string()
            elif ifield_name == 'values':
                init_kwds['values'] = tuple([dressdiscover.api.models.qa.question_value.QuestionValue.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        id=None,  # @ReservedAssignment
        text=None,
        values=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type id: str or None
        :type text: str or None
        :type values: tuple(dressdiscover.api.models.qa.question_value.QuestionValue) or None
        :rtype: dressdiscover.api.models.qa.question.Question
        '''

        if id is None:
            id = self.id  # @ReservedAssignment
        if text is None:
            text = self.text
        if values is None:
            values = self.values
        return self.__class__(id=id, text=text, values=values)

    @property
    def text(self):
        '''
        :rtype: str
        '''

        return self.__text

    @property
    def values(self):
        '''
        :rtype: tuple(dressdiscover.api.models.qa.question_value.QuestionValue)
        '''

        return self.__values

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.qa.question.Question
        '''

        oprot.write_struct_begin('Question')

        oprot.write_field_begin(name='id', type=11, id=None)
        oprot.write_string(self.id)
        oprot.write_field_end()

        oprot.write_field_begin(name='text', type=11, id=None)
        oprot.write_string(self.text)
        oprot.write_field_end()

        if self.values is not None:
            oprot.write_field_begin(name='values', type=15, id=None)
            oprot.write_list_begin(12, len(self.values))
            for _0 in self.values:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
