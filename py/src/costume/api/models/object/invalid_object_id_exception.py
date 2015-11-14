import __builtin__


class InvalidObjectIdException(Exception):
    class Builder(object):
        def __init__(
            self,
            cause_message=None,
        ):
            '''
            :type cause_message: str
            '''

            self.__cause_message = cause_message

        def build(self):
            return InvalidObjectIdException(cause_message=self.__cause_message)

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

        def update(self, invalid_object_id_exception):
            '''
            :type cause_message: str
            '''

            if isinstance(invalid_object_id_exception, InvalidObjectIdException):
                self.set_cause_message(invalid_object_id_exception.cause_message)
            elif isinstance(invalid_object_id_exception, dict):
                for key, value in invalid_object_id_exception.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(invalid_object_id_exception)
            return self

        @cause_message.setter
        def cause_message(self, cause_message):
            '''
            :type cause_message: str
            '''

            self.set_cause_message(cause_message)

    def __init__(
        self,
        cause_message,
    ):
        '''
        :type cause_message: str
        '''

        if cause_message is None:
            raise ValueError('cause_message is required')
        if not isinstance(cause_message, basestring):
            raise TypeError("expected cause_message to be a str but it is a %s" % getattr(__builtin__, 'type')(cause_message))
        self.__cause_message = cause_message

    def __eq__(self, other):
        if self.cause_message != other.cause_message:
            return False
        return True

    def __hash__(self):
        return hash(self.cause_message)

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('cause_message=' + "'" + self.cause_message.encode('ascii', 'replace') + "'")
        return 'InvalidObjectIdException(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('cause_message=' + "'" + self.cause_message.encode('ascii', 'replace') + "'")
        return 'InvalidObjectIdException(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'cause_message': self.cause_message}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.cause_message,)

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
        :rtype: costume.api.models.object.invalid_object_id_exception.InvalidObjectIdException
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'cause_message':
                init_kwds['cause_message'] = iprot.read_string()
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        cause_message=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type cause_message: str or None
        :rtype: costume.api.models.object.invalid_object_id_exception.InvalidObjectIdException
        '''

        if cause_message is None:
            cause_message = self.cause_message
        return self.__class__(cause_message=cause_message)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.models.object.invalid_object_id_exception.InvalidObjectIdException
        '''

        oprot.write_struct_begin('InvalidObjectIdException')

        oprot.write_field_begin(name='cause_message', type=11, id=None)
        oprot.write_string(self.cause_message)
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self