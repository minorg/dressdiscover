import __builtin__
import costume.api.models.model_metadata


class User(object):
    class Builder(object):
        def __init__(
            self,
            model_metadata=None,
        ):
            '''
            :type model_metadata: costume.api.models.model_metadata.ModelMetadata
            '''

            self.__model_metadata = model_metadata

        def build(self):
            return User(model_metadata=self.__model_metadata)

        @property
        def model_metadata(self):
            '''
            :rtype: costume.api.models.model_metadata.ModelMetadata
            '''

            return self.__model_metadata

        def set_model_metadata(self, model_metadata):
            '''
            :type model_metadata: costume.api.models.model_metadata.ModelMetadata
            '''

            self.__model_metadata = model_metadata
            return self

        def update(self, user):
            '''
            :type model_metadata: costume.api.models.model_metadata.ModelMetadata
            '''

            if isinstance(user, User):
                self.set_model_metadata(user.model_metadata)
            elif isinstance(user, dict):
                for key, value in user.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(user)
            return self

        @model_metadata.setter
        def model_metadata(self, model_metadata):
            '''
            :type model_metadata: costume.api.models.model_metadata.ModelMetadata
            '''

            self.set_model_metadata(model_metadata)

    def __init__(
        self,
        model_metadata,
    ):
        '''
        :type model_metadata: costume.api.models.model_metadata.ModelMetadata
        '''

        if model_metadata is None:
            raise ValueError('model_metadata is required')
        if not isinstance(model_metadata, costume.api.models.model_metadata.ModelMetadata):
            raise TypeError("expected model_metadata to be a costume.api.models.model_metadata.ModelMetadata but it is a %s" % getattr(__builtin__, 'type')(model_metadata))
        self.__model_metadata = model_metadata

    def __eq__(self, other):
        if self.model_metadata != other.model_metadata:
            return False
        return True

    def __hash__(self):
        return hash(self.model_metadata)

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('model_metadata=' + repr(self.model_metadata))
        return 'User(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('model_metadata=' + repr(self.model_metadata))
        return 'User(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'model_metadata': self.model_metadata}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.model_metadata,)

    @property
    def model_metadata(self):
        '''
        :rtype: costume.api.models.model_metadata.ModelMetadata
        '''

        return self.__model_metadata

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: costume.api.models.user.user.User
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'model_metadata' and ifield_id == 1:
                init_kwds['model_metadata'] = costume.api.models.model_metadata.ModelMetadata.read(iprot)
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        model_metadata=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type model_metadata: costume.api.models.model_metadata.ModelMetadata or None
        :rtype: costume.api.models.user.user.User
        '''

        if model_metadata is None:
            model_metadata = self.model_metadata
        return self.__class__(model_metadata=model_metadata)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.models.user.user.User
        '''

        oprot.write_struct_begin('User')

        oprot.write_field_begin(name='model_metadata', type=12, id=1)
        self.model_metadata.write(oprot)
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
