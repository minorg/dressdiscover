import __builtin__
import costume.api.models.subject.subject_term_type
import costume.api.models.vocab


class SubjectTerm(object):
    class Builder(object):
        def __init__(
            self,
            text=None,
            type=None,  # @ReservedAssignment
            refid=None,
            vocab=None,
        ):
            '''
            :type text: str
            :type type: costume.api.models.subject.subject_term_type.SubjectTermType
            :type refid: str or None
            :type vocab: costume.api.models.vocab.Vocab or None
            '''

            self.__text = text
            self.__type = type
            self.__refid = refid
            self.__vocab = vocab

        def build(self):
            return SubjectTerm(text=self.__text, type=self.__type, refid=self.__refid, vocab=self.__vocab)

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

        def set_text(self, text):
            '''
            :type text: str
            '''

            self.__text = text
            return self

        def set_type(self, type):  # @ReservedAssignment
            '''
            :type type: costume.api.models.subject.subject_term_type.SubjectTermType
            '''

            self.__type = type
            return self

        def set_vocab(self, vocab):
            '''
            :type vocab: costume.api.models.vocab.Vocab or None
            '''

            self.__vocab = vocab
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
            :rtype: costume.api.models.subject.subject_term_type.SubjectTermType
            '''

            return self.__type

        def update(self, subject_term):
            '''
            :type text: str
            :type type: costume.api.models.subject.subject_term_type.SubjectTermType
            :type refid: str or None
            :type vocab: costume.api.models.vocab.Vocab or None
            '''

            if isinstance(subject_term, SubjectTerm):
                self.set_text(subject_term.text)
                self.set_type(subject_term.type)
                self.set_refid(subject_term.refid)
                self.set_vocab(subject_term.vocab)
            elif isinstance(subject_term, dict):
                for key, value in subject_term.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(subject_term)
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

        @text.setter
        def text(self, text):
            '''
            :type text: str
            '''

            self.set_text(text)

        @type.setter
        def type(self, type):  # @ReservedAssignment
            '''
            :type type: costume.api.models.subject.subject_term_type.SubjectTermType
            '''

            self.set_type(type)

        @vocab.setter
        def vocab(self, vocab):
            '''
            :type vocab: costume.api.models.vocab.Vocab or None
            '''

            self.set_vocab(vocab)

    def __init__(
        self,
        text,
        type,  # @ReservedAssignment
        refid=None,
        vocab=None,
    ):
        '''
        :type text: str
        :type type: costume.api.models.subject.subject_term_type.SubjectTermType
        :type refid: str or None
        :type vocab: costume.api.models.vocab.Vocab or None
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
        if not isinstance(type, costume.api.models.subject.subject_term_type.SubjectTermType):
            raise TypeError("expected type to be a costume.api.models.subject.subject_term_type.SubjectTermType but it is a %s" % getattr(__builtin__, 'type')(type))
        self.__type = type

        if refid is not None:
            if not isinstance(refid, basestring):
                raise TypeError("expected refid to be a str but it is a %s" % getattr(__builtin__, 'type')(refid))
        self.__refid = refid

        if vocab is not None:
            if not isinstance(vocab, costume.api.models.vocab.Vocab):
                raise TypeError("expected vocab to be a costume.api.models.vocab.Vocab but it is a %s" % getattr(__builtin__, 'type')(vocab))
        self.__vocab = vocab

    def __eq__(self, other):
        if self.text != other.text:
            return False
        if self.type != other.type:
            return False
        if self.refid != other.refid:
            return False
        if self.vocab != other.vocab:
            return False
        return True

    def __hash__(self):
        return hash((self.text,self.type,self.refid,self.vocab,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        field_reprs.append('type=' + repr(self.type))
        if self.refid is not None:
            field_reprs.append('refid=' + "'" + self.refid.encode('ascii', 'replace') + "'")
        if self.vocab is not None:
            field_reprs.append('vocab=' + repr(self.vocab))
        return 'SubjectTerm(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        field_reprs.append('type=' + repr(self.type))
        if self.refid is not None:
            field_reprs.append('refid=' + "'" + self.refid.encode('ascii', 'replace') + "'")
        if self.vocab is not None:
            field_reprs.append('vocab=' + repr(self.vocab))
        return 'SubjectTerm(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'text': self.text, 'type': self.type, 'refid': self.refid, 'vocab': self.vocab}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.text, self.type, self.refid, self.vocab,)

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: costume.api.models.subject.subject_term.SubjectTerm
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'text' and ifield_id == 1:
                init_kwds['text'] = iprot.read_string()
            elif ifield_name == 'type' and ifield_id == 2:
                init_kwds['type'] = costume.api.models.subject.subject_term_type.SubjectTermType.value_of(iprot.read_string().strip().upper())
            elif ifield_name == 'refid' and ifield_id == 3:
                try:
                    init_kwds['refid'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'vocab' and ifield_id == 4:
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
        text=None,
        type=None,  # @ReservedAssignment
        refid=None,
        vocab=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type text: str or None
        :type type: costume.api.models.subject.subject_term_type.SubjectTermType or None
        :type refid: str or None
        :type vocab: costume.api.models.vocab.Vocab or None
        :rtype: costume.api.models.subject.subject_term.SubjectTerm
        '''

        if text is None:
            text = self.text
        if type is None:
            type = self.type  # @ReservedAssignment
        if refid is None:
            refid = self.refid
        if vocab is None:
            vocab = self.vocab
        return self.__class__(text=text, type=type, refid=refid, vocab=vocab)

    @property
    def text(self):
        '''
        :rtype: str
        '''

        return self.__text

    @property
    def type(self):  # @ReservedAssignment
        '''
        :rtype: costume.api.models.subject.subject_term_type.SubjectTermType
        '''

        return self.__type

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
        :rtype: costume.api.models.subject.subject_term.SubjectTerm
        '''

        oprot.write_struct_begin('SubjectTerm')

        oprot.write_field_begin(name='text', type=11, id=1)
        oprot.write_string(self.text)
        oprot.write_field_end()

        oprot.write_field_begin(name='type', type=11, id=2)
        oprot.write_string(str(self.type))
        oprot.write_field_end()

        if self.refid is not None:
            oprot.write_field_begin(name='refid', type=11, id=3)
            oprot.write_string(self.refid)
            oprot.write_field_end()

        if self.vocab is not None:
            oprot.write_field_begin(name='vocab', type=11, id=4)
            oprot.write_string(str(self.vocab))
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
