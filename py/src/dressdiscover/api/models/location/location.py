from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.models.location.location_coordinates
import dressdiscover.api.models.location.location_name
import dressdiscover.api.models.location.location_refid
import dressdiscover.api.models.location.location_type


class Location(object):
    class Builder(object):
        def __init__(
            self,
            type=None,  # @ReservedAssignment
            coordinates=None,
            names=None,
            refids=None,
        ):
            '''
            :type type: dressdiscover.api.models.location.location_type.LocationType
            :type coordinates: dressdiscover.api.models.location.location_coordinates.LocationCoordinates or None
            :type names: tuple(dressdiscover.api.models.location.location_name.LocationName) or None
            :type refids: tuple(dressdiscover.api.models.location.location_refid.LocationRefid) or None
            '''

            self.__type = type
            self.__coordinates = coordinates
            self.__names = names
            self.__refids = refids

        def build(self):
            return Location(type=self.__type, coordinates=self.__coordinates, names=self.__names, refids=self.__refids)

        @property
        def coordinates(self):
            '''
            :rtype: dressdiscover.api.models.location.location_coordinates.LocationCoordinates
            '''

            return self.__coordinates

        @property
        def names(self):
            '''
            :rtype: tuple(dressdiscover.api.models.location.location_name.LocationName)
            '''

            return self.__names

        @property
        def refids(self):
            '''
            :rtype: tuple(dressdiscover.api.models.location.location_refid.LocationRefid)
            '''

            return self.__refids

        def set_coordinates(self, coordinates):
            '''
            :type coordinates: dressdiscover.api.models.location.location_coordinates.LocationCoordinates or None
            '''

            self.__coordinates = coordinates
            return self

        def set_names(self, names):
            '''
            :type names: tuple(dressdiscover.api.models.location.location_name.LocationName) or None
            '''

            self.__names = names
            return self

        def set_refids(self, refids):
            '''
            :type refids: tuple(dressdiscover.api.models.location.location_refid.LocationRefid) or None
            '''

            self.__refids = refids
            return self

        def set_type(self, type):  # @ReservedAssignment
            '''
            :type type: dressdiscover.api.models.location.location_type.LocationType
            '''

            self.__type = type
            return self

        @property
        def type(self):  # @ReservedAssignment
            '''
            :rtype: dressdiscover.api.models.location.location_type.LocationType
            '''

            return self.__type

        def update(self, location):
            '''
            :type type: dressdiscover.api.models.location.location_type.LocationType
            :type coordinates: dressdiscover.api.models.location.location_coordinates.LocationCoordinates or None
            :type names: tuple(dressdiscover.api.models.location.location_name.LocationName) or None
            :type refids: tuple(dressdiscover.api.models.location.location_refid.LocationRefid) or None
            '''

            if isinstance(location, Location):
                self.set_type(location.type)
                self.set_coordinates(location.coordinates)
                self.set_names(location.names)
                self.set_refids(location.refids)
            elif isinstance(location, dict):
                for key, value in location.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(location)
            return self

        @coordinates.setter
        def coordinates(self, coordinates):
            '''
            :type coordinates: dressdiscover.api.models.location.location_coordinates.LocationCoordinates or None
            '''

            self.set_coordinates(coordinates)

        @names.setter
        def names(self, names):
            '''
            :type names: tuple(dressdiscover.api.models.location.location_name.LocationName) or None
            '''

            self.set_names(names)

        @refids.setter
        def refids(self, refids):
            '''
            :type refids: tuple(dressdiscover.api.models.location.location_refid.LocationRefid) or None
            '''

            self.set_refids(refids)

        @type.setter
        def type(self, type):  # @ReservedAssignment
            '''
            :type type: dressdiscover.api.models.location.location_type.LocationType
            '''

            self.set_type(type)

    def __init__(
        self,
        type,  # @ReservedAssignment
        coordinates=None,
        names=None,
        refids=None,
    ):
        '''
        :type type: dressdiscover.api.models.location.location_type.LocationType
        :type coordinates: dressdiscover.api.models.location.location_coordinates.LocationCoordinates or None
        :type names: tuple(dressdiscover.api.models.location.location_name.LocationName) or None
        :type refids: tuple(dressdiscover.api.models.location.location_refid.LocationRefid) or None
        '''

        if type is None:
            raise ValueError('type is required')
        if not isinstance(type, dressdiscover.api.models.location.location_type.LocationType):
            raise TypeError("expected type to be a dressdiscover.api.models.location.location_type.LocationType but it is a %s" % getattr(__builtin__, 'type')(type))
        self.__type = type

        if coordinates is not None:
            if not isinstance(coordinates, dressdiscover.api.models.location.location_coordinates.LocationCoordinates):
                raise TypeError("expected coordinates to be a dressdiscover.api.models.location.location_coordinates.LocationCoordinates but it is a %s" % getattr(__builtin__, 'type')(coordinates))
        self.__coordinates = coordinates

        if names is not None:
            if not (isinstance(names, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.location.location_name.LocationName), names))) == 0):
                raise TypeError("expected names to be a tuple(dressdiscover.api.models.location.location_name.LocationName) but it is a %s" % getattr(__builtin__, 'type')(names))
            if len(names) < 1:
                raise ValueError("expected len(names) to be >= 1, was %d" % len(names))
        self.__names = names

        if refids is not None:
            if not (isinstance(refids, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.location.location_refid.LocationRefid), refids))) == 0):
                raise TypeError("expected refids to be a tuple(dressdiscover.api.models.location.location_refid.LocationRefid) but it is a %s" % getattr(__builtin__, 'type')(refids))
            if len(refids) < 1:
                raise ValueError("expected len(refids) to be >= 1, was %d" % len(refids))
        self.__refids = refids

    def __eq__(self, other):
        if self.type != other.type:
            return False
        if self.coordinates != other.coordinates:
            return False
        if self.names != other.names:
            return False
        if self.refids != other.refids:
            return False
        return True

    def __hash__(self):
        return hash((self.type,self.coordinates,self.names,self.refids,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('type=' + repr(self.type))
        if self.coordinates is not None:
            field_reprs.append('coordinates=' + repr(self.coordinates))
        if self.names is not None:
            field_reprs.append('names=' + repr(self.names))
        if self.refids is not None:
            field_reprs.append('refids=' + repr(self.refids))
        return 'Location(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('type=' + repr(self.type))
        if self.coordinates is not None:
            field_reprs.append('coordinates=' + repr(self.coordinates))
        if self.names is not None:
            field_reprs.append('names=' + repr(self.names))
        if self.refids is not None:
            field_reprs.append('refids=' + repr(self.refids))
        return 'Location(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'type': self.type, 'coordinates': self.coordinates, 'names': self.names, 'refids': self.refids}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.type, self.coordinates, self.names, self.refids,)

    @property
    def coordinates(self):
        '''
        :rtype: dressdiscover.api.models.location.location_coordinates.LocationCoordinates
        '''

        return self.__coordinates

    @property
    def names(self):
        '''
        :rtype: tuple(dressdiscover.api.models.location.location_name.LocationName)
        '''

        return self.__names

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.location.location.Location
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'type' and ifield_id == 1:
                init_kwds['type'] = dressdiscover.api.models.location.location_type.LocationType.value_of(iprot.read_string().strip().upper())
            elif ifield_name == 'coordinates' and ifield_id == 4:
                init_kwds['coordinates'] = dressdiscover.api.models.location.location_coordinates.LocationCoordinates.read(iprot)
            elif ifield_name == 'names' and ifield_id == 2:
                init_kwds['names'] = tuple([dressdiscover.api.models.location.location_name.LocationName.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'refids' and ifield_id == 3:
                init_kwds['refids'] = tuple([dressdiscover.api.models.location.location_refid.LocationRefid.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    @property
    def refids(self):
        '''
        :rtype: tuple(dressdiscover.api.models.location.location_refid.LocationRefid)
        '''

        return self.__refids

    def replace(
        self,
        type=None,  # @ReservedAssignment
        coordinates=None,
        names=None,
        refids=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type type: dressdiscover.api.models.location.location_type.LocationType or None
        :type coordinates: dressdiscover.api.models.location.location_coordinates.LocationCoordinates or None
        :type names: tuple(dressdiscover.api.models.location.location_name.LocationName) or None
        :type refids: tuple(dressdiscover.api.models.location.location_refid.LocationRefid) or None
        :rtype: dressdiscover.api.models.location.location.Location
        '''

        if type is None:
            type = self.type  # @ReservedAssignment
        if coordinates is None:
            coordinates = self.coordinates
        if names is None:
            names = self.names
        if refids is None:
            refids = self.refids
        return self.__class__(type=type, coordinates=coordinates, names=names, refids=refids)

    @property
    def type(self):  # @ReservedAssignment
        '''
        :rtype: dressdiscover.api.models.location.location_type.LocationType
        '''

        return self.__type

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.location.location.Location
        '''

        oprot.write_struct_begin('Location')

        oprot.write_field_begin(name='type', type=11, id=1)
        oprot.write_string(str(self.type))
        oprot.write_field_end()

        if self.coordinates is not None:
            oprot.write_field_begin(name='coordinates', type=12, id=4)
            self.coordinates.write(oprot)
            oprot.write_field_end()

        if self.names is not None:
            oprot.write_field_begin(name='names', type=15, id=2)
            oprot.write_list_begin(12, len(self.names))
            for _0 in self.names:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.refids is not None:
            oprot.write_field_begin(name='refids', type=15, id=3)
            oprot.write_list_begin(12, len(self.refids))
            for _0 in self.refids:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
