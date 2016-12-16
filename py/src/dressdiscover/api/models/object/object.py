from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.models.image.image
import dressdiscover.api.vocabularies.costume_core.costume_core_object
import dressdiscover.api.vocabularies.dublin_core.dublin_core_object
import dressdiscover.api.vocabularies.vra_core.vra_core_object


class Object(object):
    class Builder(object):
        def __init__(
            self,
            costume_core=None,
            dublin_core=None,
            hidden=None,
            images=None,
            vra_core=None,
        ):
            '''
            :type costume_core: dressdiscover.api.vocabularies.costume_core.costume_core_object.CostumeCoreObject or None
            :type dublin_core: dressdiscover.api.vocabularies.dublin_core.dublin_core_object.DublinCoreObject or None
            :type hidden: bool or None
            :type images: tuple(dressdiscover.api.models.image.image.Image) or None
            :type vra_core: dressdiscover.api.vocabularies.vra_core.vra_core_object.VraCoreObject or None
            '''

            self.__costume_core = costume_core
            self.__dublin_core = dublin_core
            self.__hidden = hidden
            self.__images = images
            self.__vra_core = vra_core

        def build(self):
            return Object(costume_core=self.__costume_core, dublin_core=self.__dublin_core, hidden=self.__hidden, images=self.__images, vra_core=self.__vra_core)

        @property
        def costume_core(self):
            '''
            :rtype: dressdiscover.api.vocabularies.costume_core.costume_core_object.CostumeCoreObject
            '''

            return self.__costume_core

        @property
        def dublin_core(self):
            '''
            :rtype: dressdiscover.api.vocabularies.dublin_core.dublin_core_object.DublinCoreObject
            '''

            return self.__dublin_core

        @property
        def hidden(self):
            '''
            :rtype: bool
            '''

            return self.__hidden

        @property
        def images(self):
            '''
            :rtype: tuple(dressdiscover.api.models.image.image.Image)
            '''

            return self.__images

        def set_costume_core(self, costume_core):
            '''
            :type costume_core: dressdiscover.api.vocabularies.costume_core.costume_core_object.CostumeCoreObject or None
            '''

            if costume_core is not None:
                if not isinstance(costume_core, dressdiscover.api.vocabularies.costume_core.costume_core_object.CostumeCoreObject):
                    raise TypeError("expected costume_core to be a dressdiscover.api.vocabularies.costume_core.costume_core_object.CostumeCoreObject but it is a %s" % getattr(__builtin__, 'type')(costume_core))
            self.__costume_core = costume_core
            return self

        def set_dublin_core(self, dublin_core):
            '''
            :type dublin_core: dressdiscover.api.vocabularies.dublin_core.dublin_core_object.DublinCoreObject or None
            '''

            if dublin_core is not None:
                if not isinstance(dublin_core, dressdiscover.api.vocabularies.dublin_core.dublin_core_object.DublinCoreObject):
                    raise TypeError("expected dublin_core to be a dressdiscover.api.vocabularies.dublin_core.dublin_core_object.DublinCoreObject but it is a %s" % getattr(__builtin__, 'type')(dublin_core))
            self.__dublin_core = dublin_core
            return self

        def set_hidden(self, hidden):
            '''
            :type hidden: bool or None
            '''

            if hidden is not None:
                if not isinstance(hidden, bool):
                    raise TypeError("expected hidden to be a bool but it is a %s" % getattr(__builtin__, 'type')(hidden))
                if hidden is not True:
                    raise ValueError("expected hidden to be True, was %s" % hidden)
            self.__hidden = hidden
            return self

        def set_images(self, images):
            '''
            :type images: tuple(dressdiscover.api.models.image.image.Image) or None
            '''

            if images is not None:
                if not (isinstance(images, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.image.image.Image), images))) == 0):
                    raise TypeError("expected images to be a tuple(dressdiscover.api.models.image.image.Image) but it is a %s" % getattr(__builtin__, 'type')(images))
                if len(images) < 1:
                    raise ValueError("expected len(images) to be >= 1, was %d" % len(images))
            self.__images = images
            return self

        def set_vra_core(self, vra_core):
            '''
            :type vra_core: dressdiscover.api.vocabularies.vra_core.vra_core_object.VraCoreObject or None
            '''

            if vra_core is not None:
                if not isinstance(vra_core, dressdiscover.api.vocabularies.vra_core.vra_core_object.VraCoreObject):
                    raise TypeError("expected vra_core to be a dressdiscover.api.vocabularies.vra_core.vra_core_object.VraCoreObject but it is a %s" % getattr(__builtin__, 'type')(vra_core))
            self.__vra_core = vra_core
            return self

        def update(self, object):
            '''
            :type costume_core: dressdiscover.api.vocabularies.costume_core.costume_core_object.CostumeCoreObject or None
            :type dublin_core: dressdiscover.api.vocabularies.dublin_core.dublin_core_object.DublinCoreObject or None
            :type hidden: bool or None
            :type images: tuple(dressdiscover.api.models.image.image.Image) or None
            :type vra_core: dressdiscover.api.vocabularies.vra_core.vra_core_object.VraCoreObject or None
            '''

            if isinstance(object, Object):
                self.set_costume_core(object.costume_core)
                self.set_dublin_core(object.dublin_core)
                self.set_hidden(object.hidden)
                self.set_images(object.images)
                self.set_vra_core(object.vra_core)
            elif isinstance(object, dict):
                for key, value in object.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(object)
            return self

        @property
        def vra_core(self):
            '''
            :rtype: dressdiscover.api.vocabularies.vra_core.vra_core_object.VraCoreObject
            '''

            return self.__vra_core

        @costume_core.setter
        def costume_core(self, costume_core):
            '''
            :type costume_core: dressdiscover.api.vocabularies.costume_core.costume_core_object.CostumeCoreObject or None
            '''

            self.set_costume_core(costume_core)

        @dublin_core.setter
        def dublin_core(self, dublin_core):
            '''
            :type dublin_core: dressdiscover.api.vocabularies.dublin_core.dublin_core_object.DublinCoreObject or None
            '''

            self.set_dublin_core(dublin_core)

        @hidden.setter
        def hidden(self, hidden):
            '''
            :type hidden: bool or None
            '''

            self.set_hidden(hidden)

        @images.setter
        def images(self, images):
            '''
            :type images: tuple(dressdiscover.api.models.image.image.Image) or None
            '''

            self.set_images(images)

        @vra_core.setter
        def vra_core(self, vra_core):
            '''
            :type vra_core: dressdiscover.api.vocabularies.vra_core.vra_core_object.VraCoreObject or None
            '''

            self.set_vra_core(vra_core)

    class FieldMetadata(object):
        COSTUME_CORE = None
        DUBLIN_CORE = None
        HIDDEN = None
        IMAGES = None
        VRA_CORE = None

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
            return (cls.COSTUME_CORE, cls.DUBLIN_CORE, cls.HIDDEN, cls.IMAGES, cls.VRA_CORE,)

    FieldMetadata.COSTUME_CORE = FieldMetadata('costume_core', dressdiscover.api.vocabularies.costume_core.costume_core_object.CostumeCoreObject, None)
    FieldMetadata.DUBLIN_CORE = FieldMetadata('dublin_core', dressdiscover.api.vocabularies.dublin_core.dublin_core_object.DublinCoreObject, None)
    FieldMetadata.HIDDEN = FieldMetadata('hidden', bool, {u'acceptance': True})
    FieldMetadata.IMAGES = FieldMetadata('images', tuple, {u'minLength': 1})
    FieldMetadata.VRA_CORE = FieldMetadata('vra_core', dressdiscover.api.vocabularies.vra_core.vra_core_object.VraCoreObject, None)

    def __init__(
        self,
        costume_core=None,
        dublin_core=None,
        hidden=None,
        images=None,
        vra_core=None,
    ):
        '''
        :type costume_core: dressdiscover.api.vocabularies.costume_core.costume_core_object.CostumeCoreObject or None
        :type dublin_core: dressdiscover.api.vocabularies.dublin_core.dublin_core_object.DublinCoreObject or None
        :type hidden: bool or None
        :type images: tuple(dressdiscover.api.models.image.image.Image) or None
        :type vra_core: dressdiscover.api.vocabularies.vra_core.vra_core_object.VraCoreObject or None
        '''

        if costume_core is not None:
            if not isinstance(costume_core, dressdiscover.api.vocabularies.costume_core.costume_core_object.CostumeCoreObject):
                raise TypeError("expected costume_core to be a dressdiscover.api.vocabularies.costume_core.costume_core_object.CostumeCoreObject but it is a %s" % getattr(__builtin__, 'type')(costume_core))
        self.__costume_core = costume_core

        if dublin_core is not None:
            if not isinstance(dublin_core, dressdiscover.api.vocabularies.dublin_core.dublin_core_object.DublinCoreObject):
                raise TypeError("expected dublin_core to be a dressdiscover.api.vocabularies.dublin_core.dublin_core_object.DublinCoreObject but it is a %s" % getattr(__builtin__, 'type')(dublin_core))
        self.__dublin_core = dublin_core

        if hidden is not None:
            if not isinstance(hidden, bool):
                raise TypeError("expected hidden to be a bool but it is a %s" % getattr(__builtin__, 'type')(hidden))
            if hidden is not True:
                raise ValueError("expected hidden to be True, was %s" % hidden)
        self.__hidden = hidden

        if images is not None:
            if not (isinstance(images, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.image.image.Image), images))) == 0):
                raise TypeError("expected images to be a tuple(dressdiscover.api.models.image.image.Image) but it is a %s" % getattr(__builtin__, 'type')(images))
            if len(images) < 1:
                raise ValueError("expected len(images) to be >= 1, was %d" % len(images))
        self.__images = images

        if vra_core is not None:
            if not isinstance(vra_core, dressdiscover.api.vocabularies.vra_core.vra_core_object.VraCoreObject):
                raise TypeError("expected vra_core to be a dressdiscover.api.vocabularies.vra_core.vra_core_object.VraCoreObject but it is a %s" % getattr(__builtin__, 'type')(vra_core))
        self.__vra_core = vra_core

    def __eq__(self, other):
        if self.costume_core != other.costume_core:
            return False
        if self.dublin_core != other.dublin_core:
            return False
        if self.hidden != other.hidden:
            return False
        if self.images != other.images:
            return False
        if self.vra_core != other.vra_core:
            return False
        return True

    def __hash__(self):
        return hash((self.costume_core,self.dublin_core,self.hidden,self.images,self.vra_core,))

    def __iter__(self):
        return iter((self.costume_core, self.dublin_core, self.hidden, self.images, self.vra_core,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.costume_core is not None:
            field_reprs.append('costume_core=' + repr(self.costume_core))
        if self.dublin_core is not None:
            field_reprs.append('dublin_core=' + repr(self.dublin_core))
        if self.hidden is not None:
            field_reprs.append('hidden=' + repr(self.hidden))
        if self.images is not None:
            field_reprs.append('images=' + repr(self.images))
        if self.vra_core is not None:
            field_reprs.append('vra_core=' + repr(self.vra_core))
        return 'Object(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.costume_core is not None:
            field_reprs.append('costume_core=' + repr(self.costume_core))
        if self.dublin_core is not None:
            field_reprs.append('dublin_core=' + repr(self.dublin_core))
        if self.hidden is not None:
            field_reprs.append('hidden=' + repr(self.hidden))
        if self.images is not None:
            field_reprs.append('images=' + repr(self.images))
        if self.vra_core is not None:
            field_reprs.append('vra_core=' + repr(self.vra_core))
        return 'Object(' + ', '.join(field_reprs) + ')'

    @property
    def costume_core(self):
        '''
        :rtype: dressdiscover.api.vocabularies.costume_core.costume_core_object.CostumeCoreObject
        '''

        return self.__costume_core

    @property
    def dublin_core(self):
        '''
        :rtype: dressdiscover.api.vocabularies.dublin_core.dublin_core_object.DublinCoreObject
        '''

        return self.__dublin_core

    @property
    def hidden(self):
        '''
        :rtype: bool
        '''

        return self.__hidden

    @property
    def images(self):
        '''
        :rtype: tuple(dressdiscover.api.models.image.image.Image)
        '''

        return self.__images

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.object.object.Object
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'costume_core' and ifield_id == 1:
                init_kwds['costume_core'] = dressdiscover.api.vocabularies.costume_core.costume_core_object.CostumeCoreObject.read(iprot)
            elif ifield_name == 'dublin_core' and ifield_id == 2:
                init_kwds['dublin_core'] = dressdiscover.api.vocabularies.dublin_core.dublin_core_object.DublinCoreObject.read(iprot)
            elif ifield_name == 'hidden' and ifield_id == 3:
                try:
                    init_kwds['hidden'] = iprot.read_bool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'images' and ifield_id == 4:
                init_kwds['images'] = tuple([dressdiscover.api.models.image.image.Image.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'vra_core' and ifield_id == 6:
                init_kwds['vra_core'] = dressdiscover.api.vocabularies.vra_core.vra_core_object.VraCoreObject.read(iprot)
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        costume_core=None,
        dublin_core=None,
        hidden=None,
        images=None,
        vra_core=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type costume_core: dressdiscover.api.vocabularies.costume_core.costume_core_object.CostumeCoreObject or None
        :type dublin_core: dressdiscover.api.vocabularies.dublin_core.dublin_core_object.DublinCoreObject or None
        :type hidden: bool or None
        :type images: tuple(dressdiscover.api.models.image.image.Image) or None
        :type vra_core: dressdiscover.api.vocabularies.vra_core.vra_core_object.VraCoreObject or None
        :rtype: dressdiscover.api.models.object.object.Object
        '''

        if costume_core is None:
            costume_core = self.costume_core
        if dublin_core is None:
            dublin_core = self.dublin_core
        if hidden is None:
            hidden = self.hidden
        if images is None:
            images = self.images
        if vra_core is None:
            vra_core = self.vra_core
        return self.__class__(costume_core=costume_core, dublin_core=dublin_core, hidden=hidden, images=images, vra_core=vra_core)

    @property
    def vra_core(self):
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.vra_core_object.VraCoreObject
        '''

        return self.__vra_core

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.object.object.Object
        '''

        oprot.write_struct_begin('Object')

        if self.costume_core is not None:
            oprot.write_field_begin(name='costume_core', type=12, id=1)
            self.costume_core.write(oprot)
            oprot.write_field_end()

        if self.dublin_core is not None:
            oprot.write_field_begin(name='dublin_core', type=12, id=2)
            self.dublin_core.write(oprot)
            oprot.write_field_end()

        if self.hidden is not None:
            oprot.write_field_begin(name='hidden', type=2, id=3)
            oprot.write_bool(self.hidden)
            oprot.write_field_end()

        if self.images is not None:
            oprot.write_field_begin(name='images', type=15, id=4)
            oprot.write_list_begin(12, len(self.images))
            for _0 in self.images:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.vra_core is not None:
            oprot.write_field_begin(name='vra_core', type=12, id=6)
            self.vra_core.write(oprot)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
