import __builtin__


class DuplicateUserException(Exception):
    class Builder(object):
        def __init__(
            self,
            cause_message=None,
            user_id=None,
        ):
            '''
            :type cause_message: str
            :type user_id: str
            '''

            self.__cause_message = cause_message
            self.__user_id = user_id

        def build(self):
            return DuplicateUserException(cause_message=self.__cause_message, user_id=self.__user_id)

        @property
        def cause_message(self):
            '''
            :rtype: str
            '''

            return self.__cause_message

        def set_cause_message(self, cause_message):
            '''
            :type cause_message: str
            '''

            self.__cause_message = cause_message
            return self

        def set_user_id(self, user_id):
            '''
            :type user_id: str
            '''

            self.__user_id = user_id
            return self

        def update(self, duplicate_user_exception):
            '''
            :type cause_message: str
            :type user_id: str
            '''

            if isinstance(duplicate_user_exception, DuplicateUserException):
                self.set_cause_message(duplicate_user_exception.cause_message)
                self.set_user_id(duplicate_user_exception.user_id)
            elif isinstance(duplicate_user_exception, dict):
                for key, value in duplicate_user_exception.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(duplicate_user_exception)
            return self

        @property
        def user_id(self):
            '''
            :rtype: str
            '''

            return self.__user_id

        @cause_message.setter
        def cause_message(self, cause_message):
            '''
            :type cause_message: str
            '''

            self.set_cause_message(cause_message)

        @user_id.setter
        def user_id(self, user_id):
            '''
            :type user_id: str
            '''

            self.set_user_id(user_id)

    def __init__(
        self,
        cause_message,
        user_id,
    ):
        '''
        :type cause_message: str
        :type user_id: str
        '''

        if cause_message is None:
            raise ValueError('cause_message is required')
        if not isinstance(cause_message, basestring):
            raise TypeError("expected cause_message to be a str but it is a %s" % getattr(__builtin__, 'type')(cause_message))
        self.__cause_message = cause_message

        if user_id is None:
            raise ValueError('user_id is required')
        if not isinstance(user_id, basestring):
            raise TypeError("expected user_id to be a str but it is a %s" % getattr(__builtin__, 'type')(user_id))
        self.__user_id = user_id

    def __eq__(self, other):
        if self.cause_message != other.cause_message:
            return False
        if self.user_id != other.user_id:
            return False
        return True

    def __hash__(self):
        return hash((self.cause_message,self.user_id,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('cause_message=' + "'" + self.cause_message.encode('ascii', 'replace') + "'")
        field_reprs.append('user_id=' + "'" + self.user_id.encode('ascii', 'replace') + "'")
        return 'DuplicateUserException(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('cause_message=' + "'" + self.cause_message.encode('ascii', 'replace') + "'")
        field_reprs.append('user_id=' + "'" + self.user_id.encode('ascii', 'replace') + "'")
        return 'DuplicateUserException(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'cause_message': self.cause_message, 'user_id': self.user_id}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.cause_message, self.user_id,)

    @property
    def cause_message(self):
        '''
        :rtype: str
        '''

        return self.__cause_message

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: costume.api.services.user.duplicate_user_exception.DuplicateUserException
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'cause_message':
                init_kwds['cause_message'] = iprot.read_string()
            elif ifield_name == 'user_id':
                init_kwds['user_id'] = iprot.read_string()
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        cause_message=None,
        user_id=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type cause_message: str or None
        :type user_id: str or None
        :rtype: costume.api.services.user.duplicate_user_exception.DuplicateUserException
        '''

        if cause_message is None:
            cause_message = self.cause_message
        if user_id is None:
            user_id = self.user_id
        return self.__class__(cause_message=cause_message, user_id=user_id)

    @property
    def user_id(self):
        '''
        :rtype: str
        '''

        return self.__user_id

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.services.user.duplicate_user_exception.DuplicateUserException
        '''

        oprot.write_struct_begin('DuplicateUserException')

        oprot.write_field_begin(name='cause_message', type=11, id=None)
        oprot.write_string(self.cause_message)
        oprot.write_field_end()

        oprot.write_field_begin(name='user_id', type=11, id=None)
        oprot.write_string(self.user_id)
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
