import __builtin__
import dressdiscover.api.vocabularies.vra_core.textref.textref_name
import dressdiscover.api.vocabularies.vra_core.textref.textref_refid


class Textref(object):
    class Builder(object):
        def __init__(
            self,
            name=None,
            refid=None,
        ):
            '''
            :type name: dressdiscover.api.vocabularies.vra_core.textref.textref_name.TextrefName
            :type refid: dressdiscover.api.vocabularies.vra_core.textref.textref_refid.TextrefRefid
            '''

            self.__name = name
            self.__refid = refid

        def build(self):
            return Textref(name=self.__name, refid=self.__refid)

        @property
        def name(self):
            '''
            :rtype: dressdiscover.api.vocabularies.vra_core.textref.textref_name.TextrefName
            '''

            return self.__name

        @property
        def refid(self):
            '''
            :rtype: dressdiscover.api.vocabularies.vra_core.textref.textref_refid.TextrefRefid
            '''

            return self.__refid

        def set_name(self, name):
            '''
            :type name: dressdiscover.api.vocabularies.vra_core.textref.textref_name.TextrefName
            '''

            if name is None:
                raise ValueError('name is required')
            if not isinstance(name, dressdiscover.api.vocabularies.vra_core.textref.textref_name.TextrefName):
                raise TypeError("expected name to be a dressdiscover.api.vocabularies.vra_core.textref.textref_name.TextrefName but it is a %s" % getattr(__builtin__, 'type')(name))
            self.__name = name
            return self

        def set_refid(self, refid):
            '''
            :type refid: dressdiscover.api.vocabularies.vra_core.textref.textref_refid.TextrefRefid
            '''

            if refid is None:
                raise ValueError('refid is required')
            if not isinstance(refid, dressdiscover.api.vocabularies.vra_core.textref.textref_refid.TextrefRefid):
                raise TypeError("expected refid to be a dressdiscover.api.vocabularies.vra_core.textref.textref_refid.TextrefRefid but it is a %s" % getattr(__builtin__, 'type')(refid))
            self.__refid = refid
            return self

        def update(self, textref):
            '''
            :type name: dressdiscover.api.vocabularies.vra_core.textref.textref_name.TextrefName
            :type refid: dressdiscover.api.vocabularies.vra_core.textref.textref_refid.TextrefRefid
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
            :type name: dressdiscover.api.vocabularies.vra_core.textref.textref_name.TextrefName
            '''

            self.set_name(name)

        @refid.setter
        def refid(self, refid):
            '''
            :type refid: dressdiscover.api.vocabularies.vra_core.textref.textref_refid.TextrefRefid
            '''

            self.set_refid(refid)

    class FieldMetadata(object):
        NAME = None
        REFID = None

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
            return (cls.NAME, cls.REFID,)

    FieldMetadata.NAME = FieldMetadata('name', dressdiscover.api.vocabularies.vra_core.textref.textref_name.TextrefName, None)
    FieldMetadata.REFID = FieldMetadata('refid', dressdiscover.api.vocabularies.vra_core.textref.textref_refid.TextrefRefid, None)

    def __init__(
        self,
        name,
        refid,
    ):
        '''
        :type name: dressdiscover.api.vocabularies.vra_core.textref.textref_name.TextrefName
        :type refid: dressdiscover.api.vocabularies.vra_core.textref.textref_refid.TextrefRefid
        '''

        if name is None:
            raise ValueError('name is required')
        if not isinstance(name, dressdiscover.api.vocabularies.vra_core.textref.textref_name.TextrefName):
            raise TypeError("expected name to be a dressdiscover.api.vocabularies.vra_core.textref.textref_name.TextrefName but it is a %s" % getattr(__builtin__, 'type')(name))
        self.__name = name

        if refid is None:
            raise ValueError('refid is required')
        if not isinstance(refid, dressdiscover.api.vocabularies.vra_core.textref.textref_refid.TextrefRefid):
            raise TypeError("expected refid to be a dressdiscover.api.vocabularies.vra_core.textref.textref_refid.TextrefRefid but it is a %s" % getattr(__builtin__, 'type')(refid))
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
        return iter((self.name, self.refid,))

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

    @property
    def name(self):
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.textref.textref_name.TextrefName
        '''

        return self.__name

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.vocabularies.vra_core.textref.textref.Textref
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'name' and ifield_id == 1:
                init_kwds['name'] = dressdiscover.api.vocabularies.vra_core.textref.textref_name.TextrefName.read(iprot)
            elif ifield_name == 'refid' and ifield_id == 2:
                init_kwds['refid'] = dressdiscover.api.vocabularies.vra_core.textref.textref_refid.TextrefRefid.read(iprot)
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    @property
    def refid(self):
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.textref.textref_refid.TextrefRefid
        '''

        return self.__refid

    def replace(
        self,
        name=None,
        refid=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type name: dressdiscover.api.vocabularies.vra_core.textref.textref_name.TextrefName or None
        :type refid: dressdiscover.api.vocabularies.vra_core.textref.textref_refid.TextrefRefid or None
        :rtype: dressdiscover.api.vocabularies.vra_core.textref.textref.Textref
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
        :rtype: dressdiscover.api.vocabularies.vra_core.textref.textref.Textref
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
