from datetime import datetime
import __builtin__


class ModelMetadata(object):
    class Builder(object):
        def __init__(
            self,
            ctime=None,
            mtime=None,
        ):
            '''
            :type ctime: datetime
            :type mtime: datetime
            '''

            self.__ctime = ctime
            self.__mtime = mtime

        def build(self):
            return ModelMetadata(ctime=self.__ctime, mtime=self.__mtime)

        @property
        def ctime(self):
            '''
            :rtype: datetime
            '''

            return self.__ctime

        @property
        def mtime(self):
            '''
            :rtype: datetime
            '''

            return self.__mtime

        def set_ctime(self, ctime):
            '''
            :type ctime: datetime
            '''

            self.__ctime = ctime
            return self

        def set_mtime(self, mtime):
            '''
            :type mtime: datetime
            '''

            self.__mtime = mtime
            return self

        def update(self, model_metadata):
            '''
            :type ctime: datetime
            :type mtime: datetime
            '''

            if isinstance(model_metadata, ModelMetadata):
                self.set_ctime(model_metadata.ctime)
                self.set_mtime(model_metadata.mtime)
            elif isinstance(model_metadata, dict):
                for key, value in model_metadata.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(model_metadata)
            return self

        @ctime.setter
        def ctime(self, ctime):
            '''
            :type ctime: datetime
            '''

            self.set_ctime(ctime)

        @mtime.setter
        def mtime(self, mtime):
            '''
            :type mtime: datetime
            '''

            self.set_mtime(mtime)

    def __init__(
        self,
        ctime,
        mtime,
    ):
        '''
        :type ctime: datetime
        :type mtime: datetime
        '''

        if ctime is None:
            raise ValueError('ctime is required')
        if not isinstance(ctime, datetime):
            raise TypeError("expected ctime to be a datetime but it is a %s" % getattr(__builtin__, 'type')(ctime))
        self.__ctime = ctime

        if mtime is None:
            raise ValueError('mtime is required')
        if not isinstance(mtime, datetime):
            raise TypeError("expected mtime to be a datetime but it is a %s" % getattr(__builtin__, 'type')(mtime))
        self.__mtime = mtime

    def __eq__(self, other):
        if self.ctime != other.ctime:
            return False
        if self.mtime != other.mtime:
            return False
        return True

    def __hash__(self):
        return hash((self.ctime,self.mtime,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('ctime=' + repr(self.ctime))
        field_reprs.append('mtime=' + repr(self.mtime))
        return 'ModelMetadata(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('ctime=' + repr(self.ctime))
        field_reprs.append('mtime=' + repr(self.mtime))
        return 'ModelMetadata(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'ctime': self.ctime, 'mtime': self.mtime}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.ctime, self.mtime,)

    @property
    def ctime(self):
        '''
        :rtype: datetime
        '''

        return self.__ctime

    @property
    def mtime(self):
        '''
        :rtype: datetime
        '''

        return self.__mtime

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: costume.api.models.model_metadata.ModelMetadata
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'ctime' and ifield_id == 1:
                init_kwds['ctime'] = iprot.read_date_time()
            elif ifield_name == 'mtime' and ifield_id == 2:
                init_kwds['mtime'] = iprot.read_date_time()
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        ctime=None,
        mtime=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type ctime: datetime or None
        :type mtime: datetime or None
        :rtype: costume.api.models.model_metadata.ModelMetadata
        '''

        if ctime is None:
            ctime = self.ctime
        if mtime is None:
            mtime = self.mtime
        return self.__class__(ctime=ctime, mtime=mtime)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.models.model_metadata.ModelMetadata
        '''

        oprot.write_struct_begin('ModelMetadata')

        oprot.write_field_begin(name='ctime', type=10, id=1)
        oprot.write_date_time(self.ctime)
        oprot.write_field_end()

        oprot.write_field_begin(name='mtime', type=10, id=2)
        oprot.write_date_time(self.mtime)
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
