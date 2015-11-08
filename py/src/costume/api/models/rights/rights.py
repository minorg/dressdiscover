import __builtin__
import costume.api.models.rights.rights_type


class Rights(object):
    class Builder(object):
        def __init__(
            self,
            rights_holder=None,
            text=None,
            type=None,  # @ReservedAssignment
            notes=None,
        ):
            '''
            :type rights_holder: str
            :type text: str
            :type type: costume.api.models.rights.rights_type.RightsType
            :type notes: str or None
            '''

            self.__rights_holder = rights_holder
            self.__text = text
            self.__type = type
            self.__notes = notes

        def build(self):
            return Rights(rights_holder=self.__rights_holder, text=self.__text, type=self.__type, notes=self.__notes)

        @property
        def notes(self):
            '''
            :rtype: str
            '''

            return self.__notes

        @property
        def rights_holder(self):
            '''
            :rtype: str
            '''

            return self.__rights_holder

        def set_notes(self, notes):
            '''
            :type notes: str or None
            '''

            self.__notes = notes
            return self

        def set_rights_holder(self, rights_holder):
            '''
            :type rights_holder: str
            '''

            self.__rights_holder = rights_holder
            return self

        def set_text(self, text):
            '''
            :type text: str
            '''

            self.__text = text
            return self

        def set_type(self, type):  # @ReservedAssignment
            '''
            :type type: costume.api.models.rights.rights_type.RightsType
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
            :rtype: costume.api.models.rights.rights_type.RightsType
            '''

            return self.__type

        def update(self, rights):
            '''
            :type rights_holder: str
            :type text: str
            :type type: costume.api.models.rights.rights_type.RightsType
            :type notes: str or None
            '''

            if isinstance(rights, Rights):
                self.set_rights_holder(rights.rights_holder)
                self.set_text(rights.text)
                self.set_type(rights.type)
                self.set_notes(rights.notes)
            elif isinstance(rights, dict):
                for key, value in rights.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(rights)
            return self

        @notes.setter
        def notes(self, notes):
            '''
            :type notes: str or None
            '''

            self.set_notes(notes)

        @rights_holder.setter
        def rights_holder(self, rights_holder):
            '''
            :type rights_holder: str
            '''

            self.set_rights_holder(rights_holder)

        @text.setter
        def text(self, text):
            '''
            :type text: str
            '''

            self.set_text(text)

        @type.setter
        def type(self, type):  # @ReservedAssignment
            '''
            :type type: costume.api.models.rights.rights_type.RightsType
            '''

            self.set_type(type)

    def __init__(
        self,
        rights_holder,
        text,
        type,  # @ReservedAssignment
        notes=None,
    ):
        '''
        :type rights_holder: str
        :type text: str
        :type type: costume.api.models.rights.rights_type.RightsType
        :type notes: str or None
        '''

        if rights_holder is None:
            raise ValueError('rights_holder is required')
        if not isinstance(rights_holder, basestring):
            raise TypeError("expected rights_holder to be a str but it is a %s" % getattr(__builtin__, 'type')(rights_holder))
        if len(rights_holder) < 1:
            raise ValueError("expected len(rights_holder) to be >= 1, was %d" % len(rights_holder))
        self.__rights_holder = rights_holder

        if text is None:
            raise ValueError('text is required')
        if not isinstance(text, basestring):
            raise TypeError("expected text to be a str but it is a %s" % getattr(__builtin__, 'type')(text))
        if len(text) < 1:
            raise ValueError("expected len(text) to be >= 1, was %d" % len(text))
        self.__text = text

        if type is None:
            raise ValueError('type is required')
        if not isinstance(type, costume.api.models.rights.rights_type.RightsType):
            raise TypeError("expected type to be a costume.api.models.rights.rights_type.RightsType but it is a %s" % getattr(__builtin__, 'type')(type))
        self.__type = type

        if notes is not None:
            if not isinstance(notes, basestring):
                raise TypeError("expected notes to be a str but it is a %s" % getattr(__builtin__, 'type')(notes))
            if len(notes) < 1:
                raise ValueError("expected len(notes) to be >= 1, was %d" % len(notes))
        self.__notes = notes

    def __eq__(self, other):
        if self.rights_holder != other.rights_holder:
            return False
        if self.text != other.text:
            return False
        if self.type != other.type:
            return False
        if self.notes != other.notes:
            return False
        return True

    def __hash__(self):
        return hash((self.rights_holder,self.text,self.type,self.notes,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('rights_holder=' + "'" + self.rights_holder.encode('ascii', 'replace') + "'")
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        field_reprs.append('type=' + repr(self.type))
        if self.notes is not None:
            field_reprs.append('notes=' + "'" + self.notes.encode('ascii', 'replace') + "'")
        return 'Rights(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('rights_holder=' + "'" + self.rights_holder.encode('ascii', 'replace') + "'")
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        field_reprs.append('type=' + repr(self.type))
        if self.notes is not None:
            field_reprs.append('notes=' + "'" + self.notes.encode('ascii', 'replace') + "'")
        return 'Rights(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'rights_holder': self.rights_holder, 'text': self.text, 'type': self.type, 'notes': self.notes}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.rights_holder, self.text, self.type, self.notes,)

    @property
    def notes(self):
        '''
        :rtype: str
        '''

        return self.__notes

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: costume.api.models.rights.rights.Rights
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'rights_holder' and ifield_id == 1:
                init_kwds['rights_holder'] = iprot.read_string()
            elif ifield_name == 'text' and ifield_id == 2:
                init_kwds['text'] = iprot.read_string()
            elif ifield_name == 'type' and ifield_id == 3:
                init_kwds['type'] = costume.api.models.rights.rights_type.RightsType.value_of(iprot.read_string().strip().upper())
            elif ifield_name == 'notes' and ifield_id == 4:
                try:
                    init_kwds['notes'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        rights_holder=None,
        text=None,
        type=None,  # @ReservedAssignment
        notes=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type rights_holder: str or None
        :type text: str or None
        :type type: costume.api.models.rights.rights_type.RightsType or None
        :type notes: str or None
        :rtype: costume.api.models.rights.rights.Rights
        '''

        if rights_holder is None:
            rights_holder = self.rights_holder
        if text is None:
            text = self.text
        if type is None:
            type = self.type  # @ReservedAssignment
        if notes is None:
            notes = self.notes
        return self.__class__(rights_holder=rights_holder, text=text, type=type, notes=notes)

    @property
    def rights_holder(self):
        '''
        :rtype: str
        '''

        return self.__rights_holder

    @property
    def text(self):
        '''
        :rtype: str
        '''

        return self.__text

    @property
    def type(self):  # @ReservedAssignment
        '''
        :rtype: costume.api.models.rights.rights_type.RightsType
        '''

        return self.__type

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.models.rights.rights.Rights
        '''

        oprot.write_struct_begin('Rights')

        oprot.write_field_begin(name='rights_holder', type=11, id=1)
        oprot.write_string(self.rights_holder)
        oprot.write_field_end()

        oprot.write_field_begin(name='text', type=11, id=2)
        oprot.write_string(self.text)
        oprot.write_field_end()

        oprot.write_field_begin(name='type', type=11, id=3)
        oprot.write_string(str(self.type))
        oprot.write_field_end()

        if self.notes is not None:
            oprot.write_field_begin(name='notes', type=11, id=4)
            oprot.write_string(self.notes)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
