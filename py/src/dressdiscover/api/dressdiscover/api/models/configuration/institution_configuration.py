import __builtin__
import dressdiscover.api.models.configuration.collection_configuration
import dressdiscover.api.models.configuration.collection_store_configuration


class InstitutionConfiguration(object):
    class Builder(object):
        def __init__(
            self,
            collection_store_configuration=None,
            default_collection_configuration=None,
        ):
            '''
            :type collection_store_configuration: dressdiscover.api.models.configuration.collection_store_configuration.CollectionStoreConfiguration
            :type default_collection_configuration: dressdiscover.api.models.configuration.collection_configuration.CollectionConfiguration or None
            '''

            self.__collection_store_configuration = collection_store_configuration
            self.__default_collection_configuration = default_collection_configuration

        def build(self):
            return InstitutionConfiguration(collection_store_configuration=self.__collection_store_configuration, default_collection_configuration=self.__default_collection_configuration)

        @property
        def collection_store_configuration(self):
            '''
            :rtype: dressdiscover.api.models.configuration.collection_store_configuration.CollectionStoreConfiguration
            '''

            return self.__collection_store_configuration

        @property
        def default_collection_configuration(self):
            '''
            :rtype: dressdiscover.api.models.configuration.collection_configuration.CollectionConfiguration
            '''

            return self.__default_collection_configuration

        def set_collection_store_configuration(self, collection_store_configuration):
            '''
            :type collection_store_configuration: dressdiscover.api.models.configuration.collection_store_configuration.CollectionStoreConfiguration
            '''

            if collection_store_configuration is None:
                raise ValueError('collection_store_configuration is required')
            if not isinstance(collection_store_configuration, dressdiscover.api.models.configuration.collection_store_configuration.CollectionStoreConfiguration):
                raise TypeError("expected collection_store_configuration to be a dressdiscover.api.models.configuration.collection_store_configuration.CollectionStoreConfiguration but it is a %s" % getattr(__builtin__, 'type')(collection_store_configuration))
            self.__collection_store_configuration = collection_store_configuration
            return self

        def set_default_collection_configuration(self, default_collection_configuration):
            '''
            :type default_collection_configuration: dressdiscover.api.models.configuration.collection_configuration.CollectionConfiguration or None
            '''

            if default_collection_configuration is not None:
                if not isinstance(default_collection_configuration, dressdiscover.api.models.configuration.collection_configuration.CollectionConfiguration):
                    raise TypeError("expected default_collection_configuration to be a dressdiscover.api.models.configuration.collection_configuration.CollectionConfiguration but it is a %s" % getattr(__builtin__, 'type')(default_collection_configuration))
            self.__default_collection_configuration = default_collection_configuration
            return self

        def update(self, institution_configuration):
            '''
            :type collection_store_configuration: dressdiscover.api.models.configuration.collection_store_configuration.CollectionStoreConfiguration
            :type default_collection_configuration: dressdiscover.api.models.configuration.collection_configuration.CollectionConfiguration or None
            '''

            if isinstance(institution_configuration, InstitutionConfiguration):
                self.set_collection_store_configuration(institution_configuration.collection_store_configuration)
                self.set_default_collection_configuration(institution_configuration.default_collection_configuration)
            elif isinstance(institution_configuration, dict):
                for key, value in institution_configuration.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(institution_configuration)
            return self

        @collection_store_configuration.setter
        def collection_store_configuration(self, collection_store_configuration):
            '''
            :type collection_store_configuration: dressdiscover.api.models.configuration.collection_store_configuration.CollectionStoreConfiguration
            '''

            self.set_collection_store_configuration(collection_store_configuration)

        @default_collection_configuration.setter
        def default_collection_configuration(self, default_collection_configuration):
            '''
            :type default_collection_configuration: dressdiscover.api.models.configuration.collection_configuration.CollectionConfiguration or None
            '''

            self.set_default_collection_configuration(default_collection_configuration)

    class FieldMetadata(object):
        COLLECTION_STORE_CONFIGURATION = None
        DEFAULT_COLLECTION_CONFIGURATION = None

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
            return (cls.COLLECTION_STORE_CONFIGURATION, cls.DEFAULT_COLLECTION_CONFIGURATION,)

    FieldMetadata.COLLECTION_STORE_CONFIGURATION = FieldMetadata('collection_store_configuration', dressdiscover.api.models.configuration.collection_store_configuration.CollectionStoreConfiguration, None)
    FieldMetadata.DEFAULT_COLLECTION_CONFIGURATION = FieldMetadata('default_collection_configuration', dressdiscover.api.models.configuration.collection_configuration.CollectionConfiguration, None)

    def __init__(
        self,
        collection_store_configuration,
        default_collection_configuration=None,
    ):
        '''
        :type collection_store_configuration: dressdiscover.api.models.configuration.collection_store_configuration.CollectionStoreConfiguration
        :type default_collection_configuration: dressdiscover.api.models.configuration.collection_configuration.CollectionConfiguration or None
        '''

        if collection_store_configuration is None:
            raise ValueError('collection_store_configuration is required')
        if not isinstance(collection_store_configuration, dressdiscover.api.models.configuration.collection_store_configuration.CollectionStoreConfiguration):
            raise TypeError("expected collection_store_configuration to be a dressdiscover.api.models.configuration.collection_store_configuration.CollectionStoreConfiguration but it is a %s" % getattr(__builtin__, 'type')(collection_store_configuration))
        self.__collection_store_configuration = collection_store_configuration

        if default_collection_configuration is not None:
            if not isinstance(default_collection_configuration, dressdiscover.api.models.configuration.collection_configuration.CollectionConfiguration):
                raise TypeError("expected default_collection_configuration to be a dressdiscover.api.models.configuration.collection_configuration.CollectionConfiguration but it is a %s" % getattr(__builtin__, 'type')(default_collection_configuration))
        self.__default_collection_configuration = default_collection_configuration

    def __eq__(self, other):
        if self.collection_store_configuration != other.collection_store_configuration:
            return False
        if self.default_collection_configuration != other.default_collection_configuration:
            return False
        return True

    def __hash__(self):
        return hash((self.collection_store_configuration,self.default_collection_configuration,))

    def __iter__(self):
        return iter((self.collection_store_configuration, self.default_collection_configuration,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('collection_store_configuration=' + repr(self.collection_store_configuration))
        if self.default_collection_configuration is not None:
            field_reprs.append('default_collection_configuration=' + repr(self.default_collection_configuration))
        return 'InstitutionConfiguration(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('collection_store_configuration=' + repr(self.collection_store_configuration))
        if self.default_collection_configuration is not None:
            field_reprs.append('default_collection_configuration=' + repr(self.default_collection_configuration))
        return 'InstitutionConfiguration(' + ', '.join(field_reprs) + ')'

    @property
    def collection_store_configuration(self):
        '''
        :rtype: dressdiscover.api.models.configuration.collection_store_configuration.CollectionStoreConfiguration
        '''

        return self.__collection_store_configuration

    @property
    def default_collection_configuration(self):
        '''
        :rtype: dressdiscover.api.models.configuration.collection_configuration.CollectionConfiguration
        '''

        return self.__default_collection_configuration

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.configuration.institution_configuration.InstitutionConfiguration
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'collection_store_configuration' and ifield_id == 1:
                init_kwds['collection_store_configuration'] = dressdiscover.api.models.configuration.collection_store_configuration.CollectionStoreConfiguration.read(iprot)
            elif ifield_name == 'default_collection_configuration' and ifield_id == 2:
                init_kwds['default_collection_configuration'] = dressdiscover.api.models.configuration.collection_configuration.CollectionConfiguration.read(iprot)
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        collection_store_configuration=None,
        default_collection_configuration=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type collection_store_configuration: dressdiscover.api.models.configuration.collection_store_configuration.CollectionStoreConfiguration or None
        :type default_collection_configuration: dressdiscover.api.models.configuration.collection_configuration.CollectionConfiguration or None
        :rtype: dressdiscover.api.models.configuration.institution_configuration.InstitutionConfiguration
        '''

        if collection_store_configuration is None:
            collection_store_configuration = self.collection_store_configuration
        if default_collection_configuration is None:
            default_collection_configuration = self.default_collection_configuration
        return self.__class__(collection_store_configuration=collection_store_configuration, default_collection_configuration=default_collection_configuration)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.configuration.institution_configuration.InstitutionConfiguration
        '''

        oprot.write_struct_begin('InstitutionConfiguration')

        oprot.write_field_begin(name='collection_store_configuration', type=12, id=1)
        self.collection_store_configuration.write(oprot)
        oprot.write_field_end()

        if self.default_collection_configuration is not None:
            oprot.write_field_begin(name='default_collection_configuration', type=12, id=2)
            self.default_collection_configuration.write(oprot)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
