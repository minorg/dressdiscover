import __builtin__
import costume.api.models.vocab


class Technique(object):
    class Builder(object):
        def __init__(
            self,
            title=None,
            refid=None,
            vocab=None,
        ):
            '''
            :type title: str
            :type refid: str or None
            :type vocab: costume.api.models.vocab.Vocab or None
            '''

            self.__title = title
            self.__refid = refid
            self.__vocab = vocab

        def build(self):
            return Technique(title=self.__title, refid=self.__refid, vocab=self.__vocab)

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

            self.__refid = refid
            return self

        def set_title(self, title):
            '''
            :type title: str
            '''

            self.__title = title
            return self

        def set_vocab(self, vocab):
            '''
            :type vocab: costume.api.models.vocab.Vocab or None
            '''

            self.__vocab = vocab
            return self

        @property
        def title(self):
            '''
            :rtype: str
            '''

            return self.__title

        def update(self, technique):
            '''
            :type title: str
            :type refid: str or None
            :type vocab: costume.api.models.vocab.Vocab or None
            '''

            if isinstance(technique, Technique):
                self.set_title(technique.title)
                self.set_refid(technique.refid)
                self.set_vocab(technique.vocab)
            elif isinstance(technique, dict):
                for key, value in technique.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(technique)
            return self

        @property
        def vocab(self):
            '''
            :rtype: costume.api.models.vocab.Vocab
            '''

            return self.__vocab

        @refid.setter
        def refid(self, refid):
            '''
            :type refid: str or None
            '''

            self.set_refid(refid)

        @title.setter
        def title(self, title):
            '''
            :type title: str
            '''

            self.set_title(title)

        @vocab.setter
        def vocab(self, vocab):
            '''
            :type vocab: costume.api.models.vocab.Vocab or None
            '''

            self.set_vocab(vocab)

    def __init__(
        self,
        title,
        refid=None,
        vocab=None,
    ):
        '''
        :type title: str
        :type refid: str or None
        :type vocab: costume.api.models.vocab.Vocab or None
        '''

        if title is None:
            raise ValueError('title is required')
        if not isinstance(title, basestring):
            raise TypeError("expected title to be a str but it is a %s" % getattr(__builtin__, 'type')(title))
        if len(title) < 1:
            raise ValueError("expected len(title) to be >= 1, was %d" % len(title))
        self.__title = title

        if refid is not None:
            if not isinstance(refid, basestring):
                raise TypeError("expected refid to be a str but it is a %s" % getattr(__builtin__, 'type')(refid))
        self.__refid = refid

        if vocab is not None:
            if not isinstance(vocab, costume.api.models.vocab.Vocab):
                raise TypeError("expected vocab to be a costume.api.models.vocab.Vocab but it is a %s" % getattr(__builtin__, 'type')(vocab))
        self.__vocab = vocab

    def __eq__(self, other):
        if self.title != other.title:
            return False
        if self.refid != other.refid:
            return False
        if self.vocab != other.vocab:
            return False
        return True

    def __hash__(self):
        return hash((self.title,self.refid,self.vocab,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        if self.refid is not None:
            field_reprs.append('refid=' + "'" + self.refid.encode('ascii', 'replace') + "'")
        if self.vocab is not None:
            field_reprs.append('vocab=' + repr(self.vocab))
        return 'Technique(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        if self.refid is not None:
            field_reprs.append('refid=' + "'" + self.refid.encode('ascii', 'replace') + "'")
        if self.vocab is not None:
            field_reprs.append('vocab=' + repr(self.vocab))
        return 'Technique(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'title': self.title, 'refid': self.refid, 'vocab': self.vocab}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.title, self.refid, self.vocab,)

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: costume.api.models.technique.technique.Technique
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'title' and ifield_id == 1:
                init_kwds['title'] = iprot.read_string()
            elif ifield_name == 'refid' and ifield_id == 2:
                try:
                    init_kwds['refid'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'vocab' and ifield_id == 3:
                try:
                    init_kwds['vocab'] = costume.api.models.vocab.Vocab.value_of(iprot.read_string().strip().upper())
                except (TypeError,):
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
        title=None,
        refid=None,
        vocab=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type title: str or None
        :type refid: str or None
        :type vocab: costume.api.models.vocab.Vocab or None
        :rtype: costume.api.models.technique.technique.Technique
        '''

        if title is None:
            title = self.title
        if refid is None:
            refid = self.refid
        if vocab is None:
            vocab = self.vocab
        return self.__class__(title=title, refid=refid, vocab=vocab)

    @property
    def title(self):
        '''
        :rtype: str
        '''

        return self.__title

    @property
    def vocab(self):
        '''
        :rtype: costume.api.models.vocab.Vocab
        '''

        return self.__vocab

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.models.technique.technique.Technique
        '''

        oprot.write_struct_begin('Technique')

        oprot.write_field_begin(name='title', type=11, id=1)
        oprot.write_string(self.title)
        oprot.write_field_end()

        if self.refid is not None:
            oprot.write_field_begin(name='refid', type=11, id=2)
            oprot.write_string(self.refid)
            oprot.write_field_end()

        if self.vocab is not None:
            oprot.write_field_begin(name='vocab', type=11, id=3)
            oprot.write_string(str(self.vocab))
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
