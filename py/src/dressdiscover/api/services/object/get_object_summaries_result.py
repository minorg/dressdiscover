from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.models.object.object_facets
import dressdiscover.api.models.object.object_summary_entry


class GetObjectSummariesResult(object):
    class Builder(object):
        def __init__(
            self,
            hits=None,
            total_hits=None,
            facets=None,
        ):
            '''
            :type hits: tuple(dressdiscover.api.models.object.object_summary_entry.ObjectSummaryEntry)
            :type total_hits: int
            :type facets: dressdiscover.api.models.object.object_facets.ObjectFacets or None
            '''

            self.__hits = hits
            self.__total_hits = total_hits
            self.__facets = facets

        def build(self):
            return GetObjectSummariesResult(hits=self.__hits, total_hits=self.__total_hits, facets=self.__facets)

        @property
        def facets(self):
            '''
            :rtype: dressdiscover.api.models.object.object_facets.ObjectFacets
            '''

            return self.__facets

        @property
        def hits(self):
            '''
            :rtype: tuple(dressdiscover.api.models.object.object_summary_entry.ObjectSummaryEntry)
            '''

            return self.__hits

        def set_facets(self, facets):
            '''
            :type facets: dressdiscover.api.models.object.object_facets.ObjectFacets or None
            '''

            self.__facets = facets
            return self

        def set_hits(self, hits):
            '''
            :type hits: tuple(dressdiscover.api.models.object.object_summary_entry.ObjectSummaryEntry)
            '''

            self.__hits = hits
            return self

        def set_total_hits(self, total_hits):
            '''
            :type total_hits: int
            '''

            self.__total_hits = total_hits
            return self

        @property
        def total_hits(self):
            '''
            :rtype: int
            '''

            return self.__total_hits

        def update(self, get_object_summaries_result):
            '''
            :type hits: tuple(dressdiscover.api.models.object.object_summary_entry.ObjectSummaryEntry)
            :type total_hits: int
            :type facets: dressdiscover.api.models.object.object_facets.ObjectFacets or None
            '''

            if isinstance(get_object_summaries_result, GetObjectSummariesResult):
                self.set_hits(get_object_summaries_result.hits)
                self.set_total_hits(get_object_summaries_result.total_hits)
                self.set_facets(get_object_summaries_result.facets)
            elif isinstance(get_object_summaries_result, dict):
                for key, value in get_object_summaries_result.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(get_object_summaries_result)
            return self

        @facets.setter
        def facets(self, facets):
            '''
            :type facets: dressdiscover.api.models.object.object_facets.ObjectFacets or None
            '''

            self.set_facets(facets)

        @hits.setter
        def hits(self, hits):
            '''
            :type hits: tuple(dressdiscover.api.models.object.object_summary_entry.ObjectSummaryEntry)
            '''

            self.set_hits(hits)

        @total_hits.setter
        def total_hits(self, total_hits):
            '''
            :type total_hits: int
            '''

            self.set_total_hits(total_hits)

    def __init__(
        self,
        hits,
        total_hits,
        facets=None,
    ):
        '''
        :type hits: tuple(dressdiscover.api.models.object.object_summary_entry.ObjectSummaryEntry)
        :type total_hits: int
        :type facets: dressdiscover.api.models.object.object_facets.ObjectFacets or None
        '''

        if hits is None:
            raise ValueError('hits is required')
        if not (isinstance(hits, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.object.object_summary_entry.ObjectSummaryEntry), hits))) == 0):
            raise TypeError("expected hits to be a tuple(dressdiscover.api.models.object.object_summary_entry.ObjectSummaryEntry) but it is a %s" % getattr(__builtin__, 'type')(hits))
        self.__hits = hits

        if total_hits is None:
            raise ValueError('total_hits is required')
        if not isinstance(total_hits, (int, long)) and total_hits >= 0:
            raise TypeError("expected total_hits to be a int but it is a %s" % getattr(__builtin__, 'type')(total_hits))
        self.__total_hits = total_hits

        if facets is not None:
            if not isinstance(facets, dressdiscover.api.models.object.object_facets.ObjectFacets):
                raise TypeError("expected facets to be a dressdiscover.api.models.object.object_facets.ObjectFacets but it is a %s" % getattr(__builtin__, 'type')(facets))
        self.__facets = facets

    def __eq__(self, other):
        if self.hits != other.hits:
            return False
        if self.total_hits != other.total_hits:
            return False
        if self.facets != other.facets:
            return False
        return True

    def __hash__(self):
        return hash((self.hits,self.total_hits,self.facets,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('hits=' + repr(self.hits))
        field_reprs.append('total_hits=' + repr(self.total_hits))
        if self.facets is not None:
            field_reprs.append('facets=' + repr(self.facets))
        return 'GetObjectSummariesResult(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('hits=' + repr(self.hits))
        field_reprs.append('total_hits=' + repr(self.total_hits))
        if self.facets is not None:
            field_reprs.append('facets=' + repr(self.facets))
        return 'GetObjectSummariesResult(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'hits': self.hits, 'total_hits': self.total_hits, 'facets': self.facets}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.hits, self.total_hits, self.facets,)

    @property
    def facets(self):
        '''
        :rtype: dressdiscover.api.models.object.object_facets.ObjectFacets
        '''

        return self.__facets

    @property
    def hits(self):
        '''
        :rtype: tuple(dressdiscover.api.models.object.object_summary_entry.ObjectSummaryEntry)
        '''

        return self.__hits

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.services.object.get_object_summaries_result.GetObjectSummariesResult
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'hits':
                init_kwds['hits'] = tuple([dressdiscover.api.models.object.object_summary_entry.ObjectSummaryEntry.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'total_hits':
                init_kwds['total_hits'] = iprot.read_u32()
            elif ifield_name == 'facets':
                init_kwds['facets'] = dressdiscover.api.models.object.object_facets.ObjectFacets.read(iprot)
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        hits=None,
        total_hits=None,
        facets=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type hits: tuple(dressdiscover.api.models.object.object_summary_entry.ObjectSummaryEntry) or None
        :type total_hits: int or None
        :type facets: dressdiscover.api.models.object.object_facets.ObjectFacets or None
        :rtype: dressdiscover.api.services.object.get_object_summaries_result.GetObjectSummariesResult
        '''

        if hits is None:
            hits = self.hits
        if total_hits is None:
            total_hits = self.total_hits
        if facets is None:
            facets = self.facets
        return self.__class__(hits=hits, total_hits=total_hits, facets=facets)

    @property
    def total_hits(self):
        '''
        :rtype: int
        '''

        return self.__total_hits

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.services.object.get_object_summaries_result.GetObjectSummariesResult
        '''

        oprot.write_struct_begin('GetObjectSummariesResult')

        oprot.write_field_begin(name='hits', type=15, id=None)
        oprot.write_list_begin(12, len(self.hits))
        for _0 in self.hits:
            _0.write(oprot)
        oprot.write_list_end()
        oprot.write_field_end()

        oprot.write_field_begin(name='total_hits', type=8, id=None)
        oprot.write_u32(self.total_hits)
        oprot.write_field_end()

        if self.facets is not None:
            oprot.write_field_begin(name='facets', type=12, id=None)
            self.facets.write(oprot)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
