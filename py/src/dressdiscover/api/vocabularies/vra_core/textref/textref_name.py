import __builtin__
import dressdiscover.api.vocabularies.vra_core.textref.textref_name_type


class TextrefName(object):
    class Builder(object):
        def __init__(
            self,
            text=None,
            type=None,  # @ReservedAssignment
        ):
            '''
            :type text: str
            :type type: dressdiscover.api.vocabularies.vra_core.textref.textref_name_type.TextrefNameType
            '''

            self.__text = text
            self.__type = type

        def build(self):
            return TextrefName(text=self.__text, type=self.__type)

        def set_text(self, text):
            '''
            :type text: str
            '''

            if text is None:
                raise ValueError('text is required')
            if not isinstance(text, basestring):
                raise TypeError("expected text to be a str but it is a %s" % getattr(__builtin__, 'type')(text))
            if len(text) < 1:
                raise ValueError("expected len(text) to be >= 1, was %d" % len(text))
            self.__text = text
            return self

        def set_type(self, type):  # @ReservedAssignment
            '''
            :type type: dressdiscover.api.vocabularies.vra_core.textref.textref_name_type.TextrefNameType
            '''

            if type is None:
                raise ValueError('type is required')
            if not isinstance(type, dressdiscover.api.vocabularies.vra_core.textref.textref_name_type.TextrefNameType):
                raise TypeError("expected type to be a dressdiscover.api.vocabularies.vra_core.textref.textref_name_type.TextrefNameType but it is a %s" % getattr(__builtin__, 'type')(type))
            self.__type = type
            return self

        @property
        def text(self):
            '''
            :rtype: str
            '''

            return self.__text

        @property
        def type(self):  # @ReservedAssignment
            '''
            :rtype: dressdiscover.api.vocabularies.vra_core.textref.textref_name_type.TextrefNameType
            '''

            return self.__type

        def update(self, textref_name):
            '''
            :type text: str
            :type type: dressdiscover.api.vocabularies.vra_core.textref.textref_name_type.TextrefNameType
            '''

            if isinstance(textref_name, TextrefName):
                self.set_text(textref_name.text)
                self.set_type(textref_name.type)
            elif isinstance(textref_name, dict):
                for key, value in textref_name.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(textref_name)
            return self

        @text.setter
        def text(self, text):
            '''
            :type text: str
            '''

            self.set_text(text)

        @type.setter
        def type(self, type):  # @ReservedAssignment
            '''
            :type type: dressdiscover.api.vocabularies.vra_core.textref.textref_name_type.TextrefNameType
            '''

            self.set_type(type)

    class FieldMetadata(object):
        TEXT = None
        TYPE = None

        def __init__(self, name, type_, validation):
            object.__init__(self)
            self.__name = name
            self.__type = type_
            self.__validation = validation

        def __repr__(self):
            return self.__name

        @property
        def type(self):
            return self.__type

        @property
        def validation(self):
            return self.__validation

        @classmethod
        def values(cls):
            return (cls.TEXT, cls.TYPE,)

    FieldMetadata.TEXT = FieldMetadata('text', str, {u'minLength': 1})
    FieldMetadata.TYPE = FieldMetadata('type', dressdiscover.api.vocabularies.vra_core.textref.textref_name_type.TextrefNameType, None)

    def __init__(
        self,
        text,
        type,  # @ReservedAssignment
    ):
        '''
        :type text: str
        :type type: dressdiscover.api.vocabularies.vra_core.textref.textref_name_type.TextrefNameType
        '''

        if text is None:
            raise ValueError('text is required')
        if not isinstance(text, basestring):
            raise TypeError("expected text to be a str but it is a %s" % getattr(__builtin__, 'type')(text))
        if len(text) < 1:
            raise ValueError("expected len(text) to be >= 1, was %d" % len(text))
        self.__text = text

        if type is None:
            raise ValueError('type is required')
        if not isinstance(type, dressdiscover.api.vocabularies.vra_core.textref.textref_name_type.TextrefNameType):
            raise TypeError("expected type to be a dressdiscover.api.vocabularies.vra_core.textref.textref_name_type.TextrefNameType but it is a %s" % getattr(__builtin__, 'type')(type))
        self.__type = type

    def __eq__(self, other):
        if self.text != other.text:
            return False
        if self.type != other.type:
            return False
        return True

    def __hash__(self):
        return hash((self.text,self.type,))

    def __iter__(self):
        return iter((self.text, self.type,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        field_reprs.append('type=' + repr(self.type))
        return 'TextrefName(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        field_reprs.append('type=' + repr(self.type))
        return 'TextrefName(' + ', '.join(field_reprs) + ')'

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.vocabularies.vra_core.textref.textref_name.TextrefName
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'text' and ifield_id == 1:
                init_kwds['text'] = iprot.read_string()
            elif ifield_name == 'type' and ifield_id == 2:
                init_kwds['type'] = dressdiscover.api.vocabularies.vra_core.textref.textref_name_type.TextrefNameType.value_of(iprot.read_string().strip().upper())
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        text=None,
        type=None,  # @ReservedAssignment
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type text: str or None
        :type type: dressdiscover.api.vocabularies.vra_core.textref.textref_name_type.TextrefNameType or None
        :rtype: dressdiscover.api.vocabularies.vra_core.textref.textref_name.TextrefName
        '''

        if text is None:
            text = self.text
        if type is None:
            type = self.type  # @ReservedAssignment
        return self.__class__(text=text, type=type)

    @property
    def text(self):
        '''
        :rtype: str
        '''

        return self.__text

    @property
    def type(self):  # @ReservedAssignment
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.textref.textref_name_type.TextrefNameType
        '''

        return self.__type

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.vocabularies.vra_core.textref.textref_name.TextrefName
        '''

        oprot.write_struct_begin('TextrefName')

        oprot.write_field_begin(name='text', type=11, id=1)
        oprot.write_string(self.text)
        oprot.write_field_end()

        oprot.write_field_begin(name='type', type=11, id=2)
        oprot.write_string(str(self.type))
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
