from itertools import ifilterfalse
import __builtin__
import costume.api.models.gender.gender


class ObjectFacetFilters(object):
    class Builder(object):
        def __init__(
            self,
            exclude_agent_name_texts=None,
            exclude_all=None,
            exclude_categories=None,
            exclude_collections=None,
            exclude_color_texts=None,
            exclude_cultural_context_texts=None,
            exclude_genders=None,
            exclude_institutions=None,
            exclude_location_name_texts=None,
            exclude_material_texts=None,
            exclude_subject_term_texts=None,
            exclude_technique_texts=None,
            exclude_work_type_texts=None,
            include_agent_name_texts=None,
            include_categories=None,
            include_collections=None,
            include_color_texts=None,
            include_cultural_context_texts=None,
            include_genders=None,
            include_institutions=None,
            include_location_name_texts=None,
            include_material_texts=None,
            include_subject_term_texts=None,
            include_technique_texts=None,
            include_work_type_texts=None,
        ):
            '''
            :type exclude_agent_name_texts: frozenset(str) or None
            :type exclude_all: bool or None
            :type exclude_categories: frozenset(str) or None
            :type exclude_collections: frozenset(str) or None
            :type exclude_color_texts: frozenset(str) or None
            :type exclude_cultural_context_texts: frozenset(str) or None
            :type exclude_genders: frozenset(costume.api.models.gender.gender.Gender) or None
            :type exclude_institutions: frozenset(str) or None
            :type exclude_location_name_texts: frozenset(str) or None
            :type exclude_material_texts: frozenset(str) or None
            :type exclude_subject_term_texts: frozenset(str) or None
            :type exclude_technique_texts: frozenset(str) or None
            :type exclude_work_type_texts: frozenset(str) or None
            :type include_agent_name_texts: frozenset(str) or None
            :type include_categories: frozenset(str) or None
            :type include_collections: frozenset(str) or None
            :type include_color_texts: frozenset(str) or None
            :type include_cultural_context_texts: frozenset(str) or None
            :type include_genders: frozenset(costume.api.models.gender.gender.Gender) or None
            :type include_institutions: frozenset(str) or None
            :type include_location_name_texts: frozenset(str) or None
            :type include_material_texts: frozenset(str) or None
            :type include_subject_term_texts: frozenset(str) or None
            :type include_technique_texts: frozenset(str) or None
            :type include_work_type_texts: frozenset(str) or None
            '''

            self.__exclude_agent_name_texts = exclude_agent_name_texts
            self.__exclude_all = exclude_all
            self.__exclude_categories = exclude_categories
            self.__exclude_collections = exclude_collections
            self.__exclude_color_texts = exclude_color_texts
            self.__exclude_cultural_context_texts = exclude_cultural_context_texts
            self.__exclude_genders = exclude_genders
            self.__exclude_institutions = exclude_institutions
            self.__exclude_location_name_texts = exclude_location_name_texts
            self.__exclude_material_texts = exclude_material_texts
            self.__exclude_subject_term_texts = exclude_subject_term_texts
            self.__exclude_technique_texts = exclude_technique_texts
            self.__exclude_work_type_texts = exclude_work_type_texts
            self.__include_agent_name_texts = include_agent_name_texts
            self.__include_categories = include_categories
            self.__include_collections = include_collections
            self.__include_color_texts = include_color_texts
            self.__include_cultural_context_texts = include_cultural_context_texts
            self.__include_genders = include_genders
            self.__include_institutions = include_institutions
            self.__include_location_name_texts = include_location_name_texts
            self.__include_material_texts = include_material_texts
            self.__include_subject_term_texts = include_subject_term_texts
            self.__include_technique_texts = include_technique_texts
            self.__include_work_type_texts = include_work_type_texts

        def build(self):
            return ObjectFacetFilters(exclude_agent_name_texts=self.__exclude_agent_name_texts, exclude_all=self.__exclude_all, exclude_categories=self.__exclude_categories, exclude_collections=self.__exclude_collections, exclude_color_texts=self.__exclude_color_texts, exclude_cultural_context_texts=self.__exclude_cultural_context_texts, exclude_genders=self.__exclude_genders, exclude_institutions=self.__exclude_institutions, exclude_location_name_texts=self.__exclude_location_name_texts, exclude_material_texts=self.__exclude_material_texts, exclude_subject_term_texts=self.__exclude_subject_term_texts, exclude_technique_texts=self.__exclude_technique_texts, exclude_work_type_texts=self.__exclude_work_type_texts, include_agent_name_texts=self.__include_agent_name_texts, include_categories=self.__include_categories, include_collections=self.__include_collections, include_color_texts=self.__include_color_texts, include_cultural_context_texts=self.__include_cultural_context_texts, include_genders=self.__include_genders, include_institutions=self.__include_institutions, include_location_name_texts=self.__include_location_name_texts, include_material_texts=self.__include_material_texts, include_subject_term_texts=self.__include_subject_term_texts, include_technique_texts=self.__include_technique_texts, include_work_type_texts=self.__include_work_type_texts)

        @property
        def exclude_agent_name_texts(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__exclude_agent_name_texts

        @property
        def exclude_all(self):
            '''
            :rtype: bool
            '''

            return self.__exclude_all

        @property
        def exclude_categories(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__exclude_categories

        @property
        def exclude_collections(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__exclude_collections

        @property
        def exclude_color_texts(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__exclude_color_texts

        @property
        def exclude_cultural_context_texts(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__exclude_cultural_context_texts

        @property
        def exclude_genders(self):
            '''
            :rtype: frozenset(costume.api.models.gender.gender.Gender)
            '''

            return self.__exclude_genders

        @property
        def exclude_institutions(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__exclude_institutions

        @property
        def exclude_location_name_texts(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__exclude_location_name_texts

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
        def exclude_technique_texts(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__exclude_technique_texts

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
        def include_collections(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__include_collections

        @property
        def include_color_texts(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__include_color_texts

        @property
        def include_cultural_context_texts(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__include_cultural_context_texts

        @property
        def include_genders(self):
            '''
            :rtype: frozenset(costume.api.models.gender.gender.Gender)
            '''

            return self.__include_genders

        @property
        def include_institutions(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__include_institutions

        @property
        def include_location_name_texts(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__include_location_name_texts

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
        def include_technique_texts(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__include_technique_texts

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

        def set_exclude_all(self, exclude_all):
            '''
            :type exclude_all: bool or None
            '''

            self.__exclude_all = exclude_all
            return self

        def set_exclude_categories(self, exclude_categories):
            '''
            :type exclude_categories: frozenset(str) or None
            '''

            self.__exclude_categories = exclude_categories
            return self

        def set_exclude_collections(self, exclude_collections):
            '''
            :type exclude_collections: frozenset(str) or None
            '''

            self.__exclude_collections = exclude_collections
            return self

        def set_exclude_color_texts(self, exclude_color_texts):
            '''
            :type exclude_color_texts: frozenset(str) or None
            '''

            self.__exclude_color_texts = exclude_color_texts
            return self

        def set_exclude_cultural_context_texts(self, exclude_cultural_context_texts):
            '''
            :type exclude_cultural_context_texts: frozenset(str) or None
            '''

            self.__exclude_cultural_context_texts = exclude_cultural_context_texts
            return self

        def set_exclude_genders(self, exclude_genders):
            '''
            :type exclude_genders: frozenset(costume.api.models.gender.gender.Gender) or None
            '''

            self.__exclude_genders = exclude_genders
            return self

        def set_exclude_institutions(self, exclude_institutions):
            '''
            :type exclude_institutions: frozenset(str) or None
            '''

            self.__exclude_institutions = exclude_institutions
            return self

        def set_exclude_location_name_texts(self, exclude_location_name_texts):
            '''
            :type exclude_location_name_texts: frozenset(str) or None
            '''

            self.__exclude_location_name_texts = exclude_location_name_texts
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

        def set_exclude_technique_texts(self, exclude_technique_texts):
            '''
            :type exclude_technique_texts: frozenset(str) or None
            '''

            self.__exclude_technique_texts = exclude_technique_texts
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

        def set_include_collections(self, include_collections):
            '''
            :type include_collections: frozenset(str) or None
            '''

            self.__include_collections = include_collections
            return self

        def set_include_color_texts(self, include_color_texts):
            '''
            :type include_color_texts: frozenset(str) or None
            '''

            self.__include_color_texts = include_color_texts
            return self

        def set_include_cultural_context_texts(self, include_cultural_context_texts):
            '''
            :type include_cultural_context_texts: frozenset(str) or None
            '''

            self.__include_cultural_context_texts = include_cultural_context_texts
            return self

        def set_include_genders(self, include_genders):
            '''
            :type include_genders: frozenset(costume.api.models.gender.gender.Gender) or None
            '''

            self.__include_genders = include_genders
            return self

        def set_include_institutions(self, include_institutions):
            '''
            :type include_institutions: frozenset(str) or None
            '''

            self.__include_institutions = include_institutions
            return self

        def set_include_location_name_texts(self, include_location_name_texts):
            '''
            :type include_location_name_texts: frozenset(str) or None
            '''

            self.__include_location_name_texts = include_location_name_texts
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

        def set_include_technique_texts(self, include_technique_texts):
            '''
            :type include_technique_texts: frozenset(str) or None
            '''

            self.__include_technique_texts = include_technique_texts
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
            :type exclude_all: bool or None
            :type exclude_categories: frozenset(str) or None
            :type exclude_collections: frozenset(str) or None
            :type exclude_color_texts: frozenset(str) or None
            :type exclude_cultural_context_texts: frozenset(str) or None
            :type exclude_genders: frozenset(costume.api.models.gender.gender.Gender) or None
            :type exclude_institutions: frozenset(str) or None
            :type exclude_location_name_texts: frozenset(str) or None
            :type exclude_material_texts: frozenset(str) or None
            :type exclude_subject_term_texts: frozenset(str) or None
            :type exclude_technique_texts: frozenset(str) or None
            :type exclude_work_type_texts: frozenset(str) or None
            :type include_agent_name_texts: frozenset(str) or None
            :type include_categories: frozenset(str) or None
            :type include_collections: frozenset(str) or None
            :type include_color_texts: frozenset(str) or None
            :type include_cultural_context_texts: frozenset(str) or None
            :type include_genders: frozenset(costume.api.models.gender.gender.Gender) or None
            :type include_institutions: frozenset(str) or None
            :type include_location_name_texts: frozenset(str) or None
            :type include_material_texts: frozenset(str) or None
            :type include_subject_term_texts: frozenset(str) or None
            :type include_technique_texts: frozenset(str) or None
            :type include_work_type_texts: frozenset(str) or None
            '''

            if isinstance(object_facet_filters, ObjectFacetFilters):
                self.set_exclude_agent_name_texts(object_facet_filters.exclude_agent_name_texts)
                self.set_exclude_all(object_facet_filters.exclude_all)
                self.set_exclude_categories(object_facet_filters.exclude_categories)
                self.set_exclude_collections(object_facet_filters.exclude_collections)
                self.set_exclude_color_texts(object_facet_filters.exclude_color_texts)
                self.set_exclude_cultural_context_texts(object_facet_filters.exclude_cultural_context_texts)
                self.set_exclude_genders(object_facet_filters.exclude_genders)
                self.set_exclude_institutions(object_facet_filters.exclude_institutions)
                self.set_exclude_location_name_texts(object_facet_filters.exclude_location_name_texts)
                self.set_exclude_material_texts(object_facet_filters.exclude_material_texts)
                self.set_exclude_subject_term_texts(object_facet_filters.exclude_subject_term_texts)
                self.set_exclude_technique_texts(object_facet_filters.exclude_technique_texts)
                self.set_exclude_work_type_texts(object_facet_filters.exclude_work_type_texts)
                self.set_include_agent_name_texts(object_facet_filters.include_agent_name_texts)
                self.set_include_categories(object_facet_filters.include_categories)
                self.set_include_collections(object_facet_filters.include_collections)
                self.set_include_color_texts(object_facet_filters.include_color_texts)
                self.set_include_cultural_context_texts(object_facet_filters.include_cultural_context_texts)
                self.set_include_genders(object_facet_filters.include_genders)
                self.set_include_institutions(object_facet_filters.include_institutions)
                self.set_include_location_name_texts(object_facet_filters.include_location_name_texts)
                self.set_include_material_texts(object_facet_filters.include_material_texts)
                self.set_include_subject_term_texts(object_facet_filters.include_subject_term_texts)
                self.set_include_technique_texts(object_facet_filters.include_technique_texts)
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

        @exclude_all.setter
        def exclude_all(self, exclude_all):
            '''
            :type exclude_all: bool or None
            '''

            self.set_exclude_all(exclude_all)

        @exclude_categories.setter
        def exclude_categories(self, exclude_categories):
            '''
            :type exclude_categories: frozenset(str) or None
            '''

            self.set_exclude_categories(exclude_categories)

        @exclude_collections.setter
        def exclude_collections(self, exclude_collections):
            '''
            :type exclude_collections: frozenset(str) or None
            '''

            self.set_exclude_collections(exclude_collections)

        @exclude_color_texts.setter
        def exclude_color_texts(self, exclude_color_texts):
            '''
            :type exclude_color_texts: frozenset(str) or None
            '''

            self.set_exclude_color_texts(exclude_color_texts)

        @exclude_cultural_context_texts.setter
        def exclude_cultural_context_texts(self, exclude_cultural_context_texts):
            '''
            :type exclude_cultural_context_texts: frozenset(str) or None
            '''

            self.set_exclude_cultural_context_texts(exclude_cultural_context_texts)

        @exclude_genders.setter
        def exclude_genders(self, exclude_genders):
            '''
            :type exclude_genders: frozenset(costume.api.models.gender.gender.Gender) or None
            '''

            self.set_exclude_genders(exclude_genders)

        @exclude_institutions.setter
        def exclude_institutions(self, exclude_institutions):
            '''
            :type exclude_institutions: frozenset(str) or None
            '''

            self.set_exclude_institutions(exclude_institutions)

        @exclude_location_name_texts.setter
        def exclude_location_name_texts(self, exclude_location_name_texts):
            '''
            :type exclude_location_name_texts: frozenset(str) or None
            '''

            self.set_exclude_location_name_texts(exclude_location_name_texts)

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

        @exclude_technique_texts.setter
        def exclude_technique_texts(self, exclude_technique_texts):
            '''
            :type exclude_technique_texts: frozenset(str) or None
            '''

            self.set_exclude_technique_texts(exclude_technique_texts)

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

        @include_collections.setter
        def include_collections(self, include_collections):
            '''
            :type include_collections: frozenset(str) or None
            '''

            self.set_include_collections(include_collections)

        @include_color_texts.setter
        def include_color_texts(self, include_color_texts):
            '''
            :type include_color_texts: frozenset(str) or None
            '''

            self.set_include_color_texts(include_color_texts)

        @include_cultural_context_texts.setter
        def include_cultural_context_texts(self, include_cultural_context_texts):
            '''
            :type include_cultural_context_texts: frozenset(str) or None
            '''

            self.set_include_cultural_context_texts(include_cultural_context_texts)

        @include_genders.setter
        def include_genders(self, include_genders):
            '''
            :type include_genders: frozenset(costume.api.models.gender.gender.Gender) or None
            '''

            self.set_include_genders(include_genders)

        @include_institutions.setter
        def include_institutions(self, include_institutions):
            '''
            :type include_institutions: frozenset(str) or None
            '''

            self.set_include_institutions(include_institutions)

        @include_location_name_texts.setter
        def include_location_name_texts(self, include_location_name_texts):
            '''
            :type include_location_name_texts: frozenset(str) or None
            '''

            self.set_include_location_name_texts(include_location_name_texts)

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

        @include_technique_texts.setter
        def include_technique_texts(self, include_technique_texts):
            '''
            :type include_technique_texts: frozenset(str) or None
            '''

            self.set_include_technique_texts(include_technique_texts)

        @include_work_type_texts.setter
        def include_work_type_texts(self, include_work_type_texts):
            '''
            :type include_work_type_texts: frozenset(str) or None
            '''

            self.set_include_work_type_texts(include_work_type_texts)

    def __init__(
        self,
        exclude_agent_name_texts=None,
        exclude_all=None,
        exclude_categories=None,
        exclude_collections=None,
        exclude_color_texts=None,
        exclude_cultural_context_texts=None,
        exclude_genders=None,
        exclude_institutions=None,
        exclude_location_name_texts=None,
        exclude_material_texts=None,
        exclude_subject_term_texts=None,
        exclude_technique_texts=None,
        exclude_work_type_texts=None,
        include_agent_name_texts=None,
        include_categories=None,
        include_collections=None,
        include_color_texts=None,
        include_cultural_context_texts=None,
        include_genders=None,
        include_institutions=None,
        include_location_name_texts=None,
        include_material_texts=None,
        include_subject_term_texts=None,
        include_technique_texts=None,
        include_work_type_texts=None,
    ):
        '''
        :type exclude_agent_name_texts: frozenset(str) or None
        :type exclude_all: bool or None
        :type exclude_categories: frozenset(str) or None
        :type exclude_collections: frozenset(str) or None
        :type exclude_color_texts: frozenset(str) or None
        :type exclude_cultural_context_texts: frozenset(str) or None
        :type exclude_genders: frozenset(costume.api.models.gender.gender.Gender) or None
        :type exclude_institutions: frozenset(str) or None
        :type exclude_location_name_texts: frozenset(str) or None
        :type exclude_material_texts: frozenset(str) or None
        :type exclude_subject_term_texts: frozenset(str) or None
        :type exclude_technique_texts: frozenset(str) or None
        :type exclude_work_type_texts: frozenset(str) or None
        :type include_agent_name_texts: frozenset(str) or None
        :type include_categories: frozenset(str) or None
        :type include_collections: frozenset(str) or None
        :type include_color_texts: frozenset(str) or None
        :type include_cultural_context_texts: frozenset(str) or None
        :type include_genders: frozenset(costume.api.models.gender.gender.Gender) or None
        :type include_institutions: frozenset(str) or None
        :type include_location_name_texts: frozenset(str) or None
        :type include_material_texts: frozenset(str) or None
        :type include_subject_term_texts: frozenset(str) or None
        :type include_technique_texts: frozenset(str) or None
        :type include_work_type_texts: frozenset(str) or None
        '''

        if exclude_agent_name_texts is not None:
            if not (isinstance(exclude_agent_name_texts, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), exclude_agent_name_texts))) == 0):
                raise TypeError("expected exclude_agent_name_texts to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(exclude_agent_name_texts))
            if len(exclude_agent_name_texts) < 1:
                raise ValueError("expected len(exclude_agent_name_texts) to be >= 1, was %d" % len(exclude_agent_name_texts))
        self.__exclude_agent_name_texts = exclude_agent_name_texts

        if exclude_all is not None:
            if not isinstance(exclude_all, bool):
                raise TypeError("expected exclude_all to be a bool but it is a %s" % getattr(__builtin__, 'type')(exclude_all))
        self.__exclude_all = exclude_all

        if exclude_categories is not None:
            if not (isinstance(exclude_categories, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), exclude_categories))) == 0):
                raise TypeError("expected exclude_categories to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(exclude_categories))
            if len(exclude_categories) < 1:
                raise ValueError("expected len(exclude_categories) to be >= 1, was %d" % len(exclude_categories))
        self.__exclude_categories = exclude_categories

        if exclude_collections is not None:
            if not (isinstance(exclude_collections, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), exclude_collections))) == 0):
                raise TypeError("expected exclude_collections to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(exclude_collections))
            if len(exclude_collections) < 1:
                raise ValueError("expected len(exclude_collections) to be >= 1, was %d" % len(exclude_collections))
        self.__exclude_collections = exclude_collections

        if exclude_color_texts is not None:
            if not (isinstance(exclude_color_texts, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), exclude_color_texts))) == 0):
                raise TypeError("expected exclude_color_texts to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(exclude_color_texts))
            if len(exclude_color_texts) < 1:
                raise ValueError("expected len(exclude_color_texts) to be >= 1, was %d" % len(exclude_color_texts))
        self.__exclude_color_texts = exclude_color_texts

        if exclude_cultural_context_texts is not None:
            if not (isinstance(exclude_cultural_context_texts, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), exclude_cultural_context_texts))) == 0):
                raise TypeError("expected exclude_cultural_context_texts to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(exclude_cultural_context_texts))
            if len(exclude_cultural_context_texts) < 1:
                raise ValueError("expected len(exclude_cultural_context_texts) to be >= 1, was %d" % len(exclude_cultural_context_texts))
        self.__exclude_cultural_context_texts = exclude_cultural_context_texts

        if exclude_genders is not None:
            if not (isinstance(exclude_genders, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, costume.api.models.gender.gender.Gender), exclude_genders))) == 0):
                raise TypeError("expected exclude_genders to be a frozenset(costume.api.models.gender.gender.Gender) but it is a %s" % getattr(__builtin__, 'type')(exclude_genders))
            if len(exclude_genders) < 1:
                raise ValueError("expected len(exclude_genders) to be >= 1, was %d" % len(exclude_genders))
        self.__exclude_genders = exclude_genders

        if exclude_institutions is not None:
            if not (isinstance(exclude_institutions, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), exclude_institutions))) == 0):
                raise TypeError("expected exclude_institutions to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(exclude_institutions))
            if len(exclude_institutions) < 1:
                raise ValueError("expected len(exclude_institutions) to be >= 1, was %d" % len(exclude_institutions))
        self.__exclude_institutions = exclude_institutions

        if exclude_location_name_texts is not None:
            if not (isinstance(exclude_location_name_texts, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), exclude_location_name_texts))) == 0):
                raise TypeError("expected exclude_location_name_texts to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(exclude_location_name_texts))
            if len(exclude_location_name_texts) < 1:
                raise ValueError("expected len(exclude_location_name_texts) to be >= 1, was %d" % len(exclude_location_name_texts))
        self.__exclude_location_name_texts = exclude_location_name_texts

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

        if exclude_technique_texts is not None:
            if not (isinstance(exclude_technique_texts, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), exclude_technique_texts))) == 0):
                raise TypeError("expected exclude_technique_texts to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(exclude_technique_texts))
            if len(exclude_technique_texts) < 1:
                raise ValueError("expected len(exclude_technique_texts) to be >= 1, was %d" % len(exclude_technique_texts))
        self.__exclude_technique_texts = exclude_technique_texts

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

        if include_collections is not None:
            if not (isinstance(include_collections, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), include_collections))) == 0):
                raise TypeError("expected include_collections to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(include_collections))
            if len(include_collections) < 1:
                raise ValueError("expected len(include_collections) to be >= 1, was %d" % len(include_collections))
        self.__include_collections = include_collections

        if include_color_texts is not None:
            if not (isinstance(include_color_texts, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), include_color_texts))) == 0):
                raise TypeError("expected include_color_texts to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(include_color_texts))
            if len(include_color_texts) < 1:
                raise ValueError("expected len(include_color_texts) to be >= 1, was %d" % len(include_color_texts))
        self.__include_color_texts = include_color_texts

        if include_cultural_context_texts is not None:
            if not (isinstance(include_cultural_context_texts, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), include_cultural_context_texts))) == 0):
                raise TypeError("expected include_cultural_context_texts to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(include_cultural_context_texts))
            if len(include_cultural_context_texts) < 1:
                raise ValueError("expected len(include_cultural_context_texts) to be >= 1, was %d" % len(include_cultural_context_texts))
        self.__include_cultural_context_texts = include_cultural_context_texts

        if include_genders is not None:
            if not (isinstance(include_genders, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, costume.api.models.gender.gender.Gender), include_genders))) == 0):
                raise TypeError("expected include_genders to be a frozenset(costume.api.models.gender.gender.Gender) but it is a %s" % getattr(__builtin__, 'type')(include_genders))
            if len(include_genders) < 1:
                raise ValueError("expected len(include_genders) to be >= 1, was %d" % len(include_genders))
        self.__include_genders = include_genders

        if include_institutions is not None:
            if not (isinstance(include_institutions, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), include_institutions))) == 0):
                raise TypeError("expected include_institutions to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(include_institutions))
            if len(include_institutions) < 1:
                raise ValueError("expected len(include_institutions) to be >= 1, was %d" % len(include_institutions))
        self.__include_institutions = include_institutions

        if include_location_name_texts is not None:
            if not (isinstance(include_location_name_texts, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), include_location_name_texts))) == 0):
                raise TypeError("expected include_location_name_texts to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(include_location_name_texts))
            if len(include_location_name_texts) < 1:
                raise ValueError("expected len(include_location_name_texts) to be >= 1, was %d" % len(include_location_name_texts))
        self.__include_location_name_texts = include_location_name_texts

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

        if include_technique_texts is not None:
            if not (isinstance(include_technique_texts, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), include_technique_texts))) == 0):
                raise TypeError("expected include_technique_texts to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(include_technique_texts))
            if len(include_technique_texts) < 1:
                raise ValueError("expected len(include_technique_texts) to be >= 1, was %d" % len(include_technique_texts))
        self.__include_technique_texts = include_technique_texts

        if include_work_type_texts is not None:
            if not (isinstance(include_work_type_texts, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), include_work_type_texts))) == 0):
                raise TypeError("expected include_work_type_texts to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(include_work_type_texts))
            if len(include_work_type_texts) < 1:
                raise ValueError("expected len(include_work_type_texts) to be >= 1, was %d" % len(include_work_type_texts))
        self.__include_work_type_texts = include_work_type_texts

    def __eq__(self, other):
        if self.exclude_agent_name_texts != other.exclude_agent_name_texts:
            return False
        if self.exclude_all != other.exclude_all:
            return False
        if self.exclude_categories != other.exclude_categories:
            return False
        if self.exclude_collections != other.exclude_collections:
            return False
        if self.exclude_color_texts != other.exclude_color_texts:
            return False
        if self.exclude_cultural_context_texts != other.exclude_cultural_context_texts:
            return False
        if self.exclude_genders != other.exclude_genders:
            return False
        if self.exclude_institutions != other.exclude_institutions:
            return False
        if self.exclude_location_name_texts != other.exclude_location_name_texts:
            return False
        if self.exclude_material_texts != other.exclude_material_texts:
            return False
        if self.exclude_subject_term_texts != other.exclude_subject_term_texts:
            return False
        if self.exclude_technique_texts != other.exclude_technique_texts:
            return False
        if self.exclude_work_type_texts != other.exclude_work_type_texts:
            return False
        if self.include_agent_name_texts != other.include_agent_name_texts:
            return False
        if self.include_categories != other.include_categories:
            return False
        if self.include_collections != other.include_collections:
            return False
        if self.include_color_texts != other.include_color_texts:
            return False
        if self.include_cultural_context_texts != other.include_cultural_context_texts:
            return False
        if self.include_genders != other.include_genders:
            return False
        if self.include_institutions != other.include_institutions:
            return False
        if self.include_location_name_texts != other.include_location_name_texts:
            return False
        if self.include_material_texts != other.include_material_texts:
            return False
        if self.include_subject_term_texts != other.include_subject_term_texts:
            return False
        if self.include_technique_texts != other.include_technique_texts:
            return False
        if self.include_work_type_texts != other.include_work_type_texts:
            return False
        return True

    def __hash__(self):
        return hash((self.exclude_agent_name_texts,self.exclude_all,self.exclude_categories,self.exclude_collections,self.exclude_color_texts,self.exclude_cultural_context_texts,self.exclude_genders,self.exclude_institutions,self.exclude_location_name_texts,self.exclude_material_texts,self.exclude_subject_term_texts,self.exclude_technique_texts,self.exclude_work_type_texts,self.include_agent_name_texts,self.include_categories,self.include_collections,self.include_color_texts,self.include_cultural_context_texts,self.include_genders,self.include_institutions,self.include_location_name_texts,self.include_material_texts,self.include_subject_term_texts,self.include_technique_texts,self.include_work_type_texts,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.exclude_agent_name_texts is not None:
            field_reprs.append('exclude_agent_name_texts=' + repr(self.exclude_agent_name_texts))
        if self.exclude_all is not None:
            field_reprs.append('exclude_all=' + repr(self.exclude_all))
        if self.exclude_categories is not None:
            field_reprs.append('exclude_categories=' + repr(self.exclude_categories))
        if self.exclude_collections is not None:
            field_reprs.append('exclude_collections=' + repr(self.exclude_collections))
        if self.exclude_color_texts is not None:
            field_reprs.append('exclude_color_texts=' + repr(self.exclude_color_texts))
        if self.exclude_cultural_context_texts is not None:
            field_reprs.append('exclude_cultural_context_texts=' + repr(self.exclude_cultural_context_texts))
        if self.exclude_genders is not None:
            field_reprs.append('exclude_genders=' + repr(self.exclude_genders))
        if self.exclude_institutions is not None:
            field_reprs.append('exclude_institutions=' + repr(self.exclude_institutions))
        if self.exclude_location_name_texts is not None:
            field_reprs.append('exclude_location_name_texts=' + repr(self.exclude_location_name_texts))
        if self.exclude_material_texts is not None:
            field_reprs.append('exclude_material_texts=' + repr(self.exclude_material_texts))
        if self.exclude_subject_term_texts is not None:
            field_reprs.append('exclude_subject_term_texts=' + repr(self.exclude_subject_term_texts))
        if self.exclude_technique_texts is not None:
            field_reprs.append('exclude_technique_texts=' + repr(self.exclude_technique_texts))
        if self.exclude_work_type_texts is not None:
            field_reprs.append('exclude_work_type_texts=' + repr(self.exclude_work_type_texts))
        if self.include_agent_name_texts is not None:
            field_reprs.append('include_agent_name_texts=' + repr(self.include_agent_name_texts))
        if self.include_categories is not None:
            field_reprs.append('include_categories=' + repr(self.include_categories))
        if self.include_collections is not None:
            field_reprs.append('include_collections=' + repr(self.include_collections))
        if self.include_color_texts is not None:
            field_reprs.append('include_color_texts=' + repr(self.include_color_texts))
        if self.include_cultural_context_texts is not None:
            field_reprs.append('include_cultural_context_texts=' + repr(self.include_cultural_context_texts))
        if self.include_genders is not None:
            field_reprs.append('include_genders=' + repr(self.include_genders))
        if self.include_institutions is not None:
            field_reprs.append('include_institutions=' + repr(self.include_institutions))
        if self.include_location_name_texts is not None:
            field_reprs.append('include_location_name_texts=' + repr(self.include_location_name_texts))
        if self.include_material_texts is not None:
            field_reprs.append('include_material_texts=' + repr(self.include_material_texts))
        if self.include_subject_term_texts is not None:
            field_reprs.append('include_subject_term_texts=' + repr(self.include_subject_term_texts))
        if self.include_technique_texts is not None:
            field_reprs.append('include_technique_texts=' + repr(self.include_technique_texts))
        if self.include_work_type_texts is not None:
            field_reprs.append('include_work_type_texts=' + repr(self.include_work_type_texts))
        return 'ObjectFacetFilters(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.exclude_agent_name_texts is not None:
            field_reprs.append('exclude_agent_name_texts=' + repr(self.exclude_agent_name_texts))
        if self.exclude_all is not None:
            field_reprs.append('exclude_all=' + repr(self.exclude_all))
        if self.exclude_categories is not None:
            field_reprs.append('exclude_categories=' + repr(self.exclude_categories))
        if self.exclude_collections is not None:
            field_reprs.append('exclude_collections=' + repr(self.exclude_collections))
        if self.exclude_color_texts is not None:
            field_reprs.append('exclude_color_texts=' + repr(self.exclude_color_texts))
        if self.exclude_cultural_context_texts is not None:
            field_reprs.append('exclude_cultural_context_texts=' + repr(self.exclude_cultural_context_texts))
        if self.exclude_genders is not None:
            field_reprs.append('exclude_genders=' + repr(self.exclude_genders))
        if self.exclude_institutions is not None:
            field_reprs.append('exclude_institutions=' + repr(self.exclude_institutions))
        if self.exclude_location_name_texts is not None:
            field_reprs.append('exclude_location_name_texts=' + repr(self.exclude_location_name_texts))
        if self.exclude_material_texts is not None:
            field_reprs.append('exclude_material_texts=' + repr(self.exclude_material_texts))
        if self.exclude_subject_term_texts is not None:
            field_reprs.append('exclude_subject_term_texts=' + repr(self.exclude_subject_term_texts))
        if self.exclude_technique_texts is not None:
            field_reprs.append('exclude_technique_texts=' + repr(self.exclude_technique_texts))
        if self.exclude_work_type_texts is not None:
            field_reprs.append('exclude_work_type_texts=' + repr(self.exclude_work_type_texts))
        if self.include_agent_name_texts is not None:
            field_reprs.append('include_agent_name_texts=' + repr(self.include_agent_name_texts))
        if self.include_categories is not None:
            field_reprs.append('include_categories=' + repr(self.include_categories))
        if self.include_collections is not None:
            field_reprs.append('include_collections=' + repr(self.include_collections))
        if self.include_color_texts is not None:
            field_reprs.append('include_color_texts=' + repr(self.include_color_texts))
        if self.include_cultural_context_texts is not None:
            field_reprs.append('include_cultural_context_texts=' + repr(self.include_cultural_context_texts))
        if self.include_genders is not None:
            field_reprs.append('include_genders=' + repr(self.include_genders))
        if self.include_institutions is not None:
            field_reprs.append('include_institutions=' + repr(self.include_institutions))
        if self.include_location_name_texts is not None:
            field_reprs.append('include_location_name_texts=' + repr(self.include_location_name_texts))
        if self.include_material_texts is not None:
            field_reprs.append('include_material_texts=' + repr(self.include_material_texts))
        if self.include_subject_term_texts is not None:
            field_reprs.append('include_subject_term_texts=' + repr(self.include_subject_term_texts))
        if self.include_technique_texts is not None:
            field_reprs.append('include_technique_texts=' + repr(self.include_technique_texts))
        if self.include_work_type_texts is not None:
            field_reprs.append('include_work_type_texts=' + repr(self.include_work_type_texts))
        return 'ObjectFacetFilters(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'exclude_agent_name_texts': self.exclude_agent_name_texts, 'exclude_all': self.exclude_all, 'exclude_categories': self.exclude_categories, 'exclude_collections': self.exclude_collections, 'exclude_color_texts': self.exclude_color_texts, 'exclude_cultural_context_texts': self.exclude_cultural_context_texts, 'exclude_genders': self.exclude_genders, 'exclude_institutions': self.exclude_institutions, 'exclude_location_name_texts': self.exclude_location_name_texts, 'exclude_material_texts': self.exclude_material_texts, 'exclude_subject_term_texts': self.exclude_subject_term_texts, 'exclude_technique_texts': self.exclude_technique_texts, 'exclude_work_type_texts': self.exclude_work_type_texts, 'include_agent_name_texts': self.include_agent_name_texts, 'include_categories': self.include_categories, 'include_collections': self.include_collections, 'include_color_texts': self.include_color_texts, 'include_cultural_context_texts': self.include_cultural_context_texts, 'include_genders': self.include_genders, 'include_institutions': self.include_institutions, 'include_location_name_texts': self.include_location_name_texts, 'include_material_texts': self.include_material_texts, 'include_subject_term_texts': self.include_subject_term_texts, 'include_technique_texts': self.include_technique_texts, 'include_work_type_texts': self.include_work_type_texts}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.exclude_agent_name_texts, self.exclude_all, self.exclude_categories, self.exclude_collections, self.exclude_color_texts, self.exclude_cultural_context_texts, self.exclude_genders, self.exclude_institutions, self.exclude_location_name_texts, self.exclude_material_texts, self.exclude_subject_term_texts, self.exclude_technique_texts, self.exclude_work_type_texts, self.include_agent_name_texts, self.include_categories, self.include_collections, self.include_color_texts, self.include_cultural_context_texts, self.include_genders, self.include_institutions, self.include_location_name_texts, self.include_material_texts, self.include_subject_term_texts, self.include_technique_texts, self.include_work_type_texts,)

    @property
    def exclude_agent_name_texts(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__exclude_agent_name_texts

    @property
    def exclude_all(self):
        '''
        :rtype: bool
        '''

        return self.__exclude_all

    @property
    def exclude_categories(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__exclude_categories

    @property
    def exclude_collections(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__exclude_collections

    @property
    def exclude_color_texts(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__exclude_color_texts

    @property
    def exclude_cultural_context_texts(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__exclude_cultural_context_texts

    @property
    def exclude_genders(self):
        '''
        :rtype: frozenset(costume.api.models.gender.gender.Gender)
        '''

        return self.__exclude_genders

    @property
    def exclude_institutions(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__exclude_institutions

    @property
    def exclude_location_name_texts(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__exclude_location_name_texts

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
    def exclude_technique_texts(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__exclude_technique_texts

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
    def include_collections(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__include_collections

    @property
    def include_color_texts(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__include_color_texts

    @property
    def include_cultural_context_texts(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__include_cultural_context_texts

    @property
    def include_genders(self):
        '''
        :rtype: frozenset(costume.api.models.gender.gender.Gender)
        '''

        return self.__include_genders

    @property
    def include_institutions(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__include_institutions

    @property
    def include_location_name_texts(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__include_location_name_texts

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
    def include_technique_texts(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__include_technique_texts

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
            elif ifield_name == 'exclude_all':
                try:
                    init_kwds['exclude_all'] = iprot.read_bool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'exclude_categories':
                init_kwds['exclude_categories'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'exclude_collections':
                init_kwds['exclude_collections'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'exclude_color_texts':
                init_kwds['exclude_color_texts'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'exclude_cultural_context_texts':
                init_kwds['exclude_cultural_context_texts'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'exclude_genders':
                init_kwds['exclude_genders'] = frozenset([costume.api.models.gender.gender.Gender.value_of(iprot.read_string().strip().upper()) for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'exclude_institutions':
                init_kwds['exclude_institutions'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'exclude_location_name_texts':
                init_kwds['exclude_location_name_texts'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'exclude_material_texts':
                init_kwds['exclude_material_texts'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'exclude_subject_term_texts':
                init_kwds['exclude_subject_term_texts'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'exclude_technique_texts':
                init_kwds['exclude_technique_texts'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'exclude_work_type_texts':
                init_kwds['exclude_work_type_texts'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'include_agent_name_texts':
                init_kwds['include_agent_name_texts'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'include_categories':
                init_kwds['include_categories'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'include_collections':
                init_kwds['include_collections'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'include_color_texts':
                init_kwds['include_color_texts'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'include_cultural_context_texts':
                init_kwds['include_cultural_context_texts'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'include_genders':
                init_kwds['include_genders'] = frozenset([costume.api.models.gender.gender.Gender.value_of(iprot.read_string().strip().upper()) for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'include_institutions':
                init_kwds['include_institutions'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'include_location_name_texts':
                init_kwds['include_location_name_texts'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'include_material_texts':
                init_kwds['include_material_texts'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'include_subject_term_texts':
                init_kwds['include_subject_term_texts'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'include_technique_texts':
                init_kwds['include_technique_texts'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'include_work_type_texts':
                init_kwds['include_work_type_texts'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        exclude_agent_name_texts=None,
        exclude_all=None,
        exclude_categories=None,
        exclude_collections=None,
        exclude_color_texts=None,
        exclude_cultural_context_texts=None,
        exclude_genders=None,
        exclude_institutions=None,
        exclude_location_name_texts=None,
        exclude_material_texts=None,
        exclude_subject_term_texts=None,
        exclude_technique_texts=None,
        exclude_work_type_texts=None,
        include_agent_name_texts=None,
        include_categories=None,
        include_collections=None,
        include_color_texts=None,
        include_cultural_context_texts=None,
        include_genders=None,
        include_institutions=None,
        include_location_name_texts=None,
        include_material_texts=None,
        include_subject_term_texts=None,
        include_technique_texts=None,
        include_work_type_texts=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type exclude_agent_name_texts: frozenset(str) or None
        :type exclude_all: bool or None
        :type exclude_categories: frozenset(str) or None
        :type exclude_collections: frozenset(str) or None
        :type exclude_color_texts: frozenset(str) or None
        :type exclude_cultural_context_texts: frozenset(str) or None
        :type exclude_genders: frozenset(costume.api.models.gender.gender.Gender) or None
        :type exclude_institutions: frozenset(str) or None
        :type exclude_location_name_texts: frozenset(str) or None
        :type exclude_material_texts: frozenset(str) or None
        :type exclude_subject_term_texts: frozenset(str) or None
        :type exclude_technique_texts: frozenset(str) or None
        :type exclude_work_type_texts: frozenset(str) or None
        :type include_agent_name_texts: frozenset(str) or None
        :type include_categories: frozenset(str) or None
        :type include_collections: frozenset(str) or None
        :type include_color_texts: frozenset(str) or None
        :type include_cultural_context_texts: frozenset(str) or None
        :type include_genders: frozenset(costume.api.models.gender.gender.Gender) or None
        :type include_institutions: frozenset(str) or None
        :type include_location_name_texts: frozenset(str) or None
        :type include_material_texts: frozenset(str) or None
        :type include_subject_term_texts: frozenset(str) or None
        :type include_technique_texts: frozenset(str) or None
        :type include_work_type_texts: frozenset(str) or None
        :rtype: costume.api.services.object.object_facet_filters.ObjectFacetFilters
        '''

        if exclude_agent_name_texts is None:
            exclude_agent_name_texts = self.exclude_agent_name_texts
        if exclude_all is None:
            exclude_all = self.exclude_all
        if exclude_categories is None:
            exclude_categories = self.exclude_categories
        if exclude_collections is None:
            exclude_collections = self.exclude_collections
        if exclude_color_texts is None:
            exclude_color_texts = self.exclude_color_texts
        if exclude_cultural_context_texts is None:
            exclude_cultural_context_texts = self.exclude_cultural_context_texts
        if exclude_genders is None:
            exclude_genders = self.exclude_genders
        if exclude_institutions is None:
            exclude_institutions = self.exclude_institutions
        if exclude_location_name_texts is None:
            exclude_location_name_texts = self.exclude_location_name_texts
        if exclude_material_texts is None:
            exclude_material_texts = self.exclude_material_texts
        if exclude_subject_term_texts is None:
            exclude_subject_term_texts = self.exclude_subject_term_texts
        if exclude_technique_texts is None:
            exclude_technique_texts = self.exclude_technique_texts
        if exclude_work_type_texts is None:
            exclude_work_type_texts = self.exclude_work_type_texts
        if include_agent_name_texts is None:
            include_agent_name_texts = self.include_agent_name_texts
        if include_categories is None:
            include_categories = self.include_categories
        if include_collections is None:
            include_collections = self.include_collections
        if include_color_texts is None:
            include_color_texts = self.include_color_texts
        if include_cultural_context_texts is None:
            include_cultural_context_texts = self.include_cultural_context_texts
        if include_genders is None:
            include_genders = self.include_genders
        if include_institutions is None:
            include_institutions = self.include_institutions
        if include_location_name_texts is None:
            include_location_name_texts = self.include_location_name_texts
        if include_material_texts is None:
            include_material_texts = self.include_material_texts
        if include_subject_term_texts is None:
            include_subject_term_texts = self.include_subject_term_texts
        if include_technique_texts is None:
            include_technique_texts = self.include_technique_texts
        if include_work_type_texts is None:
            include_work_type_texts = self.include_work_type_texts
        return self.__class__(exclude_agent_name_texts=exclude_agent_name_texts, exclude_all=exclude_all, exclude_categories=exclude_categories, exclude_collections=exclude_collections, exclude_color_texts=exclude_color_texts, exclude_cultural_context_texts=exclude_cultural_context_texts, exclude_genders=exclude_genders, exclude_institutions=exclude_institutions, exclude_location_name_texts=exclude_location_name_texts, exclude_material_texts=exclude_material_texts, exclude_subject_term_texts=exclude_subject_term_texts, exclude_technique_texts=exclude_technique_texts, exclude_work_type_texts=exclude_work_type_texts, include_agent_name_texts=include_agent_name_texts, include_categories=include_categories, include_collections=include_collections, include_color_texts=include_color_texts, include_cultural_context_texts=include_cultural_context_texts, include_genders=include_genders, include_institutions=include_institutions, include_location_name_texts=include_location_name_texts, include_material_texts=include_material_texts, include_subject_term_texts=include_subject_term_texts, include_technique_texts=include_technique_texts, include_work_type_texts=include_work_type_texts)

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

        if self.exclude_all is not None:
            oprot.write_field_begin(name='exclude_all', type=2, id=None)
            oprot.write_bool(self.exclude_all)
            oprot.write_field_end()

        if self.exclude_categories is not None:
            oprot.write_field_begin(name='exclude_categories', type=14, id=None)
            oprot.write_set_begin(11, len(self.exclude_categories))
            for _0 in self.exclude_categories:
                oprot.write_string(_0)
            oprot.write_set_end()
            oprot.write_field_end()

        if self.exclude_collections is not None:
            oprot.write_field_begin(name='exclude_collections', type=14, id=None)
            oprot.write_set_begin(11, len(self.exclude_collections))
            for _0 in self.exclude_collections:
                oprot.write_string(_0)
            oprot.write_set_end()
            oprot.write_field_end()

        if self.exclude_color_texts is not None:
            oprot.write_field_begin(name='exclude_color_texts', type=14, id=None)
            oprot.write_set_begin(11, len(self.exclude_color_texts))
            for _0 in self.exclude_color_texts:
                oprot.write_string(_0)
            oprot.write_set_end()
            oprot.write_field_end()

        if self.exclude_cultural_context_texts is not None:
            oprot.write_field_begin(name='exclude_cultural_context_texts', type=14, id=None)
            oprot.write_set_begin(11, len(self.exclude_cultural_context_texts))
            for _0 in self.exclude_cultural_context_texts:
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

        if self.exclude_institutions is not None:
            oprot.write_field_begin(name='exclude_institutions', type=14, id=None)
            oprot.write_set_begin(11, len(self.exclude_institutions))
            for _0 in self.exclude_institutions:
                oprot.write_string(_0)
            oprot.write_set_end()
            oprot.write_field_end()

        if self.exclude_location_name_texts is not None:
            oprot.write_field_begin(name='exclude_location_name_texts', type=14, id=None)
            oprot.write_set_begin(11, len(self.exclude_location_name_texts))
            for _0 in self.exclude_location_name_texts:
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

        if self.exclude_technique_texts is not None:
            oprot.write_field_begin(name='exclude_technique_texts', type=14, id=None)
            oprot.write_set_begin(11, len(self.exclude_technique_texts))
            for _0 in self.exclude_technique_texts:
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

        if self.include_collections is not None:
            oprot.write_field_begin(name='include_collections', type=14, id=None)
            oprot.write_set_begin(11, len(self.include_collections))
            for _0 in self.include_collections:
                oprot.write_string(_0)
            oprot.write_set_end()
            oprot.write_field_end()

        if self.include_color_texts is not None:
            oprot.write_field_begin(name='include_color_texts', type=14, id=None)
            oprot.write_set_begin(11, len(self.include_color_texts))
            for _0 in self.include_color_texts:
                oprot.write_string(_0)
            oprot.write_set_end()
            oprot.write_field_end()

        if self.include_cultural_context_texts is not None:
            oprot.write_field_begin(name='include_cultural_context_texts', type=14, id=None)
            oprot.write_set_begin(11, len(self.include_cultural_context_texts))
            for _0 in self.include_cultural_context_texts:
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

        if self.include_institutions is not None:
            oprot.write_field_begin(name='include_institutions', type=14, id=None)
            oprot.write_set_begin(11, len(self.include_institutions))
            for _0 in self.include_institutions:
                oprot.write_string(_0)
            oprot.write_set_end()
            oprot.write_field_end()

        if self.include_location_name_texts is not None:
            oprot.write_field_begin(name='include_location_name_texts', type=14, id=None)
            oprot.write_set_begin(11, len(self.include_location_name_texts))
            for _0 in self.include_location_name_texts:
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

        if self.include_technique_texts is not None:
            oprot.write_field_begin(name='include_technique_texts', type=14, id=None)
            oprot.write_set_begin(11, len(self.include_technique_texts))
            for _0 in self.include_technique_texts:
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
