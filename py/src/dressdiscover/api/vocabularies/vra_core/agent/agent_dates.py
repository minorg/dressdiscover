import __builtin__
import datetime
import dressdiscover.api.vocabularies.vra_core.agent.agent_dates_type


class AgentDates(object):
    class Builder(object):
        def __init__(
            self,
            type=None,  # @ReservedAssignment
            earliest_date=None,
            latest_date=None,
        ):
            '''
            :type type: dressdiscover.api.vocabularies.vra_core.agent.agent_dates_type.AgentDatesType
            :type earliest_date: datetime.datetime or None
            :type latest_date: datetime.datetime or None
            '''

            self.__type = type
            self.__earliest_date = earliest_date
            self.__latest_date = latest_date

        def build(self):
            return AgentDates(type=self.__type, earliest_date=self.__earliest_date, latest_date=self.__latest_date)

        @property
        def earliest_date(self):
            '''
            :rtype: datetime.datetime
            '''

            return self.__earliest_date

        @property
        def latest_date(self):
            '''
            :rtype: datetime.datetime
            '''

            return self.__latest_date

        def set_earliest_date(self, earliest_date):
            '''
            :type earliest_date: datetime.datetime or None
            '''

            if earliest_date is not None:
                if not isinstance(earliest_date, datetime.datetime):
                    raise TypeError("expected earliest_date to be a datetime.datetime but it is a %s" % getattr(__builtin__, 'type')(earliest_date))
            self.__earliest_date = earliest_date
            return self

        def set_latest_date(self, latest_date):
            '''
            :type latest_date: datetime.datetime or None
            '''

            if latest_date is not None:
                if not isinstance(latest_date, datetime.datetime):
                    raise TypeError("expected latest_date to be a datetime.datetime but it is a %s" % getattr(__builtin__, 'type')(latest_date))
            self.__latest_date = latest_date
            return self

        def set_type(self, type):  # @ReservedAssignment
            '''
            :type type: dressdiscover.api.vocabularies.vra_core.agent.agent_dates_type.AgentDatesType
            '''

            if type is None:
                raise ValueError('type is required')
            if not isinstance(type, dressdiscover.api.vocabularies.vra_core.agent.agent_dates_type.AgentDatesType):
                raise TypeError("expected type to be a dressdiscover.api.vocabularies.vra_core.agent.agent_dates_type.AgentDatesType but it is a %s" % getattr(__builtin__, 'type')(type))
            self.__type = type
            return self

        @property
        def type(self):  # @ReservedAssignment
            '''
            :rtype: dressdiscover.api.vocabularies.vra_core.agent.agent_dates_type.AgentDatesType
            '''

            return self.__type

        def update(self, agent_dates):
            '''
            :type type: dressdiscover.api.vocabularies.vra_core.agent.agent_dates_type.AgentDatesType
            :type earliest_date: datetime.datetime or None
            :type latest_date: datetime.datetime or None
            '''

            if isinstance(agent_dates, AgentDates):
                self.set_type(agent_dates.type)
                self.set_earliest_date(agent_dates.earliest_date)
                self.set_latest_date(agent_dates.latest_date)
            elif isinstance(agent_dates, dict):
                for key, value in agent_dates.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(agent_dates)
            return self

        @earliest_date.setter
        def earliest_date(self, earliest_date):
            '''
            :type earliest_date: datetime.datetime or None
            '''

            self.set_earliest_date(earliest_date)

        @latest_date.setter
        def latest_date(self, latest_date):
            '''
            :type latest_date: datetime.datetime or None
            '''

            self.set_latest_date(latest_date)

        @type.setter
        def type(self, type):  # @ReservedAssignment
            '''
            :type type: dressdiscover.api.vocabularies.vra_core.agent.agent_dates_type.AgentDatesType
            '''

            self.set_type(type)

    class FieldMetadata(object):
        TYPE = None
        EARLIEST_DATE = None
        LATEST_DATE = None

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
            return (cls.TYPE, cls.EARLIEST_DATE, cls.LATEST_DATE,)

    FieldMetadata.TYPE = FieldMetadata('type', dressdiscover.api.vocabularies.vra_core.agent.agent_dates_type.AgentDatesType, None)
    FieldMetadata.EARLIEST_DATE = FieldMetadata('earliest_date', datetime.datetime, None)
    FieldMetadata.LATEST_DATE = FieldMetadata('latest_date', datetime.datetime, None)

    def __init__(
        self,
        type,  # @ReservedAssignment
        earliest_date=None,
        latest_date=None,
    ):
        '''
        :type type: dressdiscover.api.vocabularies.vra_core.agent.agent_dates_type.AgentDatesType
        :type earliest_date: datetime.datetime or None
        :type latest_date: datetime.datetime or None
        '''

        if type is None:
            raise ValueError('type is required')
        if not isinstance(type, dressdiscover.api.vocabularies.vra_core.agent.agent_dates_type.AgentDatesType):
            raise TypeError("expected type to be a dressdiscover.api.vocabularies.vra_core.agent.agent_dates_type.AgentDatesType but it is a %s" % getattr(__builtin__, 'type')(type))
        self.__type = type

        if earliest_date is not None:
            if not isinstance(earliest_date, datetime.datetime):
                raise TypeError("expected earliest_date to be a datetime.datetime but it is a %s" % getattr(__builtin__, 'type')(earliest_date))
        self.__earliest_date = earliest_date

        if latest_date is not None:
            if not isinstance(latest_date, datetime.datetime):
                raise TypeError("expected latest_date to be a datetime.datetime but it is a %s" % getattr(__builtin__, 'type')(latest_date))
        self.__latest_date = latest_date

    def __eq__(self, other):
        if self.type != other.type:
            return False
        if self.earliest_date != other.earliest_date:
            return False
        if self.latest_date != other.latest_date:
            return False
        return True

    def __hash__(self):
        return hash((self.type,self.earliest_date,self.latest_date,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('type=' + repr(self.type))
        if self.earliest_date is not None:
            field_reprs.append('earliest_date=' + repr(self.earliest_date))
        if self.latest_date is not None:
            field_reprs.append('latest_date=' + repr(self.latest_date))
        return 'AgentDates(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('type=' + repr(self.type))
        if self.earliest_date is not None:
            field_reprs.append('earliest_date=' + repr(self.earliest_date))
        if self.latest_date is not None:
            field_reprs.append('latest_date=' + repr(self.latest_date))
        return 'AgentDates(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'type': self.type, 'earliest_date': self.earliest_date, 'latest_date': self.latest_date}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.type, self.earliest_date, self.latest_date,)

    @property
    def earliest_date(self):
        '''
        :rtype: datetime.datetime
        '''

        return self.__earliest_date

    @property
    def latest_date(self):
        '''
        :rtype: datetime.datetime
        '''

        return self.__latest_date

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.vocabularies.vra_core.agent.agent_dates.AgentDates
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'type' and ifield_id == 1:
                init_kwds['type'] = dressdiscover.api.vocabularies.vra_core.agent.agent_dates_type.AgentDatesType.value_of(iprot.read_string().strip().upper())
            elif ifield_name == 'earliest_date' and ifield_id == 2:
                try:
                    init_kwds['earliest_date'] = iprot.read_date_time()
                except (TypeError,):
                    pass
            elif ifield_name == 'latest_date' and ifield_id == 3:
                try:
                    init_kwds['latest_date'] = iprot.read_date_time()
                except (TypeError,):
                    pass
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        type=None,  # @ReservedAssignment
        earliest_date=None,
        latest_date=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type type: dressdiscover.api.vocabularies.vra_core.agent.agent_dates_type.AgentDatesType or None
        :type earliest_date: datetime.datetime or None
        :type latest_date: datetime.datetime or None
        :rtype: dressdiscover.api.vocabularies.vra_core.agent.agent_dates.AgentDates
        '''

        if type is None:
            type = self.type  # @ReservedAssignment
        if earliest_date is None:
            earliest_date = self.earliest_date
        if latest_date is None:
            latest_date = self.latest_date
        return self.__class__(type=type, earliest_date=earliest_date, latest_date=latest_date)

    @property
    def type(self):  # @ReservedAssignment
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.agent.agent_dates_type.AgentDatesType
        '''

        return self.__type

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.vocabularies.vra_core.agent.agent_dates.AgentDates
        '''

        oprot.write_struct_begin('AgentDates')

        oprot.write_field_begin(name='type', type=11, id=1)
        oprot.write_string(str(self.type))
        oprot.write_field_end()

        if self.earliest_date is not None:
            oprot.write_field_begin(name='earliest_date', type=10, id=2)
            oprot.write_date_time(self.earliest_date)
            oprot.write_field_end()

        if self.latest_date is not None:
            oprot.write_field_begin(name='latest_date', type=10, id=3)
            oprot.write_date_time(self.latest_date)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
