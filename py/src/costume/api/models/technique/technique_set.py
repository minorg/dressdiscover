from itertools import ifilterfalse
import __builtin__
import costume.api.models.technique.technique


class TechniqueSet(object):
    class Builder(object):
        def __init__(
            self,
            techniques=None,
            display=None,
            notes=None,
        ):
            '''
            :type techniques: tuple(costume.api.models.technique.technique.Technique)
            :type display: str or None
            :type notes: str or None
            '''

            self.__techniques = techniques
            self.__display = display
            self.__notes = notes

        def build(self):
            return TechniqueSet(techniques=self.__techniques, display=self.__display, notes=self.__notes)

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

        def set_techniques(self, techniques):
            '''
            :type techniques: tuple(costume.api.models.technique.technique.Technique)
            '''

            self.__techniques = techniques
            return self

        @property
        def techniques(self):
            '''
            :rtype: tuple(costume.api.models.technique.technique.Technique)
            '''

            return self.__techniques

        def update(self, technique_set):
            '''
            :type techniques: tuple(costume.api.models.technique.technique.Technique)
            :type display: str or None
            :type notes: str or None
            '''

            if isinstance(technique_set, TechniqueSet):
                self.set_techniques(technique_set.techniques)
                self.set_display(technique_set.display)
                self.set_notes(technique_set.notes)
            elif isinstance(technique_set, dict):
                for key, value in technique_set.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(technique_set)
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

        @techniques.setter
        def techniques(self, techniques):
            '''
            :type techniques: tuple(costume.api.models.technique.technique.Technique)
            '''

            self.set_techniques(techniques)

    def __init__(
        self,
        techniques,
        display=None,
        notes=None,
    ):
        '''
        :type techniques: tuple(costume.api.models.technique.technique.Technique)
        :type display: str or None
        :type notes: str or None
        '''

        if techniques is None:
            raise ValueError('techniques is required')
        if not (isinstance(techniques, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, costume.api.models.technique.technique.Technique), techniques))) == 0):
            raise TypeError("expected techniques to be a tuple(costume.api.models.technique.technique.Technique) but it is a %s" % getattr(__builtin__, 'type')(techniques))
        if len(techniques) < 1:
            raise ValueError("expected len(techniques) to be >= 1, was %d" % len(techniques))
        self.__techniques = techniques

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
        if self.techniques != other.techniques:
            return False
        if self.display != other.display:
            return False
        if self.notes != other.notes:
            return False
        return True

    def __hash__(self):
        return hash((self.techniques,self.display,self.notes,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('techniques=' + repr(self.techniques))
        if self.display is not None:
            field_reprs.append('display=' + "'" + self.display.encode('ascii', 'replace') + "'")
        if self.notes is not None:
            field_reprs.append('notes=' + "'" + self.notes.encode('ascii', 'replace') + "'")
        return 'TechniqueSet(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('techniques=' + repr(self.techniques))
        if self.display is not None:
            field_reprs.append('display=' + "'" + self.display.encode('ascii', 'replace') + "'")
        if self.notes is not None:
            field_reprs.append('notes=' + "'" + self.notes.encode('ascii', 'replace') + "'")
        return 'TechniqueSet(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'techniques': self.techniques, 'display': self.display, 'notes': self.notes}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.techniques, self.display, self.notes,)

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
        :rtype: costume.api.models.technique.technique_set.TechniqueSet
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'techniques' and ifield_id == 1:
                init_kwds['techniques'] = tuple([costume.api.models.technique.technique.Technique.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
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
        techniques=None,
        display=None,
        notes=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type techniques: tuple(costume.api.models.technique.technique.Technique) or None
        :type display: str or None
        :type notes: str or None
        :rtype: costume.api.models.technique.technique_set.TechniqueSet
        '''

        if techniques is None:
            techniques = self.techniques
        if display is None:
            display = self.display
        if notes is None:
            notes = self.notes
        return self.__class__(techniques=techniques, display=display, notes=notes)

    @property
    def techniques(self):
        '''
        :rtype: tuple(costume.api.models.technique.technique.Technique)
        '''

        return self.__techniques

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.models.technique.technique_set.TechniqueSet
        '''

        oprot.write_struct_begin('TechniqueSet')

        oprot.write_field_begin(name='techniques', type=15, id=1)
        oprot.write_list_begin(12, len(self.techniques))
        for _0 in self.techniques:
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
