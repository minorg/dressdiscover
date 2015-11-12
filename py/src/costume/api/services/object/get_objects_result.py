from itertools import ifilterfalse
import __builtin__
import costume.api.models.object.object_entry


class GetObjectsResult(object):
    class Builder(object):
        def __init__(
            self,
            objects=None,
            total_hits=None,
        ):
            '''
            :type objects: tuple(costume.api.models.object.object_entry.ObjectEntry)
            :type total_hits: int
            '''

            self.__objects = objects
            self.__total_hits = total_hits

        def build(self):
            return GetObjectsResult(objects=self.__objects, total_hits=self.__total_hits)

        @property
        def objects(self):
            '''
            :rtype: tuple(costume.api.models.object.object_entry.ObjectEntry)
            '''

            return self.__objects

        def set_objects(self, objects):
            '''
            :type objects: tuple(costume.api.models.object.object_entry.ObjectEntry)
            '''

            self.__objects = objects
            return self

        def set_total_hits(self, total_hits):
            '''
            :type total_hits: int
            '''

            self.__total_hits = total_hits
            return self

        @property
        def total_hits(self):
            '''
            :rtype: int
            '''

            return self.__total_hits

        def update(self, get_objects_result):
            '''
            :type objects: tuple(costume.api.models.object.object_entry.ObjectEntry)
            :type total_hits: int
            '''

            if isinstance(get_objects_result, GetObjectsResult):
                self.set_objects(get_objects_result.objects)
                self.set_total_hits(get_objects_result.total_hits)
            elif isinstance(get_objects_result, dict):
                for key, value in get_objects_result.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(get_objects_result)
            return self

        @objects.setter
        def objects(self, objects):
            '''
            :type objects: tuple(costume.api.models.object.object_entry.ObjectEntry)
            '''

            self.set_objects(objects)

        @total_hits.setter
        def total_hits(self, total_hits):
            '''
            :type total_hits: int
            '''

            self.set_total_hits(total_hits)

    def __init__(
        self,
        objects,
        total_hits,
    ):
        '''
        :type objects: tuple(costume.api.models.object.object_entry.ObjectEntry)
        :type total_hits: int
        '''

        if objects is None:
            raise ValueError('objects is required')
        if not (isinstance(objects, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, costume.api.models.object.object_entry.ObjectEntry), objects))) == 0):
            raise TypeError("expected objects to be a tuple(costume.api.models.object.object_entry.ObjectEntry) but it is a %s" % getattr(__builtin__, 'type')(objects))
        self.__objects = objects

        if total_hits is None:
            raise ValueError('total_hits is required')
        if not isinstance(total_hits, (int, long)) and total_hits >= 0:
            raise TypeError("expected total_hits to be a int but it is a %s" % getattr(__builtin__, 'type')(total_hits))
        self.__total_hits = total_hits

    def __eq__(self, other):
        if self.objects != other.objects:
            return False
        if self.total_hits != other.total_hits:
            return False
        return True

    def __hash__(self):
        return hash((self.objects,self.total_hits,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('objects=' + repr(self.objects))
        field_reprs.append('total_hits=' + repr(self.total_hits))
        return 'GetObjectsResult(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('objects=' + repr(self.objects))
        field_reprs.append('total_hits=' + repr(self.total_hits))
        return 'GetObjectsResult(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'objects': self.objects, 'total_hits': self.total_hits}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.objects, self.total_hits,)

    @property
    def objects(self):
        '''
        :rtype: tuple(costume.api.models.object.object_entry.ObjectEntry)
        '''

        return self.__objects

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: costume.api.services.object.get_objects_result.GetObjectsResult
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'objects':
                init_kwds['objects'] = tuple([costume.api.models.object.object_entry.ObjectEntry.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'total_hits':
                init_kwds['total_hits'] = iprot.read_u32()
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        objects=None,
        total_hits=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type objects: tuple(costume.api.models.object.object_entry.ObjectEntry) or None
        :type total_hits: int or None
        :rtype: costume.api.services.object.get_objects_result.GetObjectsResult
        '''

        if objects is None:
            objects = self.objects
        if total_hits is None:
            total_hits = self.total_hits
        return self.__class__(objects=objects, total_hits=total_hits)

    @property
    def total_hits(self):
        '''
        :rtype: int
        '''

        return self.__total_hits

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.services.object.get_objects_result.GetObjectsResult
        '''

        oprot.write_struct_begin('GetObjectsResult')

        oprot.write_field_begin(name='objects', type=15, id=None)
        oprot.write_list_begin(12, len(self.objects))
        for _0 in self.objects:
            _0.write(oprot)
        oprot.write_list_end()
        oprot.write_field_end()

        oprot.write_field_begin(name='total_hits', type=8, id=None)
        oprot.write_u32(self.total_hits)
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
