import __builtin__
import dressdiscover.api.models.vocab_ref
import dressdiscover.api.vocabularies.vra_core.rights.rights_type


class Rights(object):
    class Builder(object):
        def __init__(
            self,
            text=None,
            type=None,  # @ReservedAssignment
            license_vocab_ref=None,
            notes=None,
            rights_holder=None,
        ):
            '''
            :type text: str
            :type type: dressdiscover.api.vocabularies.vra_core.rights.rights_type.RightsType
            :type license_vocab_ref: dressdiscover.api.models.vocab_ref.VocabRef or None
            :type notes: str or None
            :type rights_holder: str or None
            '''

            self.__text = text
            self.__type = type
            self.__license_vocab_ref = license_vocab_ref
            self.__notes = notes
            self.__rights_holder = rights_holder

        def build(self):
            return Rights(text=self.__text, type=self.__type, license_vocab_ref=self.__license_vocab_ref, notes=self.__notes, rights_holder=self.__rights_holder)

        @property
        def license_vocab_ref(self):
            '''
            :rtype: dressdiscover.api.models.vocab_ref.VocabRef
            '''

            return self.__license_vocab_ref

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

        def set_license_vocab_ref(self, license_vocab_ref):
            '''
            :type license_vocab_ref: dressdiscover.api.models.vocab_ref.VocabRef or None
            '''

            if license_vocab_ref is not None:
                if not isinstance(license_vocab_ref, dressdiscover.api.models.vocab_ref.VocabRef):
                    raise TypeError("expected license_vocab_ref to be a dressdiscover.api.models.vocab_ref.VocabRef but it is a %s" % getattr(__builtin__, 'type')(license_vocab_ref))
            self.__license_vocab_ref = license_vocab_ref
            return self

        def set_notes(self, notes):
            '''
            :type notes: str or None
            '''

            if notes is not None:
                if not isinstance(notes, basestring):
                    raise TypeError("expected notes to be a str but it is a %s" % getattr(__builtin__, 'type')(notes))
                if len(notes) < 1:
                    raise ValueError("expected len(notes) to be >= 1, was %d" % len(notes))
            self.__notes = notes
            return self

        def set_rights_holder(self, rights_holder):
            '''
            :type rights_holder: str or None
            '''

            if rights_holder is not None:
                if not isinstance(rights_holder, basestring):
                    raise TypeError("expected rights_holder to be a str but it is a %s" % getattr(__builtin__, 'type')(rights_holder))
                if len(rights_holder) < 1:
                    raise ValueError("expected len(rights_holder) to be >= 1, was %d" % len(rights_holder))
            self.__rights_holder = rights_holder
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
            :type type: dressdiscover.api.vocabularies.vra_core.rights.rights_type.RightsType
            '''

            if type is None:
                raise ValueError('type is required')
            if not isinstance(type, dressdiscover.api.vocabularies.vra_core.rights.rights_type.RightsType):
                raise TypeError("expected type to be a dressdiscover.api.vocabularies.vra_core.rights.rights_type.RightsType but it is a %s" % getattr(__builtin__, 'type')(type))
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
            :rtype: dressdiscover.api.vocabularies.vra_core.rights.rights_type.RightsType
            '''

            return self.__type

        def update(self, rights):
            '''
            :type text: str
            :type type: dressdiscover.api.vocabularies.vra_core.rights.rights_type.RightsType
            :type license_vocab_ref: dressdiscover.api.models.vocab_ref.VocabRef or None
            :type notes: str or None
            :type rights_holder: str or None
            '''

            if isinstance(rights, Rights):
                self.set_text(rights.text)
                self.set_type(rights.type)
                self.set_license_vocab_ref(rights.license_vocab_ref)
                self.set_notes(rights.notes)
                self.set_rights_holder(rights.rights_holder)
            elif isinstance(rights, dict):
                for key, value in rights.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(rights)
            return self

        @license_vocab_ref.setter
        def license_vocab_ref(self, license_vocab_ref):
            '''
            :type license_vocab_ref: dressdiscover.api.models.vocab_ref.VocabRef or None
            '''

            self.set_license_vocab_ref(license_vocab_ref)

        @notes.setter
        def notes(self, notes):
            '''
            :type notes: str or None
            '''

            self.set_notes(notes)

        @rights_holder.setter
        def rights_holder(self, rights_holder):
            '''
            :type rights_holder: str or None
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
            :type type: dressdiscover.api.vocabularies.vra_core.rights.rights_type.RightsType
            '''

            self.set_type(type)

    class FieldMetadata(object):
        TEXT = None
        TYPE = None
        LICENSE_VOCAB_REF = None
        NOTES = None
        RIGHTS_HOLDER = None

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
            return (cls.TEXT, cls.TYPE, cls.LICENSE_VOCAB_REF, cls.NOTES, cls.RIGHTS_HOLDER,)

    FieldMetadata.TEXT = FieldMetadata('text', str, {u'minLength': 1})
    FieldMetadata.TYPE = FieldMetadata('type', dressdiscover.api.vocabularies.vra_core.rights.rights_type.RightsType, None)
    FieldMetadata.LICENSE_VOCAB_REF = FieldMetadata('license_vocab_ref', dressdiscover.api.models.vocab_ref.VocabRef, None)
    FieldMetadata.NOTES = FieldMetadata('notes', str, {u'minLength': 1})
    FieldMetadata.RIGHTS_HOLDER = FieldMetadata('rights_holder', str, {u'minLength': 1})

    def __init__(
        self,
        text,
        type,  # @ReservedAssignment
        license_vocab_ref=None,
        notes=None,
        rights_holder=None,
    ):
        '''
        :type text: str
        :type type: dressdiscover.api.vocabularies.vra_core.rights.rights_type.RightsType
        :type license_vocab_ref: dressdiscover.api.models.vocab_ref.VocabRef or None
        :type notes: str or None
        :type rights_holder: str or None
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
        if not isinstance(type, dressdiscover.api.vocabularies.vra_core.rights.rights_type.RightsType):
            raise TypeError("expected type to be a dressdiscover.api.vocabularies.vra_core.rights.rights_type.RightsType but it is a %s" % getattr(__builtin__, 'type')(type))
        self.__type = type

        if license_vocab_ref is not None:
            if not isinstance(license_vocab_ref, dressdiscover.api.models.vocab_ref.VocabRef):
                raise TypeError("expected license_vocab_ref to be a dressdiscover.api.models.vocab_ref.VocabRef but it is a %s" % getattr(__builtin__, 'type')(license_vocab_ref))
        self.__license_vocab_ref = license_vocab_ref

        if notes is not None:
            if not isinstance(notes, basestring):
                raise TypeError("expected notes to be a str but it is a %s" % getattr(__builtin__, 'type')(notes))
            if len(notes) < 1:
                raise ValueError("expected len(notes) to be >= 1, was %d" % len(notes))
        self.__notes = notes

        if rights_holder is not None:
            if not isinstance(rights_holder, basestring):
                raise TypeError("expected rights_holder to be a str but it is a %s" % getattr(__builtin__, 'type')(rights_holder))
            if len(rights_holder) < 1:
                raise ValueError("expected len(rights_holder) to be >= 1, was %d" % len(rights_holder))
        self.__rights_holder = rights_holder

    def __eq__(self, other):
        if self.text != other.text:
            return False
        if self.type != other.type:
            return False
        if self.license_vocab_ref != other.license_vocab_ref:
            return False
        if self.notes != other.notes:
            return False
        if self.rights_holder != other.rights_holder:
            return False
        return True

    def __hash__(self):
        return hash((self.text,self.type,self.license_vocab_ref,self.notes,self.rights_holder,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        field_reprs.append('type=' + repr(self.type))
        if self.license_vocab_ref is not None:
            field_reprs.append('license_vocab_ref=' + repr(self.license_vocab_ref))
        if self.notes is not None:
            field_reprs.append('notes=' + "'" + self.notes.encode('ascii', 'replace') + "'")
        if self.rights_holder is not None:
            field_reprs.append('rights_holder=' + "'" + self.rights_holder.encode('ascii', 'replace') + "'")
        return 'Rights(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        field_reprs.append('type=' + repr(self.type))
        if self.license_vocab_ref is not None:
            field_reprs.append('license_vocab_ref=' + repr(self.license_vocab_ref))
        if self.notes is not None:
            field_reprs.append('notes=' + "'" + self.notes.encode('ascii', 'replace') + "'")
        if self.rights_holder is not None:
            field_reprs.append('rights_holder=' + "'" + self.rights_holder.encode('ascii', 'replace') + "'")
        return 'Rights(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'text': self.text, 'type': self.type, 'license_vocab_ref': self.license_vocab_ref, 'notes': self.notes, 'rights_holder': self.rights_holder}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.text, self.type, self.license_vocab_ref, self.notes, self.rights_holder,)

    @property
    def license_vocab_ref(self):
        '''
        :rtype: dressdiscover.api.models.vocab_ref.VocabRef
        '''

        return self.__license_vocab_ref

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
        :rtype: dressdiscover.api.vocabularies.vra_core.rights.rights.Rights
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'text' and ifield_id == 2:
                init_kwds['text'] = iprot.read_string()
            elif ifield_name == 'type' and ifield_id == 3:
                init_kwds['type'] = dressdiscover.api.vocabularies.vra_core.rights.rights_type.RightsType.value_of(iprot.read_string().strip().upper())
            elif ifield_name == 'license_vocab_ref' and ifield_id == 5:
                init_kwds['license_vocab_ref'] = dressdiscover.api.models.vocab_ref.VocabRef.read(iprot)
            elif ifield_name == 'notes' and ifield_id == 4:
                try:
                    init_kwds['notes'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'rights_holder' and ifield_id == 1:
                try:
                    init_kwds['rights_holder'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        text=None,
        type=None,  # @ReservedAssignment
        license_vocab_ref=None,
        notes=None,
        rights_holder=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type text: str or None
        :type type: dressdiscover.api.vocabularies.vra_core.rights.rights_type.RightsType or None
        :type license_vocab_ref: dressdiscover.api.models.vocab_ref.VocabRef or None
        :type notes: str or None
        :type rights_holder: str or None
        :rtype: dressdiscover.api.vocabularies.vra_core.rights.rights.Rights
        '''

        if text is None:
            text = self.text
        if type is None:
            type = self.type  # @ReservedAssignment
        if license_vocab_ref is None:
            license_vocab_ref = self.license_vocab_ref
        if notes is None:
            notes = self.notes
        if rights_holder is None:
            rights_holder = self.rights_holder
        return self.__class__(text=text, type=type, license_vocab_ref=license_vocab_ref, notes=notes, rights_holder=rights_holder)

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
        :rtype: dressdiscover.api.vocabularies.vra_core.rights.rights_type.RightsType
        '''

        return self.__type

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.vocabularies.vra_core.rights.rights.Rights
        '''

        oprot.write_struct_begin('Rights')

        oprot.write_field_begin(name='text', type=11, id=2)
        oprot.write_string(self.text)
        oprot.write_field_end()

        oprot.write_field_begin(name='type', type=11, id=3)
        oprot.write_string(str(self.type))
        oprot.write_field_end()

        if self.license_vocab_ref is not None:
            oprot.write_field_begin(name='license_vocab_ref', type=12, id=5)
            self.license_vocab_ref.write(oprot)
            oprot.write_field_end()

        if self.notes is not None:
            oprot.write_field_begin(name='notes', type=11, id=4)
            oprot.write_string(self.notes)
            oprot.write_field_end()

        if self.rights_holder is not None:
            oprot.write_field_begin(name='rights_holder', type=11, id=1)
            oprot.write_string(self.rights_holder)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
