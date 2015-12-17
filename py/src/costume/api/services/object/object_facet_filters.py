from itertools import ifilterfalse
import __builtin__
import costume.api.models.gender.gender


class ObjectFacetFilters(object):
    class Builder(object):
        def __init__(
            self,
            exclude_agent_name_texts=None,
            exclude_categories=None,
            exclude_collection_ids=None,
            exclude_genders=None,
            exclude_institution_ids=None,
            exclude_material_texts=None,
            exclude_subject_term_texts=None,
            exclude_work_type_texts=None,
            include_agent_name_texts=None,
            include_categories=None,
            include_collection_ids=None,
            include_genders=None,
            include_institution_ids=None,
            include_material_texts=None,
            include_subject_term_texts=None,
            include_work_type_texts=None,
        ):
            '''
            :type exclude_agent_name_texts: frozenset(str) or None
            :type exclude_categories: frozenset(str) or None
            :type exclude_collection_ids: frozenset(str) or None
            :type exclude_genders: frozenset(costume.api.models.gender.gender.Gender) or None
            :type exclude_institution_ids: frozenset(str) or None
            :type exclude_material_texts: frozenset(str) or None
            :type exclude_subject_term_texts: frozenset(str) or None
            :type exclude_work_type_texts: frozenset(str) or None
            :type include_agent_name_texts: frozenset(str) or None
            :type include_categories: frozenset(str) or None
            :type include_collection_ids: frozenset(str) or None
            :type include_genders: frozenset(costume.api.models.gender.gender.Gender) or None
            :type include_institution_ids: frozenset(str) or None
            :type include_material_texts: frozenset(str) or None
            :type include_subject_term_texts: frozenset(str) or None
            :type include_work_type_texts: frozenset(str) or None
            '''

            self.__exclude_agent_name_texts = exclude_agent_name_texts
            self.__exclude_categories = exclude_categories
            self.__exclude_collection_ids = exclude_collection_ids
            self.__exclude_genders = exclude_genders
            self.__exclude_institution_ids = exclude_institution_ids
            self.__exclude_material_texts = exclude_material_texts
            self.__exclude_subject_term_texts = exclude_subject_term_texts
            self.__exclude_work_type_texts = exclude_work_type_texts
            self.__include_agent_name_texts = include_agent_name_texts
            self.__include_categories = include_categories
            self.__include_collection_ids = include_collection_ids
            self.__include_genders = include_genders
            self.__include_institution_ids = include_institution_ids
            self.__include_material_texts = include_material_texts
            self.__include_subject_term_texts = include_subject_term_texts
            self.__include_work_type_texts = include_work_type_texts

        def build(self):
            return ObjectFacetFilters(exclude_agent_name_texts=self.__exclude_agent_name_texts, exclude_categories=self.__exclude_categories, exclude_collection_ids=self.__exclude_collection_ids, exclude_genders=self.__exclude_genders, exclude_institution_ids=self.__exclude_institution_ids, exclude_material_texts=self.__exclude_material_texts, exclude_subject_term_texts=self.__exclude_subject_term_texts, exclude_work_type_texts=self.__exclude_work_type_texts, include_agent_name_texts=self.__include_agent_name_texts, include_categories=self.__include_categories, include_collection_ids=self.__include_collection_ids, include_genders=self.__include_genders, include_institution_ids=self.__include_institution_ids, include_material_texts=self.__include_material_texts, include_subject_term_texts=self.__include_subject_term_texts, include_work_type_texts=self.__include_work_type_texts)

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
        def exclude_genders(self):
            '''
            :rtype: frozenset(costume.api.models.gender.gender.Gender)
            '''

            return self.__exclude_genders

        @property
        def exclude_institution_ids(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__exclude_institution_ids

        @property
        def exclude_material_texts(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__exclude_material_texts

        @property
        def exclude_subject_term_texts(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__exclude_subject_term_texts

        @property
        def exclude_work_type_texts(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__exclude_work_type_texts

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
        def include_genders(self):
            '''
            :rtype: frozenset(costume.api.models.gender.gender.Gender)
            '''

            return self.__include_genders

        @property
        def include_institution_ids(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__include_institution_ids

        @property
        def include_material_texts(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__include_material_texts

        @property
        def include_subject_term_texts(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__include_subject_term_texts

        @property
        def include_work_type_texts(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__include_work_type_texts

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

        def set_exclude_genders(self, exclude_genders):
            '''
            :type exclude_genders: frozenset(costume.api.models.gender.gender.Gender) or None
            '''

            self.__exclude_genders = exclude_genders
            return self

        def set_exclude_institution_ids(self, exclude_institution_ids):
            '''
            :type exclude_institution_ids: frozenset(str) or None
            '''

            self.__exclude_institution_ids = exclude_institution_ids
            return self

        def set_exclude_material_texts(self, exclude_material_texts):
            '''
            :type exclude_material_texts: frozenset(str) or None
            '''

            self.__exclude_material_texts = exclude_material_texts
            return self

        def set_exclude_subject_term_texts(self, exclude_subject_term_texts):
            '''
            :type exclude_subject_term_texts: frozenset(str) or None
            '''

            self.__exclude_subject_term_texts = exclude_subject_term_texts
            return self

        def set_exclude_work_type_texts(self, exclude_work_type_texts):
            '''
            :type exclude_work_type_texts: frozenset(str) or None
            '''

            self.__exclude_work_type_texts = exclude_work_type_texts
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

        def set_include_genders(self, include_genders):
            '''
            :type include_genders: frozenset(costume.api.models.gender.gender.Gender) or None
            '''

            self.__include_genders = include_genders
            return self

        def set_include_institution_ids(self, include_institution_ids):
            '''
            :type include_institution_ids: frozenset(str) or None
            '''

            self.__include_institution_ids = include_institution_ids
            return self

        def set_include_material_texts(self, include_material_texts):
            '''
            :type include_material_texts: frozenset(str) or None
            '''

            self.__include_material_texts = include_material_texts
            return self

        def set_include_subject_term_texts(self, include_subject_term_texts):
            '''
            :type include_subject_term_texts: frozenset(str) or None
            '''

            self.__include_subject_term_texts = include_subject_term_texts
            return self

        def set_include_work_type_texts(self, include_work_type_texts):
            '''
            :type include_work_type_texts: frozenset(str) or None
            '''

            self.__include_work_type_texts = include_work_type_texts
            return self

        def update(self, object_facet_filters):
            '''
            :type exclude_agent_name_texts: frozenset(str) or None
            :type exclude_categories: frozenset(str) or None
            :type exclude_collection_ids: frozenset(str) or None
            :type exclude_genders: frozenset(costume.api.models.gender.gender.Gender) or None
            :type exclude_institution_ids: frozenset(str) or None
            :type exclude_material_texts: frozenset(str) or None
            :type exclude_subject_term_texts: frozenset(str) or None
            :type exclude_work_type_texts: frozenset(str) or None
            :type include_agent_name_texts: frozenset(str) or None
            :type include_categories: frozenset(str) or None
            :type include_collection_ids: frozenset(str) or None
            :type include_genders: frozenset(costume.api.models.gender.gender.Gender) or None
            :type include_institution_ids: frozenset(str) or None
            :type include_material_texts: frozenset(str) or None
            :type include_subject_term_texts: frozenset(str) or None
            :type include_work_type_texts: frozenset(str) or None
            '''

            if isinstance(object_facet_filters, ObjectFacetFilters):
                self.set_exclude_agent_name_texts(object_facet_filters.exclude_agent_name_texts)
                self.set_exclude_categories(object_facet_filters.exclude_categories)
                self.set_exclude_collection_ids(object_facet_filters.exclude_collection_ids)
                self.set_exclude_genders(object_facet_filters.exclude_genders)
                self.set_exclude_institution_ids(object_facet_filters.exclude_institution_ids)
                self.set_exclude_material_texts(object_facet_filters.exclude_material_texts)
                self.set_exclude_subject_term_texts(object_facet_filters.exclude_subject_term_texts)
                self.set_exclude_work_type_texts(object_facet_filters.exclude_work_type_texts)
                self.set_include_agent_name_texts(object_facet_filters.include_agent_name_texts)
                self.set_include_categories(object_facet_filters.include_categories)
                self.set_include_collection_ids(object_facet_filters.include_collection_ids)
                self.set_include_genders(object_facet_filters.include_genders)
                self.set_include_institution_ids(object_facet_filters.include_institution_ids)
                self.set_include_material_texts(object_facet_filters.include_material_texts)
                self.set_include_subject_term_texts(object_facet_filters.include_subject_term_texts)
                self.set_include_work_type_texts(object_facet_filters.include_work_type_texts)
            elif isinstance(object_facet_filters, dict):
                for key, value in object_facet_filters.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(object_facet_filters)
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

        @exclude_genders.setter
        def exclude_genders(self, exclude_genders):
            '''
            :type exclude_genders: frozenset(costume.api.models.gender.gender.Gender) or None
            '''

            self.set_exclude_genders(exclude_genders)

        @exclude_institution_ids.setter
        def exclude_institution_ids(self, exclude_institution_ids):
            '''
            :type exclude_institution_ids: frozenset(str) or None
            '''

            self.set_exclude_institution_ids(exclude_institution_ids)

        @exclude_material_texts.setter
        def exclude_material_texts(self, exclude_material_texts):
            '''
            :type exclude_material_texts: frozenset(str) or None
            '''

            self.set_exclude_material_texts(exclude_material_texts)

        @exclude_subject_term_texts.setter
        def exclude_subject_term_texts(self, exclude_subject_term_texts):
            '''
            :type exclude_subject_term_texts: frozenset(str) or None
            '''

            self.set_exclude_subject_term_texts(exclude_subject_term_texts)

        @exclude_work_type_texts.setter
        def exclude_work_type_texts(self, exclude_work_type_texts):
            '''
            :type exclude_work_type_texts: frozenset(str) or None
            '''

            self.set_exclude_work_type_texts(exclude_work_type_texts)

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

        @include_genders.setter
        def include_genders(self, include_genders):
            '''
            :type include_genders: frozenset(costume.api.models.gender.gender.Gender) or None
            '''

            self.set_include_genders(include_genders)

        @include_institution_ids.setter
        def include_institution_ids(self, include_institution_ids):
            '''
            :type include_institution_ids: frozenset(str) or None
            '''

            self.set_include_institution_ids(include_institution_ids)

        @include_material_texts.setter
        def include_material_texts(self, include_material_texts):
            '''
            :type include_material_texts: frozenset(str) or None
            '''

            self.set_include_material_texts(include_material_texts)

        @include_subject_term_texts.setter
        def include_subject_term_texts(self, include_subject_term_texts):
            '''
            :type include_subject_term_texts: frozenset(str) or None
            '''

            self.set_include_subject_term_texts(include_subject_term_texts)

        @include_work_type_texts.setter
        def include_work_type_texts(self, include_work_type_texts):
            '''
            :type include_work_type_texts: frozenset(str) or None
            '''

            self.set_include_work_type_texts(include_work_type_texts)

    def __init__(
        self,
        exclude_agent_name_texts=None,
        exclude_categories=None,
        exclude_collection_ids=None,
        exclude_genders=None,
        exclude_institution_ids=None,
        exclude_material_texts=None,
        exclude_subject_term_texts=None,
        exclude_work_type_texts=None,
        include_agent_name_texts=None,
        include_categories=None,
        include_collection_ids=None,
        include_genders=None,
        include_institution_ids=None,
        include_material_texts=None,
        include_subject_term_texts=None,
        include_work_type_texts=None,
    ):
        '''
        :type exclude_agent_name_texts: frozenset(str) or None
        :type exclude_categories: frozenset(str) or None
        :type exclude_collection_ids: frozenset(str) or None
        :type exclude_genders: frozenset(costume.api.models.gender.gender.Gender) or None
        :type exclude_institution_ids: frozenset(str) or None
        :type exclude_material_texts: frozenset(str) or None
        :type exclude_subject_term_texts: frozenset(str) or None
        :type exclude_work_type_texts: frozenset(str) or None
        :type include_agent_name_texts: frozenset(str) or None
        :type include_categories: frozenset(str) or None
        :type include_collection_ids: frozenset(str) or None
        :type include_genders: frozenset(costume.api.models.gender.gender.Gender) or None
        :type include_institution_ids: frozenset(str) or None
        :type include_material_texts: frozenset(str) or None
        :type include_subject_term_texts: frozenset(str) or None
        :type include_work_type_texts: frozenset(str) or None
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

        if exclude_genders is not None:
            if not (isinstance(exclude_genders, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, costume.api.models.gender.gender.Gender), exclude_genders))) == 0):
                raise TypeError("expected exclude_genders to be a frozenset(costume.api.models.gender.gender.Gender) but it is a %s" % getattr(__builtin__, 'type')(exclude_genders))
            if len(exclude_genders) < 1:
                raise ValueError("expected len(exclude_genders) to be >= 1, was %d" % len(exclude_genders))
        self.__exclude_genders = exclude_genders

        if exclude_institution_ids is not None:
            if not (isinstance(exclude_institution_ids, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), exclude_institution_ids))) == 0):
                raise TypeError("expected exclude_institution_ids to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(exclude_institution_ids))
            if len(exclude_institution_ids) < 1:
                raise ValueError("expected len(exclude_institution_ids) to be >= 1, was %d" % len(exclude_institution_ids))
        self.__exclude_institution_ids = exclude_institution_ids

        if exclude_material_texts is not None:
            if not (isinstance(exclude_material_texts, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), exclude_material_texts))) == 0):
                raise TypeError("expected exclude_material_texts to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(exclude_material_texts))
            if len(exclude_material_texts) < 1:
                raise ValueError("expected len(exclude_material_texts) to be >= 1, was %d" % len(exclude_material_texts))
        self.__exclude_material_texts = exclude_material_texts

        if exclude_subject_term_texts is not None:
            if not (isinstance(exclude_subject_term_texts, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), exclude_subject_term_texts))) == 0):
                raise TypeError("expected exclude_subject_term_texts to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(exclude_subject_term_texts))
            if len(exclude_subject_term_texts) < 1:
                raise ValueError("expected len(exclude_subject_term_texts) to be >= 1, was %d" % len(exclude_subject_term_texts))
        self.__exclude_subject_term_texts = exclude_subject_term_texts

        if exclude_work_type_texts is not None:
            if not (isinstance(exclude_work_type_texts, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), exclude_work_type_texts))) == 0):
                raise TypeError("expected exclude_work_type_texts to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(exclude_work_type_texts))
            if len(exclude_work_type_texts) < 1:
                raise ValueError("expected len(exclude_work_type_texts) to be >= 1, was %d" % len(exclude_work_type_texts))
        self.__exclude_work_type_texts = exclude_work_type_texts

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

        if include_genders is not None:
            if not (isinstance(include_genders, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, costume.api.models.gender.gender.Gender), include_genders))) == 0):
                raise TypeError("expected include_genders to be a frozenset(costume.api.models.gender.gender.Gender) but it is a %s" % getattr(__builtin__, 'type')(include_genders))
            if len(include_genders) < 1:
                raise ValueError("expected len(include_genders) to be >= 1, was %d" % len(include_genders))
        self.__include_genders = include_genders

        if include_institution_ids is not None:
            if not (isinstance(include_institution_ids, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), include_institution_ids))) == 0):
                raise TypeError("expected include_institution_ids to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(include_institution_ids))
            if len(include_institution_ids) < 1:
                raise ValueError("expected len(include_institution_ids) to be >= 1, was %d" % len(include_institution_ids))
        self.__include_institution_ids = include_institution_ids

        if include_material_texts is not None:
            if not (isinstance(include_material_texts, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), include_material_texts))) == 0):
                raise TypeError("expected include_material_texts to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(include_material_texts))
            if len(include_material_texts) < 1:
                raise ValueError("expected len(include_material_texts) to be >= 1, was %d" % len(include_material_texts))
        self.__include_material_texts = include_material_texts

        if include_subject_term_texts is not None:
            if not (isinstance(include_subject_term_texts, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), include_subject_term_texts))) == 0):
                raise TypeError("expected include_subject_term_texts to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(include_subject_term_texts))
            if len(include_subject_term_texts) < 1:
                raise ValueError("expected len(include_subject_term_texts) to be >= 1, was %d" % len(include_subject_term_texts))
        self.__include_subject_term_texts = include_subject_term_texts

        if include_work_type_texts is not None:
            if not (isinstance(include_work_type_texts, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), include_work_type_texts))) == 0):
                raise TypeError("expected include_work_type_texts to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(include_work_type_texts))
            if len(include_work_type_texts) < 1:
                raise ValueError("expected len(include_work_type_texts) to be >= 1, was %d" % len(include_work_type_texts))
        self.__include_work_type_texts = include_work_type_texts

    def __eq__(self, other):
        if self.exclude_agent_name_texts != other.exclude_agent_name_texts:
            return False
        if self.exclude_categories != other.exclude_categories:
            return False
        if self.exclude_collection_ids != other.exclude_collection_ids:
            return False
        if self.exclude_genders != other.exclude_genders:
            return False
        if self.exclude_institution_ids != other.exclude_institution_ids:
            return False
        if self.exclude_material_texts != other.exclude_material_texts:
            return False
        if self.exclude_subject_term_texts != other.exclude_subject_term_texts:
            return False
        if self.exclude_work_type_texts != other.exclude_work_type_texts:
            return False
        if self.include_agent_name_texts != other.include_agent_name_texts:
            return False
        if self.include_categories != other.include_categories:
            return False
        if self.include_collection_ids != other.include_collection_ids:
            return False
        if self.include_genders != other.include_genders:
            return False
        if self.include_institution_ids != other.include_institution_ids:
            return False
        if self.include_material_texts != other.include_material_texts:
            return False
        if self.include_subject_term_texts != other.include_subject_term_texts:
            return False
        if self.include_work_type_texts != other.include_work_type_texts:
            return False
        return True

    def __hash__(self):
        return hash((self.exclude_agent_name_texts,self.exclude_categories,self.exclude_collection_ids,self.exclude_genders,self.exclude_institution_ids,self.exclude_material_texts,self.exclude_subject_term_texts,self.exclude_work_type_texts,self.include_agent_name_texts,self.include_categories,self.include_collection_ids,self.include_genders,self.include_institution_ids,self.include_material_texts,self.include_subject_term_texts,self.include_work_type_texts,))

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
        if self.exclude_genders is not None:
            field_reprs.append('exclude_genders=' + repr(self.exclude_genders))
        if self.exclude_institution_ids is not None:
            field_reprs.append('exclude_institution_ids=' + repr(self.exclude_institution_ids))
        if self.exclude_material_texts is not None:
            field_reprs.append('exclude_material_texts=' + repr(self.exclude_material_texts))
        if self.exclude_subject_term_texts is not None:
            field_reprs.append('exclude_subject_term_texts=' + repr(self.exclude_subject_term_texts))
        if self.exclude_work_type_texts is not None:
            field_reprs.append('exclude_work_type_texts=' + repr(self.exclude_work_type_texts))
        if self.include_agent_name_texts is not None:
            field_reprs.append('include_agent_name_texts=' + repr(self.include_agent_name_texts))
        if self.include_categories is not None:
            field_reprs.append('include_categories=' + repr(self.include_categories))
        if self.include_collection_ids is not None:
            field_reprs.append('include_collection_ids=' + repr(self.include_collection_ids))
        if self.include_genders is not None:
            field_reprs.append('include_genders=' + repr(self.include_genders))
        if self.include_institution_ids is not None:
            field_reprs.append('include_institution_ids=' + repr(self.include_institution_ids))
        if self.include_material_texts is not None:
            field_reprs.append('include_material_texts=' + repr(self.include_material_texts))
        if self.include_subject_term_texts is not None:
            field_reprs.append('include_subject_term_texts=' + repr(self.include_subject_term_texts))
        if self.include_work_type_texts is not None:
            field_reprs.append('include_work_type_texts=' + repr(self.include_work_type_texts))
        return 'ObjectFacetFilters(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.exclude_agent_name_texts is not None:
            field_reprs.append('exclude_agent_name_texts=' + repr(self.exclude_agent_name_texts))
        if self.exclude_categories is not None:
            field_reprs.append('exclude_categories=' + repr(self.exclude_categories))
        if self.exclude_collection_ids is not None:
            field_reprs.append('exclude_collection_ids=' + repr(self.exclude_collection_ids))
        if self.exclude_genders is not None:
            field_reprs.append('exclude_genders=' + repr(self.exclude_genders))
        if self.exclude_institution_ids is not None:
            field_reprs.append('exclude_institution_ids=' + repr(self.exclude_institution_ids))
        if self.exclude_material_texts is not None:
            field_reprs.append('exclude_material_texts=' + repr(self.exclude_material_texts))
        if self.exclude_subject_term_texts is not None:
            field_reprs.append('exclude_subject_term_texts=' + repr(self.exclude_subject_term_texts))
        if self.exclude_work_type_texts is not None:
            field_reprs.append('exclude_work_type_texts=' + repr(self.exclude_work_type_texts))
        if self.include_agent_name_texts is not None:
            field_reprs.append('include_agent_name_texts=' + repr(self.include_agent_name_texts))
        if self.include_categories is not None:
            field_reprs.append('include_categories=' + repr(self.include_categories))
        if self.include_collection_ids is not None:
            field_reprs.append('include_collection_ids=' + repr(self.include_collection_ids))
        if self.include_genders is not None:
            field_reprs.append('include_genders=' + repr(self.include_genders))
        if self.include_institution_ids is not None:
            field_reprs.append('include_institution_ids=' + repr(self.include_institution_ids))
        if self.include_material_texts is not None:
            field_reprs.append('include_material_texts=' + repr(self.include_material_texts))
        if self.include_subject_term_texts is not None:
            field_reprs.append('include_subject_term_texts=' + repr(self.include_subject_term_texts))
        if self.include_work_type_texts is not None:
            field_reprs.append('include_work_type_texts=' + repr(self.include_work_type_texts))
        return 'ObjectFacetFilters(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'exclude_agent_name_texts': self.exclude_agent_name_texts, 'exclude_categories': self.exclude_categories, 'exclude_collection_ids': self.exclude_collection_ids, 'exclude_genders': self.exclude_genders, 'exclude_institution_ids': self.exclude_institution_ids, 'exclude_material_texts': self.exclude_material_texts, 'exclude_subject_term_texts': self.exclude_subject_term_texts, 'exclude_work_type_texts': self.exclude_work_type_texts, 'include_agent_name_texts': self.include_agent_name_texts, 'include_categories': self.include_categories, 'include_collection_ids': self.include_collection_ids, 'include_genders': self.include_genders, 'include_institution_ids': self.include_institution_ids, 'include_material_texts': self.include_material_texts, 'include_subject_term_texts': self.include_subject_term_texts, 'include_work_type_texts': self.include_work_type_texts}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.exclude_agent_name_texts, self.exclude_categories, self.exclude_collection_ids, self.exclude_genders, self.exclude_institution_ids, self.exclude_material_texts, self.exclude_subject_term_texts, self.exclude_work_type_texts, self.include_agent_name_texts, self.include_categories, self.include_collection_ids, self.include_genders, self.include_institution_ids, self.include_material_texts, self.include_subject_term_texts, self.include_work_type_texts,)

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
    def exclude_genders(self):
        '''
        :rtype: frozenset(costume.api.models.gender.gender.Gender)
        '''

        return self.__exclude_genders

    @property
    def exclude_institution_ids(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__exclude_institution_ids

    @property
    def exclude_material_texts(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__exclude_material_texts

    @property
    def exclude_subject_term_texts(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__exclude_subject_term_texts

    @property
    def exclude_work_type_texts(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__exclude_work_type_texts

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
    def include_genders(self):
        '''
        :rtype: frozenset(costume.api.models.gender.gender.Gender)
        '''

        return self.__include_genders

    @property
    def include_institution_ids(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__include_institution_ids

    @property
    def include_material_texts(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__include_material_texts

    @property
    def include_subject_term_texts(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__include_subject_term_texts

    @property
    def include_work_type_texts(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__include_work_type_texts

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: costume.api.services.object.object_facet_filters.ObjectFacetFilters
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
            elif ifield_name == 'exclude_genders':
                init_kwds['exclude_genders'] = frozenset([costume.api.models.gender.gender.Gender.value_of(iprot.read_string().strip().upper()) for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'exclude_institution_ids':
                init_kwds['exclude_institution_ids'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'exclude_material_texts':
                init_kwds['exclude_material_texts'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'exclude_subject_term_texts':
                init_kwds['exclude_subject_term_texts'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'exclude_work_type_texts':
                init_kwds['exclude_work_type_texts'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'include_agent_name_texts':
                init_kwds['include_agent_name_texts'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'include_categories':
                init_kwds['include_categories'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'include_collection_ids':
                init_kwds['include_collection_ids'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'include_genders':
                init_kwds['include_genders'] = frozenset([costume.api.models.gender.gender.Gender.value_of(iprot.read_string().strip().upper()) for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'include_institution_ids':
                init_kwds['include_institution_ids'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'include_material_texts':
                init_kwds['include_material_texts'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'include_subject_term_texts':
                init_kwds['include_subject_term_texts'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'include_work_type_texts':
                init_kwds['include_work_type_texts'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        exclude_agent_name_texts=None,
        exclude_categories=None,
        exclude_collection_ids=None,
        exclude_genders=None,
        exclude_institution_ids=None,
        exclude_material_texts=None,
        exclude_subject_term_texts=None,
        exclude_work_type_texts=None,
        include_agent_name_texts=None,
        include_categories=None,
        include_collection_ids=None,
        include_genders=None,
        include_institution_ids=None,
        include_material_texts=None,
        include_subject_term_texts=None,
        include_work_type_texts=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type exclude_agent_name_texts: frozenset(str) or None
        :type exclude_categories: frozenset(str) or None
        :type exclude_collection_ids: frozenset(str) or None
        :type exclude_genders: frozenset(costume.api.models.gender.gender.Gender) or None
        :type exclude_institution_ids: frozenset(str) or None
        :type exclude_material_texts: frozenset(str) or None
        :type exclude_subject_term_texts: frozenset(str) or None
        :type exclude_work_type_texts: frozenset(str) or None
        :type include_agent_name_texts: frozenset(str) or None
        :type include_categories: frozenset(str) or None
        :type include_collection_ids: frozenset(str) or None
        :type include_genders: frozenset(costume.api.models.gender.gender.Gender) or None
        :type include_institution_ids: frozenset(str) or None
        :type include_material_texts: frozenset(str) or None
        :type include_subject_term_texts: frozenset(str) or None
        :type include_work_type_texts: frozenset(str) or None
        :rtype: costume.api.services.object.object_facet_filters.ObjectFacetFilters
        '''

        if exclude_agent_name_texts is None:
            exclude_agent_name_texts = self.exclude_agent_name_texts
        if exclude_categories is None:
            exclude_categories = self.exclude_categories
        if exclude_collection_ids is None:
            exclude_collection_ids = self.exclude_collection_ids
        if exclude_genders is None:
            exclude_genders = self.exclude_genders
        if exclude_institution_ids is None:
            exclude_institution_ids = self.exclude_institution_ids
        if exclude_material_texts is None:
            exclude_material_texts = self.exclude_material_texts
        if exclude_subject_term_texts is None:
            exclude_subject_term_texts = self.exclude_subject_term_texts
        if exclude_work_type_texts is None:
            exclude_work_type_texts = self.exclude_work_type_texts
        if include_agent_name_texts is None:
            include_agent_name_texts = self.include_agent_name_texts
        if include_categories is None:
            include_categories = self.include_categories
        if include_collection_ids is None:
            include_collection_ids = self.include_collection_ids
        if include_genders is None:
            include_genders = self.include_genders
        if include_institution_ids is None:
            include_institution_ids = self.include_institution_ids
        if include_material_texts is None:
            include_material_texts = self.include_material_texts
        if include_subject_term_texts is None:
            include_subject_term_texts = self.include_subject_term_texts
        if include_work_type_texts is None:
            include_work_type_texts = self.include_work_type_texts
        return self.__class__(exclude_agent_name_texts=exclude_agent_name_texts, exclude_categories=exclude_categories, exclude_collection_ids=exclude_collection_ids, exclude_genders=exclude_genders, exclude_institution_ids=exclude_institution_ids, exclude_material_texts=exclude_material_texts, exclude_subject_term_texts=exclude_subject_term_texts, exclude_work_type_texts=exclude_work_type_texts, include_agent_name_texts=include_agent_name_texts, include_categories=include_categories, include_collection_ids=include_collection_ids, include_genders=include_genders, include_institution_ids=include_institution_ids, include_material_texts=include_material_texts, include_subject_term_texts=include_subject_term_texts, include_work_type_texts=include_work_type_texts)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.services.object.object_facet_filters.ObjectFacetFilters
        '''

        oprot.write_struct_begin('ObjectFacetFilters')

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

        if self.exclude_genders is not None:
            oprot.write_field_begin(name='exclude_genders', type=14, id=None)
            oprot.write_set_begin(11, len(self.exclude_genders))
            for _0 in self.exclude_genders:
                oprot.write_string(str(_0))
            oprot.write_set_end()
            oprot.write_field_end()

        if self.exclude_institution_ids is not None:
            oprot.write_field_begin(name='exclude_institution_ids', type=14, id=None)
            oprot.write_set_begin(11, len(self.exclude_institution_ids))
            for _0 in self.exclude_institution_ids:
                oprot.write_string(_0)
            oprot.write_set_end()
            oprot.write_field_end()

        if self.exclude_material_texts is not None:
            oprot.write_field_begin(name='exclude_material_texts', type=14, id=None)
            oprot.write_set_begin(11, len(self.exclude_material_texts))
            for _0 in self.exclude_material_texts:
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

        if self.exclude_work_type_texts is not None:
            oprot.write_field_begin(name='exclude_work_type_texts', type=14, id=None)
            oprot.write_set_begin(11, len(self.exclude_work_type_texts))
            for _0 in self.exclude_work_type_texts:
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

        if self.include_genders is not None:
            oprot.write_field_begin(name='include_genders', type=14, id=None)
            oprot.write_set_begin(11, len(self.include_genders))
            for _0 in self.include_genders:
                oprot.write_string(str(_0))
            oprot.write_set_end()
            oprot.write_field_end()

        if self.include_institution_ids is not None:
            oprot.write_field_begin(name='include_institution_ids', type=14, id=None)
            oprot.write_set_begin(11, len(self.include_institution_ids))
            for _0 in self.include_institution_ids:
                oprot.write_string(_0)
            oprot.write_set_end()
            oprot.write_field_end()

        if self.include_material_texts is not None:
            oprot.write_field_begin(name='include_material_texts', type=14, id=None)
            oprot.write_set_begin(11, len(self.include_material_texts))
            for _0 in self.include_material_texts:
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

        if self.include_work_type_texts is not None:
            oprot.write_field_begin(name='include_work_type_texts', type=14, id=None)
            oprot.write_set_begin(11, len(self.include_work_type_texts))
            for _0 in self.include_work_type_texts:
                oprot.write_string(_0)
            oprot.write_set_end()
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
