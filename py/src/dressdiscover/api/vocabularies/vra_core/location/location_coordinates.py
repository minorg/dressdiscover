from __future__ import absolute_import; import decimal
import __builtin__


class LocationCoordinates(object):
    class Builder(object):
        def __init__(
            self,
            latitude=None,
            longitude=None,
        ):
            '''
            :type latitude: Decimal
            :type longitude: Decimal
            '''

            self.__latitude = latitude
            self.__longitude = longitude

        def build(self):
            return LocationCoordinates(latitude=self.__latitude, longitude=self.__longitude)

        @property
        def latitude(self):
            '''
            :rtype: Decimal
            '''

            return self.__latitude

        @property
        def longitude(self):
            '''
            :rtype: Decimal
            '''

            return self.__longitude

        def set_latitude(self, latitude):
            '''
            :type latitude: Decimal
            '''

            if latitude is None:
                raise ValueError('latitude is required')
            if not isinstance(latitude, decimal.Decimal):
                raise TypeError("expected latitude to be a Decimal but it is a %s" % getattr(__builtin__, 'type')(latitude))
            self.__latitude = latitude
            return self

        def set_longitude(self, longitude):
            '''
            :type longitude: Decimal
            '''

            if longitude is None:
                raise ValueError('longitude is required')
            if not isinstance(longitude, decimal.Decimal):
                raise TypeError("expected longitude to be a Decimal but it is a %s" % getattr(__builtin__, 'type')(longitude))
            self.__longitude = longitude
            return self

        def update(self, location_coordinates):
            '''
            :type latitude: Decimal
            :type longitude: Decimal
            '''

            if isinstance(location_coordinates, LocationCoordinates):
                self.set_latitude(location_coordinates.latitude)
                self.set_longitude(location_coordinates.longitude)
            elif isinstance(location_coordinates, dict):
                for key, value in location_coordinates.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(location_coordinates)
            return self

        @latitude.setter
        def latitude(self, latitude):
            '''
            :type latitude: Decimal
            '''

            self.set_latitude(latitude)

        @longitude.setter
        def longitude(self, longitude):
            '''
            :type longitude: Decimal
            '''

            self.set_longitude(longitude)

    class FieldMetadata(object):
        LATITUDE = None
        LONGITUDE = None

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
            return (cls.LATITUDE, cls.LONGITUDE,)

    FieldMetadata.LATITUDE = FieldMetadata('latitude', decimal.Decimal, None)
    FieldMetadata.LONGITUDE = FieldMetadata('longitude', decimal.Decimal, None)

    def __init__(
        self,
        latitude,
        longitude,
    ):
        '''
        :type latitude: Decimal
        :type longitude: Decimal
        '''

        if latitude is None:
            raise ValueError('latitude is required')
        if not isinstance(latitude, decimal.Decimal):
            raise TypeError("expected latitude to be a Decimal but it is a %s" % getattr(__builtin__, 'type')(latitude))
        self.__latitude = latitude

        if longitude is None:
            raise ValueError('longitude is required')
        if not isinstance(longitude, decimal.Decimal):
            raise TypeError("expected longitude to be a Decimal but it is a %s" % getattr(__builtin__, 'type')(longitude))
        self.__longitude = longitude

    def __eq__(self, other):
        if self.latitude != other.latitude:
            return False
        if self.longitude != other.longitude:
            return False
        return True

    def __hash__(self):
        return hash((self.latitude,self.longitude,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('latitude=' + repr(self.latitude))
        field_reprs.append('longitude=' + repr(self.longitude))
        return 'LocationCoordinates(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('latitude=' + repr(self.latitude))
        field_reprs.append('longitude=' + repr(self.longitude))
        return 'LocationCoordinates(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'latitude': self.latitude, 'longitude': self.longitude}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.latitude, self.longitude,)

    @property
    def latitude(self):
        '''
        :rtype: Decimal
        '''

        return self.__latitude

    @property
    def longitude(self):
        '''
        :rtype: Decimal
        '''

        return self.__longitude

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.vocabularies.vra_core.location.location_coordinates.LocationCoordinates
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'latitude' and ifield_id == 1:
                init_kwds['latitude'] = iprot.read_decimal()
            elif ifield_name == 'longitude' and ifield_id == 2:
                init_kwds['longitude'] = iprot.read_decimal()
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        latitude=None,
        longitude=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type latitude: Decimal or None
        :type longitude: Decimal or None
        :rtype: dressdiscover.api.vocabularies.vra_core.location.location_coordinates.LocationCoordinates
        '''

        if latitude is None:
            latitude = self.latitude
        if longitude is None:
            longitude = self.longitude
        return self.__class__(latitude=latitude, longitude=longitude)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.vocabularies.vra_core.location.location_coordinates.LocationCoordinates
        '''

        oprot.write_struct_begin('LocationCoordinates')

        oprot.write_field_begin(name='latitude', type=11, id=1)
        oprot.write_decimal(self.latitude)
        oprot.write_field_end()

        oprot.write_field_begin(name='longitude', type=11, id=2)
        oprot.write_decimal(self.longitude)
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
