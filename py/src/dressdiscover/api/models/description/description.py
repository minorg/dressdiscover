import __builtin__
import dressdiscover.api.models.description.description_type


class Description(object):
    class Builder(object):
        def __init__(
            self,
            text=None,
            source=None,
            type=None,  # @ReservedAssignment
        ):
            '''
            :type text: str
            :type source: str or None
            :type type: dressdiscover.api.models.description.description_type.DescriptionType or None
            '''

            self.__text = text
            self.__source = source
            self.__type = type

        def build(self):
            return Description(text=self.__text, source=self.__source, type=self.__type)

        def set_source(self, source):
            '''
            :type source: str or None
            '''

            self.__source = source
            return self

        def set_text(self, text):
            '''
            :type text: str
            '''

            self.__text = text
            return self

        def set_type(self, type):  # @ReservedAssignment
            '''
            :type type: dressdiscover.api.models.description.description_type.DescriptionType or None
            '''

            self.__type = type
            return self

        @property
        def source(self):
            '''
            :rtype: str
            '''

            return self.__source

        @property
        def text(self):
            '''
            :rtype: str
            '''

            return self.__text

        @property
        def type(self):  # @ReservedAssignment
            '''
            :rtype: dressdiscover.api.models.description.description_type.DescriptionType
            '''

            return self.__type

        def update(self, description):
            '''
            :type text: str
            :type source: str or None
            :type type: dressdiscover.api.models.description.description_type.DescriptionType or None
            '''

            if isinstance(description, Description):
                self.set_text(description.text)
                self.set_source(description.source)
                self.set_type(description.type)
            elif isinstance(description, dict):
                for key, value in description.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(description)
            return self

        @source.setter
        def source(self, source):
            '''
            :type source: str or None
            '''

            self.set_source(source)

        @text.setter
        def text(self, text):
            '''
            :type text: str
            '''

            self.set_text(text)

        @type.setter
        def type(self, type):  # @ReservedAssignment
            '''
            :type type: dressdiscover.api.models.description.description_type.DescriptionType or None
            '''

            self.set_type(type)

    def __init__(
        self,
        text,
        source=None,
        type=None,  # @ReservedAssignment
    ):
        '''
        :type text: str
        :type source: str or None
        :type type: dressdiscover.api.models.description.description_type.DescriptionType or None
        '''

        if text is None:
            raise ValueError('text is required')
        if not isinstance(text, basestring):
            raise TypeError("expected text to be a str but it is a %s" % getattr(__builtin__, 'type')(text))
        if len(text) < 1:
            raise ValueError("expected len(text) to be >= 1, was %d" % len(text))
        self.__text = text

        if source is not None:
            if not isinstance(source, basestring):
                raise TypeError("expected source to be a str but it is a %s" % getattr(__builtin__, 'type')(source))
            if len(source) < 1:
                raise ValueError("expected len(source) to be >= 1, was %d" % len(source))
        self.__source = source

        if type is not None:
            if not isinstance(type, dressdiscover.api.models.description.description_type.DescriptionType):
                raise TypeError("expected type to be a dressdiscover.api.models.description.description_type.DescriptionType but it is a %s" % getattr(__builtin__, 'type')(type))
        self.__type = type

    def __eq__(self, other):
        if self.text != other.text:
            return False
        if self.source != other.source:
            return False
        if self.type != other.type:
            return False
        return True

    def __hash__(self):
        return hash((self.text,self.source,self.type,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        if self.source is not None:
            field_reprs.append('source=' + "'" + self.source.encode('ascii', 'replace') + "'")
        if self.type is not None:
            field_reprs.append('type=' + repr(self.type))
        return 'Description(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        if self.source is not None:
            field_reprs.append('source=' + "'" + self.source.encode('ascii', 'replace') + "'")
        if self.type is not None:
            field_reprs.append('type=' + repr(self.type))
        return 'Description(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'text': self.text, 'source': self.source, 'type': self.type}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.text, self.source, self.type,)

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.description.description.Description
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'text' and ifield_id == 1:
                init_kwds['text'] = iprot.read_string()
            elif ifield_name == 'source' and ifield_id == 2:
                try:
                    init_kwds['source'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'type' and ifield_id == 3:
                try:
                    init_kwds['type'] = dressdiscover.api.models.description.description_type.DescriptionType.value_of(iprot.read_string().strip().upper())
                except (TypeError,):
                    pass
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        text=None,
        source=None,
        type=None,  # @ReservedAssignment
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type text: str or None
        :type source: str or None
        :type type: dressdiscover.api.models.description.description_type.DescriptionType or None
        :rtype: dressdiscover.api.models.description.description.Description
        '''

        if text is None:
            text = self.text
        if source is None:
            source = self.source
        if type is None:
            type = self.type  # @ReservedAssignment
        return self.__class__(text=text, source=source, type=type)

    @property
    def source(self):
        '''
        :rtype: str
        '''

        return self.__source

    @property
    def text(self):
        '''
        :rtype: str
        '''

        return self.__text

    @property
    def type(self):  # @ReservedAssignment
        '''
        :rtype: dressdiscover.api.models.description.description_type.DescriptionType
        '''

        return self.__type

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.description.description.Description
        '''

        oprot.write_struct_begin('Description')

        oprot.write_field_begin(name='text', type=11, id=1)
        oprot.write_string(self.text)
        oprot.write_field_end()

        if self.source is not None:
            oprot.write_field_begin(name='source', type=11, id=2)
            oprot.write_string(self.source)
            oprot.write_field_end()

        if self.type is not None:
            oprot.write_field_begin(name='type', type=11, id=3)
            oprot.write_string(str(self.type))
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
