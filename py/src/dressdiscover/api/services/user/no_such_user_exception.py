import __builtin__


class NoSuchUserException(Exception):
    class Builder(object):
        def __init__(
            self,
            id=None,  # @ReservedAssignment
        ):
            '''
            :type id: str or None
            '''

            self.__id = id

        def build(self):
            return NoSuchUserException(id=self.__id)

        @property
        def id(self):  # @ReservedAssignment
            '''
            :rtype: str
            '''

            return self.__id

        def set_id(self, id):  # @ReservedAssignment
            '''
            :type id: str or None
            '''

            if id is not None:
                if not isinstance(id, basestring):
                    raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))
            self.__id = id
            return self

        def update(self, no_such_user_exception):
            '''
            :type id: str or None
            '''

            if isinstance(no_such_user_exception, NoSuchUserException):
                self.set_id(no_such_user_exception.id)
            elif isinstance(no_such_user_exception, dict):
                for key, value in no_such_user_exception.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(no_such_user_exception)
            return self

        @id.setter
        def id(self, id):  # @ReservedAssignment
            '''
            :type id: str or None
            '''

            self.set_id(id)

    class FieldMetadata(object):
        ID = None

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
            return (cls.ID,)

    FieldMetadata.ID = FieldMetadata('id', dressdiscover.api.models.user.user_id.UserId, None)

    def __init__(
        self,
        id=None,  # @ReservedAssignment
    ):
        '''
        :type id: str or None
        '''

        if id is not None:
            if not isinstance(id, basestring):
                raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))
        self.__id = id

    def __eq__(self, other):
        if self.id != other.id:
            return False
        return True

    def __hash__(self):
        return hash(self.id)

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.id is not None:
            field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        return 'NoSuchUserException(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.id is not None:
            field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        return 'NoSuchUserException(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'id': self.id}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.id,)

    @property
    def id(self):  # @ReservedAssignment
        '''
        :rtype: str
        '''

        return self.__id

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.services.user.no_such_user_exception.NoSuchUserException
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'id':
                try:
                    init_kwds['id'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        id=None,  # @ReservedAssignment
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type id: str or None
        :rtype: dressdiscover.api.services.user.no_such_user_exception.NoSuchUserException
        '''

        if id is None:
            id = self.id  # @ReservedAssignment
        return self.__class__(id=id)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.services.user.no_such_user_exception.NoSuchUserException
        '''

        oprot.write_struct_begin('NoSuchUserException')

        if self.id is not None:
            oprot.write_field_begin(name='id', type=11, id=None)
            oprot.write_string(self.id)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
