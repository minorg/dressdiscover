from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.models.qa.question_id
import dressdiscover.api.models.qa.question_value_definition


class QuestionDefinition(object):
    class Builder(object):
        def __init__(
            self,
            id=None,  # @ReservedAssignment
            values_=None,
        ):
            '''
            :type id: str
            :type values_: tuple(dressdiscover.api.models.qa.question_value_definition.QuestionValueDefinition) or None
            '''

            self.__id = id
            self.__values_ = values_

        def build(self):
            return QuestionDefinition(id=self.__id, values_=self.__values_)

        @property
        def id(self):  # @ReservedAssignment
            '''
            :rtype: str
            '''

            return self.__id

        def set_id(self, id):  # @ReservedAssignment
            '''
            :type id: str
            '''

            if id is None:
                raise ValueError('id is required')
            if not isinstance(id, basestring):
                raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))
            self.__id = id
            return self

        def set_values_(self, values_):
            '''
            :type values_: tuple(dressdiscover.api.models.qa.question_value_definition.QuestionValueDefinition) or None
            '''

            if values_ is not None:
                if not (isinstance(values_, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.qa.question_value_definition.QuestionValueDefinition), values_))) == 0):
                    raise TypeError("expected values_ to be a tuple(dressdiscover.api.models.qa.question_value_definition.QuestionValueDefinition) but it is a %s" % getattr(__builtin__, 'type')(values_))
                if len(values_) < 1:
                    raise ValueError("expected len(values_) to be >= 1, was %d" % len(values_))
            self.__values_ = values_
            return self

        def update(self, question_definition):
            '''
            :type id: str
            :type values_: tuple(dressdiscover.api.models.qa.question_value_definition.QuestionValueDefinition) or None
            '''

            if isinstance(question_definition, QuestionDefinition):
                self.set_id(question_definition.id)
                self.set_values_(question_definition.values_)
            elif isinstance(question_definition, dict):
                for key, value in question_definition.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(question_definition)
            return self

        @property
        def values_(self):
            '''
            :rtype: tuple(dressdiscover.api.models.qa.question_value_definition.QuestionValueDefinition)
            '''

            return self.__values_

        @id.setter
        def id(self, id):  # @ReservedAssignment
            '''
            :type id: str
            '''

            self.set_id(id)

        @values_.setter
        def values_(self, values_):
            '''
            :type values_: tuple(dressdiscover.api.models.qa.question_value_definition.QuestionValueDefinition) or None
            '''

            self.set_values_(values_)

    class FieldMetadata(object):
        ID = None
        VALUES_ = None

        def __init__(self, name, type_, validation):
            object.__init__(self)
            self.__name = name
            self.__type = type_
            self.__validation = validation

        @property
        def name(self):
            return self.__name

        def __repr__(self):
            return self.__name

        def __str__(self):
            return self.__name

        @property
        def type(self):
            return self.__type

        @property
        def validation(self):
            return self.__validation

        @classmethod
        def values(cls):
            return (cls.ID, cls.VALUES_,)

    FieldMetadata.ID = FieldMetadata('id', dressdiscover.api.models.qa.question_id.QuestionId, None)
    FieldMetadata.VALUES_ = FieldMetadata('values_', tuple, {u'minLength': 1})

    def __init__(
        self,
        id,  # @ReservedAssignment
        values_=None,
    ):
        '''
        :type id: str
        :type values_: tuple(dressdiscover.api.models.qa.question_value_definition.QuestionValueDefinition) or None
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, basestring):
            raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))
        self.__id = id

        if values_ is not None:
            if not (isinstance(values_, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.qa.question_value_definition.QuestionValueDefinition), values_))) == 0):
                raise TypeError("expected values_ to be a tuple(dressdiscover.api.models.qa.question_value_definition.QuestionValueDefinition) but it is a %s" % getattr(__builtin__, 'type')(values_))
            if len(values_) < 1:
                raise ValueError("expected len(values_) to be >= 1, was %d" % len(values_))
        self.__values_ = values_

    def __eq__(self, other):
        if self.id != other.id:
            return False
        if self.values_ != other.values_:
            return False
        return True

    def __hash__(self):
        return hash((self.id,self.values_,))

    def __iter__(self):
        return iter((self.id, self.values_,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        if self.values_ is not None:
            field_reprs.append('values_=' + repr(self.values_))
        return 'QuestionDefinition(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        if self.values_ is not None:
            field_reprs.append('values_=' + repr(self.values_))
        return 'QuestionDefinition(' + ', '.join(field_reprs) + ')'

    @property
    def id(self):  # @ReservedAssignment
        '''
        :rtype: str
        '''

        return self.__id

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.qa.question_definition.QuestionDefinition
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'id':
                init_kwds['id'] = iprot.read_string()
            elif ifield_name == 'values_':
                init_kwds['values_'] = tuple([dressdiscover.api.models.qa.question_value_definition.QuestionValueDefinition.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        id=None,  # @ReservedAssignment
        values_=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type id: str or None
        :type values_: tuple(dressdiscover.api.models.qa.question_value_definition.QuestionValueDefinition) or None
        :rtype: dressdiscover.api.models.qa.question_definition.QuestionDefinition
        '''

        if id is None:
            id = self.id  # @ReservedAssignment
        if values_ is None:
            values_ = self.values_
        return self.__class__(id=id, values_=values_)

    @property
    def values_(self):
        '''
        :rtype: tuple(dressdiscover.api.models.qa.question_value_definition.QuestionValueDefinition)
        '''

        return self.__values_

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.qa.question_definition.QuestionDefinition
        '''

        oprot.write_struct_begin('QuestionDefinition')

        oprot.write_field_begin(name='id', type=11, id=None)
        oprot.write_string(self.id)
        oprot.write_field_end()

        if self.values_ is not None:
            oprot.write_field_begin(name='values_', type=15, id=None)
            oprot.write_list_begin(12, len(self.values_))
            for _0 in self.values_:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
