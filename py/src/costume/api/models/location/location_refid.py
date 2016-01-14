import __builtin__
import costume.api.models.location.location_refid_type


class LocationRefid(object):
    class Builder(object):
        def __init__(
            self,
            text=None,
            type=None,  # @ReservedAssignment
        ):
            '''
            :type text: str
            :type type: costume.api.models.location.location_refid_type.LocationRefidType
            '''

            self.__text = text
            self.__type = type

        def build(self):
            return LocationRefid(text=self.__text, type=self.__type)

        def set_text(self, text):
            '''
            :type text: str
            '''

            self.__text = text
            return self

        def set_type(self, type):  # @ReservedAssignment
            '''
            :type type: costume.api.models.location.location_refid_type.LocationRefidType
            '''

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
            :rtype: costume.api.models.location.location_refid_type.LocationRefidType
            '''

            return self.__type

        def update(self, location_refid):
            '''
            :type text: str
            :type type: costume.api.models.location.location_refid_type.LocationRefidType
            '''

            if isinstance(location_refid, LocationRefid):
                self.set_text(location_refid.text)
                self.set_type(location_refid.type)
            elif isinstance(location_refid, dict):
                for key, value in location_refid.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(location_refid)
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
            :type type: costume.api.models.location.location_refid_type.LocationRefidType
            '''

            self.set_type(type)

    def __init__(
        self,
        text,
        type,  # @ReservedAssignment
    ):
        '''
        :type text: str
        :type type: costume.api.models.location.location_refid_type.LocationRefidType
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
        if not isinstance(type, costume.api.models.location.location_refid_type.LocationRefidType):
            raise TypeError("expected type to be a costume.api.models.location.location_refid_type.LocationRefidType but it is a %s" % getattr(__builtin__, 'type')(type))
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
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        field_reprs.append('type=' + repr(self.type))
        return 'LocationRefid(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        field_reprs.append('type=' + repr(self.type))
        return 'LocationRefid(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'text': self.text, 'type': self.type}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.text, self.type,)

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: costume.api.models.location.location_refid.LocationRefid
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
                init_kwds['type'] = costume.api.models.location.location_refid_type.LocationRefidType.value_of(iprot.read_string().strip().upper())
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
        :type type: costume.api.models.location.location_refid_type.LocationRefidType or None
        :rtype: costume.api.models.location.location_refid.LocationRefid
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
        :rtype: costume.api.models.location.location_refid_type.LocationRefidType
        '''

        return self.__type

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.models.location.location_refid.LocationRefid
        '''

        oprot.write_struct_begin('LocationRefid')

        oprot.write_field_begin(name='text', type=11, id=1)
        oprot.write_string(self.text)
        oprot.write_field_end()

        oprot.write_field_begin(name='type', type=11, id=2)
        oprot.write_string(str(self.type))
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self