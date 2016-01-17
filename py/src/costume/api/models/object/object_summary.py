from itertools import ifilterfalse
import __builtin__
import costume.api.models.gender.gender
import costume.api.models.image.image
import costume.api.models.model_metadata


class ObjectSummary(object):
    class Builder(object):
        def __init__(
            self,
            collection_id=None,
            institution_id=None,
            model_metadata=None,
            title=None,
            agent_name_texts=None,
            categories=None,
            color_texts=None,
            cultural_context_texts=None,
            date=None,
            description=None,
            gender=None,
            image=None,
            location_name_texts=None,
            material_texts=None,
            relation_texts=None,
            subject_term_texts=None,
            technique_texts=None,
            structure_texts=None,
            url=None,
            work_type_texts=None,
        ):
            '''
            :type collection_id: str
            :type institution_id: str
            :type model_metadata: costume.api.models.model_metadata.ModelMetadata
            :type title: str
            :type agent_name_texts: tuple(str) or None
            :type categories: tuple(str) or None
            :type color_texts: tuple(str) or None
            :type cultural_context_texts: tuple(str) or None
            :type date: str or None
            :type description: str or None
            :type gender: costume.api.models.gender.gender.Gender or None
            :type image: costume.api.models.image.image.Image or None
            :type location_name_texts: tuple(str) or None
            :type material_texts: tuple(str) or None
            :type relation_texts: tuple(str) or None
            :type subject_term_texts: tuple(str) or None
            :type technique_texts: tuple(str) or None
            :type structure_texts: dict(str: str) or None
            :type url: str or None
            :type work_type_texts: tuple(str) or None
            '''

            self.__collection_id = collection_id
            self.__institution_id = institution_id
            self.__model_metadata = model_metadata
            self.__title = title
            self.__agent_name_texts = agent_name_texts
            self.__categories = categories
            self.__color_texts = color_texts
            self.__cultural_context_texts = cultural_context_texts
            self.__date = date
            self.__description = description
            self.__gender = gender
            self.__image = image
            self.__location_name_texts = location_name_texts
            self.__material_texts = material_texts
            self.__relation_texts = relation_texts
            self.__subject_term_texts = subject_term_texts
            self.__technique_texts = technique_texts
            self.__structure_texts = structure_texts
            self.__url = url
            self.__work_type_texts = work_type_texts

        def build(self):
            return ObjectSummary(collection_id=self.__collection_id, institution_id=self.__institution_id, model_metadata=self.__model_metadata, title=self.__title, agent_name_texts=self.__agent_name_texts, categories=self.__categories, color_texts=self.__color_texts, cultural_context_texts=self.__cultural_context_texts, date=self.__date, description=self.__description, gender=self.__gender, image=self.__image, location_name_texts=self.__location_name_texts, material_texts=self.__material_texts, relation_texts=self.__relation_texts, subject_term_texts=self.__subject_term_texts, technique_texts=self.__technique_texts, structure_texts=self.__structure_texts, url=self.__url, work_type_texts=self.__work_type_texts)

        @property
        def agent_name_texts(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__agent_name_texts

        @property
        def categories(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__categories

        @property
        def collection_id(self):
            '''
            :rtype: str
            '''

            return self.__collection_id

        @property
        def color_texts(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__color_texts

        @property
        def cultural_context_texts(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__cultural_context_texts

        @property
        def date(self):
            '''
            :rtype: str
            '''

            return self.__date

        @property
        def description(self):
            '''
            :rtype: str
            '''

            return self.__description

        @property
        def gender(self):
            '''
            :rtype: costume.api.models.gender.gender.Gender
            '''

            return self.__gender

        @property
        def image(self):
            '''
            :rtype: costume.api.models.image.image.Image
            '''

            return self.__image

        @property
        def institution_id(self):
            '''
            :rtype: str
            '''

            return self.__institution_id

        @property
        def location_name_texts(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__location_name_texts

        @property
        def material_texts(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__material_texts

        @property
        def model_metadata(self):
            '''
            :rtype: costume.api.models.model_metadata.ModelMetadata
            '''

            return self.__model_metadata

        @property
        def relation_texts(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__relation_texts

        def set_agent_name_texts(self, agent_name_texts):
            '''
            :type agent_name_texts: tuple(str) or None
            '''

            self.__agent_name_texts = agent_name_texts
            return self

        def set_categories(self, categories):
            '''
            :type categories: tuple(str) or None
            '''

            self.__categories = categories
            return self

        def set_collection_id(self, collection_id):
            '''
            :type collection_id: str
            '''

            self.__collection_id = collection_id
            return self

        def set_color_texts(self, color_texts):
            '''
            :type color_texts: tuple(str) or None
            '''

            self.__color_texts = color_texts
            return self

        def set_cultural_context_texts(self, cultural_context_texts):
            '''
            :type cultural_context_texts: tuple(str) or None
            '''

            self.__cultural_context_texts = cultural_context_texts
            return self

        def set_date(self, date):
            '''
            :type date: str or None
            '''

            self.__date = date
            return self

        def set_description(self, description):
            '''
            :type description: str or None
            '''

            self.__description = description
            return self

        def set_gender(self, gender):
            '''
            :type gender: costume.api.models.gender.gender.Gender or None
            '''

            self.__gender = gender
            return self

        def set_image(self, image):
            '''
            :type image: costume.api.models.image.image.Image or None
            '''

            self.__image = image
            return self

        def set_institution_id(self, institution_id):
            '''
            :type institution_id: str
            '''

            self.__institution_id = institution_id
            return self

        def set_location_name_texts(self, location_name_texts):
            '''
            :type location_name_texts: tuple(str) or None
            '''

            self.__location_name_texts = location_name_texts
            return self

        def set_material_texts(self, material_texts):
            '''
            :type material_texts: tuple(str) or None
            '''

            self.__material_texts = material_texts
            return self

        def set_model_metadata(self, model_metadata):
            '''
            :type model_metadata: costume.api.models.model_metadata.ModelMetadata
            '''

            self.__model_metadata = model_metadata
            return self

        def set_relation_texts(self, relation_texts):
            '''
            :type relation_texts: tuple(str) or None
            '''

            self.__relation_texts = relation_texts
            return self

        def set_structure_texts(self, structure_texts):
            '''
            :type structure_texts: dict(str: str) or None
            '''

            self.__structure_texts = structure_texts
            return self

        def set_subject_term_texts(self, subject_term_texts):
            '''
            :type subject_term_texts: tuple(str) or None
            '''

            self.__subject_term_texts = subject_term_texts
            return self

        def set_technique_texts(self, technique_texts):
            '''
            :type technique_texts: tuple(str) or None
            '''

            self.__technique_texts = technique_texts
            return self

        def set_title(self, title):
            '''
            :type title: str
            '''

            self.__title = title
            return self

        def set_url(self, url):
            '''
            :type url: str or None
            '''

            self.__url = url
            return self

        def set_work_type_texts(self, work_type_texts):
            '''
            :type work_type_texts: tuple(str) or None
            '''

            self.__work_type_texts = work_type_texts
            return self

        @property
        def structure_texts(self):
            '''
            :rtype: dict(str: str)
            '''

            return self.__structure_texts.copy() if self.__structure_texts is not None else None

        @property
        def subject_term_texts(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__subject_term_texts

        @property
        def technique_texts(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__technique_texts

        @property
        def title(self):
            '''
            :rtype: str
            '''

            return self.__title

        def update(self, object_summary):
            '''
            :type collection_id: str
            :type institution_id: str
            :type model_metadata: costume.api.models.model_metadata.ModelMetadata
            :type title: str
            :type agent_name_texts: tuple(str) or None
            :type categories: tuple(str) or None
            :type color_texts: tuple(str) or None
            :type cultural_context_texts: tuple(str) or None
            :type date: str or None
            :type description: str or None
            :type gender: costume.api.models.gender.gender.Gender or None
            :type image: costume.api.models.image.image.Image or None
            :type location_name_texts: tuple(str) or None
            :type material_texts: tuple(str) or None
            :type relation_texts: tuple(str) or None
            :type subject_term_texts: tuple(str) or None
            :type technique_texts: tuple(str) or None
            :type structure_texts: dict(str: str) or None
            :type url: str or None
            :type work_type_texts: tuple(str) or None
            '''

            if isinstance(object_summary, ObjectSummary):
                self.set_collection_id(object_summary.collection_id)
                self.set_institution_id(object_summary.institution_id)
                self.set_model_metadata(object_summary.model_metadata)
                self.set_title(object_summary.title)
                self.set_agent_name_texts(object_summary.agent_name_texts)
                self.set_categories(object_summary.categories)
                self.set_color_texts(object_summary.color_texts)
                self.set_cultural_context_texts(object_summary.cultural_context_texts)
                self.set_date(object_summary.date)
                self.set_description(object_summary.description)
                self.set_gender(object_summary.gender)
                self.set_image(object_summary.image)
                self.set_location_name_texts(object_summary.location_name_texts)
                self.set_material_texts(object_summary.material_texts)
                self.set_relation_texts(object_summary.relation_texts)
                self.set_subject_term_texts(object_summary.subject_term_texts)
                self.set_technique_texts(object_summary.technique_texts)
                self.set_structure_texts(object_summary.structure_texts)
                self.set_url(object_summary.url)
                self.set_work_type_texts(object_summary.work_type_texts)
            elif isinstance(object_summary, dict):
                for key, value in object_summary.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(object_summary)
            return self

        @property
        def url(self):
            '''
            :rtype: str
            '''

            return self.__url

        @property
        def work_type_texts(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__work_type_texts

        @agent_name_texts.setter
        def agent_name_texts(self, agent_name_texts):
            '''
            :type agent_name_texts: tuple(str) or None
            '''

            self.set_agent_name_texts(agent_name_texts)

        @categories.setter
        def categories(self, categories):
            '''
            :type categories: tuple(str) or None
            '''

            self.set_categories(categories)

        @collection_id.setter
        def collection_id(self, collection_id):
            '''
            :type collection_id: str
            '''

            self.set_collection_id(collection_id)

        @color_texts.setter
        def color_texts(self, color_texts):
            '''
            :type color_texts: tuple(str) or None
            '''

            self.set_color_texts(color_texts)

        @cultural_context_texts.setter
        def cultural_context_texts(self, cultural_context_texts):
            '''
            :type cultural_context_texts: tuple(str) or None
            '''

            self.set_cultural_context_texts(cultural_context_texts)

        @date.setter
        def date(self, date):
            '''
            :type date: str or None
            '''

            self.set_date(date)

        @description.setter
        def description(self, description):
            '''
            :type description: str or None
            '''

            self.set_description(description)

        @gender.setter
        def gender(self, gender):
            '''
            :type gender: costume.api.models.gender.gender.Gender or None
            '''

            self.set_gender(gender)

        @image.setter
        def image(self, image):
            '''
            :type image: costume.api.models.image.image.Image or None
            '''

            self.set_image(image)

        @institution_id.setter
        def institution_id(self, institution_id):
            '''
            :type institution_id: str
            '''

            self.set_institution_id(institution_id)

        @location_name_texts.setter
        def location_name_texts(self, location_name_texts):
            '''
            :type location_name_texts: tuple(str) or None
            '''

            self.set_location_name_texts(location_name_texts)

        @material_texts.setter
        def material_texts(self, material_texts):
            '''
            :type material_texts: tuple(str) or None
            '''

            self.set_material_texts(material_texts)

        @model_metadata.setter
        def model_metadata(self, model_metadata):
            '''
            :type model_metadata: costume.api.models.model_metadata.ModelMetadata
            '''

            self.set_model_metadata(model_metadata)

        @relation_texts.setter
        def relation_texts(self, relation_texts):
            '''
            :type relation_texts: tuple(str) or None
            '''

            self.set_relation_texts(relation_texts)

        @structure_texts.setter
        def structure_texts(self, structure_texts):
            '''
            :type structure_texts: dict(str: str) or None
            '''

            self.set_structure_texts(structure_texts)

        @subject_term_texts.setter
        def subject_term_texts(self, subject_term_texts):
            '''
            :type subject_term_texts: tuple(str) or None
            '''

            self.set_subject_term_texts(subject_term_texts)

        @technique_texts.setter
        def technique_texts(self, technique_texts):
            '''
            :type technique_texts: tuple(str) or None
            '''

            self.set_technique_texts(technique_texts)

        @title.setter
        def title(self, title):
            '''
            :type title: str
            '''

            self.set_title(title)

        @url.setter
        def url(self, url):
            '''
            :type url: str or None
            '''

            self.set_url(url)

        @work_type_texts.setter
        def work_type_texts(self, work_type_texts):
            '''
            :type work_type_texts: tuple(str) or None
            '''

            self.set_work_type_texts(work_type_texts)

    def __init__(
        self,
        collection_id,
        institution_id,
        model_metadata,
        title,
        agent_name_texts=None,
        categories=None,
        color_texts=None,
        cultural_context_texts=None,
        date=None,
        description=None,
        gender=None,
        image=None,
        location_name_texts=None,
        material_texts=None,
        relation_texts=None,
        subject_term_texts=None,
        technique_texts=None,
        structure_texts=None,
        url=None,
        work_type_texts=None,
    ):
        '''
        :type collection_id: str
        :type institution_id: str
        :type model_metadata: costume.api.models.model_metadata.ModelMetadata
        :type title: str
        :type agent_name_texts: tuple(str) or None
        :type categories: tuple(str) or None
        :type color_texts: tuple(str) or None
        :type cultural_context_texts: tuple(str) or None
        :type date: str or None
        :type description: str or None
        :type gender: costume.api.models.gender.gender.Gender or None
        :type image: costume.api.models.image.image.Image or None
        :type location_name_texts: tuple(str) or None
        :type material_texts: tuple(str) or None
        :type relation_texts: tuple(str) or None
        :type subject_term_texts: tuple(str) or None
        :type technique_texts: tuple(str) or None
        :type structure_texts: dict(str: str) or None
        :type url: str or None
        :type work_type_texts: tuple(str) or None
        '''

        if collection_id is None:
            raise ValueError('collection_id is required')
        if not isinstance(collection_id, basestring):
            raise TypeError("expected collection_id to be a str but it is a %s" % getattr(__builtin__, 'type')(collection_id))
        self.__collection_id = collection_id

        if institution_id is None:
            raise ValueError('institution_id is required')
        if not isinstance(institution_id, basestring):
            raise TypeError("expected institution_id to be a str but it is a %s" % getattr(__builtin__, 'type')(institution_id))
        self.__institution_id = institution_id

        if model_metadata is None:
            raise ValueError('model_metadata is required')
        if not isinstance(model_metadata, costume.api.models.model_metadata.ModelMetadata):
            raise TypeError("expected model_metadata to be a costume.api.models.model_metadata.ModelMetadata but it is a %s" % getattr(__builtin__, 'type')(model_metadata))
        self.__model_metadata = model_metadata

        if title is None:
            raise ValueError('title is required')
        if not isinstance(title, basestring):
            raise TypeError("expected title to be a str but it is a %s" % getattr(__builtin__, 'type')(title))
        if len(title) < 1:
            raise ValueError("expected len(title) to be >= 1, was %d" % len(title))
        self.__title = title

        if agent_name_texts is not None:
            if not (isinstance(agent_name_texts, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), agent_name_texts))) == 0):
                raise TypeError("expected agent_name_texts to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(agent_name_texts))
            if len(agent_name_texts) < 1:
                raise ValueError("expected len(agent_name_texts) to be >= 1, was %d" % len(agent_name_texts))
        self.__agent_name_texts = agent_name_texts

        if categories is not None:
            if not (isinstance(categories, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), categories))) == 0):
                raise TypeError("expected categories to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(categories))
            if len(categories) < 1:
                raise ValueError("expected len(categories) to be >= 1, was %d" % len(categories))
        self.__categories = categories

        if color_texts is not None:
            if not (isinstance(color_texts, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), color_texts))) == 0):
                raise TypeError("expected color_texts to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(color_texts))
            if len(color_texts) < 1:
                raise ValueError("expected len(color_texts) to be >= 1, was %d" % len(color_texts))
        self.__color_texts = color_texts

        if cultural_context_texts is not None:
            if not (isinstance(cultural_context_texts, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), cultural_context_texts))) == 0):
                raise TypeError("expected cultural_context_texts to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(cultural_context_texts))
            if len(cultural_context_texts) < 1:
                raise ValueError("expected len(cultural_context_texts) to be >= 1, was %d" % len(cultural_context_texts))
        self.__cultural_context_texts = cultural_context_texts

        if date is not None:
            if not isinstance(date, basestring):
                raise TypeError("expected date to be a str but it is a %s" % getattr(__builtin__, 'type')(date))
            if len(date) < 1:
                raise ValueError("expected len(date) to be >= 1, was %d" % len(date))
        self.__date = date

        if description is not None:
            if not isinstance(description, basestring):
                raise TypeError("expected description to be a str but it is a %s" % getattr(__builtin__, 'type')(description))
            if len(description) < 1:
                raise ValueError("expected len(description) to be >= 1, was %d" % len(description))
        self.__description = description

        if gender is not None:
            if not isinstance(gender, costume.api.models.gender.gender.Gender):
                raise TypeError("expected gender to be a costume.api.models.gender.gender.Gender but it is a %s" % getattr(__builtin__, 'type')(gender))
        self.__gender = gender

        if image is not None:
            if not isinstance(image, costume.api.models.image.image.Image):
                raise TypeError("expected image to be a costume.api.models.image.image.Image but it is a %s" % getattr(__builtin__, 'type')(image))
        self.__image = image

        if location_name_texts is not None:
            if not (isinstance(location_name_texts, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), location_name_texts))) == 0):
                raise TypeError("expected location_name_texts to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(location_name_texts))
            if len(location_name_texts) < 1:
                raise ValueError("expected len(location_name_texts) to be >= 1, was %d" % len(location_name_texts))
        self.__location_name_texts = location_name_texts

        if material_texts is not None:
            if not (isinstance(material_texts, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), material_texts))) == 0):
                raise TypeError("expected material_texts to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(material_texts))
            if len(material_texts) < 1:
                raise ValueError("expected len(material_texts) to be >= 1, was %d" % len(material_texts))
        self.__material_texts = material_texts

        if relation_texts is not None:
            if not (isinstance(relation_texts, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), relation_texts))) == 0):
                raise TypeError("expected relation_texts to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(relation_texts))
            if len(relation_texts) < 1:
                raise ValueError("expected len(relation_texts) to be >= 1, was %d" % len(relation_texts))
        self.__relation_texts = relation_texts

        if subject_term_texts is not None:
            if not (isinstance(subject_term_texts, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), subject_term_texts))) == 0):
                raise TypeError("expected subject_term_texts to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(subject_term_texts))
            if len(subject_term_texts) < 1:
                raise ValueError("expected len(subject_term_texts) to be >= 1, was %d" % len(subject_term_texts))
        self.__subject_term_texts = subject_term_texts

        if technique_texts is not None:
            if not (isinstance(technique_texts, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), technique_texts))) == 0):
                raise TypeError("expected technique_texts to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(technique_texts))
            if len(technique_texts) < 1:
                raise ValueError("expected len(technique_texts) to be >= 1, was %d" % len(technique_texts))
        self.__technique_texts = technique_texts

        if structure_texts is not None:
            if not (isinstance(structure_texts, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], basestring), structure_texts.iteritems()))) == 0):
                raise TypeError("expected structure_texts to be a dict(str: str) but it is a %s" % getattr(__builtin__, 'type')(structure_texts))
            if len(structure_texts) < 1:
                raise ValueError("expected len(structure_texts) to be >= 1, was %d" % len(structure_texts))
        self.__structure_texts = structure_texts.copy() if structure_texts is not None else None

        if url is not None:
            if not isinstance(url, basestring):
                raise TypeError("expected url to be a str but it is a %s" % getattr(__builtin__, 'type')(url))
        self.__url = url

        if work_type_texts is not None:
            if not (isinstance(work_type_texts, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), work_type_texts))) == 0):
                raise TypeError("expected work_type_texts to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(work_type_texts))
            if len(work_type_texts) < 1:
                raise ValueError("expected len(work_type_texts) to be >= 1, was %d" % len(work_type_texts))
        self.__work_type_texts = work_type_texts

    def __eq__(self, other):
        if self.collection_id != other.collection_id:
            return False
        if self.institution_id != other.institution_id:
            return False
        if self.model_metadata != other.model_metadata:
            return False
        if self.title != other.title:
            return False
        if self.agent_name_texts != other.agent_name_texts:
            return False
        if self.categories != other.categories:
            return False
        if self.color_texts != other.color_texts:
            return False
        if self.cultural_context_texts != other.cultural_context_texts:
            return False
        if self.date != other.date:
            return False
        if self.description != other.description:
            return False
        if self.gender != other.gender:
            return False
        if self.image != other.image:
            return False
        if self.location_name_texts != other.location_name_texts:
            return False
        if self.material_texts != other.material_texts:
            return False
        if self.relation_texts != other.relation_texts:
            return False
        if self.subject_term_texts != other.subject_term_texts:
            return False
        if self.technique_texts != other.technique_texts:
            return False
        if self.structure_texts != other.structure_texts:
            return False
        if self.url != other.url:
            return False
        if self.work_type_texts != other.work_type_texts:
            return False
        return True

    def __hash__(self):
        return hash((self.collection_id,self.institution_id,self.model_metadata,self.title,self.agent_name_texts,self.categories,self.color_texts,self.cultural_context_texts,self.date,self.description,self.gender,self.image,self.location_name_texts,self.material_texts,self.relation_texts,self.subject_term_texts,self.technique_texts,self.structure_texts,self.url,self.work_type_texts,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('collection_id=' + "'" + self.collection_id.encode('ascii', 'replace') + "'")
        field_reprs.append('institution_id=' + "'" + self.institution_id.encode('ascii', 'replace') + "'")
        field_reprs.append('model_metadata=' + repr(self.model_metadata))
        field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        if self.agent_name_texts is not None:
            field_reprs.append('agent_name_texts=' + repr(self.agent_name_texts))
        if self.categories is not None:
            field_reprs.append('categories=' + repr(self.categories))
        if self.color_texts is not None:
            field_reprs.append('color_texts=' + repr(self.color_texts))
        if self.cultural_context_texts is not None:
            field_reprs.append('cultural_context_texts=' + repr(self.cultural_context_texts))
        if self.date is not None:
            field_reprs.append('date=' + "'" + self.date.encode('ascii', 'replace') + "'")
        if self.description is not None:
            field_reprs.append('description=' + "'" + self.description.encode('ascii', 'replace') + "'")
        if self.gender is not None:
            field_reprs.append('gender=' + repr(self.gender))
        if self.image is not None:
            field_reprs.append('image=' + repr(self.image))
        if self.location_name_texts is not None:
            field_reprs.append('location_name_texts=' + repr(self.location_name_texts))
        if self.material_texts is not None:
            field_reprs.append('material_texts=' + repr(self.material_texts))
        if self.relation_texts is not None:
            field_reprs.append('relation_texts=' + repr(self.relation_texts))
        if self.subject_term_texts is not None:
            field_reprs.append('subject_term_texts=' + repr(self.subject_term_texts))
        if self.technique_texts is not None:
            field_reprs.append('technique_texts=' + repr(self.technique_texts))
        if self.structure_texts is not None:
            field_reprs.append('structure_texts=' + repr(self.structure_texts))
        if self.url is not None:
            field_reprs.append('url=' + "'" + self.url.encode('ascii', 'replace') + "'")
        if self.work_type_texts is not None:
            field_reprs.append('work_type_texts=' + repr(self.work_type_texts))
        return 'ObjectSummary(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('collection_id=' + "'" + self.collection_id.encode('ascii', 'replace') + "'")
        field_reprs.append('institution_id=' + "'" + self.institution_id.encode('ascii', 'replace') + "'")
        field_reprs.append('model_metadata=' + repr(self.model_metadata))
        field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        if self.agent_name_texts is not None:
            field_reprs.append('agent_name_texts=' + repr(self.agent_name_texts))
        if self.categories is not None:
            field_reprs.append('categories=' + repr(self.categories))
        if self.color_texts is not None:
            field_reprs.append('color_texts=' + repr(self.color_texts))
        if self.cultural_context_texts is not None:
            field_reprs.append('cultural_context_texts=' + repr(self.cultural_context_texts))
        if self.date is not None:
            field_reprs.append('date=' + "'" + self.date.encode('ascii', 'replace') + "'")
        if self.description is not None:
            field_reprs.append('description=' + "'" + self.description.encode('ascii', 'replace') + "'")
        if self.gender is not None:
            field_reprs.append('gender=' + repr(self.gender))
        if self.image is not None:
            field_reprs.append('image=' + repr(self.image))
        if self.location_name_texts is not None:
            field_reprs.append('location_name_texts=' + repr(self.location_name_texts))
        if self.material_texts is not None:
            field_reprs.append('material_texts=' + repr(self.material_texts))
        if self.relation_texts is not None:
            field_reprs.append('relation_texts=' + repr(self.relation_texts))
        if self.subject_term_texts is not None:
            field_reprs.append('subject_term_texts=' + repr(self.subject_term_texts))
        if self.technique_texts is not None:
            field_reprs.append('technique_texts=' + repr(self.technique_texts))
        if self.structure_texts is not None:
            field_reprs.append('structure_texts=' + repr(self.structure_texts))
        if self.url is not None:
            field_reprs.append('url=' + "'" + self.url.encode('ascii', 'replace') + "'")
        if self.work_type_texts is not None:
            field_reprs.append('work_type_texts=' + repr(self.work_type_texts))
        return 'ObjectSummary(' + ', '.join(field_reprs) + ')'

    @property
    def agent_name_texts(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__agent_name_texts

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'collection_id': self.collection_id, 'institution_id': self.institution_id, 'model_metadata': self.model_metadata, 'title': self.title, 'agent_name_texts': self.agent_name_texts, 'categories': self.categories, 'color_texts': self.color_texts, 'cultural_context_texts': self.cultural_context_texts, 'date': self.date, 'description': self.description, 'gender': self.gender, 'image': self.image, 'location_name_texts': self.location_name_texts, 'material_texts': self.material_texts, 'relation_texts': self.relation_texts, 'subject_term_texts': self.subject_term_texts, 'technique_texts': self.technique_texts, 'structure_texts': self.structure_texts, 'url': self.url, 'work_type_texts': self.work_type_texts}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.collection_id, self.institution_id, self.model_metadata, self.title, self.agent_name_texts, self.categories, self.color_texts, self.cultural_context_texts, self.date, self.description, self.gender, self.image, self.location_name_texts, self.material_texts, self.relation_texts, self.subject_term_texts, self.technique_texts, self.structure_texts, self.url, self.work_type_texts,)

    @property
    def categories(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__categories

    @property
    def collection_id(self):
        '''
        :rtype: str
        '''

        return self.__collection_id

    @property
    def color_texts(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__color_texts

    @property
    def cultural_context_texts(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__cultural_context_texts

    @property
    def date(self):
        '''
        :rtype: str
        '''

        return self.__date

    @property
    def description(self):
        '''
        :rtype: str
        '''

        return self.__description

    @property
    def gender(self):
        '''
        :rtype: costume.api.models.gender.gender.Gender
        '''

        return self.__gender

    @property
    def image(self):
        '''
        :rtype: costume.api.models.image.image.Image
        '''

        return self.__image

    @property
    def institution_id(self):
        '''
        :rtype: str
        '''

        return self.__institution_id

    @property
    def location_name_texts(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__location_name_texts

    @property
    def material_texts(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__material_texts

    @property
    def model_metadata(self):
        '''
        :rtype: costume.api.models.model_metadata.ModelMetadata
        '''

        return self.__model_metadata

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: costume.api.models.object.object_summary.ObjectSummary
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'collection_id' and ifield_id == 1:
                init_kwds['collection_id'] = iprot.read_string()
            elif ifield_name == 'institution_id' and ifield_id == 2:
                init_kwds['institution_id'] = iprot.read_string()
            elif ifield_name == 'model_metadata' and ifield_id == 3:
                init_kwds['model_metadata'] = costume.api.models.model_metadata.ModelMetadata.read(iprot)
            elif ifield_name == 'title' and ifield_id == 4:
                init_kwds['title'] = iprot.read_string()
            elif ifield_name == 'agent_name_texts' and ifield_id == 6:
                init_kwds['agent_name_texts'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'categories' and ifield_id == 7:
                init_kwds['categories'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'color_texts' and ifield_id == 17:
                init_kwds['color_texts'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'cultural_context_texts' and ifield_id == 18:
                init_kwds['cultural_context_texts'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'date' and ifield_id == 12:
                try:
                    init_kwds['date'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'description' and ifield_id == 5:
                try:
                    init_kwds['description'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'gender' and ifield_id == 8:
                try:
                    init_kwds['gender'] = costume.api.models.gender.gender.Gender.value_of(iprot.read_string().strip().upper())
                except (TypeError,):
                    pass
            elif ifield_name == 'image' and ifield_id == 21:
                init_kwds['image'] = costume.api.models.image.image.Image.read(iprot)
            elif ifield_name == 'location_name_texts' and ifield_id == 19:
                init_kwds['location_name_texts'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'material_texts' and ifield_id == 14:
                init_kwds['material_texts'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'relation_texts' and ifield_id == 16:
                init_kwds['relation_texts'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'subject_term_texts' and ifield_id == 9:
                init_kwds['subject_term_texts'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'technique_texts' and ifield_id == 15:
                init_kwds['technique_texts'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'structure_texts' and ifield_id == 20:
                init_kwds['structure_texts'] = dict([(iprot.read_string(), iprot.read_string()) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            elif ifield_name == 'url' and ifield_id == 13:
                try:
                    init_kwds['url'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'work_type_texts' and ifield_id == 11:
                init_kwds['work_type_texts'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    @property
    def relation_texts(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__relation_texts

    def replace(
        self,
        collection_id=None,
        institution_id=None,
        model_metadata=None,
        title=None,
        agent_name_texts=None,
        categories=None,
        color_texts=None,
        cultural_context_texts=None,
        date=None,
        description=None,
        gender=None,
        image=None,
        location_name_texts=None,
        material_texts=None,
        relation_texts=None,
        subject_term_texts=None,
        technique_texts=None,
        structure_texts=None,
        url=None,
        work_type_texts=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type collection_id: str or None
        :type institution_id: str or None
        :type model_metadata: costume.api.models.model_metadata.ModelMetadata or None
        :type title: str or None
        :type agent_name_texts: tuple(str) or None
        :type categories: tuple(str) or None
        :type color_texts: tuple(str) or None
        :type cultural_context_texts: tuple(str) or None
        :type date: str or None
        :type description: str or None
        :type gender: costume.api.models.gender.gender.Gender or None
        :type image: costume.api.models.image.image.Image or None
        :type location_name_texts: tuple(str) or None
        :type material_texts: tuple(str) or None
        :type relation_texts: tuple(str) or None
        :type subject_term_texts: tuple(str) or None
        :type technique_texts: tuple(str) or None
        :type structure_texts: dict(str: str) or None
        :type url: str or None
        :type work_type_texts: tuple(str) or None
        :rtype: costume.api.models.object.object_summary.ObjectSummary
        '''

        if collection_id is None:
            collection_id = self.collection_id
        if institution_id is None:
            institution_id = self.institution_id
        if model_metadata is None:
            model_metadata = self.model_metadata
        if title is None:
            title = self.title
        if agent_name_texts is None:
            agent_name_texts = self.agent_name_texts
        if categories is None:
            categories = self.categories
        if color_texts is None:
            color_texts = self.color_texts
        if cultural_context_texts is None:
            cultural_context_texts = self.cultural_context_texts
        if date is None:
            date = self.date
        if description is None:
            description = self.description
        if gender is None:
            gender = self.gender
        if image is None:
            image = self.image
        if location_name_texts is None:
            location_name_texts = self.location_name_texts
        if material_texts is None:
            material_texts = self.material_texts
        if relation_texts is None:
            relation_texts = self.relation_texts
        if subject_term_texts is None:
            subject_term_texts = self.subject_term_texts
        if technique_texts is None:
            technique_texts = self.technique_texts
        if structure_texts is None:
            structure_texts = self.structure_texts
        if url is None:
            url = self.url
        if work_type_texts is None:
            work_type_texts = self.work_type_texts
        return self.__class__(collection_id=collection_id, institution_id=institution_id, model_metadata=model_metadata, title=title, agent_name_texts=agent_name_texts, categories=categories, color_texts=color_texts, cultural_context_texts=cultural_context_texts, date=date, description=description, gender=gender, image=image, location_name_texts=location_name_texts, material_texts=material_texts, relation_texts=relation_texts, subject_term_texts=subject_term_texts, technique_texts=technique_texts, structure_texts=structure_texts, url=url, work_type_texts=work_type_texts)

    @property
    def structure_texts(self):
        '''
        :rtype: dict(str: str)
        '''

        return self.__structure_texts.copy() if self.__structure_texts is not None else None

    @property
    def subject_term_texts(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__subject_term_texts

    @property
    def technique_texts(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__technique_texts

    @property
    def title(self):
        '''
        :rtype: str
        '''

        return self.__title

    @property
    def url(self):
        '''
        :rtype: str
        '''

        return self.__url

    @property
    def work_type_texts(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__work_type_texts

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.models.object.object_summary.ObjectSummary
        '''

        oprot.write_struct_begin('ObjectSummary')

        oprot.write_field_begin(name='collection_id', type=11, id=1)
        oprot.write_string(self.collection_id)
        oprot.write_field_end()

        oprot.write_field_begin(name='institution_id', type=11, id=2)
        oprot.write_string(self.institution_id)
        oprot.write_field_end()

        oprot.write_field_begin(name='model_metadata', type=12, id=3)
        self.model_metadata.write(oprot)
        oprot.write_field_end()

        oprot.write_field_begin(name='title', type=11, id=4)
        oprot.write_string(self.title)
        oprot.write_field_end()

        if self.agent_name_texts is not None:
            oprot.write_field_begin(name='agent_name_texts', type=15, id=6)
            oprot.write_list_begin(11, len(self.agent_name_texts))
            for _0 in self.agent_name_texts:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.categories is not None:
            oprot.write_field_begin(name='categories', type=15, id=7)
            oprot.write_list_begin(11, len(self.categories))
            for _0 in self.categories:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.color_texts is not None:
            oprot.write_field_begin(name='color_texts', type=15, id=17)
            oprot.write_list_begin(11, len(self.color_texts))
            for _0 in self.color_texts:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.cultural_context_texts is not None:
            oprot.write_field_begin(name='cultural_context_texts', type=15, id=18)
            oprot.write_list_begin(11, len(self.cultural_context_texts))
            for _0 in self.cultural_context_texts:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.date is not None:
            oprot.write_field_begin(name='date', type=11, id=12)
            oprot.write_string(self.date)
            oprot.write_field_end()

        if self.description is not None:
            oprot.write_field_begin(name='description', type=11, id=5)
            oprot.write_string(self.description)
            oprot.write_field_end()

        if self.gender is not None:
            oprot.write_field_begin(name='gender', type=11, id=8)
            oprot.write_string(str(self.gender))
            oprot.write_field_end()

        if self.image is not None:
            oprot.write_field_begin(name='image', type=12, id=21)
            self.image.write(oprot)
            oprot.write_field_end()

        if self.location_name_texts is not None:
            oprot.write_field_begin(name='location_name_texts', type=15, id=19)
            oprot.write_list_begin(11, len(self.location_name_texts))
            for _0 in self.location_name_texts:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.material_texts is not None:
            oprot.write_field_begin(name='material_texts', type=15, id=14)
            oprot.write_list_begin(11, len(self.material_texts))
            for _0 in self.material_texts:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.relation_texts is not None:
            oprot.write_field_begin(name='relation_texts', type=15, id=16)
            oprot.write_list_begin(11, len(self.relation_texts))
            for _0 in self.relation_texts:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.subject_term_texts is not None:
            oprot.write_field_begin(name='subject_term_texts', type=15, id=9)
            oprot.write_list_begin(11, len(self.subject_term_texts))
            for _0 in self.subject_term_texts:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.technique_texts is not None:
            oprot.write_field_begin(name='technique_texts', type=15, id=15)
            oprot.write_list_begin(11, len(self.technique_texts))
            for _0 in self.technique_texts:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.structure_texts is not None:
            oprot.write_field_begin(name='structure_texts', type=13, id=20)
            oprot.write_map_begin(11, len(self.structure_texts), 11)
            for __key0, __value0 in self.structure_texts.iteritems():
                oprot.write_string(__key0)
                oprot.write_string(__value0)
            oprot.write_map_end()
            oprot.write_field_end()

        if self.url is not None:
            oprot.write_field_begin(name='url', type=11, id=13)
            oprot.write_string(self.url)
            oprot.write_field_end()

        if self.work_type_texts is not None:
            oprot.write_field_begin(name='work_type_texts', type=15, id=11)
            oprot.write_list_begin(11, len(self.work_type_texts))
            for _0 in self.work_type_texts:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
