import __builtin__


class QuestionValueRange(object):
    class Builder(object):
        def __init__(
            self,
            start=None,
            step=None,
            stop=None,
        ):
            '''
            :type start: int
            :type step: int
            :type stop: int
            '''

            self.__start = start
            self.__step = step
            self.__stop = stop

        def build(self):
            return QuestionValueRange(start=self.__start, step=self.__step, stop=self.__stop)

        def set_start(self, start):
            '''
            :type start: int
            '''

            if start is None:
                raise ValueError('start is required')
            if not isinstance(start, int):
                raise TypeError("expected start to be a int but it is a %s" % getattr(__builtin__, 'type')(start))
            self.__start = start
            return self

        def set_step(self, step):
            '''
            :type step: int
            '''

            if step is None:
                raise ValueError('step is required')
            if not isinstance(step, int):
                raise TypeError("expected step to be a int but it is a %s" % getattr(__builtin__, 'type')(step))
            self.__step = step
            return self

        def set_stop(self, stop):
            '''
            :type stop: int
            '''

            if stop is None:
                raise ValueError('stop is required')
            if not isinstance(stop, int):
                raise TypeError("expected stop to be a int but it is a %s" % getattr(__builtin__, 'type')(stop))
            self.__stop = stop
            return self

        @property
        def start(self):
            '''
            :rtype: int
            '''

            return self.__start

        @property
        def step(self):
            '''
            :rtype: int
            '''

            return self.__step

        @property
        def stop(self):
            '''
            :rtype: int
            '''

            return self.__stop

        def update(self, question_value_range):
            '''
            :type start: int
            :type step: int
            :type stop: int
            '''

            if isinstance(question_value_range, QuestionValueRange):
                self.set_start(question_value_range.start)
                self.set_step(question_value_range.step)
                self.set_stop(question_value_range.stop)
            elif isinstance(question_value_range, dict):
                for key, value in question_value_range.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(question_value_range)
            return self

        @start.setter
        def start(self, start):
            '''
            :type start: int
            '''

            self.set_start(start)

        @step.setter
        def step(self, step):
            '''
            :type step: int
            '''

            self.set_step(step)

        @stop.setter
        def stop(self, stop):
            '''
            :type stop: int
            '''

            self.set_stop(stop)

    class FieldMetadata(object):
        START = None
        STEP = None
        STOP = None

        def __init__(self, name, type_, validation):
            object.__init__(self)
            self.__name = name
            self.__type = type_
            self.__validation = validation

        @property
        def name(self):
            return self.__name

        def __repr__(self):
            return self.__name

        def __str__(self):
            return self.__name

        @property
        def type(self):
            return self.__type

        @property
        def validation(self):
            return self.__validation

        @classmethod
        def values(cls):
            return (cls.START, cls.STEP, cls.STOP,)

    FieldMetadata.START = FieldMetadata('start', int, None)
    FieldMetadata.STEP = FieldMetadata('step', int, None)
    FieldMetadata.STOP = FieldMetadata('stop', int, None)

    def __init__(
        self,
        start,
        step,
        stop,
    ):
        '''
        :type start: int
        :type step: int
        :type stop: int
        '''

        if start is None:
            raise ValueError('start is required')
        if not isinstance(start, int):
            raise TypeError("expected start to be a int but it is a %s" % getattr(__builtin__, 'type')(start))
        self.__start = start

        if step is None:
            raise ValueError('step is required')
        if not isinstance(step, int):
            raise TypeError("expected step to be a int but it is a %s" % getattr(__builtin__, 'type')(step))
        self.__step = step

        if stop is None:
            raise ValueError('stop is required')
        if not isinstance(stop, int):
            raise TypeError("expected stop to be a int but it is a %s" % getattr(__builtin__, 'type')(stop))
        self.__stop = stop

    def __eq__(self, other):
        if self.start != other.start:
            return False
        if self.step != other.step:
            return False
        if self.stop != other.stop:
            return False
        return True

    def __hash__(self):
        return hash((self.start,self.step,self.stop,))

    def __iter__(self):
        return iter((self.start, self.step, self.stop,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('start=' + repr(self.start))
        field_reprs.append('step=' + repr(self.step))
        field_reprs.append('stop=' + repr(self.stop))
        return 'QuestionValueRange(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('start=' + repr(self.start))
        field_reprs.append('step=' + repr(self.step))
        field_reprs.append('stop=' + repr(self.stop))
        return 'QuestionValueRange(' + ', '.join(field_reprs) + ')'

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.qa.question_value_range.QuestionValueRange
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'start':
                init_kwds['start'] = iprot.read_i32()
            elif ifield_name == 'step':
                init_kwds['step'] = iprot.read_i32()
            elif ifield_name == 'stop':
                init_kwds['stop'] = iprot.read_i32()
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        start=None,
        step=None,
        stop=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type start: int or None
        :type step: int or None
        :type stop: int or None
        :rtype: dressdiscover.api.models.qa.question_value_range.QuestionValueRange
        '''

        if start is None:
            start = self.start
        if step is None:
            step = self.step
        if stop is None:
            stop = self.stop
        return self.__class__(start=start, step=step, stop=stop)

    @property
    def start(self):
        '''
        :rtype: int
        '''

        return self.__start

    @property
    def step(self):
        '''
        :rtype: int
        '''

        return self.__step

    @property
    def stop(self):
        '''
        :rtype: int
        '''

        return self.__stop

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.qa.question_value_range.QuestionValueRange
        '''

        oprot.write_struct_begin('QuestionValueRange')

        oprot.write_field_begin(name='start', type=8, id=None)
        oprot.write_i32(self.start)
        oprot.write_field_end()

        oprot.write_field_begin(name='step', type=8, id=None)
        oprot.write_i32(self.step)
        oprot.write_field_end()

        oprot.write_field_begin(name='stop', type=8, id=None)
        oprot.write_i32(self.stop)
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
