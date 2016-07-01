from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.models.date.date


class DateSet(object):
    class Builder(object):
        def __init__(
            self,
            elements=None,
            display=None,
            notes=None,
        ):
            '''
            :type elements: tuple(dressdiscover.api.models.date.date.Date)
            :type display: str or None
            :type notes: str or None
            '''

            self.__elements = elements
            self.__display = display
            self.__notes = notes

        def build(self):
            return DateSet(elements=self.__elements, display=self.__display, notes=self.__notes)

        @property
        def display(self):
            '''
            :rtype: str
            '''

            return self.__display

        @property
        def elements(self):
            '''
            :rtype: tuple(dressdiscover.api.models.date.date.Date)
            '''

            return self.__elements

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

        def set_elements(self, elements):
            '''
            :type elements: tuple(dressdiscover.api.models.date.date.Date)
            '''

            self.__elements = elements
            return self

        def set_notes(self, notes):
            '''
            :type notes: str or None
            '''

            self.__notes = notes
            return self

        def update(self, date_set):
            '''
            :type elements: tuple(dressdiscover.api.models.date.date.Date)
            :type display: str or None
            :type notes: str or None
            '''

            if isinstance(date_set, DateSet):
                self.set_elements(date_set.elements)
                self.set_display(date_set.display)
                self.set_notes(date_set.notes)
            elif isinstance(date_set, dict):
                for key, value in date_set.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(date_set)
            return self

        @display.setter
        def display(self, display):
            '''
            :type display: str or None
            '''

            self.set_display(display)

        @elements.setter
        def elements(self, elements):
            '''
            :type elements: tuple(dressdiscover.api.models.date.date.Date)
            '''

            self.set_elements(elements)

        @notes.setter
        def notes(self, notes):
            '''
            :type notes: str or None
            '''

            self.set_notes(notes)

    def __init__(
        self,
        elements,
        display=None,
        notes=None,
    ):
        '''
        :type elements: tuple(dressdiscover.api.models.date.date.Date)
        :type display: str or None
        :type notes: str or None
        '''

        if elements is None:
            raise ValueError('elements is required')
        if not (isinstance(elements, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.date.date.Date), elements))) == 0):
            raise TypeError("expected elements to be a tuple(dressdiscover.api.models.date.date.Date) but it is a %s" % getattr(__builtin__, 'type')(elements))
        if len(elements) < 1:
            raise ValueError("expected len(elements) to be >= 1, was %d" % len(elements))
        self.__elements = elements

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
        if self.elements != other.elements:
            return False
        if self.display != other.display:
            return False
        if self.notes != other.notes:
            return False
        return True

    def __hash__(self):
        return hash((self.elements,self.display,self.notes,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('elements=' + repr(self.elements))
        if self.display is not None:
            field_reprs.append('display=' + "'" + self.display.encode('ascii', 'replace') + "'")
        if self.notes is not None:
            field_reprs.append('notes=' + "'" + self.notes.encode('ascii', 'replace') + "'")
        return 'DateSet(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('elements=' + repr(self.elements))
        if self.display is not None:
            field_reprs.append('display=' + "'" + self.display.encode('ascii', 'replace') + "'")
        if self.notes is not None:
            field_reprs.append('notes=' + "'" + self.notes.encode('ascii', 'replace') + "'")
        return 'DateSet(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'elements': self.elements, 'display': self.display, 'notes': self.notes}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.elements, self.display, self.notes,)

    @property
    def display(self):
        '''
        :rtype: str
        '''

        return self.__display

    @property
    def elements(self):
        '''
        :rtype: tuple(dressdiscover.api.models.date.date.Date)
        '''

        return self.__elements

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
        :rtype: dressdiscover.api.models.date.date_set.DateSet
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'elements' and ifield_id == 1:
                init_kwds['elements'] = tuple([dressdiscover.api.models.date.date.Date.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
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
        elements=None,
        display=None,
        notes=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type elements: tuple(dressdiscover.api.models.date.date.Date) or None
        :type display: str or None
        :type notes: str or None
        :rtype: dressdiscover.api.models.date.date_set.DateSet
        '''

        if elements is None:
            elements = self.elements
        if display is None:
            display = self.display
        if notes is None:
            notes = self.notes
        return self.__class__(elements=elements, display=display, notes=notes)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.date.date_set.DateSet
        '''

        oprot.write_struct_begin('DateSet')

        oprot.write_field_begin(name='elements', type=15, id=1)
        oprot.write_list_begin(12, len(self.elements))
        for _0 in self.elements:
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
