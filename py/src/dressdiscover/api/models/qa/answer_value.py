import __builtin__
import dressdiscover.api.models.qa.question_value_id


class AnswerValue(object):
    class Builder(object):
        def __init__(
            self,
            value_color=None,
            value_i32=None,
            value_id=None,
            value_string=None,
        ):
            '''
            :type value_color: str or None
            :type value_i32: int or None
            :type value_id: str or None
            :type value_string: str or None
            '''

            self.__value_color = value_color
            self.__value_i32 = value_i32
            self.__value_id = value_id
            self.__value_string = value_string

        def build(self):
            return AnswerValue(value_color=self.__value_color, value_i32=self.__value_i32, value_id=self.__value_id, value_string=self.__value_string)

        def set_value_color(self, value_color):
            '''
            :type value_color: str or None
            '''

            if value_color is not None:
                if not isinstance(value_color, basestring):
                    raise TypeError("expected value_color to be a str but it is a %s" % getattr(__builtin__, 'type')(value_color))
                if value_color.isspace():
                    raise ValueError("expected value_color not to be blank")
                if len(value_color) > 6:
                    raise ValueError("expected len(value_color) to be <= 6, was %d" % len(value_color))
                if len(value_color) < 6:
                    raise ValueError("expected len(value_color) to be >= 6, was %d" % len(value_color))
            self.__value_color = value_color
            return self

        def set_value_i32(self, value_i32):
            '''
            :type value_i32: int or None
            '''

            if value_i32 is not None:
                if not isinstance(value_i32, int):
                    raise TypeError("expected value_i32 to be a int but it is a %s" % getattr(__builtin__, 'type')(value_i32))
            self.__value_i32 = value_i32
            return self

        def set_value_id(self, value_id):
            '''
            :type value_id: str or None
            '''

            if value_id is not None:
                if not isinstance(value_id, basestring):
                    raise TypeError("expected value_id to be a str but it is a %s" % getattr(__builtin__, 'type')(value_id))
            self.__value_id = value_id
            return self

        def set_value_string(self, value_string):
            '''
            :type value_string: str or None
            '''

            if value_string is not None:
                if not isinstance(value_string, basestring):
                    raise TypeError("expected value_string to be a str but it is a %s" % getattr(__builtin__, 'type')(value_string))
                if value_string.isspace():
                    raise ValueError("expected value_string not to be blank")
                if len(value_string) < 1:
                    raise ValueError("expected len(value_string) to be >= 1, was %d" % len(value_string))
            self.__value_string = value_string
            return self

        def update(self, answer_value):
            '''
            :type value_color: str or None
            :type value_i32: int or None
            :type value_id: str or None
            :type value_string: str or None
            '''

            if isinstance(answer_value, AnswerValue):
                self.set_value_color(answer_value.value_color)
                self.set_value_i32(answer_value.value_i32)
                self.set_value_id(answer_value.value_id)
                self.set_value_string(answer_value.value_string)
            elif isinstance(answer_value, dict):
                for key, value in answer_value.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(answer_value)
            return self

        @property
        def value_color(self):
            '''
            :rtype: str
            '''

            return self.__value_color

        @property
        def value_i32(self):
            '''
            :rtype: int
            '''

            return self.__value_i32

        @property
        def value_id(self):
            '''
            :rtype: str
            '''

            return self.__value_id

        @property
        def value_string(self):
            '''
            :rtype: str
            '''

            return self.__value_string

        @value_color.setter
        def value_color(self, value_color):
            '''
            :type value_color: str or None
            '''

            self.set_value_color(value_color)

        @value_i32.setter
        def value_i32(self, value_i32):
            '''
            :type value_i32: int or None
            '''

            self.set_value_i32(value_i32)

        @value_id.setter
        def value_id(self, value_id):
            '''
            :type value_id: str or None
            '''

            self.set_value_id(value_id)

        @value_string.setter
        def value_string(self, value_string):
            '''
            :type value_string: str or None
            '''

            self.set_value_string(value_string)

    class FieldMetadata(object):
        VALUE_COLOR = None
        VALUE_I32 = None
        VALUE_ID = None
        VALUE_STRING = None

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
            return (cls.VALUE_COLOR, cls.VALUE_I32, cls.VALUE_ID, cls.VALUE_STRING,)

    FieldMetadata.VALUE_COLOR = FieldMetadata('value_color', str, {u'blank': False, u'maxLength': 6, u'minLength': 6})
    FieldMetadata.VALUE_I32 = FieldMetadata('value_i32', int, None)
    FieldMetadata.VALUE_ID = FieldMetadata('value_id', dressdiscover.api.models.qa.question_value_id.QuestionValueId, None)
    FieldMetadata.VALUE_STRING = FieldMetadata('value_string', str, {u'blank': False, u'minLength': 1})

    def __init__(
        self,
        value_color=None,
        value_i32=None,
        value_id=None,
        value_string=None,
    ):
        '''
        :type value_color: str or None
        :type value_i32: int or None
        :type value_id: str or None
        :type value_string: str or None
        '''

        if value_color is not None:
            if not isinstance(value_color, basestring):
                raise TypeError("expected value_color to be a str but it is a %s" % getattr(__builtin__, 'type')(value_color))
            if value_color.isspace():
                raise ValueError("expected value_color not to be blank")
            if len(value_color) > 6:
                raise ValueError("expected len(value_color) to be <= 6, was %d" % len(value_color))
            if len(value_color) < 6:
                raise ValueError("expected len(value_color) to be >= 6, was %d" % len(value_color))
        self.__value_color = value_color

        if value_i32 is not None:
            if not isinstance(value_i32, int):
                raise TypeError("expected value_i32 to be a int but it is a %s" % getattr(__builtin__, 'type')(value_i32))
        self.__value_i32 = value_i32

        if value_id is not None:
            if not isinstance(value_id, basestring):
                raise TypeError("expected value_id to be a str but it is a %s" % getattr(__builtin__, 'type')(value_id))
        self.__value_id = value_id

        if value_string is not None:
            if not isinstance(value_string, basestring):
                raise TypeError("expected value_string to be a str but it is a %s" % getattr(__builtin__, 'type')(value_string))
            if value_string.isspace():
                raise ValueError("expected value_string not to be blank")
            if len(value_string) < 1:
                raise ValueError("expected len(value_string) to be >= 1, was %d" % len(value_string))
        self.__value_string = value_string

    def __eq__(self, other):
        if self.value_color != other.value_color:
            return False
        if self.value_i32 != other.value_i32:
            return False
        if self.value_id != other.value_id:
            return False
        if self.value_string != other.value_string:
            return False
        return True

    def __hash__(self):
        return hash((self.value_color,self.value_i32,self.value_id,self.value_string,))

    def __iter__(self):
        return iter((self.value_color, self.value_i32, self.value_id, self.value_string,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.value_color is not None:
            field_reprs.append('value_color=' + "'" + self.value_color.encode('ascii', 'replace') + "'")
        if self.value_i32 is not None:
            field_reprs.append('value_i32=' + repr(self.value_i32))
        if self.value_id is not None:
            field_reprs.append('value_id=' + "'" + self.value_id.encode('ascii', 'replace') + "'")
        if self.value_string is not None:
            field_reprs.append('value_string=' + "'" + self.value_string.encode('ascii', 'replace') + "'")
        return 'AnswerValue(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.value_color is not None:
            field_reprs.append('value_color=' + "'" + self.value_color.encode('ascii', 'replace') + "'")
        if self.value_i32 is not None:
            field_reprs.append('value_i32=' + repr(self.value_i32))
        if self.value_id is not None:
            field_reprs.append('value_id=' + "'" + self.value_id.encode('ascii', 'replace') + "'")
        if self.value_string is not None:
            field_reprs.append('value_string=' + "'" + self.value_string.encode('ascii', 'replace') + "'")
        return 'AnswerValue(' + ', '.join(field_reprs) + ')'

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.qa.answer_value.AnswerValue
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'value_color' and ifield_id == 4:
                try:
                    init_kwds['value_color'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'value_i32' and ifield_id == 1:
                try:
                    init_kwds['value_i32'] = iprot.read_i32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'value_id' and ifield_id == 2:
                try:
                    init_kwds['value_id'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'value_string' and ifield_id == 3:
                try:
                    init_kwds['value_string'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        value_color=None,
        value_i32=None,
        value_id=None,
        value_string=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type value_color: str or None
        :type value_i32: int or None
        :type value_id: str or None
        :type value_string: str or None
        :rtype: dressdiscover.api.models.qa.answer_value.AnswerValue
        '''

        if value_color is None:
            value_color = self.value_color
        if value_i32 is None:
            value_i32 = self.value_i32
        if value_id is None:
            value_id = self.value_id
        if value_string is None:
            value_string = self.value_string
        return self.__class__(value_color=value_color, value_i32=value_i32, value_id=value_id, value_string=value_string)

    @property
    def value_color(self):
        '''
        :rtype: str
        '''

        return self.__value_color

    @property
    def value_i32(self):
        '''
        :rtype: int
        '''

        return self.__value_i32

    @property
    def value_id(self):
        '''
        :rtype: str
        '''

        return self.__value_id

    @property
    def value_string(self):
        '''
        :rtype: str
        '''

        return self.__value_string

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.qa.answer_value.AnswerValue
        '''

        oprot.write_struct_begin('AnswerValue')

        if self.value_color is not None:
            oprot.write_field_begin(name='value_color', type=11, id=4)
            oprot.write_string(self.value_color)
            oprot.write_field_end()

        if self.value_i32 is not None:
            oprot.write_field_begin(name='value_i32', type=8, id=1)
            oprot.write_i32(self.value_i32)
            oprot.write_field_end()

        if self.value_id is not None:
            oprot.write_field_begin(name='value_id', type=11, id=2)
            oprot.write_string(self.value_id)
            oprot.write_field_end()

        if self.value_string is not None:
            oprot.write_field_begin(name='value_string', type=11, id=3)
            oprot.write_string(self.value_string)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
