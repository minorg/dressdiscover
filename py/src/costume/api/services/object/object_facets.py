from itertools import ifilterfalse
import __builtin__


class ObjectFacets(object):
    class Builder(object):
        def __init__(
            self,
            agent_name_texts=None,
            categories=None,
            collection_hits=None,
            institution_hits=None,
            subject_term_texts=None,
            thumbnail_exists=None,
            url_exists=None,
        ):
            '''
            :type agent_name_texts: dict(str: int)
            :type categories: dict(str: int)
            :type collection_hits: dict(str: int)
            :type institution_hits: dict(str: int)
            :type subject_term_texts: dict(str: int)
            :type thumbnail_exists: bool
            :type url_exists: bool
            '''

            self.__agent_name_texts = agent_name_texts
            self.__categories = categories
            self.__collection_hits = collection_hits
            self.__institution_hits = institution_hits
            self.__subject_term_texts = subject_term_texts
            self.__thumbnail_exists = thumbnail_exists
            self.__url_exists = url_exists

        def build(self):
            return ObjectFacets(agent_name_texts=self.__agent_name_texts, categories=self.__categories, collection_hits=self.__collection_hits, institution_hits=self.__institution_hits, subject_term_texts=self.__subject_term_texts, thumbnail_exists=self.__thumbnail_exists, url_exists=self.__url_exists)

        @property
        def agent_name_texts(self):
            '''
            :rtype: dict(str: int)
            '''

            return self.__agent_name_texts.copy() if self.__agent_name_texts is not None else None

        @property
        def categories(self):
            '''
            :rtype: dict(str: int)
            '''

            return self.__categories.copy() if self.__categories is not None else None

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

        def set_agent_name_texts(self, agent_name_texts):
            '''
            :type agent_name_texts: dict(str: int)
            '''

            self.__agent_name_texts = agent_name_texts
            return self

        def set_categories(self, categories):
            '''
            :type categories: dict(str: int)
            '''

            self.__categories = categories
            return self

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

        def set_thumbnail_exists(self, thumbnail_exists):
            '''
            :type thumbnail_exists: bool
            '''

            self.__thumbnail_exists = thumbnail_exists
            return self

        def set_url_exists(self, url_exists):
            '''
            :type url_exists: bool
            '''

            self.__url_exists = url_exists
            return self

        @property
        def subject_term_texts(self):
            '''
            :rtype: dict(str: int)
            '''

            return self.__subject_term_texts.copy() if self.__subject_term_texts is not None else None

        @property
        def thumbnail_exists(self):
            '''
            :rtype: bool
            '''

            return self.__thumbnail_exists

        def update(self, object_facets):
            '''
            :type agent_name_texts: dict(str: int)
            :type categories: dict(str: int)
            :type collection_hits: dict(str: int)
            :type institution_hits: dict(str: int)
            :type subject_term_texts: dict(str: int)
            :type thumbnail_exists: bool
            :type url_exists: bool
            '''

            if isinstance(object_facets, ObjectFacets):
                self.set_agent_name_texts(object_facets.agent_name_texts)
                self.set_categories(object_facets.categories)
                self.set_collection_hits(object_facets.collection_hits)
                self.set_institution_hits(object_facets.institution_hits)
                self.set_subject_term_texts(object_facets.subject_term_texts)
                self.set_thumbnail_exists(object_facets.thumbnail_exists)
                self.set_url_exists(object_facets.url_exists)
            elif isinstance(object_facets, dict):
                for key, value in object_facets.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(object_facets)
            return self

        @property
        def url_exists(self):
            '''
            :rtype: bool
            '''

            return self.__url_exists

        @agent_name_texts.setter
        def agent_name_texts(self, agent_name_texts):
            '''
            :type agent_name_texts: dict(str: int)
            '''

            self.set_agent_name_texts(agent_name_texts)

        @categories.setter
        def categories(self, categories):
            '''
            :type categories: dict(str: int)
            '''

            self.set_categories(categories)

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

        @thumbnail_exists.setter
        def thumbnail_exists(self, thumbnail_exists):
            '''
            :type thumbnail_exists: bool
            '''

            self.set_thumbnail_exists(thumbnail_exists)

        @url_exists.setter
        def url_exists(self, url_exists):
            '''
            :type url_exists: bool
            '''

            self.set_url_exists(url_exists)

    def __init__(
        self,
        agent_name_texts,
        categories,
        collection_hits,
        institution_hits,
        subject_term_texts,
        thumbnail_exists,
        url_exists,
    ):
        '''
        :type agent_name_texts: dict(str: int)
        :type categories: dict(str: int)
        :type collection_hits: dict(str: int)
        :type institution_hits: dict(str: int)
        :type subject_term_texts: dict(str: int)
        :type thumbnail_exists: bool
        :type url_exists: bool
        '''

        if agent_name_texts is None:
            raise ValueError('agent_name_texts is required')
        if not (isinstance(agent_name_texts, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], (int, long)) and __item[1] >= 0, agent_name_texts.iteritems()))) == 0):
            raise TypeError("expected agent_name_texts to be a dict(str: int) but it is a %s" % getattr(__builtin__, 'type')(agent_name_texts))
        self.__agent_name_texts = agent_name_texts.copy() if agent_name_texts is not None else None

        if categories is None:
            raise ValueError('categories is required')
        if not (isinstance(categories, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], (int, long)) and __item[1] >= 0, categories.iteritems()))) == 0):
            raise TypeError("expected categories to be a dict(str: int) but it is a %s" % getattr(__builtin__, 'type')(categories))
        self.__categories = categories.copy() if categories is not None else None

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

        if thumbnail_exists is None:
            raise ValueError('thumbnail_exists is required')
        if not isinstance(thumbnail_exists, bool):
            raise TypeError("expected thumbnail_exists to be a bool but it is a %s" % getattr(__builtin__, 'type')(thumbnail_exists))
        self.__thumbnail_exists = thumbnail_exists

        if url_exists is None:
            raise ValueError('url_exists is required')
        if not isinstance(url_exists, bool):
            raise TypeError("expected url_exists to be a bool but it is a %s" % getattr(__builtin__, 'type')(url_exists))
        self.__url_exists = url_exists

    def __eq__(self, other):
        if self.agent_name_texts != other.agent_name_texts:
            return False
        if self.categories != other.categories:
            return False
        if self.collection_hits != other.collection_hits:
            return False
        if self.institution_hits != other.institution_hits:
            return False
        if self.subject_term_texts != other.subject_term_texts:
            return False
        if self.thumbnail_exists != other.thumbnail_exists:
            return False
        if self.url_exists != other.url_exists:
            return False
        return True

    def __hash__(self):
        return hash((self.agent_name_texts,self.categories,self.collection_hits,self.institution_hits,self.subject_term_texts,self.thumbnail_exists,self.url_exists,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('agent_name_texts=' + repr(self.agent_name_texts))
        field_reprs.append('categories=' + repr(self.categories))
        field_reprs.append('collection_hits=' + repr(self.collection_hits))
        field_reprs.append('institution_hits=' + repr(self.institution_hits))
        field_reprs.append('subject_term_texts=' + repr(self.subject_term_texts))
        field_reprs.append('thumbnail_exists=' + repr(self.thumbnail_exists))
        field_reprs.append('url_exists=' + repr(self.url_exists))
        return 'ObjectFacets(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('agent_name_texts=' + repr(self.agent_name_texts))
        field_reprs.append('categories=' + repr(self.categories))
        field_reprs.append('collection_hits=' + repr(self.collection_hits))
        field_reprs.append('institution_hits=' + repr(self.institution_hits))
        field_reprs.append('subject_term_texts=' + repr(self.subject_term_texts))
        field_reprs.append('thumbnail_exists=' + repr(self.thumbnail_exists))
        field_reprs.append('url_exists=' + repr(self.url_exists))
        return 'ObjectFacets(' + ', '.join(field_reprs) + ')'

    @property
    def agent_name_texts(self):
        '''
        :rtype: dict(str: int)
        '''

        return self.__agent_name_texts.copy() if self.__agent_name_texts is not None else None

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'agent_name_texts': self.agent_name_texts, 'categories': self.categories, 'collection_hits': self.collection_hits, 'institution_hits': self.institution_hits, 'subject_term_texts': self.subject_term_texts, 'thumbnail_exists': self.thumbnail_exists, 'url_exists': self.url_exists}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.agent_name_texts, self.categories, self.collection_hits, self.institution_hits, self.subject_term_texts, self.thumbnail_exists, self.url_exists,)

    @property
    def categories(self):
        '''
        :rtype: dict(str: int)
        '''

        return self.__categories.copy() if self.__categories is not None else None

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
            elif ifield_name == 'agent_name_texts':
                init_kwds['agent_name_texts'] = dict([(iprot.read_string(), iprot.read_u32()) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            elif ifield_name == 'categories':
                init_kwds['categories'] = dict([(iprot.read_string(), iprot.read_u32()) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            elif ifield_name == 'collection_hits':
                init_kwds['collection_hits'] = dict([(iprot.read_string(), iprot.read_u32()) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            elif ifield_name == 'institution_hits':
                init_kwds['institution_hits'] = dict([(iprot.read_string(), iprot.read_u32()) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            elif ifield_name == 'subject_term_texts':
                init_kwds['subject_term_texts'] = dict([(iprot.read_string(), iprot.read_u32()) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            elif ifield_name == 'thumbnail_exists':
                init_kwds['thumbnail_exists'] = iprot.read_bool()
            elif ifield_name == 'url_exists':
                init_kwds['url_exists'] = iprot.read_bool()
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        agent_name_texts=None,
        categories=None,
        collection_hits=None,
        institution_hits=None,
        subject_term_texts=None,
        thumbnail_exists=None,
        url_exists=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type agent_name_texts: dict(str: int) or None
        :type categories: dict(str: int) or None
        :type collection_hits: dict(str: int) or None
        :type institution_hits: dict(str: int) or None
        :type subject_term_texts: dict(str: int) or None
        :type thumbnail_exists: bool or None
        :type url_exists: bool or None
        :rtype: costume.api.services.object.object_facets.ObjectFacets
        '''

        if agent_name_texts is None:
            agent_name_texts = self.agent_name_texts
        if categories is None:
            categories = self.categories
        if collection_hits is None:
            collection_hits = self.collection_hits
        if institution_hits is None:
            institution_hits = self.institution_hits
        if subject_term_texts is None:
            subject_term_texts = self.subject_term_texts
        if thumbnail_exists is None:
            thumbnail_exists = self.thumbnail_exists
        if url_exists is None:
            url_exists = self.url_exists
        return self.__class__(agent_name_texts=agent_name_texts, categories=categories, collection_hits=collection_hits, institution_hits=institution_hits, subject_term_texts=subject_term_texts, thumbnail_exists=thumbnail_exists, url_exists=url_exists)

    @property
    def subject_term_texts(self):
        '''
        :rtype: dict(str: int)
        '''

        return self.__subject_term_texts.copy() if self.__subject_term_texts is not None else None

    @property
    def thumbnail_exists(self):
        '''
        :rtype: bool
        '''

        return self.__thumbnail_exists

    @property
    def url_exists(self):
        '''
        :rtype: bool
        '''

        return self.__url_exists

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.services.object.object_facets.ObjectFacets
        '''

        oprot.write_struct_begin('ObjectFacets')

        oprot.write_field_begin(name='agent_name_texts', type=13, id=None)
        oprot.write_map_begin(11, len(self.agent_name_texts), 8)
        for __key0, __value0 in self.agent_name_texts.iteritems():
            oprot.write_string(__key0)
            oprot.write_u32(__value0)
        oprot.write_map_end()
        oprot.write_field_end()

        oprot.write_field_begin(name='categories', type=13, id=None)
        oprot.write_map_begin(11, len(self.categories), 8)
        for __key0, __value0 in self.categories.iteritems():
            oprot.write_string(__key0)
            oprot.write_u32(__value0)
        oprot.write_map_end()
        oprot.write_field_end()

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

        oprot.write_field_begin(name='thumbnail_exists', type=2, id=None)
        oprot.write_bool(self.thumbnail_exists)
        oprot.write_field_end()

        oprot.write_field_begin(name='url_exists', type=2, id=None)
        oprot.write_bool(self.url_exists)
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
