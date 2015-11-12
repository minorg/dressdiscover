import __builtin__


class ObjectQuery(object):
    class Builder(object):
        def __init__(
            self,
            include_collection_id=None,
            include_institution_id=None,
            query_string=None,
        ):
            '''
            :type include_collection_id: str or None
            :type include_institution_id: str or None
            :type query_string: str or None
            '''

            self.__include_collection_id = include_collection_id
            self.__include_institution_id = include_institution_id
            self.__query_string = query_string

        def build(self):
            return ObjectQuery(include_collection_id=self.__include_collection_id, include_institution_id=self.__include_institution_id, query_string=self.__query_string)

        @property
        def include_collection_id(self):
            '''
            :rtype: str
            '''

            return self.__include_collection_id

        @property
        def include_institution_id(self):
            '''
            :rtype: str
            '''

            return self.__include_institution_id

        @property
        def query_string(self):
            '''
            :rtype: str
            '''

            return self.__query_string

        def set_include_collection_id(self, include_collection_id):
            '''
            :type include_collection_id: str or None
            '''

            self.__include_collection_id = include_collection_id
            return self

        def set_include_institution_id(self, include_institution_id):
            '''
            :type include_institution_id: str or None
            '''

            self.__include_institution_id = include_institution_id
            return self

        def set_query_string(self, query_string):
            '''
            :type query_string: str or None
            '''

            self.__query_string = query_string
            return self

        def update(self, object_query):
            '''
            :type include_collection_id: str or None
            :type include_institution_id: str or None
            :type query_string: str or None
            '''

            if isinstance(object_query, ObjectQuery):
                self.set_include_collection_id(object_query.include_collection_id)
                self.set_include_institution_id(object_query.include_institution_id)
                self.set_query_string(object_query.query_string)
            elif isinstance(object_query, dict):
                for key, value in object_query.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(object_query)
            return self

        @include_collection_id.setter
        def include_collection_id(self, include_collection_id):
            '''
            :type include_collection_id: str or None
            '''

            self.set_include_collection_id(include_collection_id)

        @include_institution_id.setter
        def include_institution_id(self, include_institution_id):
            '''
            :type include_institution_id: str or None
            '''

            self.set_include_institution_id(include_institution_id)

        @query_string.setter
        def query_string(self, query_string):
            '''
            :type query_string: str or None
            '''

            self.set_query_string(query_string)

    def __init__(
        self,
        include_collection_id=None,
        include_institution_id=None,
        query_string=None,
    ):
        '''
        :type include_collection_id: str or None
        :type include_institution_id: str or None
        :type query_string: str or None
        '''

        if include_collection_id is not None:
            if not isinstance(include_collection_id, basestring):
                raise TypeError("expected include_collection_id to be a str but it is a %s" % getattr(__builtin__, 'type')(include_collection_id))
        self.__include_collection_id = include_collection_id

        if include_institution_id is not None:
            if not isinstance(include_institution_id, basestring):
                raise TypeError("expected include_institution_id to be a str but it is a %s" % getattr(__builtin__, 'type')(include_institution_id))
        self.__include_institution_id = include_institution_id

        if query_string is not None:
            if not isinstance(query_string, basestring):
                raise TypeError("expected query_string to be a str but it is a %s" % getattr(__builtin__, 'type')(query_string))
            if len(query_string) < 1:
                raise ValueError("expected len(query_string) to be >= 1, was %d" % len(query_string))
        self.__query_string = query_string

    def __eq__(self, other):
        if self.include_collection_id != other.include_collection_id:
            return False
        if self.include_institution_id != other.include_institution_id:
            return False
        if self.query_string != other.query_string:
            return False
        return True

    def __hash__(self):
        return hash((self.include_collection_id,self.include_institution_id,self.query_string,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.include_collection_id is not None:
            field_reprs.append('include_collection_id=' + "'" + self.include_collection_id.encode('ascii', 'replace') + "'")
        if self.include_institution_id is not None:
            field_reprs.append('include_institution_id=' + "'" + self.include_institution_id.encode('ascii', 'replace') + "'")
        if self.query_string is not None:
            field_reprs.append('query_string=' + "'" + self.query_string.encode('ascii', 'replace') + "'")
        return 'ObjectQuery(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.include_collection_id is not None:
            field_reprs.append('include_collection_id=' + "'" + self.include_collection_id.encode('ascii', 'replace') + "'")
        if self.include_institution_id is not None:
            field_reprs.append('include_institution_id=' + "'" + self.include_institution_id.encode('ascii', 'replace') + "'")
        if self.query_string is not None:
            field_reprs.append('query_string=' + "'" + self.query_string.encode('ascii', 'replace') + "'")
        return 'ObjectQuery(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'include_collection_id': self.include_collection_id, 'include_institution_id': self.include_institution_id, 'query_string': self.query_string}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.include_collection_id, self.include_institution_id, self.query_string,)

    @property
    def include_collection_id(self):
        '''
        :rtype: str
        '''

        return self.__include_collection_id

    @property
    def include_institution_id(self):
        '''
        :rtype: str
        '''

        return self.__include_institution_id

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
            elif ifield_name == 'include_collection_id':
                try:
                    init_kwds['include_collection_id'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'include_institution_id':
                try:
                    init_kwds['include_institution_id'] = iprot.read_string()
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
        include_collection_id=None,
        include_institution_id=None,
        query_string=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type include_collection_id: str or None
        :type include_institution_id: str or None
        :type query_string: str or None
        :rtype: costume.api.models.object.object_query.ObjectQuery
        '''

        if include_collection_id is None:
            include_collection_id = self.include_collection_id
        if include_institution_id is None:
            include_institution_id = self.include_institution_id
        if query_string is None:
            query_string = self.query_string
        return self.__class__(include_collection_id=include_collection_id, include_institution_id=include_institution_id, query_string=query_string)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.models.object.object_query.ObjectQuery
        '''

        oprot.write_struct_begin('ObjectQuery')

        if self.include_collection_id is not None:
            oprot.write_field_begin(name='include_collection_id', type=11, id=None)
            oprot.write_string(self.include_collection_id)
            oprot.write_field_end()

        if self.include_institution_id is not None:
            oprot.write_field_begin(name='include_institution_id', type=11, id=None)
            oprot.write_string(self.include_institution_id)
            oprot.write_field_end()

        if self.query_string is not None:
            oprot.write_field_begin(name='query_string', type=11, id=None)
            oprot.write_string(self.query_string)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
