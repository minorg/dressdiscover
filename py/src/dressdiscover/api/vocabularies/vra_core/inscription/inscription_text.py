import __builtin__
import dressdiscover.api.vocabularies.vra_core.inscription.inscription_text_type


class InscriptionText(object):
    class Builder(object):
        def __init__(
            self,
            text=None,
            type=None,  # @ReservedAssignment
            lang=None,
        ):
            '''
            :type text: str
            :type type: dressdiscover.api.vocabularies.vra_core.inscription.inscription_text_type.InscriptionTextType
            :type lang: str or None
            '''

            self.__text = text
            self.__type = type
            self.__lang = lang

        def build(self):
            return InscriptionText(text=self.__text, type=self.__type, lang=self.__lang)

        @property
        def lang(self):
            '''
            :rtype: str
            '''

            return self.__lang

        def set_lang(self, lang):
            '''
            :type lang: str or None
            '''

            if lang is not None:
                if not isinstance(lang, basestring):
                    raise TypeError("expected lang to be a str but it is a %s" % getattr(__builtin__, 'type')(lang))
                if len(lang) < 2:
                    raise ValueError("expected len(lang) to be >= 2, was %d" % len(lang))
                if len(lang) > 3:
                    raise ValueError("expected len(lang) to be <= 2, was %d" % len(lang))
            self.__lang = lang
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
            :type type: dressdiscover.api.vocabularies.vra_core.inscription.inscription_text_type.InscriptionTextType
            '''

            if type is None:
                raise ValueError('type is required')
            if not isinstance(type, dressdiscover.api.vocabularies.vra_core.inscription.inscription_text_type.InscriptionTextType):
                raise TypeError("expected type to be a dressdiscover.api.vocabularies.vra_core.inscription.inscription_text_type.InscriptionTextType but it is a %s" % getattr(__builtin__, 'type')(type))
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
            :rtype: dressdiscover.api.vocabularies.vra_core.inscription.inscription_text_type.InscriptionTextType
            '''

            return self.__type

        def update(self, inscription_text):
            '''
            :type text: str
            :type type: dressdiscover.api.vocabularies.vra_core.inscription.inscription_text_type.InscriptionTextType
            :type lang: str or None
            '''

            if isinstance(inscription_text, InscriptionText):
                self.set_text(inscription_text.text)
                self.set_type(inscription_text.type)
                self.set_lang(inscription_text.lang)
            elif isinstance(inscription_text, dict):
                for key, value in inscription_text.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(inscription_text)
            return self

        @lang.setter
        def lang(self, lang):
            '''
            :type lang: str or None
            '''

            self.set_lang(lang)

        @text.setter
        def text(self, text):
            '''
            :type text: str
            '''

            self.set_text(text)

        @type.setter
        def type(self, type):  # @ReservedAssignment
            '''
            :type type: dressdiscover.api.vocabularies.vra_core.inscription.inscription_text_type.InscriptionTextType
            '''

            self.set_type(type)

    class FieldMetadata(object):
        TEXT = None
        TYPE = None
        LANG = None

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
            return (cls.TEXT, cls.TYPE, cls.LANG,)

    FieldMetadata.TEXT = FieldMetadata('text', str, {u'minLength': 1})
    FieldMetadata.TYPE = FieldMetadata('type', dressdiscover.api.vocabularies.vra_core.inscription.inscription_text_type.InscriptionTextType, None)
    FieldMetadata.LANG = FieldMetadata('lang', str, {u'maxLength': 3, u'minLength': 2})

    def __init__(
        self,
        text,
        type,  # @ReservedAssignment
        lang=None,
    ):
        '''
        :type text: str
        :type type: dressdiscover.api.vocabularies.vra_core.inscription.inscription_text_type.InscriptionTextType
        :type lang: str or None
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
        if not isinstance(type, dressdiscover.api.vocabularies.vra_core.inscription.inscription_text_type.InscriptionTextType):
            raise TypeError("expected type to be a dressdiscover.api.vocabularies.vra_core.inscription.inscription_text_type.InscriptionTextType but it is a %s" % getattr(__builtin__, 'type')(type))
        self.__type = type

        if lang is not None:
            if not isinstance(lang, basestring):
                raise TypeError("expected lang to be a str but it is a %s" % getattr(__builtin__, 'type')(lang))
            if len(lang) < 2:
                raise ValueError("expected len(lang) to be >= 2, was %d" % len(lang))
            if len(lang) > 3:
                raise ValueError("expected len(lang) to be <= 2, was %d" % len(lang))
        self.__lang = lang

    def __eq__(self, other):
        if self.text != other.text:
            return False
        if self.type != other.type:
            return False
        if self.lang != other.lang:
            return False
        return True

    def __hash__(self):
        return hash((self.text,self.type,self.lang,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        field_reprs.append('type=' + repr(self.type))
        if self.lang is not None:
            field_reprs.append('lang=' + "'" + self.lang.encode('ascii', 'replace') + "'")
        return 'InscriptionText(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        field_reprs.append('type=' + repr(self.type))
        if self.lang is not None:
            field_reprs.append('lang=' + "'" + self.lang.encode('ascii', 'replace') + "'")
        return 'InscriptionText(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'text': self.text, 'type': self.type, 'lang': self.lang}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.text, self.type, self.lang,)

    @property
    def lang(self):
        '''
        :rtype: str
        '''

        return self.__lang

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.vocabularies.vra_core.inscription.inscription_text.InscriptionText
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'text' and ifield_id == 2:
                init_kwds['text'] = iprot.read_string()
            elif ifield_name == 'type' and ifield_id == 1:
                init_kwds['type'] = dressdiscover.api.vocabularies.vra_core.inscription.inscription_text_type.InscriptionTextType.value_of(iprot.read_string().strip().upper())
            elif ifield_name == 'lang' and ifield_id == 3:
                try:
                    init_kwds['lang'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        text=None,
        type=None,  # @ReservedAssignment
        lang=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type text: str or None
        :type type: dressdiscover.api.vocabularies.vra_core.inscription.inscription_text_type.InscriptionTextType or None
        :type lang: str or None
        :rtype: dressdiscover.api.vocabularies.vra_core.inscription.inscription_text.InscriptionText
        '''

        if text is None:
            text = self.text
        if type is None:
            type = self.type  # @ReservedAssignment
        if lang is None:
            lang = self.lang
        return self.__class__(text=text, type=type, lang=lang)

    @property
    def text(self):
        '''
        :rtype: str
        '''

        return self.__text

    @property
    def type(self):  # @ReservedAssignment
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.inscription.inscription_text_type.InscriptionTextType
        '''

        return self.__type

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.vocabularies.vra_core.inscription.inscription_text.InscriptionText
        '''

        oprot.write_struct_begin('InscriptionText')

        oprot.write_field_begin(name='text', type=11, id=2)
        oprot.write_string(self.text)
        oprot.write_field_end()

        oprot.write_field_begin(name='type', type=11, id=1)
        oprot.write_string(str(self.type))
        oprot.write_field_end()

        if self.lang is not None:
            oprot.write_field_begin(name='lang', type=11, id=3)
            oprot.write_string(self.lang)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
