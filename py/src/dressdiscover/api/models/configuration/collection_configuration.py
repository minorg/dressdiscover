from itertools import ifilterfalse
import __builtin__


class CollectionConfiguration(object):
    class Builder(object):
        def __init__(
            self,
            store_type=None,
            store_parameters=None,
        ):
            '''
            :type store_type: str
            :type store_parameters: dict(str: str) or None
            '''

            self.__store_type = store_type
            self.__store_parameters = store_parameters

        def build(self):
            return CollectionConfiguration(store_type=self.__store_type, store_parameters=self.__store_parameters)

        def set_store_parameters(self, store_parameters):
            '''
            :type store_parameters: dict(str: str) or None
            '''

            if store_parameters is not None:
                if not (isinstance(store_parameters, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], basestring), store_parameters.iteritems()))) == 0):
                    raise TypeError("expected store_parameters to be a dict(str: str) but it is a %s" % getattr(__builtin__, 'type')(store_parameters))
                if len(store_parameters) < 1:
                    raise ValueError("expected len(store_parameters) to be >= 1, was %d" % len(store_parameters))
            self.__store_parameters = store_parameters
            return self

        def set_store_type(self, store_type):
            '''
            :type store_type: str
            '''

            if store_type is None:
                raise ValueError('store_type is required')
            if not isinstance(store_type, basestring):
                raise TypeError("expected store_type to be a str but it is a %s" % getattr(__builtin__, 'type')(store_type))
            self.__store_type = store_type
            return self

        @property
        def store_parameters(self):
            '''
            :rtype: dict(str: str)
            '''

            return self.__store_parameters.copy() if self.__store_parameters is not None else None

        @property
        def store_type(self):
            '''
            :rtype: str
            '''

            return self.__store_type

        def update(self, collection_configuration):
            '''
            :type store_type: str
            :type store_parameters: dict(str: str) or None
            '''

            if isinstance(collection_configuration, CollectionConfiguration):
                self.set_store_type(collection_configuration.store_type)
                self.set_store_parameters(collection_configuration.store_parameters)
            elif isinstance(collection_configuration, dict):
                for key, value in collection_configuration.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(collection_configuration)
            return self

        @store_parameters.setter
        def store_parameters(self, store_parameters):
            '''
            :type store_parameters: dict(str: str) or None
            '''

            self.set_store_parameters(store_parameters)

        @store_type.setter
        def store_type(self, store_type):
            '''
            :type store_type: str
            '''

            self.set_store_type(store_type)

    class FieldMetadata(object):
        STORE_TYPE = None
        STORE_PARAMETERS = None

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
            return (cls.STORE_TYPE, cls.STORE_PARAMETERS,)

    FieldMetadata.STORE_TYPE = FieldMetadata('store_type', str, None)
    FieldMetadata.STORE_PARAMETERS = FieldMetadata('store_parameters', dict, {u'minLength': 1})

    def __init__(
        self,
        store_type,
        store_parameters=None,
    ):
        '''
        :type store_type: str
        :type store_parameters: dict(str: str) or None
        '''

        if store_type is None:
            raise ValueError('store_type is required')
        if not isinstance(store_type, basestring):
            raise TypeError("expected store_type to be a str but it is a %s" % getattr(__builtin__, 'type')(store_type))
        self.__store_type = store_type

        if store_parameters is not None:
            if not (isinstance(store_parameters, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], basestring), store_parameters.iteritems()))) == 0):
                raise TypeError("expected store_parameters to be a dict(str: str) but it is a %s" % getattr(__builtin__, 'type')(store_parameters))
            if len(store_parameters) < 1:
                raise ValueError("expected len(store_parameters) to be >= 1, was %d" % len(store_parameters))
        self.__store_parameters = store_parameters.copy() if store_parameters is not None else None

    def __eq__(self, other):
        if self.store_type != other.store_type:
            return False
        if self.store_parameters != other.store_parameters:
            return False
        return True

    def __hash__(self):
        return hash((self.store_type,self.store_parameters,))

    def __iter__(self):
        return iter((self.store_type, self.store_parameters,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('store_type=' + "'" + self.store_type.encode('ascii', 'replace') + "'")
        if self.store_parameters is not None:
            field_reprs.append('store_parameters=' + repr(self.store_parameters))
        return 'CollectionConfiguration(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('store_type=' + "'" + self.store_type.encode('ascii', 'replace') + "'")
        if self.store_parameters is not None:
            field_reprs.append('store_parameters=' + repr(self.store_parameters))
        return 'CollectionConfiguration(' + ', '.join(field_reprs) + ')'

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.configuration.collection_configuration.CollectionConfiguration
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'store_type' and ifield_id == 1:
                init_kwds['store_type'] = iprot.read_string()
            elif ifield_name == 'store_parameters' and ifield_id == 2:
                init_kwds['store_parameters'] = dict([(iprot.read_string(), iprot.read_string()) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        store_type=None,
        store_parameters=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type store_type: str or None
        :type store_parameters: dict(str: str) or None
        :rtype: dressdiscover.api.models.configuration.collection_configuration.CollectionConfiguration
        '''

        if store_type is None:
            store_type = self.store_type
        if store_parameters is None:
            store_parameters = self.store_parameters
        return self.__class__(store_type=store_type, store_parameters=store_parameters)

    @property
    def store_parameters(self):
        '''
        :rtype: dict(str: str)
        '''

        return self.__store_parameters.copy() if self.__store_parameters is not None else None

    @property
    def store_type(self):
        '''
        :rtype: str
        '''

        return self.__store_type

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.configuration.collection_configuration.CollectionConfiguration
        '''

        oprot.write_struct_begin('CollectionConfiguration')

        oprot.write_field_begin(name='store_type', type=11, id=1)
        oprot.write_string(self.store_type)
        oprot.write_field_end()

        if self.store_parameters is not None:
            oprot.write_field_begin(name='store_parameters', type=13, id=2)
            oprot.write_map_begin(11, len(self.store_parameters), 11)
            for __key0, __value0 in self.store_parameters.iteritems():
                oprot.write_string(__key0)
                oprot.write_string(__value0)
            oprot.write_map_end()
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
