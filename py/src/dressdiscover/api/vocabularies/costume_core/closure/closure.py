import __builtin__
import dressdiscover.api.vocabularies.costume_core.closure.closure_placement
import dressdiscover.api.vocabularies.costume_core.closure.closure_type


class Closure(object):
    class Builder(object):
        def __init__(
            self,
            placement=None,
            type=None,  # @ReservedAssignment
        ):
            '''
            :type placement: dressdiscover.api.vocabularies.costume_core.closure.closure_placement.ClosurePlacement
            :type type: dressdiscover.api.vocabularies.costume_core.closure.closure_type.ClosureType
            '''

            self.__placement = placement
            self.__type = type

        def build(self):
            return Closure(placement=self.__placement, type=self.__type)

        @property
        def placement(self):
            '''
            :rtype: dressdiscover.api.vocabularies.costume_core.closure.closure_placement.ClosurePlacement
            '''

            return self.__placement

        def set_placement(self, placement):
            '''
            :type placement: dressdiscover.api.vocabularies.costume_core.closure.closure_placement.ClosurePlacement
            '''

            if placement is None:
                raise ValueError('placement is required')
            if not isinstance(placement, dressdiscover.api.vocabularies.costume_core.closure.closure_placement.ClosurePlacement):
                raise TypeError("expected placement to be a dressdiscover.api.vocabularies.costume_core.closure.closure_placement.ClosurePlacement but it is a %s" % getattr(__builtin__, 'type')(placement))
            self.__placement = placement
            return self

        def set_type(self, type):  # @ReservedAssignment
            '''
            :type type: dressdiscover.api.vocabularies.costume_core.closure.closure_type.ClosureType
            '''

            if type is None:
                raise ValueError('type is required')
            if not isinstance(type, dressdiscover.api.vocabularies.costume_core.closure.closure_type.ClosureType):
                raise TypeError("expected type to be a dressdiscover.api.vocabularies.costume_core.closure.closure_type.ClosureType but it is a %s" % getattr(__builtin__, 'type')(type))
            self.__type = type
            return self

        @property
        def type(self):  # @ReservedAssignment
            '''
            :rtype: dressdiscover.api.vocabularies.costume_core.closure.closure_type.ClosureType
            '''

            return self.__type

        def update(self, closure):
            '''
            :type placement: dressdiscover.api.vocabularies.costume_core.closure.closure_placement.ClosurePlacement
            :type type: dressdiscover.api.vocabularies.costume_core.closure.closure_type.ClosureType
            '''

            if isinstance(closure, Closure):
                self.set_placement(closure.placement)
                self.set_type(closure.type)
            elif isinstance(closure, dict):
                for key, value in closure.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(closure)
            return self

        @placement.setter
        def placement(self, placement):
            '''
            :type placement: dressdiscover.api.vocabularies.costume_core.closure.closure_placement.ClosurePlacement
            '''

            self.set_placement(placement)

        @type.setter
        def type(self, type):  # @ReservedAssignment
            '''
            :type type: dressdiscover.api.vocabularies.costume_core.closure.closure_type.ClosureType
            '''

            self.set_type(type)

    class FieldMetadata(object):
        PLACEMENT = None
        TYPE = None

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
            return (cls.PLACEMENT, cls.TYPE,)

    FieldMetadata.PLACEMENT = FieldMetadata('placement', dressdiscover.api.vocabularies.costume_core.closure.closure_placement.ClosurePlacement, None)
    FieldMetadata.TYPE = FieldMetadata('type', dressdiscover.api.vocabularies.costume_core.closure.closure_type.ClosureType, None)

    def __init__(
        self,
        placement,
        type,  # @ReservedAssignment
    ):
        '''
        :type placement: dressdiscover.api.vocabularies.costume_core.closure.closure_placement.ClosurePlacement
        :type type: dressdiscover.api.vocabularies.costume_core.closure.closure_type.ClosureType
        '''

        if placement is None:
            raise ValueError('placement is required')
        if not isinstance(placement, dressdiscover.api.vocabularies.costume_core.closure.closure_placement.ClosurePlacement):
            raise TypeError("expected placement to be a dressdiscover.api.vocabularies.costume_core.closure.closure_placement.ClosurePlacement but it is a %s" % getattr(__builtin__, 'type')(placement))
        self.__placement = placement

        if type is None:
            raise ValueError('type is required')
        if not isinstance(type, dressdiscover.api.vocabularies.costume_core.closure.closure_type.ClosureType):
            raise TypeError("expected type to be a dressdiscover.api.vocabularies.costume_core.closure.closure_type.ClosureType but it is a %s" % getattr(__builtin__, 'type')(type))
        self.__type = type

    def __eq__(self, other):
        if self.placement != other.placement:
            return False
        if self.type != other.type:
            return False
        return True

    def __hash__(self):
        return hash((self.placement,self.type,))

    def __iter__(self):
        return iter((self.placement, self.type,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('placement=' + repr(self.placement))
        field_reprs.append('type=' + repr(self.type))
        return 'Closure(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('placement=' + repr(self.placement))
        field_reprs.append('type=' + repr(self.type))
        return 'Closure(' + ', '.join(field_reprs) + ')'

    @property
    def placement(self):
        '''
        :rtype: dressdiscover.api.vocabularies.costume_core.closure.closure_placement.ClosurePlacement
        '''

        return self.__placement

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.vocabularies.costume_core.closure.closure.Closure
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'placement' and ifield_id == 1:
                init_kwds['placement'] = dressdiscover.api.vocabularies.costume_core.closure.closure_placement.ClosurePlacement.read(iprot)
            elif ifield_name == 'type' and ifield_id == 2:
                init_kwds['type'] = dressdiscover.api.vocabularies.costume_core.closure.closure_type.ClosureType.read(iprot)
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        placement=None,
        type=None,  # @ReservedAssignment
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type placement: dressdiscover.api.vocabularies.costume_core.closure.closure_placement.ClosurePlacement or None
        :type type: dressdiscover.api.vocabularies.costume_core.closure.closure_type.ClosureType or None
        :rtype: dressdiscover.api.vocabularies.costume_core.closure.closure.Closure
        '''

        if placement is None:
            placement = self.placement
        if type is None:
            type = self.type  # @ReservedAssignment
        return self.__class__(placement=placement, type=type)

    @property
    def type(self):  # @ReservedAssignment
        '''
        :rtype: dressdiscover.api.vocabularies.costume_core.closure.closure_type.ClosureType
        '''

        return self.__type

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.vocabularies.costume_core.closure.closure.Closure
        '''

        oprot.write_struct_begin('Closure')

        oprot.write_field_begin(name='placement', type=12, id=1)
        self.placement.write(oprot)
        oprot.write_field_end()

        oprot.write_field_begin(name='type', type=12, id=2)
        self.type.write(oprot)
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
