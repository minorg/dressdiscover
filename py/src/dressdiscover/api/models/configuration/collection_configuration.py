import __builtin__
import dressdiscover.api.models.configuration.object_store_configuration


class CollectionConfiguration(object):
    class Builder(object):
        def __init__(
            self,
            object_store_configuration=None,
        ):
            '''
            :type object_store_configuration: dressdiscover.api.models.configuration.object_store_configuration.ObjectStoreConfiguration
            '''

            self.__object_store_configuration = object_store_configuration

        def build(self):
            return CollectionConfiguration(object_store_configuration=self.__object_store_configuration)

        @property
        def object_store_configuration(self):
            '''
            :rtype: dressdiscover.api.models.configuration.object_store_configuration.ObjectStoreConfiguration
            '''

            return self.__object_store_configuration

        def set_object_store_configuration(self, object_store_configuration):
            '''
            :type object_store_configuration: dressdiscover.api.models.configuration.object_store_configuration.ObjectStoreConfiguration
            '''

            if object_store_configuration is None:
                raise ValueError('object_store_configuration is required')
            if not isinstance(object_store_configuration, dressdiscover.api.models.configuration.object_store_configuration.ObjectStoreConfiguration):
                raise TypeError("expected object_store_configuration to be a dressdiscover.api.models.configuration.object_store_configuration.ObjectStoreConfiguration but it is a %s" % getattr(__builtin__, 'type')(object_store_configuration))
            self.__object_store_configuration = object_store_configuration
            return self

        def update(self, collection_configuration):
            '''
            :type object_store_configuration: dressdiscover.api.models.configuration.object_store_configuration.ObjectStoreConfiguration
            '''

            if isinstance(collection_configuration, CollectionConfiguration):
                self.set_object_store_configuration(collection_configuration.object_store_configuration)
            elif isinstance(collection_configuration, dict):
                for key, value in collection_configuration.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(collection_configuration)
            return self

        @object_store_configuration.setter
        def object_store_configuration(self, object_store_configuration):
            '''
            :type object_store_configuration: dressdiscover.api.models.configuration.object_store_configuration.ObjectStoreConfiguration
            '''

            self.set_object_store_configuration(object_store_configuration)

    class FieldMetadata(object):
        OBJECT_STORE_CONFIGURATION = None

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
            return (cls.OBJECT_STORE_CONFIGURATION,)

    FieldMetadata.OBJECT_STORE_CONFIGURATION = FieldMetadata('object_store_configuration', dressdiscover.api.models.configuration.object_store_configuration.ObjectStoreConfiguration, None)

    def __init__(
        self,
        object_store_configuration,
    ):
        '''
        :type object_store_configuration: dressdiscover.api.models.configuration.object_store_configuration.ObjectStoreConfiguration
        '''

        if object_store_configuration is None:
            raise ValueError('object_store_configuration is required')
        if not isinstance(object_store_configuration, dressdiscover.api.models.configuration.object_store_configuration.ObjectStoreConfiguration):
            raise TypeError("expected object_store_configuration to be a dressdiscover.api.models.configuration.object_store_configuration.ObjectStoreConfiguration but it is a %s" % getattr(__builtin__, 'type')(object_store_configuration))
        self.__object_store_configuration = object_store_configuration

    def __eq__(self, other):
        if self.object_store_configuration != other.object_store_configuration:
            return False
        return True

    def __hash__(self):
        return hash(self.object_store_configuration)

    def __iter__(self):
        return iter((self.object_store_configuration,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('object_store_configuration=' + repr(self.object_store_configuration))
        return 'CollectionConfiguration(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('object_store_configuration=' + repr(self.object_store_configuration))
        return 'CollectionConfiguration(' + ', '.join(field_reprs) + ')'

    @property
    def object_store_configuration(self):
        '''
        :rtype: dressdiscover.api.models.configuration.object_store_configuration.ObjectStoreConfiguration
        '''

        return self.__object_store_configuration

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
            elif ifield_name == 'object_store_configuration' and ifield_id == 1:
                init_kwds['object_store_configuration'] = dressdiscover.api.models.configuration.object_store_configuration.ObjectStoreConfiguration.read(iprot)
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        object_store_configuration=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type object_store_configuration: dressdiscover.api.models.configuration.object_store_configuration.ObjectStoreConfiguration or None
        :rtype: dressdiscover.api.models.configuration.collection_configuration.CollectionConfiguration
        '''

        if object_store_configuration is None:
            object_store_configuration = self.object_store_configuration
        return self.__class__(object_store_configuration=object_store_configuration)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.configuration.collection_configuration.CollectionConfiguration
        '''

        oprot.write_struct_begin('CollectionConfiguration')

        oprot.write_field_begin(name='object_store_configuration', type=12, id=1)
        self.object_store_configuration.write(oprot)
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
