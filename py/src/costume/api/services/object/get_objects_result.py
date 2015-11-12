from itertools import ifilterfalse
import __builtin__
import costume.api.models.object.object_entry


class GetObjectsResult(object):
    class Builder(object):
        def __init__(
            self,
            collection_hits=None,
            institution_hits=None,
            objects=None,
            total_hits=None,
        ):
            '''
            :type collection_hits: dict(str: int)
            :type institution_hits: dict(str: int)
            :type objects: tuple(costume.api.models.object.object_entry.ObjectEntry)
            :type total_hits: int
            '''

            self.__collection_hits = collection_hits
            self.__institution_hits = institution_hits
            self.__objects = objects
            self.__total_hits = total_hits

        def build(self):
            return GetObjectsResult(collection_hits=self.__collection_hits, institution_hits=self.__institution_hits, objects=self.__objects, total_hits=self.__total_hits)

        @property
        def collection_hits(self):
            '''
            :rtype: dict(str: int)
            '''

            return self.__collection_hits.copy() if self.__collection_hits is not None else None

        @property
        def institution_hits(self):
            '''
            :rtype: dict(str: int)
            '''

            return self.__institution_hits.copy() if self.__institution_hits is not None else None

        @property
        def objects(self):
            '''
            :rtype: tuple(costume.api.models.object.object_entry.ObjectEntry)
            '''

            return self.__objects

        def set_collection_hits(self, collection_hits):
            '''
            :type collection_hits: dict(str: int)
            '''

            self.__collection_hits = collection_hits
            return self

        def set_institution_hits(self, institution_hits):
            '''
            :type institution_hits: dict(str: int)
            '''

            self.__institution_hits = institution_hits
            return self

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
            :type collection_hits: dict(str: int)
            :type institution_hits: dict(str: int)
            :type objects: tuple(costume.api.models.object.object_entry.ObjectEntry)
            :type total_hits: int
            '''

            if isinstance(get_objects_result, GetObjectsResult):
                self.set_collection_hits(get_objects_result.collection_hits)
                self.set_institution_hits(get_objects_result.institution_hits)
                self.set_objects(get_objects_result.objects)
                self.set_total_hits(get_objects_result.total_hits)
            elif isinstance(get_objects_result, dict):
                for key, value in get_objects_result.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(get_objects_result)
            return self

        @collection_hits.setter
        def collection_hits(self, collection_hits):
            '''
            :type collection_hits: dict(str: int)
            '''

            self.set_collection_hits(collection_hits)

        @institution_hits.setter
        def institution_hits(self, institution_hits):
            '''
            :type institution_hits: dict(str: int)
            '''

            self.set_institution_hits(institution_hits)

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
        collection_hits,
        institution_hits,
        objects,
        total_hits,
    ):
        '''
        :type collection_hits: dict(str: int)
        :type institution_hits: dict(str: int)
        :type objects: tuple(costume.api.models.object.object_entry.ObjectEntry)
        :type total_hits: int
        '''

        if collection_hits is None:
            raise ValueError('collection_hits is required')
        if not (isinstance(collection_hits, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], (int, long)) and __item[1] >= 0, collection_hits.iteritems()))) == 0):
            raise TypeError("expected collection_hits to be a dict(str: int) but it is a %s" % getattr(__builtin__, 'type')(collection_hits))
        self.__collection_hits = collection_hits.copy() if collection_hits is not None else None

        if institution_hits is None:
            raise ValueError('institution_hits is required')
        if not (isinstance(institution_hits, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], (int, long)) and __item[1] >= 0, institution_hits.iteritems()))) == 0):
            raise TypeError("expected institution_hits to be a dict(str: int) but it is a %s" % getattr(__builtin__, 'type')(institution_hits))
        self.__institution_hits = institution_hits.copy() if institution_hits is not None else None

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
        if self.collection_hits != other.collection_hits:
            return False
        if self.institution_hits != other.institution_hits:
            return False
        if self.objects != other.objects:
            return False
        if self.total_hits != other.total_hits:
            return False
        return True

    def __hash__(self):
        return hash((self.collection_hits,self.institution_hits,self.objects,self.total_hits,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('collection_hits=' + repr(self.collection_hits))
        field_reprs.append('institution_hits=' + repr(self.institution_hits))
        field_reprs.append('objects=' + repr(self.objects))
        field_reprs.append('total_hits=' + repr(self.total_hits))
        return 'GetObjectsResult(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('collection_hits=' + repr(self.collection_hits))
        field_reprs.append('institution_hits=' + repr(self.institution_hits))
        field_reprs.append('objects=' + repr(self.objects))
        field_reprs.append('total_hits=' + repr(self.total_hits))
        return 'GetObjectsResult(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'collection_hits': self.collection_hits, 'institution_hits': self.institution_hits, 'objects': self.objects, 'total_hits': self.total_hits}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.collection_hits, self.institution_hits, self.objects, self.total_hits,)

    @property
    def collection_hits(self):
        '''
        :rtype: dict(str: int)
        '''

        return self.__collection_hits.copy() if self.__collection_hits is not None else None

    @property
    def institution_hits(self):
        '''
        :rtype: dict(str: int)
        '''

        return self.__institution_hits.copy() if self.__institution_hits is not None else None

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
            elif ifield_name == 'collection_hits':
                init_kwds['collection_hits'] = dict([(iprot.read_string(), iprot.read_u32()) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            elif ifield_name == 'institution_hits':
                init_kwds['institution_hits'] = dict([(iprot.read_string(), iprot.read_u32()) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            elif ifield_name == 'objects':
                init_kwds['objects'] = tuple([costume.api.models.object.object_entry.ObjectEntry.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'total_hits':
                init_kwds['total_hits'] = iprot.read_u32()
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        collection_hits=None,
        institution_hits=None,
        objects=None,
        total_hits=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type collection_hits: dict(str: int) or None
        :type institution_hits: dict(str: int) or None
        :type objects: tuple(costume.api.models.object.object_entry.ObjectEntry) or None
        :type total_hits: int or None
        :rtype: costume.api.services.object.get_objects_result.GetObjectsResult
        '''

        if collection_hits is None:
            collection_hits = self.collection_hits
        if institution_hits is None:
            institution_hits = self.institution_hits
        if objects is None:
            objects = self.objects
        if total_hits is None:
            total_hits = self.total_hits
        return self.__class__(collection_hits=collection_hits, institution_hits=institution_hits, objects=objects, total_hits=total_hits)

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

        oprot.write_field_begin(name='collection_hits', type=13, id=None)
        oprot.write_map_begin(11, len(self.collection_hits), 8)
        for __key0, __value0 in self.collection_hits.iteritems():
            oprot.write_string(__key0)
            oprot.write_u32(__value0)
        oprot.write_map_end()
        oprot.write_field_end()

        oprot.write_field_begin(name='institution_hits', type=13, id=None)
        oprot.write_map_begin(11, len(self.institution_hits), 8)
        for __key0, __value0 in self.institution_hits.iteritems():
            oprot.write_string(__key0)
            oprot.write_u32(__value0)
        oprot.write_map_end()
        oprot.write_field_end()

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
