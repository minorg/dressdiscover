from itertools import ifilterfalse
import __builtin__


class CollectionStoreConfiguration(object):
    class Builder(object):
        def __init__(
            self,
            type=None,  # @ReservedAssignment
            parameters=None,
        ):
            '''
            :type type: str
            :type parameters: dict(str: str) or None
            '''

            self.__type = type
            self.__parameters = parameters

        def build(self):
            return CollectionStoreConfiguration(type=self.__type, parameters=self.__parameters)

        @property
        def parameters(self):
            '''
            :rtype: dict(str: str)
            '''

            return self.__parameters.copy() if self.__parameters is not None else None

        def set_parameters(self, parameters):
            '''
            :type parameters: dict(str: str) or None
            '''

            if parameters is not None:
                if not (isinstance(parameters, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], basestring), parameters.iteritems()))) == 0):
                    raise TypeError("expected parameters to be a dict(str: str) but it is a %s" % getattr(__builtin__, 'type')(parameters))
                if len(parameters) < 1:
                    raise ValueError("expected len(parameters) to be >= 1, was %d" % len(parameters))
            self.__parameters = parameters
            return self

        def set_type(self, type):  # @ReservedAssignment
            '''
            :type type: str
            '''

            if type is None:
                raise ValueError('type is required')
            if not isinstance(type, basestring):
                raise TypeError("expected type to be a str but it is a %s" % getattr(__builtin__, 'type')(type))
            self.__type = type
            return self

        @property
        def type(self):  # @ReservedAssignment
            '''
            :rtype: str
            '''

            return self.__type

        def update(self, collection_store_configuration):
            '''
            :type type: str
            :type parameters: dict(str: str) or None
            '''

            if isinstance(collection_store_configuration, CollectionStoreConfiguration):
                self.set_type(collection_store_configuration.type)
                self.set_parameters(collection_store_configuration.parameters)
            elif isinstance(collection_store_configuration, dict):
                for key, value in collection_store_configuration.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(collection_store_configuration)
            return self

        @parameters.setter
        def parameters(self, parameters):
            '''
            :type parameters: dict(str: str) or None
            '''

            self.set_parameters(parameters)

        @type.setter
        def type(self, type):  # @ReservedAssignment
            '''
            :type type: str
            '''

            self.set_type(type)

    class FieldMetadata(object):
        TYPE = None
        PARAMETERS = None

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
            return (cls.TYPE, cls.PARAMETERS,)

    FieldMetadata.TYPE = FieldMetadata('type', str, None)
    FieldMetadata.PARAMETERS = FieldMetadata('parameters', dict, {u'minLength': 1})

    def __init__(
        self,
        type,  # @ReservedAssignment
        parameters=None,
    ):
        '''
        :type type: str
        :type parameters: dict(str: str) or None
        '''

        if type is None:
            raise ValueError('type is required')
        if not isinstance(type, basestring):
            raise TypeError("expected type to be a str but it is a %s" % getattr(__builtin__, 'type')(type))
        self.__type = type

        if parameters is not None:
            if not (isinstance(parameters, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], basestring), parameters.iteritems()))) == 0):
                raise TypeError("expected parameters to be a dict(str: str) but it is a %s" % getattr(__builtin__, 'type')(parameters))
            if len(parameters) < 1:
                raise ValueError("expected len(parameters) to be >= 1, was %d" % len(parameters))
        self.__parameters = parameters.copy() if parameters is not None else None

    def __eq__(self, other):
        if self.type != other.type:
            return False
        if self.parameters != other.parameters:
            return False
        return True

    def __hash__(self):
        return hash((self.type,self.parameters,))

    def __iter__(self):
        return iter((self.type, self.parameters,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('type=' + "'" + self.type.encode('ascii', 'replace') + "'")
        if self.parameters is not None:
            field_reprs.append('parameters=' + repr(self.parameters))
        return 'CollectionStoreConfiguration(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('type=' + "'" + self.type.encode('ascii', 'replace') + "'")
        if self.parameters is not None:
            field_reprs.append('parameters=' + repr(self.parameters))
        return 'CollectionStoreConfiguration(' + ', '.join(field_reprs) + ')'

    @property
    def parameters(self):
        '''
        :rtype: dict(str: str)
        '''

        return self.__parameters.copy() if self.__parameters is not None else None

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.configuration.collection_store_configuration.CollectionStoreConfiguration
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'type' and ifield_id == 1:
                init_kwds['type'] = iprot.read_string()
            elif ifield_name == 'parameters' and ifield_id == 2:
                init_kwds['parameters'] = dict([(iprot.read_string(), iprot.read_string()) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        type=None,  # @ReservedAssignment
        parameters=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type type: str or None
        :type parameters: dict(str: str) or None
        :rtype: dressdiscover.api.models.configuration.collection_store_configuration.CollectionStoreConfiguration
        '''

        if type is None:
            type = self.type  # @ReservedAssignment
        if parameters is None:
            parameters = self.parameters
        return self.__class__(type=type, parameters=parameters)

    @property
    def type(self):  # @ReservedAssignment
        '''
        :rtype: str
        '''

        return self.__type

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.configuration.collection_store_configuration.CollectionStoreConfiguration
        '''

        oprot.write_struct_begin('CollectionStoreConfiguration')

        oprot.write_field_begin(name='type', type=11, id=1)
        oprot.write_string(self.type)
        oprot.write_field_end()

        if self.parameters is not None:
            oprot.write_field_begin(name='parameters', type=13, id=2)
            oprot.write_map_begin(11, len(self.parameters), 11)
            for __key0, __value0 in self.parameters.iteritems():
                oprot.write_string(__key0)
                oprot.write_string(__value0)
            oprot.write_map_end()
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
