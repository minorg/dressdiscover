from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.vocabularies.costume_core.gender.gender


class ObjectFacets(object):
    class Builder(object):
        def __init__(
            self,
            categories=None,
            collections=None,
            color_texts=None,
            cultural_context_texts=None,
            genders=None,
            institutions=None,
            location_name_texts=None,
            material_texts=None,
            subject_term_texts=None,
            technique_texts=None,
            work_type_texts=None,
        ):
            '''
            :type categories: dict(str: int)
            :type collections: dict(str: int)
            :type color_texts: dict(str: int)
            :type cultural_context_texts: dict(str: int)
            :type genders: dict(dressdiscover.api.vocabularies.costume_core.gender.gender.Gender: int)
            :type institutions: dict(str: int)
            :type location_name_texts: dict(str: int)
            :type material_texts: dict(str: int)
            :type subject_term_texts: dict(str: int)
            :type technique_texts: dict(str: int)
            :type work_type_texts: dict(str: int)
            '''

            self.__categories = categories
            self.__collections = collections
            self.__color_texts = color_texts
            self.__cultural_context_texts = cultural_context_texts
            self.__genders = genders
            self.__institutions = institutions
            self.__location_name_texts = location_name_texts
            self.__material_texts = material_texts
            self.__subject_term_texts = subject_term_texts
            self.__technique_texts = technique_texts
            self.__work_type_texts = work_type_texts

        def build(self):
            return ObjectFacets(categories=self.__categories, collections=self.__collections, color_texts=self.__color_texts, cultural_context_texts=self.__cultural_context_texts, genders=self.__genders, institutions=self.__institutions, location_name_texts=self.__location_name_texts, material_texts=self.__material_texts, subject_term_texts=self.__subject_term_texts, technique_texts=self.__technique_texts, work_type_texts=self.__work_type_texts)

        @property
        def categories(self):
            '''
            :rtype: dict(str: int)
            '''

            return self.__categories.copy() if self.__categories is not None else None

        @property
        def collections(self):
            '''
            :rtype: dict(str: int)
            '''

            return self.__collections.copy() if self.__collections is not None else None

        @property
        def color_texts(self):
            '''
            :rtype: dict(str: int)
            '''

            return self.__color_texts.copy() if self.__color_texts is not None else None

        @property
        def cultural_context_texts(self):
            '''
            :rtype: dict(str: int)
            '''

            return self.__cultural_context_texts.copy() if self.__cultural_context_texts is not None else None

        @property
        def genders(self):
            '''
            :rtype: dict(dressdiscover.api.vocabularies.costume_core.gender.gender.Gender: int)
            '''

            return self.__genders.copy() if self.__genders is not None else None

        @property
        def institutions(self):
            '''
            :rtype: dict(str: int)
            '''

            return self.__institutions.copy() if self.__institutions is not None else None

        @property
        def location_name_texts(self):
            '''
            :rtype: dict(str: int)
            '''

            return self.__location_name_texts.copy() if self.__location_name_texts is not None else None

        @property
        def material_texts(self):
            '''
            :rtype: dict(str: int)
            '''

            return self.__material_texts.copy() if self.__material_texts is not None else None

        def set_categories(self, categories):
            '''
            :type categories: dict(str: int)
            '''

            if categories is None:
                raise ValueError('categories is required')
            if not (isinstance(categories, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], int), categories.iteritems()))) == 0):
                raise TypeError("expected categories to be a dict(str: int) but it is a %s" % getattr(__builtin__, 'type')(categories))
            self.__categories = categories
            return self

        def set_collections(self, collections):
            '''
            :type collections: dict(str: int)
            '''

            if collections is None:
                raise ValueError('collections is required')
            if not (isinstance(collections, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], int), collections.iteritems()))) == 0):
                raise TypeError("expected collections to be a dict(str: int) but it is a %s" % getattr(__builtin__, 'type')(collections))
            self.__collections = collections
            return self

        def set_color_texts(self, color_texts):
            '''
            :type color_texts: dict(str: int)
            '''

            if color_texts is None:
                raise ValueError('color_texts is required')
            if not (isinstance(color_texts, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], int), color_texts.iteritems()))) == 0):
                raise TypeError("expected color_texts to be a dict(str: int) but it is a %s" % getattr(__builtin__, 'type')(color_texts))
            self.__color_texts = color_texts
            return self

        def set_cultural_context_texts(self, cultural_context_texts):
            '''
            :type cultural_context_texts: dict(str: int)
            '''

            if cultural_context_texts is None:
                raise ValueError('cultural_context_texts is required')
            if not (isinstance(cultural_context_texts, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], int), cultural_context_texts.iteritems()))) == 0):
                raise TypeError("expected cultural_context_texts to be a dict(str: int) but it is a %s" % getattr(__builtin__, 'type')(cultural_context_texts))
            self.__cultural_context_texts = cultural_context_texts
            return self

        def set_genders(self, genders):
            '''
            :type genders: dict(dressdiscover.api.vocabularies.costume_core.gender.gender.Gender: int)
            '''

            if genders is None:
                raise ValueError('genders is required')
            if not (isinstance(genders, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], dressdiscover.api.vocabularies.costume_core.gender.gender.Gender) and isinstance(__item[1], int), genders.iteritems()))) == 0):
                raise TypeError("expected genders to be a dict(dressdiscover.api.vocabularies.costume_core.gender.gender.Gender: int) but it is a %s" % getattr(__builtin__, 'type')(genders))
            self.__genders = genders
            return self

        def set_institutions(self, institutions):
            '''
            :type institutions: dict(str: int)
            '''

            if institutions is None:
                raise ValueError('institutions is required')
            if not (isinstance(institutions, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], int), institutions.iteritems()))) == 0):
                raise TypeError("expected institutions to be a dict(str: int) but it is a %s" % getattr(__builtin__, 'type')(institutions))
            self.__institutions = institutions
            return self

        def set_location_name_texts(self, location_name_texts):
            '''
            :type location_name_texts: dict(str: int)
            '''

            if location_name_texts is None:
                raise ValueError('location_name_texts is required')
            if not (isinstance(location_name_texts, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], int), location_name_texts.iteritems()))) == 0):
                raise TypeError("expected location_name_texts to be a dict(str: int) but it is a %s" % getattr(__builtin__, 'type')(location_name_texts))
            self.__location_name_texts = location_name_texts
            return self

        def set_material_texts(self, material_texts):
            '''
            :type material_texts: dict(str: int)
            '''

            if material_texts is None:
                raise ValueError('material_texts is required')
            if not (isinstance(material_texts, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], int), material_texts.iteritems()))) == 0):
                raise TypeError("expected material_texts to be a dict(str: int) but it is a %s" % getattr(__builtin__, 'type')(material_texts))
            self.__material_texts = material_texts
            return self

        def set_subject_term_texts(self, subject_term_texts):
            '''
            :type subject_term_texts: dict(str: int)
            '''

            if subject_term_texts is None:
                raise ValueError('subject_term_texts is required')
            if not (isinstance(subject_term_texts, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], int), subject_term_texts.iteritems()))) == 0):
                raise TypeError("expected subject_term_texts to be a dict(str: int) but it is a %s" % getattr(__builtin__, 'type')(subject_term_texts))
            self.__subject_term_texts = subject_term_texts
            return self

        def set_technique_texts(self, technique_texts):
            '''
            :type technique_texts: dict(str: int)
            '''

            if technique_texts is None:
                raise ValueError('technique_texts is required')
            if not (isinstance(technique_texts, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], int), technique_texts.iteritems()))) == 0):
                raise TypeError("expected technique_texts to be a dict(str: int) but it is a %s" % getattr(__builtin__, 'type')(technique_texts))
            self.__technique_texts = technique_texts
            return self

        def set_work_type_texts(self, work_type_texts):
            '''
            :type work_type_texts: dict(str: int)
            '''

            if work_type_texts is None:
                raise ValueError('work_type_texts is required')
            if not (isinstance(work_type_texts, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], int), work_type_texts.iteritems()))) == 0):
                raise TypeError("expected work_type_texts to be a dict(str: int) but it is a %s" % getattr(__builtin__, 'type')(work_type_texts))
            self.__work_type_texts = work_type_texts
            return self

        @property
        def subject_term_texts(self):
            '''
            :rtype: dict(str: int)
            '''

            return self.__subject_term_texts.copy() if self.__subject_term_texts is not None else None

        @property
        def technique_texts(self):
            '''
            :rtype: dict(str: int)
            '''

            return self.__technique_texts.copy() if self.__technique_texts is not None else None

        def update(self, object_facets):
            '''
            :type categories: dict(str: int)
            :type collections: dict(str: int)
            :type color_texts: dict(str: int)
            :type cultural_context_texts: dict(str: int)
            :type genders: dict(dressdiscover.api.vocabularies.costume_core.gender.gender.Gender: int)
            :type institutions: dict(str: int)
            :type location_name_texts: dict(str: int)
            :type material_texts: dict(str: int)
            :type subject_term_texts: dict(str: int)
            :type technique_texts: dict(str: int)
            :type work_type_texts: dict(str: int)
            '''

            if isinstance(object_facets, ObjectFacets):
                self.set_categories(object_facets.categories)
                self.set_collections(object_facets.collections)
                self.set_color_texts(object_facets.color_texts)
                self.set_cultural_context_texts(object_facets.cultural_context_texts)
                self.set_genders(object_facets.genders)
                self.set_institutions(object_facets.institutions)
                self.set_location_name_texts(object_facets.location_name_texts)
                self.set_material_texts(object_facets.material_texts)
                self.set_subject_term_texts(object_facets.subject_term_texts)
                self.set_technique_texts(object_facets.technique_texts)
                self.set_work_type_texts(object_facets.work_type_texts)
            elif isinstance(object_facets, dict):
                for key, value in object_facets.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(object_facets)
            return self

        @property
        def work_type_texts(self):
            '''
            :rtype: dict(str: int)
            '''

            return self.__work_type_texts.copy() if self.__work_type_texts is not None else None

        @categories.setter
        def categories(self, categories):
            '''
            :type categories: dict(str: int)
            '''

            self.set_categories(categories)

        @collections.setter
        def collections(self, collections):
            '''
            :type collections: dict(str: int)
            '''

            self.set_collections(collections)

        @color_texts.setter
        def color_texts(self, color_texts):
            '''
            :type color_texts: dict(str: int)
            '''

            self.set_color_texts(color_texts)

        @cultural_context_texts.setter
        def cultural_context_texts(self, cultural_context_texts):
            '''
            :type cultural_context_texts: dict(str: int)
            '''

            self.set_cultural_context_texts(cultural_context_texts)

        @genders.setter
        def genders(self, genders):
            '''
            :type genders: dict(dressdiscover.api.vocabularies.costume_core.gender.gender.Gender: int)
            '''

            self.set_genders(genders)

        @institutions.setter
        def institutions(self, institutions):
            '''
            :type institutions: dict(str: int)
            '''

            self.set_institutions(institutions)

        @location_name_texts.setter
        def location_name_texts(self, location_name_texts):
            '''
            :type location_name_texts: dict(str: int)
            '''

            self.set_location_name_texts(location_name_texts)

        @material_texts.setter
        def material_texts(self, material_texts):
            '''
            :type material_texts: dict(str: int)
            '''

            self.set_material_texts(material_texts)

        @subject_term_texts.setter
        def subject_term_texts(self, subject_term_texts):
            '''
            :type subject_term_texts: dict(str: int)
            '''

            self.set_subject_term_texts(subject_term_texts)

        @technique_texts.setter
        def technique_texts(self, technique_texts):
            '''
            :type technique_texts: dict(str: int)
            '''

            self.set_technique_texts(technique_texts)

        @work_type_texts.setter
        def work_type_texts(self, work_type_texts):
            '''
            :type work_type_texts: dict(str: int)
            '''

            self.set_work_type_texts(work_type_texts)

    class FieldMetadata(object):
        CATEGORIES = None
        COLLECTIONS = None
        COLOR_TEXTS = None
        CULTURAL_CONTEXT_TEXTS = None
        GENDERS = None
        INSTITUTIONS = None
        LOCATION_NAME_TEXTS = None
        MATERIAL_TEXTS = None
        SUBJECT_TERM_TEXTS = None
        TECHNIQUE_TEXTS = None
        WORK_TYPE_TEXTS = None

        def __init__(self, name, type_, validation):
            object.__init__(self)
            self.__name = name
            self.__type = type_
            self.__validation = validation

        def __repr__(self):
            return self.__name

        @property
        def type(self):
            return self.__type

        @property
        def validation(self):
            return self.__validation

        @classmethod
        def values(cls):
            return (cls.CATEGORIES, cls.COLLECTIONS, cls.COLOR_TEXTS, cls.CULTURAL_CONTEXT_TEXTS, cls.GENDERS, cls.INSTITUTIONS, cls.LOCATION_NAME_TEXTS, cls.MATERIAL_TEXTS, cls.SUBJECT_TERM_TEXTS, cls.TECHNIQUE_TEXTS, cls.WORK_TYPE_TEXTS,)

    FieldMetadata.CATEGORIES = FieldMetadata('categories', dict, None)
    FieldMetadata.COLLECTIONS = FieldMetadata('collections', dict, None)
    FieldMetadata.COLOR_TEXTS = FieldMetadata('color_texts', dict, None)
    FieldMetadata.CULTURAL_CONTEXT_TEXTS = FieldMetadata('cultural_context_texts', dict, None)
    FieldMetadata.GENDERS = FieldMetadata('genders', dict, None)
    FieldMetadata.INSTITUTIONS = FieldMetadata('institutions', dict, None)
    FieldMetadata.LOCATION_NAME_TEXTS = FieldMetadata('location_name_texts', dict, None)
    FieldMetadata.MATERIAL_TEXTS = FieldMetadata('material_texts', dict, None)
    FieldMetadata.SUBJECT_TERM_TEXTS = FieldMetadata('subject_term_texts', dict, None)
    FieldMetadata.TECHNIQUE_TEXTS = FieldMetadata('technique_texts', dict, None)
    FieldMetadata.WORK_TYPE_TEXTS = FieldMetadata('work_type_texts', dict, None)

    def __init__(
        self,
        categories,
        collections,
        color_texts,
        cultural_context_texts,
        genders,
        institutions,
        location_name_texts,
        material_texts,
        subject_term_texts,
        technique_texts,
        work_type_texts,
    ):
        '''
        :type categories: dict(str: int)
        :type collections: dict(str: int)
        :type color_texts: dict(str: int)
        :type cultural_context_texts: dict(str: int)
        :type genders: dict(dressdiscover.api.vocabularies.costume_core.gender.gender.Gender: int)
        :type institutions: dict(str: int)
        :type location_name_texts: dict(str: int)
        :type material_texts: dict(str: int)
        :type subject_term_texts: dict(str: int)
        :type technique_texts: dict(str: int)
        :type work_type_texts: dict(str: int)
        '''

        if categories is None:
            raise ValueError('categories is required')
        if not (isinstance(categories, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], int), categories.iteritems()))) == 0):
            raise TypeError("expected categories to be a dict(str: int) but it is a %s" % getattr(__builtin__, 'type')(categories))
        self.__categories = categories.copy() if categories is not None else None

        if collections is None:
            raise ValueError('collections is required')
        if not (isinstance(collections, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], int), collections.iteritems()))) == 0):
            raise TypeError("expected collections to be a dict(str: int) but it is a %s" % getattr(__builtin__, 'type')(collections))
        self.__collections = collections.copy() if collections is not None else None

        if color_texts is None:
            raise ValueError('color_texts is required')
        if not (isinstance(color_texts, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], int), color_texts.iteritems()))) == 0):
            raise TypeError("expected color_texts to be a dict(str: int) but it is a %s" % getattr(__builtin__, 'type')(color_texts))
        self.__color_texts = color_texts.copy() if color_texts is not None else None

        if cultural_context_texts is None:
            raise ValueError('cultural_context_texts is required')
        if not (isinstance(cultural_context_texts, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], int), cultural_context_texts.iteritems()))) == 0):
            raise TypeError("expected cultural_context_texts to be a dict(str: int) but it is a %s" % getattr(__builtin__, 'type')(cultural_context_texts))
        self.__cultural_context_texts = cultural_context_texts.copy() if cultural_context_texts is not None else None

        if genders is None:
            raise ValueError('genders is required')
        if not (isinstance(genders, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], dressdiscover.api.vocabularies.costume_core.gender.gender.Gender) and isinstance(__item[1], int), genders.iteritems()))) == 0):
            raise TypeError("expected genders to be a dict(dressdiscover.api.vocabularies.costume_core.gender.gender.Gender: int) but it is a %s" % getattr(__builtin__, 'type')(genders))
        self.__genders = genders.copy() if genders is not None else None

        if institutions is None:
            raise ValueError('institutions is required')
        if not (isinstance(institutions, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], int), institutions.iteritems()))) == 0):
            raise TypeError("expected institutions to be a dict(str: int) but it is a %s" % getattr(__builtin__, 'type')(institutions))
        self.__institutions = institutions.copy() if institutions is not None else None

        if location_name_texts is None:
            raise ValueError('location_name_texts is required')
        if not (isinstance(location_name_texts, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], int), location_name_texts.iteritems()))) == 0):
            raise TypeError("expected location_name_texts to be a dict(str: int) but it is a %s" % getattr(__builtin__, 'type')(location_name_texts))
        self.__location_name_texts = location_name_texts.copy() if location_name_texts is not None else None

        if material_texts is None:
            raise ValueError('material_texts is required')
        if not (isinstance(material_texts, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], int), material_texts.iteritems()))) == 0):
            raise TypeError("expected material_texts to be a dict(str: int) but it is a %s" % getattr(__builtin__, 'type')(material_texts))
        self.__material_texts = material_texts.copy() if material_texts is not None else None

        if subject_term_texts is None:
            raise ValueError('subject_term_texts is required')
        if not (isinstance(subject_term_texts, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], int), subject_term_texts.iteritems()))) == 0):
            raise TypeError("expected subject_term_texts to be a dict(str: int) but it is a %s" % getattr(__builtin__, 'type')(subject_term_texts))
        self.__subject_term_texts = subject_term_texts.copy() if subject_term_texts is not None else None

        if technique_texts is None:
            raise ValueError('technique_texts is required')
        if not (isinstance(technique_texts, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], int), technique_texts.iteritems()))) == 0):
            raise TypeError("expected technique_texts to be a dict(str: int) but it is a %s" % getattr(__builtin__, 'type')(technique_texts))
        self.__technique_texts = technique_texts.copy() if technique_texts is not None else None

        if work_type_texts is None:
            raise ValueError('work_type_texts is required')
        if not (isinstance(work_type_texts, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], int), work_type_texts.iteritems()))) == 0):
            raise TypeError("expected work_type_texts to be a dict(str: int) but it is a %s" % getattr(__builtin__, 'type')(work_type_texts))
        self.__work_type_texts = work_type_texts.copy() if work_type_texts is not None else None

    def __eq__(self, other):
        if self.categories != other.categories:
            return False
        if self.collections != other.collections:
            return False
        if self.color_texts != other.color_texts:
            return False
        if self.cultural_context_texts != other.cultural_context_texts:
            return False
        if self.genders != other.genders:
            return False
        if self.institutions != other.institutions:
            return False
        if self.location_name_texts != other.location_name_texts:
            return False
        if self.material_texts != other.material_texts:
            return False
        if self.subject_term_texts != other.subject_term_texts:
            return False
        if self.technique_texts != other.technique_texts:
            return False
        if self.work_type_texts != other.work_type_texts:
            return False
        return True

    def __hash__(self):
        return hash((self.categories,self.collections,self.color_texts,self.cultural_context_texts,self.genders,self.institutions,self.location_name_texts,self.material_texts,self.subject_term_texts,self.technique_texts,self.work_type_texts,))

    def __iter__(self):
        return iter((self.categories, self.collections, self.color_texts, self.cultural_context_texts, self.genders, self.institutions, self.location_name_texts, self.material_texts, self.subject_term_texts, self.technique_texts, self.work_type_texts,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('categories=' + repr(self.categories))
        field_reprs.append('collections=' + repr(self.collections))
        field_reprs.append('color_texts=' + repr(self.color_texts))
        field_reprs.append('cultural_context_texts=' + repr(self.cultural_context_texts))
        field_reprs.append('genders=' + repr(self.genders))
        field_reprs.append('institutions=' + repr(self.institutions))
        field_reprs.append('location_name_texts=' + repr(self.location_name_texts))
        field_reprs.append('material_texts=' + repr(self.material_texts))
        field_reprs.append('subject_term_texts=' + repr(self.subject_term_texts))
        field_reprs.append('technique_texts=' + repr(self.technique_texts))
        field_reprs.append('work_type_texts=' + repr(self.work_type_texts))
        return 'ObjectFacets(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('categories=' + repr(self.categories))
        field_reprs.append('collections=' + repr(self.collections))
        field_reprs.append('color_texts=' + repr(self.color_texts))
        field_reprs.append('cultural_context_texts=' + repr(self.cultural_context_texts))
        field_reprs.append('genders=' + repr(self.genders))
        field_reprs.append('institutions=' + repr(self.institutions))
        field_reprs.append('location_name_texts=' + repr(self.location_name_texts))
        field_reprs.append('material_texts=' + repr(self.material_texts))
        field_reprs.append('subject_term_texts=' + repr(self.subject_term_texts))
        field_reprs.append('technique_texts=' + repr(self.technique_texts))
        field_reprs.append('work_type_texts=' + repr(self.work_type_texts))
        return 'ObjectFacets(' + ', '.join(field_reprs) + ')'

    @property
    def categories(self):
        '''
        :rtype: dict(str: int)
        '''

        return self.__categories.copy() if self.__categories is not None else None

    @property
    def collections(self):
        '''
        :rtype: dict(str: int)
        '''

        return self.__collections.copy() if self.__collections is not None else None

    @property
    def color_texts(self):
        '''
        :rtype: dict(str: int)
        '''

        return self.__color_texts.copy() if self.__color_texts is not None else None

    @property
    def cultural_context_texts(self):
        '''
        :rtype: dict(str: int)
        '''

        return self.__cultural_context_texts.copy() if self.__cultural_context_texts is not None else None

    @property
    def genders(self):
        '''
        :rtype: dict(dressdiscover.api.vocabularies.costume_core.gender.gender.Gender: int)
        '''

        return self.__genders.copy() if self.__genders is not None else None

    @property
    def institutions(self):
        '''
        :rtype: dict(str: int)
        '''

        return self.__institutions.copy() if self.__institutions is not None else None

    @property
    def location_name_texts(self):
        '''
        :rtype: dict(str: int)
        '''

        return self.__location_name_texts.copy() if self.__location_name_texts is not None else None

    @property
    def material_texts(self):
        '''
        :rtype: dict(str: int)
        '''

        return self.__material_texts.copy() if self.__material_texts is not None else None

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.object.object_facets.ObjectFacets
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'categories':
                init_kwds['categories'] = dict([(iprot.read_string(), iprot.read_i32()) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            elif ifield_name == 'collections':
                init_kwds['collections'] = dict([(dressdiscover.api.models.collection.collection_id.CollectionId.parse(iprot.read_string()), iprot.read_i32()) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            elif ifield_name == 'color_texts':
                init_kwds['color_texts'] = dict([(iprot.read_string(), iprot.read_i32()) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            elif ifield_name == 'cultural_context_texts':
                init_kwds['cultural_context_texts'] = dict([(iprot.read_string(), iprot.read_i32()) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            elif ifield_name == 'genders':
                init_kwds['genders'] = dict([(dressdiscover.api.vocabularies.costume_core.gender.gender.Gender.value_of(iprot.read_string().strip().upper()), iprot.read_i32()) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            elif ifield_name == 'institutions':
                init_kwds['institutions'] = dict([(dressdiscover.api.models.institution.institution_id.InstitutionId.parse(iprot.read_string()), iprot.read_i32()) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            elif ifield_name == 'location_name_texts':
                init_kwds['location_name_texts'] = dict([(iprot.read_string(), iprot.read_i32()) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            elif ifield_name == 'material_texts':
                init_kwds['material_texts'] = dict([(iprot.read_string(), iprot.read_i32()) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            elif ifield_name == 'subject_term_texts':
                init_kwds['subject_term_texts'] = dict([(iprot.read_string(), iprot.read_i32()) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            elif ifield_name == 'technique_texts':
                init_kwds['technique_texts'] = dict([(iprot.read_string(), iprot.read_i32()) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            elif ifield_name == 'work_type_texts':
                init_kwds['work_type_texts'] = dict([(iprot.read_string(), iprot.read_i32()) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        categories=None,
        collections=None,
        color_texts=None,
        cultural_context_texts=None,
        genders=None,
        institutions=None,
        location_name_texts=None,
        material_texts=None,
        subject_term_texts=None,
        technique_texts=None,
        work_type_texts=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type categories: dict(str: int) or None
        :type collections: dict(str: int) or None
        :type color_texts: dict(str: int) or None
        :type cultural_context_texts: dict(str: int) or None
        :type genders: dict(dressdiscover.api.vocabularies.costume_core.gender.gender.Gender: int) or None
        :type institutions: dict(str: int) or None
        :type location_name_texts: dict(str: int) or None
        :type material_texts: dict(str: int) or None
        :type subject_term_texts: dict(str: int) or None
        :type technique_texts: dict(str: int) or None
        :type work_type_texts: dict(str: int) or None
        :rtype: dressdiscover.api.models.object.object_facets.ObjectFacets
        '''

        if categories is None:
            categories = self.categories
        if collections is None:
            collections = self.collections
        if color_texts is None:
            color_texts = self.color_texts
        if cultural_context_texts is None:
            cultural_context_texts = self.cultural_context_texts
        if genders is None:
            genders = self.genders
        if institutions is None:
            institutions = self.institutions
        if location_name_texts is None:
            location_name_texts = self.location_name_texts
        if material_texts is None:
            material_texts = self.material_texts
        if subject_term_texts is None:
            subject_term_texts = self.subject_term_texts
        if technique_texts is None:
            technique_texts = self.technique_texts
        if work_type_texts is None:
            work_type_texts = self.work_type_texts
        return self.__class__(categories=categories, collections=collections, color_texts=color_texts, cultural_context_texts=cultural_context_texts, genders=genders, institutions=institutions, location_name_texts=location_name_texts, material_texts=material_texts, subject_term_texts=subject_term_texts, technique_texts=technique_texts, work_type_texts=work_type_texts)

    @property
    def subject_term_texts(self):
        '''
        :rtype: dict(str: int)
        '''

        return self.__subject_term_texts.copy() if self.__subject_term_texts is not None else None

    @property
    def technique_texts(self):
        '''
        :rtype: dict(str: int)
        '''

        return self.__technique_texts.copy() if self.__technique_texts is not None else None

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
        :rtype: dressdiscover.api.models.object.object_facets.ObjectFacets
        '''

        oprot.write_struct_begin('ObjectFacets')

        oprot.write_field_begin(name='categories', type=13, id=None)
        oprot.write_map_begin(11, len(self.categories), 8)
        for __key0, __value0 in self.categories.iteritems():
            oprot.write_string(__key0)
            oprot.write_i32(__value0)
        oprot.write_map_end()
        oprot.write_field_end()

        oprot.write_field_begin(name='collections', type=13, id=None)
        oprot.write_map_begin(11, len(self.collections), 8)
        for __key0, __value0 in self.collections.iteritems():
            oprot.write_string(__key0)
            oprot.write_i32(__value0)
        oprot.write_map_end()
        oprot.write_field_end()

        oprot.write_field_begin(name='color_texts', type=13, id=None)
        oprot.write_map_begin(11, len(self.color_texts), 8)
        for __key0, __value0 in self.color_texts.iteritems():
            oprot.write_string(__key0)
            oprot.write_i32(__value0)
        oprot.write_map_end()
        oprot.write_field_end()

        oprot.write_field_begin(name='cultural_context_texts', type=13, id=None)
        oprot.write_map_begin(11, len(self.cultural_context_texts), 8)
        for __key0, __value0 in self.cultural_context_texts.iteritems():
            oprot.write_string(__key0)
            oprot.write_i32(__value0)
        oprot.write_map_end()
        oprot.write_field_end()

        oprot.write_field_begin(name='genders', type=13, id=None)
        oprot.write_map_begin(11, len(self.genders), 8)
        for __key0, __value0 in self.genders.iteritems():
            oprot.write_string(str(__key0))
            oprot.write_i32(__value0)
        oprot.write_map_end()
        oprot.write_field_end()

        oprot.write_field_begin(name='institutions', type=13, id=None)
        oprot.write_map_begin(11, len(self.institutions), 8)
        for __key0, __value0 in self.institutions.iteritems():
            oprot.write_string(__key0)
            oprot.write_i32(__value0)
        oprot.write_map_end()
        oprot.write_field_end()

        oprot.write_field_begin(name='location_name_texts', type=13, id=None)
        oprot.write_map_begin(11, len(self.location_name_texts), 8)
        for __key0, __value0 in self.location_name_texts.iteritems():
            oprot.write_string(__key0)
            oprot.write_i32(__value0)
        oprot.write_map_end()
        oprot.write_field_end()

        oprot.write_field_begin(name='material_texts', type=13, id=None)
        oprot.write_map_begin(11, len(self.material_texts), 8)
        for __key0, __value0 in self.material_texts.iteritems():
            oprot.write_string(__key0)
            oprot.write_i32(__value0)
        oprot.write_map_end()
        oprot.write_field_end()

        oprot.write_field_begin(name='subject_term_texts', type=13, id=None)
        oprot.write_map_begin(11, len(self.subject_term_texts), 8)
        for __key0, __value0 in self.subject_term_texts.iteritems():
            oprot.write_string(__key0)
            oprot.write_i32(__value0)
        oprot.write_map_end()
        oprot.write_field_end()

        oprot.write_field_begin(name='technique_texts', type=13, id=None)
        oprot.write_map_begin(11, len(self.technique_texts), 8)
        for __key0, __value0 in self.technique_texts.iteritems():
            oprot.write_string(__key0)
            oprot.write_i32(__value0)
        oprot.write_map_end()
        oprot.write_field_end()

        oprot.write_field_begin(name='work_type_texts', type=13, id=None)
        oprot.write_map_begin(11, len(self.work_type_texts), 8)
        for __key0, __value0 in self.work_type_texts.iteritems():
            oprot.write_string(__key0)
            oprot.write_i32(__value0)
        oprot.write_map_end()
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
