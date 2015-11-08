from itertools import ifilterfalse
import __builtin__
import costume.api.models.subject.subject


class SubjectSet(object):
    class Builder(object):
        def __init__(
            self,
            subject=None,
            display=None,
            notes=None,
        ):
            '''
            :type subject: tuple(costume.api.models.subject.subject.Subject)
            :type display: str or None
            :type notes: str or None
            '''

            self.__subject = subject
            self.__display = display
            self.__notes = notes

        def build(self):
            return SubjectSet(subject=self.__subject, display=self.__display, notes=self.__notes)

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

        def set_subject(self, subject):
            '''
            :type subject: tuple(costume.api.models.subject.subject.Subject)
            '''

            self.__subject = subject
            return self

        @property
        def subject(self):
            '''
            :rtype: tuple(costume.api.models.subject.subject.Subject)
            '''

            return self.__subject

        def update(self, subject_set):
            '''
            :type subject: tuple(costume.api.models.subject.subject.Subject)
            :type display: str or None
            :type notes: str or None
            '''

            if isinstance(subject_set, SubjectSet):
                self.set_subject(subject_set.subject)
                self.set_display(subject_set.display)
                self.set_notes(subject_set.notes)
            elif isinstance(subject_set, dict):
                for key, value in subject_set.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(subject_set)
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

        @subject.setter
        def subject(self, subject):
            '''
            :type subject: tuple(costume.api.models.subject.subject.Subject)
            '''

            self.set_subject(subject)

    def __init__(
        self,
        subject,
        display=None,
        notes=None,
    ):
        '''
        :type subject: tuple(costume.api.models.subject.subject.Subject)
        :type display: str or None
        :type notes: str or None
        '''

        if subject is None:
            raise ValueError('subject is required')
        if not (isinstance(subject, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, costume.api.models.subject.subject.Subject), subject))) == 0):
            raise TypeError("expected subject to be a tuple(costume.api.models.subject.subject.Subject) but it is a %s" % getattr(__builtin__, 'type')(subject))
        if len(subject) < 1:
            raise ValueError("expected len(subject) to be >= 1, was %d" % len(subject))
        self.__subject = subject

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
        if self.subject != other.subject:
            return False
        if self.display != other.display:
            return False
        if self.notes != other.notes:
            return False
        return True

    def __hash__(self):
        return hash((self.subject,self.display,self.notes,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('subject=' + repr(self.subject))
        if self.display is not None:
            field_reprs.append('display=' + "'" + self.display.encode('ascii', 'replace') + "'")
        if self.notes is not None:
            field_reprs.append('notes=' + "'" + self.notes.encode('ascii', 'replace') + "'")
        return 'SubjectSet(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('subject=' + repr(self.subject))
        if self.display is not None:
            field_reprs.append('display=' + "'" + self.display.encode('ascii', 'replace') + "'")
        if self.notes is not None:
            field_reprs.append('notes=' + "'" + self.notes.encode('ascii', 'replace') + "'")
        return 'SubjectSet(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'subject': self.subject, 'display': self.display, 'notes': self.notes}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.subject, self.display, self.notes,)

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
        :rtype: costume.api.models.subject.subject_set.SubjectSet
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'subject' and ifield_id == 1:
                init_kwds['subject'] = tuple([costume.api.models.subject.subject.Subject.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
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
        subject=None,
        display=None,
        notes=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type subject: tuple(costume.api.models.subject.subject.Subject) or None
        :type display: str or None
        :type notes: str or None
        :rtype: costume.api.models.subject.subject_set.SubjectSet
        '''

        if subject is None:
            subject = self.subject
        if display is None:
            display = self.display
        if notes is None:
            notes = self.notes
        return self.__class__(subject=subject, display=display, notes=notes)

    @property
    def subject(self):
        '''
        :rtype: tuple(costume.api.models.subject.subject.Subject)
        '''

        return self.__subject

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.models.subject.subject_set.SubjectSet
        '''

        oprot.write_struct_begin('SubjectSet')

        oprot.write_field_begin(name='subject', type=15, id=1)
        oprot.write_list_begin(12, len(self.subject))
        for _0 in self.subject:
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
