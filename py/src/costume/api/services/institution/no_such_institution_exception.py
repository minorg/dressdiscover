class NoSuchInstitutionException(Exception):
    class Builder(object):
        def build(self):
            return NoSuchInstitutionException()

    def __eq__(self, other):
        return True

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        return 'NoSuchInstitutionException()'

    def __str__(self):
        return 'NoSuchInstitutionException()'

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
        :rtype: costume.api.services.institution.no_such_institution_exception.NoSuchInstitutionException
        '''

        iprot.read_struct_begin()
        iprot.read_struct_end()
        return cls()

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.services.institution.no_such_institution_exception.NoSuchInstitutionException
        '''

        oprot.write_struct_begin('NoSuchInstitutionException')

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
