class NoSuchObjectException(Exception):
    class Builder(object):
        def build(self):
            return NoSuchObjectException()

    def __eq__(self, other):
        return True

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        return 'NoSuchObjectException()'

    def __str__(self):
        return 'NoSuchObjectException()'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return tuple()

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: costume.api.services.object.no_such_object_exception.NoSuchObjectException
        '''

        iprot.read_struct_begin()
        iprot.read_struct_end()
        return cls()

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.services.object.no_such_object_exception.NoSuchObjectException
        '''

        oprot.write_struct_begin('NoSuchObjectException')

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
