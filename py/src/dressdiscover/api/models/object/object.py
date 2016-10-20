from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.models.image.image
import dressdiscover.api.vocabularies.costume_core.closure.closure_set
import dressdiscover.api.vocabularies.costume_core.color.color_set
import dressdiscover.api.vocabularies.costume_core.component.component_set
import dressdiscover.api.vocabularies.costume_core.condition.condition
import dressdiscover.api.vocabularies.costume_core.gender.gender
import dressdiscover.api.vocabularies.costume_core.structure.structure_set
import dressdiscover.api.vocabularies.vra_core.agent.agent_set
import dressdiscover.api.vocabularies.vra_core.cultural_context.cultural_context_set
import dressdiscover.api.vocabularies.vra_core.date.date_set
import dressdiscover.api.vocabularies.vra_core.description.description_set
import dressdiscover.api.vocabularies.vra_core.inscription.inscription_set
import dressdiscover.api.vocabularies.vra_core.location.location_set
import dressdiscover.api.vocabularies.vra_core.material.material_set
import dressdiscover.api.vocabularies.vra_core.measurements.measurements_set
import dressdiscover.api.vocabularies.vra_core.relation.relation_set
import dressdiscover.api.vocabularies.vra_core.rights.rights_set
import dressdiscover.api.vocabularies.vra_core.subject.subject_set
import dressdiscover.api.vocabularies.vra_core.technique.technique_set
import dressdiscover.api.vocabularies.vra_core.textref.textref_set
import dressdiscover.api.vocabularies.vra_core.title.title_set
import dressdiscover.api.vocabularies.vra_core.view_type.view_type
import dressdiscover.api.vocabularies.vra_core.work_type.work_type_set


