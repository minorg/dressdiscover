import __builtin__
import dressdiscover.api.models.agent.agent_name_type
import dressdiscover.api.models.vocab_ref


class AgentName(object):
    class Builder(object):
        def __init__(
            self,
            text=None,
            type=None,  # @ReservedAssignment
            vocab_ref=None,
        ):
            '''
            :type text: str
            :type type: dressdiscover.api.models.agent.agent_name_type.AgentNameType
            :type vocab_ref: dressdiscover.api.models.vocab_ref.VocabRef or None
            '''

            self.__text = text
            self.__type = type
            self.__vocab_ref = vocab_ref

        def build(self):
            return AgentName(text=self.__text, type=self.__type, vocab_ref=self.__vocab_ref)

        def set_text(self, text):
            '''
            :type text: str
            '''

            self.__text = text
            return self

        def set_type(self, type):  # @ReservedAssignment
            '''
            :type type: dressdiscover.api.models.agent.agent_name_type.AgentNameType
            '''

            self.__type = type
            return self

        def set_vocab_ref(self, vocab_ref):
            '''
            :type vocab_ref: dressdiscover.api.models.vocab_ref.VocabRef or None
            '''

            self.__vocab_ref = vocab_ref
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
            :rtype: dressdiscover.api.models.agent.agent_name_type.AgentNameType
            '''

            return self.__type

        def update(self, agent_name):
            '''
            :type text: str
            :type type: dressdiscover.api.models.agent.agent_name_type.AgentNameType
            :type vocab_ref: dressdiscover.api.models.vocab_ref.VocabRef or None
            '''

            if isinstance(agent_name, AgentName):
                self.set_text(agent_name.text)
                self.set_type(agent_name.type)
                self.set_vocab_ref(agent_name.vocab_ref)
            elif isinstance(agent_name, dict):
                for key, value in agent_name.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(agent_name)
            return self

        @property
        def vocab_ref(self):
            '''
            :rtype: dressdiscover.api.models.vocab_ref.VocabRef
            '''

            return self.__vocab_ref

        @text.setter
        def text(self, text):
            '''
            :type text: str
            '''

            self.set_text(text)

        @type.setter
        def type(self, type):  # @ReservedAssignment
            '''
            :type type: dressdiscover.api.models.agent.agent_name_type.AgentNameType
            '''

            self.set_type(type)

        @vocab_ref.setter
        def vocab_ref(self, vocab_ref):
            '''
            :type vocab_ref: dressdiscover.api.models.vocab_ref.VocabRef or None
            '''

            self.set_vocab_ref(vocab_ref)

    def __init__(
        self,
        text,
        type,  # @ReservedAssignment
        vocab_ref=None,
    ):
        '''
        :type text: str
        :type type: dressdiscover.api.models.agent.agent_name_type.AgentNameType
        :type vocab_ref: dressdiscover.api.models.vocab_ref.VocabRef or None
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
        if not isinstance(type, dressdiscover.api.models.agent.agent_name_type.AgentNameType):
            raise TypeError("expected type to be a dressdiscover.api.models.agent.agent_name_type.AgentNameType but it is a %s" % getattr(__builtin__, 'type')(type))
        self.__type = type

        if vocab_ref is not None:
            if not isinstance(vocab_ref, dressdiscover.api.models.vocab_ref.VocabRef):
                raise TypeError("expected vocab_ref to be a dressdiscover.api.models.vocab_ref.VocabRef but it is a %s" % getattr(__builtin__, 'type')(vocab_ref))
        self.__vocab_ref = vocab_ref

    def __eq__(self, other):
        if self.text != other.text:
            return False
        if self.type != other.type:
            return False
        if self.vocab_ref != other.vocab_ref:
            return False
        return True

    def __hash__(self):
        return hash((self.text,self.type,self.vocab_ref,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        field_reprs.append('type=' + repr(self.type))
        if self.vocab_ref is not None:
            field_reprs.append('vocab_ref=' + repr(self.vocab_ref))
        return 'AgentName(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        field_reprs.append('type=' + repr(self.type))
        if self.vocab_ref is not None:
            field_reprs.append('vocab_ref=' + repr(self.vocab_ref))
        return 'AgentName(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'text': self.text, 'type': self.type, 'vocab_ref': self.vocab_ref}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.text, self.type, self.vocab_ref,)

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.agent.agent_name.AgentName
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
                init_kwds['type'] = dressdiscover.api.models.agent.agent_name_type.AgentNameType.value_of(iprot.read_string().strip().upper())
            elif ifield_name == 'vocab_ref' and ifield_id == 5:
                init_kwds['vocab_ref'] = dressdiscover.api.models.vocab_ref.VocabRef.read(iprot)
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        text=None,
        type=None,  # @ReservedAssignment
        vocab_ref=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type text: str or None
        :type type: dressdiscover.api.models.agent.agent_name_type.AgentNameType or None
        :type vocab_ref: dressdiscover.api.models.vocab_ref.VocabRef or None
        :rtype: dressdiscover.api.models.agent.agent_name.AgentName
        '''

        if text is None:
            text = self.text
        if type is None:
            type = self.type  # @ReservedAssignment
        if vocab_ref is None:
            vocab_ref = self.vocab_ref
        return self.__class__(text=text, type=type, vocab_ref=vocab_ref)

    @property
    def text(self):
        '''
        :rtype: str
        '''

        return self.__text

    @property
    def type(self):  # @ReservedAssignment
        '''
        :rtype: dressdiscover.api.models.agent.agent_name_type.AgentNameType
        '''

        return self.__type

    @property
    def vocab_ref(self):
        '''
        :rtype: dressdiscover.api.models.vocab_ref.VocabRef
        '''

        return self.__vocab_ref

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.agent.agent_name.AgentName
        '''

        oprot.write_struct_begin('AgentName')

        oprot.write_field_begin(name='text', type=11, id=1)
        oprot.write_string(self.text)
        oprot.write_field_end()

        oprot.write_field_begin(name='type', type=11, id=2)
        oprot.write_string(str(self.type))
        oprot.write_field_end()

        if self.vocab_ref is not None:
            oprot.write_field_begin(name='vocab_ref', type=12, id=5)
            self.vocab_ref.write(oprot)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
