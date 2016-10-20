import __builtin__
import dressdiscover.api.models.vocab


class VocabRef(object):
    class Builder(object):
        def __init__(
            self,
            vocab=None,
            refid=None,
            uri=None,
        ):
            '''
            :type vocab: dressdiscover.api.models.vocab.Vocab
            :type refid: str or None
            :type uri: str or None
            '''

            self.__vocab = vocab
            self.__refid = refid
            self.__uri = uri

        def build(self):
            return VocabRef(vocab=self.__vocab, refid=self.__refid, uri=self.__uri)

        @property
        def refid(self):
            '''
            :rtype: str
            '''

            return self.__refid

        def set_refid(self, refid):
            '''
            :type refid: str or None
            '''

            if refid is not None:
                if not isinstance(refid, basestring):
                    raise TypeError("expected refid to be a str but it is a %s" % getattr(__builtin__, 'type')(refid))
                if len(refid) < 1:
                    raise ValueError("expected len(refid) to be >= 1, was %d" % len(refid))
            self.__refid = refid
            return self

        def set_uri(self, uri):
            '''
            :type uri: str or None
            '''

            if uri is not None:
                if not isinstance(uri, basestring):
                    raise TypeError("expected uri to be a str but it is a %s" % getattr(__builtin__, 'type')(uri))
            self.__uri = uri
            return self

        def set_vocab(self, vocab):
            '''
            :type vocab: dressdiscover.api.models.vocab.Vocab
            '''

            if vocab is None:
                raise ValueError('vocab is required')
            if not isinstance(vocab, dressdiscover.api.models.vocab.Vocab):
                raise TypeError("expected vocab to be a dressdiscover.api.models.vocab.Vocab but it is a %s" % getattr(__builtin__, 'type')(vocab))
            self.__vocab = vocab
            return self

        def update(self, vocab_ref):
            '''
            :type vocab: dressdiscover.api.models.vocab.Vocab
            :type refid: str or None
            :type uri: str or None
            '''

            if isinstance(vocab_ref, VocabRef):
                self.set_vocab(vocab_ref.vocab)
                self.set_refid(vocab_ref.refid)
                self.set_uri(vocab_ref.uri)
            elif isinstance(vocab_ref, dict):
                for key, value in vocab_ref.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(vocab_ref)
            return self

        @property
        def uri(self):
            '''
            :rtype: str
            '''

            return self.__uri

        @property
        def vocab(self):
            '''
            :rtype: dressdiscover.api.models.vocab.Vocab
            '''

            return self.__vocab

        @refid.setter
        def refid(self, refid):
            '''
            :type refid: str or None
            '''

            self.set_refid(refid)

        @uri.setter
        def uri(self, uri):
            '''
            :type uri: str or None
            '''

            self.set_uri(uri)

        @vocab.setter
        def vocab(self, vocab):
            '''
            :type vocab: dressdiscover.api.models.vocab.Vocab
            '''

            self.set_vocab(vocab)

    class FieldMetadata(object):
        VOCAB = None
        REFID = None
        URI = None

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
            return (cls.VOCAB, cls.REFID, cls.URI,)

    FieldMetadata.VOCAB = FieldMetadata('vocab', dressdiscover.api.models.vocab.Vocab, None)
    FieldMetadata.REFID = FieldMetadata('refid', str, {u'minLength': 1})
    FieldMetadata.URI = FieldMetadata('uri', str, None)

    def __init__(
        self,
        vocab,
        refid=None,
        uri=None,
    ):
        '''
        :type vocab: dressdiscover.api.models.vocab.Vocab
        :type refid: str or None
        :type uri: str or None
        '''

        if vocab is None:
            raise ValueError('vocab is required')
        if not isinstance(vocab, dressdiscover.api.models.vocab.Vocab):
            raise TypeError("expected vocab to be a dressdiscover.api.models.vocab.Vocab but it is a %s" % getattr(__builtin__, 'type')(vocab))
        self.__vocab = vocab

        if refid is not None:
            if not isinstance(refid, basestring):
                raise TypeError("expected refid to be a str but it is a %s" % getattr(__builtin__, 'type')(refid))
            if len(refid) < 1:
                raise ValueError("expected len(refid) to be >= 1, was %d" % len(refid))
        self.__refid = refid

        if uri is not None:
            if not isinstance(uri, basestring):
                raise TypeError("expected uri to be a str but it is a %s" % getattr(__builtin__, 'type')(uri))
        self.__uri = uri

    def __eq__(self, other):
        if self.vocab != other.vocab:
            return False
        if self.refid != other.refid:
            return False
        if self.uri != other.uri:
            return False
        return True

    def __hash__(self):
        return hash((self.vocab,self.refid,self.uri,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('vocab=' + repr(self.vocab))
        if self.refid is not None:
            field_reprs.append('refid=' + "'" + self.refid.encode('ascii', 'replace') + "'")
        if self.uri is not None:
            field_reprs.append('uri=' + "'" + self.uri.encode('ascii', 'replace') + "'")
        return 'VocabRef(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('vocab=' + repr(self.vocab))
        if self.refid is not None:
            field_reprs.append('refid=' + "'" + self.refid.encode('ascii', 'replace') + "'")
        if self.uri is not None:
            field_reprs.append('uri=' + "'" + self.uri.encode('ascii', 'replace') + "'")
        return 'VocabRef(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'vocab': self.vocab, 'refid': self.refid, 'uri': self.uri}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.vocab, self.refid, self.uri,)

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.vocab_ref.VocabRef
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'vocab' and ifield_id == 2:
                init_kwds['vocab'] = dressdiscover.api.models.vocab.Vocab.value_of(iprot.read_string().strip().upper())
            elif ifield_name == 'refid' and ifield_id == 1:
                try:
                    init_kwds['refid'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'uri' and ifield_id == 3:
                try:
                    init_kwds['uri'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    @property
    def refid(self):
        '''
        :rtype: str
        '''

        return self.__refid

    def replace(
        self,
        vocab=None,
        refid=None,
        uri=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type vocab: dressdiscover.api.models.vocab.Vocab or None
        :type refid: str or None
        :type uri: str or None
        :rtype: dressdiscover.api.models.vocab_ref.VocabRef
        '''

        if vocab is None:
            vocab = self.vocab
        if refid is None:
            refid = self.refid
        if uri is None:
            uri = self.uri
        return self.__class__(vocab=vocab, refid=refid, uri=uri)

    @property
    def uri(self):
        '''
        :rtype: str
        '''

        return self.__uri

    @property
    def vocab(self):
        '''
        :rtype: dressdiscover.api.models.vocab.Vocab
        '''

        return self.__vocab

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.vocab_ref.VocabRef
        '''

        oprot.write_struct_begin('VocabRef')

        oprot.write_field_begin(name='vocab', type=11, id=2)
        oprot.write_string(str(self.vocab))
        oprot.write_field_end()

        if self.refid is not None:
            oprot.write_field_begin(name='refid', type=11, id=1)
            oprot.write_string(self.refid)
            oprot.write_field_end()

        if self.uri is not None:
            oprot.write_field_begin(name='uri', type=11, id=3)
            oprot.write_string(self.uri)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
