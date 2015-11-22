from itertools import ifilterfalse
import __builtin__


class ObjectFacets(object):
    class Builder(object):
        def __init__(
            self,
            collection_hits=None,
            institution_hits=None,
            subject_term_texts=None,
        ):
            '''
            :type collection_hits: dict(str: int)
            :type institution_hits: dict(str: int)
            :type subject_term_texts: dict(str: int)
            '''

            self.__collection_hits = collection_hits
            self.__institution_hits = institution_hits
            self.__subject_term_texts = subject_term_texts

        def build(self):
            return ObjectFacets(collection_hits=self.__collection_hits, institution_hits=self.__institution_hits, subject_term_texts=self.__subject_term_texts)

        @property
        def collection_hits(self):
            '''
            :rtype: dict(str: int)
            '''

            return self.__collection_hits.copy() if self.__collection_hits is not None else None

        @property
        def institution_hits(self):
            '''
            :rtype: dict(str: int)
            '''

            return self.__institution_hits.copy() if self.__institution_hits is not None else None

        def set_collection_hits(self, collection_hits):
            '''
            :type collection_hits: dict(str: int)
            '''

            self.__collection_hits = collection_hits
            return self

        def set_institution_hits(self, institution_hits):
            '''
            :type institution_hits: dict(str: int)
            '''

            self.__institution_hits = institution_hits
            return self

        def set_subject_term_texts(self, subject_term_texts):
            '''
            :type subject_term_texts: dict(str: int)
            '''

            self.__subject_term_texts = subject_term_texts
            return self

        @property
        def subject_term_texts(self):
            '''
            :rtype: dict(str: int)
            '''

            return self.__subject_term_texts.copy() if self.__subject_term_texts is not None else None

        def update(self, object_facets):
            '''
            :type collection_hits: dict(str: int)
            :type institution_hits: dict(str: int)
            :type subject_term_texts: dict(str: int)
            '''

            if isinstance(object_facets, ObjectFacets):
                self.set_collection_hits(object_facets.collection_hits)
                self.set_institution_hits(object_facets.institution_hits)
                self.set_subject_term_texts(object_facets.subject_term_texts)
            elif isinstance(object_facets, dict):
                for key, value in object_facets.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(object_facets)
            return self

        @collection_hits.setter
        def collection_hits(self, collection_hits):
            '''
            :type collection_hits: dict(str: int)
            '''

            self.set_collection_hits(collection_hits)

        @institution_hits.setter
        def institution_hits(self, institution_hits):
            '''
            :type institution_hits: dict(str: int)
            '''

            self.set_institution_hits(institution_hits)

        @subject_term_texts.setter
        def subject_term_texts(self, subject_term_texts):
            '''
            :type subject_term_texts: dict(str: int)
            '''

            self.set_subject_term_texts(subject_term_texts)

    def __init__(
        self,
        collection_hits,
        institution_hits,
        subject_term_texts,
    ):
        '''
        :type collection_hits: dict(str: int)
        :type institution_hits: dict(str: int)
        :type subject_term_texts: dict(str: int)
        '''

        if collection_hits is None:
            raise ValueError('collection_hits is required')
        if not (isinstance(collection_hits, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], (int, long)) and __item[1] >= 0, collection_hits.iteritems()))) == 0):
            raise TypeError("expected collection_hits to be a dict(str: int) but it is a %s" % getattr(__builtin__, 'type')(collection_hits))
        self.__collection_hits = collection_hits.copy() if collection_hits is not None else None

        if institution_hits is None:
            raise ValueError('institution_hits is required')
        if not (isinstance(institution_hits, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], (int, long)) and __item[1] >= 0, institution_hits.iteritems()))) == 0):
            raise TypeError("expected institution_hits to be a dict(str: int) but it is a %s" % getattr(__builtin__, 'type')(institution_hits))
        self.__institution_hits = institution_hits.copy() if institution_hits is not None else None

        if subject_term_texts is None:
            raise ValueError('subject_term_texts is required')
        if not (isinstance(subject_term_texts, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], (int, long)) and __item[1] >= 0, subject_term_texts.iteritems()))) == 0):
            raise TypeError("expected subject_term_texts to be a dict(str: int) but it is a %s" % getattr(__builtin__, 'type')(subject_term_texts))
        self.__subject_term_texts = subject_term_texts.copy() if subject_term_texts is not None else None

    def __eq__(self, other):
        if self.collection_hits != other.collection_hits:
            return False
        if self.institution_hits != other.institution_hits:
            return False
        if self.subject_term_texts != other.subject_term_texts:
            return False
        return True

    def __hash__(self):
        return hash((self.collection_hits,self.institution_hits,self.subject_term_texts,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('collection_hits=' + repr(self.collection_hits))
        field_reprs.append('institution_hits=' + repr(self.institution_hits))
        field_reprs.append('subject_term_texts=' + repr(self.subject_term_texts))
        return 'ObjectFacets(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('collection_hits=' + repr(self.collection_hits))
        field_reprs.append('institution_hits=' + repr(self.institution_hits))
        field_reprs.append('subject_term_texts=' + repr(self.subject_term_texts))
        return 'ObjectFacets(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'collection_hits': self.collection_hits, 'institution_hits': self.institution_hits, 'subject_term_texts': self.subject_term_texts}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.collection_hits, self.institution_hits, self.subject_term_texts,)

    @property
    def collection_hits(self):
        '''
        :rtype: dict(str: int)
        '''

        return self.__collection_hits.copy() if self.__collection_hits is not None else None

    @property
    def institution_hits(self):
        '''
        :rtype: dict(str: int)
        '''

        return self.__institution_hits.copy() if self.__institution_hits is not None else None

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: costume.api.services.object.object_facets.ObjectFacets
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'collection_hits':
                init_kwds['collection_hits'] = dict([(iprot.read_string(), iprot.read_u32()) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            elif ifield_name == 'institution_hits':
                init_kwds['institution_hits'] = dict([(iprot.read_string(), iprot.read_u32()) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            elif ifield_name == 'subject_term_texts':
                init_kwds['subject_term_texts'] = dict([(iprot.read_string(), iprot.read_u32()) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        collection_hits=None,
        institution_hits=None,
        subject_term_texts=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type collection_hits: dict(str: int) or None
        :type institution_hits: dict(str: int) or None
        :type subject_term_texts: dict(str: int) or None
        :rtype: costume.api.services.object.object_facets.ObjectFacets
        '''

        if collection_hits is None:
            collection_hits = self.collection_hits
        if institution_hits is None:
            institution_hits = self.institution_hits
        if subject_term_texts is None:
            subject_term_texts = self.subject_term_texts
        return self.__class__(collection_hits=collection_hits, institution_hits=institution_hits, subject_term_texts=subject_term_texts)

    @property
    def subject_term_texts(self):
        '''
        :rtype: dict(str: int)
        '''

        return self.__subject_term_texts.copy() if self.__subject_term_texts is not None else None

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.services.object.object_facets.ObjectFacets
        '''

        oprot.write_struct_begin('ObjectFacets')

        oprot.write_field_begin(name='collection_hits', type=13, id=None)
        oprot.write_map_begin(11, len(self.collection_hits), 8)
        for __key0, __value0 in self.collection_hits.iteritems():
            oprot.write_string(__key0)
            oprot.write_u32(__value0)
        oprot.write_map_end()
        oprot.write_field_end()

        oprot.write_field_begin(name='institution_hits', type=13, id=None)
        oprot.write_map_begin(11, len(self.institution_hits), 8)
        for __key0, __value0 in self.institution_hits.iteritems():
            oprot.write_string(__key0)
            oprot.write_u32(__value0)
        oprot.write_map_end()
        oprot.write_field_end()

        oprot.write_field_begin(name='subject_term_texts', type=13, id=None)
        oprot.write_map_begin(11, len(self.subject_term_texts), 8)
        for __key0, __value0 in self.subject_term_texts.iteritems():
            oprot.write_string(__key0)
            oprot.write_u32(__value0)
        oprot.write_map_end()
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
