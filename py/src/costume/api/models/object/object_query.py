from itertools import ifilterfalse
import __builtin__


class ObjectQuery(object):
    class Builder(object):
        def __init__(
            self,
            exclude_agent_name_texts=None,
            exclude_categories=None,
            exclude_collection_ids=None,
            exclude_institution_ids=None,
            exclude_subject_term_texts=None,
            include_agent_name_texts=None,
            include_categories=None,
            include_collection_ids=None,
            include_institution_ids=None,
            include_subject_term_texts=None,
            more_like_object_id=None,
            query_string=None,
        ):
            '''
            :type exclude_agent_name_texts: frozenset(str) or None
            :type exclude_categories: frozenset(str) or None
            :type exclude_collection_ids: frozenset(str) or None
            :type exclude_institution_ids: frozenset(str) or None
            :type exclude_subject_term_texts: frozenset(str) or None
            :type include_agent_name_texts: frozenset(str) or None
            :type include_categories: frozenset(str) or None
            :type include_collection_ids: frozenset(str) or None
            :type include_institution_ids: frozenset(str) or None
            :type include_subject_term_texts: frozenset(str) or None
            :type more_like_object_id: str or None
            :type query_string: str or None
            '''

            self.__exclude_agent_name_texts = exclude_agent_name_texts
            self.__exclude_categories = exclude_categories
            self.__exclude_collection_ids = exclude_collection_ids
            self.__exclude_institution_ids = exclude_institution_ids
            self.__exclude_subject_term_texts = exclude_subject_term_texts
            self.__include_agent_name_texts = include_agent_name_texts
            self.__include_categories = include_categories
            self.__include_collection_ids = include_collection_ids
            self.__include_institution_ids = include_institution_ids
            self.__include_subject_term_texts = include_subject_term_texts
            self.__more_like_object_id = more_like_object_id
            self.__query_string = query_string

        def build(self):
            return ObjectQuery(exclude_agent_name_texts=self.__exclude_agent_name_texts, exclude_categories=self.__exclude_categories, exclude_collection_ids=self.__exclude_collection_ids, exclude_institution_ids=self.__exclude_institution_ids, exclude_subject_term_texts=self.__exclude_subject_term_texts, include_agent_name_texts=self.__include_agent_name_texts, include_categories=self.__include_categories, include_collection_ids=self.__include_collection_ids, include_institution_ids=self.__include_institution_ids, include_subject_term_texts=self.__include_subject_term_texts, more_like_object_id=self.__more_like_object_id, query_string=self.__query_string)

        @property
        def exclude_agent_name_texts(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__exclude_agent_name_texts

        @property
        def exclude_categories(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__exclude_categories

        @property
        def exclude_collection_ids(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__exclude_collection_ids

        @property
        def exclude_institution_ids(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__exclude_institution_ids

        @property
        def exclude_subject_term_texts(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__exclude_subject_term_texts

        @property
        def include_agent_name_texts(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__include_agent_name_texts

        @property
        def include_categories(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__include_categories

        @property
        def include_collection_ids(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__include_collection_ids

        @property
        def include_institution_ids(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__include_institution_ids

        @property
        def include_subject_term_texts(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__include_subject_term_texts

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

        def set_exclude_agent_name_texts(self, exclude_agent_name_texts):
            '''
            :type exclude_agent_name_texts: frozenset(str) or None
            '''

            self.__exclude_agent_name_texts = exclude_agent_name_texts
            return self

        def set_exclude_categories(self, exclude_categories):
            '''
            :type exclude_categories: frozenset(str) or None
            '''

            self.__exclude_categories = exclude_categories
            return self

        def set_exclude_collection_ids(self, exclude_collection_ids):
            '''
            :type exclude_collection_ids: frozenset(str) or None
            '''

            self.__exclude_collection_ids = exclude_collection_ids
            return self

        def set_exclude_institution_ids(self, exclude_institution_ids):
            '''
            :type exclude_institution_ids: frozenset(str) or None
            '''

            self.__exclude_institution_ids = exclude_institution_ids
            return self

        def set_exclude_subject_term_texts(self, exclude_subject_term_texts):
            '''
            :type exclude_subject_term_texts: frozenset(str) or None
            '''

            self.__exclude_subject_term_texts = exclude_subject_term_texts
            return self

        def set_include_agent_name_texts(self, include_agent_name_texts):
            '''
            :type include_agent_name_texts: frozenset(str) or None
            '''

            self.__include_agent_name_texts = include_agent_name_texts
            return self

        def set_include_categories(self, include_categories):
            '''
            :type include_categories: frozenset(str) or None
            '''

            self.__include_categories = include_categories
            return self

        def set_include_collection_ids(self, include_collection_ids):
            '''
            :type include_collection_ids: frozenset(str) or None
            '''

            self.__include_collection_ids = include_collection_ids
            return self

        def set_include_institution_ids(self, include_institution_ids):
            '''
            :type include_institution_ids: frozenset(str) or None
            '''

            self.__include_institution_ids = include_institution_ids
            return self

        def set_include_subject_term_texts(self, include_subject_term_texts):
            '''
            :type include_subject_term_texts: frozenset(str) or None
            '''

            self.__include_subject_term_texts = include_subject_term_texts
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
            :type exclude_agent_name_texts: frozenset(str) or None
            :type exclude_categories: frozenset(str) or None
            :type exclude_collection_ids: frozenset(str) or None
            :type exclude_institution_ids: frozenset(str) or None
            :type exclude_subject_term_texts: frozenset(str) or None
            :type include_agent_name_texts: frozenset(str) or None
            :type include_categories: frozenset(str) or None
            :type include_collection_ids: frozenset(str) or None
            :type include_institution_ids: frozenset(str) or None
            :type include_subject_term_texts: frozenset(str) or None
            :type more_like_object_id: str or None
            :type query_string: str or None
            '''

            if isinstance(object_query, ObjectQuery):
                self.set_exclude_agent_name_texts(object_query.exclude_agent_name_texts)
                self.set_exclude_categories(object_query.exclude_categories)
                self.set_exclude_collection_ids(object_query.exclude_collection_ids)
                self.set_exclude_institution_ids(object_query.exclude_institution_ids)
                self.set_exclude_subject_term_texts(object_query.exclude_subject_term_texts)
                self.set_include_agent_name_texts(object_query.include_agent_name_texts)
                self.set_include_categories(object_query.include_categories)
                self.set_include_collection_ids(object_query.include_collection_ids)
                self.set_include_institution_ids(object_query.include_institution_ids)
                self.set_include_subject_term_texts(object_query.include_subject_term_texts)
                self.set_more_like_object_id(object_query.more_like_object_id)
                self.set_query_string(object_query.query_string)
            elif isinstance(object_query, dict):
                for key, value in object_query.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(object_query)
            return self

        @exclude_agent_name_texts.setter
        def exclude_agent_name_texts(self, exclude_agent_name_texts):
            '''
            :type exclude_agent_name_texts: frozenset(str) or None
            '''

            self.set_exclude_agent_name_texts(exclude_agent_name_texts)

        @exclude_categories.setter
        def exclude_categories(self, exclude_categories):
            '''
            :type exclude_categories: frozenset(str) or None
            '''

            self.set_exclude_categories(exclude_categories)

        @exclude_collection_ids.setter
        def exclude_collection_ids(self, exclude_collection_ids):
            '''
            :type exclude_collection_ids: frozenset(str) or None
            '''

            self.set_exclude_collection_ids(exclude_collection_ids)

        @exclude_institution_ids.setter
        def exclude_institution_ids(self, exclude_institution_ids):
            '''
            :type exclude_institution_ids: frozenset(str) or None
            '''

            self.set_exclude_institution_ids(exclude_institution_ids)

        @exclude_subject_term_texts.setter
        def exclude_subject_term_texts(self, exclude_subject_term_texts):
            '''
            :type exclude_subject_term_texts: frozenset(str) or None
            '''

            self.set_exclude_subject_term_texts(exclude_subject_term_texts)

        @include_agent_name_texts.setter
        def include_agent_name_texts(self, include_agent_name_texts):
            '''
            :type include_agent_name_texts: frozenset(str) or None
            '''

            self.set_include_agent_name_texts(include_agent_name_texts)

        @include_categories.setter
        def include_categories(self, include_categories):
            '''
            :type include_categories: frozenset(str) or None
            '''

            self.set_include_categories(include_categories)

        @include_collection_ids.setter
        def include_collection_ids(self, include_collection_ids):
            '''
            :type include_collection_ids: frozenset(str) or None
            '''

            self.set_include_collection_ids(include_collection_ids)

        @include_institution_ids.setter
        def include_institution_ids(self, include_institution_ids):
            '''
            :type include_institution_ids: frozenset(str) or None
            '''

            self.set_include_institution_ids(include_institution_ids)

        @include_subject_term_texts.setter
        def include_subject_term_texts(self, include_subject_term_texts):
            '''
            :type include_subject_term_texts: frozenset(str) or None
            '''

            self.set_include_subject_term_texts(include_subject_term_texts)

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
        exclude_agent_name_texts=None,
        exclude_categories=None,
        exclude_collection_ids=None,
        exclude_institution_ids=None,
        exclude_subject_term_texts=None,
        include_agent_name_texts=None,
        include_categories=None,
        include_collection_ids=None,
        include_institution_ids=None,
        include_subject_term_texts=None,
        more_like_object_id=None,
        query_string=None,
    ):
        '''
        :type exclude_agent_name_texts: frozenset(str) or None
        :type exclude_categories: frozenset(str) or None
        :type exclude_collection_ids: frozenset(str) or None
        :type exclude_institution_ids: frozenset(str) or None
        :type exclude_subject_term_texts: frozenset(str) or None
        :type include_agent_name_texts: frozenset(str) or None
        :type include_categories: frozenset(str) or None
        :type include_collection_ids: frozenset(str) or None
        :type include_institution_ids: frozenset(str) or None
        :type include_subject_term_texts: frozenset(str) or None
        :type more_like_object_id: str or None
        :type query_string: str or None
        '''

        if exclude_agent_name_texts is not None:
            if not (isinstance(exclude_agent_name_texts, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), exclude_agent_name_texts))) == 0):
                raise TypeError("expected exclude_agent_name_texts to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(exclude_agent_name_texts))
            if len(exclude_agent_name_texts) < 1:
                raise ValueError("expected len(exclude_agent_name_texts) to be >= 1, was %d" % len(exclude_agent_name_texts))
        self.__exclude_agent_name_texts = exclude_agent_name_texts

        if exclude_categories is not None:
            if not (isinstance(exclude_categories, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), exclude_categories))) == 0):
                raise TypeError("expected exclude_categories to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(exclude_categories))
            if len(exclude_categories) < 1:
                raise ValueError("expected len(exclude_categories) to be >= 1, was %d" % len(exclude_categories))
        self.__exclude_categories = exclude_categories

        if exclude_collection_ids is not None:
            if not (isinstance(exclude_collection_ids, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), exclude_collection_ids))) == 0):
                raise TypeError("expected exclude_collection_ids to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(exclude_collection_ids))
            if len(exclude_collection_ids) < 1:
                raise ValueError("expected len(exclude_collection_ids) to be >= 1, was %d" % len(exclude_collection_ids))
        self.__exclude_collection_ids = exclude_collection_ids

        if exclude_institution_ids is not None:
            if not (isinstance(exclude_institution_ids, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), exclude_institution_ids))) == 0):
                raise TypeError("expected exclude_institution_ids to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(exclude_institution_ids))
            if len(exclude_institution_ids) < 1:
                raise ValueError("expected len(exclude_institution_ids) to be >= 1, was %d" % len(exclude_institution_ids))
        self.__exclude_institution_ids = exclude_institution_ids

        if exclude_subject_term_texts is not None:
            if not (isinstance(exclude_subject_term_texts, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), exclude_subject_term_texts))) == 0):
                raise TypeError("expected exclude_subject_term_texts to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(exclude_subject_term_texts))
            if len(exclude_subject_term_texts) < 1:
                raise ValueError("expected len(exclude_subject_term_texts) to be >= 1, was %d" % len(exclude_subject_term_texts))
        self.__exclude_subject_term_texts = exclude_subject_term_texts

        if include_agent_name_texts is not None:
            if not (isinstance(include_agent_name_texts, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), include_agent_name_texts))) == 0):
                raise TypeError("expected include_agent_name_texts to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(include_agent_name_texts))
            if len(include_agent_name_texts) < 1:
                raise ValueError("expected len(include_agent_name_texts) to be >= 1, was %d" % len(include_agent_name_texts))
        self.__include_agent_name_texts = include_agent_name_texts

        if include_categories is not None:
            if not (isinstance(include_categories, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), include_categories))) == 0):
                raise TypeError("expected include_categories to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(include_categories))
            if len(include_categories) < 1:
                raise ValueError("expected len(include_categories) to be >= 1, was %d" % len(include_categories))
        self.__include_categories = include_categories

        if include_collection_ids is not None:
            if not (isinstance(include_collection_ids, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), include_collection_ids))) == 0):
                raise TypeError("expected include_collection_ids to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(include_collection_ids))
            if len(include_collection_ids) < 1:
                raise ValueError("expected len(include_collection_ids) to be >= 1, was %d" % len(include_collection_ids))
        self.__include_collection_ids = include_collection_ids

        if include_institution_ids is not None:
            if not (isinstance(include_institution_ids, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), include_institution_ids))) == 0):
                raise TypeError("expected include_institution_ids to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(include_institution_ids))
            if len(include_institution_ids) < 1:
                raise ValueError("expected len(include_institution_ids) to be >= 1, was %d" % len(include_institution_ids))
        self.__include_institution_ids = include_institution_ids

        if include_subject_term_texts is not None:
            if not (isinstance(include_subject_term_texts, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), include_subject_term_texts))) == 0):
                raise TypeError("expected include_subject_term_texts to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(include_subject_term_texts))
            if len(include_subject_term_texts) < 1:
                raise ValueError("expected len(include_subject_term_texts) to be >= 1, was %d" % len(include_subject_term_texts))
        self.__include_subject_term_texts = include_subject_term_texts

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
        if self.exclude_agent_name_texts != other.exclude_agent_name_texts:
            return False
        if self.exclude_categories != other.exclude_categories:
            return False
        if self.exclude_collection_ids != other.exclude_collection_ids:
            return False
        if self.exclude_institution_ids != other.exclude_institution_ids:
            return False
        if self.exclude_subject_term_texts != other.exclude_subject_term_texts:
            return False
        if self.include_agent_name_texts != other.include_agent_name_texts:
            return False
        if self.include_categories != other.include_categories:
            return False
        if self.include_collection_ids != other.include_collection_ids:
            return False
        if self.include_institution_ids != other.include_institution_ids:
            return False
        if self.include_subject_term_texts != other.include_subject_term_texts:
            return False
        if self.more_like_object_id != other.more_like_object_id:
            return False
        if self.query_string != other.query_string:
            return False
        return True

    def __hash__(self):
        return hash((self.exclude_agent_name_texts,self.exclude_categories,self.exclude_collection_ids,self.exclude_institution_ids,self.exclude_subject_term_texts,self.include_agent_name_texts,self.include_categories,self.include_collection_ids,self.include_institution_ids,self.include_subject_term_texts,self.more_like_object_id,self.query_string,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.exclude_agent_name_texts is not None:
            field_reprs.append('exclude_agent_name_texts=' + repr(self.exclude_agent_name_texts))
        if self.exclude_categories is not None:
            field_reprs.append('exclude_categories=' + repr(self.exclude_categories))
        if self.exclude_collection_ids is not None:
            field_reprs.append('exclude_collection_ids=' + repr(self.exclude_collection_ids))
        if self.exclude_institution_ids is not None:
            field_reprs.append('exclude_institution_ids=' + repr(self.exclude_institution_ids))
        if self.exclude_subject_term_texts is not None:
            field_reprs.append('exclude_subject_term_texts=' + repr(self.exclude_subject_term_texts))
        if self.include_agent_name_texts is not None:
            field_reprs.append('include_agent_name_texts=' + repr(self.include_agent_name_texts))
        if self.include_categories is not None:
            field_reprs.append('include_categories=' + repr(self.include_categories))
        if self.include_collection_ids is not None:
            field_reprs.append('include_collection_ids=' + repr(self.include_collection_ids))
        if self.include_institution_ids is not None:
            field_reprs.append('include_institution_ids=' + repr(self.include_institution_ids))
        if self.include_subject_term_texts is not None:
            field_reprs.append('include_subject_term_texts=' + repr(self.include_subject_term_texts))
        if self.more_like_object_id is not None:
            field_reprs.append('more_like_object_id=' + "'" + self.more_like_object_id.encode('ascii', 'replace') + "'")
        if self.query_string is not None:
            field_reprs.append('query_string=' + "'" + self.query_string.encode('ascii', 'replace') + "'")
        return 'ObjectQuery(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.exclude_agent_name_texts is not None:
            field_reprs.append('exclude_agent_name_texts=' + repr(self.exclude_agent_name_texts))
        if self.exclude_categories is not None:
            field_reprs.append('exclude_categories=' + repr(self.exclude_categories))
        if self.exclude_collection_ids is not None:
            field_reprs.append('exclude_collection_ids=' + repr(self.exclude_collection_ids))
        if self.exclude_institution_ids is not None:
            field_reprs.append('exclude_institution_ids=' + repr(self.exclude_institution_ids))
        if self.exclude_subject_term_texts is not None:
            field_reprs.append('exclude_subject_term_texts=' + repr(self.exclude_subject_term_texts))
        if self.include_agent_name_texts is not None:
            field_reprs.append('include_agent_name_texts=' + repr(self.include_agent_name_texts))
        if self.include_categories is not None:
            field_reprs.append('include_categories=' + repr(self.include_categories))
        if self.include_collection_ids is not None:
            field_reprs.append('include_collection_ids=' + repr(self.include_collection_ids))
        if self.include_institution_ids is not None:
            field_reprs.append('include_institution_ids=' + repr(self.include_institution_ids))
        if self.include_subject_term_texts is not None:
            field_reprs.append('include_subject_term_texts=' + repr(self.include_subject_term_texts))
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

        return {'exclude_agent_name_texts': self.exclude_agent_name_texts, 'exclude_categories': self.exclude_categories, 'exclude_collection_ids': self.exclude_collection_ids, 'exclude_institution_ids': self.exclude_institution_ids, 'exclude_subject_term_texts': self.exclude_subject_term_texts, 'include_agent_name_texts': self.include_agent_name_texts, 'include_categories': self.include_categories, 'include_collection_ids': self.include_collection_ids, 'include_institution_ids': self.include_institution_ids, 'include_subject_term_texts': self.include_subject_term_texts, 'more_like_object_id': self.more_like_object_id, 'query_string': self.query_string}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.exclude_agent_name_texts, self.exclude_categories, self.exclude_collection_ids, self.exclude_institution_ids, self.exclude_subject_term_texts, self.include_agent_name_texts, self.include_categories, self.include_collection_ids, self.include_institution_ids, self.include_subject_term_texts, self.more_like_object_id, self.query_string,)

    @property
    def exclude_agent_name_texts(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__exclude_agent_name_texts

    @property
    def exclude_categories(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__exclude_categories

    @property
    def exclude_collection_ids(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__exclude_collection_ids

    @property
    def exclude_institution_ids(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__exclude_institution_ids

    @property
    def exclude_subject_term_texts(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__exclude_subject_term_texts

    @property
    def include_agent_name_texts(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__include_agent_name_texts

    @property
    def include_categories(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__include_categories

    @property
    def include_collection_ids(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__include_collection_ids

    @property
    def include_institution_ids(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__include_institution_ids

    @property
    def include_subject_term_texts(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__include_subject_term_texts

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
            elif ifield_name == 'exclude_agent_name_texts':
                init_kwds['exclude_agent_name_texts'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'exclude_categories':
                init_kwds['exclude_categories'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'exclude_collection_ids':
                init_kwds['exclude_collection_ids'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'exclude_institution_ids':
                init_kwds['exclude_institution_ids'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'exclude_subject_term_texts':
                init_kwds['exclude_subject_term_texts'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'include_agent_name_texts':
                init_kwds['include_agent_name_texts'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'include_categories':
                init_kwds['include_categories'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'include_collection_ids':
                init_kwds['include_collection_ids'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'include_institution_ids':
                init_kwds['include_institution_ids'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'include_subject_term_texts':
                init_kwds['include_subject_term_texts'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
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
        exclude_agent_name_texts=None,
        exclude_categories=None,
        exclude_collection_ids=None,
        exclude_institution_ids=None,
        exclude_subject_term_texts=None,
        include_agent_name_texts=None,
        include_categories=None,
        include_collection_ids=None,
        include_institution_ids=None,
        include_subject_term_texts=None,
        more_like_object_id=None,
        query_string=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type exclude_agent_name_texts: frozenset(str) or None
        :type exclude_categories: frozenset(str) or None
        :type exclude_collection_ids: frozenset(str) or None
        :type exclude_institution_ids: frozenset(str) or None
        :type exclude_subject_term_texts: frozenset(str) or None
        :type include_agent_name_texts: frozenset(str) or None
        :type include_categories: frozenset(str) or None
        :type include_collection_ids: frozenset(str) or None
        :type include_institution_ids: frozenset(str) or None
        :type include_subject_term_texts: frozenset(str) or None
        :type more_like_object_id: str or None
        :type query_string: str or None
        :rtype: costume.api.models.object.object_query.ObjectQuery
        '''

        if exclude_agent_name_texts is None:
            exclude_agent_name_texts = self.exclude_agent_name_texts
        if exclude_categories is None:
            exclude_categories = self.exclude_categories
        if exclude_collection_ids is None:
            exclude_collection_ids = self.exclude_collection_ids
        if exclude_institution_ids is None:
            exclude_institution_ids = self.exclude_institution_ids
        if exclude_subject_term_texts is None:
            exclude_subject_term_texts = self.exclude_subject_term_texts
        if include_agent_name_texts is None:
            include_agent_name_texts = self.include_agent_name_texts
        if include_categories is None:
            include_categories = self.include_categories
        if include_collection_ids is None:
            include_collection_ids = self.include_collection_ids
        if include_institution_ids is None:
            include_institution_ids = self.include_institution_ids
        if include_subject_term_texts is None:
            include_subject_term_texts = self.include_subject_term_texts
        if more_like_object_id is None:
            more_like_object_id = self.more_like_object_id
        if query_string is None:
            query_string = self.query_string
        return self.__class__(exclude_agent_name_texts=exclude_agent_name_texts, exclude_categories=exclude_categories, exclude_collection_ids=exclude_collection_ids, exclude_institution_ids=exclude_institution_ids, exclude_subject_term_texts=exclude_subject_term_texts, include_agent_name_texts=include_agent_name_texts, include_categories=include_categories, include_collection_ids=include_collection_ids, include_institution_ids=include_institution_ids, include_subject_term_texts=include_subject_term_texts, more_like_object_id=more_like_object_id, query_string=query_string)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.models.object.object_query.ObjectQuery
        '''

        oprot.write_struct_begin('ObjectQuery')

        if self.exclude_agent_name_texts is not None:
            oprot.write_field_begin(name='exclude_agent_name_texts', type=14, id=None)
            oprot.write_set_begin(11, len(self.exclude_agent_name_texts))
            for _0 in self.exclude_agent_name_texts:
                oprot.write_string(_0)
            oprot.write_set_end()
            oprot.write_field_end()

        if self.exclude_categories is not None:
            oprot.write_field_begin(name='exclude_categories', type=14, id=None)
            oprot.write_set_begin(11, len(self.exclude_categories))
            for _0 in self.exclude_categories:
                oprot.write_string(_0)
            oprot.write_set_end()
            oprot.write_field_end()

        if self.exclude_collection_ids is not None:
            oprot.write_field_begin(name='exclude_collection_ids', type=14, id=None)
            oprot.write_set_begin(11, len(self.exclude_collection_ids))
            for _0 in self.exclude_collection_ids:
                oprot.write_string(_0)
            oprot.write_set_end()
            oprot.write_field_end()

        if self.exclude_institution_ids is not None:
            oprot.write_field_begin(name='exclude_institution_ids', type=14, id=None)
            oprot.write_set_begin(11, len(self.exclude_institution_ids))
            for _0 in self.exclude_institution_ids:
                oprot.write_string(_0)
            oprot.write_set_end()
            oprot.write_field_end()

        if self.exclude_subject_term_texts is not None:
            oprot.write_field_begin(name='exclude_subject_term_texts', type=14, id=None)
            oprot.write_set_begin(11, len(self.exclude_subject_term_texts))
            for _0 in self.exclude_subject_term_texts:
                oprot.write_string(_0)
            oprot.write_set_end()
            oprot.write_field_end()

        if self.include_agent_name_texts is not None:
            oprot.write_field_begin(name='include_agent_name_texts', type=14, id=None)
            oprot.write_set_begin(11, len(self.include_agent_name_texts))
            for _0 in self.include_agent_name_texts:
                oprot.write_string(_0)
            oprot.write_set_end()
            oprot.write_field_end()

        if self.include_categories is not None:
            oprot.write_field_begin(name='include_categories', type=14, id=None)
            oprot.write_set_begin(11, len(self.include_categories))
            for _0 in self.include_categories:
                oprot.write_string(_0)
            oprot.write_set_end()
            oprot.write_field_end()

        if self.include_collection_ids is not None:
            oprot.write_field_begin(name='include_collection_ids', type=14, id=None)
            oprot.write_set_begin(11, len(self.include_collection_ids))
            for _0 in self.include_collection_ids:
                oprot.write_string(_0)
            oprot.write_set_end()
            oprot.write_field_end()

        if self.include_institution_ids is not None:
            oprot.write_field_begin(name='include_institution_ids', type=14, id=None)
            oprot.write_set_begin(11, len(self.include_institution_ids))
            for _0 in self.include_institution_ids:
                oprot.write_string(_0)
            oprot.write_set_end()
            oprot.write_field_end()

        if self.include_subject_term_texts is not None:
            oprot.write_field_begin(name='include_subject_term_texts', type=14, id=None)
            oprot.write_set_begin(11, len(self.include_subject_term_texts))
            for _0 in self.include_subject_term_texts:
                oprot.write_string(_0)
            oprot.write_set_end()
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
