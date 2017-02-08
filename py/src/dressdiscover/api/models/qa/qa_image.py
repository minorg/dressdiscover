import __builtin__
import dressdiscover.api.models.qa.qa_image_rights


class QaImage(object):
    class Builder(object):
        def __init__(
            self,
            full_size_url=None,
            rights=None,
            thumbnail_url=None,
        ):
            '''
            :type full_size_url: str
            :type rights: dressdiscover.api.models.qa.qa_image_rights.QaImageRights
            :type thumbnail_url: str
            '''

            self.__full_size_url = full_size_url
            self.__rights = rights
            self.__thumbnail_url = thumbnail_url

        def build(self):
            return QaImage(full_size_url=self.__full_size_url, rights=self.__rights, thumbnail_url=self.__thumbnail_url)

        @property
        def full_size_url(self):
            '''
            :rtype: str
            '''

            return self.__full_size_url

        @property
        def rights(self):
            '''
            :rtype: dressdiscover.api.models.qa.qa_image_rights.QaImageRights
            '''

            return self.__rights

        def set_full_size_url(self, full_size_url):
            '''
            :type full_size_url: str
            '''

            if full_size_url is None:
                raise ValueError('full_size_url is required')
            if not isinstance(full_size_url, basestring):
                raise TypeError("expected full_size_url to be a str but it is a %s" % getattr(__builtin__, 'type')(full_size_url))
            if full_size_url.isspace():
                raise ValueError("expected full_size_url not to be blank")
            if len(full_size_url) < 1:
                raise ValueError("expected len(full_size_url) to be >= 1, was %d" % len(full_size_url))
            self.__full_size_url = full_size_url
            return self

        def set_rights(self, rights):
            '''
            :type rights: dressdiscover.api.models.qa.qa_image_rights.QaImageRights
            '''

            if rights is None:
                raise ValueError('rights is required')
            if not isinstance(rights, dressdiscover.api.models.qa.qa_image_rights.QaImageRights):
                raise TypeError("expected rights to be a dressdiscover.api.models.qa.qa_image_rights.QaImageRights but it is a %s" % getattr(__builtin__, 'type')(rights))
            self.__rights = rights
            return self

        def set_thumbnail_url(self, thumbnail_url):
            '''
            :type thumbnail_url: str
            '''

            if thumbnail_url is None:
                raise ValueError('thumbnail_url is required')
            if not isinstance(thumbnail_url, basestring):
                raise TypeError("expected thumbnail_url to be a str but it is a %s" % getattr(__builtin__, 'type')(thumbnail_url))
            if thumbnail_url.isspace():
                raise ValueError("expected thumbnail_url not to be blank")
            if len(thumbnail_url) < 1:
                raise ValueError("expected len(thumbnail_url) to be >= 1, was %d" % len(thumbnail_url))
            self.__thumbnail_url = thumbnail_url
            return self

        @property
        def thumbnail_url(self):
            '''
            :rtype: str
            '''

            return self.__thumbnail_url

        def update(self, qa_image):
            '''
            :type full_size_url: str
            :type rights: dressdiscover.api.models.qa.qa_image_rights.QaImageRights
            :type thumbnail_url: str
            '''

            if isinstance(qa_image, QaImage):
                self.set_full_size_url(qa_image.full_size_url)
                self.set_rights(qa_image.rights)
                self.set_thumbnail_url(qa_image.thumbnail_url)
            elif isinstance(qa_image, dict):
                for key, value in qa_image.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(qa_image)
            return self

        @full_size_url.setter
        def full_size_url(self, full_size_url):
            '''
            :type full_size_url: str
            '''

            self.set_full_size_url(full_size_url)

        @rights.setter
        def rights(self, rights):
            '''
            :type rights: dressdiscover.api.models.qa.qa_image_rights.QaImageRights
            '''

            self.set_rights(rights)

        @thumbnail_url.setter
        def thumbnail_url(self, thumbnail_url):
            '''
            :type thumbnail_url: str
            '''

            self.set_thumbnail_url(thumbnail_url)

    class FieldMetadata(object):
        FULL_SIZE_URL = None
        RIGHTS = None
        THUMBNAIL_URL = None

        def __init__(self, name, type_, validation):
            object.__init__(self)
            self.__name = name
            self.__type = type_
            self.__validation = validation

        @property
        def name(self):
            return self.__name

        def __repr__(self):
            return self.__name

        def __str__(self):
            return self.__name

        @property
        def type(self):
            return self.__type

        @property
        def validation(self):
            return self.__validation

        @classmethod
        def values(cls):
            return (cls.FULL_SIZE_URL, cls.RIGHTS, cls.THUMBNAIL_URL,)

    FieldMetadata.FULL_SIZE_URL = FieldMetadata('full_size_url', str, {u'blank': False, u'minLength': 1})
    FieldMetadata.RIGHTS = FieldMetadata('rights', dressdiscover.api.models.qa.qa_image_rights.QaImageRights, None)
    FieldMetadata.THUMBNAIL_URL = FieldMetadata('thumbnail_url', str, {u'blank': False, u'minLength': 1})

    def __init__(
        self,
        full_size_url,
        rights,
        thumbnail_url,
    ):
        '''
        :type full_size_url: str
        :type rights: dressdiscover.api.models.qa.qa_image_rights.QaImageRights
        :type thumbnail_url: str
        '''

        if full_size_url is None:
            raise ValueError('full_size_url is required')
        if not isinstance(full_size_url, basestring):
            raise TypeError("expected full_size_url to be a str but it is a %s" % getattr(__builtin__, 'type')(full_size_url))
        if full_size_url.isspace():
            raise ValueError("expected full_size_url not to be blank")
        if len(full_size_url) < 1:
            raise ValueError("expected len(full_size_url) to be >= 1, was %d" % len(full_size_url))
        self.__full_size_url = full_size_url

        if rights is None:
            raise ValueError('rights is required')
        if not isinstance(rights, dressdiscover.api.models.qa.qa_image_rights.QaImageRights):
            raise TypeError("expected rights to be a dressdiscover.api.models.qa.qa_image_rights.QaImageRights but it is a %s" % getattr(__builtin__, 'type')(rights))
        self.__rights = rights

        if thumbnail_url is None:
            raise ValueError('thumbnail_url is required')
        if not isinstance(thumbnail_url, basestring):
            raise TypeError("expected thumbnail_url to be a str but it is a %s" % getattr(__builtin__, 'type')(thumbnail_url))
        if thumbnail_url.isspace():
            raise ValueError("expected thumbnail_url not to be blank")
        if len(thumbnail_url) < 1:
            raise ValueError("expected len(thumbnail_url) to be >= 1, was %d" % len(thumbnail_url))
        self.__thumbnail_url = thumbnail_url

    def __eq__(self, other):
        if self.full_size_url != other.full_size_url:
            return False
        if self.rights != other.rights:
            return False
        if self.thumbnail_url != other.thumbnail_url:
            return False
        return True

    def __hash__(self):
        return hash((self.full_size_url,self.rights,self.thumbnail_url,))

    def __iter__(self):
        return iter((self.full_size_url, self.rights, self.thumbnail_url,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('full_size_url=' + "'" + self.full_size_url.encode('ascii', 'replace') + "'")
        field_reprs.append('rights=' + repr(self.rights))
        field_reprs.append('thumbnail_url=' + "'" + self.thumbnail_url.encode('ascii', 'replace') + "'")
        return 'QaImage(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('full_size_url=' + "'" + self.full_size_url.encode('ascii', 'replace') + "'")
        field_reprs.append('rights=' + repr(self.rights))
        field_reprs.append('thumbnail_url=' + "'" + self.thumbnail_url.encode('ascii', 'replace') + "'")
        return 'QaImage(' + ', '.join(field_reprs) + ')'

    @property
    def full_size_url(self):
        '''
        :rtype: str
        '''

        return self.__full_size_url

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.qa.qa_image.QaImage
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'full_size_url':
                init_kwds['full_size_url'] = iprot.read_string()
            elif ifield_name == 'rights':
                init_kwds['rights'] = dressdiscover.api.models.qa.qa_image_rights.QaImageRights.read(iprot)
            elif ifield_name == 'thumbnail_url':
                init_kwds['thumbnail_url'] = iprot.read_string()
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        full_size_url=None,
        rights=None,
        thumbnail_url=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type full_size_url: str or None
        :type rights: dressdiscover.api.models.qa.qa_image_rights.QaImageRights or None
        :type thumbnail_url: str or None
        :rtype: dressdiscover.api.models.qa.qa_image.QaImage
        '''

        if full_size_url is None:
            full_size_url = self.full_size_url
        if rights is None:
            rights = self.rights
        if thumbnail_url is None:
            thumbnail_url = self.thumbnail_url
        return self.__class__(full_size_url=full_size_url, rights=rights, thumbnail_url=thumbnail_url)

    @property
    def rights(self):
        '''
        :rtype: dressdiscover.api.models.qa.qa_image_rights.QaImageRights
        '''

        return self.__rights

    @property
    def thumbnail_url(self):
        '''
        :rtype: str
        '''

        return self.__thumbnail_url

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.qa.qa_image.QaImage
        '''

        oprot.write_struct_begin('QaImage')

        oprot.write_field_begin(name='full_size_url', type=11, id=None)
        oprot.write_string(self.full_size_url)
        oprot.write_field_end()

        oprot.write_field_begin(name='rights', type=12, id=None)
        self.rights.write(oprot)
        oprot.write_field_end()

        oprot.write_field_begin(name='thumbnail_url', type=11, id=None)
        oprot.write_string(self.thumbnail_url)
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
