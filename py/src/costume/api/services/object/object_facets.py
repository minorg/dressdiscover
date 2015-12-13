from itertools import ifilterfalse
import __builtin__
import costume.api.models.gender.gender


class ObjectFacets(object):
    class Builder(object):
        def __init__(
            self,
            agent_name_texts=None,
            categories=None,
            collection_hits=None,
            genders=None,
            institution_hits=None,
            subject_term_texts=None,
            url_exists=None,
            work_type_texts=None,
        ):
            '''
            :type agent_name_texts: dict(str: int)
            :type categories: dict(str: int)
            :type collection_hits: dict(str: int)
            :type genders: dict(costume.api.models.gender.gender.Gender: int)
            :type institution_hits: dict(str: int)
            :type subject_term_texts: dict(str: int)
            :type url_exists: bool
            :type work_type_texts: dict(str: int)
            '''

            self.__agent_name_texts = agent_name_texts
            self.__categories = categories
            self.__collection_hits = collection_hits
            self.__genders = genders
            self.__institution_hits = institution_hits
            self.__subject_term_texts = subject_term_texts
            self.__url_exists = url_exists
            self.__work_type_texts = work_type_texts

        def build(self):
            return ObjectFacets(agent_name_texts=self.__agent_name_texts, categories=self.__categories, collection_hits=self.__collection_hits, genders=self.__genders, institution_hits=self.__institution_hits, subject_term_texts=self.__subject_term_texts, url_exists=self.__url_exists, work_type_texts=self.__work_type_texts)

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
        def genders(self):
            '''
            :rtype: dict(costume.api.models.gender.gender.Gender: int)
            '''

            return self.__genders.copy() if self.__genders is not None else None

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

        def set_genders(self, genders):
            '''
            :type genders: dict(costume.api.models.gender.gender.Gender: int)
            '''

            self.__genders = genders
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

        def set_url_exists(self, url_exists):
            '''
            :type url_exists: bool
            '''

            self.__url_exists = url_exists
            return self

        def set_work_type_texts(self, work_type_texts):
            '''
            :type work_type_texts: dict(str: int)
            '''

            self.__work_type_texts = work_type_texts
            return self

        @property
        def subject_term_texts(self):
            '''
            :rtype: dict(str: int)
            '''

            return self.__subject_term_texts.copy() if self.__subject_term_texts is not None else None

        def update(self, object_facets):
            '''
            :type agent_name_texts: dict(str: int)
            :type categories: dict(str: int)
            :type collection_hits: dict(str: int)
            :type genders: dict(costume.api.models.gender.gender.Gender: int)
            :type institution_hits: dict(str: int)
            :type subject_term_texts: dict(str: int)
            :type url_exists: bool
            :type work_type_texts: dict(str: int)
            '''

            if isinstance(object_facets, ObjectFacets):
                self.set_agent_name_texts(object_facets.agent_name_texts)
                self.set_categories(object_facets.categories)
                self.set_collection_hits(object_facets.collection_hits)
                self.set_genders(object_facets.genders)
                self.set_institution_hits(object_facets.institution_hits)
                self.set_subject_term_texts(object_facets.subject_term_texts)
                self.set_url_exists(object_facets.url_exists)
                self.set_work_type_texts(object_facets.work_type_texts)
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

        @property
        def work_type_texts(self):
            '''
            :rtype: dict(str: int)
            '''

            return self.__work_type_texts.copy() if self.__work_type_texts is not None else None

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

        @genders.setter
        def genders(self, genders):
            '''
            :type genders: dict(costume.api.models.gender.gender.Gender: int)
            '''

            self.set_genders(genders)

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

        @url_exists.setter
        def url_exists(self, url_exists):
            '''
            :type url_exists: bool
            '''

            self.set_url_exists(url_exists)

        @work_type_texts.setter
        def work_type_texts(self, work_type_texts):
            '''
            :type work_type_texts: dict(str: int)
            '''

            self.set_work_type_texts(work_type_texts)

    def __init__(
        self,
        agent_name_texts,
        categories,
        collection_hits,
        genders,
        institution_hits,
        subject_term_texts,
        url_exists,
        work_type_texts,
    ):
        '''
        :type agent_name_texts: dict(str: int)
        :type categories: dict(str: int)
        :type collection_hits: dict(str: int)
        :type genders: dict(costume.api.models.gender.gender.Gender: int)
        :type institution_hits: dict(str: int)
        :type subject_term_texts: dict(str: int)
        :type url_exists: bool
        :type work_type_texts: dict(str: int)
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

        if genders is None:
            raise ValueError('genders is required')
        if not (isinstance(genders, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], costume.api.models.gender.gender.Gender) and isinstance(__item[1], (int, long)) and __item[1] >= 0, genders.iteritems()))) == 0):
            raise TypeError("expected genders to be a dict(costume.api.models.gender.gender.Gender: int) but it is a %s" % getattr(__builtin__, 'type')(genders))
        self.__genders = genders.copy() if genders is not None else None

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

        if url_exists is None:
            raise ValueError('url_exists is required')
        if not isinstance(url_exists, bool):
            raise TypeError("expected url_exists to be a bool but it is a %s" % getattr(__builtin__, 'type')(url_exists))
        self.__url_exists = url_exists

        if work_type_texts is None:
            raise ValueError('work_type_texts is required')
        if not (isinstance(work_type_texts, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], (int, long)) and __item[1] >= 0, work_type_texts.iteritems()))) == 0):
            raise TypeError("expected work_type_texts to be a dict(str: int) but it is a %s" % getattr(__builtin__, 'type')(work_type_texts))
        self.__work_type_texts = work_type_texts.copy() if work_type_texts is not None else None

    def __eq__(self, other):
        if self.agent_name_texts != other.agent_name_texts:
            return False
        if self.categories != other.categories:
            return False
        if self.collection_hits != other.collection_hits:
            return False
        if self.genders != other.genders:
            return False
        if self.institution_hits != other.institution_hits:
            return False
        if self.subject_term_texts != other.subject_term_texts:
            return False
        if self.url_exists != other.url_exists:
            return False
        if self.work_type_texts != other.work_type_texts:
            return False
        return True

    def __hash__(self):
        return hash((self.agent_name_texts,self.categories,self.collection_hits,self.genders,self.institution_hits,self.subject_term_texts,self.url_exists,self.work_type_texts,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('agent_name_texts=' + repr(self.agent_name_texts))
        field_reprs.append('categories=' + repr(self.categories))
        field_reprs.append('collection_hits=' + repr(self.collection_hits))
        field_reprs.append('genders=' + repr(self.genders))
        field_reprs.append('institution_hits=' + repr(self.institution_hits))
        field_reprs.append('subject_term_texts=' + repr(self.subject_term_texts))
        field_reprs.append('url_exists=' + repr(self.url_exists))
        field_reprs.append('work_type_texts=' + repr(self.work_type_texts))
        return 'ObjectFacets(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('agent_name_texts=' + repr(self.agent_name_texts))
        field_reprs.append('categories=' + repr(self.categories))
        field_reprs.append('collection_hits=' + repr(self.collection_hits))
        field_reprs.append('genders=' + repr(self.genders))
        field_reprs.append('institution_hits=' + repr(self.institution_hits))
        field_reprs.append('subject_term_texts=' + repr(self.subject_term_texts))
        field_reprs.append('url_exists=' + repr(self.url_exists))
        field_reprs.append('work_type_texts=' + repr(self.work_type_texts))
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

        return {'agent_name_texts': self.agent_name_texts, 'categories': self.categories, 'collection_hits': self.collection_hits, 'genders': self.genders, 'institution_hits': self.institution_hits, 'subject_term_texts': self.subject_term_texts, 'url_exists': self.url_exists, 'work_type_texts': self.work_type_texts}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.agent_name_texts, self.categories, self.collection_hits, self.genders, self.institution_hits, self.subject_term_texts, self.url_exists, self.work_type_texts,)

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
    def genders(self):
        '''
        :rtype: dict(costume.api.models.gender.gender.Gender: int)
        '''

        return self.__genders.copy() if self.__genders is not None else None

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
            elif ifield_name == 'genders':
                init_kwds['genders'] = dict([(costume.api.models.gender.gender.Gender.value_of(iprot.read_string().strip().upper()), iprot.read_u32()) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            elif ifield_name == 'institution_hits':
                init_kwds['institution_hits'] = dict([(iprot.read_string(), iprot.read_u32()) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            elif ifield_name == 'subject_term_texts':
                init_kwds['subject_term_texts'] = dict([(iprot.read_string(), iprot.read_u32()) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            elif ifield_name == 'url_exists':
                init_kwds['url_exists'] = iprot.read_bool()
            elif ifield_name == 'work_type_texts':
                init_kwds['work_type_texts'] = dict([(iprot.read_string(), iprot.read_u32()) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        agent_name_texts=None,
        categories=None,
        collection_hits=None,
        genders=None,
        institution_hits=None,
        subject_term_texts=None,
        url_exists=None,
        work_type_texts=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type agent_name_texts: dict(str: int) or None
        :type categories: dict(str: int) or None
        :type collection_hits: dict(str: int) or None
        :type genders: dict(costume.api.models.gender.gender.Gender: int) or None
        :type institution_hits: dict(str: int) or None
        :type subject_term_texts: dict(str: int) or None
        :type url_exists: bool or None
        :type work_type_texts: dict(str: int) or None
        :rtype: costume.api.services.object.object_facets.ObjectFacets
        '''

        if agent_name_texts is None:
            agent_name_texts = self.agent_name_texts
        if categories is None:
            categories = self.categories
        if collection_hits is None:
            collection_hits = self.collection_hits
        if genders is None:
            genders = self.genders
        if institution_hits is None:
            institution_hits = self.institution_hits
        if subject_term_texts is None:
            subject_term_texts = self.subject_term_texts
        if url_exists is None:
            url_exists = self.url_exists
        if work_type_texts is None:
            work_type_texts = self.work_type_texts
        return self.__class__(agent_name_texts=agent_name_texts, categories=categories, collection_hits=collection_hits, genders=genders, institution_hits=institution_hits, subject_term_texts=subject_term_texts, url_exists=url_exists, work_type_texts=work_type_texts)

    @property
    def subject_term_texts(self):
        '''
        :rtype: dict(str: int)
        '''

        return self.__subject_term_texts.copy() if self.__subject_term_texts is not None else None

    @property
    def url_exists(self):
        '''
        :rtype: bool
        '''

        return self.__url_exists

    @property
    def work_type_texts(self):
        '''
        :rtype: dict(str: int)
        '''

        return self.__work_type_texts.copy() if self.__work_type_texts is not None else None

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

        oprot.write_field_begin(name='genders', type=13, id=None)
        oprot.write_map_begin(11, len(self.genders), 8)
        for __key0, __value0 in self.genders.iteritems():
            oprot.write_string(str(__key0))
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

        oprot.write_field_begin(name='url_exists', type=2, id=None)
        oprot.write_bool(self.url_exists)
        oprot.write_field_end()

        oprot.write_field_begin(name='work_type_texts', type=13, id=None)
        oprot.write_map_begin(11, len(self.work_type_texts), 8)
        for __key0, __value0 in self.work_type_texts.iteritems():
            oprot.write_string(__key0)
            oprot.write_u32(__value0)
        oprot.write_map_end()
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
