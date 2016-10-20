import __builtin__
import dressdiscover.api.vocabularies.vra_core.title.title_type


class Title(object):
    class Builder(object):
        def __init__(
            self,
            text=None,
            type=None,  # @ReservedAssignment
            pref=None,
        ):
            '''
            :type text: str
            :type type: dressdiscover.api.vocabularies.vra_core.title.title_type.TitleType
            :type pref: bool or None
            '''

            self.__text = text
            self.__type = type
            self.__pref = pref

        def build(self):
            return Title(text=self.__text, type=self.__type, pref=self.__pref)

        @property
        def pref(self):
            '''
            :rtype: bool
            '''

            return self.__pref

        def set_pref(self, pref):
            '''
            :type pref: bool or None
            '''

            if pref is not None:
                if not isinstance(pref, bool):
                    raise TypeError("expected pref to be a bool but it is a %s" % getattr(__builtin__, 'type')(pref))
                if pref is not True:
                    raise ValueError("expected pref to be True, was %s" % pref)
            self.__pref = pref
            return self

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
            :type type: dressdiscover.api.vocabularies.vra_core.title.title_type.TitleType
            '''

            if type is None:
                raise ValueError('type is required')
            if not isinstance(type, dressdiscover.api.vocabularies.vra_core.title.title_type.TitleType):
                raise TypeError("expected type to be a dressdiscover.api.vocabularies.vra_core.title.title_type.TitleType but it is a %s" % getattr(__builtin__, 'type')(type))
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
            :rtype: dressdiscover.api.vocabularies.vra_core.title.title_type.TitleType
            '''

            return self.__type

        def update(self, title):
            '''
            :type text: str
            :type type: dressdiscover.api.vocabularies.vra_core.title.title_type.TitleType
            :type pref: bool or None
            '''

            if isinstance(title, Title):
                self.set_text(title.text)
                self.set_type(title.type)
                self.set_pref(title.pref)
            elif isinstance(title, dict):
                for key, value in title.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(title)
            return self

        @pref.setter
        def pref(self, pref):
            '''
            :type pref: bool or None
            '''

            self.set_pref(pref)

        @text.setter
        def text(self, text):
            '''
            :type text: str
            '''

            self.set_text(text)

        @type.setter
        def type(self, type):  # @ReservedAssignment
            '''
            :type type: dressdiscover.api.vocabularies.vra_core.title.title_type.TitleType
            '''

            self.set_type(type)

    class FieldMetadata(object):
        TEXT = None
        TYPE = None
        PREF = None

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
            return (cls.TEXT, cls.TYPE, cls.PREF,)

    FieldMetadata.TEXT = FieldMetadata('text', str, {u'minLength': 1})
    FieldMetadata.TYPE = FieldMetadata('type', dressdiscover.api.vocabularies.vra_core.title.title_type.TitleType, None)
    FieldMetadata.PREF = FieldMetadata('pref', bool, {u'acceptance': True})

    def __init__(
        self,
        text,
        type,  # @ReservedAssignment
        pref=None,
    ):
        '''
        :type text: str
        :type type: dressdiscover.api.vocabularies.vra_core.title.title_type.TitleType
        :type pref: bool or None
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
        if not isinstance(type, dressdiscover.api.vocabularies.vra_core.title.title_type.TitleType):
            raise TypeError("expected type to be a dressdiscover.api.vocabularies.vra_core.title.title_type.TitleType but it is a %s" % getattr(__builtin__, 'type')(type))
        self.__type = type

        if pref is not None:
            if not isinstance(pref, bool):
                raise TypeError("expected pref to be a bool but it is a %s" % getattr(__builtin__, 'type')(pref))
            if pref is not True:
                raise ValueError("expected pref to be True, was %s" % pref)
        self.__pref = pref

    def __eq__(self, other):
        if self.text != other.text:
            return False
        if self.type != other.type:
            return False
        if self.pref != other.pref:
            return False
        return True

    def __hash__(self):
        return hash((self.text,self.type,self.pref,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        field_reprs.append('type=' + repr(self.type))
        if self.pref is not None:
            field_reprs.append('pref=' + repr(self.pref))
        return 'Title(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        field_reprs.append('type=' + repr(self.type))
        if self.pref is not None:
            field_reprs.append('pref=' + repr(self.pref))
        return 'Title(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'text': self.text, 'type': self.type, 'pref': self.pref}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.text, self.type, self.pref,)

    @property
    def pref(self):
        '''
        :rtype: bool
        '''

        return self.__pref

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.vocabularies.vra_core.title.title.Title
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
                init_kwds['type'] = dressdiscover.api.vocabularies.vra_core.title.title_type.TitleType.value_of(iprot.read_string().strip().upper())
            elif ifield_name == 'pref' and ifield_id == 3:
                try:
                    init_kwds['pref'] = iprot.read_bool()
                except (TypeError, ValueError,):
                    pass
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        text=None,
        type=None,  # @ReservedAssignment
        pref=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type text: str or None
        :type type: dressdiscover.api.vocabularies.vra_core.title.title_type.TitleType or None
        :type pref: bool or None
        :rtype: dressdiscover.api.vocabularies.vra_core.title.title.Title
        '''

        if text is None:
            text = self.text
        if type is None:
            type = self.type  # @ReservedAssignment
        if pref is None:
            pref = self.pref
        return self.__class__(text=text, type=type, pref=pref)

    @property
    def text(self):
        '''
        :rtype: str
        '''

        return self.__text

    @property
    def type(self):  # @ReservedAssignment
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.title.title_type.TitleType
        '''

        return self.__type

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.vocabularies.vra_core.title.title.Title
        '''

        oprot.write_struct_begin('Title')

        oprot.write_field_begin(name='text', type=11, id=1)
        oprot.write_string(self.text)
        oprot.write_field_end()

        oprot.write_field_begin(name='type', type=11, id=2)
        oprot.write_string(str(self.type))
        oprot.write_field_end()

        if self.pref is not None:
            oprot.write_field_begin(name='pref', type=2, id=3)
            oprot.write_bool(self.pref)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