class Object(object):
    class Builder(object):
        def __init__(
            self,
            collection_id=None,
            institution_id=None,
            titles=None,
            agents=None,
            categories=None,
            closures=None,
            colors=None,
            components=None,
            condition=None,
            cultural_contexts=None,
            dates=None,
            descriptions=None,
            gender=None,
            hidden=None,
            images=None,
            inscriptions=None,
            locations=None,
            materials=None,
            measurements=None,
            provenance=None,
            quantity=None,
            relations=None,
            rights=None,
            structures=None,
            subjects=None,
            techniques=None,
            textrefs=None,
            view_type=None,
            work_types=None,
        ):
            '''
            :type collection_id: str
            :type institution_id: str
            :type titles: dressdiscover.api.vocabularies.vra_core.title.title_set.TitleSet
            :type agents: dressdiscover.api.vocabularies.vra_core.agent.agent_set.AgentSet or None
            :type categories: tuple(str) or None
            :type closures: dressdiscover.api.vocabularies.costume_core.closure.closure_set.ClosureSet or None
            :type colors: dressdiscover.api.vocabularies.costume_core.color.color_set.ColorSet or None
            :type components: dressdiscover.api.vocabularies.costume_core.component.component_set.ComponentSet or None
            :type condition: dressdiscover.api.vocabularies.costume_core.condition.condition.Condition or None
            :type cultural_contexts: dressdiscover.api.vocabularies.vra_core.cultural_context.cultural_context_set.CulturalContextSet or None
            :type dates: dressdiscover.api.vocabularies.vra_core.date.date_set.DateSet or None
            :type descriptions: dressdiscover.api.vocabularies.vra_core.description.description_set.DescriptionSet or None
            :type gender: dressdiscover.api.vocabularies.costume_core.gender.gender.Gender or None
            :type hidden: bool or None
            :type images: tuple(dressdiscover.api.models.image.image.Image) or None
            :type inscriptions: dressdiscover.api.vocabularies.vra_core.inscription.inscription_set.InscriptionSet or None
            :type locations: dressdiscover.api.vocabularies.vra_core.location.location_set.LocationSet or None
            :type materials: dressdiscover.api.vocabularies.vra_core.material.material_set.MaterialSet or None
            :type measurements: dressdiscover.api.vocabularies.vra_core.measurements.measurements_set.MeasurementsSet or None
            :type provenance: str or None
            :type quantity: int or None
            :type relations: dressdiscover.api.vocabularies.vra_core.relation.relation_set.RelationSet or None
            :type rights: dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet or None
            :type structures: dressdiscover.api.vocabularies.costume_core.structure.structure_set.StructureSet or None
            :type subjects: dressdiscover.api.vocabularies.vra_core.subject.subject_set.SubjectSet or None
            :type techniques: dressdiscover.api.vocabularies.vra_core.technique.technique_set.TechniqueSet or None
            :type textrefs: dressdiscover.api.vocabularies.vra_core.textref.textref_set.TextrefSet or None
            :type view_type: dressdiscover.api.vocabularies.vra_core.view_type.view_type.ViewType or None
            :type work_types: dressdiscover.api.vocabularies.vra_core.work_type.work_type_set.WorkTypeSet or None
            '''

            self.__collection_id = collection_id
            self.__institution_id = institution_id
            self.__titles = titles
            self.__agents = agents
            self.__categories = categories
            self.__closures = closures
            self.__colors = colors
            self.__components = components
            self.__condition = condition
            self.__cultural_contexts = cultural_contexts
            self.__dates = dates
            self.__descriptions = descriptions
            self.__gender = gender
            self.__hidden = hidden
            self.__images = images
            self.__inscriptions = inscriptions
            self.__locations = locations
            self.__materials = materials
            self.__measurements = measurements
            self.__provenance = provenance
            self.__quantity = quantity
            self.__relations = relations
            self.__rights = rights
            self.__structures = structures
            self.__subjects = subjects
            self.__techniques = techniques
            self.__textrefs = textrefs
            self.__view_type = view_type
            self.__work_types = work_types

        def build(self):
            return Object(collection_id=self.__collection_id, institution_id=self.__institution_id, titles=self.__titles, agents=self.__agents, categories=self.__categories, closures=self.__closures, colors=self.__colors, components=self.__components, condition=self.__condition, cultural_contexts=self.__cultural_contexts, dates=self.__dates, descriptions=self.__descriptions, gender=self.__gender, hidden=self.__hidden, images=self.__images, inscriptions=self.__inscriptions, locations=self.__locations, materials=self.__materials, measurements=self.__measurements, provenance=self.__provenance, quantity=self.__quantity, relations=self.__relations, rights=self.__rights, structures=self.__structures, subjects=self.__subjects, techniques=self.__techniques, textrefs=self.__textrefs, view_type=self.__view_type, work_types=self.__work_types)

        @property
        def agents(self):
            '''
            :rtype: dressdiscover.api.vocabularies.vra_core.agent.agent_set.AgentSet
            '''

            return self.__agents

        @property
        def categories(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__categories

        @property
        def closures(self):
            '''
            :rtype: dressdiscover.api.vocabularies.costume_core.closure.closure_set.ClosureSet
            '''

            return self.__closures

        @property
        def collection_id(self):
            '''
            :rtype: str
            '''

            return self.__collection_id

        @property
        def colors(self):
            '''
            :rtype: dressdiscover.api.vocabularies.costume_core.color.color_set.ColorSet
            '''

            return self.__colors

        @property
        def components(self):
            '''
            :rtype: dressdiscover.api.vocabularies.costume_core.component.component_set.ComponentSet
            '''

            return self.__components

        @property
        def condition(self):
            '''
            :rtype: dressdiscover.api.vocabularies.costume_core.condition.condition.Condition
            '''

            return self.__condition

        @property
        def cultural_contexts(self):
            '''
            :rtype: dressdiscover.api.vocabularies.vra_core.cultural_context.cultural_context_set.CulturalContextSet
            '''

            return self.__cultural_contexts

        @property
        def dates(self):
            '''
            :rtype: dressdiscover.api.vocabularies.vra_core.date.date_set.DateSet
            '''

            return self.__dates

        @property
        def descriptions(self):
            '''
            :rtype: dressdiscover.api.vocabularies.vra_core.description.description_set.DescriptionSet
            '''

            return self.__descriptions

        @property
        def gender(self):
            '''
            :rtype: dressdiscover.api.vocabularies.costume_core.gender.gender.Gender
            '''

            return self.__gender

        @property
        def hidden(self):
            '''
            :rtype: bool
            '''

            return self.__hidden

        @property
        def images(self):
            '''
            :rtype: tuple(dressdiscover.api.models.image.image.Image)
            '''

            return self.__images

        @property
        def inscriptions(self):
            '''
            :rtype: dressdiscover.api.vocabularies.vra_core.inscription.inscription_set.InscriptionSet
            '''

            return self.__inscriptions

        @property
        def institution_id(self):
            '''
            :rtype: str
            '''

            return self.__institution_id

        @property
        def locations(self):
            '''
            :rtype: dressdiscover.api.vocabularies.vra_core.location.location_set.LocationSet
            '''

            return self.__locations

        @property
        def materials(self):
            '''
            :rtype: dressdiscover.api.vocabularies.vra_core.material.material_set.MaterialSet
            '''

            return self.__materials

        @property
        def measurements(self):
            '''
            :rtype: dressdiscover.api.vocabularies.vra_core.measurements.measurements_set.MeasurementsSet
            '''

            return self.__measurements

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
        def relations(self):
            '''
            :rtype: dressdiscover.api.vocabularies.vra_core.relation.relation_set.RelationSet
            '''

            return self.__relations

        @property
        def rights(self):
            '''
            :rtype: dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet
            '''

            return self.__rights

        def set_agents(self, agents):
            '''
            :type agents: dressdiscover.api.vocabularies.vra_core.agent.agent_set.AgentSet or None
            '''

            if agents is not None:
                if not isinstance(agents, dressdiscover.api.vocabularies.vra_core.agent.agent_set.AgentSet):
                    raise TypeError("expected agents to be a dressdiscover.api.vocabularies.vra_core.agent.agent_set.AgentSet but it is a %s" % getattr(__builtin__, 'type')(agents))
            self.__agents = agents
            return self

        def set_categories(self, categories):
            '''
            :type categories: tuple(str) or None
            '''

            if categories is not None:
                if not (isinstance(categories, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), categories))) == 0):
                    raise TypeError("expected categories to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(categories))
                if len(categories) < 1:
                    raise ValueError("expected len(categories) to be >= 1, was %d" % len(categories))
            self.__categories = categories
            return self

        def set_closures(self, closures):
            '''
            :type closures: dressdiscover.api.vocabularies.costume_core.closure.closure_set.ClosureSet or None
            '''

            if closures is not None:
                if not isinstance(closures, dressdiscover.api.vocabularies.costume_core.closure.closure_set.ClosureSet):
                    raise TypeError("expected closures to be a dressdiscover.api.vocabularies.costume_core.closure.closure_set.ClosureSet but it is a %s" % getattr(__builtin__, 'type')(closures))
            self.__closures = closures
            return self

        def set_collection_id(self, collection_id):
            '''
            :type collection_id: str
            '''

            if collection_id is None:
                raise ValueError('collection_id is required')
            if not isinstance(collection_id, basestring):
                raise TypeError("expected collection_id to be a str but it is a %s" % getattr(__builtin__, 'type')(collection_id))
            self.__collection_id = collection_id
            return self

        def set_colors(self, colors):
            '''
            :type colors: dressdiscover.api.vocabularies.costume_core.color.color_set.ColorSet or None
            '''

            if colors is not None:
                if not isinstance(colors, dressdiscover.api.vocabularies.costume_core.color.color_set.ColorSet):
                    raise TypeError("expected colors to be a dressdiscover.api.vocabularies.costume_core.color.color_set.ColorSet but it is a %s" % getattr(__builtin__, 'type')(colors))
            self.__colors = colors
            return self

        def set_components(self, components):
            '''
            :type components: dressdiscover.api.vocabularies.costume_core.component.component_set.ComponentSet or None
            '''

            if components is not None:
                if not isinstance(components, dressdiscover.api.vocabularies.costume_core.component.component_set.ComponentSet):
                    raise TypeError("expected components to be a dressdiscover.api.vocabularies.costume_core.component.component_set.ComponentSet but it is a %s" % getattr(__builtin__, 'type')(components))
            self.__components = components
            return self

        def set_condition(self, condition):
            '''
            :type condition: dressdiscover.api.vocabularies.costume_core.condition.condition.Condition or None
            '''

            if condition is not None:
                if not isinstance(condition, dressdiscover.api.vocabularies.costume_core.condition.condition.Condition):
                    raise TypeError("expected condition to be a dressdiscover.api.vocabularies.costume_core.condition.condition.Condition but it is a %s" % getattr(__builtin__, 'type')(condition))
            self.__condition = condition
            return self

        def set_cultural_contexts(self, cultural_contexts):
            '''
            :type cultural_contexts: dressdiscover.api.vocabularies.vra_core.cultural_context.cultural_context_set.CulturalContextSet or None
            '''

            if cultural_contexts is not None:
                if not isinstance(cultural_contexts, dressdiscover.api.vocabularies.vra_core.cultural_context.cultural_context_set.CulturalContextSet):
                    raise TypeError("expected cultural_contexts to be a dressdiscover.api.vocabularies.vra_core.cultural_context.cultural_context_set.CulturalContextSet but it is a %s" % getattr(__builtin__, 'type')(cultural_contexts))
            self.__cultural_contexts = cultural_contexts
            return self

        def set_dates(self, dates):
            '''
            :type dates: dressdiscover.api.vocabularies.vra_core.date.date_set.DateSet or None
            '''

            if dates is not None:
                if not isinstance(dates, dressdiscover.api.vocabularies.vra_core.date.date_set.DateSet):
                    raise TypeError("expected dates to be a dressdiscover.api.vocabularies.vra_core.date.date_set.DateSet but it is a %s" % getattr(__builtin__, 'type')(dates))
            self.__dates = dates
            return self

        def set_descriptions(self, descriptions):
            '''
            :type descriptions: dressdiscover.api.vocabularies.vra_core.description.description_set.DescriptionSet or None
            '''

            if descriptions is not None:
                if not isinstance(descriptions, dressdiscover.api.vocabularies.vra_core.description.description_set.DescriptionSet):
                    raise TypeError("expected descriptions to be a dressdiscover.api.vocabularies.vra_core.description.description_set.DescriptionSet but it is a %s" % getattr(__builtin__, 'type')(descriptions))
            self.__descriptions = descriptions
            return self

        def set_gender(self, gender):
            '''
            :type gender: dressdiscover.api.vocabularies.costume_core.gender.gender.Gender or None
            '''

            if gender is not None:
                if not isinstance(gender, dressdiscover.api.vocabularies.costume_core.gender.gender.Gender):
                    raise TypeError("expected gender to be a dressdiscover.api.vocabularies.costume_core.gender.gender.Gender but it is a %s" % getattr(__builtin__, 'type')(gender))
            self.__gender = gender
            return self

        def set_hidden(self, hidden):
            '''
            :type hidden: bool or None
            '''

            if hidden is not None:
                if not isinstance(hidden, bool):
                    raise TypeError("expected hidden to be a bool but it is a %s" % getattr(__builtin__, 'type')(hidden))
            self.__hidden = hidden
            return self

        def set_images(self, images):
            '''
            :type images: tuple(dressdiscover.api.models.image.image.Image) or None
            '''

            if images is not None:
                if not (isinstance(images, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.image.image.Image), images))) == 0):
                    raise TypeError("expected images to be a tuple(dressdiscover.api.models.image.image.Image) but it is a %s" % getattr(__builtin__, 'type')(images))
                if len(images) < 1:
                    raise ValueError("expected len(images) to be >= 1, was %d" % len(images))
            self.__images = images
            return self

        def set_inscriptions(self, inscriptions):
            '''
            :type inscriptions: dressdiscover.api.vocabularies.vra_core.inscription.inscription_set.InscriptionSet or None
            '''

            if inscriptions is not None:
                if not isinstance(inscriptions, dressdiscover.api.vocabularies.vra_core.inscription.inscription_set.InscriptionSet):
                    raise TypeError("expected inscriptions to be a dressdiscover.api.vocabularies.vra_core.inscription.inscription_set.InscriptionSet but it is a %s" % getattr(__builtin__, 'type')(inscriptions))
            self.__inscriptions = inscriptions
            return self

        def set_institution_id(self, institution_id):
            '''
            :type institution_id: str
            '''

            if institution_id is None:
                raise ValueError('institution_id is required')
            if not isinstance(institution_id, basestring):
                raise TypeError("expected institution_id to be a str but it is a %s" % getattr(__builtin__, 'type')(institution_id))
            self.__institution_id = institution_id
            return self

        def set_locations(self, locations):
            '''
            :type locations: dressdiscover.api.vocabularies.vra_core.location.location_set.LocationSet or None
            '''

            if locations is not None:
                if not isinstance(locations, dressdiscover.api.vocabularies.vra_core.location.location_set.LocationSet):
                    raise TypeError("expected locations to be a dressdiscover.api.vocabularies.vra_core.location.location_set.LocationSet but it is a %s" % getattr(__builtin__, 'type')(locations))
            self.__locations = locations
            return self

        def set_materials(self, materials):
            '''
            :type materials: dressdiscover.api.vocabularies.vra_core.material.material_set.MaterialSet or None
            '''

            if materials is not None:
                if not isinstance(materials, dressdiscover.api.vocabularies.vra_core.material.material_set.MaterialSet):
                    raise TypeError("expected materials to be a dressdiscover.api.vocabularies.vra_core.material.material_set.MaterialSet but it is a %s" % getattr(__builtin__, 'type')(materials))
            self.__materials = materials
            return self

        def set_measurements(self, measurements):
            '''
            :type measurements: dressdiscover.api.vocabularies.vra_core.measurements.measurements_set.MeasurementsSet or None
            '''

            if measurements is not None:
                if not isinstance(measurements, dressdiscover.api.vocabularies.vra_core.measurements.measurements_set.MeasurementsSet):
                    raise TypeError("expected measurements to be a dressdiscover.api.vocabularies.vra_core.measurements.measurements_set.MeasurementsSet but it is a %s" % getattr(__builtin__, 'type')(measurements))
            self.__measurements = measurements
            return self

        def set_provenance(self, provenance):
            '''
            :type provenance: str or None
            '''

            if provenance is not None:
                if not isinstance(provenance, basestring):
                    raise TypeError("expected provenance to be a str but it is a %s" % getattr(__builtin__, 'type')(provenance))
                if len(provenance) < 1:
                    raise ValueError("expected len(provenance) to be >= 1, was %d" % len(provenance))
            self.__provenance = provenance
            return self

        def set_quantity(self, quantity):
            '''
            :type quantity: int or None
            '''

            if quantity is not None:
                if not isinstance(quantity, int):
                    raise TypeError("expected quantity to be a int but it is a %s" % getattr(__builtin__, 'type')(quantity))
            self.__quantity = quantity
            return self

        def set_relations(self, relations):
            '''
            :type relations: dressdiscover.api.vocabularies.vra_core.relation.relation_set.RelationSet or None
            '''

            if relations is not None:
                if not isinstance(relations, dressdiscover.api.vocabularies.vra_core.relation.relation_set.RelationSet):
                    raise TypeError("expected relations to be a dressdiscover.api.vocabularies.vra_core.relation.relation_set.RelationSet but it is a %s" % getattr(__builtin__, 'type')(relations))
            self.__relations = relations
            return self

        def set_rights(self, rights):
            '''
            :type rights: dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet or None
            '''

            if rights is not None:
                if not isinstance(rights, dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet):
                    raise TypeError("expected rights to be a dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet but it is a %s" % getattr(__builtin__, 'type')(rights))
            self.__rights = rights
            return self

        def set_structures(self, structures):
            '''
            :type structures: dressdiscover.api.vocabularies.costume_core.structure.structure_set.StructureSet or None
            '''

            if structures is not None:
                if not isinstance(structures, dressdiscover.api.vocabularies.costume_core.structure.structure_set.StructureSet):
                    raise TypeError("expected structures to be a dressdiscover.api.vocabularies.costume_core.structure.structure_set.StructureSet but it is a %s" % getattr(__builtin__, 'type')(structures))
            self.__structures = structures
            return self

        def set_subjects(self, subjects):
            '''
            :type subjects: dressdiscover.api.vocabularies.vra_core.subject.subject_set.SubjectSet or None
            '''

            if subjects is not None:
                if not isinstance(subjects, dressdiscover.api.vocabularies.vra_core.subject.subject_set.SubjectSet):
                    raise TypeError("expected subjects to be a dressdiscover.api.vocabularies.vra_core.subject.subject_set.SubjectSet but it is a %s" % getattr(__builtin__, 'type')(subjects))
            self.__subjects = subjects
            return self

        def set_techniques(self, techniques):
            '''
            :type techniques: dressdiscover.api.vocabularies.vra_core.technique.technique_set.TechniqueSet or None
            '''

            if techniques is not None:
                if not isinstance(techniques, dressdiscover.api.vocabularies.vra_core.technique.technique_set.TechniqueSet):
                    raise TypeError("expected techniques to be a dressdiscover.api.vocabularies.vra_core.technique.technique_set.TechniqueSet but it is a %s" % getattr(__builtin__, 'type')(techniques))
            self.__techniques = techniques
            return self

        def set_textrefs(self, textrefs):
            '''
            :type textrefs: dressdiscover.api.vocabularies.vra_core.textref.textref_set.TextrefSet or None
            '''

            if textrefs is not None:
                if not isinstance(textrefs, dressdiscover.api.vocabularies.vra_core.textref.textref_set.TextrefSet):
                    raise TypeError("expected textrefs to be a dressdiscover.api.vocabularies.vra_core.textref.textref_set.TextrefSet but it is a %s" % getattr(__builtin__, 'type')(textrefs))
            self.__textrefs = textrefs
            return self

        def set_titles(self, titles):
            '''
            :type titles: dressdiscover.api.vocabularies.vra_core.title.title_set.TitleSet
            '''

            if titles is None:
                raise ValueError('titles is required')
            if not isinstance(titles, dressdiscover.api.vocabularies.vra_core.title.title_set.TitleSet):
                raise TypeError("expected titles to be a dressdiscover.api.vocabularies.vra_core.title.title_set.TitleSet but it is a %s" % getattr(__builtin__, 'type')(titles))
            self.__titles = titles
            return self

        def set_view_type(self, view_type):
            '''
            :type view_type: dressdiscover.api.vocabularies.vra_core.view_type.view_type.ViewType or None
            '''

            if view_type is not None:
                if not isinstance(view_type, dressdiscover.api.vocabularies.vra_core.view_type.view_type.ViewType):
                    raise TypeError("expected view_type to be a dressdiscover.api.vocabularies.vra_core.view_type.view_type.ViewType but it is a %s" % getattr(__builtin__, 'type')(view_type))
            self.__view_type = view_type
            return self

        def set_work_types(self, work_types):
            '''
            :type work_types: dressdiscover.api.vocabularies.vra_core.work_type.work_type_set.WorkTypeSet or None
            '''

            if work_types is not None:
                if not isinstance(work_types, dressdiscover.api.vocabularies.vra_core.work_type.work_type_set.WorkTypeSet):
                    raise TypeError("expected work_types to be a dressdiscover.api.vocabularies.vra_core.work_type.work_type_set.WorkTypeSet but it is a %s" % getattr(__builtin__, 'type')(work_types))
            self.__work_types = work_types
            return self

        @property
        def structures(self):
            '''
            :rtype: dressdiscover.api.vocabularies.costume_core.structure.structure_set.StructureSet
            '''

            return self.__structures

        @property
        def subjects(self):
            '''
            :rtype: dressdiscover.api.vocabularies.vra_core.subject.subject_set.SubjectSet
            '''

            return self.__subjects

        @property
        def techniques(self):
            '''
            :rtype: dressdiscover.api.vocabularies.vra_core.technique.technique_set.TechniqueSet
            '''

            return self.__techniques

        @property
        def textrefs(self):
            '''
            :rtype: dressdiscover.api.vocabularies.vra_core.textref.textref_set.TextrefSet
            '''

            return self.__textrefs

        @property
        def titles(self):
            '''
            :rtype: dressdiscover.api.vocabularies.vra_core.title.title_set.TitleSet
            '''

            return self.__titles

        def update(self, object):
            '''
            :type collection_id: str
            :type institution_id: str
            :type titles: dressdiscover.api.vocabularies.vra_core.title.title_set.TitleSet
            :type agents: dressdiscover.api.vocabularies.vra_core.agent.agent_set.AgentSet or None
            :type categories: tuple(str) or None
            :type closures: dressdiscover.api.vocabularies.costume_core.closure.closure_set.ClosureSet or None
            :type colors: dressdiscover.api.vocabularies.costume_core.color.color_set.ColorSet or None
            :type components: dressdiscover.api.vocabularies.costume_core.component.component_set.ComponentSet or None
            :type condition: dressdiscover.api.vocabularies.costume_core.condition.condition.Condition or None
            :type cultural_contexts: dressdiscover.api.vocabularies.vra_core.cultural_context.cultural_context_set.CulturalContextSet or None
            :type dates: dressdiscover.api.vocabularies.vra_core.date.date_set.DateSet or None
            :type descriptions: dressdiscover.api.vocabularies.vra_core.description.description_set.DescriptionSet or None
            :type gender: dressdiscover.api.vocabularies.costume_core.gender.gender.Gender or None
            :type hidden: bool or None
            :type images: tuple(dressdiscover.api.models.image.image.Image) or None
            :type inscriptions: dressdiscover.api.vocabularies.vra_core.inscription.inscription_set.InscriptionSet or None
            :type locations: dressdiscover.api.vocabularies.vra_core.location.location_set.LocationSet or None
            :type materials: dressdiscover.api.vocabularies.vra_core.material.material_set.MaterialSet or None
            :type measurements: dressdiscover.api.vocabularies.vra_core.measurements.measurements_set.MeasurementsSet or None
            :type provenance: str or None
            :type quantity: int or None
            :type relations: dressdiscover.api.vocabularies.vra_core.relation.relation_set.RelationSet or None
            :type rights: dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet or None
            :type structures: dressdiscover.api.vocabularies.costume_core.structure.structure_set.StructureSet or None
            :type subjects: dressdiscover.api.vocabularies.vra_core.subject.subject_set.SubjectSet or None
            :type techniques: dressdiscover.api.vocabularies.vra_core.technique.technique_set.TechniqueSet or None
            :type textrefs: dressdiscover.api.vocabularies.vra_core.textref.textref_set.TextrefSet or None
            :type view_type: dressdiscover.api.vocabularies.vra_core.view_type.view_type.ViewType or None
            :type work_types: dressdiscover.api.vocabularies.vra_core.work_type.work_type_set.WorkTypeSet or None
            '''

            if isinstance(object, Object):
                self.set_collection_id(object.collection_id)
                self.set_institution_id(object.institution_id)
                self.set_titles(object.titles)
                self.set_agents(object.agents)
                self.set_categories(object.categories)
                self.set_closures(object.closures)
                self.set_colors(object.colors)
                self.set_components(object.components)
                self.set_condition(object.condition)
                self.set_cultural_contexts(object.cultural_contexts)
                self.set_dates(object.dates)
                self.set_descriptions(object.descriptions)
                self.set_gender(object.gender)
                self.set_hidden(object.hidden)
                self.set_images(object.images)
                self.set_inscriptions(object.inscriptions)
                self.set_locations(object.locations)
                self.set_materials(object.materials)
                self.set_measurements(object.measurements)
                self.set_provenance(object.provenance)
                self.set_quantity(object.quantity)
                self.set_relations(object.relations)
                self.set_rights(object.rights)
                self.set_structures(object.structures)
                self.set_subjects(object.subjects)
                self.set_techniques(object.techniques)
                self.set_textrefs(object.textrefs)
                self.set_view_type(object.view_type)
                self.set_work_types(object.work_types)
            elif isinstance(object, dict):
                for key, value in object.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(object)
            return self

        @property
        def view_type(self):
            '''
            :rtype: dressdiscover.api.vocabularies.vra_core.view_type.view_type.ViewType
            '''

            return self.__view_type

        @property
        def work_types(self):
            '''
            :rtype: dressdiscover.api.vocabularies.vra_core.work_type.work_type_set.WorkTypeSet
            '''

            return self.__work_types

        @agents.setter
        def agents(self, agents):
            '''
            :type agents: dressdiscover.api.vocabularies.vra_core.agent.agent_set.AgentSet or None
            '''

            self.set_agents(agents)

        @categories.setter
        def categories(self, categories):
            '''
            :type categories: tuple(str) or None
            '''

            self.set_categories(categories)

        @closures.setter
        def closures(self, closures):
            '''
            :type closures: dressdiscover.api.vocabularies.costume_core.closure.closure_set.ClosureSet or None
            '''

            self.set_closures(closures)

        @collection_id.setter
        def collection_id(self, collection_id):
            '''
            :type collection_id: str
            '''

            self.set_collection_id(collection_id)

        @colors.setter
        def colors(self, colors):
            '''
            :type colors: dressdiscover.api.vocabularies.costume_core.color.color_set.ColorSet or None
            '''

            self.set_colors(colors)

        @components.setter
        def components(self, components):
            '''
            :type components: dressdiscover.api.vocabularies.costume_core.component.component_set.ComponentSet or None
            '''

            self.set_components(components)

        @condition.setter
        def condition(self, condition):
            '''
            :type condition: dressdiscover.api.vocabularies.costume_core.condition.condition.Condition or None
            '''

            self.set_condition(condition)

        @cultural_contexts.setter
        def cultural_contexts(self, cultural_contexts):
            '''
            :type cultural_contexts: dressdiscover.api.vocabularies.vra_core.cultural_context.cultural_context_set.CulturalContextSet or None
            '''

            self.set_cultural_contexts(cultural_contexts)

        @dates.setter
        def dates(self, dates):
            '''
            :type dates: dressdiscover.api.vocabularies.vra_core.date.date_set.DateSet or None
            '''

            self.set_dates(dates)

        @descriptions.setter
        def descriptions(self, descriptions):
            '''
            :type descriptions: dressdiscover.api.vocabularies.vra_core.description.description_set.DescriptionSet or None
            '''

            self.set_descriptions(descriptions)

        @gender.setter
        def gender(self, gender):
            '''
            :type gender: dressdiscover.api.vocabularies.costume_core.gender.gender.Gender or None
            '''

            self.set_gender(gender)

        @hidden.setter
        def hidden(self, hidden):
            '''
            :type hidden: bool or None
            '''

            self.set_hidden(hidden)

        @images.setter
        def images(self, images):
            '''
            :type images: tuple(dressdiscover.api.models.image.image.Image) or None
            '''

            self.set_images(images)

        @inscriptions.setter
        def inscriptions(self, inscriptions):
            '''
            :type inscriptions: dressdiscover.api.vocabularies.vra_core.inscription.inscription_set.InscriptionSet or None
            '''

            self.set_inscriptions(inscriptions)

        @institution_id.setter
        def institution_id(self, institution_id):
            '''
            :type institution_id: str
            '''

            self.set_institution_id(institution_id)

        @locations.setter
        def locations(self, locations):
            '''
            :type locations: dressdiscover.api.vocabularies.vra_core.location.location_set.LocationSet or None
            '''

            self.set_locations(locations)

        @materials.setter
        def materials(self, materials):
            '''
            :type materials: dressdiscover.api.vocabularies.vra_core.material.material_set.MaterialSet or None
            '''

            self.set_materials(materials)

        @measurements.setter
        def measurements(self, measurements):
            '''
            :type measurements: dressdiscover.api.vocabularies.vra_core.measurements.measurements_set.MeasurementsSet or None
            '''

            self.set_measurements(measurements)

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

        @relations.setter
        def relations(self, relations):
            '''
            :type relations: dressdiscover.api.vocabularies.vra_core.relation.relation_set.RelationSet or None
            '''

            self.set_relations(relations)

        @rights.setter
        def rights(self, rights):
            '''
            :type rights: dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet or None
            '''

            self.set_rights(rights)

        @structures.setter
        def structures(self, structures):
            '''
            :type structures: dressdiscover.api.vocabularies.costume_core.structure.structure_set.StructureSet or None
            '''

            self.set_structures(structures)

        @subjects.setter
        def subjects(self, subjects):
            '''
            :type subjects: dressdiscover.api.vocabularies.vra_core.subject.subject_set.SubjectSet or None
            '''

            self.set_subjects(subjects)

        @techniques.setter
        def techniques(self, techniques):
            '''
            :type techniques: dressdiscover.api.vocabularies.vra_core.technique.technique_set.TechniqueSet or None
            '''

            self.set_techniques(techniques)

        @textrefs.setter
        def textrefs(self, textrefs):
            '''
            :type textrefs: dressdiscover.api.vocabularies.vra_core.textref.textref_set.TextrefSet or None
            '''

            self.set_textrefs(textrefs)

        @titles.setter
        def titles(self, titles):
            '''
            :type titles: dressdiscover.api.vocabularies.vra_core.title.title_set.TitleSet
            '''

            self.set_titles(titles)

        @view_type.setter
        def view_type(self, view_type):
            '''
            :type view_type: dressdiscover.api.vocabularies.vra_core.view_type.view_type.ViewType or None
            '''

            self.set_view_type(view_type)

        @work_types.setter
        def work_types(self, work_types):
            '''
            :type work_types: dressdiscover.api.vocabularies.vra_core.work_type.work_type_set.WorkTypeSet or None
            '''

            self.set_work_types(work_types)

    class FieldMetadata(object):
        COLLECTION_ID = None
        INSTITUTION_ID = None
        TITLES = None
        AGENTS = None
        CATEGORIES = None
        CLOSURES = None
        COLORS = None
        COMPONENTS = None
        CONDITION = None
        CULTURAL_CONTEXTS = None
        DATES = None
        DESCRIPTIONS = None
        GENDER = None
        HIDDEN = None
        IMAGES = None
        INSCRIPTIONS = None
        LOCATIONS = None
        MATERIALS = None
        MEASUREMENTS = None
        PROVENANCE = None
        QUANTITY = None
        RELATIONS = None
        RIGHTS = None
        STRUCTURES = None
        SUBJECTS = None
        TECHNIQUES = None
        TEXTREFS = None
        VIEW_TYPE = None
        WORK_TYPES = None

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
            return (cls.COLLECTION_ID, cls.INSTITUTION_ID, cls.TITLES, cls.AGENTS, cls.CATEGORIES, cls.CLOSURES, cls.COLORS, cls.COMPONENTS, cls.CONDITION, cls.CULTURAL_CONTEXTS, cls.DATES, cls.DESCRIPTIONS, cls.GENDER, cls.HIDDEN, cls.IMAGES, cls.INSCRIPTIONS, cls.LOCATIONS, cls.MATERIALS, cls.MEASUREMENTS, cls.PROVENANCE, cls.QUANTITY, cls.RELATIONS, cls.RIGHTS, cls.STRUCTURES, cls.SUBJECTS, cls.TECHNIQUES, cls.TEXTREFS, cls.VIEW_TYPE, cls.WORK_TYPES,)

    FieldMetadata.COLLECTION_ID = FieldMetadata('collection_id', dressdiscover.api.models.collection.collection_id.CollectionId, None)
    FieldMetadata.INSTITUTION_ID = FieldMetadata('institution_id', dressdiscover.api.models.institution.institution_id.InstitutionId, None)
    FieldMetadata.TITLES = FieldMetadata('titles', dressdiscover.api.vocabularies.vra_core.title.title_set.TitleSet, None)
    FieldMetadata.AGENTS = FieldMetadata('agents', dressdiscover.api.vocabularies.vra_core.agent.agent_set.AgentSet, None)
    FieldMetadata.CATEGORIES = FieldMetadata('categories', tuple, {u'minLength': 1})
    FieldMetadata.CLOSURES = FieldMetadata('closures', dressdiscover.api.vocabularies.costume_core.closure.closure_set.ClosureSet, None)
    FieldMetadata.COLORS = FieldMetadata('colors', dressdiscover.api.vocabularies.costume_core.color.color_set.ColorSet, None)
    FieldMetadata.COMPONENTS = FieldMetadata('components', dressdiscover.api.vocabularies.costume_core.component.component_set.ComponentSet, None)
    FieldMetadata.CONDITION = FieldMetadata('condition', dressdiscover.api.vocabularies.costume_core.condition.condition.Condition, None)
    FieldMetadata.CULTURAL_CONTEXTS = FieldMetadata('cultural_contexts', dressdiscover.api.vocabularies.vra_core.cultural_context.cultural_context_set.CulturalContextSet, None)
    FieldMetadata.DATES = FieldMetadata('dates', dressdiscover.api.vocabularies.vra_core.date.date_set.DateSet, None)
    FieldMetadata.DESCRIPTIONS = FieldMetadata('descriptions', dressdiscover.api.vocabularies.vra_core.description.description_set.DescriptionSet, None)
    FieldMetadata.GENDER = FieldMetadata('gender', dressdiscover.api.vocabularies.costume_core.gender.gender.Gender, None)
    FieldMetadata.HIDDEN = FieldMetadata('hidden', bool, {u'acceptance': True})
    FieldMetadata.IMAGES = FieldMetadata('images', tuple, {u'minLength': 1})
    FieldMetadata.INSCRIPTIONS = FieldMetadata('inscriptions', dressdiscover.api.vocabularies.vra_core.inscription.inscription_set.InscriptionSet, None)
    FieldMetadata.LOCATIONS = FieldMetadata('locations', dressdiscover.api.vocabularies.vra_core.location.location_set.LocationSet, None)
    FieldMetadata.MATERIALS = FieldMetadata('materials', dressdiscover.api.vocabularies.vra_core.material.material_set.MaterialSet, None)
    FieldMetadata.MEASUREMENTS = FieldMetadata('measurements', dressdiscover.api.vocabularies.vra_core.measurements.measurements_set.MeasurementsSet, None)
    FieldMetadata.PROVENANCE = FieldMetadata('provenance', str, {u'minLength': 1})
    FieldMetadata.QUANTITY = FieldMetadata('quantity', int, {u'min': 1})
    FieldMetadata.RELATIONS = FieldMetadata('relations', dressdiscover.api.vocabularies.vra_core.relation.relation_set.RelationSet, None)
    FieldMetadata.RIGHTS = FieldMetadata('rights', dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet, None)
    FieldMetadata.STRUCTURES = FieldMetadata('structures', dressdiscover.api.vocabularies.costume_core.structure.structure_set.StructureSet, None)
    FieldMetadata.SUBJECTS = FieldMetadata('subjects', dressdiscover.api.vocabularies.vra_core.subject.subject_set.SubjectSet, None)
    FieldMetadata.TECHNIQUES = FieldMetadata('techniques', dressdiscover.api.vocabularies.vra_core.technique.technique_set.TechniqueSet, None)
    FieldMetadata.TEXTREFS = FieldMetadata('textrefs', dressdiscover.api.vocabularies.vra_core.textref.textref_set.TextrefSet, None)
    FieldMetadata.VIEW_TYPE = FieldMetadata('view_type', dressdiscover.api.vocabularies.vra_core.view_type.view_type.ViewType, None)
    FieldMetadata.WORK_TYPES = FieldMetadata('work_types', dressdiscover.api.vocabularies.vra_core.work_type.work_type_set.WorkTypeSet, None)

    def __init__(
        self,
        collection_id,
        institution_id,
        titles,
        agents=None,
        categories=None,
        closures=None,
        colors=None,
        components=None,
        condition=None,
        cultural_contexts=None,
        dates=None,
        descriptions=None,
        gender=None,
        hidden=None,
        images=None,
        inscriptions=None,
        locations=None,
        materials=None,
        measurements=None,
        provenance=None,
        quantity=None,
        relations=None,
        rights=None,
        structures=None,
        subjects=None,
        techniques=None,
        textrefs=None,
        view_type=None,
        work_types=None,
    ):
        '''
        :type collection_id: str
        :type institution_id: str
        :type titles: dressdiscover.api.vocabularies.vra_core.title.title_set.TitleSet
        :type agents: dressdiscover.api.vocabularies.vra_core.agent.agent_set.AgentSet or None
        :type categories: tuple(str) or None
        :type closures: dressdiscover.api.vocabularies.costume_core.closure.closure_set.ClosureSet or None
        :type colors: dressdiscover.api.vocabularies.costume_core.color.color_set.ColorSet or None
        :type components: dressdiscover.api.vocabularies.costume_core.component.component_set.ComponentSet or None
        :type condition: dressdiscover.api.vocabularies.costume_core.condition.condition.Condition or None
        :type cultural_contexts: dressdiscover.api.vocabularies.vra_core.cultural_context.cultural_context_set.CulturalContextSet or None
        :type dates: dressdiscover.api.vocabularies.vra_core.date.date_set.DateSet or None
        :type descriptions: dressdiscover.api.vocabularies.vra_core.description.description_set.DescriptionSet or None
        :type gender: dressdiscover.api.vocabularies.costume_core.gender.gender.Gender or None
        :type hidden: bool or None
        :type images: tuple(dressdiscover.api.models.image.image.Image) or None
        :type inscriptions: dressdiscover.api.vocabularies.vra_core.inscription.inscription_set.InscriptionSet or None
        :type locations: dressdiscover.api.vocabularies.vra_core.location.location_set.LocationSet or None
        :type materials: dressdiscover.api.vocabularies.vra_core.material.material_set.MaterialSet or None
        :type measurements: dressdiscover.api.vocabularies.vra_core.measurements.measurements_set.MeasurementsSet or None
        :type provenance: str or None
        :type quantity: int or None
        :type relations: dressdiscover.api.vocabularies.vra_core.relation.relation_set.RelationSet or None
        :type rights: dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet or None
        :type structures: dressdiscover.api.vocabularies.costume_core.structure.structure_set.StructureSet or None
        :type subjects: dressdiscover.api.vocabularies.vra_core.subject.subject_set.SubjectSet or None
        :type techniques: dressdiscover.api.vocabularies.vra_core.technique.technique_set.TechniqueSet or None
        :type textrefs: dressdiscover.api.vocabularies.vra_core.textref.textref_set.TextrefSet or None
        :type view_type: dressdiscover.api.vocabularies.vra_core.view_type.view_type.ViewType or None
        :type work_types: dressdiscover.api.vocabularies.vra_core.work_type.work_type_set.WorkTypeSet or None
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

        if titles is None:
            raise ValueError('titles is required')
        if not isinstance(titles, dressdiscover.api.vocabularies.vra_core.title.title_set.TitleSet):
            raise TypeError("expected titles to be a dressdiscover.api.vocabularies.vra_core.title.title_set.TitleSet but it is a %s" % getattr(__builtin__, 'type')(titles))
        self.__titles = titles

        if agents is not None:
            if not isinstance(agents, dressdiscover.api.vocabularies.vra_core.agent.agent_set.AgentSet):
                raise TypeError("expected agents to be a dressdiscover.api.vocabularies.vra_core.agent.agent_set.AgentSet but it is a %s" % getattr(__builtin__, 'type')(agents))
        self.__agents = agents

        if categories is not None:
            if not (isinstance(categories, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), categories))) == 0):
                raise TypeError("expected categories to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(categories))
            if len(categories) < 1:
                raise ValueError("expected len(categories) to be >= 1, was %d" % len(categories))
        self.__categories = categories

        if closures is not None:
            if not isinstance(closures, dressdiscover.api.vocabularies.costume_core.closure.closure_set.ClosureSet):
                raise TypeError("expected closures to be a dressdiscover.api.vocabularies.costume_core.closure.closure_set.ClosureSet but it is a %s" % getattr(__builtin__, 'type')(closures))
        self.__closures = closures

        if colors is not None:
            if not isinstance(colors, dressdiscover.api.vocabularies.costume_core.color.color_set.ColorSet):
                raise TypeError("expected colors to be a dressdiscover.api.vocabularies.costume_core.color.color_set.ColorSet but it is a %s" % getattr(__builtin__, 'type')(colors))
        self.__colors = colors

        if components is not None:
            if not isinstance(components, dressdiscover.api.vocabularies.costume_core.component.component_set.ComponentSet):
                raise TypeError("expected components to be a dressdiscover.api.vocabularies.costume_core.component.component_set.ComponentSet but it is a %s" % getattr(__builtin__, 'type')(components))
        self.__components = components

        if condition is not None:
            if not isinstance(condition, dressdiscover.api.vocabularies.costume_core.condition.condition.Condition):
                raise TypeError("expected condition to be a dressdiscover.api.vocabularies.costume_core.condition.condition.Condition but it is a %s" % getattr(__builtin__, 'type')(condition))
        self.__condition = condition

        if cultural_contexts is not None:
            if not isinstance(cultural_contexts, dressdiscover.api.vocabularies.vra_core.cultural_context.cultural_context_set.CulturalContextSet):
                raise TypeError("expected cultural_contexts to be a dressdiscover.api.vocabularies.vra_core.cultural_context.cultural_context_set.CulturalContextSet but it is a %s" % getattr(__builtin__, 'type')(cultural_contexts))
        self.__cultural_contexts = cultural_contexts

        if dates is not None:
            if not isinstance(dates, dressdiscover.api.vocabularies.vra_core.date.date_set.DateSet):
                raise TypeError("expected dates to be a dressdiscover.api.vocabularies.vra_core.date.date_set.DateSet but it is a %s" % getattr(__builtin__, 'type')(dates))
        self.__dates = dates

        if descriptions is not None:
            if not isinstance(descriptions, dressdiscover.api.vocabularies.vra_core.description.description_set.DescriptionSet):
                raise TypeError("expected descriptions to be a dressdiscover.api.vocabularies.vra_core.description.description_set.DescriptionSet but it is a %s" % getattr(__builtin__, 'type')(descriptions))
        self.__descriptions = descriptions

        if gender is not None:
            if not isinstance(gender, dressdiscover.api.vocabularies.costume_core.gender.gender.Gender):
                raise TypeError("expected gender to be a dressdiscover.api.vocabularies.costume_core.gender.gender.Gender but it is a %s" % getattr(__builtin__, 'type')(gender))
        self.__gender = gender

        if hidden is not None:
            if not isinstance(hidden, bool):
                raise TypeError("expected hidden to be a bool but it is a %s" % getattr(__builtin__, 'type')(hidden))
        self.__hidden = hidden

        if images is not None:
            if not (isinstance(images, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.image.image.Image), images))) == 0):
                raise TypeError("expected images to be a tuple(dressdiscover.api.models.image.image.Image) but it is a %s" % getattr(__builtin__, 'type')(images))
            if len(images) < 1:
                raise ValueError("expected len(images) to be >= 1, was %d" % len(images))
        self.__images = images

        if inscriptions is not None:
            if not isinstance(inscriptions, dressdiscover.api.vocabularies.vra_core.inscription.inscription_set.InscriptionSet):
                raise TypeError("expected inscriptions to be a dressdiscover.api.vocabularies.vra_core.inscription.inscription_set.InscriptionSet but it is a %s" % getattr(__builtin__, 'type')(inscriptions))
        self.__inscriptions = inscriptions

        if locations is not None:
            if not isinstance(locations, dressdiscover.api.vocabularies.vra_core.location.location_set.LocationSet):
                raise TypeError("expected locations to be a dressdiscover.api.vocabularies.vra_core.location.location_set.LocationSet but it is a %s" % getattr(__builtin__, 'type')(locations))
        self.__locations = locations

        if materials is not None:
            if not isinstance(materials, dressdiscover.api.vocabularies.vra_core.material.material_set.MaterialSet):
                raise TypeError("expected materials to be a dressdiscover.api.vocabularies.vra_core.material.material_set.MaterialSet but it is a %s" % getattr(__builtin__, 'type')(materials))
        self.__materials = materials

        if measurements is not None:
            if not isinstance(measurements, dressdiscover.api.vocabularies.vra_core.measurements.measurements_set.MeasurementsSet):
                raise TypeError("expected measurements to be a dressdiscover.api.vocabularies.vra_core.measurements.measurements_set.MeasurementsSet but it is a %s" % getattr(__builtin__, 'type')(measurements))
        self.__measurements = measurements

        if provenance is not None:
            if not isinstance(provenance, basestring):
                raise TypeError("expected provenance to be a str but it is a %s" % getattr(__builtin__, 'type')(provenance))
            if len(provenance) < 1:
                raise ValueError("expected len(provenance) to be >= 1, was %d" % len(provenance))
        self.__provenance = provenance

        if quantity is not None:
            if not isinstance(quantity, int):
                raise TypeError("expected quantity to be a int but it is a %s" % getattr(__builtin__, 'type')(quantity))
        self.__quantity = quantity

        if relations is not None:
            if not isinstance(relations, dressdiscover.api.vocabularies.vra_core.relation.relation_set.RelationSet):
                raise TypeError("expected relations to be a dressdiscover.api.vocabularies.vra_core.relation.relation_set.RelationSet but it is a %s" % getattr(__builtin__, 'type')(relations))
        self.__relations = relations

        if rights is not None:
            if not isinstance(rights, dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet):
                raise TypeError("expected rights to be a dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet but it is a %s" % getattr(__builtin__, 'type')(rights))
        self.__rights = rights

        if structures is not None:
            if not isinstance(structures, dressdiscover.api.vocabularies.costume_core.structure.structure_set.StructureSet):
                raise TypeError("expected structures to be a dressdiscover.api.vocabularies.costume_core.structure.structure_set.StructureSet but it is a %s" % getattr(__builtin__, 'type')(structures))
        self.__structures = structures

        if subjects is not None:
            if not isinstance(subjects, dressdiscover.api.vocabularies.vra_core.subject.subject_set.SubjectSet):
                raise TypeError("expected subjects to be a dressdiscover.api.vocabularies.vra_core.subject.subject_set.SubjectSet but it is a %s" % getattr(__builtin__, 'type')(subjects))
        self.__subjects = subjects

        if techniques is not None:
            if not isinstance(techniques, dressdiscover.api.vocabularies.vra_core.technique.technique_set.TechniqueSet):
                raise TypeError("expected techniques to be a dressdiscover.api.vocabularies.vra_core.technique.technique_set.TechniqueSet but it is a %s" % getattr(__builtin__, 'type')(techniques))
        self.__techniques = techniques

        if textrefs is not None:
            if not isinstance(textrefs, dressdiscover.api.vocabularies.vra_core.textref.textref_set.TextrefSet):
                raise TypeError("expected textrefs to be a dressdiscover.api.vocabularies.vra_core.textref.textref_set.TextrefSet but it is a %s" % getattr(__builtin__, 'type')(textrefs))
        self.__textrefs = textrefs

        if view_type is not None:
            if not isinstance(view_type, dressdiscover.api.vocabularies.vra_core.view_type.view_type.ViewType):
                raise TypeError("expected view_type to be a dressdiscover.api.vocabularies.vra_core.view_type.view_type.ViewType but it is a %s" % getattr(__builtin__, 'type')(view_type))
        self.__view_type = view_type

        if work_types is not None:
            if not isinstance(work_types, dressdiscover.api.vocabularies.vra_core.work_type.work_type_set.WorkTypeSet):
                raise TypeError("expected work_types to be a dressdiscover.api.vocabularies.vra_core.work_type.work_type_set.WorkTypeSet but it is a %s" % getattr(__builtin__, 'type')(work_types))
        self.__work_types = work_types

    def __eq__(self, other):
        if self.collection_id != other.collection_id:
            return False
        if self.institution_id != other.institution_id:
            return False
        if self.titles != other.titles:
            return False
        if self.agents != other.agents:
            return False
        if self.categories != other.categories:
            return False
        if self.closures != other.closures:
            return False
        if self.colors != other.colors:
            return False
        if self.components != other.components:
            return False
        if self.condition != other.condition:
            return False
        if self.cultural_contexts != other.cultural_contexts:
            return False
        if self.dates != other.dates:
            return False
        if self.descriptions != other.descriptions:
            return False
        if self.gender != other.gender:
            return False
        if self.hidden != other.hidden:
            return False
        if self.images != other.images:
            return False
        if self.inscriptions != other.inscriptions:
            return False
        if self.locations != other.locations:
            return False
        if self.materials != other.materials:
            return False
        if self.measurements != other.measurements:
            return False
        if self.provenance != other.provenance:
            return False
        if self.quantity != other.quantity:
            return False
        if self.relations != other.relations:
            return False
        if self.rights != other.rights:
            return False
        if self.structures != other.structures:
            return False
        if self.subjects != other.subjects:
            return False
        if self.techniques != other.techniques:
            return False
        if self.textrefs != other.textrefs:
            return False
        if self.view_type != other.view_type:
            return False
        if self.work_types != other.work_types:
            return False
        return True

    def __hash__(self):
        return hash((self.collection_id,self.institution_id,self.titles,self.agents,self.categories,self.closures,self.colors,self.components,self.condition,self.cultural_contexts,self.dates,self.descriptions,self.gender,self.hidden,self.images,self.inscriptions,self.locations,self.materials,self.measurements,self.provenance,self.quantity,self.relations,self.rights,self.structures,self.subjects,self.techniques,self.textrefs,self.view_type,self.work_types,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('collection_id=' + "'" + self.collection_id.encode('ascii', 'replace') + "'")
        field_reprs.append('institution_id=' + "'" + self.institution_id.encode('ascii', 'replace') + "'")
        field_reprs.append('titles=' + repr(self.titles))
        if self.agents is not None:
            field_reprs.append('agents=' + repr(self.agents))
        if self.categories is not None:
            field_reprs.append('categories=' + repr(self.categories))
        if self.closures is not None:
            field_reprs.append('closures=' + repr(self.closures))
        if self.colors is not None:
            field_reprs.append('colors=' + repr(self.colors))
        if self.components is not None:
            field_reprs.append('components=' + repr(self.components))
        if self.condition is not None:
            field_reprs.append('condition=' + repr(self.condition))
        if self.cultural_contexts is not None:
            field_reprs.append('cultural_contexts=' + repr(self.cultural_contexts))
        if self.dates is not None:
            field_reprs.append('dates=' + repr(self.dates))
        if self.descriptions is not None:
            field_reprs.append('descriptions=' + repr(self.descriptions))
        if self.gender is not None:
            field_reprs.append('gender=' + repr(self.gender))
        if self.hidden is not None:
            field_reprs.append('hidden=' + repr(self.hidden))
        if self.images is not None:
            field_reprs.append('images=' + repr(self.images))
        if self.inscriptions is not None:
            field_reprs.append('inscriptions=' + repr(self.inscriptions))
        if self.locations is not None:
            field_reprs.append('locations=' + repr(self.locations))
        if self.materials is not None:
            field_reprs.append('materials=' + repr(self.materials))
        if self.measurements is not None:
            field_reprs.append('measurements=' + repr(self.measurements))
        if self.provenance is not None:
            field_reprs.append('provenance=' + "'" + self.provenance.encode('ascii', 'replace') + "'")
        if self.quantity is not None:
            field_reprs.append('quantity=' + repr(self.quantity))
        if self.relations is not None:
            field_reprs.append('relations=' + repr(self.relations))
        if self.rights is not None:
            field_reprs.append('rights=' + repr(self.rights))
        if self.structures is not None:
            field_reprs.append('structures=' + repr(self.structures))
        if self.subjects is not None:
            field_reprs.append('subjects=' + repr(self.subjects))
        if self.techniques is not None:
            field_reprs.append('techniques=' + repr(self.techniques))
        if self.textrefs is not None:
            field_reprs.append('textrefs=' + repr(self.textrefs))
        if self.view_type is not None:
            field_reprs.append('view_type=' + repr(self.view_type))
        if self.work_types is not None:
            field_reprs.append('work_types=' + repr(self.work_types))
        return 'Object(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('collection_id=' + "'" + self.collection_id.encode('ascii', 'replace') + "'")
        field_reprs.append('institution_id=' + "'" + self.institution_id.encode('ascii', 'replace') + "'")
        field_reprs.append('titles=' + repr(self.titles))
        if self.agents is not None:
            field_reprs.append('agents=' + repr(self.agents))
        if self.categories is not None:
            field_reprs.append('categories=' + repr(self.categories))
        if self.closures is not None:
            field_reprs.append('closures=' + repr(self.closures))
        if self.colors is not None:
            field_reprs.append('colors=' + repr(self.colors))
        if self.components is not None:
            field_reprs.append('components=' + repr(self.components))
        if self.condition is not None:
            field_reprs.append('condition=' + repr(self.condition))
        if self.cultural_contexts is not None:
            field_reprs.append('cultural_contexts=' + repr(self.cultural_contexts))
        if self.dates is not None:
            field_reprs.append('dates=' + repr(self.dates))
        if self.descriptions is not None:
            field_reprs.append('descriptions=' + repr(self.descriptions))
        if self.gender is not None:
            field_reprs.append('gender=' + repr(self.gender))
        if self.hidden is not None:
            field_reprs.append('hidden=' + repr(self.hidden))
        if self.images is not None:
            field_reprs.append('images=' + repr(self.images))
        if self.inscriptions is not None:
            field_reprs.append('inscriptions=' + repr(self.inscriptions))
        if self.locations is not None:
            field_reprs.append('locations=' + repr(self.locations))
        if self.materials is not None:
            field_reprs.append('materials=' + repr(self.materials))
        if self.measurements is not None:
            field_reprs.append('measurements=' + repr(self.measurements))
        if self.provenance is not None:
            field_reprs.append('provenance=' + "'" + self.provenance.encode('ascii', 'replace') + "'")
        if self.quantity is not None:
            field_reprs.append('quantity=' + repr(self.quantity))
        if self.relations is not None:
            field_reprs.append('relations=' + repr(self.relations))
        if self.rights is not None:
            field_reprs.append('rights=' + repr(self.rights))
        if self.structures is not None:
            field_reprs.append('structures=' + repr(self.structures))
        if self.subjects is not None:
            field_reprs.append('subjects=' + repr(self.subjects))
        if self.techniques is not None:
            field_reprs.append('techniques=' + repr(self.techniques))
        if self.textrefs is not None:
            field_reprs.append('textrefs=' + repr(self.textrefs))
        if self.view_type is not None:
            field_reprs.append('view_type=' + repr(self.view_type))
        if self.work_types is not None:
            field_reprs.append('work_types=' + repr(self.work_types))
        return 'Object(' + ', '.join(field_reprs) + ')'

    @property
    def agents(self):
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.agent.agent_set.AgentSet
        '''

        return self.__agents

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'collection_id': self.collection_id, 'institution_id': self.institution_id, 'titles': self.titles, 'agents': self.agents, 'categories': self.categories, 'closures': self.closures, 'colors': self.colors, 'components': self.components, 'condition': self.condition, 'cultural_contexts': self.cultural_contexts, 'dates': self.dates, 'descriptions': self.descriptions, 'gender': self.gender, 'hidden': self.hidden, 'images': self.images, 'inscriptions': self.inscriptions, 'locations': self.locations, 'materials': self.materials, 'measurements': self.measurements, 'provenance': self.provenance, 'quantity': self.quantity, 'relations': self.relations, 'rights': self.rights, 'structures': self.structures, 'subjects': self.subjects, 'techniques': self.techniques, 'textrefs': self.textrefs, 'view_type': self.view_type, 'work_types': self.work_types}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.collection_id, self.institution_id, self.titles, self.agents, self.categories, self.closures, self.colors, self.components, self.condition, self.cultural_contexts, self.dates, self.descriptions, self.gender, self.hidden, self.images, self.inscriptions, self.locations, self.materials, self.measurements, self.provenance, self.quantity, self.relations, self.rights, self.structures, self.subjects, self.techniques, self.textrefs, self.view_type, self.work_types,)

    @property
    def categories(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__categories

    @property
    def closures(self):
        '''
        :rtype: dressdiscover.api.vocabularies.costume_core.closure.closure_set.ClosureSet
        '''

        return self.__closures

    @property
    def collection_id(self):
        '''
        :rtype: str
        '''

        return self.__collection_id

    @property
    def colors(self):
        '''
        :rtype: dressdiscover.api.vocabularies.costume_core.color.color_set.ColorSet
        '''

        return self.__colors

    @property
    def components(self):
        '''
        :rtype: dressdiscover.api.vocabularies.costume_core.component.component_set.ComponentSet
        '''

        return self.__components

    @property
    def condition(self):
        '''
        :rtype: dressdiscover.api.vocabularies.costume_core.condition.condition.Condition
        '''

        return self.__condition

    @property
    def cultural_contexts(self):
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.cultural_context.cultural_context_set.CulturalContextSet
        '''

        return self.__cultural_contexts

    @property
    def dates(self):
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.date.date_set.DateSet
        '''

        return self.__dates

    @property
    def descriptions(self):
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.description.description_set.DescriptionSet
        '''

        return self.__descriptions

    @property
    def gender(self):
        '''
        :rtype: dressdiscover.api.vocabularies.costume_core.gender.gender.Gender
        '''

        return self.__gender

    @property
    def hidden(self):
        '''
        :rtype: bool
        '''

        return self.__hidden

    @property
    def images(self):
        '''
        :rtype: tuple(dressdiscover.api.models.image.image.Image)
        '''

        return self.__images

    @property
    def inscriptions(self):
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.inscription.inscription_set.InscriptionSet
        '''

        return self.__inscriptions

    @property
    def institution_id(self):
        '''
        :rtype: str
        '''

        return self.__institution_id

    @property
    def locations(self):
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.location.location_set.LocationSet
        '''

        return self.__locations

    @property
    def materials(self):
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.material.material_set.MaterialSet
        '''

        return self.__materials

    @property
    def measurements(self):
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.measurements.measurements_set.MeasurementsSet
        '''

        return self.__measurements

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
        :rtype: dressdiscover.api.models.object.object.Object
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
            elif ifield_name == 'titles' and ifield_id == 3:
                init_kwds['titles'] = dressdiscover.api.vocabularies.vra_core.title.title_set.TitleSet.read(iprot)
            elif ifield_name == 'agents' and ifield_id == 20:
                init_kwds['agents'] = dressdiscover.api.vocabularies.vra_core.agent.agent_set.AgentSet.read(iprot)
            elif ifield_name == 'categories' and ifield_id == 18:
                init_kwds['categories'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'closures' and ifield_id == 34:
                init_kwds['closures'] = dressdiscover.api.vocabularies.costume_core.closure.closure_set.ClosureSet.read(iprot)
            elif ifield_name == 'colors' and ifield_id == 30:
                init_kwds['colors'] = dressdiscover.api.vocabularies.costume_core.color.color_set.ColorSet.read(iprot)
            elif ifield_name == 'components' and ifield_id == 32:
                init_kwds['components'] = dressdiscover.api.vocabularies.costume_core.component.component_set.ComponentSet.read(iprot)
            elif ifield_name == 'condition' and ifield_id == 27:
                try:
                    init_kwds['condition'] = dressdiscover.api.vocabularies.costume_core.condition.condition.Condition.value_of(iprot.read_string().strip().upper())
                except (TypeError,):
                    pass
            elif ifield_name == 'cultural_contexts' and ifield_id == 35:
                init_kwds['cultural_contexts'] = dressdiscover.api.vocabularies.vra_core.cultural_context.cultural_context_set.CulturalContextSet.read(iprot)
            elif ifield_name == 'dates' and ifield_id == 10:
                init_kwds['dates'] = dressdiscover.api.vocabularies.vra_core.date.date_set.DateSet.read(iprot)
            elif ifield_name == 'descriptions' and ifield_id == 4:
                init_kwds['descriptions'] = dressdiscover.api.vocabularies.vra_core.description.description_set.DescriptionSet.read(iprot)
            elif ifield_name == 'gender' and ifield_id == 25:
                try:
                    init_kwds['gender'] = dressdiscover.api.vocabularies.costume_core.gender.gender.Gender.value_of(iprot.read_string().strip().upper())
                except (TypeError,):
                    pass
            elif ifield_name == 'hidden' and ifield_id == 37:
                try:
                    init_kwds['hidden'] = iprot.read_bool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'images' and ifield_id == 23:
                init_kwds['images'] = tuple([dressdiscover.api.models.image.image.Image.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'inscriptions' and ifield_id == 17:
                init_kwds['inscriptions'] = dressdiscover.api.vocabularies.vra_core.inscription.inscription_set.InscriptionSet.read(iprot)
            elif ifield_name == 'locations' and ifield_id == 36:
                init_kwds['locations'] = dressdiscover.api.vocabularies.vra_core.location.location_set.LocationSet.read(iprot)
            elif ifield_name == 'materials' and ifield_id == 15:
                init_kwds['materials'] = dressdiscover.api.vocabularies.vra_core.material.material_set.MaterialSet.read(iprot)
            elif ifield_name == 'measurements' and ifield_id == 31:
                init_kwds['measurements'] = dressdiscover.api.vocabularies.vra_core.measurements.measurements_set.MeasurementsSet.read(iprot)
            elif ifield_name == 'provenance' and ifield_id == 5:
                try:
                    init_kwds['provenance'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'quantity' and ifield_id == 26:
                try:
                    init_kwds['quantity'] = iprot.read_i32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'relations' and ifield_id == 29:
                init_kwds['relations'] = dressdiscover.api.vocabularies.vra_core.relation.relation_set.RelationSet.read(iprot)
            elif ifield_name == 'rights' and ifield_id == 22:
                init_kwds['rights'] = dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet.read(iprot)
            elif ifield_name == 'structures' and ifield_id == 33:
                init_kwds['structures'] = dressdiscover.api.vocabularies.costume_core.structure.structure_set.StructureSet.read(iprot)
            elif ifield_name == 'subjects' and ifield_id == 21:
                init_kwds['subjects'] = dressdiscover.api.vocabularies.vra_core.subject.subject_set.SubjectSet.read(iprot)
            elif ifield_name == 'techniques' and ifield_id == 16:
                init_kwds['techniques'] = dressdiscover.api.vocabularies.vra_core.technique.technique_set.TechniqueSet.read(iprot)
            elif ifield_name == 'textrefs' and ifield_id == 9:
                init_kwds['textrefs'] = dressdiscover.api.vocabularies.vra_core.textref.textref_set.TextrefSet.read(iprot)
            elif ifield_name == 'view_type' and ifield_id == 28:
                try:
                    init_kwds['view_type'] = dressdiscover.api.vocabularies.vra_core.view_type.view_type.ViewType.value_of(iprot.read_string().strip().upper())
                except (TypeError,):
                    pass
            elif ifield_name == 'work_types' and ifield_id == 24:
                init_kwds['work_types'] = dressdiscover.api.vocabularies.vra_core.work_type.work_type_set.WorkTypeSet.read(iprot)
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    @property
    def relations(self):
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.relation.relation_set.RelationSet
        '''

        return self.__relations

    def replace(
        self,
        collection_id=None,
        institution_id=None,
        titles=None,
        agents=None,
        categories=None,
        closures=None,
        colors=None,
        components=None,
        condition=None,
        cultural_contexts=None,
        dates=None,
        descriptions=None,
        gender=None,
        hidden=None,
        images=None,
        inscriptions=None,
        locations=None,
        materials=None,
        measurements=None,
        provenance=None,
        quantity=None,
        relations=None,
        rights=None,
        structures=None,
        subjects=None,
        techniques=None,
        textrefs=None,
        view_type=None,
        work_types=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type collection_id: str or None
        :type institution_id: str or None
        :type titles: dressdiscover.api.vocabularies.vra_core.title.title_set.TitleSet or None
        :type agents: dressdiscover.api.vocabularies.vra_core.agent.agent_set.AgentSet or None
        :type categories: tuple(str) or None
        :type closures: dressdiscover.api.vocabularies.costume_core.closure.closure_set.ClosureSet or None
        :type colors: dressdiscover.api.vocabularies.costume_core.color.color_set.ColorSet or None
        :type components: dressdiscover.api.vocabularies.costume_core.component.component_set.ComponentSet or None
        :type condition: dressdiscover.api.vocabularies.costume_core.condition.condition.Condition or None
        :type cultural_contexts: dressdiscover.api.vocabularies.vra_core.cultural_context.cultural_context_set.CulturalContextSet or None
        :type dates: dressdiscover.api.vocabularies.vra_core.date.date_set.DateSet or None
        :type descriptions: dressdiscover.api.vocabularies.vra_core.description.description_set.DescriptionSet or None
        :type gender: dressdiscover.api.vocabularies.costume_core.gender.gender.Gender or None
        :type hidden: bool or None
        :type images: tuple(dressdiscover.api.models.image.image.Image) or None
        :type inscriptions: dressdiscover.api.vocabularies.vra_core.inscription.inscription_set.InscriptionSet or None
        :type locations: dressdiscover.api.vocabularies.vra_core.location.location_set.LocationSet or None
        :type materials: dressdiscover.api.vocabularies.vra_core.material.material_set.MaterialSet or None
        :type measurements: dressdiscover.api.vocabularies.vra_core.measurements.measurements_set.MeasurementsSet or None
        :type provenance: str or None
        :type quantity: int or None
        :type relations: dressdiscover.api.vocabularies.vra_core.relation.relation_set.RelationSet or None
        :type rights: dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet or None
        :type structures: dressdiscover.api.vocabularies.costume_core.structure.structure_set.StructureSet or None
        :type subjects: dressdiscover.api.vocabularies.vra_core.subject.subject_set.SubjectSet or None
        :type techniques: dressdiscover.api.vocabularies.vra_core.technique.technique_set.TechniqueSet or None
        :type textrefs: dressdiscover.api.vocabularies.vra_core.textref.textref_set.TextrefSet or None
        :type view_type: dressdiscover.api.vocabularies.vra_core.view_type.view_type.ViewType or None
        :type work_types: dressdiscover.api.vocabularies.vra_core.work_type.work_type_set.WorkTypeSet or None
        :rtype: dressdiscover.api.models.object.object.Object
        '''

        if collection_id is None:
            collection_id = self.collection_id
        if institution_id is None:
            institution_id = self.institution_id
        if titles is None:
            titles = self.titles
        if agents is None:
            agents = self.agents
        if categories is None:
            categories = self.categories
        if closures is None:
            closures = self.closures
        if colors is None:
            colors = self.colors
        if components is None:
            components = self.components
        if condition is None:
            condition = self.condition
        if cultural_contexts is None:
            cultural_contexts = self.cultural_contexts
        if dates is None:
            dates = self.dates
        if descriptions is None:
            descriptions = self.descriptions
        if gender is None:
            gender = self.gender
        if hidden is None:
            hidden = self.hidden
        if images is None:
            images = self.images
        if inscriptions is None:
            inscriptions = self.inscriptions
        if locations is None:
            locations = self.locations
        if materials is None:
            materials = self.materials
        if measurements is None:
            measurements = self.measurements
        if provenance is None:
            provenance = self.provenance
        if quantity is None:
            quantity = self.quantity
        if relations is None:
            relations = self.relations
        if rights is None:
            rights = self.rights
        if structures is None:
            structures = self.structures
        if subjects is None:
            subjects = self.subjects
        if techniques is None:
            techniques = self.techniques
        if textrefs is None:
            textrefs = self.textrefs
        if view_type is None:
            view_type = self.view_type
        if work_types is None:
            work_types = self.work_types
        return self.__class__(collection_id=collection_id, institution_id=institution_id, titles=titles, agents=agents, categories=categories, closures=closures, colors=colors, components=components, condition=condition, cultural_contexts=cultural_contexts, dates=dates, descriptions=descriptions, gender=gender, hidden=hidden, images=images, inscriptions=inscriptions, locations=locations, materials=materials, measurements=measurements, provenance=provenance, quantity=quantity, relations=relations, rights=rights, structures=structures, subjects=subjects, techniques=techniques, textrefs=textrefs, view_type=view_type, work_types=work_types)

    @property
    def rights(self):
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet
        '''

        return self.__rights

    @property
    def structures(self):
        '''
        :rtype: dressdiscover.api.vocabularies.costume_core.structure.structure_set.StructureSet
        '''

        return self.__structures

    @property
    def subjects(self):
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.subject.subject_set.SubjectSet
        '''

        return self.__subjects

    @property
    def techniques(self):
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.technique.technique_set.TechniqueSet
        '''

        return self.__techniques

    @property
    def textrefs(self):
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.textref.textref_set.TextrefSet
        '''

        return self.__textrefs

    @property
    def titles(self):
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.title.title_set.TitleSet
        '''

        return self.__titles

    @property
    def view_type(self):
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.view_type.view_type.ViewType
        '''

        return self.__view_type

    @property
    def work_types(self):
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.work_type.work_type_set.WorkTypeSet
        '''

        return self.__work_types

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.object.object.Object
        '''

        oprot.write_struct_begin('Object')

        oprot.write_field_begin(name='collection_id', type=11, id=1)
        oprot.write_string(self.collection_id)
        oprot.write_field_end()

        oprot.write_field_begin(name='institution_id', type=11, id=2)
        oprot.write_string(self.institution_id)
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

        if self.closures is not None:
            oprot.write_field_begin(name='closures', type=12, id=34)
            self.closures.write(oprot)
            oprot.write_field_end()

        if self.colors is not None:
            oprot.write_field_begin(name='colors', type=12, id=30)
            self.colors.write(oprot)
            oprot.write_field_end()

        if self.components is not None:
            oprot.write_field_begin(name='components', type=12, id=32)
            self.components.write(oprot)
            oprot.write_field_end()

        if self.condition is not None:
            oprot.write_field_begin(name='condition', type=11, id=27)
            oprot.write_string(str(self.condition))
            oprot.write_field_end()

        if self.cultural_contexts is not None:
            oprot.write_field_begin(name='cultural_contexts', type=12, id=35)
            self.cultural_contexts.write(oprot)
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

        if self.hidden is not None:
            oprot.write_field_begin(name='hidden', type=2, id=37)
            oprot.write_bool(self.hidden)
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

        if self.locations is not None:
            oprot.write_field_begin(name='locations', type=12, id=36)
            self.locations.write(oprot)
            oprot.write_field_end()

        if self.materials is not None:
            oprot.write_field_begin(name='materials', type=12, id=15)
            self.materials.write(oprot)
            oprot.write_field_end()

        if self.measurements is not None:
            oprot.write_field_begin(name='measurements', type=12, id=31)
            self.measurements.write(oprot)
            oprot.write_field_end()

        if self.provenance is not None:
            oprot.write_field_begin(name='provenance', type=11, id=5)
            oprot.write_string(self.provenance)
            oprot.write_field_end()

        if self.quantity is not None:
            oprot.write_field_begin(name='quantity', type=8, id=26)
            oprot.write_i32(self.quantity)
            oprot.write_field_end()

        if self.relations is not None:
            oprot.write_field_begin(name='relations', type=12, id=29)
            self.relations.write(oprot)
            oprot.write_field_end()

        if self.rights is not None:
            oprot.write_field_begin(name='rights', type=12, id=22)
            self.rights.write(oprot)
            oprot.write_field_end()

        if self.structures is not None:
            oprot.write_field_begin(name='structures', type=12, id=33)
            self.structures.write(oprot)
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

        if self.view_type is not None:
            oprot.write_field_begin(name='view_type', type=11, id=28)
            oprot.write_string(str(self.view_type))
            oprot.write_field_end()

        if self.work_types is not None:
            oprot.write_field_begin(name='work_types', type=12, id=24)
            self.work_types.write(oprot)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self