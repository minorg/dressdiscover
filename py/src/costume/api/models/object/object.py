from datetime import datetime
from itertools import ifilterfalse
import __builtin__
import costume.api.models.image.image
import costume.api.models.inscription.inscription_set
import costume.api.models.material.material_set
import costume.api.models.model_metadata
import costume.api.models.technique.technique_set


class Object(object):
    class Builder(object):
        def __init__(
            self,
            collection_id=None,
            institution_id=None,
            model_metadata=None,
            title=None,
            categories=None,
            date=None,
            date_text=None,
            description=None,
            history_notes=None,
            inscriptions=None,
            materials=None,
            physical_description=None,
            provenance=None,
            summary=None,
            techniques=None,
            thumbnail=None,
            url=None,
        ):
            '''
            :type collection_id: str
            :type institution_id: str
            :type model_metadata: costume.api.models.model_metadata.ModelMetadata
            :type title: str
            :type categories: tuple(str) or None
            :type date: datetime or None
            :type date_text: str or None
            :type description: str or None
            :type history_notes: str or None
            :type inscriptions: costume.api.models.inscription.inscription_set.InscriptionSet or None
            :type materials: costume.api.models.material.material_set.MaterialSet or None
            :type physical_description: str or None
            :type provenance: str or None
            :type summary: str or None
            :type techniques: costume.api.models.technique.technique_set.TechniqueSet or None
            :type thumbnail: costume.api.models.image.image.Image or None
            :type url: str or None
            '''

            self.__collection_id = collection_id
            self.__institution_id = institution_id
            self.__model_metadata = model_metadata
            self.__title = title
            self.__categories = categories
            self.__date = date
            self.__date_text = date_text
            self.__description = description
            self.__history_notes = history_notes
            self.__inscriptions = inscriptions
            self.__materials = materials
            self.__physical_description = physical_description
            self.__provenance = provenance
            self.__summary = summary
            self.__techniques = techniques
            self.__thumbnail = thumbnail
            self.__url = url

        def build(self):
            return Object(collection_id=self.__collection_id, institution_id=self.__institution_id, model_metadata=self.__model_metadata, title=self.__title, categories=self.__categories, date=self.__date, date_text=self.__date_text, description=self.__description, history_notes=self.__history_notes, inscriptions=self.__inscriptions, materials=self.__materials, physical_description=self.__physical_description, provenance=self.__provenance, summary=self.__summary, techniques=self.__techniques, thumbnail=self.__thumbnail, url=self.__url)

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
        def date(self):
            '''
            :rtype: datetime
            '''

            return self.__date

        @property
        def date_text(self):
            '''
            :rtype: str
            '''

            return self.__date_text

        @property
        def description(self):
            '''
            :rtype: str
            '''

            return self.__description

        @property
        def history_notes(self):
            '''
            :rtype: str
            '''

            return self.__history_notes

        @property
        def inscriptions(self):
            '''
            :rtype: costume.api.models.inscription.inscription_set.InscriptionSet
            '''

            return self.__inscriptions

        @property
        def institution_id(self):
            '''
            :rtype: str
            '''

            return self.__institution_id

        @property
        def materials(self):
            '''
            :rtype: costume.api.models.material.material_set.MaterialSet
            '''

            return self.__materials

        @property
        def model_metadata(self):
            '''
            :rtype: costume.api.models.model_metadata.ModelMetadata
            '''

            return self.__model_metadata

        @property
        def physical_description(self):
            '''
            :rtype: str
            '''

            return self.__physical_description

        @property
        def provenance(self):
            '''
            :rtype: str
            '''

            return self.__provenance

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

        def set_date(self, date):
            '''
            :type date: datetime or None
            '''

            self.__date = date
            return self

        def set_date_text(self, date_text):
            '''
            :type date_text: str or None
            '''

            self.__date_text = date_text
            return self

        def set_description(self, description):
            '''
            :type description: str or None
            '''

            self.__description = description
            return self

        def set_history_notes(self, history_notes):
            '''
            :type history_notes: str or None
            '''

            self.__history_notes = history_notes
            return self

        def set_inscriptions(self, inscriptions):
            '''
            :type inscriptions: costume.api.models.inscription.inscription_set.InscriptionSet or None
            '''

            self.__inscriptions = inscriptions
            return self

        def set_institution_id(self, institution_id):
            '''
            :type institution_id: str
            '''

            self.__institution_id = institution_id
            return self

        def set_materials(self, materials):
            '''
            :type materials: costume.api.models.material.material_set.MaterialSet or None
            '''

            self.__materials = materials
            return self

        def set_model_metadata(self, model_metadata):
            '''
            :type model_metadata: costume.api.models.model_metadata.ModelMetadata
            '''

            self.__model_metadata = model_metadata
            return self

        def set_physical_description(self, physical_description):
            '''
            :type physical_description: str or None
            '''

            self.__physical_description = physical_description
            return self

        def set_provenance(self, provenance):
            '''
            :type provenance: str or None
            '''

            self.__provenance = provenance
            return self

        def set_summary(self, summary):
            '''
            :type summary: str or None
            '''

            self.__summary = summary
            return self

        def set_techniques(self, techniques):
            '''
            :type techniques: costume.api.models.technique.technique_set.TechniqueSet or None
            '''

            self.__techniques = techniques
            return self

        def set_thumbnail(self, thumbnail):
            '''
            :type thumbnail: costume.api.models.image.image.Image or None
            '''

            self.__thumbnail = thumbnail
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

        @property
        def summary(self):
            '''
            :rtype: str
            '''

            return self.__summary

        @property
        def techniques(self):
            '''
            :rtype: costume.api.models.technique.technique_set.TechniqueSet
            '''

            return self.__techniques

        @property
        def thumbnail(self):
            '''
            :rtype: costume.api.models.image.image.Image
            '''

            return self.__thumbnail

        @property
        def title(self):
            '''
            :rtype: str
            '''

            return self.__title

        def update(self, object):
            '''
            :type collection_id: str
            :type institution_id: str
            :type model_metadata: costume.api.models.model_metadata.ModelMetadata
            :type title: str
            :type categories: tuple(str) or None
            :type date: datetime or None
            :type date_text: str or None
            :type description: str or None
            :type history_notes: str or None
            :type inscriptions: costume.api.models.inscription.inscription_set.InscriptionSet or None
            :type materials: costume.api.models.material.material_set.MaterialSet or None
            :type physical_description: str or None
            :type provenance: str or None
            :type summary: str or None
            :type techniques: costume.api.models.technique.technique_set.TechniqueSet or None
            :type thumbnail: costume.api.models.image.image.Image or None
            :type url: str or None
            '''

            if isinstance(object, Object):
                self.set_collection_id(object.collection_id)
                self.set_institution_id(object.institution_id)
                self.set_model_metadata(object.model_metadata)
                self.set_title(object.title)
                self.set_categories(object.categories)
                self.set_date(object.date)
                self.set_date_text(object.date_text)
                self.set_description(object.description)
                self.set_history_notes(object.history_notes)
                self.set_inscriptions(object.inscriptions)
                self.set_materials(object.materials)
                self.set_physical_description(object.physical_description)
                self.set_provenance(object.provenance)
                self.set_summary(object.summary)
                self.set_techniques(object.techniques)
                self.set_thumbnail(object.thumbnail)
                self.set_url(object.url)
            elif isinstance(object, dict):
                for key, value in object.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(object)
            return self

        @property
        def url(self):
            '''
            :rtype: str
            '''

            return self.__url

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

        @date.setter
        def date(self, date):
            '''
            :type date: datetime or None
            '''

            self.set_date(date)

        @date_text.setter
        def date_text(self, date_text):
            '''
            :type date_text: str or None
            '''

            self.set_date_text(date_text)

        @description.setter
        def description(self, description):
            '''
            :type description: str or None
            '''

            self.set_description(description)

        @history_notes.setter
        def history_notes(self, history_notes):
            '''
            :type history_notes: str or None
            '''

            self.set_history_notes(history_notes)

        @inscriptions.setter
        def inscriptions(self, inscriptions):
            '''
            :type inscriptions: costume.api.models.inscription.inscription_set.InscriptionSet or None
            '''

            self.set_inscriptions(inscriptions)

        @institution_id.setter
        def institution_id(self, institution_id):
            '''
            :type institution_id: str
            '''

            self.set_institution_id(institution_id)

        @materials.setter
        def materials(self, materials):
            '''
            :type materials: costume.api.models.material.material_set.MaterialSet or None
            '''

            self.set_materials(materials)

        @model_metadata.setter
        def model_metadata(self, model_metadata):
            '''
            :type model_metadata: costume.api.models.model_metadata.ModelMetadata
            '''

            self.set_model_metadata(model_metadata)

        @physical_description.setter
        def physical_description(self, physical_description):
            '''
            :type physical_description: str or None
            '''

            self.set_physical_description(physical_description)

        @provenance.setter
        def provenance(self, provenance):
            '''
            :type provenance: str or None
            '''

            self.set_provenance(provenance)

        @summary.setter
        def summary(self, summary):
            '''
            :type summary: str or None
            '''

            self.set_summary(summary)

        @techniques.setter
        def techniques(self, techniques):
            '''
            :type techniques: costume.api.models.technique.technique_set.TechniqueSet or None
            '''

            self.set_techniques(techniques)

        @thumbnail.setter
        def thumbnail(self, thumbnail):
            '''
            :type thumbnail: costume.api.models.image.image.Image or None
            '''

            self.set_thumbnail(thumbnail)

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

    def __init__(
        self,
        collection_id,
        institution_id,
        model_metadata,
        title,
        categories=None,
        date=None,
        date_text=None,
        description=None,
        history_notes=None,
        inscriptions=None,
        materials=None,
        physical_description=None,
        provenance=None,
        summary=None,
        techniques=None,
        thumbnail=None,
        url=None,
    ):
        '''
        :type collection_id: str
        :type institution_id: str
        :type model_metadata: costume.api.models.model_metadata.ModelMetadata
        :type title: str
        :type categories: tuple(str) or None
        :type date: datetime or None
        :type date_text: str or None
        :type description: str or None
        :type history_notes: str or None
        :type inscriptions: costume.api.models.inscription.inscription_set.InscriptionSet or None
        :type materials: costume.api.models.material.material_set.MaterialSet or None
        :type physical_description: str or None
        :type provenance: str or None
        :type summary: str or None
        :type techniques: costume.api.models.technique.technique_set.TechniqueSet or None
        :type thumbnail: costume.api.models.image.image.Image or None
        :type url: str or None
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

        if categories is not None:
            if not (isinstance(categories, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), categories))) == 0):
                raise TypeError("expected categories to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(categories))
            if len(categories) < 1:
                raise ValueError("expected len(categories) to be >= 1, was %d" % len(categories))
        self.__categories = categories

        if date is not None:
            if not isinstance(date, datetime):
                raise TypeError("expected date to be a datetime but it is a %s" % getattr(__builtin__, 'type')(date))
        self.__date = date

        if date_text is not None:
            if not isinstance(date_text, basestring):
                raise TypeError("expected date_text to be a str but it is a %s" % getattr(__builtin__, 'type')(date_text))
            if len(date_text) < 1:
                raise ValueError("expected len(date_text) to be >= 1, was %d" % len(date_text))
        self.__date_text = date_text

        if description is not None:
            if not isinstance(description, basestring):
                raise TypeError("expected description to be a str but it is a %s" % getattr(__builtin__, 'type')(description))
            if len(description) < 1:
                raise ValueError("expected len(description) to be >= 1, was %d" % len(description))
        self.__description = description

        if history_notes is not None:
            if not isinstance(history_notes, basestring):
                raise TypeError("expected history_notes to be a str but it is a %s" % getattr(__builtin__, 'type')(history_notes))
            if len(history_notes) < 1:
                raise ValueError("expected len(history_notes) to be >= 1, was %d" % len(history_notes))
        self.__history_notes = history_notes

        if inscriptions is not None:
            if not isinstance(inscriptions, costume.api.models.inscription.inscription_set.InscriptionSet):
                raise TypeError("expected inscriptions to be a costume.api.models.inscription.inscription_set.InscriptionSet but it is a %s" % getattr(__builtin__, 'type')(inscriptions))
        self.__inscriptions = inscriptions

        if materials is not None:
            if not isinstance(materials, costume.api.models.material.material_set.MaterialSet):
                raise TypeError("expected materials to be a costume.api.models.material.material_set.MaterialSet but it is a %s" % getattr(__builtin__, 'type')(materials))
        self.__materials = materials

        if physical_description is not None:
            if not isinstance(physical_description, basestring):
                raise TypeError("expected physical_description to be a str but it is a %s" % getattr(__builtin__, 'type')(physical_description))
            if len(physical_description) < 1:
                raise ValueError("expected len(physical_description) to be >= 1, was %d" % len(physical_description))
        self.__physical_description = physical_description

        if provenance is not None:
            if not isinstance(provenance, basestring):
                raise TypeError("expected provenance to be a str but it is a %s" % getattr(__builtin__, 'type')(provenance))
            if len(provenance) < 1:
                raise ValueError("expected len(provenance) to be >= 1, was %d" % len(provenance))
        self.__provenance = provenance

        if summary is not None:
            if not isinstance(summary, basestring):
                raise TypeError("expected summary to be a str but it is a %s" % getattr(__builtin__, 'type')(summary))
            if len(summary) < 1:
                raise ValueError("expected len(summary) to be >= 1, was %d" % len(summary))
        self.__summary = summary

        if techniques is not None:
            if not isinstance(techniques, costume.api.models.technique.technique_set.TechniqueSet):
                raise TypeError("expected techniques to be a costume.api.models.technique.technique_set.TechniqueSet but it is a %s" % getattr(__builtin__, 'type')(techniques))
        self.__techniques = techniques

        if thumbnail is not None:
            if not isinstance(thumbnail, costume.api.models.image.image.Image):
                raise TypeError("expected thumbnail to be a costume.api.models.image.image.Image but it is a %s" % getattr(__builtin__, 'type')(thumbnail))
        self.__thumbnail = thumbnail

        if url is not None:
            if not isinstance(url, basestring):
                raise TypeError("expected url to be a str but it is a %s" % getattr(__builtin__, 'type')(url))
        self.__url = url

    def __eq__(self, other):
        if self.collection_id != other.collection_id:
            return False
        if self.institution_id != other.institution_id:
            return False
        if self.model_metadata != other.model_metadata:
            return False
        if self.title != other.title:
            return False
        if self.categories != other.categories:
            return False
        if self.date != other.date:
            return False
        if self.date_text != other.date_text:
            return False
        if self.description != other.description:
            return False
        if self.history_notes != other.history_notes:
            return False
        if self.inscriptions != other.inscriptions:
            return False
        if self.materials != other.materials:
            return False
        if self.physical_description != other.physical_description:
            return False
        if self.provenance != other.provenance:
            return False
        if self.summary != other.summary:
            return False
        if self.techniques != other.techniques:
            return False
        if self.thumbnail != other.thumbnail:
            return False
        if self.url != other.url:
            return False
        return True

    def __hash__(self):
        return hash((self.collection_id,self.institution_id,self.model_metadata,self.title,self.categories,self.date,self.date_text,self.description,self.history_notes,self.inscriptions,self.materials,self.physical_description,self.provenance,self.summary,self.techniques,self.thumbnail,self.url,))

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
        if self.categories is not None:
            field_reprs.append('categories=' + repr(self.categories))
        if self.date is not None:
            field_reprs.append('date=' + repr(self.date))
        if self.date_text is not None:
            field_reprs.append('date_text=' + "'" + self.date_text.encode('ascii', 'replace') + "'")
        if self.description is not None:
            field_reprs.append('description=' + "'" + self.description.encode('ascii', 'replace') + "'")
        if self.history_notes is not None:
            field_reprs.append('history_notes=' + "'" + self.history_notes.encode('ascii', 'replace') + "'")
        if self.inscriptions is not None:
            field_reprs.append('inscriptions=' + repr(self.inscriptions))
        if self.materials is not None:
            field_reprs.append('materials=' + repr(self.materials))
        if self.physical_description is not None:
            field_reprs.append('physical_description=' + "'" + self.physical_description.encode('ascii', 'replace') + "'")
        if self.provenance is not None:
            field_reprs.append('provenance=' + "'" + self.provenance.encode('ascii', 'replace') + "'")
        if self.summary is not None:
            field_reprs.append('summary=' + "'" + self.summary.encode('ascii', 'replace') + "'")
        if self.techniques is not None:
            field_reprs.append('techniques=' + repr(self.techniques))
        if self.thumbnail is not None:
            field_reprs.append('thumbnail=' + repr(self.thumbnail))
        if self.url is not None:
            field_reprs.append('url=' + "'" + self.url.encode('ascii', 'replace') + "'")
        return 'Object(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('collection_id=' + "'" + self.collection_id.encode('ascii', 'replace') + "'")
        field_reprs.append('institution_id=' + "'" + self.institution_id.encode('ascii', 'replace') + "'")
        field_reprs.append('model_metadata=' + repr(self.model_metadata))
        field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        if self.categories is not None:
            field_reprs.append('categories=' + repr(self.categories))
        if self.date is not None:
            field_reprs.append('date=' + repr(self.date))
        if self.date_text is not None:
            field_reprs.append('date_text=' + "'" + self.date_text.encode('ascii', 'replace') + "'")
        if self.description is not None:
            field_reprs.append('description=' + "'" + self.description.encode('ascii', 'replace') + "'")
        if self.history_notes is not None:
            field_reprs.append('history_notes=' + "'" + self.history_notes.encode('ascii', 'replace') + "'")
        if self.inscriptions is not None:
            field_reprs.append('inscriptions=' + repr(self.inscriptions))
        if self.materials is not None:
            field_reprs.append('materials=' + repr(self.materials))
        if self.physical_description is not None:
            field_reprs.append('physical_description=' + "'" + self.physical_description.encode('ascii', 'replace') + "'")
        if self.provenance is not None:
            field_reprs.append('provenance=' + "'" + self.provenance.encode('ascii', 'replace') + "'")
        if self.summary is not None:
            field_reprs.append('summary=' + "'" + self.summary.encode('ascii', 'replace') + "'")
        if self.techniques is not None:
            field_reprs.append('techniques=' + repr(self.techniques))
        if self.thumbnail is not None:
            field_reprs.append('thumbnail=' + repr(self.thumbnail))
        if self.url is not None:
            field_reprs.append('url=' + "'" + self.url.encode('ascii', 'replace') + "'")
        return 'Object(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'collection_id': self.collection_id, 'institution_id': self.institution_id, 'model_metadata': self.model_metadata, 'title': self.title, 'categories': self.categories, 'date': self.date, 'date_text': self.date_text, 'description': self.description, 'history_notes': self.history_notes, 'inscriptions': self.inscriptions, 'materials': self.materials, 'physical_description': self.physical_description, 'provenance': self.provenance, 'summary': self.summary, 'techniques': self.techniques, 'thumbnail': self.thumbnail, 'url': self.url}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.collection_id, self.institution_id, self.model_metadata, self.title, self.categories, self.date, self.date_text, self.description, self.history_notes, self.inscriptions, self.materials, self.physical_description, self.provenance, self.summary, self.techniques, self.thumbnail, self.url,)

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
    def date(self):
        '''
        :rtype: datetime
        '''

        return self.__date

    @property
    def date_text(self):
        '''
        :rtype: str
        '''

        return self.__date_text

    @property
    def description(self):
        '''
        :rtype: str
        '''

        return self.__description

    @property
    def history_notes(self):
        '''
        :rtype: str
        '''

        return self.__history_notes

    @property
    def inscriptions(self):
        '''
        :rtype: costume.api.models.inscription.inscription_set.InscriptionSet
        '''

        return self.__inscriptions

    @property
    def institution_id(self):
        '''
        :rtype: str
        '''

        return self.__institution_id

    @property
    def materials(self):
        '''
        :rtype: costume.api.models.material.material_set.MaterialSet
        '''

        return self.__materials

    @property
    def model_metadata(self):
        '''
        :rtype: costume.api.models.model_metadata.ModelMetadata
        '''

        return self.__model_metadata

    @property
    def physical_description(self):
        '''
        :rtype: str
        '''

        return self.__physical_description

    @property
    def provenance(self):
        '''
        :rtype: str
        '''

        return self.__provenance

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: costume.api.models.object.object.Object
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
            elif ifield_name == 'model_metadata' and ifield_id == 14:
                init_kwds['model_metadata'] = costume.api.models.model_metadata.ModelMetadata.read(iprot)
            elif ifield_name == 'title' and ifield_id == 3:
                init_kwds['title'] = iprot.read_string()
            elif ifield_name == 'categories' and ifield_id == 18:
                init_kwds['categories'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'date' and ifield_id == 10:
                try:
                    init_kwds['date'] = iprot.read_date_time()
                except (TypeError,):
                    pass
            elif ifield_name == 'date_text' and ifield_id == 11:
                try:
                    init_kwds['date_text'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'description' and ifield_id == 4:
                try:
                    init_kwds['description'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'history_notes' and ifield_id == 19:
                try:
                    init_kwds['history_notes'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'inscriptions' and ifield_id == 17:
                init_kwds['inscriptions'] = costume.api.models.inscription.inscription_set.InscriptionSet.read(iprot)
            elif ifield_name == 'materials' and ifield_id == 15:
                init_kwds['materials'] = costume.api.models.material.material_set.MaterialSet.read(iprot)
            elif ifield_name == 'physical_description' and ifield_id == 12:
                try:
                    init_kwds['physical_description'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'provenance' and ifield_id == 5:
                try:
                    init_kwds['provenance'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'summary' and ifield_id == 7:
                try:
                    init_kwds['summary'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'techniques' and ifield_id == 16:
                init_kwds['techniques'] = costume.api.models.technique.technique_set.TechniqueSet.read(iprot)
            elif ifield_name == 'thumbnail' and ifield_id == 8:
                init_kwds['thumbnail'] = costume.api.models.image.image.Image.read(iprot)
            elif ifield_name == 'url' and ifield_id == 9:
                try:
                    init_kwds['url'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        collection_id=None,
        institution_id=None,
        model_metadata=None,
        title=None,
        categories=None,
        date=None,
        date_text=None,
        description=None,
        history_notes=None,
        inscriptions=None,
        materials=None,
        physical_description=None,
        provenance=None,
        summary=None,
        techniques=None,
        thumbnail=None,
        url=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type collection_id: str or None
        :type institution_id: str or None
        :type model_metadata: costume.api.models.model_metadata.ModelMetadata or None
        :type title: str or None
        :type categories: tuple(str) or None
        :type date: datetime or None
        :type date_text: str or None
        :type description: str or None
        :type history_notes: str or None
        :type inscriptions: costume.api.models.inscription.inscription_set.InscriptionSet or None
        :type materials: costume.api.models.material.material_set.MaterialSet or None
        :type physical_description: str or None
        :type provenance: str or None
        :type summary: str or None
        :type techniques: costume.api.models.technique.technique_set.TechniqueSet or None
        :type thumbnail: costume.api.models.image.image.Image or None
        :type url: str or None
        :rtype: costume.api.models.object.object.Object
        '''

        if collection_id is None:
            collection_id = self.collection_id
        if institution_id is None:
            institution_id = self.institution_id
        if model_metadata is None:
            model_metadata = self.model_metadata
        if title is None:
            title = self.title
        if categories is None:
            categories = self.categories
        if date is None:
            date = self.date
        if date_text is None:
            date_text = self.date_text
        if description is None:
            description = self.description
        if history_notes is None:
            history_notes = self.history_notes
        if inscriptions is None:
            inscriptions = self.inscriptions
        if materials is None:
            materials = self.materials
        if physical_description is None:
            physical_description = self.physical_description
        if provenance is None:
            provenance = self.provenance
        if summary is None:
            summary = self.summary
        if techniques is None:
            techniques = self.techniques
        if thumbnail is None:
            thumbnail = self.thumbnail
        if url is None:
            url = self.url
        return self.__class__(collection_id=collection_id, institution_id=institution_id, model_metadata=model_metadata, title=title, categories=categories, date=date, date_text=date_text, description=description, history_notes=history_notes, inscriptions=inscriptions, materials=materials, physical_description=physical_description, provenance=provenance, summary=summary, techniques=techniques, thumbnail=thumbnail, url=url)

    @property
    def summary(self):
        '''
        :rtype: str
        '''

        return self.__summary

    @property
    def techniques(self):
        '''
        :rtype: costume.api.models.technique.technique_set.TechniqueSet
        '''

        return self.__techniques

    @property
    def thumbnail(self):
        '''
        :rtype: costume.api.models.image.image.Image
        '''

        return self.__thumbnail

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

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.models.object.object.Object
        '''

        oprot.write_struct_begin('Object')

        oprot.write_field_begin(name='collection_id', type=11, id=1)
        oprot.write_string(self.collection_id)
        oprot.write_field_end()

        oprot.write_field_begin(name='institution_id', type=11, id=2)
        oprot.write_string(self.institution_id)
        oprot.write_field_end()

        oprot.write_field_begin(name='model_metadata', type=12, id=14)
        self.model_metadata.write(oprot)
        oprot.write_field_end()

        oprot.write_field_begin(name='title', type=11, id=3)
        oprot.write_string(self.title)
        oprot.write_field_end()

        if self.categories is not None:
            oprot.write_field_begin(name='categories', type=15, id=18)
            oprot.write_list_begin(11, len(self.categories))
            for _0 in self.categories:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.date is not None:
            oprot.write_field_begin(name='date', type=10, id=10)
            oprot.write_date_time(self.date)
            oprot.write_field_end()

        if self.date_text is not None:
            oprot.write_field_begin(name='date_text', type=11, id=11)
            oprot.write_string(self.date_text)
            oprot.write_field_end()

        if self.description is not None:
            oprot.write_field_begin(name='description', type=11, id=4)
            oprot.write_string(self.description)
            oprot.write_field_end()

        if self.history_notes is not None:
            oprot.write_field_begin(name='history_notes', type=11, id=19)
            oprot.write_string(self.history_notes)
            oprot.write_field_end()

        if self.inscriptions is not None:
            oprot.write_field_begin(name='inscriptions', type=12, id=17)
            self.inscriptions.write(oprot)
            oprot.write_field_end()

        if self.materials is not None:
            oprot.write_field_begin(name='materials', type=12, id=15)
            self.materials.write(oprot)
            oprot.write_field_end()

        if self.physical_description is not None:
            oprot.write_field_begin(name='physical_description', type=11, id=12)
            oprot.write_string(self.physical_description)
            oprot.write_field_end()

        if self.provenance is not None:
            oprot.write_field_begin(name='provenance', type=11, id=5)
            oprot.write_string(self.provenance)
            oprot.write_field_end()

        if self.summary is not None:
            oprot.write_field_begin(name='summary', type=11, id=7)
            oprot.write_string(self.summary)
            oprot.write_field_end()

        if self.techniques is not None:
            oprot.write_field_begin(name='techniques', type=12, id=16)
            self.techniques.write(oprot)
            oprot.write_field_end()

        if self.thumbnail is not None:
            oprot.write_field_begin(name='thumbnail', type=12, id=8)
            self.thumbnail.write(oprot)
            oprot.write_field_end()

        if self.url is not None:
            oprot.write_field_begin(name='url', type=11, id=9)
            oprot.write_string(self.url)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
