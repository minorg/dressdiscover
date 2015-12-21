from itertools import ifilterfalse
import __builtin__
import costume.api.models.agent.agent_set
import costume.api.models.condition.condition
import costume.api.models.date.date_set
import costume.api.models.description.description_set
import costume.api.models.gender.gender
import costume.api.models.image.image
import costume.api.models.inscription.inscription_set
import costume.api.models.material.material_set
import costume.api.models.model_metadata
import costume.api.models.rights.rights_set
import costume.api.models.subject.subject_set
import costume.api.models.technique.technique_set
import costume.api.models.textref.textref_set
import costume.api.models.title.title_set
import costume.api.models.work_type.work_type_set


class Object(object):
    class Builder(object):
        def __init__(
            self,
            collection_id=None,
            institution_id=None,
            model_metadata=None,
            titles=None,
            agents=None,
            categories=None,
            condition=None,
            dates=None,
            descriptions=None,
            gender=None,
            images=None,
            inscriptions=None,
            materials=None,
            provenance=None,
            quantity=None,
            rights=None,
            subjects=None,
            techniques=None,
            textrefs=None,
            work_types=None,
        ):
            '''
            :type collection_id: str
            :type institution_id: str
            :type model_metadata: costume.api.models.model_metadata.ModelMetadata
            :type titles: costume.api.models.title.title_set.TitleSet
            :type agents: costume.api.models.agent.agent_set.AgentSet or None
            :type categories: tuple(str) or None
            :type condition: costume.api.models.condition.condition.Condition or None
            :type dates: costume.api.models.date.date_set.DateSet or None
            :type descriptions: costume.api.models.description.description_set.DescriptionSet or None
            :type gender: costume.api.models.gender.gender.Gender or None
            :type images: tuple(costume.api.models.image.image.Image) or None
            :type inscriptions: costume.api.models.inscription.inscription_set.InscriptionSet or None
            :type materials: costume.api.models.material.material_set.MaterialSet or None
            :type provenance: str or None
            :type quantity: int or None
            :type rights: costume.api.models.rights.rights_set.RightsSet or None
            :type subjects: costume.api.models.subject.subject_set.SubjectSet or None
            :type techniques: costume.api.models.technique.technique_set.TechniqueSet or None
            :type textrefs: costume.api.models.textref.textref_set.TextrefSet or None
            :type work_types: costume.api.models.work_type.work_type_set.WorkTypeSet or None
            '''

            self.__collection_id = collection_id
            self.__institution_id = institution_id
            self.__model_metadata = model_metadata
            self.__titles = titles
            self.__agents = agents
            self.__categories = categories
            self.__condition = condition
            self.__dates = dates
            self.__descriptions = descriptions
            self.__gender = gender
            self.__images = images
            self.__inscriptions = inscriptions
            self.__materials = materials
            self.__provenance = provenance
            self.__quantity = quantity
            self.__rights = rights
            self.__subjects = subjects
            self.__techniques = techniques
            self.__textrefs = textrefs
            self.__work_types = work_types

        def build(self):
            return Object(collection_id=self.__collection_id, institution_id=self.__institution_id, model_metadata=self.__model_metadata, titles=self.__titles, agents=self.__agents, categories=self.__categories, condition=self.__condition, dates=self.__dates, descriptions=self.__descriptions, gender=self.__gender, images=self.__images, inscriptions=self.__inscriptions, materials=self.__materials, provenance=self.__provenance, quantity=self.__quantity, rights=self.__rights, subjects=self.__subjects, techniques=self.__techniques, textrefs=self.__textrefs, work_types=self.__work_types)

        @property
        def agents(self):
            '''
            :rtype: costume.api.models.agent.agent_set.AgentSet
            '''

            return self.__agents

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
        def condition(self):
            '''
            :rtype: costume.api.models.condition.condition.Condition
            '''

            return self.__condition

        @property
        def dates(self):
            '''
            :rtype: costume.api.models.date.date_set.DateSet
            '''

            return self.__dates

        @property
        def descriptions(self):
            '''
            :rtype: costume.api.models.description.description_set.DescriptionSet
            '''

            return self.__descriptions

        @property
        def gender(self):
            '''
            :rtype: costume.api.models.gender.gender.Gender
            '''

            return self.__gender

        @property
        def images(self):
            '''
            :rtype: tuple(costume.api.models.image.image.Image)
            '''

            return self.__images

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
        def provenance(self):
            '''
            :rtype: str
            '''

            return self.__provenance

        @property
        def quantity(self):
            '''
            :rtype: int
            '''

            return self.__quantity

        @property
        def rights(self):
            '''
            :rtype: costume.api.models.rights.rights_set.RightsSet
            '''

            return self.__rights

        def set_agents(self, agents):
            '''
            :type agents: costume.api.models.agent.agent_set.AgentSet or None
            '''

            self.__agents = agents
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

        def set_condition(self, condition):
            '''
            :type condition: costume.api.models.condition.condition.Condition or None
            '''

            self.__condition = condition
            return self

        def set_dates(self, dates):
            '''
            :type dates: costume.api.models.date.date_set.DateSet or None
            '''

            self.__dates = dates
            return self

        def set_descriptions(self, descriptions):
            '''
            :type descriptions: costume.api.models.description.description_set.DescriptionSet or None
            '''

            self.__descriptions = descriptions
            return self

        def set_gender(self, gender):
            '''
            :type gender: costume.api.models.gender.gender.Gender or None
            '''

            self.__gender = gender
            return self

        def set_images(self, images):
            '''
            :type images: tuple(costume.api.models.image.image.Image) or None
            '''

            self.__images = images
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

        def set_provenance(self, provenance):
            '''
            :type provenance: str or None
            '''

            self.__provenance = provenance
            return self

        def set_quantity(self, quantity):
            '''
            :type quantity: int or None
            '''

            self.__quantity = quantity
            return self

        def set_rights(self, rights):
            '''
            :type rights: costume.api.models.rights.rights_set.RightsSet or None
            '''

            self.__rights = rights
            return self

        def set_subjects(self, subjects):
            '''
            :type subjects: costume.api.models.subject.subject_set.SubjectSet or None
            '''

            self.__subjects = subjects
            return self

        def set_techniques(self, techniques):
            '''
            :type techniques: costume.api.models.technique.technique_set.TechniqueSet or None
            '''

            self.__techniques = techniques
            return self

        def set_textrefs(self, textrefs):
            '''
            :type textrefs: costume.api.models.textref.textref_set.TextrefSet or None
            '''

            self.__textrefs = textrefs
            return self

        def set_titles(self, titles):
            '''
            :type titles: costume.api.models.title.title_set.TitleSet
            '''

            self.__titles = titles
            return self

        def set_work_types(self, work_types):
            '''
            :type work_types: costume.api.models.work_type.work_type_set.WorkTypeSet or None
            '''

            self.__work_types = work_types
            return self

        @property
        def subjects(self):
            '''
            :rtype: costume.api.models.subject.subject_set.SubjectSet
            '''

            return self.__subjects

        @property
        def techniques(self):
            '''
            :rtype: costume.api.models.technique.technique_set.TechniqueSet
            '''

            return self.__techniques

        @property
        def textrefs(self):
            '''
            :rtype: costume.api.models.textref.textref_set.TextrefSet
            '''

            return self.__textrefs

        @property
        def titles(self):
            '''
            :rtype: costume.api.models.title.title_set.TitleSet
            '''

            return self.__titles

        def update(self, object):
            '''
            :type collection_id: str
            :type institution_id: str
            :type model_metadata: costume.api.models.model_metadata.ModelMetadata
            :type titles: costume.api.models.title.title_set.TitleSet
            :type agents: costume.api.models.agent.agent_set.AgentSet or None
            :type categories: tuple(str) or None
            :type condition: costume.api.models.condition.condition.Condition or None
            :type dates: costume.api.models.date.date_set.DateSet or None
            :type descriptions: costume.api.models.description.description_set.DescriptionSet or None
            :type gender: costume.api.models.gender.gender.Gender or None
            :type images: tuple(costume.api.models.image.image.Image) or None
            :type inscriptions: costume.api.models.inscription.inscription_set.InscriptionSet or None
            :type materials: costume.api.models.material.material_set.MaterialSet or None
            :type provenance: str or None
            :type quantity: int or None
            :type rights: costume.api.models.rights.rights_set.RightsSet or None
            :type subjects: costume.api.models.subject.subject_set.SubjectSet or None
            :type techniques: costume.api.models.technique.technique_set.TechniqueSet or None
            :type textrefs: costume.api.models.textref.textref_set.TextrefSet or None
            :type work_types: costume.api.models.work_type.work_type_set.WorkTypeSet or None
            '''

            if isinstance(object, Object):
                self.set_collection_id(object.collection_id)
                self.set_institution_id(object.institution_id)
                self.set_model_metadata(object.model_metadata)
                self.set_titles(object.titles)
                self.set_agents(object.agents)
                self.set_categories(object.categories)
                self.set_condition(object.condition)
                self.set_dates(object.dates)
                self.set_descriptions(object.descriptions)
                self.set_gender(object.gender)
                self.set_images(object.images)
                self.set_inscriptions(object.inscriptions)
                self.set_materials(object.materials)
                self.set_provenance(object.provenance)
                self.set_quantity(object.quantity)
                self.set_rights(object.rights)
                self.set_subjects(object.subjects)
                self.set_techniques(object.techniques)
                self.set_textrefs(object.textrefs)
                self.set_work_types(object.work_types)
            elif isinstance(object, dict):
                for key, value in object.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(object)
            return self

        @property
        def work_types(self):
            '''
            :rtype: costume.api.models.work_type.work_type_set.WorkTypeSet
            '''

            return self.__work_types

        @agents.setter
        def agents(self, agents):
            '''
            :type agents: costume.api.models.agent.agent_set.AgentSet or None
            '''

            self.set_agents(agents)

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

        @condition.setter
        def condition(self, condition):
            '''
            :type condition: costume.api.models.condition.condition.Condition or None
            '''

            self.set_condition(condition)

        @dates.setter
        def dates(self, dates):
            '''
            :type dates: costume.api.models.date.date_set.DateSet or None
            '''

            self.set_dates(dates)

        @descriptions.setter
        def descriptions(self, descriptions):
            '''
            :type descriptions: costume.api.models.description.description_set.DescriptionSet or None
            '''

            self.set_descriptions(descriptions)

        @gender.setter
        def gender(self, gender):
            '''
            :type gender: costume.api.models.gender.gender.Gender or None
            '''

            self.set_gender(gender)

        @images.setter
        def images(self, images):
            '''
            :type images: tuple(costume.api.models.image.image.Image) or None
            '''

            self.set_images(images)

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

        @provenance.setter
        def provenance(self, provenance):
            '''
            :type provenance: str or None
            '''

            self.set_provenance(provenance)

        @quantity.setter
        def quantity(self, quantity):
            '''
            :type quantity: int or None
            '''

            self.set_quantity(quantity)

        @rights.setter
        def rights(self, rights):
            '''
            :type rights: costume.api.models.rights.rights_set.RightsSet or None
            '''

            self.set_rights(rights)

        @subjects.setter
        def subjects(self, subjects):
            '''
            :type subjects: costume.api.models.subject.subject_set.SubjectSet or None
            '''

            self.set_subjects(subjects)

        @techniques.setter
        def techniques(self, techniques):
            '''
            :type techniques: costume.api.models.technique.technique_set.TechniqueSet or None
            '''

            self.set_techniques(techniques)

        @textrefs.setter
        def textrefs(self, textrefs):
            '''
            :type textrefs: costume.api.models.textref.textref_set.TextrefSet or None
            '''

            self.set_textrefs(textrefs)

        @titles.setter
        def titles(self, titles):
            '''
            :type titles: costume.api.models.title.title_set.TitleSet
            '''

            self.set_titles(titles)

        @work_types.setter
        def work_types(self, work_types):
            '''
            :type work_types: costume.api.models.work_type.work_type_set.WorkTypeSet or None
            '''

            self.set_work_types(work_types)

    def __init__(
        self,
        collection_id,
        institution_id,
        model_metadata,
        titles,
        agents=None,
        categories=None,
        condition=None,
        dates=None,
        descriptions=None,
        gender=None,
        images=None,
        inscriptions=None,
        materials=None,
        provenance=None,
        quantity=None,
        rights=None,
        subjects=None,
        techniques=None,
        textrefs=None,
        work_types=None,
    ):
        '''
        :type collection_id: str
        :type institution_id: str
        :type model_metadata: costume.api.models.model_metadata.ModelMetadata
        :type titles: costume.api.models.title.title_set.TitleSet
        :type agents: costume.api.models.agent.agent_set.AgentSet or None
        :type categories: tuple(str) or None
        :type condition: costume.api.models.condition.condition.Condition or None
        :type dates: costume.api.models.date.date_set.DateSet or None
        :type descriptions: costume.api.models.description.description_set.DescriptionSet or None
        :type gender: costume.api.models.gender.gender.Gender or None
        :type images: tuple(costume.api.models.image.image.Image) or None
        :type inscriptions: costume.api.models.inscription.inscription_set.InscriptionSet or None
        :type materials: costume.api.models.material.material_set.MaterialSet or None
        :type provenance: str or None
        :type quantity: int or None
        :type rights: costume.api.models.rights.rights_set.RightsSet or None
        :type subjects: costume.api.models.subject.subject_set.SubjectSet or None
        :type techniques: costume.api.models.technique.technique_set.TechniqueSet or None
        :type textrefs: costume.api.models.textref.textref_set.TextrefSet or None
        :type work_types: costume.api.models.work_type.work_type_set.WorkTypeSet or None
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

        if titles is None:
            raise ValueError('titles is required')
        if not isinstance(titles, costume.api.models.title.title_set.TitleSet):
            raise TypeError("expected titles to be a costume.api.models.title.title_set.TitleSet but it is a %s" % getattr(__builtin__, 'type')(titles))
        self.__titles = titles

        if agents is not None:
            if not isinstance(agents, costume.api.models.agent.agent_set.AgentSet):
                raise TypeError("expected agents to be a costume.api.models.agent.agent_set.AgentSet but it is a %s" % getattr(__builtin__, 'type')(agents))
        self.__agents = agents

        if categories is not None:
            if not (isinstance(categories, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), categories))) == 0):
                raise TypeError("expected categories to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(categories))
            if len(categories) < 1:
                raise ValueError("expected len(categories) to be >= 1, was %d" % len(categories))
        self.__categories = categories

        if condition is not None:
            if not isinstance(condition, costume.api.models.condition.condition.Condition):
                raise TypeError("expected condition to be a costume.api.models.condition.condition.Condition but it is a %s" % getattr(__builtin__, 'type')(condition))
        self.__condition = condition

        if dates is not None:
            if not isinstance(dates, costume.api.models.date.date_set.DateSet):
                raise TypeError("expected dates to be a costume.api.models.date.date_set.DateSet but it is a %s" % getattr(__builtin__, 'type')(dates))
        self.__dates = dates

        if descriptions is not None:
            if not isinstance(descriptions, costume.api.models.description.description_set.DescriptionSet):
                raise TypeError("expected descriptions to be a costume.api.models.description.description_set.DescriptionSet but it is a %s" % getattr(__builtin__, 'type')(descriptions))
        self.__descriptions = descriptions

        if gender is not None:
            if not isinstance(gender, costume.api.models.gender.gender.Gender):
                raise TypeError("expected gender to be a costume.api.models.gender.gender.Gender but it is a %s" % getattr(__builtin__, 'type')(gender))
        self.__gender = gender

        if images is not None:
            if not (isinstance(images, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, costume.api.models.image.image.Image), images))) == 0):
                raise TypeError("expected images to be a tuple(costume.api.models.image.image.Image) but it is a %s" % getattr(__builtin__, 'type')(images))
            if len(images) < 1:
                raise ValueError("expected len(images) to be >= 1, was %d" % len(images))
        self.__images = images

        if inscriptions is not None:
            if not isinstance(inscriptions, costume.api.models.inscription.inscription_set.InscriptionSet):
                raise TypeError("expected inscriptions to be a costume.api.models.inscription.inscription_set.InscriptionSet but it is a %s" % getattr(__builtin__, 'type')(inscriptions))
        self.__inscriptions = inscriptions

        if materials is not None:
            if not isinstance(materials, costume.api.models.material.material_set.MaterialSet):
                raise TypeError("expected materials to be a costume.api.models.material.material_set.MaterialSet but it is a %s" % getattr(__builtin__, 'type')(materials))
        self.__materials = materials

        if provenance is not None:
            if not isinstance(provenance, basestring):
                raise TypeError("expected provenance to be a str but it is a %s" % getattr(__builtin__, 'type')(provenance))
            if len(provenance) < 1:
                raise ValueError("expected len(provenance) to be >= 1, was %d" % len(provenance))
        self.__provenance = provenance

        if quantity is not None:
            if not isinstance(quantity, (int, long)) and quantity >= 0:
                raise TypeError("expected quantity to be a int but it is a %s" % getattr(__builtin__, 'type')(quantity))
        self.__quantity = quantity

        if rights is not None:
            if not isinstance(rights, costume.api.models.rights.rights_set.RightsSet):
                raise TypeError("expected rights to be a costume.api.models.rights.rights_set.RightsSet but it is a %s" % getattr(__builtin__, 'type')(rights))
        self.__rights = rights

        if subjects is not None:
            if not isinstance(subjects, costume.api.models.subject.subject_set.SubjectSet):
                raise TypeError("expected subjects to be a costume.api.models.subject.subject_set.SubjectSet but it is a %s" % getattr(__builtin__, 'type')(subjects))
        self.__subjects = subjects

        if techniques is not None:
            if not isinstance(techniques, costume.api.models.technique.technique_set.TechniqueSet):
                raise TypeError("expected techniques to be a costume.api.models.technique.technique_set.TechniqueSet but it is a %s" % getattr(__builtin__, 'type')(techniques))
        self.__techniques = techniques

        if textrefs is not None:
            if not isinstance(textrefs, costume.api.models.textref.textref_set.TextrefSet):
                raise TypeError("expected textrefs to be a costume.api.models.textref.textref_set.TextrefSet but it is a %s" % getattr(__builtin__, 'type')(textrefs))
        self.__textrefs = textrefs

        if work_types is not None:
            if not isinstance(work_types, costume.api.models.work_type.work_type_set.WorkTypeSet):
                raise TypeError("expected work_types to be a costume.api.models.work_type.work_type_set.WorkTypeSet but it is a %s" % getattr(__builtin__, 'type')(work_types))
        self.__work_types = work_types

    def __eq__(self, other):
        if self.collection_id != other.collection_id:
            return False
        if self.institution_id != other.institution_id:
            return False
        if self.model_metadata != other.model_metadata:
            return False
        if self.titles != other.titles:
            return False
        if self.agents != other.agents:
            return False
        if self.categories != other.categories:
            return False
        if self.condition != other.condition:
            return False
        if self.dates != other.dates:
            return False
        if self.descriptions != other.descriptions:
            return False
        if self.gender != other.gender:
            return False
        if self.images != other.images:
            return False
        if self.inscriptions != other.inscriptions:
            return False
        if self.materials != other.materials:
            return False
        if self.provenance != other.provenance:
            return False
        if self.quantity != other.quantity:
            return False
        if self.rights != other.rights:
            return False
        if self.subjects != other.subjects:
            return False
        if self.techniques != other.techniques:
            return False
        if self.textrefs != other.textrefs:
            return False
        if self.work_types != other.work_types:
            return False
        return True

    def __hash__(self):
        return hash((self.collection_id,self.institution_id,self.model_metadata,self.titles,self.agents,self.categories,self.condition,self.dates,self.descriptions,self.gender,self.images,self.inscriptions,self.materials,self.provenance,self.quantity,self.rights,self.subjects,self.techniques,self.textrefs,self.work_types,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('collection_id=' + "'" + self.collection_id.encode('ascii', 'replace') + "'")
        field_reprs.append('institution_id=' + "'" + self.institution_id.encode('ascii', 'replace') + "'")
        field_reprs.append('model_metadata=' + repr(self.model_metadata))
        field_reprs.append('titles=' + repr(self.titles))
        if self.agents is not None:
            field_reprs.append('agents=' + repr(self.agents))
        if self.categories is not None:
            field_reprs.append('categories=' + repr(self.categories))
        if self.condition is not None:
            field_reprs.append('condition=' + repr(self.condition))
        if self.dates is not None:
            field_reprs.append('dates=' + repr(self.dates))
        if self.descriptions is not None:
            field_reprs.append('descriptions=' + repr(self.descriptions))
        if self.gender is not None:
            field_reprs.append('gender=' + repr(self.gender))
        if self.images is not None:
            field_reprs.append('images=' + repr(self.images))
        if self.inscriptions is not None:
            field_reprs.append('inscriptions=' + repr(self.inscriptions))
        if self.materials is not None:
            field_reprs.append('materials=' + repr(self.materials))
        if self.provenance is not None:
            field_reprs.append('provenance=' + "'" + self.provenance.encode('ascii', 'replace') + "'")
        if self.quantity is not None:
            field_reprs.append('quantity=' + repr(self.quantity))
        if self.rights is not None:
            field_reprs.append('rights=' + repr(self.rights))
        if self.subjects is not None:
            field_reprs.append('subjects=' + repr(self.subjects))
        if self.techniques is not None:
            field_reprs.append('techniques=' + repr(self.techniques))
        if self.textrefs is not None:
            field_reprs.append('textrefs=' + repr(self.textrefs))
        if self.work_types is not None:
            field_reprs.append('work_types=' + repr(self.work_types))
        return 'Object(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('collection_id=' + "'" + self.collection_id.encode('ascii', 'replace') + "'")
        field_reprs.append('institution_id=' + "'" + self.institution_id.encode('ascii', 'replace') + "'")
        field_reprs.append('model_metadata=' + repr(self.model_metadata))
        field_reprs.append('titles=' + repr(self.titles))
        if self.agents is not None:
            field_reprs.append('agents=' + repr(self.agents))
        if self.categories is not None:
            field_reprs.append('categories=' + repr(self.categories))
        if self.condition is not None:
            field_reprs.append('condition=' + repr(self.condition))
        if self.dates is not None:
            field_reprs.append('dates=' + repr(self.dates))
        if self.descriptions is not None:
            field_reprs.append('descriptions=' + repr(self.descriptions))
        if self.gender is not None:
            field_reprs.append('gender=' + repr(self.gender))
        if self.images is not None:
            field_reprs.append('images=' + repr(self.images))
        if self.inscriptions is not None:
            field_reprs.append('inscriptions=' + repr(self.inscriptions))
        if self.materials is not None:
            field_reprs.append('materials=' + repr(self.materials))
        if self.provenance is not None:
            field_reprs.append('provenance=' + "'" + self.provenance.encode('ascii', 'replace') + "'")
        if self.quantity is not None:
            field_reprs.append('quantity=' + repr(self.quantity))
        if self.rights is not None:
            field_reprs.append('rights=' + repr(self.rights))
        if self.subjects is not None:
            field_reprs.append('subjects=' + repr(self.subjects))
        if self.techniques is not None:
            field_reprs.append('techniques=' + repr(self.techniques))
        if self.textrefs is not None:
            field_reprs.append('textrefs=' + repr(self.textrefs))
        if self.work_types is not None:
            field_reprs.append('work_types=' + repr(self.work_types))
        return 'Object(' + ', '.join(field_reprs) + ')'

    @property
    def agents(self):
        '''
        :rtype: costume.api.models.agent.agent_set.AgentSet
        '''

        return self.__agents

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'collection_id': self.collection_id, 'institution_id': self.institution_id, 'model_metadata': self.model_metadata, 'titles': self.titles, 'agents': self.agents, 'categories': self.categories, 'condition': self.condition, 'dates': self.dates, 'descriptions': self.descriptions, 'gender': self.gender, 'images': self.images, 'inscriptions': self.inscriptions, 'materials': self.materials, 'provenance': self.provenance, 'quantity': self.quantity, 'rights': self.rights, 'subjects': self.subjects, 'techniques': self.techniques, 'textrefs': self.textrefs, 'work_types': self.work_types}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.collection_id, self.institution_id, self.model_metadata, self.titles, self.agents, self.categories, self.condition, self.dates, self.descriptions, self.gender, self.images, self.inscriptions, self.materials, self.provenance, self.quantity, self.rights, self.subjects, self.techniques, self.textrefs, self.work_types,)

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
    def condition(self):
        '''
        :rtype: costume.api.models.condition.condition.Condition
        '''

        return self.__condition

    @property
    def dates(self):
        '''
        :rtype: costume.api.models.date.date_set.DateSet
        '''

        return self.__dates

    @property
    def descriptions(self):
        '''
        :rtype: costume.api.models.description.description_set.DescriptionSet
        '''

        return self.__descriptions

    @property
    def gender(self):
        '''
        :rtype: costume.api.models.gender.gender.Gender
        '''

        return self.__gender

    @property
    def images(self):
        '''
        :rtype: tuple(costume.api.models.image.image.Image)
        '''

        return self.__images

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
    def provenance(self):
        '''
        :rtype: str
        '''

        return self.__provenance

    @property
    def quantity(self):
        '''
        :rtype: int
        '''

        return self.__quantity

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
            elif ifield_name == 'titles' and ifield_id == 3:
                init_kwds['titles'] = costume.api.models.title.title_set.TitleSet.read(iprot)
            elif ifield_name == 'agents' and ifield_id == 20:
                init_kwds['agents'] = costume.api.models.agent.agent_set.AgentSet.read(iprot)
            elif ifield_name == 'categories' and ifield_id == 18:
                init_kwds['categories'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'condition' and ifield_id == 27:
                try:
                    init_kwds['condition'] = costume.api.models.condition.condition.Condition.value_of(iprot.read_string().strip().upper())
                except (TypeError,):
                    pass
            elif ifield_name == 'dates' and ifield_id == 10:
                init_kwds['dates'] = costume.api.models.date.date_set.DateSet.read(iprot)
            elif ifield_name == 'descriptions' and ifield_id == 4:
                init_kwds['descriptions'] = costume.api.models.description.description_set.DescriptionSet.read(iprot)
            elif ifield_name == 'gender' and ifield_id == 25:
                try:
                    init_kwds['gender'] = costume.api.models.gender.gender.Gender.value_of(iprot.read_string().strip().upper())
                except (TypeError,):
                    pass
            elif ifield_name == 'images' and ifield_id == 23:
                init_kwds['images'] = tuple([costume.api.models.image.image.Image.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'inscriptions' and ifield_id == 17:
                init_kwds['inscriptions'] = costume.api.models.inscription.inscription_set.InscriptionSet.read(iprot)
            elif ifield_name == 'materials' and ifield_id == 15:
                init_kwds['materials'] = costume.api.models.material.material_set.MaterialSet.read(iprot)
            elif ifield_name == 'provenance' and ifield_id == 5:
                try:
                    init_kwds['provenance'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'quantity' and ifield_id == 26:
                try:
                    init_kwds['quantity'] = iprot.read_u32()
                except (TypeError,):
                    pass
            elif ifield_name == 'rights' and ifield_id == 22:
                init_kwds['rights'] = costume.api.models.rights.rights_set.RightsSet.read(iprot)
            elif ifield_name == 'subjects' and ifield_id == 21:
                init_kwds['subjects'] = costume.api.models.subject.subject_set.SubjectSet.read(iprot)
            elif ifield_name == 'techniques' and ifield_id == 16:
                init_kwds['techniques'] = costume.api.models.technique.technique_set.TechniqueSet.read(iprot)
            elif ifield_name == 'textrefs' and ifield_id == 9:
                init_kwds['textrefs'] = costume.api.models.textref.textref_set.TextrefSet.read(iprot)
            elif ifield_name == 'work_types' and ifield_id == 24:
                init_kwds['work_types'] = costume.api.models.work_type.work_type_set.WorkTypeSet.read(iprot)
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        collection_id=None,
        institution_id=None,
        model_metadata=None,
        titles=None,
        agents=None,
        categories=None,
        condition=None,
        dates=None,
        descriptions=None,
        gender=None,
        images=None,
        inscriptions=None,
        materials=None,
        provenance=None,
        quantity=None,
        rights=None,
        subjects=None,
        techniques=None,
        textrefs=None,
        work_types=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type collection_id: str or None
        :type institution_id: str or None
        :type model_metadata: costume.api.models.model_metadata.ModelMetadata or None
        :type titles: costume.api.models.title.title_set.TitleSet or None
        :type agents: costume.api.models.agent.agent_set.AgentSet or None
        :type categories: tuple(str) or None
        :type condition: costume.api.models.condition.condition.Condition or None
        :type dates: costume.api.models.date.date_set.DateSet or None
        :type descriptions: costume.api.models.description.description_set.DescriptionSet or None
        :type gender: costume.api.models.gender.gender.Gender or None
        :type images: tuple(costume.api.models.image.image.Image) or None
        :type inscriptions: costume.api.models.inscription.inscription_set.InscriptionSet or None
        :type materials: costume.api.models.material.material_set.MaterialSet or None
        :type provenance: str or None
        :type quantity: int or None
        :type rights: costume.api.models.rights.rights_set.RightsSet or None
        :type subjects: costume.api.models.subject.subject_set.SubjectSet or None
        :type techniques: costume.api.models.technique.technique_set.TechniqueSet or None
        :type textrefs: costume.api.models.textref.textref_set.TextrefSet or None
        :type work_types: costume.api.models.work_type.work_type_set.WorkTypeSet or None
        :rtype: costume.api.models.object.object.Object
        '''

        if collection_id is None:
            collection_id = self.collection_id
        if institution_id is None:
            institution_id = self.institution_id
        if model_metadata is None:
            model_metadata = self.model_metadata
        if titles is None:
            titles = self.titles
        if agents is None:
            agents = self.agents
        if categories is None:
            categories = self.categories
        if condition is None:
            condition = self.condition
        if dates is None:
            dates = self.dates
        if descriptions is None:
            descriptions = self.descriptions
        if gender is None:
            gender = self.gender
        if images is None:
            images = self.images
        if inscriptions is None:
            inscriptions = self.inscriptions
        if materials is None:
            materials = self.materials
        if provenance is None:
            provenance = self.provenance
        if quantity is None:
            quantity = self.quantity
        if rights is None:
            rights = self.rights
        if subjects is None:
            subjects = self.subjects
        if techniques is None:
            techniques = self.techniques
        if textrefs is None:
            textrefs = self.textrefs
        if work_types is None:
            work_types = self.work_types
        return self.__class__(collection_id=collection_id, institution_id=institution_id, model_metadata=model_metadata, titles=titles, agents=agents, categories=categories, condition=condition, dates=dates, descriptions=descriptions, gender=gender, images=images, inscriptions=inscriptions, materials=materials, provenance=provenance, quantity=quantity, rights=rights, subjects=subjects, techniques=techniques, textrefs=textrefs, work_types=work_types)

    @property
    def rights(self):
        '''
        :rtype: costume.api.models.rights.rights_set.RightsSet
        '''

        return self.__rights

    @property
    def subjects(self):
        '''
        :rtype: costume.api.models.subject.subject_set.SubjectSet
        '''

        return self.__subjects

    @property
    def techniques(self):
        '''
        :rtype: costume.api.models.technique.technique_set.TechniqueSet
        '''

        return self.__techniques

    @property
    def textrefs(self):
        '''
        :rtype: costume.api.models.textref.textref_set.TextrefSet
        '''

        return self.__textrefs

    @property
    def titles(self):
        '''
        :rtype: costume.api.models.title.title_set.TitleSet
        '''

        return self.__titles

    @property
    def work_types(self):
        '''
        :rtype: costume.api.models.work_type.work_type_set.WorkTypeSet
        '''

        return self.__work_types

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

        oprot.write_field_begin(name='titles', type=12, id=3)
        self.titles.write(oprot)
        oprot.write_field_end()

        if self.agents is not None:
            oprot.write_field_begin(name='agents', type=12, id=20)
            self.agents.write(oprot)
            oprot.write_field_end()

        if self.categories is not None:
            oprot.write_field_begin(name='categories', type=15, id=18)
            oprot.write_list_begin(11, len(self.categories))
            for _0 in self.categories:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.condition is not None:
            oprot.write_field_begin(name='condition', type=11, id=27)
            oprot.write_string(str(self.condition))
            oprot.write_field_end()

        if self.dates is not None:
            oprot.write_field_begin(name='dates', type=12, id=10)
            self.dates.write(oprot)
            oprot.write_field_end()

        if self.descriptions is not None:
            oprot.write_field_begin(name='descriptions', type=12, id=4)
            self.descriptions.write(oprot)
            oprot.write_field_end()

        if self.gender is not None:
            oprot.write_field_begin(name='gender', type=11, id=25)
            oprot.write_string(str(self.gender))
            oprot.write_field_end()

        if self.images is not None:
            oprot.write_field_begin(name='images', type=15, id=23)
            oprot.write_list_begin(12, len(self.images))
            for _0 in self.images:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.inscriptions is not None:
            oprot.write_field_begin(name='inscriptions', type=12, id=17)
            self.inscriptions.write(oprot)
            oprot.write_field_end()

        if self.materials is not None:
            oprot.write_field_begin(name='materials', type=12, id=15)
            self.materials.write(oprot)
            oprot.write_field_end()

        if self.provenance is not None:
            oprot.write_field_begin(name='provenance', type=11, id=5)
            oprot.write_string(self.provenance)
            oprot.write_field_end()

        if self.quantity is not None:
            oprot.write_field_begin(name='quantity', type=8, id=26)
            oprot.write_u32(self.quantity)
            oprot.write_field_end()

        if self.rights is not None:
            oprot.write_field_begin(name='rights', type=12, id=22)
            self.rights.write(oprot)
            oprot.write_field_end()

        if self.subjects is not None:
            oprot.write_field_begin(name='subjects', type=12, id=21)
            self.subjects.write(oprot)
            oprot.write_field_end()

        if self.techniques is not None:
            oprot.write_field_begin(name='techniques', type=12, id=16)
            self.techniques.write(oprot)
            oprot.write_field_end()

        if self.textrefs is not None:
            oprot.write_field_begin(name='textrefs', type=12, id=9)
            self.textrefs.write(oprot)
            oprot.write_field_end()

        if self.work_types is not None:
            oprot.write_field_begin(name='work_types', type=12, id=24)
            self.work_types.write(oprot)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
