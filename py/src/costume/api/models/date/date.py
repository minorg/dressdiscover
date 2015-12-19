import __builtin__
import costume.api.models.date.date_bound
import costume.api.models.date.date_type


class Date(object):
    class Builder(object):
        def __init__(
            self,
            earliest_date=None,
            latest_date=None,
            type=None,  # @ReservedAssignment
            href=None,
            source=None,
        ):
            '''
            :type earliest_date: costume.api.models.date.date_bound.DateBound
            :type latest_date: costume.api.models.date.date_bound.DateBound
            :type type: costume.api.models.date.date_type.DateType
            :type href: str or None
            :type source: str or None
            '''

            self.__earliest_date = earliest_date
            self.__latest_date = latest_date
            self.__type = type
            self.__href = href
            self.__source = source

        def build(self):
            return Date(earliest_date=self.__earliest_date, latest_date=self.__latest_date, type=self.__type, href=self.__href, source=self.__source)

        @property
        def earliest_date(self):
            '''
            :rtype: costume.api.models.date.date_bound.DateBound
            '''

            return self.__earliest_date

        @property
        def href(self):
            '''
            :rtype: str
            '''

            return self.__href

        @property
        def latest_date(self):
            '''
            :rtype: costume.api.models.date.date_bound.DateBound
            '''

            return self.__latest_date

        def set_earliest_date(self, earliest_date):
            '''
            :type earliest_date: costume.api.models.date.date_bound.DateBound
            '''

            self.__earliest_date = earliest_date
            return self

        def set_href(self, href):
            '''
            :type href: str or None
            '''

            self.__href = href
            return self

        def set_latest_date(self, latest_date):
            '''
            :type latest_date: costume.api.models.date.date_bound.DateBound
            '''

            self.__latest_date = latest_date
            return self

        def set_source(self, source):
            '''
            :type source: str or None
            '''

            self.__source = source
            return self

        def set_type(self, type):  # @ReservedAssignment
            '''
            :type type: costume.api.models.date.date_type.DateType
            '''

            self.__type = type
            return self

        @property
        def source(self):
            '''
            :rtype: str
            '''

            return self.__source

        @property
        def type(self):  # @ReservedAssignment
            '''
            :rtype: costume.api.models.date.date_type.DateType
            '''

            return self.__type

        def update(self, date):
            '''
            :type earliest_date: costume.api.models.date.date_bound.DateBound
            :type latest_date: costume.api.models.date.date_bound.DateBound
            :type type: costume.api.models.date.date_type.DateType
            :type href: str or None
            :type source: str or None
            '''

            if isinstance(date, Date):
                self.set_earliest_date(date.earliest_date)
                self.set_latest_date(date.latest_date)
                self.set_type(date.type)
                self.set_href(date.href)
                self.set_source(date.source)
            elif isinstance(date, dict):
                for key, value in date.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(date)
            return self

        @earliest_date.setter
        def earliest_date(self, earliest_date):
            '''
            :type earliest_date: costume.api.models.date.date_bound.DateBound
            '''

            self.set_earliest_date(earliest_date)

        @href.setter
        def href(self, href):
            '''
            :type href: str or None
            '''

            self.set_href(href)

        @latest_date.setter
        def latest_date(self, latest_date):
            '''
            :type latest_date: costume.api.models.date.date_bound.DateBound
            '''

            self.set_latest_date(latest_date)

        @source.setter
        def source(self, source):
            '''
            :type source: str or None
            '''

            self.set_source(source)

        @type.setter
        def type(self, type):  # @ReservedAssignment
            '''
            :type type: costume.api.models.date.date_type.DateType
            '''

            self.set_type(type)

    def __init__(
        self,
        earliest_date,
        latest_date,
        type,  # @ReservedAssignment
        href=None,
        source=None,
    ):
        '''
        :type earliest_date: costume.api.models.date.date_bound.DateBound
        :type latest_date: costume.api.models.date.date_bound.DateBound
        :type type: costume.api.models.date.date_type.DateType
        :type href: str or None
        :type source: str or None
        '''

        if earliest_date is None:
            raise ValueError('earliest_date is required')
        if not isinstance(earliest_date, costume.api.models.date.date_bound.DateBound):
            raise TypeError("expected earliest_date to be a costume.api.models.date.date_bound.DateBound but it is a %s" % getattr(__builtin__, 'type')(earliest_date))
        self.__earliest_date = earliest_date

        if latest_date is None:
            raise ValueError('latest_date is required')
        if not isinstance(latest_date, costume.api.models.date.date_bound.DateBound):
            raise TypeError("expected latest_date to be a costume.api.models.date.date_bound.DateBound but it is a %s" % getattr(__builtin__, 'type')(latest_date))
        self.__latest_date = latest_date

        if type is None:
            raise ValueError('type is required')
        if not isinstance(type, costume.api.models.date.date_type.DateType):
            raise TypeError("expected type to be a costume.api.models.date.date_type.DateType but it is a %s" % getattr(__builtin__, 'type')(type))
        self.__type = type

        if href is not None:
            if not isinstance(href, basestring):
                raise TypeError("expected href to be a str but it is a %s" % getattr(__builtin__, 'type')(href))
        self.__href = href

        if source is not None:
            if not isinstance(source, basestring):
                raise TypeError("expected source to be a str but it is a %s" % getattr(__builtin__, 'type')(source))
            if len(source) < 1:
                raise ValueError("expected len(source) to be >= 1, was %d" % len(source))
        self.__source = source

    def __eq__(self, other):
        if self.earliest_date != other.earliest_date:
            return False
        if self.latest_date != other.latest_date:
            return False
        if self.type != other.type:
            return False
        if self.href != other.href:
            return False
        if self.source != other.source:
            return False
        return True

    def __hash__(self):
        return hash((self.earliest_date,self.latest_date,self.type,self.href,self.source,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('earliest_date=' + repr(self.earliest_date))
        field_reprs.append('latest_date=' + repr(self.latest_date))
        field_reprs.append('type=' + repr(self.type))
        if self.href is not None:
            field_reprs.append('href=' + "'" + self.href.encode('ascii', 'replace') + "'")
        if self.source is not None:
            field_reprs.append('source=' + "'" + self.source.encode('ascii', 'replace') + "'")
        return 'Date(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('earliest_date=' + repr(self.earliest_date))
        field_reprs.append('latest_date=' + repr(self.latest_date))
        field_reprs.append('type=' + repr(self.type))
        if self.href is not None:
            field_reprs.append('href=' + "'" + self.href.encode('ascii', 'replace') + "'")
        if self.source is not None:
            field_reprs.append('source=' + "'" + self.source.encode('ascii', 'replace') + "'")
        return 'Date(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'earliest_date': self.earliest_date, 'latest_date': self.latest_date, 'type': self.type, 'href': self.href, 'source': self.source}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.earliest_date, self.latest_date, self.type, self.href, self.source,)

    @property
    def earliest_date(self):
        '''
        :rtype: costume.api.models.date.date_bound.DateBound
        '''

        return self.__earliest_date

    @property
    def href(self):
        '''
        :rtype: str
        '''

        return self.__href

    @property
    def latest_date(self):
        '''
        :rtype: costume.api.models.date.date_bound.DateBound
        '''

        return self.__latest_date

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: costume.api.models.date.date.Date
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'earliest_date' and ifield_id == 1:
                init_kwds['earliest_date'] = costume.api.models.date.date_bound.DateBound.read(iprot)
            elif ifield_name == 'latest_date' and ifield_id == 2:
                init_kwds['latest_date'] = costume.api.models.date.date_bound.DateBound.read(iprot)
            elif ifield_name == 'type' and ifield_id == 3:
                init_kwds['type'] = costume.api.models.date.date_type.DateType.value_of(iprot.read_string().strip().upper())
            elif ifield_name == 'href' and ifield_id == 4:
                try:
                    init_kwds['href'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'source' and ifield_id == 5:
                try:
                    init_kwds['source'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        earliest_date=None,
        latest_date=None,
        type=None,  # @ReservedAssignment
        href=None,
        source=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type earliest_date: costume.api.models.date.date_bound.DateBound or None
        :type latest_date: costume.api.models.date.date_bound.DateBound or None
        :type type: costume.api.models.date.date_type.DateType or None
        :type href: str or None
        :type source: str or None
        :rtype: costume.api.models.date.date.Date
        '''

        if earliest_date is None:
            earliest_date = self.earliest_date
        if latest_date is None:
            latest_date = self.latest_date
        if type is None:
            type = self.type  # @ReservedAssignment
        if href is None:
            href = self.href
        if source is None:
            source = self.source
        return self.__class__(earliest_date=earliest_date, latest_date=latest_date, type=type, href=href, source=source)

    @property
    def source(self):
        '''
        :rtype: str
        '''

        return self.__source

    @property
    def type(self):  # @ReservedAssignment
        '''
        :rtype: costume.api.models.date.date_type.DateType
        '''

        return self.__type

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.models.date.date.Date
        '''

        oprot.write_struct_begin('Date')

        oprot.write_field_begin(name='earliest_date', type=12, id=1)
        self.earliest_date.write(oprot)
        oprot.write_field_end()

        oprot.write_field_begin(name='latest_date', type=12, id=2)
        self.latest_date.write(oprot)
        oprot.write_field_end()

        oprot.write_field_begin(name='type', type=11, id=3)
        oprot.write_string(str(self.type))
        oprot.write_field_end()

        if self.href is not None:
            oprot.write_field_begin(name='href', type=11, id=4)
            oprot.write_string(self.href)
            oprot.write_field_end()

        if self.source is not None:
            oprot.write_field_begin(name='source', type=11, id=5)
            oprot.write_string(self.source)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
