from itertools import ifilterfalse
import __builtin__
import costume.api.models.work_type.work_type


class WorkTypeSet(object):
    class Builder(object):
        def __init__(
            self,
            work_types=None,
            display=None,
            notes=None,
        ):
            '''
            :type work_types: tuple(costume.api.models.work_type.work_type.WorkType)
            :type display: str or None
            :type notes: str or None
            '''

            self.__work_types = work_types
            self.__display = display
            self.__notes = notes

        def build(self):
            return WorkTypeSet(work_types=self.__work_types, display=self.__display, notes=self.__notes)

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

        def set_work_types(self, work_types):
            '''
            :type work_types: tuple(costume.api.models.work_type.work_type.WorkType)
            '''

            self.__work_types = work_types
            return self

        def update(self, work_type_set):
            '''
            :type work_types: tuple(costume.api.models.work_type.work_type.WorkType)
            :type display: str or None
            :type notes: str or None
            '''

            if isinstance(work_type_set, WorkTypeSet):
                self.set_work_types(work_type_set.work_types)
                self.set_display(work_type_set.display)
                self.set_notes(work_type_set.notes)
            elif isinstance(work_type_set, dict):
                for key, value in work_type_set.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(work_type_set)
            return self

        @property
        def work_types(self):
            '''
            :rtype: tuple(costume.api.models.work_type.work_type.WorkType)
            '''

            return self.__work_types

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

        @work_types.setter
        def work_types(self, work_types):
            '''
            :type work_types: tuple(costume.api.models.work_type.work_type.WorkType)
            '''

            self.set_work_types(work_types)

    def __init__(
        self,
        work_types,
        display=None,
        notes=None,
    ):
        '''
        :type work_types: tuple(costume.api.models.work_type.work_type.WorkType)
        :type display: str or None
        :type notes: str or None
        '''

        if work_types is None:
            raise ValueError('work_types is required')
        if not (isinstance(work_types, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, costume.api.models.work_type.work_type.WorkType), work_types))) == 0):
            raise TypeError("expected work_types to be a tuple(costume.api.models.work_type.work_type.WorkType) but it is a %s" % getattr(__builtin__, 'type')(work_types))
        if len(work_types) < 1:
            raise ValueError("expected len(work_types) to be >= 1, was %d" % len(work_types))
        self.__work_types = work_types

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
        if self.work_types != other.work_types:
            return False
        if self.display != other.display:
            return False
        if self.notes != other.notes:
            return False
        return True

    def __hash__(self):
        return hash((self.work_types,self.display,self.notes,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('work_types=' + repr(self.work_types))
        if self.display is not None:
            field_reprs.append('display=' + "'" + self.display.encode('ascii', 'replace') + "'")
        if self.notes is not None:
            field_reprs.append('notes=' + "'" + self.notes.encode('ascii', 'replace') + "'")
        return 'WorkTypeSet(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('work_types=' + repr(self.work_types))
        if self.display is not None:
            field_reprs.append('display=' + "'" + self.display.encode('ascii', 'replace') + "'")
        if self.notes is not None:
            field_reprs.append('notes=' + "'" + self.notes.encode('ascii', 'replace') + "'")
        return 'WorkTypeSet(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'work_types': self.work_types, 'display': self.display, 'notes': self.notes}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.work_types, self.display, self.notes,)

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
        :rtype: costume.api.models.work_type.work_type_set.WorkTypeSet
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'work_types' and ifield_id == 1:
                init_kwds['work_types'] = tuple([costume.api.models.work_type.work_type.WorkType.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
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
        work_types=None,
        display=None,
        notes=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type work_types: tuple(costume.api.models.work_type.work_type.WorkType) or None
        :type display: str or None
        :type notes: str or None
        :rtype: costume.api.models.work_type.work_type_set.WorkTypeSet
        '''

        if work_types is None:
            work_types = self.work_types
        if display is None:
            display = self.display
        if notes is None:
            notes = self.notes
        return self.__class__(work_types=work_types, display=display, notes=notes)

    @property
    def work_types(self):
        '''
        :rtype: tuple(costume.api.models.work_type.work_type.WorkType)
        '''

        return self.__work_types

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.models.work_type.work_type_set.WorkTypeSet
        '''

        oprot.write_struct_begin('WorkTypeSet')

        oprot.write_field_begin(name='work_types', type=15, id=1)
        oprot.write_list_begin(12, len(self.work_types))
        for _0 in self.work_types:
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
