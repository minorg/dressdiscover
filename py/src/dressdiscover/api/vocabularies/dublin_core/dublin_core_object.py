from itertools import ifilterfalse
import __builtin__


class DublinCoreObject(object):
    class Builder(object):
        def __init__(
            self,
            abstracts=None,
            audiences=None,
            contributors=None,
            coverages=None,
            createds=None,
            creators=None,
            dates=None,
            descriptions=None,
            extents=None,
            formats=None,
            identifiers=None,
            languages=None,
            mediums=None,
            provenances=None,
            publishers=None,
            relations=None,
            rights=None,
            rights_holders=None,
            sources=None,
            spatials=None,
            subjects=None,
            temporals=None,
            titles=None,
            types=None,
        ):
            '''
            :type abstracts: tuple(str) or None
            :type audiences: tuple(str) or None
            :type contributors: tuple(str) or None
            :type coverages: tuple(str) or None
            :type createds: tuple(str) or None
            :type creators: tuple(str) or None
            :type dates: tuple(str) or None
            :type descriptions: tuple(str) or None
            :type extents: tuple(str) or None
            :type formats: tuple(str) or None
            :type identifiers: tuple(str) or None
            :type languages: tuple(str) or None
            :type mediums: tuple(str) or None
            :type provenances: tuple(str) or None
            :type publishers: tuple(str) or None
            :type relations: tuple(str) or None
            :type rights: tuple(str) or None
            :type rights_holders: tuple(str) or None
            :type sources: tuple(str) or None
            :type spatials: tuple(str) or None
            :type subjects: tuple(str) or None
            :type temporals: tuple(str) or None
            :type titles: tuple(str) or None
            :type types: tuple(str) or None
            '''

            self.__abstracts = abstracts
            self.__audiences = audiences
            self.__contributors = contributors
            self.__coverages = coverages
            self.__createds = createds
            self.__creators = creators
            self.__dates = dates
            self.__descriptions = descriptions
            self.__extents = extents
            self.__formats = formats
            self.__identifiers = identifiers
            self.__languages = languages
            self.__mediums = mediums
            self.__provenances = provenances
            self.__publishers = publishers
            self.__relations = relations
            self.__rights = rights
            self.__rights_holders = rights_holders
            self.__sources = sources
            self.__spatials = spatials
            self.__subjects = subjects
            self.__temporals = temporals
            self.__titles = titles
            self.__types = types

        def build(self):
            return DublinCoreObject(abstracts=self.__abstracts, audiences=self.__audiences, contributors=self.__contributors, coverages=self.__coverages, createds=self.__createds, creators=self.__creators, dates=self.__dates, descriptions=self.__descriptions, extents=self.__extents, formats=self.__formats, identifiers=self.__identifiers, languages=self.__languages, mediums=self.__mediums, provenances=self.__provenances, publishers=self.__publishers, relations=self.__relations, rights=self.__rights, rights_holders=self.__rights_holders, sources=self.__sources, spatials=self.__spatials, subjects=self.__subjects, temporals=self.__temporals, titles=self.__titles, types=self.__types)

        @property
        def abstracts(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__abstracts

        @property
        def audiences(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__audiences

        @property
        def contributors(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__contributors

        @property
        def coverages(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__coverages

        @property
        def createds(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__createds

        @property
        def creators(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__creators

        @property
        def dates(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__dates

        @property
        def descriptions(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__descriptions

        @property
        def extents(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__extents

        @property
        def formats(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__formats

        @property
        def identifiers(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__identifiers

        @property
        def languages(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__languages

        @property
        def mediums(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__mediums

        @property
        def provenances(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__provenances

        @property
        def publishers(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__publishers

        @property
        def relations(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__relations

        @property
        def rights(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__rights

        @property
        def rights_holders(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__rights_holders

        def set_abstracts(self, abstracts):
            '''
            :type abstracts: tuple(str) or None
            '''

            if abstracts is not None:
                if not (isinstance(abstracts, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), abstracts))) == 0):
                    raise TypeError("expected abstracts to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(abstracts))
                if len(abstracts) < 1:
                    raise ValueError("expected len(abstracts) to be >= 1, was %d" % len(abstracts))
            self.__abstracts = abstracts
            return self

        def set_audiences(self, audiences):
            '''
            :type audiences: tuple(str) or None
            '''

            if audiences is not None:
                if not (isinstance(audiences, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), audiences))) == 0):
                    raise TypeError("expected audiences to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(audiences))
                if len(audiences) < 1:
                    raise ValueError("expected len(audiences) to be >= 1, was %d" % len(audiences))
            self.__audiences = audiences
            return self

        def set_contributors(self, contributors):
            '''
            :type contributors: tuple(str) or None
            '''

            if contributors is not None:
                if not (isinstance(contributors, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), contributors))) == 0):
                    raise TypeError("expected contributors to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(contributors))
                if len(contributors) < 1:
                    raise ValueError("expected len(contributors) to be >= 1, was %d" % len(contributors))
            self.__contributors = contributors
            return self

        def set_coverages(self, coverages):
            '''
            :type coverages: tuple(str) or None
            '''

            if coverages is not None:
                if not (isinstance(coverages, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), coverages))) == 0):
                    raise TypeError("expected coverages to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(coverages))
                if len(coverages) < 1:
                    raise ValueError("expected len(coverages) to be >= 1, was %d" % len(coverages))
            self.__coverages = coverages
            return self

        def set_createds(self, createds):
            '''
            :type createds: tuple(str) or None
            '''

            if createds is not None:
                if not (isinstance(createds, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), createds))) == 0):
                    raise TypeError("expected createds to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(createds))
                if len(createds) < 1:
                    raise ValueError("expected len(createds) to be >= 1, was %d" % len(createds))
            self.__createds = createds
            return self

        def set_creators(self, creators):
            '''
            :type creators: tuple(str) or None
            '''

            if creators is not None:
                if not (isinstance(creators, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), creators))) == 0):
                    raise TypeError("expected creators to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(creators))
                if len(creators) < 1:
                    raise ValueError("expected len(creators) to be >= 1, was %d" % len(creators))
            self.__creators = creators
            return self

        def set_dates(self, dates):
            '''
            :type dates: tuple(str) or None
            '''

            if dates is not None:
                if not (isinstance(dates, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), dates))) == 0):
                    raise TypeError("expected dates to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(dates))
                if len(dates) < 1:
                    raise ValueError("expected len(dates) to be >= 1, was %d" % len(dates))
            self.__dates = dates
            return self

        def set_descriptions(self, descriptions):
            '''
            :type descriptions: tuple(str) or None
            '''

            if descriptions is not None:
                if not (isinstance(descriptions, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), descriptions))) == 0):
                    raise TypeError("expected descriptions to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(descriptions))
                if len(descriptions) < 1:
                    raise ValueError("expected len(descriptions) to be >= 1, was %d" % len(descriptions))
            self.__descriptions = descriptions
            return self

        def set_extents(self, extents):
            '''
            :type extents: tuple(str) or None
            '''

            if extents is not None:
                if not (isinstance(extents, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), extents))) == 0):
                    raise TypeError("expected extents to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(extents))
                if len(extents) < 1:
                    raise ValueError("expected len(extents) to be >= 1, was %d" % len(extents))
            self.__extents = extents
            return self

        def set_formats(self, formats):
            '''
            :type formats: tuple(str) or None
            '''

            if formats is not None:
                if not (isinstance(formats, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), formats))) == 0):
                    raise TypeError("expected formats to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(formats))
                if len(formats) < 1:
                    raise ValueError("expected len(formats) to be >= 1, was %d" % len(formats))
            self.__formats = formats
            return self

        def set_identifiers(self, identifiers):
            '''
            :type identifiers: tuple(str) or None
            '''

            if identifiers is not None:
                if not (isinstance(identifiers, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), identifiers))) == 0):
                    raise TypeError("expected identifiers to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(identifiers))
                if len(identifiers) < 1:
                    raise ValueError("expected len(identifiers) to be >= 1, was %d" % len(identifiers))
            self.__identifiers = identifiers
            return self

        def set_languages(self, languages):
            '''
            :type languages: tuple(str) or None
            '''

            if languages is not None:
                if not (isinstance(languages, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), languages))) == 0):
                    raise TypeError("expected languages to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(languages))
                if len(languages) < 1:
                    raise ValueError("expected len(languages) to be >= 1, was %d" % len(languages))
            self.__languages = languages
            return self

        def set_mediums(self, mediums):
            '''
            :type mediums: tuple(str) or None
            '''

            if mediums is not None:
                if not (isinstance(mediums, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), mediums))) == 0):
                    raise TypeError("expected mediums to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(mediums))
                if len(mediums) < 1:
                    raise ValueError("expected len(mediums) to be >= 1, was %d" % len(mediums))
            self.__mediums = mediums
            return self

        def set_provenances(self, provenances):
            '''
            :type provenances: tuple(str) or None
            '''

            if provenances is not None:
                if not (isinstance(provenances, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), provenances))) == 0):
                    raise TypeError("expected provenances to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(provenances))
                if len(provenances) < 1:
                    raise ValueError("expected len(provenances) to be >= 1, was %d" % len(provenances))
            self.__provenances = provenances
            return self

        def set_publishers(self, publishers):
            '''
            :type publishers: tuple(str) or None
            '''

            if publishers is not None:
                if not (isinstance(publishers, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), publishers))) == 0):
                    raise TypeError("expected publishers to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(publishers))
                if len(publishers) < 1:
                    raise ValueError("expected len(publishers) to be >= 1, was %d" % len(publishers))
            self.__publishers = publishers
            return self

        def set_relations(self, relations):
            '''
            :type relations: tuple(str) or None
            '''

            if relations is not None:
                if not (isinstance(relations, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), relations))) == 0):
                    raise TypeError("expected relations to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(relations))
                if len(relations) < 1:
                    raise ValueError("expected len(relations) to be >= 1, was %d" % len(relations))
            self.__relations = relations
            return self

        def set_rights(self, rights):
            '''
            :type rights: tuple(str) or None
            '''

            if rights is not None:
                if not (isinstance(rights, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), rights))) == 0):
                    raise TypeError("expected rights to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(rights))
                if len(rights) < 1:
                    raise ValueError("expected len(rights) to be >= 1, was %d" % len(rights))
            self.__rights = rights
            return self

        def set_rights_holders(self, rights_holders):
            '''
            :type rights_holders: tuple(str) or None
            '''

            if rights_holders is not None:
                if not (isinstance(rights_holders, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), rights_holders))) == 0):
                    raise TypeError("expected rights_holders to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(rights_holders))
                if len(rights_holders) < 1:
                    raise ValueError("expected len(rights_holders) to be >= 1, was %d" % len(rights_holders))
            self.__rights_holders = rights_holders
            return self

        def set_sources(self, sources):
            '''
            :type sources: tuple(str) or None
            '''

            if sources is not None:
                if not (isinstance(sources, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), sources))) == 0):
                    raise TypeError("expected sources to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(sources))
                if len(sources) < 1:
                    raise ValueError("expected len(sources) to be >= 1, was %d" % len(sources))
            self.__sources = sources
            return self

        def set_spatials(self, spatials):
            '''
            :type spatials: tuple(str) or None
            '''

            if spatials is not None:
                if not (isinstance(spatials, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), spatials))) == 0):
                    raise TypeError("expected spatials to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(spatials))
                if len(spatials) < 1:
                    raise ValueError("expected len(spatials) to be >= 1, was %d" % len(spatials))
            self.__spatials = spatials
            return self

        def set_subjects(self, subjects):
            '''
            :type subjects: tuple(str) or None
            '''

            if subjects is not None:
                if not (isinstance(subjects, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), subjects))) == 0):
                    raise TypeError("expected subjects to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(subjects))
                if len(subjects) < 1:
                    raise ValueError("expected len(subjects) to be >= 1, was %d" % len(subjects))
            self.__subjects = subjects
            return self

        def set_temporals(self, temporals):
            '''
            :type temporals: tuple(str) or None
            '''

            if temporals is not None:
                if not (isinstance(temporals, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), temporals))) == 0):
                    raise TypeError("expected temporals to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(temporals))
                if len(temporals) < 1:
                    raise ValueError("expected len(temporals) to be >= 1, was %d" % len(temporals))
            self.__temporals = temporals
            return self

        def set_titles(self, titles):
            '''
            :type titles: tuple(str) or None
            '''

            if titles is not None:
                if not (isinstance(titles, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), titles))) == 0):
                    raise TypeError("expected titles to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(titles))
                if len(titles) < 1:
                    raise ValueError("expected len(titles) to be >= 1, was %d" % len(titles))
            self.__titles = titles
            return self

        def set_types(self, types):
            '''
            :type types: tuple(str) or None
            '''

            if types is not None:
                if not (isinstance(types, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), types))) == 0):
                    raise TypeError("expected types to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(types))
                if len(types) < 1:
                    raise ValueError("expected len(types) to be >= 1, was %d" % len(types))
            self.__types = types
            return self

        @property
        def sources(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__sources

        @property
        def spatials(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__spatials

        @property
        def subjects(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__subjects

        @property
        def temporals(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__temporals

        @property
        def titles(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__titles

        @property
        def types(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__types

        def update(self, dublin_core_object):
            '''
            :type abstracts: tuple(str) or None
            :type audiences: tuple(str) or None
            :type contributors: tuple(str) or None
            :type coverages: tuple(str) or None
            :type createds: tuple(str) or None
            :type creators: tuple(str) or None
            :type dates: tuple(str) or None
            :type descriptions: tuple(str) or None
            :type extents: tuple(str) or None
            :type formats: tuple(str) or None
            :type identifiers: tuple(str) or None
            :type languages: tuple(str) or None
            :type mediums: tuple(str) or None
            :type provenances: tuple(str) or None
            :type publishers: tuple(str) or None
            :type relations: tuple(str) or None
            :type rights: tuple(str) or None
            :type rights_holders: tuple(str) or None
            :type sources: tuple(str) or None
            :type spatials: tuple(str) or None
            :type subjects: tuple(str) or None
            :type temporals: tuple(str) or None
            :type titles: tuple(str) or None
            :type types: tuple(str) or None
            '''

            if isinstance(dublin_core_object, DublinCoreObject):
                self.set_abstracts(dublin_core_object.abstracts)
                self.set_audiences(dublin_core_object.audiences)
                self.set_contributors(dublin_core_object.contributors)
                self.set_coverages(dublin_core_object.coverages)
                self.set_createds(dublin_core_object.createds)
                self.set_creators(dublin_core_object.creators)
                self.set_dates(dublin_core_object.dates)
                self.set_descriptions(dublin_core_object.descriptions)
                self.set_extents(dublin_core_object.extents)
                self.set_formats(dublin_core_object.formats)
                self.set_identifiers(dublin_core_object.identifiers)
                self.set_languages(dublin_core_object.languages)
                self.set_mediums(dublin_core_object.mediums)
                self.set_provenances(dublin_core_object.provenances)
                self.set_publishers(dublin_core_object.publishers)
                self.set_relations(dublin_core_object.relations)
                self.set_rights(dublin_core_object.rights)
                self.set_rights_holders(dublin_core_object.rights_holders)
                self.set_sources(dublin_core_object.sources)
                self.set_spatials(dublin_core_object.spatials)
                self.set_subjects(dublin_core_object.subjects)
                self.set_temporals(dublin_core_object.temporals)
                self.set_titles(dublin_core_object.titles)
                self.set_types(dublin_core_object.types)
            elif isinstance(dublin_core_object, dict):
                for key, value in dublin_core_object.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(dublin_core_object)
            return self

        @abstracts.setter
        def abstracts(self, abstracts):
            '''
            :type abstracts: tuple(str) or None
            '''

            self.set_abstracts(abstracts)

        @audiences.setter
        def audiences(self, audiences):
            '''
            :type audiences: tuple(str) or None
            '''

            self.set_audiences(audiences)

        @contributors.setter
        def contributors(self, contributors):
            '''
            :type contributors: tuple(str) or None
            '''

            self.set_contributors(contributors)

        @coverages.setter
        def coverages(self, coverages):
            '''
            :type coverages: tuple(str) or None
            '''

            self.set_coverages(coverages)

        @createds.setter
        def createds(self, createds):
            '''
            :type createds: tuple(str) or None
            '''

            self.set_createds(createds)

        @creators.setter
        def creators(self, creators):
            '''
            :type creators: tuple(str) or None
            '''

            self.set_creators(creators)

        @dates.setter
        def dates(self, dates):
            '''
            :type dates: tuple(str) or None
            '''

            self.set_dates(dates)

        @descriptions.setter
        def descriptions(self, descriptions):
            '''
            :type descriptions: tuple(str) or None
            '''

            self.set_descriptions(descriptions)

        @extents.setter
        def extents(self, extents):
            '''
            :type extents: tuple(str) or None
            '''

            self.set_extents(extents)

        @formats.setter
        def formats(self, formats):
            '''
            :type formats: tuple(str) or None
            '''

            self.set_formats(formats)

        @identifiers.setter
        def identifiers(self, identifiers):
            '''
            :type identifiers: tuple(str) or None
            '''

            self.set_identifiers(identifiers)

        @languages.setter
        def languages(self, languages):
            '''
            :type languages: tuple(str) or None
            '''

            self.set_languages(languages)

        @mediums.setter
        def mediums(self, mediums):
            '''
            :type mediums: tuple(str) or None
            '''

            self.set_mediums(mediums)

        @provenances.setter
        def provenances(self, provenances):
            '''
            :type provenances: tuple(str) or None
            '''

            self.set_provenances(provenances)

        @publishers.setter
        def publishers(self, publishers):
            '''
            :type publishers: tuple(str) or None
            '''

            self.set_publishers(publishers)

        @relations.setter
        def relations(self, relations):
            '''
            :type relations: tuple(str) or None
            '''

            self.set_relations(relations)

        @rights.setter
        def rights(self, rights):
            '''
            :type rights: tuple(str) or None
            '''

            self.set_rights(rights)

        @rights_holders.setter
        def rights_holders(self, rights_holders):
            '''
            :type rights_holders: tuple(str) or None
            '''

            self.set_rights_holders(rights_holders)

        @sources.setter
        def sources(self, sources):
            '''
            :type sources: tuple(str) or None
            '''

            self.set_sources(sources)

        @spatials.setter
        def spatials(self, spatials):
            '''
            :type spatials: tuple(str) or None
            '''

            self.set_spatials(spatials)

        @subjects.setter
        def subjects(self, subjects):
            '''
            :type subjects: tuple(str) or None
            '''

            self.set_subjects(subjects)

        @temporals.setter
        def temporals(self, temporals):
            '''
            :type temporals: tuple(str) or None
            '''

            self.set_temporals(temporals)

        @titles.setter
        def titles(self, titles):
            '''
            :type titles: tuple(str) or None
            '''

            self.set_titles(titles)

        @types.setter
        def types(self, types):
            '''
            :type types: tuple(str) or None
            '''

            self.set_types(types)

    class FieldMetadata(object):
        ABSTRACTS = None
        AUDIENCES = None
        CONTRIBUTORS = None
        COVERAGES = None
        CREATEDS = None
        CREATORS = None
        DATES = None
        DESCRIPTIONS = None
        EXTENTS = None
        FORMATS = None
        IDENTIFIERS = None
        LANGUAGES = None
        MEDIUMS = None
        PROVENANCES = None
        PUBLISHERS = None
        RELATIONS = None
        RIGHTS = None
        RIGHTS_HOLDERS = None
        SOURCES = None
        SPATIALS = None
        SUBJECTS = None
        TEMPORALS = None
        TITLES = None
        TYPES = None

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
            return (cls.ABSTRACTS, cls.AUDIENCES, cls.CONTRIBUTORS, cls.COVERAGES, cls.CREATEDS, cls.CREATORS, cls.DATES, cls.DESCRIPTIONS, cls.EXTENTS, cls.FORMATS, cls.IDENTIFIERS, cls.LANGUAGES, cls.MEDIUMS, cls.PROVENANCES, cls.PUBLISHERS, cls.RELATIONS, cls.RIGHTS, cls.RIGHTS_HOLDERS, cls.SOURCES, cls.SPATIALS, cls.SUBJECTS, cls.TEMPORALS, cls.TITLES, cls.TYPES,)

    FieldMetadata.ABSTRACTS = FieldMetadata('abstracts', tuple, {u'minLength': 1})
    FieldMetadata.AUDIENCES = FieldMetadata('audiences', tuple, {u'minLength': 1})
    FieldMetadata.CONTRIBUTORS = FieldMetadata('contributors', tuple, {u'minLength': 1})
    FieldMetadata.COVERAGES = FieldMetadata('coverages', tuple, {u'minLength': 1})
    FieldMetadata.CREATEDS = FieldMetadata('createds', tuple, {u'minLength': 1})
    FieldMetadata.CREATORS = FieldMetadata('creators', tuple, {u'minLength': 1})
    FieldMetadata.DATES = FieldMetadata('dates', tuple, {u'minLength': 1})
    FieldMetadata.DESCRIPTIONS = FieldMetadata('descriptions', tuple, {u'minLength': 1})
    FieldMetadata.EXTENTS = FieldMetadata('extents', tuple, {u'minLength': 1})
    FieldMetadata.FORMATS = FieldMetadata('formats', tuple, {u'minLength': 1})
    FieldMetadata.IDENTIFIERS = FieldMetadata('identifiers', tuple, {u'minLength': 1})
    FieldMetadata.LANGUAGES = FieldMetadata('languages', tuple, {u'minLength': 1})
    FieldMetadata.MEDIUMS = FieldMetadata('mediums', tuple, {u'minLength': 1})
    FieldMetadata.PROVENANCES = FieldMetadata('provenances', tuple, {u'minLength': 1})
    FieldMetadata.PUBLISHERS = FieldMetadata('publishers', tuple, {u'minLength': 1})
    FieldMetadata.RELATIONS = FieldMetadata('relations', tuple, {u'minLength': 1})
    FieldMetadata.RIGHTS = FieldMetadata('rights', tuple, {u'minLength': 1})
    FieldMetadata.RIGHTS_HOLDERS = FieldMetadata('rights_holders', tuple, {u'minLength': 1})
    FieldMetadata.SOURCES = FieldMetadata('sources', tuple, {u'minLength': 1})
    FieldMetadata.SPATIALS = FieldMetadata('spatials', tuple, {u'minLength': 1})
    FieldMetadata.SUBJECTS = FieldMetadata('subjects', tuple, {u'minLength': 1})
    FieldMetadata.TEMPORALS = FieldMetadata('temporals', tuple, {u'minLength': 1})
    FieldMetadata.TITLES = FieldMetadata('titles', tuple, {u'minLength': 1})
    FieldMetadata.TYPES = FieldMetadata('types', tuple, {u'minLength': 1})

    def __init__(
        self,
        abstracts=None,
        audiences=None,
        contributors=None,
        coverages=None,
        createds=None,
        creators=None,
        dates=None,
        descriptions=None,
        extents=None,
        formats=None,
        identifiers=None,
        languages=None,
        mediums=None,
        provenances=None,
        publishers=None,
        relations=None,
        rights=None,
        rights_holders=None,
        sources=None,
        spatials=None,
        subjects=None,
        temporals=None,
        titles=None,
        types=None,
    ):
        '''
        :type abstracts: tuple(str) or None
        :type audiences: tuple(str) or None
        :type contributors: tuple(str) or None
        :type coverages: tuple(str) or None
        :type createds: tuple(str) or None
        :type creators: tuple(str) or None
        :type dates: tuple(str) or None
        :type descriptions: tuple(str) or None
        :type extents: tuple(str) or None
        :type formats: tuple(str) or None
        :type identifiers: tuple(str) or None
        :type languages: tuple(str) or None
        :type mediums: tuple(str) or None
        :type provenances: tuple(str) or None
        :type publishers: tuple(str) or None
        :type relations: tuple(str) or None
        :type rights: tuple(str) or None
        :type rights_holders: tuple(str) or None
        :type sources: tuple(str) or None
        :type spatials: tuple(str) or None
        :type subjects: tuple(str) or None
        :type temporals: tuple(str) or None
        :type titles: tuple(str) or None
        :type types: tuple(str) or None
        '''

        if abstracts is not None:
            if not (isinstance(abstracts, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), abstracts))) == 0):
                raise TypeError("expected abstracts to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(abstracts))
            if len(abstracts) < 1:
                raise ValueError("expected len(abstracts) to be >= 1, was %d" % len(abstracts))
        self.__abstracts = abstracts

        if audiences is not None:
            if not (isinstance(audiences, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), audiences))) == 0):
                raise TypeError("expected audiences to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(audiences))
            if len(audiences) < 1:
                raise ValueError("expected len(audiences) to be >= 1, was %d" % len(audiences))
        self.__audiences = audiences

        if contributors is not None:
            if not (isinstance(contributors, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), contributors))) == 0):
                raise TypeError("expected contributors to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(contributors))
            if len(contributors) < 1:
                raise ValueError("expected len(contributors) to be >= 1, was %d" % len(contributors))
        self.__contributors = contributors

        if coverages is not None:
            if not (isinstance(coverages, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), coverages))) == 0):
                raise TypeError("expected coverages to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(coverages))
            if len(coverages) < 1:
                raise ValueError("expected len(coverages) to be >= 1, was %d" % len(coverages))
        self.__coverages = coverages

        if createds is not None:
            if not (isinstance(createds, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), createds))) == 0):
                raise TypeError("expected createds to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(createds))
            if len(createds) < 1:
                raise ValueError("expected len(createds) to be >= 1, was %d" % len(createds))
        self.__createds = createds

        if creators is not None:
            if not (isinstance(creators, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), creators))) == 0):
                raise TypeError("expected creators to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(creators))
            if len(creators) < 1:
                raise ValueError("expected len(creators) to be >= 1, was %d" % len(creators))
        self.__creators = creators

        if dates is not None:
            if not (isinstance(dates, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), dates))) == 0):
                raise TypeError("expected dates to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(dates))
            if len(dates) < 1:
                raise ValueError("expected len(dates) to be >= 1, was %d" % len(dates))
        self.__dates = dates

        if descriptions is not None:
            if not (isinstance(descriptions, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), descriptions))) == 0):
                raise TypeError("expected descriptions to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(descriptions))
            if len(descriptions) < 1:
                raise ValueError("expected len(descriptions) to be >= 1, was %d" % len(descriptions))
        self.__descriptions = descriptions

        if extents is not None:
            if not (isinstance(extents, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), extents))) == 0):
                raise TypeError("expected extents to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(extents))
            if len(extents) < 1:
                raise ValueError("expected len(extents) to be >= 1, was %d" % len(extents))
        self.__extents = extents

        if formats is not None:
            if not (isinstance(formats, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), formats))) == 0):
                raise TypeError("expected formats to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(formats))
            if len(formats) < 1:
                raise ValueError("expected len(formats) to be >= 1, was %d" % len(formats))
        self.__formats = formats

        if identifiers is not None:
            if not (isinstance(identifiers, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), identifiers))) == 0):
                raise TypeError("expected identifiers to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(identifiers))
            if len(identifiers) < 1:
                raise ValueError("expected len(identifiers) to be >= 1, was %d" % len(identifiers))
        self.__identifiers = identifiers

        if languages is not None:
            if not (isinstance(languages, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), languages))) == 0):
                raise TypeError("expected languages to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(languages))
            if len(languages) < 1:
                raise ValueError("expected len(languages) to be >= 1, was %d" % len(languages))
        self.__languages = languages

        if mediums is not None:
            if not (isinstance(mediums, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), mediums))) == 0):
                raise TypeError("expected mediums to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(mediums))
            if len(mediums) < 1:
                raise ValueError("expected len(mediums) to be >= 1, was %d" % len(mediums))
        self.__mediums = mediums

        if provenances is not None:
            if not (isinstance(provenances, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), provenances))) == 0):
                raise TypeError("expected provenances to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(provenances))
            if len(provenances) < 1:
                raise ValueError("expected len(provenances) to be >= 1, was %d" % len(provenances))
        self.__provenances = provenances

        if publishers is not None:
            if not (isinstance(publishers, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), publishers))) == 0):
                raise TypeError("expected publishers to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(publishers))
            if len(publishers) < 1:
                raise ValueError("expected len(publishers) to be >= 1, was %d" % len(publishers))
        self.__publishers = publishers

        if relations is not None:
            if not (isinstance(relations, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), relations))) == 0):
                raise TypeError("expected relations to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(relations))
            if len(relations) < 1:
                raise ValueError("expected len(relations) to be >= 1, was %d" % len(relations))
        self.__relations = relations

        if rights is not None:
            if not (isinstance(rights, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), rights))) == 0):
                raise TypeError("expected rights to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(rights))
            if len(rights) < 1:
                raise ValueError("expected len(rights) to be >= 1, was %d" % len(rights))
        self.__rights = rights

        if rights_holders is not None:
            if not (isinstance(rights_holders, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), rights_holders))) == 0):
                raise TypeError("expected rights_holders to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(rights_holders))
            if len(rights_holders) < 1:
                raise ValueError("expected len(rights_holders) to be >= 1, was %d" % len(rights_holders))
        self.__rights_holders = rights_holders

        if sources is not None:
            if not (isinstance(sources, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), sources))) == 0):
                raise TypeError("expected sources to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(sources))
            if len(sources) < 1:
                raise ValueError("expected len(sources) to be >= 1, was %d" % len(sources))
        self.__sources = sources

        if spatials is not None:
            if not (isinstance(spatials, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), spatials))) == 0):
                raise TypeError("expected spatials to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(spatials))
            if len(spatials) < 1:
                raise ValueError("expected len(spatials) to be >= 1, was %d" % len(spatials))
        self.__spatials = spatials

        if subjects is not None:
            if not (isinstance(subjects, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), subjects))) == 0):
                raise TypeError("expected subjects to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(subjects))
            if len(subjects) < 1:
                raise ValueError("expected len(subjects) to be >= 1, was %d" % len(subjects))
        self.__subjects = subjects

        if temporals is not None:
            if not (isinstance(temporals, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), temporals))) == 0):
                raise TypeError("expected temporals to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(temporals))
            if len(temporals) < 1:
                raise ValueError("expected len(temporals) to be >= 1, was %d" % len(temporals))
        self.__temporals = temporals

        if titles is not None:
            if not (isinstance(titles, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), titles))) == 0):
                raise TypeError("expected titles to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(titles))
            if len(titles) < 1:
                raise ValueError("expected len(titles) to be >= 1, was %d" % len(titles))
        self.__titles = titles

        if types is not None:
            if not (isinstance(types, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), types))) == 0):
                raise TypeError("expected types to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(types))
            if len(types) < 1:
                raise ValueError("expected len(types) to be >= 1, was %d" % len(types))
        self.__types = types

    def __eq__(self, other):
        if self.abstracts != other.abstracts:
            return False
        if self.audiences != other.audiences:
            return False
        if self.contributors != other.contributors:
            return False
        if self.coverages != other.coverages:
            return False
        if self.createds != other.createds:
            return False
        if self.creators != other.creators:
            return False
        if self.dates != other.dates:
            return False
        if self.descriptions != other.descriptions:
            return False
        if self.extents != other.extents:
            return False
        if self.formats != other.formats:
            return False
        if self.identifiers != other.identifiers:
            return False
        if self.languages != other.languages:
            return False
        if self.mediums != other.mediums:
            return False
        if self.provenances != other.provenances:
            return False
        if self.publishers != other.publishers:
            return False
        if self.relations != other.relations:
            return False
        if self.rights != other.rights:
            return False
        if self.rights_holders != other.rights_holders:
            return False
        if self.sources != other.sources:
            return False
        if self.spatials != other.spatials:
            return False
        if self.subjects != other.subjects:
            return False
        if self.temporals != other.temporals:
            return False
        if self.titles != other.titles:
            return False
        if self.types != other.types:
            return False
        return True

    def __hash__(self):
        return hash((self.abstracts,self.audiences,self.contributors,self.coverages,self.createds,self.creators,self.dates,self.descriptions,self.extents,self.formats,self.identifiers,self.languages,self.mediums,self.provenances,self.publishers,self.relations,self.rights,self.rights_holders,self.sources,self.spatials,self.subjects,self.temporals,self.titles,self.types,))

    def __iter__(self):
        return iter((self.abstracts, self.audiences, self.contributors, self.coverages, self.createds, self.creators, self.dates, self.descriptions, self.extents, self.formats, self.identifiers, self.languages, self.mediums, self.provenances, self.publishers, self.relations, self.rights, self.rights_holders, self.sources, self.spatials, self.subjects, self.temporals, self.titles, self.types,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.abstracts is not None:
            field_reprs.append('abstracts=' + repr(self.abstracts))
        if self.audiences is not None:
            field_reprs.append('audiences=' + repr(self.audiences))
        if self.contributors is not None:
            field_reprs.append('contributors=' + repr(self.contributors))
        if self.coverages is not None:
            field_reprs.append('coverages=' + repr(self.coverages))
        if self.createds is not None:
            field_reprs.append('createds=' + repr(self.createds))
        if self.creators is not None:
            field_reprs.append('creators=' + repr(self.creators))
        if self.dates is not None:
            field_reprs.append('dates=' + repr(self.dates))
        if self.descriptions is not None:
            field_reprs.append('descriptions=' + repr(self.descriptions))
        if self.extents is not None:
            field_reprs.append('extents=' + repr(self.extents))
        if self.formats is not None:
            field_reprs.append('formats=' + repr(self.formats))
        if self.identifiers is not None:
            field_reprs.append('identifiers=' + repr(self.identifiers))
        if self.languages is not None:
            field_reprs.append('languages=' + repr(self.languages))
        if self.mediums is not None:
            field_reprs.append('mediums=' + repr(self.mediums))
        if self.provenances is not None:
            field_reprs.append('provenances=' + repr(self.provenances))
        if self.publishers is not None:
            field_reprs.append('publishers=' + repr(self.publishers))
        if self.relations is not None:
            field_reprs.append('relations=' + repr(self.relations))
        if self.rights is not None:
            field_reprs.append('rights=' + repr(self.rights))
        if self.rights_holders is not None:
            field_reprs.append('rights_holders=' + repr(self.rights_holders))
        if self.sources is not None:
            field_reprs.append('sources=' + repr(self.sources))
        if self.spatials is not None:
            field_reprs.append('spatials=' + repr(self.spatials))
        if self.subjects is not None:
            field_reprs.append('subjects=' + repr(self.subjects))
        if self.temporals is not None:
            field_reprs.append('temporals=' + repr(self.temporals))
        if self.titles is not None:
            field_reprs.append('titles=' + repr(self.titles))
        if self.types is not None:
            field_reprs.append('types=' + repr(self.types))
        return 'DublinCoreObject(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.abstracts is not None:
            field_reprs.append('abstracts=' + repr(self.abstracts))
        if self.audiences is not None:
            field_reprs.append('audiences=' + repr(self.audiences))
        if self.contributors is not None:
            field_reprs.append('contributors=' + repr(self.contributors))
        if self.coverages is not None:
            field_reprs.append('coverages=' + repr(self.coverages))
        if self.createds is not None:
            field_reprs.append('createds=' + repr(self.createds))
        if self.creators is not None:
            field_reprs.append('creators=' + repr(self.creators))
        if self.dates is not None:
            field_reprs.append('dates=' + repr(self.dates))
        if self.descriptions is not None:
            field_reprs.append('descriptions=' + repr(self.descriptions))
        if self.extents is not None:
            field_reprs.append('extents=' + repr(self.extents))
        if self.formats is not None:
            field_reprs.append('formats=' + repr(self.formats))
        if self.identifiers is not None:
            field_reprs.append('identifiers=' + repr(self.identifiers))
        if self.languages is not None:
            field_reprs.append('languages=' + repr(self.languages))
        if self.mediums is not None:
            field_reprs.append('mediums=' + repr(self.mediums))
        if self.provenances is not None:
            field_reprs.append('provenances=' + repr(self.provenances))
        if self.publishers is not None:
            field_reprs.append('publishers=' + repr(self.publishers))
        if self.relations is not None:
            field_reprs.append('relations=' + repr(self.relations))
        if self.rights is not None:
            field_reprs.append('rights=' + repr(self.rights))
        if self.rights_holders is not None:
            field_reprs.append('rights_holders=' + repr(self.rights_holders))
        if self.sources is not None:
            field_reprs.append('sources=' + repr(self.sources))
        if self.spatials is not None:
            field_reprs.append('spatials=' + repr(self.spatials))
        if self.subjects is not None:
            field_reprs.append('subjects=' + repr(self.subjects))
        if self.temporals is not None:
            field_reprs.append('temporals=' + repr(self.temporals))
        if self.titles is not None:
            field_reprs.append('titles=' + repr(self.titles))
        if self.types is not None:
            field_reprs.append('types=' + repr(self.types))
        return 'DublinCoreObject(' + ', '.join(field_reprs) + ')'

    @property
    def abstracts(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__abstracts

    @property
    def audiences(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__audiences

    @property
    def contributors(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__contributors

    @property
    def coverages(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__coverages

    @property
    def createds(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__createds

    @property
    def creators(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__creators

    @property
    def dates(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__dates

    @property
    def descriptions(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__descriptions

    @property
    def extents(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__extents

    @property
    def formats(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__formats

    @property
    def identifiers(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__identifiers

    @property
    def languages(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__languages

    @property
    def mediums(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__mediums

    @property
    def provenances(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__provenances

    @property
    def publishers(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__publishers

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.vocabularies.dublin_core.dublin_core_object.DublinCoreObject
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'abstracts' and ifield_id == 24:
                init_kwds['abstracts'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'audiences' and ifield_id == 1:
                init_kwds['audiences'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'contributors' and ifield_id == 2:
                init_kwds['contributors'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'coverages' and ifield_id == 3:
                init_kwds['coverages'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'createds' and ifield_id == 20:
                init_kwds['createds'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'creators' and ifield_id == 4:
                init_kwds['creators'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'dates' and ifield_id == 5:
                init_kwds['dates'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'descriptions' and ifield_id == 6:
                init_kwds['descriptions'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'extents' and ifield_id == 19:
                init_kwds['extents'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'formats' and ifield_id == 8:
                init_kwds['formats'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'identifiers' and ifield_id == 7:
                init_kwds['identifiers'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'languages' and ifield_id == 9:
                init_kwds['languages'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'mediums' and ifield_id == 23:
                init_kwds['mediums'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'provenances' and ifield_id == 10:
                init_kwds['provenances'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'publishers' and ifield_id == 11:
                init_kwds['publishers'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'relations' and ifield_id == 12:
                init_kwds['relations'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'rights' and ifield_id == 13:
                init_kwds['rights'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'rights_holders' and ifield_id == 14:
                init_kwds['rights_holders'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'sources' and ifield_id == 15:
                init_kwds['sources'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'spatials' and ifield_id == 21:
                init_kwds['spatials'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'subjects' and ifield_id == 16:
                init_kwds['subjects'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'temporals' and ifield_id == 22:
                init_kwds['temporals'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'titles' and ifield_id == 17:
                init_kwds['titles'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'types' and ifield_id == 18:
                init_kwds['types'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    @property
    def relations(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__relations

    def replace(
        self,
        abstracts=None,
        audiences=None,
        contributors=None,
        coverages=None,
        createds=None,
        creators=None,
        dates=None,
        descriptions=None,
        extents=None,
        formats=None,
        identifiers=None,
        languages=None,
        mediums=None,
        provenances=None,
        publishers=None,
        relations=None,
        rights=None,
        rights_holders=None,
        sources=None,
        spatials=None,
        subjects=None,
        temporals=None,
        titles=None,
        types=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type abstracts: tuple(str) or None
        :type audiences: tuple(str) or None
        :type contributors: tuple(str) or None
        :type coverages: tuple(str) or None
        :type createds: tuple(str) or None
        :type creators: tuple(str) or None
        :type dates: tuple(str) or None
        :type descriptions: tuple(str) or None
        :type extents: tuple(str) or None
        :type formats: tuple(str) or None
        :type identifiers: tuple(str) or None
        :type languages: tuple(str) or None
        :type mediums: tuple(str) or None
        :type provenances: tuple(str) or None
        :type publishers: tuple(str) or None
        :type relations: tuple(str) or None
        :type rights: tuple(str) or None
        :type rights_holders: tuple(str) or None
        :type sources: tuple(str) or None
        :type spatials: tuple(str) or None
        :type subjects: tuple(str) or None
        :type temporals: tuple(str) or None
        :type titles: tuple(str) or None
        :type types: tuple(str) or None
        :rtype: dressdiscover.api.vocabularies.dublin_core.dublin_core_object.DublinCoreObject
        '''

        if abstracts is None:
            abstracts = self.abstracts
        if audiences is None:
            audiences = self.audiences
        if contributors is None:
            contributors = self.contributors
        if coverages is None:
            coverages = self.coverages
        if createds is None:
            createds = self.createds
        if creators is None:
            creators = self.creators
        if dates is None:
            dates = self.dates
        if descriptions is None:
            descriptions = self.descriptions
        if extents is None:
            extents = self.extents
        if formats is None:
            formats = self.formats
        if identifiers is None:
            identifiers = self.identifiers
        if languages is None:
            languages = self.languages
        if mediums is None:
            mediums = self.mediums
        if provenances is None:
            provenances = self.provenances
        if publishers is None:
            publishers = self.publishers
        if relations is None:
            relations = self.relations
        if rights is None:
            rights = self.rights
        if rights_holders is None:
            rights_holders = self.rights_holders
        if sources is None:
            sources = self.sources
        if spatials is None:
            spatials = self.spatials
        if subjects is None:
            subjects = self.subjects
        if temporals is None:
            temporals = self.temporals
        if titles is None:
            titles = self.titles
        if types is None:
            types = self.types
        return self.__class__(abstracts=abstracts, audiences=audiences, contributors=contributors, coverages=coverages, createds=createds, creators=creators, dates=dates, descriptions=descriptions, extents=extents, formats=formats, identifiers=identifiers, languages=languages, mediums=mediums, provenances=provenances, publishers=publishers, relations=relations, rights=rights, rights_holders=rights_holders, sources=sources, spatials=spatials, subjects=subjects, temporals=temporals, titles=titles, types=types)

    @property
    def rights(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__rights

    @property
    def rights_holders(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__rights_holders

    @property
    def sources(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__sources

    @property
    def spatials(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__spatials

    @property
    def subjects(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__subjects

    @property
    def temporals(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__temporals

    @property
    def titles(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__titles

    @property
    def types(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__types

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.vocabularies.dublin_core.dublin_core_object.DublinCoreObject
        '''

        oprot.write_struct_begin('DublinCoreObject')

        if self.abstracts is not None:
            oprot.write_field_begin(name='abstracts', type=15, id=24)
            oprot.write_list_begin(11, len(self.abstracts))
            for _0 in self.abstracts:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.audiences is not None:
            oprot.write_field_begin(name='audiences', type=15, id=1)
            oprot.write_list_begin(11, len(self.audiences))
            for _0 in self.audiences:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.contributors is not None:
            oprot.write_field_begin(name='contributors', type=15, id=2)
            oprot.write_list_begin(11, len(self.contributors))
            for _0 in self.contributors:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.coverages is not None:
            oprot.write_field_begin(name='coverages', type=15, id=3)
            oprot.write_list_begin(11, len(self.coverages))
            for _0 in self.coverages:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.createds is not None:
            oprot.write_field_begin(name='createds', type=15, id=20)
            oprot.write_list_begin(11, len(self.createds))
            for _0 in self.createds:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.creators is not None:
            oprot.write_field_begin(name='creators', type=15, id=4)
            oprot.write_list_begin(11, len(self.creators))
            for _0 in self.creators:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.dates is not None:
            oprot.write_field_begin(name='dates', type=15, id=5)
            oprot.write_list_begin(11, len(self.dates))
            for _0 in self.dates:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.descriptions is not None:
            oprot.write_field_begin(name='descriptions', type=15, id=6)
            oprot.write_list_begin(11, len(self.descriptions))
            for _0 in self.descriptions:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.extents is not None:
            oprot.write_field_begin(name='extents', type=15, id=19)
            oprot.write_list_begin(11, len(self.extents))
            for _0 in self.extents:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.formats is not None:
            oprot.write_field_begin(name='formats', type=15, id=8)
            oprot.write_list_begin(11, len(self.formats))
            for _0 in self.formats:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.identifiers is not None:
            oprot.write_field_begin(name='identifiers', type=15, id=7)
            oprot.write_list_begin(11, len(self.identifiers))
            for _0 in self.identifiers:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.languages is not None:
            oprot.write_field_begin(name='languages', type=15, id=9)
            oprot.write_list_begin(11, len(self.languages))
            for _0 in self.languages:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.mediums is not None:
            oprot.write_field_begin(name='mediums', type=15, id=23)
            oprot.write_list_begin(11, len(self.mediums))
            for _0 in self.mediums:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.provenances is not None:
            oprot.write_field_begin(name='provenances', type=15, id=10)
            oprot.write_list_begin(11, len(self.provenances))
            for _0 in self.provenances:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.publishers is not None:
            oprot.write_field_begin(name='publishers', type=15, id=11)
            oprot.write_list_begin(11, len(self.publishers))
            for _0 in self.publishers:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.relations is not None:
            oprot.write_field_begin(name='relations', type=15, id=12)
            oprot.write_list_begin(11, len(self.relations))
            for _0 in self.relations:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.rights is not None:
            oprot.write_field_begin(name='rights', type=15, id=13)
            oprot.write_list_begin(11, len(self.rights))
            for _0 in self.rights:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.rights_holders is not None:
            oprot.write_field_begin(name='rights_holders', type=15, id=14)
            oprot.write_list_begin(11, len(self.rights_holders))
            for _0 in self.rights_holders:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.sources is not None:
            oprot.write_field_begin(name='sources', type=15, id=15)
            oprot.write_list_begin(11, len(self.sources))
            for _0 in self.sources:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.spatials is not None:
            oprot.write_field_begin(name='spatials', type=15, id=21)
            oprot.write_list_begin(11, len(self.spatials))
            for _0 in self.spatials:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.subjects is not None:
            oprot.write_field_begin(name='subjects', type=15, id=16)
            oprot.write_list_begin(11, len(self.subjects))
            for _0 in self.subjects:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.temporals is not None:
            oprot.write_field_begin(name='temporals', type=15, id=22)
            oprot.write_list_begin(11, len(self.temporals))
            for _0 in self.temporals:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.titles is not None:
            oprot.write_field_begin(name='titles', type=15, id=17)
            oprot.write_list_begin(11, len(self.titles))
            for _0 in self.titles:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.types is not None:
            oprot.write_field_begin(name='types', type=15, id=18)
            oprot.write_list_begin(11, len(self.types))
            for _0 in self.types:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
