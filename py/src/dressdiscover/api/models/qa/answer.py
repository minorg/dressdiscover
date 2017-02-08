from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.models.qa.question_id


class Answer(object):
    class Builder(object):
        def __init__(
            self,
            question_id=None,
            selected_values=None,
            text=None,
        ):
            '''
            :type question_id: str
            :type selected_values: tuple(str) or None
            :type text: str or None
            '''

            self.__question_id = question_id
            self.__selected_values = selected_values
            self.__text = text

        def build(self):
            return Answer(question_id=self.__question_id, selected_values=self.__selected_values, text=self.__text)

        @property
        def question_id(self):
            '''
            :rtype: str
            '''

            return self.__question_id

        @property
        def selected_values(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__selected_values

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

        def set_selected_values(self, selected_values):
            '''
            :type selected_values: tuple(str) or None
            '''

            if selected_values is not None:
                if not (isinstance(selected_values, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), selected_values))) == 0):
                    raise TypeError("expected selected_values to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(selected_values))
                if len(selected_values) < 1:
                    raise ValueError("expected len(selected_values) to be >= 1, was %d" % len(selected_values))
            self.__selected_values = selected_values
            return self

        def set_text(self, text):
            '''
            :type text: str or None
            '''

            if text is not None:
                if not isinstance(text, basestring):
                    raise TypeError("expected text to be a str but it is a %s" % getattr(__builtin__, 'type')(text))
                if text.isspace():
                    raise ValueError("expected text not to be blank")
                if len(text) < 1:
                    raise ValueError("expected len(text) to be >= 1, was %d" % len(text))
            self.__text = text
            return self

        @property
        def text(self):
            '''
            :rtype: str
            '''

            return self.__text

        def update(self, answer):
            '''
            :type question_id: str
            :type selected_values: tuple(str) or None
            :type text: str or None
            '''

            if isinstance(answer, Answer):
                self.set_question_id(answer.question_id)
                self.set_selected_values(answer.selected_values)
                self.set_text(answer.text)
            elif isinstance(answer, dict):
                for key, value in answer.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(answer)
            return self

        @question_id.setter
        def question_id(self, question_id):
            '''
            :type question_id: str
            '''

            self.set_question_id(question_id)

        @selected_values.setter
        def selected_values(self, selected_values):
            '''
            :type selected_values: tuple(str) or None
            '''

            self.set_selected_values(selected_values)

        @text.setter
        def text(self, text):
            '''
            :type text: str or None
            '''

            self.set_text(text)

    class FieldMetadata(object):
        QUESTION_ID = None
        SELECTED_VALUES = None
        TEXT = None

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
            return (cls.QUESTION_ID, cls.SELECTED_VALUES, cls.TEXT,)

    FieldMetadata.QUESTION_ID = FieldMetadata('question_id', dressdiscover.api.models.qa.question_id.QuestionId, None)
    FieldMetadata.SELECTED_VALUES = FieldMetadata('selected_values', tuple, {u'minLength': 1})
    FieldMetadata.TEXT = FieldMetadata('text', str, {u'blank': False, u'minLength': 1})

    def __init__(
        self,
        question_id,
        selected_values=None,
        text=None,
    ):
        '''
        :type question_id: str
        :type selected_values: tuple(str) or None
        :type text: str or None
        '''

        if question_id is None:
            raise ValueError('question_id is required')
        if not isinstance(question_id, basestring):
            raise TypeError("expected question_id to be a str but it is a %s" % getattr(__builtin__, 'type')(question_id))
        self.__question_id = question_id

        if selected_values is not None:
            if not (isinstance(selected_values, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), selected_values))) == 0):
                raise TypeError("expected selected_values to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(selected_values))
            if len(selected_values) < 1:
                raise ValueError("expected len(selected_values) to be >= 1, was %d" % len(selected_values))
        self.__selected_values = selected_values

        if text is not None:
            if not isinstance(text, basestring):
                raise TypeError("expected text to be a str but it is a %s" % getattr(__builtin__, 'type')(text))
            if text.isspace():
                raise ValueError("expected text not to be blank")
            if len(text) < 1:
                raise ValueError("expected len(text) to be >= 1, was %d" % len(text))
        self.__text = text

    def __eq__(self, other):
        if self.question_id != other.question_id:
            return False
        if self.selected_values != other.selected_values:
            return False
        if self.text != other.text:
            return False
        return True

    def __hash__(self):
        return hash((self.question_id,self.selected_values,self.text,))

    def __iter__(self):
        return iter((self.question_id, self.selected_values, self.text,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('question_id=' + "'" + self.question_id.encode('ascii', 'replace') + "'")
        if self.selected_values is not None:
            field_reprs.append('selected_values=' + repr(self.selected_values))
        if self.text is not None:
            field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        return 'Answer(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('question_id=' + "'" + self.question_id.encode('ascii', 'replace') + "'")
        if self.selected_values is not None:
            field_reprs.append('selected_values=' + repr(self.selected_values))
        if self.text is not None:
            field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        return 'Answer(' + ', '.join(field_reprs) + ')'

    @property
    def question_id(self):
        '''
        :rtype: str
        '''

        return self.__question_id

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
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'question_id':
                init_kwds['question_id'] = iprot.read_string()
            elif ifield_name == 'selected_values':
                init_kwds['selected_values'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'text':
                try:
                    init_kwds['text'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        question_id=None,
        selected_values=None,
        text=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type question_id: str or None
        :type selected_values: tuple(str) or None
        :type text: str or None
        :rtype: dressdiscover.api.models.qa.answer.Answer
        '''

        if question_id is None:
            question_id = self.question_id
        if selected_values is None:
            selected_values = self.selected_values
        if text is None:
            text = self.text
        return self.__class__(question_id=question_id, selected_values=selected_values, text=text)

    @property
    def selected_values(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__selected_values

    @property
    def text(self):
        '''
        :rtype: str
        '''

        return self.__text

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.qa.answer.Answer
        '''

        oprot.write_struct_begin('Answer')

        oprot.write_field_begin(name='question_id', type=11, id=None)
        oprot.write_string(self.question_id)
        oprot.write_field_end()

        if self.selected_values is not None:
            oprot.write_field_begin(name='selected_values', type=15, id=None)
            oprot.write_list_begin(11, len(self.selected_values))
            for _0 in self.selected_values:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.text is not None:
            oprot.write_field_begin(name='text', type=11, id=None)
            oprot.write_string(self.text)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
