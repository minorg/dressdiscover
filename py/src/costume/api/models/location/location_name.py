import __builtin__
import costume.api.models.location.location_name_type
import costume.api.models.vocab_ref


class LocationName(object):
    class Builder(object):
        def __init__(
            self,
            text=None,
            type=None,  # @ReservedAssignment
            extent=None,
            vocab_ref=None,
        ):
            '''
            :type text: str
            :type type: costume.api.models.location.location_name_type.LocationNameType
            :type extent: str or None
            :type vocab_ref: costume.api.models.vocab_ref.VocabRef or None
            '''

            self.__text = text
            self.__type = type
            self.__extent = extent
            self.__vocab_ref = vocab_ref

        def build(self):
            return LocationName(text=self.__text, type=self.__type, extent=self.__extent, vocab_ref=self.__vocab_ref)

        @property
        def extent(self):
            '''
            :rtype: str
            '''

            return self.__extent

        def set_extent(self, extent):
            '''
            :type extent: str or None
            '''

            self.__extent = extent
            return self

        def set_text(self, text):
            '''
            :type text: str
            '''

            self.__text = text
            return self

        def set_type(self, type):  # @ReservedAssignment
            '''
            :type type: costume.api.models.location.location_name_type.LocationNameType
            '''

            self.__type = type
            return self

        def set_vocab_ref(self, vocab_ref):
            '''
            :type vocab_ref: costume.api.models.vocab_ref.VocabRef or None
            '''

            self.__vocab_ref = vocab_ref
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
            :rtype: costume.api.models.location.location_name_type.LocationNameType
            '''

            return self.__type

        def update(self, location_name):
            '''
            :type text: str
            :type type: costume.api.models.location.location_name_type.LocationNameType
            :type extent: str or None
            :type vocab_ref: costume.api.models.vocab_ref.VocabRef or None
            '''

            if isinstance(location_name, LocationName):
                self.set_text(location_name.text)
                self.set_type(location_name.type)
                self.set_extent(location_name.extent)
                self.set_vocab_ref(location_name.vocab_ref)
            elif isinstance(location_name, dict):
                for key, value in location_name.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(location_name)
            return self

        @property
        def vocab_ref(self):
            '''
            :rtype: costume.api.models.vocab_ref.VocabRef
            '''

            return self.__vocab_ref

        @extent.setter
        def extent(self, extent):
            '''
            :type extent: str or None
            '''

            self.set_extent(extent)

        @text.setter
        def text(self, text):
            '''
            :type text: str
            '''

            self.set_text(text)

        @type.setter
        def type(self, type):  # @ReservedAssignment
            '''
            :type type: costume.api.models.location.location_name_type.LocationNameType
            '''

            self.set_type(type)

        @vocab_ref.setter
        def vocab_ref(self, vocab_ref):
            '''
            :type vocab_ref: costume.api.models.vocab_ref.VocabRef or None
            '''

            self.set_vocab_ref(vocab_ref)

    def __init__(
        self,
        text,
        type,  # @ReservedAssignment
        extent=None,
        vocab_ref=None,
    ):
        '''
        :type text: str
        :type type: costume.api.models.location.location_name_type.LocationNameType
        :type extent: str or None
        :type vocab_ref: costume.api.models.vocab_ref.VocabRef or None
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
        if not isinstance(type, costume.api.models.location.location_name_type.LocationNameType):
            raise TypeError("expected type to be a costume.api.models.location.location_name_type.LocationNameType but it is a %s" % getattr(__builtin__, 'type')(type))
        self.__type = type

        if extent is not None:
            if not isinstance(extent, basestring):
                raise TypeError("expected extent to be a str but it is a %s" % getattr(__builtin__, 'type')(extent))
            if len(extent) < 1:
                raise ValueError("expected len(extent) to be >= 1, was %d" % len(extent))
        self.__extent = extent

        if vocab_ref is not None:
            if not isinstance(vocab_ref, costume.api.models.vocab_ref.VocabRef):
                raise TypeError("expected vocab_ref to be a costume.api.models.vocab_ref.VocabRef but it is a %s" % getattr(__builtin__, 'type')(vocab_ref))
        self.__vocab_ref = vocab_ref

    def __eq__(self, other):
        if self.text != other.text:
            return False
        if self.type != other.type:
            return False
        if self.extent != other.extent:
            return False
        if self.vocab_ref != other.vocab_ref:
            return False
        return True

    def __hash__(self):
        return hash((self.text,self.type,self.extent,self.vocab_ref,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        field_reprs.append('type=' + repr(self.type))
        if self.extent is not None:
            field_reprs.append('extent=' + "'" + self.extent.encode('ascii', 'replace') + "'")
        if self.vocab_ref is not None:
            field_reprs.append('vocab_ref=' + repr(self.vocab_ref))
        return 'LocationName(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        field_reprs.append('type=' + repr(self.type))
        if self.extent is not None:
            field_reprs.append('extent=' + "'" + self.extent.encode('ascii', 'replace') + "'")
        if self.vocab_ref is not None:
            field_reprs.append('vocab_ref=' + repr(self.vocab_ref))
        return 'LocationName(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'text': self.text, 'type': self.type, 'extent': self.extent, 'vocab_ref': self.vocab_ref}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.text, self.type, self.extent, self.vocab_ref,)

    @property
    def extent(self):
        '''
        :rtype: str
        '''

        return self.__extent

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: costume.api.models.location.location_name.LocationName
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
                init_kwds['type'] = costume.api.models.location.location_name_type.LocationNameType.value_of(iprot.read_string().strip().upper())
            elif ifield_name == 'extent' and ifield_id == 3:
                try:
                    init_kwds['extent'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'vocab_ref' and ifield_id == 4:
                init_kwds['vocab_ref'] = costume.api.models.vocab_ref.VocabRef.read(iprot)
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        text=None,
        type=None,  # @ReservedAssignment
        extent=None,
        vocab_ref=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type text: str or None
        :type type: costume.api.models.location.location_name_type.LocationNameType or None
        :type extent: str or None
        :type vocab_ref: costume.api.models.vocab_ref.VocabRef or None
        :rtype: costume.api.models.location.location_name.LocationName
        '''

        if text is None:
            text = self.text
        if type is None:
            type = self.type  # @ReservedAssignment
        if extent is None:
            extent = self.extent
        if vocab_ref is None:
            vocab_ref = self.vocab_ref
        return self.__class__(text=text, type=type, extent=extent, vocab_ref=vocab_ref)

    @property
    def text(self):
        '''
        :rtype: str
        '''

        return self.__text

    @property
    def type(self):  # @ReservedAssignment
        '''
        :rtype: costume.api.models.location.location_name_type.LocationNameType
        '''

        return self.__type

    @property
    def vocab_ref(self):
        '''
        :rtype: costume.api.models.vocab_ref.VocabRef
        '''

        return self.__vocab_ref

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.models.location.location_name.LocationName
        '''

        oprot.write_struct_begin('LocationName')

        oprot.write_field_begin(name='text', type=11, id=1)
        oprot.write_string(self.text)
        oprot.write_field_end()

        oprot.write_field_begin(name='type', type=11, id=2)
        oprot.write_string(str(self.type))
        oprot.write_field_end()

        if self.extent is not None:
            oprot.write_field_begin(name='extent', type=11, id=3)
            oprot.write_string(self.extent)
            oprot.write_field_end()

        if self.vocab_ref is not None:
            oprot.write_field_begin(name='vocab_ref', type=12, id=4)
            self.vocab_ref.write(oprot)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
