from itertools import ifilterfalse
import __builtin__
import costume.api.services.object.object_sort


class GetObjectsOptions(object):
    class Builder(object):
        def __init__(
            self,
            from_=None,
            size=None,
            sorts=None,
        ):
            '''
            :type from_: int or None
            :type size: int or None
            :type sorts: tuple(costume.api.services.object.object_sort.ObjectSort) or None
            '''

            self.__from_ = from_
            self.__size = size
            self.__sorts = sorts

        def build(self):
            return GetObjectsOptions(from_=self.__from_, size=self.__size, sorts=self.__sorts)

        @property
        def from_(self):
            '''
            :rtype: int
            '''

            return self.__from_

        def set_from_(self, from_):
            '''
            :type from_: int or None
            '''

            self.__from_ = from_
            return self

        def set_size(self, size):
            '''
            :type size: int or None
            '''

            self.__size = size
            return self

        def set_sorts(self, sorts):
            '''
            :type sorts: tuple(costume.api.services.object.object_sort.ObjectSort) or None
            '''

            self.__sorts = sorts
            return self

        @property
        def size(self):
            '''
            :rtype: int
            '''

            return self.__size

        @property
        def sorts(self):
            '''
            :rtype: tuple(costume.api.services.object.object_sort.ObjectSort)
            '''

            return self.__sorts

        def update(self, get_objects_options):
            '''
            :type from_: int or None
            :type size: int or None
            :type sorts: tuple(costume.api.services.object.object_sort.ObjectSort) or None
            '''

            if isinstance(get_objects_options, GetObjectsOptions):
                self.set_from_(get_objects_options.from_)
                self.set_size(get_objects_options.size)
                self.set_sorts(get_objects_options.sorts)
            elif isinstance(get_objects_options, dict):
                for key, value in get_objects_options.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(get_objects_options)
            return self

        @from_.setter
        def from_(self, from_):
            '''
            :type from_: int or None
            '''

            self.set_from_(from_)

        @size.setter
        def size(self, size):
            '''
            :type size: int or None
            '''

            self.set_size(size)

        @sorts.setter
        def sorts(self, sorts):
            '''
            :type sorts: tuple(costume.api.services.object.object_sort.ObjectSort) or None
            '''

            self.set_sorts(sorts)

    def __init__(
        self,
        from_=None,
        size=None,
        sorts=None,
    ):
        '''
        :type from_: int or None
        :type size: int or None
        :type sorts: tuple(costume.api.services.object.object_sort.ObjectSort) or None
        '''

        if from_ is not None:
            if not isinstance(from_, (int, long)) and from_ >= 0:
                raise TypeError("expected from_ to be a int but it is a %s" % getattr(__builtin__, 'type')(from_))
        self.__from_ = from_

        if size is not None:
            if not isinstance(size, (int, long)) and size >= 0:
                raise TypeError("expected size to be a int but it is a %s" % getattr(__builtin__, 'type')(size))
        self.__size = size

        if sorts is not None:
            if not (isinstance(sorts, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, costume.api.services.object.object_sort.ObjectSort), sorts))) == 0):
                raise TypeError("expected sorts to be a tuple(costume.api.services.object.object_sort.ObjectSort) but it is a %s" % getattr(__builtin__, 'type')(sorts))
            if len(sorts) < 1:
                raise ValueError("expected len(sorts) to be >= 1, was %d" % len(sorts))
        self.__sorts = sorts

    def __eq__(self, other):
        if self.from_ != other.from_:
            return False
        if self.size != other.size:
            return False
        if self.sorts != other.sorts:
            return False
        return True

    def __hash__(self):
        return hash((self.from_,self.size,self.sorts,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.from_ is not None:
            field_reprs.append('from_=' + repr(self.from_))
        if self.size is not None:
            field_reprs.append('size=' + repr(self.size))
        if self.sorts is not None:
            field_reprs.append('sorts=' + repr(self.sorts))
        return 'GetObjectsOptions(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.from_ is not None:
            field_reprs.append('from_=' + repr(self.from_))
        if self.size is not None:
            field_reprs.append('size=' + repr(self.size))
        if self.sorts is not None:
            field_reprs.append('sorts=' + repr(self.sorts))
        return 'GetObjectsOptions(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'from_': self.from_, 'size': self.size, 'sorts': self.sorts}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.from_, self.size, self.sorts,)

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
                try:
                    init_kwds['from_'] = iprot.read_u32()
                except (TypeError,):
                    pass
            elif ifield_name == 'size':
                try:
                    init_kwds['size'] = iprot.read_u32()
                except (TypeError,):
                    pass
            elif ifield_name == 'sorts':
                init_kwds['sorts'] = tuple([costume.api.services.object.object_sort.ObjectSort.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        from_=None,
        size=None,
        sorts=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type from_: int or None
        :type size: int or None
        :type sorts: tuple(costume.api.services.object.object_sort.ObjectSort) or None
        :rtype: costume.api.services.object.get_objects_options.GetObjectsOptions
        '''

        if from_ is None:
            from_ = self.from_
        if size is None:
            size = self.size
        if sorts is None:
            sorts = self.sorts
        return self.__class__(from_=from_, size=size, sorts=sorts)

    @property
    def size(self):
        '''
        :rtype: int
        '''

        return self.__size

    @property
    def sorts(self):
        '''
        :rtype: tuple(costume.api.services.object.object_sort.ObjectSort)
        '''

        return self.__sorts

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.services.object.get_objects_options.GetObjectsOptions
        '''

        oprot.write_struct_begin('GetObjectsOptions')

        if self.from_ is not None:
            oprot.write_field_begin(name='from_', type=8, id=None)
            oprot.write_u32(self.from_)
            oprot.write_field_end()

        if self.size is not None:
            oprot.write_field_begin(name='size', type=8, id=None)
            oprot.write_u32(self.size)
            oprot.write_field_end()

        if self.sorts is not None:
            oprot.write_field_begin(name='sorts', type=15, id=None)
            oprot.write_list_begin(12, len(self.sorts))
            for _0 in self.sorts:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
