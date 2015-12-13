import __builtin__
import costume.api.models.image.image_version


class Image(object):
    class Builder(object):
        def __init__(
            self,
            alt=None,
            full_size=None,
            original=None,
            square_thumbnail=None,
            thumbnail=None,
            title=None,
        ):
            '''
            :type alt: str or None
            :type full_size: costume.api.models.image.image_version.ImageVersion or None
            :type original: costume.api.models.image.image_version.ImageVersion or None
            :type square_thumbnail: costume.api.models.image.image_version.ImageVersion or None
            :type thumbnail: costume.api.models.image.image_version.ImageVersion or None
            :type title: str or None
            '''

            self.__alt = alt
            self.__full_size = full_size
            self.__original = original
            self.__square_thumbnail = square_thumbnail
            self.__thumbnail = thumbnail
            self.__title = title

        def build(self):
            return Image(alt=self.__alt, full_size=self.__full_size, original=self.__original, square_thumbnail=self.__square_thumbnail, thumbnail=self.__thumbnail, title=self.__title)

        @property
        def alt(self):
            '''
            :rtype: str
            '''

            return self.__alt

        @property
        def full_size(self):
            '''
            :rtype: costume.api.models.image.image_version.ImageVersion
            '''

            return self.__full_size

        @property
        def original(self):
            '''
            :rtype: costume.api.models.image.image_version.ImageVersion
            '''

            return self.__original

        def set_alt(self, alt):
            '''
            :type alt: str or None
            '''

            self.__alt = alt
            return self

        def set_full_size(self, full_size):
            '''
            :type full_size: costume.api.models.image.image_version.ImageVersion or None
            '''

            self.__full_size = full_size
            return self

        def set_original(self, original):
            '''
            :type original: costume.api.models.image.image_version.ImageVersion or None
            '''

            self.__original = original
            return self

        def set_square_thumbnail(self, square_thumbnail):
            '''
            :type square_thumbnail: costume.api.models.image.image_version.ImageVersion or None
            '''

            self.__square_thumbnail = square_thumbnail
            return self

        def set_thumbnail(self, thumbnail):
            '''
            :type thumbnail: costume.api.models.image.image_version.ImageVersion or None
            '''

            self.__thumbnail = thumbnail
            return self

        def set_title(self, title):
            '''
            :type title: str or None
            '''

            self.__title = title
            return self

        @property
        def square_thumbnail(self):
            '''
            :rtype: costume.api.models.image.image_version.ImageVersion
            '''

            return self.__square_thumbnail

        @property
        def thumbnail(self):
            '''
            :rtype: costume.api.models.image.image_version.ImageVersion
            '''

            return self.__thumbnail

        @property
        def title(self):
            '''
            :rtype: str
            '''

            return self.__title

        def update(self, image):
            '''
            :type alt: str or None
            :type full_size: costume.api.models.image.image_version.ImageVersion or None
            :type original: costume.api.models.image.image_version.ImageVersion or None
            :type square_thumbnail: costume.api.models.image.image_version.ImageVersion or None
            :type thumbnail: costume.api.models.image.image_version.ImageVersion or None
            :type title: str or None
            '''

            if isinstance(image, Image):
                self.set_alt(image.alt)
                self.set_full_size(image.full_size)
                self.set_original(image.original)
                self.set_square_thumbnail(image.square_thumbnail)
                self.set_thumbnail(image.thumbnail)
                self.set_title(image.title)
            elif isinstance(image, dict):
                for key, value in image.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(image)
            return self

        @alt.setter
        def alt(self, alt):
            '''
            :type alt: str or None
            '''

            self.set_alt(alt)

        @full_size.setter
        def full_size(self, full_size):
            '''
            :type full_size: costume.api.models.image.image_version.ImageVersion or None
            '''

            self.set_full_size(full_size)

        @original.setter
        def original(self, original):
            '''
            :type original: costume.api.models.image.image_version.ImageVersion or None
            '''

            self.set_original(original)

        @square_thumbnail.setter
        def square_thumbnail(self, square_thumbnail):
            '''
            :type square_thumbnail: costume.api.models.image.image_version.ImageVersion or None
            '''

            self.set_square_thumbnail(square_thumbnail)

        @thumbnail.setter
        def thumbnail(self, thumbnail):
            '''
            :type thumbnail: costume.api.models.image.image_version.ImageVersion or None
            '''

            self.set_thumbnail(thumbnail)

        @title.setter
        def title(self, title):
            '''
            :type title: str or None
            '''

            self.set_title(title)

    def __init__(
        self,
        alt=None,
        full_size=None,
        original=None,
        square_thumbnail=None,
        thumbnail=None,
        title=None,
    ):
        '''
        :type alt: str or None
        :type full_size: costume.api.models.image.image_version.ImageVersion or None
        :type original: costume.api.models.image.image_version.ImageVersion or None
        :type square_thumbnail: costume.api.models.image.image_version.ImageVersion or None
        :type thumbnail: costume.api.models.image.image_version.ImageVersion or None
        :type title: str or None
        '''

        if alt is not None:
            if not isinstance(alt, basestring):
                raise TypeError("expected alt to be a str but it is a %s" % getattr(__builtin__, 'type')(alt))
            if len(alt) < 1:
                raise ValueError("expected len(alt) to be >= 1, was %d" % len(alt))
        self.__alt = alt

        if full_size is not None:
            if not isinstance(full_size, costume.api.models.image.image_version.ImageVersion):
                raise TypeError("expected full_size to be a costume.api.models.image.image_version.ImageVersion but it is a %s" % getattr(__builtin__, 'type')(full_size))
        self.__full_size = full_size

        if original is not None:
            if not isinstance(original, costume.api.models.image.image_version.ImageVersion):
                raise TypeError("expected original to be a costume.api.models.image.image_version.ImageVersion but it is a %s" % getattr(__builtin__, 'type')(original))
        self.__original = original

        if square_thumbnail is not None:
            if not isinstance(square_thumbnail, costume.api.models.image.image_version.ImageVersion):
                raise TypeError("expected square_thumbnail to be a costume.api.models.image.image_version.ImageVersion but it is a %s" % getattr(__builtin__, 'type')(square_thumbnail))
        self.__square_thumbnail = square_thumbnail

        if thumbnail is not None:
            if not isinstance(thumbnail, costume.api.models.image.image_version.ImageVersion):
                raise TypeError("expected thumbnail to be a costume.api.models.image.image_version.ImageVersion but it is a %s" % getattr(__builtin__, 'type')(thumbnail))
        self.__thumbnail = thumbnail

        if title is not None:
            if not isinstance(title, basestring):
                raise TypeError("expected title to be a str but it is a %s" % getattr(__builtin__, 'type')(title))
            if len(title) < 1:
                raise ValueError("expected len(title) to be >= 1, was %d" % len(title))
        self.__title = title

    def __eq__(self, other):
        if self.alt != other.alt:
            return False
        if self.full_size != other.full_size:
            return False
        if self.original != other.original:
            return False
        if self.square_thumbnail != other.square_thumbnail:
            return False
        if self.thumbnail != other.thumbnail:
            return False
        if self.title != other.title:
            return False
        return True

    def __hash__(self):
        return hash((self.alt,self.full_size,self.original,self.square_thumbnail,self.thumbnail,self.title,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.alt is not None:
            field_reprs.append('alt=' + "'" + self.alt.encode('ascii', 'replace') + "'")
        if self.full_size is not None:
            field_reprs.append('full_size=' + repr(self.full_size))
        if self.original is not None:
            field_reprs.append('original=' + repr(self.original))
        if self.square_thumbnail is not None:
            field_reprs.append('square_thumbnail=' + repr(self.square_thumbnail))
        if self.thumbnail is not None:
            field_reprs.append('thumbnail=' + repr(self.thumbnail))
        if self.title is not None:
            field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        return 'Image(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.alt is not None:
            field_reprs.append('alt=' + "'" + self.alt.encode('ascii', 'replace') + "'")
        if self.full_size is not None:
            field_reprs.append('full_size=' + repr(self.full_size))
        if self.original is not None:
            field_reprs.append('original=' + repr(self.original))
        if self.square_thumbnail is not None:
            field_reprs.append('square_thumbnail=' + repr(self.square_thumbnail))
        if self.thumbnail is not None:
            field_reprs.append('thumbnail=' + repr(self.thumbnail))
        if self.title is not None:
            field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        return 'Image(' + ', '.join(field_reprs) + ')'

    @property
    def alt(self):
        '''
        :rtype: str
        '''

        return self.__alt

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'alt': self.alt, 'full_size': self.full_size, 'original': self.original, 'square_thumbnail': self.square_thumbnail, 'thumbnail': self.thumbnail, 'title': self.title}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.alt, self.full_size, self.original, self.square_thumbnail, self.thumbnail, self.title,)

    @property
    def full_size(self):
        '''
        :rtype: costume.api.models.image.image_version.ImageVersion
        '''

        return self.__full_size

    @property
    def original(self):
        '''
        :rtype: costume.api.models.image.image_version.ImageVersion
        '''

        return self.__original

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: costume.api.models.image.image.Image
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'alt' and ifield_id == 1:
                try:
                    init_kwds['alt'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'full_size' and ifield_id == 2:
                init_kwds['full_size'] = costume.api.models.image.image_version.ImageVersion.read(iprot)
            elif ifield_name == 'original' and ifield_id == 3:
                init_kwds['original'] = costume.api.models.image.image_version.ImageVersion.read(iprot)
            elif ifield_name == 'square_thumbnail' and ifield_id == 4:
                init_kwds['square_thumbnail'] = costume.api.models.image.image_version.ImageVersion.read(iprot)
            elif ifield_name == 'thumbnail' and ifield_id == 5:
                init_kwds['thumbnail'] = costume.api.models.image.image_version.ImageVersion.read(iprot)
            elif ifield_name == 'title' and ifield_id == 6:
                try:
                    init_kwds['title'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        alt=None,
        full_size=None,
        original=None,
        square_thumbnail=None,
        thumbnail=None,
        title=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type alt: str or None
        :type full_size: costume.api.models.image.image_version.ImageVersion or None
        :type original: costume.api.models.image.image_version.ImageVersion or None
        :type square_thumbnail: costume.api.models.image.image_version.ImageVersion or None
        :type thumbnail: costume.api.models.image.image_version.ImageVersion or None
        :type title: str or None
        :rtype: costume.api.models.image.image.Image
        '''

        if alt is None:
            alt = self.alt
        if full_size is None:
            full_size = self.full_size
        if original is None:
            original = self.original
        if square_thumbnail is None:
            square_thumbnail = self.square_thumbnail
        if thumbnail is None:
            thumbnail = self.thumbnail
        if title is None:
            title = self.title
        return self.__class__(alt=alt, full_size=full_size, original=original, square_thumbnail=square_thumbnail, thumbnail=thumbnail, title=title)

    @property
    def square_thumbnail(self):
        '''
        :rtype: costume.api.models.image.image_version.ImageVersion
        '''

        return self.__square_thumbnail

    @property
    def thumbnail(self):
        '''
        :rtype: costume.api.models.image.image_version.ImageVersion
        '''

        return self.__thumbnail

    @property
    def title(self):
        '''
        :rtype: str
        '''

        return self.__title

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.models.image.image.Image
        '''

        oprot.write_struct_begin('Image')

        if self.alt is not None:
            oprot.write_field_begin(name='alt', type=11, id=1)
            oprot.write_string(self.alt)
            oprot.write_field_end()

        if self.full_size is not None:
            oprot.write_field_begin(name='full_size', type=12, id=2)
            self.full_size.write(oprot)
            oprot.write_field_end()

        if self.original is not None:
            oprot.write_field_begin(name='original', type=12, id=3)
            self.original.write(oprot)
            oprot.write_field_end()

        if self.square_thumbnail is not None:
            oprot.write_field_begin(name='square_thumbnail', type=12, id=4)
            self.square_thumbnail.write(oprot)
            oprot.write_field_end()

        if self.thumbnail is not None:
            oprot.write_field_begin(name='thumbnail', type=12, id=5)
            self.thumbnail.write(oprot)
            oprot.write_field_end()

        if self.title is not None:
            oprot.write_field_begin(name='title', type=11, id=6)
            oprot.write_string(self.title)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
