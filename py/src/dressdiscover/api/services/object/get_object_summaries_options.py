from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.services.object.object_summary_sort


class GetObjectSummariesOptions(object):
    class Builder(object):
        def __init__(
            self,
            from_=None,
            include_facets=None,
            size=None,
            sorts=None,
        ):
            '''
            :type from_: int or None
            :type include_facets: bool or None
            :type size: int or None
            :type sorts: tuple(dressdiscover.api.services.object.object_summary_sort.ObjectSummarySort) or None
            '''

            self.__from_ = from_
            self.__include_facets = include_facets
            self.__size = size
            self.__sorts = sorts

        def build(self):
            return GetObjectSummariesOptions(from_=self.__from_, include_facets=self.__include_facets, size=self.__size, sorts=self.__sorts)

        @property
        def from_(self):
            '''
            :rtype: int
            '''

            return self.__from_

        @property
        def include_facets(self):
            '''
            :rtype: bool
            '''

            return self.__include_facets

        def set_from_(self, from_):
            '''
            :type from_: int or None
            '''

            if from_ is not None:
                if not isinstance(from_, (int, long)) and from_ >= 0:
                    raise TypeError("expected from_ to be a int but it is a %s" % getattr(__builtin__, 'type')(from_))
            self.__from_ = from_
            return self

        def set_include_facets(self, include_facets):
            '''
            :type include_facets: bool or None
            '''

            if include_facets is not None:
                if not isinstance(include_facets, bool):
                    raise TypeError("expected include_facets to be a bool but it is a %s" % getattr(__builtin__, 'type')(include_facets))
                if include_facets is not True:
                    raise ValueError("expected include_facets to be True, was %s" % include_facets)
            self.__include_facets = include_facets
            return self

        def set_size(self, size):
            '''
            :type size: int or None
            '''

            if size is not None:
                if not isinstance(size, (int, long)) and size >= 0:
                    raise TypeError("expected size to be a int but it is a %s" % getattr(__builtin__, 'type')(size))
            self.__size = size
            return self

        def set_sorts(self, sorts):
            '''
            :type sorts: tuple(dressdiscover.api.services.object.object_summary_sort.ObjectSummarySort) or None
            '''

            if sorts is not None:
                if not (isinstance(sorts, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.services.object.object_summary_sort.ObjectSummarySort), sorts))) == 0):
                    raise TypeError("expected sorts to be a tuple(dressdiscover.api.services.object.object_summary_sort.ObjectSummarySort) but it is a %s" % getattr(__builtin__, 'type')(sorts))
                if len(sorts) < 1:
                    raise ValueError("expected len(sorts) to be >= 1, was %d" % len(sorts))
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
            :rtype: tuple(dressdiscover.api.services.object.object_summary_sort.ObjectSummarySort)
            '''

            return self.__sorts

        def update(self, get_object_summaries_options):
            '''
            :type from_: int or None
            :type include_facets: bool or None
            :type size: int or None
            :type sorts: tuple(dressdiscover.api.services.object.object_summary_sort.ObjectSummarySort) or None
            '''

            if isinstance(get_object_summaries_options, GetObjectSummariesOptions):
                self.set_from_(get_object_summaries_options.from_)
                self.set_include_facets(get_object_summaries_options.include_facets)
                self.set_size(get_object_summaries_options.size)
                self.set_sorts(get_object_summaries_options.sorts)
            elif isinstance(get_object_summaries_options, dict):
                for key, value in get_object_summaries_options.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(get_object_summaries_options)
            return self

        @from_.setter
        def from_(self, from_):
            '''
            :type from_: int or None
            '''

            self.set_from_(from_)

        @include_facets.setter
        def include_facets(self, include_facets):
            '''
            :type include_facets: bool or None
            '''

            self.set_include_facets(include_facets)

        @size.setter
        def size(self, size):
            '''
            :type size: int or None
            '''

            self.set_size(size)

        @sorts.setter
        def sorts(self, sorts):
            '''
            :type sorts: tuple(dressdiscover.api.services.object.object_summary_sort.ObjectSummarySort) or None
            '''

            self.set_sorts(sorts)

    class FieldMetadata(object):
        FROM_ = None
        INCLUDE_FACETS = None
        SIZE = None
        SORTS = None

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
            return (cls.FROM_, cls.INCLUDE_FACETS, cls.SIZE, cls.SORTS,)

    FieldMetadata.FROM_ = FieldMetadata('from_', int, None)
    FieldMetadata.INCLUDE_FACETS = FieldMetadata('include_facets', bool, {u'acceptance': True})
    FieldMetadata.SIZE = FieldMetadata('size', int, None)
    FieldMetadata.SORTS = FieldMetadata('sorts', tuple, {u'minLength': 1})

    def __init__(
        self,
        from_=None,
        include_facets=None,
        size=None,
        sorts=None,
    ):
        '''
        :type from_: int or None
        :type include_facets: bool or None
        :type size: int or None
        :type sorts: tuple(dressdiscover.api.services.object.object_summary_sort.ObjectSummarySort) or None
        '''

        if from_ is not None:
            if not isinstance(from_, (int, long)) and from_ >= 0:
                raise TypeError("expected from_ to be a int but it is a %s" % getattr(__builtin__, 'type')(from_))
        self.__from_ = from_

        if include_facets is not None:
            if not isinstance(include_facets, bool):
                raise TypeError("expected include_facets to be a bool but it is a %s" % getattr(__builtin__, 'type')(include_facets))
            if include_facets is not True:
                raise ValueError("expected include_facets to be True, was %s" % include_facets)
        self.__include_facets = include_facets

        if size is not None:
            if not isinstance(size, (int, long)) and size >= 0:
                raise TypeError("expected size to be a int but it is a %s" % getattr(__builtin__, 'type')(size))
        self.__size = size

        if sorts is not None:
            if not (isinstance(sorts, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.services.object.object_summary_sort.ObjectSummarySort), sorts))) == 0):
                raise TypeError("expected sorts to be a tuple(dressdiscover.api.services.object.object_summary_sort.ObjectSummarySort) but it is a %s" % getattr(__builtin__, 'type')(sorts))
            if len(sorts) < 1:
                raise ValueError("expected len(sorts) to be >= 1, was %d" % len(sorts))
        self.__sorts = sorts

    def __eq__(self, other):
        if self.from_ != other.from_:
            return False
        if self.include_facets != other.include_facets:
            return False
        if self.size != other.size:
            return False
        if self.sorts != other.sorts:
            return False
        return True

    def __hash__(self):
        return hash((self.from_,self.include_facets,self.size,self.sorts,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.from_ is not None:
            field_reprs.append('from_=' + repr(self.from_))
        if self.include_facets is not None:
            field_reprs.append('include_facets=' + repr(self.include_facets))
        if self.size is not None:
            field_reprs.append('size=' + repr(self.size))
        if self.sorts is not None:
            field_reprs.append('sorts=' + repr(self.sorts))
        return 'GetObjectSummariesOptions(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.from_ is not None:
            field_reprs.append('from_=' + repr(self.from_))
        if self.include_facets is not None:
            field_reprs.append('include_facets=' + repr(self.include_facets))
        if self.size is not None:
            field_reprs.append('size=' + repr(self.size))
        if self.sorts is not None:
            field_reprs.append('sorts=' + repr(self.sorts))
        return 'GetObjectSummariesOptions(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'from_': self.from_, 'include_facets': self.include_facets, 'size': self.size, 'sorts': self.sorts}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.from_, self.include_facets, self.size, self.sorts,)

    @property
    def from_(self):
        '''
        :rtype: int
        '''

        return self.__from_

    @property
    def include_facets(self):
        '''
        :rtype: bool
        '''

        return self.__include_facets

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.services.object.get_object_summaries_options.GetObjectSummariesOptions
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
            elif ifield_name == 'include_facets':
                try:
                    init_kwds['include_facets'] = iprot.read_bool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'size':
                try:
                    init_kwds['size'] = iprot.read_u32()
                except (TypeError,):
                    pass
            elif ifield_name == 'sorts':
                init_kwds['sorts'] = tuple([dressdiscover.api.services.object.object_summary_sort.ObjectSummarySort.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        from_=None,
        include_facets=None,
        size=None,
        sorts=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type from_: int or None
        :type include_facets: bool or None
        :type size: int or None
        :type sorts: tuple(dressdiscover.api.services.object.object_summary_sort.ObjectSummarySort) or None
        :rtype: dressdiscover.api.services.object.get_object_summaries_options.GetObjectSummariesOptions
        '''

        if from_ is None:
            from_ = self.from_
        if include_facets is None:
            include_facets = self.include_facets
        if size is None:
            size = self.size
        if sorts is None:
            sorts = self.sorts
        return self.__class__(from_=from_, include_facets=include_facets, size=size, sorts=sorts)

    @property
    def size(self):
        '''
        :rtype: int
        '''

        return self.__size

    @property
    def sorts(self):
        '''
        :rtype: tuple(dressdiscover.api.services.object.object_summary_sort.ObjectSummarySort)
        '''

        return self.__sorts

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.services.object.get_object_summaries_options.GetObjectSummariesOptions
        '''

        oprot.write_struct_begin('GetObjectSummariesOptions')

        if self.from_ is not None:
            oprot.write_field_begin(name='from_', type=8, id=None)
            oprot.write_u32(self.from_)
            oprot.write_field_end()

        if self.include_facets is not None:
            oprot.write_field_begin(name='include_facets', type=2, id=None)
            oprot.write_bool(self.include_facets)
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
