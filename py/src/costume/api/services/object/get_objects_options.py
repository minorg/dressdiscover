import __builtin__


class GetObjectsOptions(object):
    class Builder(object):
        def __init__(
            self,
            from_=None,
            size=None,
        ):
            '''
            :type from_: int
            :type size: int
            '''

            self.__from_ = from_
            self.__size = size

        def build(self):
            return GetObjectsOptions(from_=self.__from_, size=self.__size)

        @property
        def from_(self):
            '''
            :rtype: int
            '''

            return self.__from_

        def set_from_(self, from_):
            '''
            :type from_: int
            '''

            self.__from_ = from_
            return self

        def set_size(self, size):
            '''
            :type size: int
            '''

            self.__size = size
            return self

        @property
        def size(self):
            '''
            :rtype: int
            '''

            return self.__size

        def update(self, get_objects_options):
            '''
            :type from_: int
            :type size: int
            '''

            if isinstance(get_objects_options, GetObjectsOptions):
                self.set_from_(get_objects_options.from_)
                self.set_size(get_objects_options.size)
            elif isinstance(get_objects_options, dict):
                for key, value in get_objects_options.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(get_objects_options)
            return self

        @from_.setter
        def from_(self, from_):
            '''
            :type from_: int
            '''

            self.set_from_(from_)

        @size.setter
        def size(self, size):
            '''
            :type size: int
            '''

            self.set_size(size)

    def __init__(
        self,
        from_,
        size,
    ):
        '''
        :type from_: int
        :type size: int
        '''

        if from_ is None:
            raise ValueError('from_ is required')
        if not isinstance(from_, (int, long)) and from_ >= 0:
            raise TypeError("expected from_ to be a int but it is a %s" % getattr(__builtin__, 'type')(from_))
        self.__from_ = from_

        if size is None:
            raise ValueError('size is required')
        if not isinstance(size, (int, long)) and size >= 0:
            raise TypeError("expected size to be a int but it is a %s" % getattr(__builtin__, 'type')(size))
        self.__size = size

    def __eq__(self, other):
        if self.from_ != other.from_:
            return False
        if self.size != other.size:
            return False
        return True

    def __hash__(self):
        return hash((self.from_,self.size,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('from_=' + repr(self.from_))
        field_reprs.append('size=' + repr(self.size))
        return 'GetObjectsOptions(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('from_=' + repr(self.from_))
        field_reprs.append('size=' + repr(self.size))
        return 'GetObjectsOptions(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'from_': self.from_, 'size': self.size}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.from_, self.size,)

    @property
    def from_(self):
        '''
        :rtype: int
        '''

        return self.__from_

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: costume.api.services.object.get_objects_options.GetObjectsOptions
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'from_':
                init_kwds['from_'] = iprot.read_u32()
            elif ifield_name == 'size':
                init_kwds['size'] = iprot.read_u32()
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        from_=None,
        size=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type from_: int or None
        :type size: int or None
        :rtype: costume.api.services.object.get_objects_options.GetObjectsOptions
        '''

        if from_ is None:
            from_ = self.from_
        if size is None:
            size = self.size
        return self.__class__(from_=from_, size=size)

    @property
    def size(self):
        '''
        :rtype: int
        '''

        return self.__size

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.services.object.get_objects_options.GetObjectsOptions
        '''

        oprot.write_struct_begin('GetObjectsOptions')

        oprot.write_field_begin(name='from_', type=8, id=None)
        oprot.write_u32(self.from_)
        oprot.write_field_end()

        oprot.write_field_begin(name='size', type=8, id=None)
        oprot.write_u32(self.size)
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
