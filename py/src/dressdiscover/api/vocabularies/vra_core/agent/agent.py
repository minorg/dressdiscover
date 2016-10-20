from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.vocabularies.vra_core.agent.agent_dates
import dressdiscover.api.vocabularies.vra_core.agent.agent_name
import dressdiscover.api.vocabularies.vra_core.agent.agent_role


class Agent(object):
    class Builder(object):
        def __init__(
            self,
            name=None,
            attribution=None,
            culture=None,
            dates=None,
            role=None,
        ):
            '''
            :type name: dressdiscover.api.vocabularies.vra_core.agent.agent_name.AgentName
            :type attribution: str or None
            :type culture: str or None
            :type dates: tuple(dressdiscover.api.vocabularies.vra_core.agent.agent_dates.AgentDates) or None
            :type role: dressdiscover.api.vocabularies.vra_core.agent.agent_role.AgentRole or None
            '''

            self.__name = name
            self.__attribution = attribution
            self.__culture = culture
            self.__dates = dates
            self.__role = role

        def build(self):
            return Agent(name=self.__name, attribution=self.__attribution, culture=self.__culture, dates=self.__dates, role=self.__role)

        @property
        def attribution(self):
            '''
            :rtype: str
            '''

            return self.__attribution

        @property
        def culture(self):
            '''
            :rtype: str
            '''

            return self.__culture

        @property
        def dates(self):
            '''
            :rtype: tuple(dressdiscover.api.vocabularies.vra_core.agent.agent_dates.AgentDates)
            '''

            return self.__dates

        @property
        def name(self):
            '''
            :rtype: dressdiscover.api.vocabularies.vra_core.agent.agent_name.AgentName
            '''

            return self.__name

        @property
        def role(self):
            '''
            :rtype: dressdiscover.api.vocabularies.vra_core.agent.agent_role.AgentRole
            '''

            return self.__role

        def set_attribution(self, attribution):
            '''
            :type attribution: str or None
            '''

            if attribution is not None:
                if not isinstance(attribution, basestring):
                    raise TypeError("expected attribution to be a str but it is a %s" % getattr(__builtin__, 'type')(attribution))
                if len(attribution) < 1:
                    raise ValueError("expected len(attribution) to be >= 1, was %d" % len(attribution))
            self.__attribution = attribution
            return self

        def set_culture(self, culture):
            '''
            :type culture: str or None
            '''

            if culture is not None:
                if not isinstance(culture, basestring):
                    raise TypeError("expected culture to be a str but it is a %s" % getattr(__builtin__, 'type')(culture))
                if len(culture) < 1:
                    raise ValueError("expected len(culture) to be >= 1, was %d" % len(culture))
            self.__culture = culture
            return self

        def set_dates(self, dates):
            '''
            :type dates: tuple(dressdiscover.api.vocabularies.vra_core.agent.agent_dates.AgentDates) or None
            '''

            if dates is not None:
                if not (isinstance(dates, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.agent.agent_dates.AgentDates), dates))) == 0):
                    raise TypeError("expected dates to be a tuple(dressdiscover.api.vocabularies.vra_core.agent.agent_dates.AgentDates) but it is a %s" % getattr(__builtin__, 'type')(dates))
                if len(dates) < 1:
                    raise ValueError("expected len(dates) to be >= 1, was %d" % len(dates))
            self.__dates = dates
            return self

        def set_name(self, name):
            '''
            :type name: dressdiscover.api.vocabularies.vra_core.agent.agent_name.AgentName
            '''

            if name is None:
                raise ValueError('name is required')
            if not isinstance(name, dressdiscover.api.vocabularies.vra_core.agent.agent_name.AgentName):
                raise TypeError("expected name to be a dressdiscover.api.vocabularies.vra_core.agent.agent_name.AgentName but it is a %s" % getattr(__builtin__, 'type')(name))
            self.__name = name
            return self

        def set_role(self, role):
            '''
            :type role: dressdiscover.api.vocabularies.vra_core.agent.agent_role.AgentRole or None
            '''

            if role is not None:
                if not isinstance(role, dressdiscover.api.vocabularies.vra_core.agent.agent_role.AgentRole):
                    raise TypeError("expected role to be a dressdiscover.api.vocabularies.vra_core.agent.agent_role.AgentRole but it is a %s" % getattr(__builtin__, 'type')(role))
            self.__role = role
            return self

        def update(self, agent):
            '''
            :type name: dressdiscover.api.vocabularies.vra_core.agent.agent_name.AgentName
            :type attribution: str or None
            :type culture: str or None
            :type dates: tuple(dressdiscover.api.vocabularies.vra_core.agent.agent_dates.AgentDates) or None
            :type role: dressdiscover.api.vocabularies.vra_core.agent.agent_role.AgentRole or None
            '''

            if isinstance(agent, Agent):
                self.set_name(agent.name)
                self.set_attribution(agent.attribution)
                self.set_culture(agent.culture)
                self.set_dates(agent.dates)
                self.set_role(agent.role)
            elif isinstance(agent, dict):
                for key, value in agent.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(agent)
            return self

        @attribution.setter
        def attribution(self, attribution):
            '''
            :type attribution: str or None
            '''

            self.set_attribution(attribution)

        @culture.setter
        def culture(self, culture):
            '''
            :type culture: str or None
            '''

            self.set_culture(culture)

        @dates.setter
        def dates(self, dates):
            '''
            :type dates: tuple(dressdiscover.api.vocabularies.vra_core.agent.agent_dates.AgentDates) or None
            '''

            self.set_dates(dates)

        @name.setter
        def name(self, name):
            '''
            :type name: dressdiscover.api.vocabularies.vra_core.agent.agent_name.AgentName
            '''

            self.set_name(name)

        @role.setter
        def role(self, role):
            '''
            :type role: dressdiscover.api.vocabularies.vra_core.agent.agent_role.AgentRole or None
            '''

            self.set_role(role)

    class FieldMetadata(object):
        NAME = None
        ATTRIBUTION = None
        CULTURE = None
        DATES = None
        ROLE = None

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
            return (cls.NAME, cls.ATTRIBUTION, cls.CULTURE, cls.DATES, cls.ROLE,)

    FieldMetadata.NAME = FieldMetadata('name', dressdiscover.api.vocabularies.vra_core.agent.agent_name.AgentName, None)
    FieldMetadata.ATTRIBUTION = FieldMetadata('attribution', str, {u'minLength': 1})
    FieldMetadata.CULTURE = FieldMetadata('culture', str, {u'minLength': 1})
    FieldMetadata.DATES = FieldMetadata('dates', tuple, {u'minLength': 1})
    FieldMetadata.ROLE = FieldMetadata('role', dressdiscover.api.vocabularies.vra_core.agent.agent_role.AgentRole, None)

    def __init__(
        self,
        name,
        attribution=None,
        culture=None,
        dates=None,
        role=None,
    ):
        '''
        :type name: dressdiscover.api.vocabularies.vra_core.agent.agent_name.AgentName
        :type attribution: str or None
        :type culture: str or None
        :type dates: tuple(dressdiscover.api.vocabularies.vra_core.agent.agent_dates.AgentDates) or None
        :type role: dressdiscover.api.vocabularies.vra_core.agent.agent_role.AgentRole or None
        '''

        if name is None:
            raise ValueError('name is required')
        if not isinstance(name, dressdiscover.api.vocabularies.vra_core.agent.agent_name.AgentName):
            raise TypeError("expected name to be a dressdiscover.api.vocabularies.vra_core.agent.agent_name.AgentName but it is a %s" % getattr(__builtin__, 'type')(name))
        self.__name = name

        if attribution is not None:
            if not isinstance(attribution, basestring):
                raise TypeError("expected attribution to be a str but it is a %s" % getattr(__builtin__, 'type')(attribution))
            if len(attribution) < 1:
                raise ValueError("expected len(attribution) to be >= 1, was %d" % len(attribution))
        self.__attribution = attribution

        if culture is not None:
            if not isinstance(culture, basestring):
                raise TypeError("expected culture to be a str but it is a %s" % getattr(__builtin__, 'type')(culture))
            if len(culture) < 1:
                raise ValueError("expected len(culture) to be >= 1, was %d" % len(culture))
        self.__culture = culture

        if dates is not None:
            if not (isinstance(dates, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.vra_core.agent.agent_dates.AgentDates), dates))) == 0):
                raise TypeError("expected dates to be a tuple(dressdiscover.api.vocabularies.vra_core.agent.agent_dates.AgentDates) but it is a %s" % getattr(__builtin__, 'type')(dates))
            if len(dates) < 1:
                raise ValueError("expected len(dates) to be >= 1, was %d" % len(dates))
        self.__dates = dates

        if role is not None:
            if not isinstance(role, dressdiscover.api.vocabularies.vra_core.agent.agent_role.AgentRole):
                raise TypeError("expected role to be a dressdiscover.api.vocabularies.vra_core.agent.agent_role.AgentRole but it is a %s" % getattr(__builtin__, 'type')(role))
        self.__role = role

    def __eq__(self, other):
        if self.name != other.name:
            return False
        if self.attribution != other.attribution:
            return False
        if self.culture != other.culture:
            return False
        if self.dates != other.dates:
            return False
        if self.role != other.role:
            return False
        return True

    def __hash__(self):
        return hash((self.name,self.attribution,self.culture,self.dates,self.role,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('name=' + repr(self.name))
        if self.attribution is not None:
            field_reprs.append('attribution=' + "'" + self.attribution.encode('ascii', 'replace') + "'")
        if self.culture is not None:
            field_reprs.append('culture=' + "'" + self.culture.encode('ascii', 'replace') + "'")
        if self.dates is not None:
            field_reprs.append('dates=' + repr(self.dates))
        if self.role is not None:
            field_reprs.append('role=' + repr(self.role))
        return 'Agent(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('name=' + repr(self.name))
        if self.attribution is not None:
            field_reprs.append('attribution=' + "'" + self.attribution.encode('ascii', 'replace') + "'")
        if self.culture is not None:
            field_reprs.append('culture=' + "'" + self.culture.encode('ascii', 'replace') + "'")
        if self.dates is not None:
            field_reprs.append('dates=' + repr(self.dates))
        if self.role is not None:
            field_reprs.append('role=' + repr(self.role))
        return 'Agent(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'name': self.name, 'attribution': self.attribution, 'culture': self.culture, 'dates': self.dates, 'role': self.role}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.name, self.attribution, self.culture, self.dates, self.role,)

    @property
    def attribution(self):
        '''
        :rtype: str
        '''

        return self.__attribution

    @property
    def culture(self):
        '''
        :rtype: str
        '''

        return self.__culture

    @property
    def dates(self):
        '''
        :rtype: tuple(dressdiscover.api.vocabularies.vra_core.agent.agent_dates.AgentDates)
        '''

        return self.__dates

    @property
    def name(self):
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.agent.agent_name.AgentName
        '''

        return self.__name

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.vocabularies.vra_core.agent.agent.Agent
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'name' and ifield_id == 1:
                init_kwds['name'] = dressdiscover.api.vocabularies.vra_core.agent.agent_name.AgentName.read(iprot)
            elif ifield_name == 'attribution' and ifield_id == 2:
                try:
                    init_kwds['attribution'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'culture' and ifield_id == 3:
                try:
                    init_kwds['culture'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'dates' and ifield_id == 4:
                init_kwds['dates'] = tuple([dressdiscover.api.vocabularies.vra_core.agent.agent_dates.AgentDates.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'role' and ifield_id == 5:
                init_kwds['role'] = dressdiscover.api.vocabularies.vra_core.agent.agent_role.AgentRole.read(iprot)
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        name=None,
        attribution=None,
        culture=None,
        dates=None,
        role=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type name: dressdiscover.api.vocabularies.vra_core.agent.agent_name.AgentName or None
        :type attribution: str or None
        :type culture: str or None
        :type dates: tuple(dressdiscover.api.vocabularies.vra_core.agent.agent_dates.AgentDates) or None
        :type role: dressdiscover.api.vocabularies.vra_core.agent.agent_role.AgentRole or None
        :rtype: dressdiscover.api.vocabularies.vra_core.agent.agent.Agent
        '''

        if name is None:
            name = self.name
        if attribution is None:
            attribution = self.attribution
        if culture is None:
            culture = self.culture
        if dates is None:
            dates = self.dates
        if role is None:
            role = self.role
        return self.__class__(name=name, attribution=attribution, culture=culture, dates=dates, role=role)

    @property
    def role(self):
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.agent.agent_role.AgentRole
        '''

        return self.__role

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.vocabularies.vra_core.agent.agent.Agent
        '''

        oprot.write_struct_begin('Agent')

        oprot.write_field_begin(name='name', type=12, id=1)
        self.name.write(oprot)
        oprot.write_field_end()

        if self.attribution is not None:
            oprot.write_field_begin(name='attribution', type=11, id=2)
            oprot.write_string(self.attribution)
            oprot.write_field_end()

        if self.culture is not None:
            oprot.write_field_begin(name='culture', type=11, id=3)
            oprot.write_string(self.culture)
            oprot.write_field_end()

        if self.dates is not None:
            oprot.write_field_begin(name='dates', type=15, id=4)
            oprot.write_list_begin(12, len(self.dates))
            for _0 in self.dates:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.role is not None:
            oprot.write_field_begin(name='role', type=12, id=5)
            self.role.write(oprot)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
