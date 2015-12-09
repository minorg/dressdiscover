import __builtin__
import costume.api.services.object.object_facet_filters


class ObjectQuery(object):
    class Builder(object):
        def __init__(
            self,
            collection_id=None,
            facet_filters=None,
            institution_id=None,
            more_like_object_id=None,
            query_string=None,
        ):
            '''
            :type collection_id: str or None
            :type facet_filters: costume.api.services.object.object_facet_filters.ObjectFacetFilters or None
            :type institution_id: str or None
            :type more_like_object_id: str or None
            :type query_string: str or None
            '''

            self.__collection_id = collection_id
            self.__facet_filters = facet_filters
            self.__institution_id = institution_id
            self.__more_like_object_id = more_like_object_id
            self.__query_string = query_string

        def build(self):
            return ObjectQuery(collection_id=self.__collection_id, facet_filters=self.__facet_filters, institution_id=self.__institution_id, more_like_object_id=self.__more_like_object_id, query_string=self.__query_string)

        @property
        def collection_id(self):
            '''
            :rtype: str
            '''

            return self.__collection_id

        @property
        def facet_filters(self):
            '''
            :rtype: costume.api.services.object.object_facet_filters.ObjectFacetFilters
            '''

            return self.__facet_filters

        @property
        def institution_id(self):
            '''
            :rtype: str
            '''

            return self.__institution_id

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

        def set_collection_id(self, collection_id):
            '''
            :type collection_id: str or None
            '''

            self.__collection_id = collection_id
            return self

        def set_facet_filters(self, facet_filters):
            '''
            :type facet_filters: costume.api.services.object.object_facet_filters.ObjectFacetFilters or None
            '''

            self.__facet_filters = facet_filters
            return self

        def set_institution_id(self, institution_id):
            '''
            :type institution_id: str or None
            '''

            self.__institution_id = institution_id
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
            :type collection_id: str or None
            :type facet_filters: costume.api.services.object.object_facet_filters.ObjectFacetFilters or None
            :type institution_id: str or None
            :type more_like_object_id: str or None
            :type query_string: str or None
            '''

            if isinstance(object_query, ObjectQuery):
                self.set_collection_id(object_query.collection_id)
                self.set_facet_filters(object_query.facet_filters)
                self.set_institution_id(object_query.institution_id)
                self.set_more_like_object_id(object_query.more_like_object_id)
                self.set_query_string(object_query.query_string)
            elif isinstance(object_query, dict):
                for key, value in object_query.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(object_query)
            return self

        @collection_id.setter
        def collection_id(self, collection_id):
            '''
            :type collection_id: str or None
            '''

            self.set_collection_id(collection_id)

        @facet_filters.setter
        def facet_filters(self, facet_filters):
            '''
            :type facet_filters: costume.api.services.object.object_facet_filters.ObjectFacetFilters or None
            '''

            self.set_facet_filters(facet_filters)

        @institution_id.setter
        def institution_id(self, institution_id):
            '''
            :type institution_id: str or None
            '''

            self.set_institution_id(institution_id)

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
        collection_id=None,
        facet_filters=None,
        institution_id=None,
        more_like_object_id=None,
        query_string=None,
    ):
        '''
        :type collection_id: str or None
        :type facet_filters: costume.api.services.object.object_facet_filters.ObjectFacetFilters or None
        :type institution_id: str or None
        :type more_like_object_id: str or None
        :type query_string: str or None
        '''

        if collection_id is not None:
            if not isinstance(collection_id, basestring):
                raise TypeError("expected collection_id to be a str but it is a %s" % getattr(__builtin__, 'type')(collection_id))
        self.__collection_id = collection_id

        if facet_filters is not None:
            if not isinstance(facet_filters, costume.api.services.object.object_facet_filters.ObjectFacetFilters):
                raise TypeError("expected facet_filters to be a costume.api.services.object.object_facet_filters.ObjectFacetFilters but it is a %s" % getattr(__builtin__, 'type')(facet_filters))
        self.__facet_filters = facet_filters

        if institution_id is not None:
            if not isinstance(institution_id, basestring):
                raise TypeError("expected institution_id to be a str but it is a %s" % getattr(__builtin__, 'type')(institution_id))
        self.__institution_id = institution_id

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
        if self.collection_id != other.collection_id:
            return False
        if self.facet_filters != other.facet_filters:
            return False
        if self.institution_id != other.institution_id:
            return False
        if self.more_like_object_id != other.more_like_object_id:
            return False
        if self.query_string != other.query_string:
            return False
        return True

    def __hash__(self):
        return hash((self.collection_id,self.facet_filters,self.institution_id,self.more_like_object_id,self.query_string,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.collection_id is not None:
            field_reprs.append('collection_id=' + "'" + self.collection_id.encode('ascii', 'replace') + "'")
        if self.facet_filters is not None:
            field_reprs.append('facet_filters=' + repr(self.facet_filters))
        if self.institution_id is not None:
            field_reprs.append('institution_id=' + "'" + self.institution_id.encode('ascii', 'replace') + "'")
        if self.more_like_object_id is not None:
            field_reprs.append('more_like_object_id=' + "'" + self.more_like_object_id.encode('ascii', 'replace') + "'")
        if self.query_string is not None:
            field_reprs.append('query_string=' + "'" + self.query_string.encode('ascii', 'replace') + "'")
        return 'ObjectQuery(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.collection_id is not None:
            field_reprs.append('collection_id=' + "'" + self.collection_id.encode('ascii', 'replace') + "'")
        if self.facet_filters is not None:
            field_reprs.append('facet_filters=' + repr(self.facet_filters))
        if self.institution_id is not None:
            field_reprs.append('institution_id=' + "'" + self.institution_id.encode('ascii', 'replace') + "'")
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

        return {'collection_id': self.collection_id, 'facet_filters': self.facet_filters, 'institution_id': self.institution_id, 'more_like_object_id': self.more_like_object_id, 'query_string': self.query_string}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.collection_id, self.facet_filters, self.institution_id, self.more_like_object_id, self.query_string,)

    @property
    def collection_id(self):
        '''
        :rtype: str
        '''

        return self.__collection_id

    @property
    def facet_filters(self):
        '''
        :rtype: costume.api.services.object.object_facet_filters.ObjectFacetFilters
        '''

        return self.__facet_filters

    @property
    def institution_id(self):
        '''
        :rtype: str
        '''

        return self.__institution_id

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
        :rtype: costume.api.services.object.object_query.ObjectQuery
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'collection_id':
                try:
                    init_kwds['collection_id'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'facet_filters':
                init_kwds['facet_filters'] = costume.api.services.object.object_facet_filters.ObjectFacetFilters.read(iprot)
            elif ifield_name == 'institution_id':
                try:
                    init_kwds['institution_id'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
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
        collection_id=None,
        facet_filters=None,
        institution_id=None,
        more_like_object_id=None,
        query_string=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type collection_id: str or None
        :type facet_filters: costume.api.services.object.object_facet_filters.ObjectFacetFilters or None
        :type institution_id: str or None
        :type more_like_object_id: str or None
        :type query_string: str or None
        :rtype: costume.api.services.object.object_query.ObjectQuery
        '''

        if collection_id is None:
            collection_id = self.collection_id
        if facet_filters is None:
            facet_filters = self.facet_filters
        if institution_id is None:
            institution_id = self.institution_id
        if more_like_object_id is None:
            more_like_object_id = self.more_like_object_id
        if query_string is None:
            query_string = self.query_string
        return self.__class__(collection_id=collection_id, facet_filters=facet_filters, institution_id=institution_id, more_like_object_id=more_like_object_id, query_string=query_string)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.services.object.object_query.ObjectQuery
        '''

        oprot.write_struct_begin('ObjectQuery')

        if self.collection_id is not None:
            oprot.write_field_begin(name='collection_id', type=11, id=None)
            oprot.write_string(self.collection_id)
            oprot.write_field_end()

        if self.facet_filters is not None:
            oprot.write_field_begin(name='facet_filters', type=12, id=None)
            self.facet_filters.write(oprot)
            oprot.write_field_end()

        if self.institution_id is not None:
            oprot.write_field_begin(name='institution_id', type=11, id=None)
            oprot.write_string(self.institution_id)
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
