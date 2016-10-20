from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.vocabularies.vra_core.inscription.inscription_author
import dressdiscover.api.vocabularies.vra_core.inscription.inscription_text


class Inscription(object):
    class Builder(object):
        def __init__(
            self,
            texts=None,
            author=None,
            position=None,
        ):
            '''
            :type texts: tuple(dressdiscover.api.vocabularies.vra_core.inscription.inscription_text.InscriptionText)
            :type author: dressdiscover.api.vocabularies.vra_core.inscription.inscription_author.InscriptionAuthor or None
            :type position: str or None
            '''

            self.__texts = texts
            self.__author = author
            self.__position = position

        def build(self):
            return Inscription(texts=self.__texts, author=self.__author, position=self.__position)

        @property
        def author(self):
            '''
            :rtype: dressdiscover.api.vocabularies.vra_core.inscription.inscription_author.InscriptionAuthor
            '''

            return self.__author

        @property
        def position(self):
            '''
            :rtype: str
            '''

            return self.__position

        def set_author(self, author):
            '''
            :type author: dressdiscover.api.vocabularies.vra_core.inscription.inscription_author.InscriptionAuthor or None
            '''

            if author is not None:
                if not isinstance(author, dressdiscover.api.vocabularies.vra_core.inscription.inscription_author.InscriptionAuthor):
                    raise TypeError("expected author to be a dressdiscover.api.vocabularies.vra_core.inscription.inscription_author.InscriptionAuthor but it is a %s" % getattr(__builtin__, 'type')(author))
            self.__author = author
            return self

        def set_position(self, position):
            '''
            :type position: str or None
            '''

            if position is not None:
                if not isinstance(position, basestring):
                    raise TypeError("expected position to be a str but it is a %s" % getattr(__builtin__, 'type')(position))
                if len(position) < 1:
                    raise ValueError("expected len(position) to be >= 1, was %d" % len(position))
            self.__position = position
            return self

        def set_texts(self, texts):
            '''
            :type texts: tuple(dressdiscover.api.vocabularies.vra_core.inscription.inscription_text.InscriptionText)
            '''

            if texts is None:
                raise ValueError('texts is required')
            if not (isinstance(texts, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.inscription.inscription_text.InscriptionText), texts))) == 0):
                raise TypeError("expected texts to be a tuple(dressdiscover.api.vocabularies.vra_core.inscription.inscription_text.InscriptionText) but it is a %s" % getattr(__builtin__, 'type')(texts))
            if len(texts) < 1:
                raise ValueError("expected len(texts) to be >= 1, was %d" % len(texts))
            self.__texts = texts
            return self

        @property
        def texts(self):
            '''
            :rtype: tuple(dressdiscover.api.vocabularies.vra_core.inscription.inscription_text.InscriptionText)
            '''

            return self.__texts

        def update(self, inscription):
            '''
            :type texts: tuple(dressdiscover.api.vocabularies.vra_core.inscription.inscription_text.InscriptionText)
            :type author: dressdiscover.api.vocabularies.vra_core.inscription.inscription_author.InscriptionAuthor or None
            :type position: str or None
            '''

            if isinstance(inscription, Inscription):
                self.set_texts(inscription.texts)
                self.set_author(inscription.author)
                self.set_position(inscription.position)
            elif isinstance(inscription, dict):
                for key, value in inscription.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(inscription)
            return self

        @author.setter
        def author(self, author):
            '''
            :type author: dressdiscover.api.vocabularies.vra_core.inscription.inscription_author.InscriptionAuthor or None
            '''

            self.set_author(author)

        @position.setter
        def position(self, position):
            '''
            :type position: str or None
            '''

            self.set_position(position)

        @texts.setter
        def texts(self, texts):
            '''
            :type texts: tuple(dressdiscover.api.vocabularies.vra_core.inscription.inscription_text.InscriptionText)
            '''

            self.set_texts(texts)

    class FieldMetadata(object):
        TEXTS = None
        AUTHOR = None
        POSITION = None

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
            return (cls.TEXTS, cls.AUTHOR, cls.POSITION,)

    FieldMetadata.TEXTS = FieldMetadata('texts', tuple, {u'minLength': 1})
    FieldMetadata.AUTHOR = FieldMetadata('author', dressdiscover.api.vocabularies.vra_core.inscription.inscription_author.InscriptionAuthor, None)
    FieldMetadata.POSITION = FieldMetadata('position', str, {u'minLength': 1})

    def __init__(
        self,
        texts,
        author=None,
        position=None,
    ):
        '''
        :type texts: tuple(dressdiscover.api.vocabularies.vra_core.inscription.inscription_text.InscriptionText)
        :type author: dressdiscover.api.vocabularies.vra_core.inscription.inscription_author.InscriptionAuthor or None
        :type position: str or None
        '''

        if texts is None:
            raise ValueError('texts is required')
        if not (isinstance(texts, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.inscription.inscription_text.InscriptionText), texts))) == 0):
            raise TypeError("expected texts to be a tuple(dressdiscover.api.vocabularies.vra_core.inscription.inscription_text.InscriptionText) but it is a %s" % getattr(__builtin__, 'type')(texts))
        if len(texts) < 1:
            raise ValueError("expected len(texts) to be >= 1, was %d" % len(texts))
        self.__texts = texts

        if author is not None:
            if not isinstance(author, dressdiscover.api.vocabularies.vra_core.inscription.inscription_author.InscriptionAuthor):
                raise TypeError("expected author to be a dressdiscover.api.vocabularies.vra_core.inscription.inscription_author.InscriptionAuthor but it is a %s" % getattr(__builtin__, 'type')(author))
        self.__author = author

        if position is not None:
            if not isinstance(position, basestring):
                raise TypeError("expected position to be a str but it is a %s" % getattr(__builtin__, 'type')(position))
            if len(position) < 1:
                raise ValueError("expected len(position) to be >= 1, was %d" % len(position))
        self.__position = position

    def __eq__(self, other):
        if self.texts != other.texts:
            return False
        if self.author != other.author:
            return False
        if self.position != other.position:
            return False
        return True

    def __hash__(self):
        return hash((self.texts,self.author,self.position,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('texts=' + repr(self.texts))
        if self.author is not None:
            field_reprs.append('author=' + repr(self.author))
        if self.position is not None:
            field_reprs.append('position=' + "'" + self.position.encode('ascii', 'replace') + "'")
        return 'Inscription(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('texts=' + repr(self.texts))
        if self.author is not None:
            field_reprs.append('author=' + repr(self.author))
        if self.position is not None:
            field_reprs.append('position=' + "'" + self.position.encode('ascii', 'replace') + "'")
        return 'Inscription(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'texts': self.texts, 'author': self.author, 'position': self.position}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.texts, self.author, self.position,)

    @property
    def author(self):
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.inscription.inscription_author.InscriptionAuthor
        '''

        return self.__author

    @property
    def position(self):
        '''
        :rtype: str
        '''

        return self.__position

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.vocabularies.vra_core.inscription.inscription.Inscription
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'texts' and ifield_id == 1:
                init_kwds['texts'] = tuple([dressdiscover.api.vocabularies.vra_core.inscription.inscription_text.InscriptionText.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'author' and ifield_id == 2:
                init_kwds['author'] = dressdiscover.api.vocabularies.vra_core.inscription.inscription_author.InscriptionAuthor.read(iprot)
            elif ifield_name == 'position' and ifield_id == 3:
                try:
                    init_kwds['position'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        texts=None,
        author=None,
        position=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type texts: tuple(dressdiscover.api.vocabularies.vra_core.inscription.inscription_text.InscriptionText) or None
        :type author: dressdiscover.api.vocabularies.vra_core.inscription.inscription_author.InscriptionAuthor or None
        :type position: str or None
        :rtype: dressdiscover.api.vocabularies.vra_core.inscription.inscription.Inscription
        '''

        if texts is None:
            texts = self.texts
        if author is None:
            author = self.author
        if position is None:
            position = self.position
        return self.__class__(texts=texts, author=author, position=position)

    @property
    def texts(self):
        '''
        :rtype: tuple(dressdiscover.api.vocabularies.vra_core.inscription.inscription_text.InscriptionText)
        '''

        return self.__texts

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.vocabularies.vra_core.inscription.inscription.Inscription
        '''

        oprot.write_struct_begin('Inscription')

        oprot.write_field_begin(name='texts', type=15, id=1)
        oprot.write_list_begin(12, len(self.texts))
        for _0 in self.texts:
            _0.write(oprot)
        oprot.write_list_end()
        oprot.write_field_end()

        if self.author is not None:
            oprot.write_field_begin(name='author', type=12, id=2)
            self.author.write(oprot)
            oprot.write_field_end()

        if self.position is not None:
            oprot.write_field_begin(name='position', type=11, id=3)
            oprot.write_string(self.position)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
