import __builtin__
import dressdiscover.api.models.worksheet.question_value_id


class QuestionValueDefinition(object):
    class Builder(object):
        def __init__(
            self,
            id=None,  # @ReservedAssignment
        ):
            '''
            :type id: str
            '''

            self.__id = id

        def build(self):
            return QuestionValueDefinition(id=self.__id)

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

        def update(self, question_value_definition):
            '''
            :type id: str
            '''

            if isinstance(question_value_definition, QuestionValueDefinition):
                self.set_id(question_value_definition.id)
            elif isinstance(question_value_definition, dict):
                for key, value in question_value_definition.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(question_value_definition)
            return self

        @id.setter
        def id(self, id):  # @ReservedAssignment
            '''
            :type id: str
            '''

            self.set_id(id)

    class FieldMetadata(object):
        ID = None

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
            return (cls.ID,)

    FieldMetadata.ID = FieldMetadata('id', dressdiscover.api.models.worksheet.question_value_id.QuestionValueId, None)

    def __init__(
        self,
        id,  # @ReservedAssignment
    ):
        '''
        :type id: str
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, basestring):
            raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))
        self.__id = id

    def __eq__(self, other):
        if self.id != other.id:
            return False
        return True

    def __hash__(self):
        return hash(self.id)

    def __iter__(self):
        return iter((self.id,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        return 'QuestionValueDefinition(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        return 'QuestionValueDefinition(' + ', '.join(field_reprs) + ')'

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
        :rtype: dressdiscover.api.models.qa.question_value_definition.QuestionValueDefinition
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'id':
                init_kwds['id'] = iprot.read_string()
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        id=None,  # @ReservedAssignment
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type id: str or None
        :rtype: dressdiscover.api.models.qa.question_value_definition.QuestionValueDefinition
        '''

        if id is None:
            id = self.id  # @ReservedAssignment
        return self.__class__(id=id)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.qa.question_value_definition.QuestionValueDefinition
        '''

        oprot.write_struct_begin('QuestionValueDefinition')

        oprot.write_field_begin(name='id', type=11, id=None)
        oprot.write_string(self.id)
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
