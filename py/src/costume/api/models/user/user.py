import __builtin__
import costume.api.models.model_metadata


class User(object):
    class Builder(object):
        def __init__(
            self,
            email_address=None,
            model_metadata=None,
        ):
            '''
            :type email_address: str
            :type model_metadata: costume.api.models.model_metadata.ModelMetadata
            '''

            self.__email_address = email_address
            self.__model_metadata = model_metadata

        def build(self):
            return User(email_address=self.__email_address, model_metadata=self.__model_metadata)

        @property
        def email_address(self):
            '''
            :rtype: str
            '''

            return self.__email_address

        @property
        def model_metadata(self):
            '''
            :rtype: costume.api.models.model_metadata.ModelMetadata
            '''

            return self.__model_metadata

        def set_email_address(self, email_address):
            '''
            :type email_address: str
            '''

            self.__email_address = email_address
            return self

        def set_model_metadata(self, model_metadata):
            '''
            :type model_metadata: costume.api.models.model_metadata.ModelMetadata
            '''

            self.__model_metadata = model_metadata
            return self

        def update(self, user):
            '''
            :type email_address: str
            :type model_metadata: costume.api.models.model_metadata.ModelMetadata
            '''

            if isinstance(user, User):
                self.set_email_address(user.email_address)
                self.set_model_metadata(user.model_metadata)
            elif isinstance(user, dict):
                for key, value in user.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(user)
            return self

        @email_address.setter
        def email_address(self, email_address):
            '''
            :type email_address: str
            '''

            self.set_email_address(email_address)

        @model_metadata.setter
        def model_metadata(self, model_metadata):
            '''
            :type model_metadata: costume.api.models.model_metadata.ModelMetadata
            '''

            self.set_model_metadata(model_metadata)

    def __init__(
        self,
        email_address,
        model_metadata,
    ):
        '''
        :type email_address: str
        :type model_metadata: costume.api.models.model_metadata.ModelMetadata
        '''

        if email_address is None:
            raise ValueError('email_address is required')
        if not isinstance(email_address, basestring):
            raise TypeError("expected email_address to be a str but it is a %s" % getattr(__builtin__, 'type')(email_address))
        self.__email_address = email_address

        if model_metadata is None:
            raise ValueError('model_metadata is required')
        if not isinstance(model_metadata, costume.api.models.model_metadata.ModelMetadata):
            raise TypeError("expected model_metadata to be a costume.api.models.model_metadata.ModelMetadata but it is a %s" % getattr(__builtin__, 'type')(model_metadata))
        self.__model_metadata = model_metadata

    def __eq__(self, other):
        if self.email_address != other.email_address:
            return False
        if self.model_metadata != other.model_metadata:
            return False
        return True

    def __hash__(self):
        return hash((self.email_address,self.model_metadata,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('email_address=' + "'" + self.email_address.encode('ascii', 'replace') + "'")
        field_reprs.append('model_metadata=' + repr(self.model_metadata))
        return 'User(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('email_address=' + "'" + self.email_address.encode('ascii', 'replace') + "'")
        field_reprs.append('model_metadata=' + repr(self.model_metadata))
        return 'User(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'email_address': self.email_address, 'model_metadata': self.model_metadata}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.email_address, self.model_metadata,)

    @property
    def email_address(self):
        '''
        :rtype: str
        '''

        return self.__email_address

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
            elif ifield_name == 'email_address' and ifield_id == 2:
                init_kwds['email_address'] = iprot.read_string()
            elif ifield_name == 'model_metadata' and ifield_id == 1:
                init_kwds['model_metadata'] = costume.api.models.model_metadata.ModelMetadata.read(iprot)
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        email_address=None,
        model_metadata=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type email_address: str or None
        :type model_metadata: costume.api.models.model_metadata.ModelMetadata or None
        :rtype: costume.api.models.user.user.User
        '''

        if email_address is None:
            email_address = self.email_address
        if model_metadata is None:
            model_metadata = self.model_metadata
        return self.__class__(email_address=email_address, model_metadata=model_metadata)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.models.user.user.User
        '''

        oprot.write_struct_begin('User')

        oprot.write_field_begin(name='email_address', type=11, id=2)
        oprot.write_string(self.email_address)
        oprot.write_field_end()

        oprot.write_field_begin(name='model_metadata', type=12, id=1)
        self.model_metadata.write(oprot)
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
