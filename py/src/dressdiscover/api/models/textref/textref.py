import __builtin__
import costume.api.models.textref.textref_name
import costume.api.models.textref.textref_refid


class Textref(object):
    class Builder(object):
        def __init__(
            self,
            name=None,
            refid=None,
        ):
            '''
            :type name: costume.api.models.textref.textref_name.TextrefName
            :type refid: costume.api.models.textref.textref_refid.TextrefRefid
            '''

            self.__name = name
            self.__refid = refid

        def build(self):
            return Textref(name=self.__name, refid=self.__refid)

        @property
        def name(self):
            '''
            :rtype: costume.api.models.textref.textref_name.TextrefName
            '''

            return self.__name

        @property
        def refid(self):
            '''
            :rtype: costume.api.models.textref.textref_refid.TextrefRefid
            '''

            return self.__refid

        def set_name(self, name):
            '''
            :type name: costume.api.models.textref.textref_name.TextrefName
            '''

            self.__name = name
            return self

        def set_refid(self, refid):
            '''
            :type refid: costume.api.models.textref.textref_refid.TextrefRefid
            '''

            self.__refid = refid
            return self

        def update(self, textref):
            '''
            :type name: costume.api.models.textref.textref_name.TextrefName
            :type refid: costume.api.models.textref.textref_refid.TextrefRefid
            '''

            if isinstance(textref, Textref):
                self.set_name(textref.name)
                self.set_refid(textref.refid)
            elif isinstance(textref, dict):
                for key, value in textref.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(textref)
            return self

        @name.setter
        def name(self, name):
            '''
            :type name: costume.api.models.textref.textref_name.TextrefName
            '''

            self.set_name(name)

        @refid.setter
        def refid(self, refid):
            '''
            :type refid: costume.api.models.textref.textref_refid.TextrefRefid
            '''

            self.set_refid(refid)

    def __init__(
        self,
        name,
        refid,
    ):
        '''
        :type name: costume.api.models.textref.textref_name.TextrefName
        :type refid: costume.api.models.textref.textref_refid.TextrefRefid
        '''

        if name is None:
            raise ValueError('name is required')
        if not isinstance(name, costume.api.models.textref.textref_name.TextrefName):
            raise TypeError("expected name to be a costume.api.models.textref.textref_name.TextrefName but it is a %s" % getattr(__builtin__, 'type')(name))
        self.__name = name

        if refid is None:
            raise ValueError('refid is required')
        if not isinstance(refid, costume.api.models.textref.textref_refid.TextrefRefid):
            raise TypeError("expected refid to be a costume.api.models.textref.textref_refid.TextrefRefid but it is a %s" % getattr(__builtin__, 'type')(refid))
        self.__refid = refid

    def __eq__(self, other):
        if self.name != other.name:
            return False
        if self.refid != other.refid:
            return False
        return True

    def __hash__(self):
        return hash((self.name,self.refid,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('name=' + repr(self.name))
        field_reprs.append('refid=' + repr(self.refid))
        return 'Textref(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('name=' + repr(self.name))
        field_reprs.append('refid=' + repr(self.refid))
        return 'Textref(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'name': self.name, 'refid': self.refid}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.name, self.refid,)

    @property
    def name(self):
        '''
        :rtype: costume.api.models.textref.textref_name.TextrefName
        '''

        return self.__name

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: costume.api.models.textref.textref.Textref
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'name' and ifield_id == 1:
                init_kwds['name'] = costume.api.models.textref.textref_name.TextrefName.read(iprot)
            elif ifield_name == 'refid' and ifield_id == 2:
                init_kwds['refid'] = costume.api.models.textref.textref_refid.TextrefRefid.read(iprot)
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    @property
    def refid(self):
        '''
        :rtype: costume.api.models.textref.textref_refid.TextrefRefid
        '''

        return self.__refid

    def replace(
        self,
        name=None,
        refid=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type name: costume.api.models.textref.textref_name.TextrefName or None
        :type refid: costume.api.models.textref.textref_refid.TextrefRefid or None
        :rtype: costume.api.models.textref.textref.Textref
        '''

        if name is None:
            name = self.name
        if refid is None:
            refid = self.refid
        return self.__class__(name=name, refid=refid)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.models.textref.textref.Textref
        '''

        oprot.write_struct_begin('Textref')

        oprot.write_field_begin(name='name', type=12, id=1)
        self.name.write(oprot)
        oprot.write_field_end()

        oprot.write_field_begin(name='refid', type=12, id=2)
        self.refid.write(oprot)
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
