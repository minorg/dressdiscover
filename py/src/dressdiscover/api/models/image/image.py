import __builtin__
import dressdiscover.api.models.image.image_version
import dressdiscover.api.vocabularies.vra_core.rights.rights_set


class Image(object):
    class Builder(object):
        def __init__(
            self,
            full_size=None,
            original=None,
            rights=None,
            square_thumbnail=None,
            thumbnail=None,
        ):
            '''
            :type full_size: dressdiscover.api.models.image.image_version.ImageVersion or None
            :type original: dressdiscover.api.models.image.image_version.ImageVersion or None
            :type rights: dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet or None
            :type square_thumbnail: dressdiscover.api.models.image.image_version.ImageVersion or None
            :type thumbnail: dressdiscover.api.models.image.image_version.ImageVersion or None
            '''

            self.__full_size = full_size
            self.__original = original
            self.__rights = rights
            self.__square_thumbnail = square_thumbnail
            self.__thumbnail = thumbnail

        def build(self):
            return Image(full_size=self.__full_size, original=self.__original, rights=self.__rights, square_thumbnail=self.__square_thumbnail, thumbnail=self.__thumbnail)

        @property
        def full_size(self):
            '''
            :rtype: dressdiscover.api.models.image.image_version.ImageVersion
            '''

            return self.__full_size

        @property
        def original(self):
            '''
            :rtype: dressdiscover.api.models.image.image_version.ImageVersion
            '''

            return self.__original

        @property
        def rights(self):
            '''
            :rtype: dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet
            '''

            return self.__rights

        def set_full_size(self, full_size):
            '''
            :type full_size: dressdiscover.api.models.image.image_version.ImageVersion or None
            '''

            if full_size is not None:
                if not isinstance(full_size, dressdiscover.api.models.image.image_version.ImageVersion):
                    raise TypeError("expected full_size to be a dressdiscover.api.models.image.image_version.ImageVersion but it is a %s" % getattr(__builtin__, 'type')(full_size))
            self.__full_size = full_size
            return self

        def set_original(self, original):
            '''
            :type original: dressdiscover.api.models.image.image_version.ImageVersion or None
            '''

            if original is not None:
                if not isinstance(original, dressdiscover.api.models.image.image_version.ImageVersion):
                    raise TypeError("expected original to be a dressdiscover.api.models.image.image_version.ImageVersion but it is a %s" % getattr(__builtin__, 'type')(original))
            self.__original = original
            return self

        def set_rights(self, rights):
            '''
            :type rights: dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet or None
            '''

            if rights is not None:
                if not isinstance(rights, dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet):
                    raise TypeError("expected rights to be a dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet but it is a %s" % getattr(__builtin__, 'type')(rights))
            self.__rights = rights
            return self

        def set_square_thumbnail(self, square_thumbnail):
            '''
            :type square_thumbnail: dressdiscover.api.models.image.image_version.ImageVersion or None
            '''

            if square_thumbnail is not None:
                if not isinstance(square_thumbnail, dressdiscover.api.models.image.image_version.ImageVersion):
                    raise TypeError("expected square_thumbnail to be a dressdiscover.api.models.image.image_version.ImageVersion but it is a %s" % getattr(__builtin__, 'type')(square_thumbnail))
            self.__square_thumbnail = square_thumbnail
            return self

        def set_thumbnail(self, thumbnail):
            '''
            :type thumbnail: dressdiscover.api.models.image.image_version.ImageVersion or None
            '''

            if thumbnail is not None:
                if not isinstance(thumbnail, dressdiscover.api.models.image.image_version.ImageVersion):
                    raise TypeError("expected thumbnail to be a dressdiscover.api.models.image.image_version.ImageVersion but it is a %s" % getattr(__builtin__, 'type')(thumbnail))
            self.__thumbnail = thumbnail
            return self

        @property
        def square_thumbnail(self):
            '''
            :rtype: dressdiscover.api.models.image.image_version.ImageVersion
            '''

            return self.__square_thumbnail

        @property
        def thumbnail(self):
            '''
            :rtype: dressdiscover.api.models.image.image_version.ImageVersion
            '''

            return self.__thumbnail

        def update(self, image):
            '''
            :type full_size: dressdiscover.api.models.image.image_version.ImageVersion or None
            :type original: dressdiscover.api.models.image.image_version.ImageVersion or None
            :type rights: dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet or None
            :type square_thumbnail: dressdiscover.api.models.image.image_version.ImageVersion or None
            :type thumbnail: dressdiscover.api.models.image.image_version.ImageVersion or None
            '''

            if isinstance(image, Image):
                self.set_full_size(image.full_size)
                self.set_original(image.original)
                self.set_rights(image.rights)
                self.set_square_thumbnail(image.square_thumbnail)
                self.set_thumbnail(image.thumbnail)
            elif isinstance(image, dict):
                for key, value in image.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(image)
            return self

        @full_size.setter
        def full_size(self, full_size):
            '''
            :type full_size: dressdiscover.api.models.image.image_version.ImageVersion or None
            '''

            self.set_full_size(full_size)

        @original.setter
        def original(self, original):
            '''
            :type original: dressdiscover.api.models.image.image_version.ImageVersion or None
            '''

            self.set_original(original)

        @rights.setter
        def rights(self, rights):
            '''
            :type rights: dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet or None
            '''

            self.set_rights(rights)

        @square_thumbnail.setter
        def square_thumbnail(self, square_thumbnail):
            '''
            :type square_thumbnail: dressdiscover.api.models.image.image_version.ImageVersion or None
            '''

            self.set_square_thumbnail(square_thumbnail)

        @thumbnail.setter
        def thumbnail(self, thumbnail):
            '''
            :type thumbnail: dressdiscover.api.models.image.image_version.ImageVersion or None
            '''

            self.set_thumbnail(thumbnail)

    class FieldMetadata(object):
        FULL_SIZE = None
        ORIGINAL = None
        RIGHTS = None
        SQUARE_THUMBNAIL = None
        THUMBNAIL = None

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
            return (cls.FULL_SIZE, cls.ORIGINAL, cls.RIGHTS, cls.SQUARE_THUMBNAIL, cls.THUMBNAIL,)

    FieldMetadata.FULL_SIZE = FieldMetadata('full_size', dressdiscover.api.models.image.image_version.ImageVersion, None)
    FieldMetadata.ORIGINAL = FieldMetadata('original', dressdiscover.api.models.image.image_version.ImageVersion, None)
    FieldMetadata.RIGHTS = FieldMetadata('rights', dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet, None)
    FieldMetadata.SQUARE_THUMBNAIL = FieldMetadata('square_thumbnail', dressdiscover.api.models.image.image_version.ImageVersion, None)
    FieldMetadata.THUMBNAIL = FieldMetadata('thumbnail', dressdiscover.api.models.image.image_version.ImageVersion, None)

    def __init__(
        self,
        full_size=None,
        original=None,
        rights=None,
        square_thumbnail=None,
        thumbnail=None,
    ):
        '''
        :type full_size: dressdiscover.api.models.image.image_version.ImageVersion or None
        :type original: dressdiscover.api.models.image.image_version.ImageVersion or None
        :type rights: dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet or None
        :type square_thumbnail: dressdiscover.api.models.image.image_version.ImageVersion or None
        :type thumbnail: dressdiscover.api.models.image.image_version.ImageVersion or None
        '''

        if full_size is not None:
            if not isinstance(full_size, dressdiscover.api.models.image.image_version.ImageVersion):
                raise TypeError("expected full_size to be a dressdiscover.api.models.image.image_version.ImageVersion but it is a %s" % getattr(__builtin__, 'type')(full_size))
        self.__full_size = full_size

        if original is not None:
            if not isinstance(original, dressdiscover.api.models.image.image_version.ImageVersion):
                raise TypeError("expected original to be a dressdiscover.api.models.image.image_version.ImageVersion but it is a %s" % getattr(__builtin__, 'type')(original))
        self.__original = original

        if rights is not None:
            if not isinstance(rights, dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet):
                raise TypeError("expected rights to be a dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet but it is a %s" % getattr(__builtin__, 'type')(rights))
        self.__rights = rights

        if square_thumbnail is not None:
            if not isinstance(square_thumbnail, dressdiscover.api.models.image.image_version.ImageVersion):
                raise TypeError("expected square_thumbnail to be a dressdiscover.api.models.image.image_version.ImageVersion but it is a %s" % getattr(__builtin__, 'type')(square_thumbnail))
        self.__square_thumbnail = square_thumbnail

        if thumbnail is not None:
            if not isinstance(thumbnail, dressdiscover.api.models.image.image_version.ImageVersion):
                raise TypeError("expected thumbnail to be a dressdiscover.api.models.image.image_version.ImageVersion but it is a %s" % getattr(__builtin__, 'type')(thumbnail))
        self.__thumbnail = thumbnail

    def __eq__(self, other):
        if self.full_size != other.full_size:
            return False
        if self.original != other.original:
            return False
        if self.rights != other.rights:
            return False
        if self.square_thumbnail != other.square_thumbnail:
            return False
        if self.thumbnail != other.thumbnail:
            return False
        return True

    def __hash__(self):
        return hash((self.full_size,self.original,self.rights,self.square_thumbnail,self.thumbnail,))

    def __iter__(self):
        return iter((self.full_size, self.original, self.rights, self.square_thumbnail, self.thumbnail,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.full_size is not None:
            field_reprs.append('full_size=' + repr(self.full_size))
        if self.original is not None:
            field_reprs.append('original=' + repr(self.original))
        if self.rights is not None:
            field_reprs.append('rights=' + repr(self.rights))
        if self.square_thumbnail is not None:
            field_reprs.append('square_thumbnail=' + repr(self.square_thumbnail))
        if self.thumbnail is not None:
            field_reprs.append('thumbnail=' + repr(self.thumbnail))
        return 'Image(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.full_size is not None:
            field_reprs.append('full_size=' + repr(self.full_size))
        if self.original is not None:
            field_reprs.append('original=' + repr(self.original))
        if self.rights is not None:
            field_reprs.append('rights=' + repr(self.rights))
        if self.square_thumbnail is not None:
            field_reprs.append('square_thumbnail=' + repr(self.square_thumbnail))
        if self.thumbnail is not None:
            field_reprs.append('thumbnail=' + repr(self.thumbnail))
        return 'Image(' + ', '.join(field_reprs) + ')'

    @property
    def full_size(self):
        '''
        :rtype: dressdiscover.api.models.image.image_version.ImageVersion
        '''

        return self.__full_size

    @property
    def original(self):
        '''
        :rtype: dressdiscover.api.models.image.image_version.ImageVersion
        '''

        return self.__original

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.image.image.Image
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'full_size' and ifield_id == 2:
                init_kwds['full_size'] = dressdiscover.api.models.image.image_version.ImageVersion.read(iprot)
            elif ifield_name == 'original' and ifield_id == 3:
                init_kwds['original'] = dressdiscover.api.models.image.image_version.ImageVersion.read(iprot)
            elif ifield_name == 'rights' and ifield_id == 6:
                init_kwds['rights'] = dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet.read(iprot)
            elif ifield_name == 'square_thumbnail' and ifield_id == 4:
                init_kwds['square_thumbnail'] = dressdiscover.api.models.image.image_version.ImageVersion.read(iprot)
            elif ifield_name == 'thumbnail' and ifield_id == 5:
                init_kwds['thumbnail'] = dressdiscover.api.models.image.image_version.ImageVersion.read(iprot)
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        full_size=None,
        original=None,
        rights=None,
        square_thumbnail=None,
        thumbnail=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type full_size: dressdiscover.api.models.image.image_version.ImageVersion or None
        :type original: dressdiscover.api.models.image.image_version.ImageVersion or None
        :type rights: dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet or None
        :type square_thumbnail: dressdiscover.api.models.image.image_version.ImageVersion or None
        :type thumbnail: dressdiscover.api.models.image.image_version.ImageVersion or None
        :rtype: dressdiscover.api.models.image.image.Image
        '''

        if full_size is None:
            full_size = self.full_size
        if original is None:
            original = self.original
        if rights is None:
            rights = self.rights
        if square_thumbnail is None:
            square_thumbnail = self.square_thumbnail
        if thumbnail is None:
            thumbnail = self.thumbnail
        return self.__class__(full_size=full_size, original=original, rights=rights, square_thumbnail=square_thumbnail, thumbnail=thumbnail)

    @property
    def rights(self):
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.rights.rights_set.RightsSet
        '''

        return self.__rights

    @property
    def square_thumbnail(self):
        '''
        :rtype: dressdiscover.api.models.image.image_version.ImageVersion
        '''

        return self.__square_thumbnail

    @property
    def thumbnail(self):
        '''
        :rtype: dressdiscover.api.models.image.image_version.ImageVersion
        '''

        return self.__thumbnail

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.image.image.Image
        '''

        oprot.write_struct_begin('Image')

        if self.full_size is not None:
            oprot.write_field_begin(name='full_size', type=12, id=2)
            self.full_size.write(oprot)
            oprot.write_field_end()

        if self.original is not None:
            oprot.write_field_begin(name='original', type=12, id=3)
            self.original.write(oprot)
            oprot.write_field_end()

        if self.rights is not None:
            oprot.write_field_begin(name='rights', type=12, id=6)
            self.rights.write(oprot)
            oprot.write_field_end()

        if self.square_thumbnail is not None:
            oprot.write_field_begin(name='square_thumbnail', type=12, id=4)
            self.square_thumbnail.write(oprot)
            oprot.write_field_end()

        if self.thumbnail is not None:
            oprot.write_field_begin(name='thumbnail', type=12, id=5)
            self.thumbnail.write(oprot)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
