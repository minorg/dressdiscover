import __builtin__


class ImageVersion(object):
    class Builder(object):
        def __init__(
            self,
            url=None,
            height_px=None,
            width_px=None,
        ):
            '''
            :type url: str
            :type height_px: int or None
            :type width_px: int or None
            '''

            self.__url = url
            self.__height_px = height_px
            self.__width_px = width_px

        def build(self):
            return ImageVersion(url=self.__url, height_px=self.__height_px, width_px=self.__width_px)

        @property
        def height_px(self):
            '''
            :rtype: int
            '''

            return self.__height_px

        def set_height_px(self, height_px):
            '''
            :type height_px: int or None
            '''

            self.__height_px = height_px
            return self

        def set_url(self, url):
            '''
            :type url: str
            '''

            self.__url = url
            return self

        def set_width_px(self, width_px):
            '''
            :type width_px: int or None
            '''

            self.__width_px = width_px
            return self

        def update(self, image_version):
            '''
            :type url: str
            :type height_px: int or None
            :type width_px: int or None
            '''

            if isinstance(image_version, ImageVersion):
                self.set_url(image_version.url)
                self.set_height_px(image_version.height_px)
                self.set_width_px(image_version.width_px)
            elif isinstance(image_version, dict):
                for key, value in image_version.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(image_version)
            return self

        @property
        def url(self):
            '''
            :rtype: str
            '''

            return self.__url

        @property
        def width_px(self):
            '''
            :rtype: int
            '''

            return self.__width_px

        @height_px.setter
        def height_px(self, height_px):
            '''
            :type height_px: int or None
            '''

            self.set_height_px(height_px)

        @url.setter
        def url(self, url):
            '''
            :type url: str
            '''

            self.set_url(url)

        @width_px.setter
        def width_px(self, width_px):
            '''
            :type width_px: int or None
            '''

            self.set_width_px(width_px)

    def __init__(
        self,
        url,
        height_px=None,
        width_px=None,
    ):
        '''
        :type url: str
        :type height_px: int or None
        :type width_px: int or None
        '''

        if url is None:
            raise ValueError('url is required')
        if not isinstance(url, basestring):
            raise TypeError("expected url to be a str but it is a %s" % getattr(__builtin__, 'type')(url))
        self.__url = url

        if height_px is not None:
            if not isinstance(height_px, (int, long)) and height_px >= 0:
                raise TypeError("expected height_px to be a int but it is a %s" % getattr(__builtin__, 'type')(height_px))
        self.__height_px = height_px

        if width_px is not None:
            if not isinstance(width_px, (int, long)) and width_px >= 0:
                raise TypeError("expected width_px to be a int but it is a %s" % getattr(__builtin__, 'type')(width_px))
        self.__width_px = width_px

    def __eq__(self, other):
        if self.url != other.url:
            return False
        if self.height_px != other.height_px:
            return False
        if self.width_px != other.width_px:
            return False
        return True

    def __hash__(self):
        return hash((self.url,self.height_px,self.width_px,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('url=' + "'" + self.url.encode('ascii', 'replace') + "'")
        if self.height_px is not None:
            field_reprs.append('height_px=' + repr(self.height_px))
        if self.width_px is not None:
            field_reprs.append('width_px=' + repr(self.width_px))
        return 'ImageVersion(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('url=' + "'" + self.url.encode('ascii', 'replace') + "'")
        if self.height_px is not None:
            field_reprs.append('height_px=' + repr(self.height_px))
        if self.width_px is not None:
            field_reprs.append('width_px=' + repr(self.width_px))
        return 'ImageVersion(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'url': self.url, 'height_px': self.height_px, 'width_px': self.width_px}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.url, self.height_px, self.width_px,)

    @property
    def height_px(self):
        '''
        :rtype: int
        '''

        return self.__height_px

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.image.image_version.ImageVersion
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'url' and ifield_id == 1:
                init_kwds['url'] = iprot.read_string()
            elif ifield_name == 'height_px' and ifield_id == 2:
                try:
                    init_kwds['height_px'] = iprot.read_u32()
                except (TypeError,):
                    pass
            elif ifield_name == 'width_px' and ifield_id == 3:
                try:
                    init_kwds['width_px'] = iprot.read_u32()
                except (TypeError,):
                    pass
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        url=None,
        height_px=None,
        width_px=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type url: str or None
        :type height_px: int or None
        :type width_px: int or None
        :rtype: dressdiscover.api.models.image.image_version.ImageVersion
        '''

        if url is None:
            url = self.url
        if height_px is None:
            height_px = self.height_px
        if width_px is None:
            width_px = self.width_px
        return self.__class__(url=url, height_px=height_px, width_px=width_px)

    @property
    def url(self):
        '''
        :rtype: str
        '''

        return self.__url

    @property
    def width_px(self):
        '''
        :rtype: int
        '''

        return self.__width_px

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.image.image_version.ImageVersion
        '''

        oprot.write_struct_begin('ImageVersion')

        oprot.write_field_begin(name='url', type=11, id=1)
        oprot.write_string(self.url)
        oprot.write_field_end()

        if self.height_px is not None:
            oprot.write_field_begin(name='height_px', type=8, id=2)
            oprot.write_u32(self.height_px)
            oprot.write_field_end()

        if self.width_px is not None:
            oprot.write_field_begin(name='width_px', type=8, id=3)
            oprot.write_u32(self.width_px)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
