import __builtin__
import costume.api.models.object.object_filters


class ObjectQuery(object):
    class Builder(object):
        def __init__(
            self,
            filters=None,
            more_like_object_id=None,
            query_string=None,
        ):
            '''
            :type filters: costume.api.models.object.object_filters.ObjectFilters or None
            :type more_like_object_id: str or None
            :type query_string: str or None
            '''

            self.__filters = filters
            self.__more_like_object_id = more_like_object_id
            self.__query_string = query_string

        def build(self):
            return ObjectQuery(filters=self.__filters, more_like_object_id=self.__more_like_object_id, query_string=self.__query_string)

        @property
        def filters(self):
            '''
            :rtype: costume.api.models.object.object_filters.ObjectFilters
            '''

            return self.__filters

        @property
        def more_like_object_id(self):
            '''
            :rtype: str
            '''

            return self.__more_like_object_id

        @property
        def query_string(self):
            '''
            :rtype: str
            '''

            return self.__query_string

        def set_filters(self, filters):
            '''
            :type filters: costume.api.models.object.object_filters.ObjectFilters or None
            '''

            self.__filters = filters
            return self

        def set_more_like_object_id(self, more_like_object_id):
            '''
            :type more_like_object_id: str or None
            '''

            self.__more_like_object_id = more_like_object_id
            return self

        def set_query_string(self, query_string):
            '''
            :type query_string: str or None
            '''

            self.__query_string = query_string
            return self

        def update(self, object_query):
            '''
            :type filters: costume.api.models.object.object_filters.ObjectFilters or None
            :type more_like_object_id: str or None
            :type query_string: str or None
            '''

            if isinstance(object_query, ObjectQuery):
                self.set_filters(object_query.filters)
                self.set_more_like_object_id(object_query.more_like_object_id)
                self.set_query_string(object_query.query_string)
            elif isinstance(object_query, dict):
                for key, value in object_query.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(object_query)
            return self

        @filters.setter
        def filters(self, filters):
            '''
            :type filters: costume.api.models.object.object_filters.ObjectFilters or None
            '''

            self.set_filters(filters)

        @more_like_object_id.setter
        def more_like_object_id(self, more_like_object_id):
            '''
            :type more_like_object_id: str or None
            '''

            self.set_more_like_object_id(more_like_object_id)

        @query_string.setter
        def query_string(self, query_string):
            '''
            :type query_string: str or None
            '''

            self.set_query_string(query_string)

    def __init__(
        self,
        filters=None,
        more_like_object_id=None,
        query_string=None,
    ):
        '''
        :type filters: costume.api.models.object.object_filters.ObjectFilters or None
        :type more_like_object_id: str or None
        :type query_string: str or None
        '''

        if filters is not None:
            if not isinstance(filters, costume.api.models.object.object_filters.ObjectFilters):
                raise TypeError("expected filters to be a costume.api.models.object.object_filters.ObjectFilters but it is a %s" % getattr(__builtin__, 'type')(filters))
        self.__filters = filters

        if more_like_object_id is not None:
            if not isinstance(more_like_object_id, basestring):
                raise TypeError("expected more_like_object_id to be a str but it is a %s" % getattr(__builtin__, 'type')(more_like_object_id))
        self.__more_like_object_id = more_like_object_id

        if query_string is not None:
            if not isinstance(query_string, basestring):
                raise TypeError("expected query_string to be a str but it is a %s" % getattr(__builtin__, 'type')(query_string))
            if len(query_string) < 1:
                raise ValueError("expected len(query_string) to be >= 1, was %d" % len(query_string))
        self.__query_string = query_string

    def __eq__(self, other):
        if self.filters != other.filters:
            return False
        if self.more_like_object_id != other.more_like_object_id:
            return False
        if self.query_string != other.query_string:
            return False
        return True

    def __hash__(self):
        return hash((self.filters,self.more_like_object_id,self.query_string,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.filters is not None:
            field_reprs.append('filters=' + repr(self.filters))
        if self.more_like_object_id is not None:
            field_reprs.append('more_like_object_id=' + "'" + self.more_like_object_id.encode('ascii', 'replace') + "'")
        if self.query_string is not None:
            field_reprs.append('query_string=' + "'" + self.query_string.encode('ascii', 'replace') + "'")
        return 'ObjectQuery(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.filters is not None:
            field_reprs.append('filters=' + repr(self.filters))
        if self.more_like_object_id is not None:
            field_reprs.append('more_like_object_id=' + "'" + self.more_like_object_id.encode('ascii', 'replace') + "'")
        if self.query_string is not None:
            field_reprs.append('query_string=' + "'" + self.query_string.encode('ascii', 'replace') + "'")
        return 'ObjectQuery(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'filters': self.filters, 'more_like_object_id': self.more_like_object_id, 'query_string': self.query_string}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.filters, self.more_like_object_id, self.query_string,)

    @property
    def filters(self):
        '''
        :rtype: costume.api.models.object.object_filters.ObjectFilters
        '''

        return self.__filters

    @property
    def more_like_object_id(self):
        '''
        :rtype: str
        '''

        return self.__more_like_object_id

    @property
    def query_string(self):
        '''
        :rtype: str
        '''

        return self.__query_string

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: costume.api.models.object.object_query.ObjectQuery
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'filters':
                init_kwds['filters'] = costume.api.models.object.object_filters.ObjectFilters.read(iprot)
            elif ifield_name == 'more_like_object_id':
                try:
                    init_kwds['more_like_object_id'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'query_string':
                try:
                    init_kwds['query_string'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        filters=None,
        more_like_object_id=None,
        query_string=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type filters: costume.api.models.object.object_filters.ObjectFilters or None
        :type more_like_object_id: str or None
        :type query_string: str or None
        :rtype: costume.api.models.object.object_query.ObjectQuery
        '''

        if filters is None:
            filters = self.filters
        if more_like_object_id is None:
            more_like_object_id = self.more_like_object_id
        if query_string is None:
            query_string = self.query_string
        return self.__class__(filters=filters, more_like_object_id=more_like_object_id, query_string=query_string)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.models.object.object_query.ObjectQuery
        '''

        oprot.write_struct_begin('ObjectQuery')

        if self.filters is not None:
            oprot.write_field_begin(name='filters', type=12, id=None)
            self.filters.write(oprot)
            oprot.write_field_end()

        if self.more_like_object_id is not None:
            oprot.write_field_begin(name='more_like_object_id', type=11, id=None)
            oprot.write_string(self.more_like_object_id)
            oprot.write_field_end()

        if self.query_string is not None:
            oprot.write_field_begin(name='query_string', type=11, id=None)
            oprot.write_string(self.query_string)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
