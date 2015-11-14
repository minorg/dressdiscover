from itertools import ifilterfalse
import __builtin__
import costume.api.models.rights.rights


class RightsSet(object):
    class Builder(object):
        def __init__(
            self,
            rights=None,
            display=None,
            notes=None,
        ):
            '''
            :type rights: tuple(costume.api.models.rights.rights.Rights)
            :type display: str or None
            :type notes: str or None
            '''

            self.__rights = rights
            self.__display = display
            self.__notes = notes

        def build(self):
            return RightsSet(rights=self.__rights, display=self.__display, notes=self.__notes)

        @property
        def display(self):
            '''
            :rtype: str
            '''

            return self.__display

        @property
        def notes(self):
            '''
            :rtype: str
            '''

            return self.__notes

        @property
        def rights(self):
            '''
            :rtype: tuple(costume.api.models.rights.rights.Rights)
            '''

            return self.__rights

        def set_display(self, display):
            '''
            :type display: str or None
            '''

            self.__display = display
            return self

        def set_notes(self, notes):
            '''
            :type notes: str or None
            '''

            self.__notes = notes
            return self

        def set_rights(self, rights):
            '''
            :type rights: tuple(costume.api.models.rights.rights.Rights)
            '''

            self.__rights = rights
            return self

        def update(self, rights_set):
            '''
            :type rights: tuple(costume.api.models.rights.rights.Rights)
            :type display: str or None
            :type notes: str or None
            '''

            if isinstance(rights_set, RightsSet):
                self.set_rights(rights_set.rights)
                self.set_display(rights_set.display)
                self.set_notes(rights_set.notes)
            elif isinstance(rights_set, dict):
                for key, value in rights_set.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(rights_set)
            return self

        @display.setter
        def display(self, display):
            '''
            :type display: str or None
            '''

            self.set_display(display)

        @notes.setter
        def notes(self, notes):
            '''
            :type notes: str or None
            '''

            self.set_notes(notes)

        @rights.setter
        def rights(self, rights):
            '''
            :type rights: tuple(costume.api.models.rights.rights.Rights)
            '''

            self.set_rights(rights)

    def __init__(
        self,
        rights,
        display=None,
        notes=None,
    ):
        '''
        :type rights: tuple(costume.api.models.rights.rights.Rights)
        :type display: str or None
        :type notes: str or None
        '''

        if rights is None:
            raise ValueError('rights is required')
        if not (isinstance(rights, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, costume.api.models.rights.rights.Rights), rights))) == 0):
            raise TypeError("expected rights to be a tuple(costume.api.models.rights.rights.Rights) but it is a %s" % getattr(__builtin__, 'type')(rights))
        if len(rights) < 1:
            raise ValueError("expected len(rights) to be >= 1, was %d" % len(rights))
        self.__rights = rights

        if display is not None:
            if not isinstance(display, basestring):
                raise TypeError("expected display to be a str but it is a %s" % getattr(__builtin__, 'type')(display))
            if len(display) < 1:
                raise ValueError("expected len(display) to be >= 1, was %d" % len(display))
        self.__display = display

        if notes is not None:
            if not isinstance(notes, basestring):
                raise TypeError("expected notes to be a str but it is a %s" % getattr(__builtin__, 'type')(notes))
            if len(notes) < 1:
                raise ValueError("expected len(notes) to be >= 1, was %d" % len(notes))
        self.__notes = notes

    def __eq__(self, other):
        if self.rights != other.rights:
            return False
        if self.display != other.display:
            return False
        if self.notes != other.notes:
            return False
        return True

    def __hash__(self):
        return hash((self.rights,self.display,self.notes,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('rights=' + repr(self.rights))
        if self.display is not None:
            field_reprs.append('display=' + "'" + self.display.encode('ascii', 'replace') + "'")
        if self.notes is not None:
            field_reprs.append('notes=' + "'" + self.notes.encode('ascii', 'replace') + "'")
        return 'RightsSet(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('rights=' + repr(self.rights))
        if self.display is not None:
            field_reprs.append('display=' + "'" + self.display.encode('ascii', 'replace') + "'")
        if self.notes is not None:
            field_reprs.append('notes=' + "'" + self.notes.encode('ascii', 'replace') + "'")
        return 'RightsSet(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'rights': self.rights, 'display': self.display, 'notes': self.notes}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.rights, self.display, self.notes,)

    @property
    def display(self):
        '''
        :rtype: str
        '''

        return self.__display

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
        :rtype: costume.api.models.rights.rights_set.RightsSet
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'rights' and ifield_id == 1:
                init_kwds['rights'] = tuple([costume.api.models.rights.rights.Rights.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'display' and ifield_id == 2:
                try:
                    init_kwds['display'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'notes' and ifield_id == 3:
                try:
                    init_kwds['notes'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        rights=None,
        display=None,
        notes=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type rights: tuple(costume.api.models.rights.rights.Rights) or None
        :type display: str or None
        :type notes: str or None
        :rtype: costume.api.models.rights.rights_set.RightsSet
        '''

        if rights is None:
            rights = self.rights
        if display is None:
            display = self.display
        if notes is None:
            notes = self.notes
        return self.__class__(rights=rights, display=display, notes=notes)

    @property
    def rights(self):
        '''
        :rtype: tuple(costume.api.models.rights.rights.Rights)
        '''

        return self.__rights

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.models.rights.rights_set.RightsSet
        '''

        oprot.write_struct_begin('RightsSet')

        oprot.write_field_begin(name='rights', type=15, id=1)
        oprot.write_list_begin(12, len(self.rights))
        for _0 in self.rights:
            _0.write(oprot)
        oprot.write_list_end()
        oprot.write_field_end()

        if self.display is not None:
            oprot.write_field_begin(name='display', type=11, id=2)
            oprot.write_string(self.display)
            oprot.write_field_end()

        if self.notes is not None:
            oprot.write_field_begin(name='notes', type=11, id=3)
            oprot.write_string(self.notes)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self