from itertools import ifilterfalse
import __builtin__
import costume.api.models.inscription.inscription


class InscriptionSet(object):
    class Builder(object):
        def __init__(
            self,
            inscriptions=None,
            display=None,
            notes=None,
        ):
            '''
            :type inscriptions: tuple(costume.api.models.inscription.inscription.Inscription)
            :type display: str or None
            :type notes: str or None
            '''

            self.__inscriptions = inscriptions
            self.__display = display
            self.__notes = notes

        def build(self):
            return InscriptionSet(inscriptions=self.__inscriptions, display=self.__display, notes=self.__notes)

        @property
        def display(self):
            '''
            :rtype: str
            '''

            return self.__display

        @property
        def inscriptions(self):
            '''
            :rtype: tuple(costume.api.models.inscription.inscription.Inscription)
            '''

            return self.__inscriptions

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

        def set_inscriptions(self, inscriptions):
            '''
            :type inscriptions: tuple(costume.api.models.inscription.inscription.Inscription)
            '''

            self.__inscriptions = inscriptions
            return self

        def set_notes(self, notes):
            '''
            :type notes: str or None
            '''

            self.__notes = notes
            return self

        def update(self, inscription_set):
            '''
            :type inscriptions: tuple(costume.api.models.inscription.inscription.Inscription)
            :type display: str or None
            :type notes: str or None
            '''

            if isinstance(inscription_set, InscriptionSet):
                self.set_inscriptions(inscription_set.inscriptions)
                self.set_display(inscription_set.display)
                self.set_notes(inscription_set.notes)
            elif isinstance(inscription_set, dict):
                for key, value in inscription_set.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(inscription_set)
            return self

        @display.setter
        def display(self, display):
            '''
            :type display: str or None
            '''

            self.set_display(display)

        @inscriptions.setter
        def inscriptions(self, inscriptions):
            '''
            :type inscriptions: tuple(costume.api.models.inscription.inscription.Inscription)
            '''

            self.set_inscriptions(inscriptions)

        @notes.setter
        def notes(self, notes):
            '''
            :type notes: str or None
            '''

            self.set_notes(notes)

    def __init__(
        self,
        inscriptions,
        display=None,
        notes=None,
    ):
        '''
        :type inscriptions: tuple(costume.api.models.inscription.inscription.Inscription)
        :type display: str or None
        :type notes: str or None
        '''

        if inscriptions is None:
            raise ValueError('inscriptions is required')
        if not (isinstance(inscriptions, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, costume.api.models.inscription.inscription.Inscription), inscriptions))) == 0):
            raise TypeError("expected inscriptions to be a tuple(costume.api.models.inscription.inscription.Inscription) but it is a %s" % getattr(__builtin__, 'type')(inscriptions))
        if len(inscriptions) < 1:
            raise ValueError("expected len(inscriptions) to be >= 1, was %d" % len(inscriptions))
        self.__inscriptions = inscriptions

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
        if self.inscriptions != other.inscriptions:
            return False
        if self.display != other.display:
            return False
        if self.notes != other.notes:
            return False
        return True

    def __hash__(self):
        return hash((self.inscriptions,self.display,self.notes,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('inscriptions=' + repr(self.inscriptions))
        if self.display is not None:
            field_reprs.append('display=' + "'" + self.display.encode('ascii', 'replace') + "'")
        if self.notes is not None:
            field_reprs.append('notes=' + "'" + self.notes.encode('ascii', 'replace') + "'")
        return 'InscriptionSet(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('inscriptions=' + repr(self.inscriptions))
        if self.display is not None:
            field_reprs.append('display=' + "'" + self.display.encode('ascii', 'replace') + "'")
        if self.notes is not None:
            field_reprs.append('notes=' + "'" + self.notes.encode('ascii', 'replace') + "'")
        return 'InscriptionSet(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'inscriptions': self.inscriptions, 'display': self.display, 'notes': self.notes}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.inscriptions, self.display, self.notes,)

    @property
    def display(self):
        '''
        :rtype: str
        '''

        return self.__display

    @property
    def inscriptions(self):
        '''
        :rtype: tuple(costume.api.models.inscription.inscription.Inscription)
        '''

        return self.__inscriptions

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
        :rtype: costume.api.models.inscription.inscription_set.InscriptionSet
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'inscriptions' and ifield_id == 1:
                init_kwds['inscriptions'] = tuple([costume.api.models.inscription.inscription.Inscription.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
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
        inscriptions=None,
        display=None,
        notes=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type inscriptions: tuple(costume.api.models.inscription.inscription.Inscription) or None
        :type display: str or None
        :type notes: str or None
        :rtype: costume.api.models.inscription.inscription_set.InscriptionSet
        '''

        if inscriptions is None:
            inscriptions = self.inscriptions
        if display is None:
            display = self.display
        if notes is None:
            notes = self.notes
        return self.__class__(inscriptions=inscriptions, display=display, notes=notes)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.models.inscription.inscription_set.InscriptionSet
        '''

        oprot.write_struct_begin('InscriptionSet')

        oprot.write_field_begin(name='inscriptions', type=15, id=1)
        oprot.write_list_begin(12, len(self.inscriptions))
        for _0 in self.inscriptions:
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
