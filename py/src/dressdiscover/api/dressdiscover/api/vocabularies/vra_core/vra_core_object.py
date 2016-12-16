from itertools import ifilterfalse
import __builtin__
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
import dressdiscover.api.vocabularies.vra_core.work_type.work_type_set


class VraCoreObject(object):
    class Builder(object):
        def __init__(
            self,
            agent_sets=None,
            cultural_context_sets=None,
            date_sets=None,
            description_sets=None,
            inscription_sets=None,
            location_sets=None,
            material_sets=None,
            measurements_sets=None,
            relation_sets=None,
            rights_sets=None,
            subject_sets=None,
            technique_sets=None,
            textref_sets=None,
            title_sets=None,
            work_type_sets=None,
        ):
            '''
            :type agent_sets: tuple(dressdiscover.api.vocabularies.vra_core.agent.agent_set.AgentSet) or None
            :type cultural_context_sets: tuple(dressdiscover.api.vocabularies.vra_core.cultural_context.cultural_context_set.CulturalContextSet) or None
            :type date_sets: tuple(dressdiscover.api.vocabularies.vra_core.date.date_set.DateSet) or None
            :type description_sets: tuple(dressdiscover.api.vocabularies.vra_core.description.description_set.DescriptionSet) or None
            :type inscription_sets: tuple(dressdiscover.api.vocabularies.vra_core.inscription.inscription_set.InscriptionSet) or None
            :type location_sets: tuple(dressdiscover.api.vocabularies.vra_core.location.location_set.LocationSet) or None
            :type material_sets: tuple(dressdiscover.api.vocabularies.vra_core.material.material_set.MaterialSet) or None
            :type measurements_sets: tuple(dressdiscover.api.vocabularies.vra_core.measurements.measurements_set.MeasurementsSet) or None
            :type relation_sets: tuple(dressdiscover.api.vocabularies.vra_core.relation.relation_set.RelationSet) or None
            :type rights_sets: tuple(dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet) or None
            :type subject_sets: tuple(dressdiscover.api.vocabularies.vra_core.subject.subject_set.SubjectSet) or None
            :type technique_sets: tuple(dressdiscover.api.vocabularies.vra_core.technique.technique_set.TechniqueSet) or None
            :type textref_sets: tuple(dressdiscover.api.vocabularies.vra_core.textref.textref_set.TextrefSet) or None
            :type title_sets: tuple(dressdiscover.api.vocabularies.vra_core.title.title_set.TitleSet) or None
            :type work_type_sets: tuple(dressdiscover.api.vocabularies.vra_core.work_type.work_type_set.WorkTypeSet) or None
            '''

            self.__agent_sets = agent_sets
            self.__cultural_context_sets = cultural_context_sets
            self.__date_sets = date_sets
            self.__description_sets = description_sets
            self.__inscription_sets = inscription_sets
            self.__location_sets = location_sets
            self.__material_sets = material_sets
            self.__measurements_sets = measurements_sets
            self.__relation_sets = relation_sets
            self.__rights_sets = rights_sets
            self.__subject_sets = subject_sets
            self.__technique_sets = technique_sets
            self.__textref_sets = textref_sets
            self.__title_sets = title_sets
            self.__work_type_sets = work_type_sets

        def build(self):
            return VraCoreObject(agent_sets=self.__agent_sets, cultural_context_sets=self.__cultural_context_sets, date_sets=self.__date_sets, description_sets=self.__description_sets, inscription_sets=self.__inscription_sets, location_sets=self.__location_sets, material_sets=self.__material_sets, measurements_sets=self.__measurements_sets, relation_sets=self.__relation_sets, rights_sets=self.__rights_sets, subject_sets=self.__subject_sets, technique_sets=self.__technique_sets, textref_sets=self.__textref_sets, title_sets=self.__title_sets, work_type_sets=self.__work_type_sets)

        @property
        def agent_sets(self):
            '''
            :rtype: tuple(dressdiscover.api.vocabularies.vra_core.agent.agent_set.AgentSet)
            '''

            return self.__agent_sets

        @property
        def cultural_context_sets(self):
            '''
            :rtype: tuple(dressdiscover.api.vocabularies.vra_core.cultural_context.cultural_context_set.CulturalContextSet)
            '''

            return self.__cultural_context_sets

        @property
        def date_sets(self):
            '''
            :rtype: tuple(dressdiscover.api.vocabularies.vra_core.date.date_set.DateSet)
            '''

            return self.__date_sets

        @property
        def description_sets(self):
            '''
            :rtype: tuple(dressdiscover.api.vocabularies.vra_core.description.description_set.DescriptionSet)
            '''

            return self.__description_sets

        @property
        def inscription_sets(self):
            '''
            :rtype: tuple(dressdiscover.api.vocabularies.vra_core.inscription.inscription_set.InscriptionSet)
            '''

            return self.__inscription_sets

        @property
        def location_sets(self):
            '''
            :rtype: tuple(dressdiscover.api.vocabularies.vra_core.location.location_set.LocationSet)
            '''

            return self.__location_sets

        @property
        def material_sets(self):
            '''
            :rtype: tuple(dressdiscover.api.vocabularies.vra_core.material.material_set.MaterialSet)
            '''

            return self.__material_sets

        @property
        def measurements_sets(self):
            '''
            :rtype: tuple(dressdiscover.api.vocabularies.vra_core.measurements.measurements_set.MeasurementsSet)
            '''

            return self.__measurements_sets

        @property
        def relation_sets(self):
            '''
            :rtype: tuple(dressdiscover.api.vocabularies.vra_core.relation.relation_set.RelationSet)
            '''

            return self.__relation_sets

        @property
        def rights_sets(self):
            '''
            :rtype: tuple(dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet)
            '''

            return self.__rights_sets

        def set_agent_sets(self, agent_sets):
            '''
            :type agent_sets: tuple(dressdiscover.api.vocabularies.vra_core.agent.agent_set.AgentSet) or None
            '''

            if agent_sets is not None:
                if not (isinstance(agent_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.agent.agent_set.AgentSet), agent_sets))) == 0):
                    raise TypeError("expected agent_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.agent.agent_set.AgentSet) but it is a %s" % getattr(__builtin__, 'type')(agent_sets))
                if len(agent_sets) < 1:
                    raise ValueError("expected len(agent_sets) to be >= 1, was %d" % len(agent_sets))
            self.__agent_sets = agent_sets
            return self

        def set_cultural_context_sets(self, cultural_context_sets):
            '''
            :type cultural_context_sets: tuple(dressdiscover.api.vocabularies.vra_core.cultural_context.cultural_context_set.CulturalContextSet) or None
            '''

            if cultural_context_sets is not None:
                if not (isinstance(cultural_context_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.cultural_context.cultural_context_set.CulturalContextSet), cultural_context_sets))) == 0):
                    raise TypeError("expected cultural_context_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.cultural_context.cultural_context_set.CulturalContextSet) but it is a %s" % getattr(__builtin__, 'type')(cultural_context_sets))
                if len(cultural_context_sets) < 1:
                    raise ValueError("expected len(cultural_context_sets) to be >= 1, was %d" % len(cultural_context_sets))
            self.__cultural_context_sets = cultural_context_sets
            return self

        def set_date_sets(self, date_sets):
            '''
            :type date_sets: tuple(dressdiscover.api.vocabularies.vra_core.date.date_set.DateSet) or None
            '''

            if date_sets is not None:
                if not (isinstance(date_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.date.date_set.DateSet), date_sets))) == 0):
                    raise TypeError("expected date_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.date.date_set.DateSet) but it is a %s" % getattr(__builtin__, 'type')(date_sets))
                if len(date_sets) < 1:
                    raise ValueError("expected len(date_sets) to be >= 1, was %d" % len(date_sets))
            self.__date_sets = date_sets
            return self

        def set_description_sets(self, description_sets):
            '''
            :type description_sets: tuple(dressdiscover.api.vocabularies.vra_core.description.description_set.DescriptionSet) or None
            '''

            if description_sets is not None:
                if not (isinstance(description_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.description.description_set.DescriptionSet), description_sets))) == 0):
                    raise TypeError("expected description_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.description.description_set.DescriptionSet) but it is a %s" % getattr(__builtin__, 'type')(description_sets))
                if len(description_sets) < 1:
                    raise ValueError("expected len(description_sets) to be >= 1, was %d" % len(description_sets))
            self.__description_sets = description_sets
            return self

        def set_inscription_sets(self, inscription_sets):
            '''
            :type inscription_sets: tuple(dressdiscover.api.vocabularies.vra_core.inscription.inscription_set.InscriptionSet) or None
            '''

            if inscription_sets is not None:
                if not (isinstance(inscription_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.inscription.inscription_set.InscriptionSet), inscription_sets))) == 0):
                    raise TypeError("expected inscription_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.inscription.inscription_set.InscriptionSet) but it is a %s" % getattr(__builtin__, 'type')(inscription_sets))
                if len(inscription_sets) < 1:
                    raise ValueError("expected len(inscription_sets) to be >= 1, was %d" % len(inscription_sets))
            self.__inscription_sets = inscription_sets
            return self

        def set_location_sets(self, location_sets):
            '''
            :type location_sets: tuple(dressdiscover.api.vocabularies.vra_core.location.location_set.LocationSet) or None
            '''

            if location_sets is not None:
                if not (isinstance(location_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.location.location_set.LocationSet), location_sets))) == 0):
                    raise TypeError("expected location_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.location.location_set.LocationSet) but it is a %s" % getattr(__builtin__, 'type')(location_sets))
                if len(location_sets) < 1:
                    raise ValueError("expected len(location_sets) to be >= 1, was %d" % len(location_sets))
            self.__location_sets = location_sets
            return self

        def set_material_sets(self, material_sets):
            '''
            :type material_sets: tuple(dressdiscover.api.vocabularies.vra_core.material.material_set.MaterialSet) or None
            '''

            if material_sets is not None:
                if not (isinstance(material_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.material.material_set.MaterialSet), material_sets))) == 0):
                    raise TypeError("expected material_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.material.material_set.MaterialSet) but it is a %s" % getattr(__builtin__, 'type')(material_sets))
                if len(material_sets) < 1:
                    raise ValueError("expected len(material_sets) to be >= 1, was %d" % len(material_sets))
            self.__material_sets = material_sets
            return self

        def set_measurements_sets(self, measurements_sets):
            '''
            :type measurements_sets: tuple(dressdiscover.api.vocabularies.vra_core.measurements.measurements_set.MeasurementsSet) or None
            '''

            if measurements_sets is not None:
                if not (isinstance(measurements_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.measurements.measurements_set.MeasurementsSet), measurements_sets))) == 0):
                    raise TypeError("expected measurements_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.measurements.measurements_set.MeasurementsSet) but it is a %s" % getattr(__builtin__, 'type')(measurements_sets))
                if len(measurements_sets) < 1:
                    raise ValueError("expected len(measurements_sets) to be >= 1, was %d" % len(measurements_sets))
            self.__measurements_sets = measurements_sets
            return self

        def set_relation_sets(self, relation_sets):
            '''
            :type relation_sets: tuple(dressdiscover.api.vocabularies.vra_core.relation.relation_set.RelationSet) or None
            '''

            if relation_sets is not None:
                if not (isinstance(relation_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.relation.relation_set.RelationSet), relation_sets))) == 0):
                    raise TypeError("expected relation_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.relation.relation_set.RelationSet) but it is a %s" % getattr(__builtin__, 'type')(relation_sets))
                if len(relation_sets) < 1:
                    raise ValueError("expected len(relation_sets) to be >= 1, was %d" % len(relation_sets))
            self.__relation_sets = relation_sets
            return self

        def set_rights_sets(self, rights_sets):
            '''
            :type rights_sets: tuple(dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet) or None
            '''

            if rights_sets is not None:
                if not (isinstance(rights_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet), rights_sets))) == 0):
                    raise TypeError("expected rights_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet) but it is a %s" % getattr(__builtin__, 'type')(rights_sets))
                if len(rights_sets) < 1:
                    raise ValueError("expected len(rights_sets) to be >= 1, was %d" % len(rights_sets))
            self.__rights_sets = rights_sets
            return self

        def set_subject_sets(self, subject_sets):
            '''
            :type subject_sets: tuple(dressdiscover.api.vocabularies.vra_core.subject.subject_set.SubjectSet) or None
            '''

            if subject_sets is not None:
                if not (isinstance(subject_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.subject.subject_set.SubjectSet), subject_sets))) == 0):
                    raise TypeError("expected subject_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.subject.subject_set.SubjectSet) but it is a %s" % getattr(__builtin__, 'type')(subject_sets))
                if len(subject_sets) < 1:
                    raise ValueError("expected len(subject_sets) to be >= 1, was %d" % len(subject_sets))
            self.__subject_sets = subject_sets
            return self

        def set_technique_sets(self, technique_sets):
            '''
            :type technique_sets: tuple(dressdiscover.api.vocabularies.vra_core.technique.technique_set.TechniqueSet) or None
            '''

            if technique_sets is not None:
                if not (isinstance(technique_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.technique.technique_set.TechniqueSet), technique_sets))) == 0):
                    raise TypeError("expected technique_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.technique.technique_set.TechniqueSet) but it is a %s" % getattr(__builtin__, 'type')(technique_sets))
                if len(technique_sets) < 1:
                    raise ValueError("expected len(technique_sets) to be >= 1, was %d" % len(technique_sets))
            self.__technique_sets = technique_sets
            return self

        def set_textref_sets(self, textref_sets):
            '''
            :type textref_sets: tuple(dressdiscover.api.vocabularies.vra_core.textref.textref_set.TextrefSet) or None
            '''

            if textref_sets is not None:
                if not (isinstance(textref_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.textref.textref_set.TextrefSet), textref_sets))) == 0):
                    raise TypeError("expected textref_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.textref.textref_set.TextrefSet) but it is a %s" % getattr(__builtin__, 'type')(textref_sets))
                if len(textref_sets) < 1:
                    raise ValueError("expected len(textref_sets) to be >= 1, was %d" % len(textref_sets))
            self.__textref_sets = textref_sets
            return self

        def set_title_sets(self, title_sets):
            '''
            :type title_sets: tuple(dressdiscover.api.vocabularies.vra_core.title.title_set.TitleSet) or None
            '''

            if title_sets is not None:
                if not (isinstance(title_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.title.title_set.TitleSet), title_sets))) == 0):
                    raise TypeError("expected title_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.title.title_set.TitleSet) but it is a %s" % getattr(__builtin__, 'type')(title_sets))
                if len(title_sets) < 1:
                    raise ValueError("expected len(title_sets) to be >= 1, was %d" % len(title_sets))
            self.__title_sets = title_sets
            return self

        def set_work_type_sets(self, work_type_sets):
            '''
            :type work_type_sets: tuple(dressdiscover.api.vocabularies.vra_core.work_type.work_type_set.WorkTypeSet) or None
            '''

            if work_type_sets is not None:
                if not (isinstance(work_type_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.work_type.work_type_set.WorkTypeSet), work_type_sets))) == 0):
                    raise TypeError("expected work_type_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.work_type.work_type_set.WorkTypeSet) but it is a %s" % getattr(__builtin__, 'type')(work_type_sets))
                if len(work_type_sets) < 1:
                    raise ValueError("expected len(work_type_sets) to be >= 1, was %d" % len(work_type_sets))
            self.__work_type_sets = work_type_sets
            return self

        @property
        def subject_sets(self):
            '''
            :rtype: tuple(dressdiscover.api.vocabularies.vra_core.subject.subject_set.SubjectSet)
            '''

            return self.__subject_sets

        @property
        def technique_sets(self):
            '''
            :rtype: tuple(dressdiscover.api.vocabularies.vra_core.technique.technique_set.TechniqueSet)
            '''

            return self.__technique_sets

        @property
        def textref_sets(self):
            '''
            :rtype: tuple(dressdiscover.api.vocabularies.vra_core.textref.textref_set.TextrefSet)
            '''

            return self.__textref_sets

        @property
        def title_sets(self):
            '''
            :rtype: tuple(dressdiscover.api.vocabularies.vra_core.title.title_set.TitleSet)
            '''

            return self.__title_sets

        def update(self, vra_core_object):
            '''
            :type agent_sets: tuple(dressdiscover.api.vocabularies.vra_core.agent.agent_set.AgentSet) or None
            :type cultural_context_sets: tuple(dressdiscover.api.vocabularies.vra_core.cultural_context.cultural_context_set.CulturalContextSet) or None
            :type date_sets: tuple(dressdiscover.api.vocabularies.vra_core.date.date_set.DateSet) or None
            :type description_sets: tuple(dressdiscover.api.vocabularies.vra_core.description.description_set.DescriptionSet) or None
            :type inscription_sets: tuple(dressdiscover.api.vocabularies.vra_core.inscription.inscription_set.InscriptionSet) or None
            :type location_sets: tuple(dressdiscover.api.vocabularies.vra_core.location.location_set.LocationSet) or None
            :type material_sets: tuple(dressdiscover.api.vocabularies.vra_core.material.material_set.MaterialSet) or None
            :type measurements_sets: tuple(dressdiscover.api.vocabularies.vra_core.measurements.measurements_set.MeasurementsSet) or None
            :type relation_sets: tuple(dressdiscover.api.vocabularies.vra_core.relation.relation_set.RelationSet) or None
            :type rights_sets: tuple(dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet) or None
            :type subject_sets: tuple(dressdiscover.api.vocabularies.vra_core.subject.subject_set.SubjectSet) or None
            :type technique_sets: tuple(dressdiscover.api.vocabularies.vra_core.technique.technique_set.TechniqueSet) or None
            :type textref_sets: tuple(dressdiscover.api.vocabularies.vra_core.textref.textref_set.TextrefSet) or None
            :type title_sets: tuple(dressdiscover.api.vocabularies.vra_core.title.title_set.TitleSet) or None
            :type work_type_sets: tuple(dressdiscover.api.vocabularies.vra_core.work_type.work_type_set.WorkTypeSet) or None
            '''

            if isinstance(vra_core_object, VraCoreObject):
                self.set_agent_sets(vra_core_object.agent_sets)
                self.set_cultural_context_sets(vra_core_object.cultural_context_sets)
                self.set_date_sets(vra_core_object.date_sets)
                self.set_description_sets(vra_core_object.description_sets)
                self.set_inscription_sets(vra_core_object.inscription_sets)
                self.set_location_sets(vra_core_object.location_sets)
                self.set_material_sets(vra_core_object.material_sets)
                self.set_measurements_sets(vra_core_object.measurements_sets)
                self.set_relation_sets(vra_core_object.relation_sets)
                self.set_rights_sets(vra_core_object.rights_sets)
                self.set_subject_sets(vra_core_object.subject_sets)
                self.set_technique_sets(vra_core_object.technique_sets)
                self.set_textref_sets(vra_core_object.textref_sets)
                self.set_title_sets(vra_core_object.title_sets)
                self.set_work_type_sets(vra_core_object.work_type_sets)
            elif isinstance(vra_core_object, dict):
                for key, value in vra_core_object.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(vra_core_object)
            return self

        @property
        def work_type_sets(self):
            '''
            :rtype: tuple(dressdiscover.api.vocabularies.vra_core.work_type.work_type_set.WorkTypeSet)
            '''

            return self.__work_type_sets

        @agent_sets.setter
        def agent_sets(self, agent_sets):
            '''
            :type agent_sets: tuple(dressdiscover.api.vocabularies.vra_core.agent.agent_set.AgentSet) or None
            '''

            self.set_agent_sets(agent_sets)

        @cultural_context_sets.setter
        def cultural_context_sets(self, cultural_context_sets):
            '''
            :type cultural_context_sets: tuple(dressdiscover.api.vocabularies.vra_core.cultural_context.cultural_context_set.CulturalContextSet) or None
            '''

            self.set_cultural_context_sets(cultural_context_sets)

        @date_sets.setter
        def date_sets(self, date_sets):
            '''
            :type date_sets: tuple(dressdiscover.api.vocabularies.vra_core.date.date_set.DateSet) or None
            '''

            self.set_date_sets(date_sets)

        @description_sets.setter
        def description_sets(self, description_sets):
            '''
            :type description_sets: tuple(dressdiscover.api.vocabularies.vra_core.description.description_set.DescriptionSet) or None
            '''

            self.set_description_sets(description_sets)

        @inscription_sets.setter
        def inscription_sets(self, inscription_sets):
            '''
            :type inscription_sets: tuple(dressdiscover.api.vocabularies.vra_core.inscription.inscription_set.InscriptionSet) or None
            '''

            self.set_inscription_sets(inscription_sets)

        @location_sets.setter
        def location_sets(self, location_sets):
            '''
            :type location_sets: tuple(dressdiscover.api.vocabularies.vra_core.location.location_set.LocationSet) or None
            '''

            self.set_location_sets(location_sets)

        @material_sets.setter
        def material_sets(self, material_sets):
            '''
            :type material_sets: tuple(dressdiscover.api.vocabularies.vra_core.material.material_set.MaterialSet) or None
            '''

            self.set_material_sets(material_sets)

        @measurements_sets.setter
        def measurements_sets(self, measurements_sets):
            '''
            :type measurements_sets: tuple(dressdiscover.api.vocabularies.vra_core.measurements.measurements_set.MeasurementsSet) or None
            '''

            self.set_measurements_sets(measurements_sets)

        @relation_sets.setter
        def relation_sets(self, relation_sets):
            '''
            :type relation_sets: tuple(dressdiscover.api.vocabularies.vra_core.relation.relation_set.RelationSet) or None
            '''

            self.set_relation_sets(relation_sets)

        @rights_sets.setter
        def rights_sets(self, rights_sets):
            '''
            :type rights_sets: tuple(dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet) or None
            '''

            self.set_rights_sets(rights_sets)

        @subject_sets.setter
        def subject_sets(self, subject_sets):
            '''
            :type subject_sets: tuple(dressdiscover.api.vocabularies.vra_core.subject.subject_set.SubjectSet) or None
            '''

            self.set_subject_sets(subject_sets)

        @technique_sets.setter
        def technique_sets(self, technique_sets):
            '''
            :type technique_sets: tuple(dressdiscover.api.vocabularies.vra_core.technique.technique_set.TechniqueSet) or None
            '''

            self.set_technique_sets(technique_sets)

        @textref_sets.setter
        def textref_sets(self, textref_sets):
            '''
            :type textref_sets: tuple(dressdiscover.api.vocabularies.vra_core.textref.textref_set.TextrefSet) or None
            '''

            self.set_textref_sets(textref_sets)

        @title_sets.setter
        def title_sets(self, title_sets):
            '''
            :type title_sets: tuple(dressdiscover.api.vocabularies.vra_core.title.title_set.TitleSet) or None
            '''

            self.set_title_sets(title_sets)

        @work_type_sets.setter
        def work_type_sets(self, work_type_sets):
            '''
            :type work_type_sets: tuple(dressdiscover.api.vocabularies.vra_core.work_type.work_type_set.WorkTypeSet) or None
            '''

            self.set_work_type_sets(work_type_sets)

    class FieldMetadata(object):
        AGENT_SETS = None
        CULTURAL_CONTEXT_SETS = None
        DATE_SETS = None
        DESCRIPTION_SETS = None
        INSCRIPTION_SETS = None
        LOCATION_SETS = None
        MATERIAL_SETS = None
        MEASUREMENTS_SETS = None
        RELATION_SETS = None
        RIGHTS_SETS = None
        SUBJECT_SETS = None
        TECHNIQUE_SETS = None
        TEXTREF_SETS = None
        TITLE_SETS = None
        WORK_TYPE_SETS = None

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
            return (cls.AGENT_SETS, cls.CULTURAL_CONTEXT_SETS, cls.DATE_SETS, cls.DESCRIPTION_SETS, cls.INSCRIPTION_SETS, cls.LOCATION_SETS, cls.MATERIAL_SETS, cls.MEASUREMENTS_SETS, cls.RELATION_SETS, cls.RIGHTS_SETS, cls.SUBJECT_SETS, cls.TECHNIQUE_SETS, cls.TEXTREF_SETS, cls.TITLE_SETS, cls.WORK_TYPE_SETS,)

    FieldMetadata.AGENT_SETS = FieldMetadata('agent_sets', tuple, {u'minLength': 1})
    FieldMetadata.CULTURAL_CONTEXT_SETS = FieldMetadata('cultural_context_sets', tuple, {u'minLength': 1})
    FieldMetadata.DATE_SETS = FieldMetadata('date_sets', tuple, {u'minLength': 1})
    FieldMetadata.DESCRIPTION_SETS = FieldMetadata('description_sets', tuple, {u'minLength': 1})
    FieldMetadata.INSCRIPTION_SETS = FieldMetadata('inscription_sets', tuple, {u'minLength': 1})
    FieldMetadata.LOCATION_SETS = FieldMetadata('location_sets', tuple, {u'minLength': 1})
    FieldMetadata.MATERIAL_SETS = FieldMetadata('material_sets', tuple, {u'minLength': 1})
    FieldMetadata.MEASUREMENTS_SETS = FieldMetadata('measurements_sets', tuple, {u'minLength': 1})
    FieldMetadata.RELATION_SETS = FieldMetadata('relation_sets', tuple, {u'minLength': 1})
    FieldMetadata.RIGHTS_SETS = FieldMetadata('rights_sets', tuple, {u'minLength': 1})
    FieldMetadata.SUBJECT_SETS = FieldMetadata('subject_sets', tuple, {u'minLength': 1})
    FieldMetadata.TECHNIQUE_SETS = FieldMetadata('technique_sets', tuple, {u'minLength': 1})
    FieldMetadata.TEXTREF_SETS = FieldMetadata('textref_sets', tuple, {u'minLength': 1})
    FieldMetadata.TITLE_SETS = FieldMetadata('title_sets', tuple, {u'minLength': 1})
    FieldMetadata.WORK_TYPE_SETS = FieldMetadata('work_type_sets', tuple, {u'minLength': 1})

    def __init__(
        self,
        agent_sets=None,
        cultural_context_sets=None,
        date_sets=None,
        description_sets=None,
        inscription_sets=None,
        location_sets=None,
        material_sets=None,
        measurements_sets=None,
        relation_sets=None,
        rights_sets=None,
        subject_sets=None,
        technique_sets=None,
        textref_sets=None,
        title_sets=None,
        work_type_sets=None,
    ):
        '''
        :type agent_sets: tuple(dressdiscover.api.vocabularies.vra_core.agent.agent_set.AgentSet) or None
        :type cultural_context_sets: tuple(dressdiscover.api.vocabularies.vra_core.cultural_context.cultural_context_set.CulturalContextSet) or None
        :type date_sets: tuple(dressdiscover.api.vocabularies.vra_core.date.date_set.DateSet) or None
        :type description_sets: tuple(dressdiscover.api.vocabularies.vra_core.description.description_set.DescriptionSet) or None
        :type inscription_sets: tuple(dressdiscover.api.vocabularies.vra_core.inscription.inscription_set.InscriptionSet) or None
        :type location_sets: tuple(dressdiscover.api.vocabularies.vra_core.location.location_set.LocationSet) or None
        :type material_sets: tuple(dressdiscover.api.vocabularies.vra_core.material.material_set.MaterialSet) or None
        :type measurements_sets: tuple(dressdiscover.api.vocabularies.vra_core.measurements.measurements_set.MeasurementsSet) or None
        :type relation_sets: tuple(dressdiscover.api.vocabularies.vra_core.relation.relation_set.RelationSet) or None
        :type rights_sets: tuple(dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet) or None
        :type subject_sets: tuple(dressdiscover.api.vocabularies.vra_core.subject.subject_set.SubjectSet) or None
        :type technique_sets: tuple(dressdiscover.api.vocabularies.vra_core.technique.technique_set.TechniqueSet) or None
        :type textref_sets: tuple(dressdiscover.api.vocabularies.vra_core.textref.textref_set.TextrefSet) or None
        :type title_sets: tuple(dressdiscover.api.vocabularies.vra_core.title.title_set.TitleSet) or None
        :type work_type_sets: tuple(dressdiscover.api.vocabularies.vra_core.work_type.work_type_set.WorkTypeSet) or None
        '''

        if agent_sets is not None:
            if not (isinstance(agent_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.agent.agent_set.AgentSet), agent_sets))) == 0):
                raise TypeError("expected agent_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.agent.agent_set.AgentSet) but it is a %s" % getattr(__builtin__, 'type')(agent_sets))
            if len(agent_sets) < 1:
                raise ValueError("expected len(agent_sets) to be >= 1, was %d" % len(agent_sets))
        self.__agent_sets = agent_sets

        if cultural_context_sets is not None:
            if not (isinstance(cultural_context_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.cultural_context.cultural_context_set.CulturalContextSet), cultural_context_sets))) == 0):
                raise TypeError("expected cultural_context_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.cultural_context.cultural_context_set.CulturalContextSet) but it is a %s" % getattr(__builtin__, 'type')(cultural_context_sets))
            if len(cultural_context_sets) < 1:
                raise ValueError("expected len(cultural_context_sets) to be >= 1, was %d" % len(cultural_context_sets))
        self.__cultural_context_sets = cultural_context_sets

        if date_sets is not None:
            if not (isinstance(date_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.date.date_set.DateSet), date_sets))) == 0):
                raise TypeError("expected date_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.date.date_set.DateSet) but it is a %s" % getattr(__builtin__, 'type')(date_sets))
            if len(date_sets) < 1:
                raise ValueError("expected len(date_sets) to be >= 1, was %d" % len(date_sets))
        self.__date_sets = date_sets

        if description_sets is not None:
            if not (isinstance(description_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.description.description_set.DescriptionSet), description_sets))) == 0):
                raise TypeError("expected description_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.description.description_set.DescriptionSet) but it is a %s" % getattr(__builtin__, 'type')(description_sets))
            if len(description_sets) < 1:
                raise ValueError("expected len(description_sets) to be >= 1, was %d" % len(description_sets))
        self.__description_sets = description_sets

        if inscription_sets is not None:
            if not (isinstance(inscription_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.inscription.inscription_set.InscriptionSet), inscription_sets))) == 0):
                raise TypeError("expected inscription_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.inscription.inscription_set.InscriptionSet) but it is a %s" % getattr(__builtin__, 'type')(inscription_sets))
            if len(inscription_sets) < 1:
                raise ValueError("expected len(inscription_sets) to be >= 1, was %d" % len(inscription_sets))
        self.__inscription_sets = inscription_sets

        if location_sets is not None:
            if not (isinstance(location_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.location.location_set.LocationSet), location_sets))) == 0):
                raise TypeError("expected location_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.location.location_set.LocationSet) but it is a %s" % getattr(__builtin__, 'type')(location_sets))
            if len(location_sets) < 1:
                raise ValueError("expected len(location_sets) to be >= 1, was %d" % len(location_sets))
        self.__location_sets = location_sets

        if material_sets is not None:
            if not (isinstance(material_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.material.material_set.MaterialSet), material_sets))) == 0):
                raise TypeError("expected material_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.material.material_set.MaterialSet) but it is a %s" % getattr(__builtin__, 'type')(material_sets))
            if len(material_sets) < 1:
                raise ValueError("expected len(material_sets) to be >= 1, was %d" % len(material_sets))
        self.__material_sets = material_sets

        if measurements_sets is not None:
            if not (isinstance(measurements_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.measurements.measurements_set.MeasurementsSet), measurements_sets))) == 0):
                raise TypeError("expected measurements_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.measurements.measurements_set.MeasurementsSet) but it is a %s" % getattr(__builtin__, 'type')(measurements_sets))
            if len(measurements_sets) < 1:
                raise ValueError("expected len(measurements_sets) to be >= 1, was %d" % len(measurements_sets))
        self.__measurements_sets = measurements_sets

        if relation_sets is not None:
            if not (isinstance(relation_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.relation.relation_set.RelationSet), relation_sets))) == 0):
                raise TypeError("expected relation_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.relation.relation_set.RelationSet) but it is a %s" % getattr(__builtin__, 'type')(relation_sets))
            if len(relation_sets) < 1:
                raise ValueError("expected len(relation_sets) to be >= 1, was %d" % len(relation_sets))
        self.__relation_sets = relation_sets

        if rights_sets is not None:
            if not (isinstance(rights_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet), rights_sets))) == 0):
                raise TypeError("expected rights_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet) but it is a %s" % getattr(__builtin__, 'type')(rights_sets))
            if len(rights_sets) < 1:
                raise ValueError("expected len(rights_sets) to be >= 1, was %d" % len(rights_sets))
        self.__rights_sets = rights_sets

        if subject_sets is not None:
            if not (isinstance(subject_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.subject.subject_set.SubjectSet), subject_sets))) == 0):
                raise TypeError("expected subject_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.subject.subject_set.SubjectSet) but it is a %s" % getattr(__builtin__, 'type')(subject_sets))
            if len(subject_sets) < 1:
                raise ValueError("expected len(subject_sets) to be >= 1, was %d" % len(subject_sets))
        self.__subject_sets = subject_sets

        if technique_sets is not None:
            if not (isinstance(technique_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.technique.technique_set.TechniqueSet), technique_sets))) == 0):
                raise TypeError("expected technique_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.technique.technique_set.TechniqueSet) but it is a %s" % getattr(__builtin__, 'type')(technique_sets))
            if len(technique_sets) < 1:
                raise ValueError("expected len(technique_sets) to be >= 1, was %d" % len(technique_sets))
        self.__technique_sets = technique_sets

        if textref_sets is not None:
            if not (isinstance(textref_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.textref.textref_set.TextrefSet), textref_sets))) == 0):
                raise TypeError("expected textref_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.textref.textref_set.TextrefSet) but it is a %s" % getattr(__builtin__, 'type')(textref_sets))
            if len(textref_sets) < 1:
                raise ValueError("expected len(textref_sets) to be >= 1, was %d" % len(textref_sets))
        self.__textref_sets = textref_sets

        if title_sets is not None:
            if not (isinstance(title_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.title.title_set.TitleSet), title_sets))) == 0):
                raise TypeError("expected title_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.title.title_set.TitleSet) but it is a %s" % getattr(__builtin__, 'type')(title_sets))
            if len(title_sets) < 1:
                raise ValueError("expected len(title_sets) to be >= 1, was %d" % len(title_sets))
        self.__title_sets = title_sets

        if work_type_sets is not None:
            if not (isinstance(work_type_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.work_type.work_type_set.WorkTypeSet), work_type_sets))) == 0):
                raise TypeError("expected work_type_sets to be a tuple(dressdiscover.api.vocabularies.vra_core.work_type.work_type_set.WorkTypeSet) but it is a %s" % getattr(__builtin__, 'type')(work_type_sets))
            if len(work_type_sets) < 1:
                raise ValueError("expected len(work_type_sets) to be >= 1, was %d" % len(work_type_sets))
        self.__work_type_sets = work_type_sets

    def __eq__(self, other):
        if self.agent_sets != other.agent_sets:
            return False
        if self.cultural_context_sets != other.cultural_context_sets:
            return False
        if self.date_sets != other.date_sets:
            return False
        if self.description_sets != other.description_sets:
            return False
        if self.inscription_sets != other.inscription_sets:
            return False
        if self.location_sets != other.location_sets:
            return False
        if self.material_sets != other.material_sets:
            return False
        if self.measurements_sets != other.measurements_sets:
            return False
        if self.relation_sets != other.relation_sets:
            return False
        if self.rights_sets != other.rights_sets:
            return False
        if self.subject_sets != other.subject_sets:
            return False
        if self.technique_sets != other.technique_sets:
            return False
        if self.textref_sets != other.textref_sets:
            return False
        if self.title_sets != other.title_sets:
            return False
        if self.work_type_sets != other.work_type_sets:
            return False
        return True

    def __hash__(self):
        return hash((self.agent_sets,self.cultural_context_sets,self.date_sets,self.description_sets,self.inscription_sets,self.location_sets,self.material_sets,self.measurements_sets,self.relation_sets,self.rights_sets,self.subject_sets,self.technique_sets,self.textref_sets,self.title_sets,self.work_type_sets,))

    def __iter__(self):
        return iter((self.agent_sets, self.cultural_context_sets, self.date_sets, self.description_sets, self.inscription_sets, self.location_sets, self.material_sets, self.measurements_sets, self.relation_sets, self.rights_sets, self.subject_sets, self.technique_sets, self.textref_sets, self.title_sets, self.work_type_sets,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.agent_sets is not None:
            field_reprs.append('agent_sets=' + repr(self.agent_sets))
        if self.cultural_context_sets is not None:
            field_reprs.append('cultural_context_sets=' + repr(self.cultural_context_sets))
        if self.date_sets is not None:
            field_reprs.append('date_sets=' + repr(self.date_sets))
        if self.description_sets is not None:
            field_reprs.append('description_sets=' + repr(self.description_sets))
        if self.inscription_sets is not None:
            field_reprs.append('inscription_sets=' + repr(self.inscription_sets))
        if self.location_sets is not None:
            field_reprs.append('location_sets=' + repr(self.location_sets))
        if self.material_sets is not None:
            field_reprs.append('material_sets=' + repr(self.material_sets))
        if self.measurements_sets is not None:
            field_reprs.append('measurements_sets=' + repr(self.measurements_sets))
        if self.relation_sets is not None:
            field_reprs.append('relation_sets=' + repr(self.relation_sets))
        if self.rights_sets is not None:
            field_reprs.append('rights_sets=' + repr(self.rights_sets))
        if self.subject_sets is not None:
            field_reprs.append('subject_sets=' + repr(self.subject_sets))
        if self.technique_sets is not None:
            field_reprs.append('technique_sets=' + repr(self.technique_sets))
        if self.textref_sets is not None:
            field_reprs.append('textref_sets=' + repr(self.textref_sets))
        if self.title_sets is not None:
            field_reprs.append('title_sets=' + repr(self.title_sets))
        if self.work_type_sets is not None:
            field_reprs.append('work_type_sets=' + repr(self.work_type_sets))
        return 'VraCoreObject(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.agent_sets is not None:
            field_reprs.append('agent_sets=' + repr(self.agent_sets))
        if self.cultural_context_sets is not None:
            field_reprs.append('cultural_context_sets=' + repr(self.cultural_context_sets))
        if self.date_sets is not None:
            field_reprs.append('date_sets=' + repr(self.date_sets))
        if self.description_sets is not None:
            field_reprs.append('description_sets=' + repr(self.description_sets))
        if self.inscription_sets is not None:
            field_reprs.append('inscription_sets=' + repr(self.inscription_sets))
        if self.location_sets is not None:
            field_reprs.append('location_sets=' + repr(self.location_sets))
        if self.material_sets is not None:
            field_reprs.append('material_sets=' + repr(self.material_sets))
        if self.measurements_sets is not None:
            field_reprs.append('measurements_sets=' + repr(self.measurements_sets))
        if self.relation_sets is not None:
            field_reprs.append('relation_sets=' + repr(self.relation_sets))
        if self.rights_sets is not None:
            field_reprs.append('rights_sets=' + repr(self.rights_sets))
        if self.subject_sets is not None:
            field_reprs.append('subject_sets=' + repr(self.subject_sets))
        if self.technique_sets is not None:
            field_reprs.append('technique_sets=' + repr(self.technique_sets))
        if self.textref_sets is not None:
            field_reprs.append('textref_sets=' + repr(self.textref_sets))
        if self.title_sets is not None:
            field_reprs.append('title_sets=' + repr(self.title_sets))
        if self.work_type_sets is not None:
            field_reprs.append('work_type_sets=' + repr(self.work_type_sets))
        return 'VraCoreObject(' + ', '.join(field_reprs) + ')'

    @property
    def agent_sets(self):
        '''
        :rtype: tuple(dressdiscover.api.vocabularies.vra_core.agent.agent_set.AgentSet)
        '''

        return self.__agent_sets

    @property
    def cultural_context_sets(self):
        '''
        :rtype: tuple(dressdiscover.api.vocabularies.vra_core.cultural_context.cultural_context_set.CulturalContextSet)
        '''

        return self.__cultural_context_sets

    @property
    def date_sets(self):
        '''
        :rtype: tuple(dressdiscover.api.vocabularies.vra_core.date.date_set.DateSet)
        '''

        return self.__date_sets

    @property
    def description_sets(self):
        '''
        :rtype: tuple(dressdiscover.api.vocabularies.vra_core.description.description_set.DescriptionSet)
        '''

        return self.__description_sets

    @property
    def inscription_sets(self):
        '''
        :rtype: tuple(dressdiscover.api.vocabularies.vra_core.inscription.inscription_set.InscriptionSet)
        '''

        return self.__inscription_sets

    @property
    def location_sets(self):
        '''
        :rtype: tuple(dressdiscover.api.vocabularies.vra_core.location.location_set.LocationSet)
        '''

        return self.__location_sets

    @property
    def material_sets(self):
        '''
        :rtype: tuple(dressdiscover.api.vocabularies.vra_core.material.material_set.MaterialSet)
        '''

        return self.__material_sets

    @property
    def measurements_sets(self):
        '''
        :rtype: tuple(dressdiscover.api.vocabularies.vra_core.measurements.measurements_set.MeasurementsSet)
        '''

        return self.__measurements_sets

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.vocabularies.vra_core.vra_core_object.VraCoreObject
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'agent_sets' and ifield_id == 1:
                init_kwds['agent_sets'] = tuple([dressdiscover.api.vocabularies.vra_core.agent.agent_set.AgentSet.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'cultural_context_sets' and ifield_id == 2:
                init_kwds['cultural_context_sets'] = tuple([dressdiscover.api.vocabularies.vra_core.cultural_context.cultural_context_set.CulturalContextSet.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'date_sets' and ifield_id == 3:
                init_kwds['date_sets'] = tuple([dressdiscover.api.vocabularies.vra_core.date.date_set.DateSet.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'description_sets' and ifield_id == 4:
                init_kwds['description_sets'] = tuple([dressdiscover.api.vocabularies.vra_core.description.description_set.DescriptionSet.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'inscription_sets' and ifield_id == 5:
                init_kwds['inscription_sets'] = tuple([dressdiscover.api.vocabularies.vra_core.inscription.inscription_set.InscriptionSet.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'location_sets' and ifield_id == 6:
                init_kwds['location_sets'] = tuple([dressdiscover.api.vocabularies.vra_core.location.location_set.LocationSet.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'material_sets' and ifield_id == 7:
                init_kwds['material_sets'] = tuple([dressdiscover.api.vocabularies.vra_core.material.material_set.MaterialSet.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'measurements_sets' and ifield_id == 8:
                init_kwds['measurements_sets'] = tuple([dressdiscover.api.vocabularies.vra_core.measurements.measurements_set.MeasurementsSet.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'relation_sets' and ifield_id == 9:
                init_kwds['relation_sets'] = tuple([dressdiscover.api.vocabularies.vra_core.relation.relation_set.RelationSet.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'rights_sets' and ifield_id == 10:
                init_kwds['rights_sets'] = tuple([dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'subject_sets' and ifield_id == 11:
                init_kwds['subject_sets'] = tuple([dressdiscover.api.vocabularies.vra_core.subject.subject_set.SubjectSet.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'technique_sets' and ifield_id == 12:
                init_kwds['technique_sets'] = tuple([dressdiscover.api.vocabularies.vra_core.technique.technique_set.TechniqueSet.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'textref_sets' and ifield_id == 13:
                init_kwds['textref_sets'] = tuple([dressdiscover.api.vocabularies.vra_core.textref.textref_set.TextrefSet.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'title_sets' and ifield_id == 14:
                init_kwds['title_sets'] = tuple([dressdiscover.api.vocabularies.vra_core.title.title_set.TitleSet.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'work_type_sets' and ifield_id == 15:
                init_kwds['work_type_sets'] = tuple([dressdiscover.api.vocabularies.vra_core.work_type.work_type_set.WorkTypeSet.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    @property
    def relation_sets(self):
        '''
        :rtype: tuple(dressdiscover.api.vocabularies.vra_core.relation.relation_set.RelationSet)
        '''

        return self.__relation_sets

    def replace(
        self,
        agent_sets=None,
        cultural_context_sets=None,
        date_sets=None,
        description_sets=None,
        inscription_sets=None,
        location_sets=None,
        material_sets=None,
        measurements_sets=None,
        relation_sets=None,
        rights_sets=None,
        subject_sets=None,
        technique_sets=None,
        textref_sets=None,
        title_sets=None,
        work_type_sets=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type agent_sets: tuple(dressdiscover.api.vocabularies.vra_core.agent.agent_set.AgentSet) or None
        :type cultural_context_sets: tuple(dressdiscover.api.vocabularies.vra_core.cultural_context.cultural_context_set.CulturalContextSet) or None
        :type date_sets: tuple(dressdiscover.api.vocabularies.vra_core.date.date_set.DateSet) or None
        :type description_sets: tuple(dressdiscover.api.vocabularies.vra_core.description.description_set.DescriptionSet) or None
        :type inscription_sets: tuple(dressdiscover.api.vocabularies.vra_core.inscription.inscription_set.InscriptionSet) or None
        :type location_sets: tuple(dressdiscover.api.vocabularies.vra_core.location.location_set.LocationSet) or None
        :type material_sets: tuple(dressdiscover.api.vocabularies.vra_core.material.material_set.MaterialSet) or None
        :type measurements_sets: tuple(dressdiscover.api.vocabularies.vra_core.measurements.measurements_set.MeasurementsSet) or None
        :type relation_sets: tuple(dressdiscover.api.vocabularies.vra_core.relation.relation_set.RelationSet) or None
        :type rights_sets: tuple(dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet) or None
        :type subject_sets: tuple(dressdiscover.api.vocabularies.vra_core.subject.subject_set.SubjectSet) or None
        :type technique_sets: tuple(dressdiscover.api.vocabularies.vra_core.technique.technique_set.TechniqueSet) or None
        :type textref_sets: tuple(dressdiscover.api.vocabularies.vra_core.textref.textref_set.TextrefSet) or None
        :type title_sets: tuple(dressdiscover.api.vocabularies.vra_core.title.title_set.TitleSet) or None
        :type work_type_sets: tuple(dressdiscover.api.vocabularies.vra_core.work_type.work_type_set.WorkTypeSet) or None
        :rtype: dressdiscover.api.vocabularies.vra_core.vra_core_object.VraCoreObject
        '''

        if agent_sets is None:
            agent_sets = self.agent_sets
        if cultural_context_sets is None:
            cultural_context_sets = self.cultural_context_sets
        if date_sets is None:
            date_sets = self.date_sets
        if description_sets is None:
            description_sets = self.description_sets
        if inscription_sets is None:
            inscription_sets = self.inscription_sets
        if location_sets is None:
            location_sets = self.location_sets
        if material_sets is None:
            material_sets = self.material_sets
        if measurements_sets is None:
            measurements_sets = self.measurements_sets
        if relation_sets is None:
            relation_sets = self.relation_sets
        if rights_sets is None:
            rights_sets = self.rights_sets
        if subject_sets is None:
            subject_sets = self.subject_sets
        if technique_sets is None:
            technique_sets = self.technique_sets
        if textref_sets is None:
            textref_sets = self.textref_sets
        if title_sets is None:
            title_sets = self.title_sets
        if work_type_sets is None:
            work_type_sets = self.work_type_sets
        return self.__class__(agent_sets=agent_sets, cultural_context_sets=cultural_context_sets, date_sets=date_sets, description_sets=description_sets, inscription_sets=inscription_sets, location_sets=location_sets, material_sets=material_sets, measurements_sets=measurements_sets, relation_sets=relation_sets, rights_sets=rights_sets, subject_sets=subject_sets, technique_sets=technique_sets, textref_sets=textref_sets, title_sets=title_sets, work_type_sets=work_type_sets)

    @property
    def rights_sets(self):
        '''
        :rtype: tuple(dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet)
        '''

        return self.__rights_sets

    @property
    def subject_sets(self):
        '''
        :rtype: tuple(dressdiscover.api.vocabularies.vra_core.subject.subject_set.SubjectSet)
        '''

        return self.__subject_sets

    @property
    def technique_sets(self):
        '''
        :rtype: tuple(dressdiscover.api.vocabularies.vra_core.technique.technique_set.TechniqueSet)
        '''

        return self.__technique_sets

    @property
    def textref_sets(self):
        '''
        :rtype: tuple(dressdiscover.api.vocabularies.vra_core.textref.textref_set.TextrefSet)
        '''

        return self.__textref_sets

    @property
    def title_sets(self):
        '''
        :rtype: tuple(dressdiscover.api.vocabularies.vra_core.title.title_set.TitleSet)
        '''

        return self.__title_sets

    @property
    def work_type_sets(self):
        '''
        :rtype: tuple(dressdiscover.api.vocabularies.vra_core.work_type.work_type_set.WorkTypeSet)
        '''

        return self.__work_type_sets

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.vocabularies.vra_core.vra_core_object.VraCoreObject
        '''

        oprot.write_struct_begin('VraCoreObject')

        if self.agent_sets is not None:
            oprot.write_field_begin(name='agent_sets', type=15, id=1)
            oprot.write_list_begin(12, len(self.agent_sets))
            for _0 in self.agent_sets:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.cultural_context_sets is not None:
            oprot.write_field_begin(name='cultural_context_sets', type=15, id=2)
            oprot.write_list_begin(12, len(self.cultural_context_sets))
            for _0 in self.cultural_context_sets:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.date_sets is not None:
            oprot.write_field_begin(name='date_sets', type=15, id=3)
            oprot.write_list_begin(12, len(self.date_sets))
            for _0 in self.date_sets:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.description_sets is not None:
            oprot.write_field_begin(name='description_sets', type=15, id=4)
            oprot.write_list_begin(12, len(self.description_sets))
            for _0 in self.description_sets:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.inscription_sets is not None:
            oprot.write_field_begin(name='inscription_sets', type=15, id=5)
            oprot.write_list_begin(12, len(self.inscription_sets))
            for _0 in self.inscription_sets:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.location_sets is not None:
            oprot.write_field_begin(name='location_sets', type=15, id=6)
            oprot.write_list_begin(12, len(self.location_sets))
            for _0 in self.location_sets:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.material_sets is not None:
            oprot.write_field_begin(name='material_sets', type=15, id=7)
            oprot.write_list_begin(12, len(self.material_sets))
            for _0 in self.material_sets:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.measurements_sets is not None:
            oprot.write_field_begin(name='measurements_sets', type=15, id=8)
            oprot.write_list_begin(12, len(self.measurements_sets))
            for _0 in self.measurements_sets:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.relation_sets is not None:
            oprot.write_field_begin(name='relation_sets', type=15, id=9)
            oprot.write_list_begin(12, len(self.relation_sets))
            for _0 in self.relation_sets:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.rights_sets is not None:
            oprot.write_field_begin(name='rights_sets', type=15, id=10)
            oprot.write_list_begin(12, len(self.rights_sets))
            for _0 in self.rights_sets:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.subject_sets is not None:
            oprot.write_field_begin(name='subject_sets', type=15, id=11)
            oprot.write_list_begin(12, len(self.subject_sets))
            for _0 in self.subject_sets:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.technique_sets is not None:
            oprot.write_field_begin(name='technique_sets', type=15, id=12)
            oprot.write_list_begin(12, len(self.technique_sets))
            for _0 in self.technique_sets:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.textref_sets is not None:
            oprot.write_field_begin(name='textref_sets', type=15, id=13)
            oprot.write_list_begin(12, len(self.textref_sets))
            for _0 in self.textref_sets:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.title_sets is not None:
            oprot.write_field_begin(name='title_sets', type=15, id=14)
            oprot.write_list_begin(12, len(self.title_sets))
            for _0 in self.title_sets:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.work_type_sets is not None:
            oprot.write_field_begin(name='work_type_sets', type=15, id=15)
            oprot.write_list_begin(12, len(self.work_type_sets))
            for _0 in self.work_type_sets:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
