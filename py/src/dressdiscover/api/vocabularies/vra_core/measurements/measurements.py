import __builtin__
import dressdiscover.api.vocabularies.vra_core.measurements.measurements_type
import dressdiscover.api.vocabularies.vra_core.measurements.measurements_unit


class Measurements(object):
    class Builder(object):
        def __init__(
            self,
            text=None,
            type=None,  # @ReservedAssignment
            extent=None,
            unit=None,
        ):
            '''
            :type text: str
            :type type: dressdiscover.api.vocabularies.vra_core.measurements.measurements_type.MeasurementsType
            :type extent: str or None
            :type unit: dressdiscover.api.vocabularies.vra_core.measurements.measurements_unit.MeasurementsUnit or None
            '''

            self.__text = text
            self.__type = type
            self.__extent = extent
            self.__unit = unit

        def build(self):
            return Measurements(text=self.__text, type=self.__type, extent=self.__extent, unit=self.__unit)

        @property
        def extent(self):
            '''
            :rtype: str
            '''

            return self.__extent

        def set_extent(self, extent):
            '''
            :type extent: str or None
            '''

            if extent is not None:
                if not isinstance(extent, basestring):
                    raise TypeError("expected extent to be a str but it is a %s" % getattr(__builtin__, 'type')(extent))
                if len(extent) < 1:
                    raise ValueError("expected len(extent) to be >= 1, was %d" % len(extent))
            self.__extent = extent
            return self

        def set_text(self, text):
            '''
            :type text: str
            '''

            if text is None:
                raise ValueError('text is required')
            if not isinstance(text, basestring):
                raise TypeError("expected text to be a str but it is a %s" % getattr(__builtin__, 'type')(text))
            if len(text) < 1:
                raise ValueError("expected len(text) to be >= 1, was %d" % len(text))
            self.__text = text
            return self

        def set_type(self, type):  # @ReservedAssignment
            '''
            :type type: dressdiscover.api.vocabularies.vra_core.measurements.measurements_type.MeasurementsType
            '''

            if type is None:
                raise ValueError('type is required')
            if not isinstance(type, dressdiscover.api.vocabularies.vra_core.measurements.measurements_type.MeasurementsType):
                raise TypeError("expected type to be a dressdiscover.api.vocabularies.vra_core.measurements.measurements_type.MeasurementsType but it is a %s" % getattr(__builtin__, 'type')(type))
            self.__type = type
            return self

        def set_unit(self, unit):
            '''
            :type unit: dressdiscover.api.vocabularies.vra_core.measurements.measurements_unit.MeasurementsUnit or None
            '''

            if unit is not None:
                if not isinstance(unit, dressdiscover.api.vocabularies.vra_core.measurements.measurements_unit.MeasurementsUnit):
                    raise TypeError("expected unit to be a dressdiscover.api.vocabularies.vra_core.measurements.measurements_unit.MeasurementsUnit but it is a %s" % getattr(__builtin__, 'type')(unit))
            self.__unit = unit
            return self

        @property
        def text(self):
            '''
            :rtype: str
            '''

            return self.__text

        @property
        def type(self):  # @ReservedAssignment
            '''
            :rtype: dressdiscover.api.vocabularies.vra_core.measurements.measurements_type.MeasurementsType
            '''

            return self.__type

        @property
        def unit(self):
            '''
            :rtype: dressdiscover.api.vocabularies.vra_core.measurements.measurements_unit.MeasurementsUnit
            '''

            return self.__unit

        def update(self, measurements):
            '''
            :type text: str
            :type type: dressdiscover.api.vocabularies.vra_core.measurements.measurements_type.MeasurementsType
            :type extent: str or None
            :type unit: dressdiscover.api.vocabularies.vra_core.measurements.measurements_unit.MeasurementsUnit or None
            '''

            if isinstance(measurements, Measurements):
                self.set_text(measurements.text)
                self.set_type(measurements.type)
                self.set_extent(measurements.extent)
                self.set_unit(measurements.unit)
            elif isinstance(measurements, dict):
                for key, value in measurements.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(measurements)
            return self

        @extent.setter
        def extent(self, extent):
            '''
            :type extent: str or None
            '''

            self.set_extent(extent)

        @text.setter
        def text(self, text):
            '''
            :type text: str
            '''

            self.set_text(text)

        @type.setter
        def type(self, type):  # @ReservedAssignment
            '''
            :type type: dressdiscover.api.vocabularies.vra_core.measurements.measurements_type.MeasurementsType
            '''

            self.set_type(type)

        @unit.setter
        def unit(self, unit):
            '''
            :type unit: dressdiscover.api.vocabularies.vra_core.measurements.measurements_unit.MeasurementsUnit or None
            '''

            self.set_unit(unit)

    class FieldMetadata(object):
        TEXT = None
        TYPE = None
        EXTENT = None
        UNIT = None

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
            return (cls.TEXT, cls.TYPE, cls.EXTENT, cls.UNIT,)

    FieldMetadata.TEXT = FieldMetadata('text', str, {u'minLength': 1})
    FieldMetadata.TYPE = FieldMetadata('type', dressdiscover.api.vocabularies.vra_core.measurements.measurements_type.MeasurementsType, None)
    FieldMetadata.EXTENT = FieldMetadata('extent', str, {u'minLength': 1})
    FieldMetadata.UNIT = FieldMetadata('unit', dressdiscover.api.vocabularies.vra_core.measurements.measurements_unit.MeasurementsUnit, None)

    def __init__(
        self,
        text,
        type,  # @ReservedAssignment
        extent=None,
        unit=None,
    ):
        '''
        :type text: str
        :type type: dressdiscover.api.vocabularies.vra_core.measurements.measurements_type.MeasurementsType
        :type extent: str or None
        :type unit: dressdiscover.api.vocabularies.vra_core.measurements.measurements_unit.MeasurementsUnit or None
        '''

        if text is None:
            raise ValueError('text is required')
        if not isinstance(text, basestring):
            raise TypeError("expected text to be a str but it is a %s" % getattr(__builtin__, 'type')(text))
        if len(text) < 1:
            raise ValueError("expected len(text) to be >= 1, was %d" % len(text))
        self.__text = text

        if type is None:
            raise ValueError('type is required')
        if not isinstance(type, dressdiscover.api.vocabularies.vra_core.measurements.measurements_type.MeasurementsType):
            raise TypeError("expected type to be a dressdiscover.api.vocabularies.vra_core.measurements.measurements_type.MeasurementsType but it is a %s" % getattr(__builtin__, 'type')(type))
        self.__type = type

        if extent is not None:
            if not isinstance(extent, basestring):
                raise TypeError("expected extent to be a str but it is a %s" % getattr(__builtin__, 'type')(extent))
            if len(extent) < 1:
                raise ValueError("expected len(extent) to be >= 1, was %d" % len(extent))
        self.__extent = extent

        if unit is not None:
            if not isinstance(unit, dressdiscover.api.vocabularies.vra_core.measurements.measurements_unit.MeasurementsUnit):
                raise TypeError("expected unit to be a dressdiscover.api.vocabularies.vra_core.measurements.measurements_unit.MeasurementsUnit but it is a %s" % getattr(__builtin__, 'type')(unit))
        self.__unit = unit

    def __eq__(self, other):
        if self.text != other.text:
            return False
        if self.type != other.type:
            return False
        if self.extent != other.extent:
            return False
        if self.unit != other.unit:
            return False
        return True

    def __hash__(self):
        return hash((self.text,self.type,self.extent,self.unit,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        field_reprs.append('type=' + repr(self.type))
        if self.extent is not None:
            field_reprs.append('extent=' + "'" + self.extent.encode('ascii', 'replace') + "'")
        if self.unit is not None:
            field_reprs.append('unit=' + repr(self.unit))
        return 'Measurements(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        field_reprs.append('type=' + repr(self.type))
        if self.extent is not None:
            field_reprs.append('extent=' + "'" + self.extent.encode('ascii', 'replace') + "'")
        if self.unit is not None:
            field_reprs.append('unit=' + repr(self.unit))
        return 'Measurements(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'text': self.text, 'type': self.type, 'extent': self.extent, 'unit': self.unit}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.text, self.type, self.extent, self.unit,)

    @property
    def extent(self):
        '''
        :rtype: str
        '''

        return self.__extent

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.vocabularies.vra_core.measurements.measurements.Measurements
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'text' and ifield_id == 1:
                init_kwds['text'] = iprot.read_string()
            elif ifield_name == 'type' and ifield_id == 2:
                init_kwds['type'] = dressdiscover.api.vocabularies.vra_core.measurements.measurements_type.MeasurementsType.value_of(iprot.read_string().strip().upper())
            elif ifield_name == 'extent' and ifield_id == 3:
                try:
                    init_kwds['extent'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'unit' and ifield_id == 4:
                try:
                    init_kwds['unit'] = dressdiscover.api.vocabularies.vra_core.measurements.measurements_unit.MeasurementsUnit.value_of(iprot.read_string().strip().upper())
                except (TypeError,):
                    pass
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        text=None,
        type=None,  # @ReservedAssignment
        extent=None,
        unit=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type text: str or None
        :type type: dressdiscover.api.vocabularies.vra_core.measurements.measurements_type.MeasurementsType or None
        :type extent: str or None
        :type unit: dressdiscover.api.vocabularies.vra_core.measurements.measurements_unit.MeasurementsUnit or None
        :rtype: dressdiscover.api.vocabularies.vra_core.measurements.measurements.Measurements
        '''

        if text is None:
            text = self.text
        if type is None:
            type = self.type  # @ReservedAssignment
        if extent is None:
            extent = self.extent
        if unit is None:
            unit = self.unit
        return self.__class__(text=text, type=type, extent=extent, unit=unit)

    @property
    def text(self):
        '''
        :rtype: str
        '''

        return self.__text

    @property
    def type(self):  # @ReservedAssignment
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.measurements.measurements_type.MeasurementsType
        '''

        return self.__type

    @property
    def unit(self):
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.measurements.measurements_unit.MeasurementsUnit
        '''

        return self.__unit

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.vocabularies.vra_core.measurements.measurements.Measurements
        '''

        oprot.write_struct_begin('Measurements')

        oprot.write_field_begin(name='text', type=11, id=1)
        oprot.write_string(self.text)
        oprot.write_field_end()

        oprot.write_field_begin(name='type', type=11, id=2)
        oprot.write_string(str(self.type))
        oprot.write_field_end()

        if self.extent is not None:
            oprot.write_field_begin(name='extent', type=11, id=3)
            oprot.write_string(self.extent)
            oprot.write_field_end()

        if self.unit is not None:
            oprot.write_field_begin(name='unit', type=11, id=4)
            oprot.write_string(str(self.unit))
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
