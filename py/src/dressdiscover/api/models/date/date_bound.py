from datetime import datetime
import __builtin__
import dressdiscover.api.models.date.date_time_granularity


class DateBound(object):
    class Builder(object):
        def __init__(
            self,
            text=None,
            circa=None,
            parsed_date_time=None,
            parsed_date_time_granularity=None,
        ):
            '''
            :type text: str
            :type circa: bool or None
            :type parsed_date_time: datetime or None
            :type parsed_date_time_granularity: dressdiscover.api.models.date.date_time_granularity.DateTimeGranularity or None
            '''

            self.__text = text
            self.__circa = circa
            self.__parsed_date_time = parsed_date_time
            self.__parsed_date_time_granularity = parsed_date_time_granularity

        def build(self):
            return DateBound(text=self.__text, circa=self.__circa, parsed_date_time=self.__parsed_date_time, parsed_date_time_granularity=self.__parsed_date_time_granularity)

        @property
        def circa(self):
            '''
            :rtype: bool
            '''

            return self.__circa

        @property
        def parsed_date_time(self):
            '''
            :rtype: datetime
            '''

            return self.__parsed_date_time

        @property
        def parsed_date_time_granularity(self):
            '''
            :rtype: dressdiscover.api.models.date.date_time_granularity.DateTimeGranularity
            '''

            return self.__parsed_date_time_granularity

        def set_circa(self, circa):
            '''
            :type circa: bool or None
            '''

            self.__circa = circa
            return self

        def set_parsed_date_time(self, parsed_date_time):
            '''
            :type parsed_date_time: datetime or None
            '''

            self.__parsed_date_time = parsed_date_time
            return self

        def set_parsed_date_time_granularity(self, parsed_date_time_granularity):
            '''
            :type parsed_date_time_granularity: dressdiscover.api.models.date.date_time_granularity.DateTimeGranularity or None
            '''

            self.__parsed_date_time_granularity = parsed_date_time_granularity
            return self

        def set_text(self, text):
            '''
            :type text: str
            '''

            self.__text = text
            return self

        @property
        def text(self):
            '''
            :rtype: str
            '''

            return self.__text

        def update(self, date_bound):
            '''
            :type text: str
            :type circa: bool or None
            :type parsed_date_time: datetime or None
            :type parsed_date_time_granularity: dressdiscover.api.models.date.date_time_granularity.DateTimeGranularity or None
            '''

            if isinstance(date_bound, DateBound):
                self.set_text(date_bound.text)
                self.set_circa(date_bound.circa)
                self.set_parsed_date_time(date_bound.parsed_date_time)
                self.set_parsed_date_time_granularity(date_bound.parsed_date_time_granularity)
            elif isinstance(date_bound, dict):
                for key, value in date_bound.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(date_bound)
            return self

        @circa.setter
        def circa(self, circa):
            '''
            :type circa: bool or None
            '''

            self.set_circa(circa)

        @parsed_date_time.setter
        def parsed_date_time(self, parsed_date_time):
            '''
            :type parsed_date_time: datetime or None
            '''

            self.set_parsed_date_time(parsed_date_time)

        @parsed_date_time_granularity.setter
        def parsed_date_time_granularity(self, parsed_date_time_granularity):
            '''
            :type parsed_date_time_granularity: dressdiscover.api.models.date.date_time_granularity.DateTimeGranularity or None
            '''

            self.set_parsed_date_time_granularity(parsed_date_time_granularity)

        @text.setter
        def text(self, text):
            '''
            :type text: str
            '''

            self.set_text(text)

    def __init__(
        self,
        text,
        circa=None,
        parsed_date_time=None,
        parsed_date_time_granularity=None,
    ):
        '''
        :type text: str
        :type circa: bool or None
        :type parsed_date_time: datetime or None
        :type parsed_date_time_granularity: dressdiscover.api.models.date.date_time_granularity.DateTimeGranularity or None
        '''

        if text is None:
            raise ValueError('text is required')
        if not isinstance(text, basestring):
            raise TypeError("expected text to be a str but it is a %s" % getattr(__builtin__, 'type')(text))
        if len(text) < 1:
            raise ValueError("expected len(text) to be >= 1, was %d" % len(text))
        self.__text = text

        if circa is not None:
            if not isinstance(circa, bool):
                raise TypeError("expected circa to be a bool but it is a %s" % getattr(__builtin__, 'type')(circa))
        self.__circa = circa

        if parsed_date_time is not None:
            if not isinstance(parsed_date_time, datetime):
                raise TypeError("expected parsed_date_time to be a datetime but it is a %s" % getattr(__builtin__, 'type')(parsed_date_time))
        self.__parsed_date_time = parsed_date_time

        if parsed_date_time_granularity is not None:
            if not isinstance(parsed_date_time_granularity, dressdiscover.api.models.date.date_time_granularity.DateTimeGranularity):
                raise TypeError("expected parsed_date_time_granularity to be a dressdiscover.api.models.date.date_time_granularity.DateTimeGranularity but it is a %s" % getattr(__builtin__, 'type')(parsed_date_time_granularity))
        self.__parsed_date_time_granularity = parsed_date_time_granularity

    def __eq__(self, other):
        if self.text != other.text:
            return False
        if self.circa != other.circa:
            return False
        if self.parsed_date_time != other.parsed_date_time:
            return False
        if self.parsed_date_time_granularity != other.parsed_date_time_granularity:
            return False
        return True

    def __hash__(self):
        return hash((self.text,self.circa,self.parsed_date_time,self.parsed_date_time_granularity,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        if self.circa is not None:
            field_reprs.append('circa=' + repr(self.circa))
        if self.parsed_date_time is not None:
            field_reprs.append('parsed_date_time=' + repr(self.parsed_date_time))
        if self.parsed_date_time_granularity is not None:
            field_reprs.append('parsed_date_time_granularity=' + repr(self.parsed_date_time_granularity))
        return 'DateBound(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        if self.circa is not None:
            field_reprs.append('circa=' + repr(self.circa))
        if self.parsed_date_time is not None:
            field_reprs.append('parsed_date_time=' + repr(self.parsed_date_time))
        if self.parsed_date_time_granularity is not None:
            field_reprs.append('parsed_date_time_granularity=' + repr(self.parsed_date_time_granularity))
        return 'DateBound(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'text': self.text, 'circa': self.circa, 'parsed_date_time': self.parsed_date_time, 'parsed_date_time_granularity': self.parsed_date_time_granularity}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.text, self.circa, self.parsed_date_time, self.parsed_date_time_granularity,)

    @property
    def circa(self):
        '''
        :rtype: bool
        '''

        return self.__circa

    @property
    def parsed_date_time(self):
        '''
        :rtype: datetime
        '''

        return self.__parsed_date_time

    @property
    def parsed_date_time_granularity(self):
        '''
        :rtype: dressdiscover.api.models.date.date_time_granularity.DateTimeGranularity
        '''

        return self.__parsed_date_time_granularity

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.date.date_bound.DateBound
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'text' and ifield_id == 1:
                init_kwds['text'] = iprot.read_string()
            elif ifield_name == 'circa' and ifield_id == 2:
                try:
                    init_kwds['circa'] = iprot.read_bool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'parsed_date_time' and ifield_id == 3:
                try:
                    init_kwds['parsed_date_time'] = iprot.read_date_time()
                except (TypeError,):
                    pass
            elif ifield_name == 'parsed_date_time_granularity' and ifield_id == 4:
                try:
                    init_kwds['parsed_date_time_granularity'] = dressdiscover.api.models.date.date_time_granularity.DateTimeGranularity.value_of(iprot.read_string().strip().upper())
                except (TypeError,):
                    pass
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        text=None,
        circa=None,
        parsed_date_time=None,
        parsed_date_time_granularity=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type text: str or None
        :type circa: bool or None
        :type parsed_date_time: datetime or None
        :type parsed_date_time_granularity: dressdiscover.api.models.date.date_time_granularity.DateTimeGranularity or None
        :rtype: dressdiscover.api.models.date.date_bound.DateBound
        '''

        if text is None:
            text = self.text
        if circa is None:
            circa = self.circa
        if parsed_date_time is None:
            parsed_date_time = self.parsed_date_time
        if parsed_date_time_granularity is None:
            parsed_date_time_granularity = self.parsed_date_time_granularity
        return self.__class__(text=text, circa=circa, parsed_date_time=parsed_date_time, parsed_date_time_granularity=parsed_date_time_granularity)

    @property
    def text(self):
        '''
        :rtype: str
        '''

        return self.__text

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.date.date_bound.DateBound
        '''

        oprot.write_struct_begin('DateBound')

        oprot.write_field_begin(name='text', type=11, id=1)
        oprot.write_string(self.text)
        oprot.write_field_end()

        if self.circa is not None:
            oprot.write_field_begin(name='circa', type=2, id=2)
            oprot.write_bool(self.circa)
            oprot.write_field_end()

        if self.parsed_date_time is not None:
            oprot.write_field_begin(name='parsed_date_time', type=10, id=3)
            oprot.write_date_time(self.parsed_date_time)
            oprot.write_field_end()

        if self.parsed_date_time_granularity is not None:
            oprot.write_field_begin(name='parsed_date_time_granularity', type=11, id=4)
            oprot.write_string(str(self.parsed_date_time_granularity))
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
