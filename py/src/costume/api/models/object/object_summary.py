from itertools import ifilterfalse
import __builtin__
import costume.api.models.gender.gender
import costume.api.models.model_metadata


class ObjectSummary(object):
    class Builder(object):
        def __init__(
            self,
            collection_id=None,
            institution_id=None,
            model_metadata=None,
            title=None,
            description=None,
            agent_name_texts=None,
            categories=None,
            gender=None,
            subject_term_texts=None,
            work_type_texts=None,
        ):
            '''
            :type collection_id: str
            :type institution_id: str
            :type model_metadata: costume.api.models.model_metadata.ModelMetadata
            :type title: str
            :type description: str or None
            :type agent_name_texts: tuple(str) or None
            :type categories: tuple(str) or None
            :type gender: costume.api.models.gender.gender.Gender or None
            :type subject_term_texts: tuple(str) or None
            :type work_type_texts: tuple(str) or None
            '''

            self.__collection_id = collection_id
            self.__institution_id = institution_id
            self.__model_metadata = model_metadata
            self.__title = title
            self.__description = description
            self.__agent_name_texts = agent_name_texts
            self.__categories = categories
            self.__gender = gender
            self.__subject_term_texts = subject_term_texts
            self.__work_type_texts = work_type_texts

        def build(self):
            return ObjectSummary(collection_id=self.__collection_id, institution_id=self.__institution_id, model_metadata=self.__model_metadata, title=self.__title, description=self.__description, agent_name_texts=self.__agent_name_texts, categories=self.__categories, gender=self.__gender, subject_term_texts=self.__subject_term_texts, work_type_texts=self.__work_type_texts)

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
        def institution_id(self):
            '''
            :rtype: str
            '''

            return self.__institution_id

        @property
        def model_metadata(self):
            '''
            :rtype: costume.api.models.model_metadata.ModelMetadata
            '''

            return self.__model_metadata

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

        def set_institution_id(self, institution_id):
            '''
            :type institution_id: str
            '''

            self.__institution_id = institution_id
            return self

        def set_model_metadata(self, model_metadata):
            '''
            :type model_metadata: costume.api.models.model_metadata.ModelMetadata
            '''

            self.__model_metadata = model_metadata
            return self

        def set_subject_term_texts(self, subject_term_texts):
            '''
            :type subject_term_texts: tuple(str) or None
            '''

            self.__subject_term_texts = subject_term_texts
            return self

        def set_title(self, title):
            '''
            :type title: str
            '''

            self.__title = title
            return self

        def set_work_type_texts(self, work_type_texts):
            '''
            :type work_type_texts: tuple(str) or None
            '''

            self.__work_type_texts = work_type_texts
            return self

        @property
        def subject_term_texts(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__subject_term_texts

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
            :type description: str or None
            :type agent_name_texts: tuple(str) or None
            :type categories: tuple(str) or None
            :type gender: costume.api.models.gender.gender.Gender or None
            :type subject_term_texts: tuple(str) or None
            :type work_type_texts: tuple(str) or None
            '''

            if isinstance(object_summary, ObjectSummary):
                self.set_collection_id(object_summary.collection_id)
                self.set_institution_id(object_summary.institution_id)
                self.set_model_metadata(object_summary.model_metadata)
                self.set_title(object_summary.title)
                self.set_description(object_summary.description)
                self.set_agent_name_texts(object_summary.agent_name_texts)
                self.set_categories(object_summary.categories)
                self.set_gender(object_summary.gender)
                self.set_subject_term_texts(object_summary.subject_term_texts)
                self.set_work_type_texts(object_summary.work_type_texts)
            elif isinstance(object_summary, dict):
                for key, value in object_summary.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(object_summary)
            return self

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

        @institution_id.setter
        def institution_id(self, institution_id):
            '''
            :type institution_id: str
            '''

            self.set_institution_id(institution_id)

        @model_metadata.setter
        def model_metadata(self, model_metadata):
            '''
            :type model_metadata: costume.api.models.model_metadata.ModelMetadata
            '''

            self.set_model_metadata(model_metadata)

        @subject_term_texts.setter
        def subject_term_texts(self, subject_term_texts):
            '''
            :type subject_term_texts: tuple(str) or None
            '''

            self.set_subject_term_texts(subject_term_texts)

        @title.setter
        def title(self, title):
            '''
            :type title: str
            '''

            self.set_title(title)

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
        description=None,
        agent_name_texts=None,
        categories=None,
        gender=None,
        subject_term_texts=None,
        work_type_texts=None,
    ):
        '''
        :type collection_id: str
        :type institution_id: str
        :type model_metadata: costume.api.models.model_metadata.ModelMetadata
        :type title: str
        :type description: str or None
        :type agent_name_texts: tuple(str) or None
        :type categories: tuple(str) or None
        :type gender: costume.api.models.gender.gender.Gender or None
        :type subject_term_texts: tuple(str) or None
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

        if description is not None:
            if not isinstance(description, basestring):
                raise TypeError("expected description to be a str but it is a %s" % getattr(__builtin__, 'type')(description))
            if len(description) < 1:
                raise ValueError("expected len(description) to be >= 1, was %d" % len(description))
        self.__description = description

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

        if gender is not None:
            if not isinstance(gender, costume.api.models.gender.gender.Gender):
                raise TypeError("expected gender to be a costume.api.models.gender.gender.Gender but it is a %s" % getattr(__builtin__, 'type')(gender))
        self.__gender = gender

        if subject_term_texts is not None:
            if not (isinstance(subject_term_texts, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), subject_term_texts))) == 0):
                raise TypeError("expected subject_term_texts to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(subject_term_texts))
            if len(subject_term_texts) < 1:
                raise ValueError("expected len(subject_term_texts) to be >= 1, was %d" % len(subject_term_texts))
        self.__subject_term_texts = subject_term_texts

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
        if self.description != other.description:
            return False
        if self.agent_name_texts != other.agent_name_texts:
            return False
        if self.categories != other.categories:
            return False
        if self.gender != other.gender:
            return False
        if self.subject_term_texts != other.subject_term_texts:
            return False
        if self.work_type_texts != other.work_type_texts:
            return False
        return True

    def __hash__(self):
        return hash((self.collection_id,self.institution_id,self.model_metadata,self.title,self.description,self.agent_name_texts,self.categories,self.gender,self.subject_term_texts,self.work_type_texts,))

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
        if self.description is not None:
            field_reprs.append('description=' + "'" + self.description.encode('ascii', 'replace') + "'")
        if self.agent_name_texts is not None:
            field_reprs.append('agent_name_texts=' + repr(self.agent_name_texts))
        if self.categories is not None:
            field_reprs.append('categories=' + repr(self.categories))
        if self.gender is not None:
            field_reprs.append('gender=' + repr(self.gender))
        if self.subject_term_texts is not None:
            field_reprs.append('subject_term_texts=' + repr(self.subject_term_texts))
        if self.work_type_texts is not None:
            field_reprs.append('work_type_texts=' + repr(self.work_type_texts))
        return 'ObjectSummary(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('collection_id=' + "'" + self.collection_id.encode('ascii', 'replace') + "'")
        field_reprs.append('institution_id=' + "'" + self.institution_id.encode('ascii', 'replace') + "'")
        field_reprs.append('model_metadata=' + repr(self.model_metadata))
        field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        if self.description is not None:
            field_reprs.append('description=' + "'" + self.description.encode('ascii', 'replace') + "'")
        if self.agent_name_texts is not None:
            field_reprs.append('agent_name_texts=' + repr(self.agent_name_texts))
        if self.categories is not None:
            field_reprs.append('categories=' + repr(self.categories))
        if self.gender is not None:
            field_reprs.append('gender=' + repr(self.gender))
        if self.subject_term_texts is not None:
            field_reprs.append('subject_term_texts=' + repr(self.subject_term_texts))
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

        return {'collection_id': self.collection_id, 'institution_id': self.institution_id, 'model_metadata': self.model_metadata, 'title': self.title, 'description': self.description, 'agent_name_texts': self.agent_name_texts, 'categories': self.categories, 'gender': self.gender, 'subject_term_texts': self.subject_term_texts, 'work_type_texts': self.work_type_texts}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.collection_id, self.institution_id, self.model_metadata, self.title, self.description, self.agent_name_texts, self.categories, self.gender, self.subject_term_texts, self.work_type_texts,)

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
    def institution_id(self):
        '''
        :rtype: str
        '''

        return self.__institution_id

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
            elif ifield_name == 'description' and ifield_id == 5:
                try:
                    init_kwds['description'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'agent_name_texts' and ifield_id == 6:
                init_kwds['agent_name_texts'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'categories' and ifield_id == 7:
                init_kwds['categories'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'gender' and ifield_id == 8:
                try:
                    init_kwds['gender'] = costume.api.models.gender.gender.Gender.value_of(iprot.read_string().strip().upper())
                except (TypeError,):
                    pass
            elif ifield_name == 'subject_term_texts' and ifield_id == 9:
                init_kwds['subject_term_texts'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'work_type_texts' and ifield_id == 10:
                init_kwds['work_type_texts'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        collection_id=None,
        institution_id=None,
        model_metadata=None,
        title=None,
        description=None,
        agent_name_texts=None,
        categories=None,
        gender=None,
        subject_term_texts=None,
        work_type_texts=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type collection_id: str or None
        :type institution_id: str or None
        :type model_metadata: costume.api.models.model_metadata.ModelMetadata or None
        :type title: str or None
        :type description: str or None
        :type agent_name_texts: tuple(str) or None
        :type categories: tuple(str) or None
        :type gender: costume.api.models.gender.gender.Gender or None
        :type subject_term_texts: tuple(str) or None
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
        if description is None:
            description = self.description
        if agent_name_texts is None:
            agent_name_texts = self.agent_name_texts
        if categories is None:
            categories = self.categories
        if gender is None:
            gender = self.gender
        if subject_term_texts is None:
            subject_term_texts = self.subject_term_texts
        if work_type_texts is None:
            work_type_texts = self.work_type_texts
        return self.__class__(collection_id=collection_id, institution_id=institution_id, model_metadata=model_metadata, title=title, description=description, agent_name_texts=agent_name_texts, categories=categories, gender=gender, subject_term_texts=subject_term_texts, work_type_texts=work_type_texts)

    @property
    def subject_term_texts(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__subject_term_texts

    @property
    def title(self):
        '''
        :rtype: str
        '''

        return self.__title

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

        if self.description is not None:
            oprot.write_field_begin(name='description', type=11, id=5)
            oprot.write_string(self.description)
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

        if self.gender is not None:
            oprot.write_field_begin(name='gender', type=11, id=8)
            oprot.write_string(str(self.gender))
            oprot.write_field_end()

        if self.subject_term_texts is not None:
            oprot.write_field_begin(name='subject_term_texts', type=15, id=9)
            oprot.write_list_begin(11, len(self.subject_term_texts))
            for _0 in self.subject_term_texts:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.work_type_texts is not None:
            oprot.write_field_begin(name='work_type_texts', type=15, id=10)
            oprot.write_list_begin(11, len(self.work_type_texts))
            for _0 in self.work_type_texts:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
