from collections import OrderedDict
import builtins
import dressdiscover.api.models.worksheet.worksheet_feature_value_image_rights


class WorksheetFeatureValueImage(object):
    class Builder(object):
        def __init__(
            self,
            rights=None,
            thumbnail_url=None,
            full_size_url=None,
        ):
            '''
            :type rights: dressdiscover.api.models.worksheet.worksheet_feature_value_image_rights.WorksheetFeatureValueImageRights
            :type thumbnail_url: str
            :type full_size_url: str or None
            '''

            self.__rights = rights
            self.__thumbnail_url = thumbnail_url
            self.__full_size_url = full_size_url

        def build(self):
            return WorksheetFeatureValueImage(rights=self.__rights, thumbnail_url=self.__thumbnail_url, full_size_url=self.__full_size_url)

        @classmethod
        def from_template(cls, template):
            '''
            :type template: dressdiscover.api.models.worksheet.worksheet_feature_value_image.WorksheetFeatureValueImage
            :rtype: dressdiscover.api.models.worksheet.worksheet_feature_value_image.WorksheetFeatureValueImage
            '''

            builder = cls()
            builder.rights = rights
            builder.thumbnail_url = thumbnail_url
            builder.full_size_url = full_size_url
            return builder

        @property
        def full_size_url(self):
            '''
            :rtype: str
            '''

            return self.__full_size_url

        @property
        def rights(self):
            '''
            :rtype: dressdiscover.api.models.worksheet.worksheet_feature_value_image_rights.WorksheetFeatureValueImageRights
            '''

            return self.__rights

        def set_full_size_url(self, full_size_url):
            '''
            :type full_size_url: str or None
            '''

            if full_size_url is not None:
                if not isinstance(full_size_url, str):
                    raise TypeError("expected full_size_url to be a str but it is a %s" % builtins.type(full_size_url))
                if full_size_url.isspace():
                    raise ValueError("expected full_size_url not to be blank")
                if len(full_size_url) < 1:
                    raise ValueError("expected len(full_size_url) to be >= 1, was %d" % len(full_size_url))
            self.__full_size_url = full_size_url
            return self

        def set_rights(self, rights):
            '''
            :type rights: dressdiscover.api.models.worksheet.worksheet_feature_value_image_rights.WorksheetFeatureValueImageRights
            '''

            if rights is None:
                raise ValueError('rights is required')
            if not isinstance(rights, dressdiscover.api.models.worksheet.worksheet_feature_value_image_rights.WorksheetFeatureValueImageRights):
                raise TypeError("expected rights to be a dressdiscover.api.models.worksheet.worksheet_feature_value_image_rights.WorksheetFeatureValueImageRights but it is a %s" % builtins.type(rights))
            self.__rights = rights
            return self

        def set_thumbnail_url(self, thumbnail_url):
            '''
            :type thumbnail_url: str
            '''

            if thumbnail_url is None:
                raise ValueError('thumbnail_url is required')
            if not isinstance(thumbnail_url, str):
                raise TypeError("expected thumbnail_url to be a str but it is a %s" % builtins.type(thumbnail_url))
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

        def update(self, worksheet_feature_value_image):
            '''
            :type rights: dressdiscover.api.models.worksheet.worksheet_feature_value_image_rights.WorksheetFeatureValueImageRights
            :type thumbnail_url: str
            :type full_size_url: str or None
            '''

            if isinstance(worksheet_feature_value_image, WorksheetFeatureValueImage):
                self.set_rights(worksheet_feature_value_image.rights)
                self.set_thumbnail_url(worksheet_feature_value_image.thumbnail_url)
                self.set_full_size_url(worksheet_feature_value_image.full_size_url)
            elif isinstance(worksheet_feature_value_image, dict):
                for key, value in worksheet_feature_value_image.items():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(worksheet_feature_value_image)
            return self

        @full_size_url.setter
        def full_size_url(self, full_size_url):
            '''
            :type full_size_url: str or None
            '''

            self.set_full_size_url(full_size_url)

        @rights.setter
        def rights(self, rights):
            '''
            :type rights: dressdiscover.api.models.worksheet.worksheet_feature_value_image_rights.WorksheetFeatureValueImageRights
            '''

            self.set_rights(rights)

        @thumbnail_url.setter
        def thumbnail_url(self, thumbnail_url):
            '''
            :type thumbnail_url: str
            '''

            self.set_thumbnail_url(thumbnail_url)

    class FieldMetadata(object):
        RIGHTS = None
        THUMBNAIL_URL = None
        FULL_SIZE_URL = None

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
            return (cls.RIGHTS, cls.THUMBNAIL_URL, cls.FULL_SIZE_URL,)

    FieldMetadata.RIGHTS = FieldMetadata('rights', dressdiscover.api.models.worksheet.worksheet_feature_value_image_rights.WorksheetFeatureValueImageRights, None)
    FieldMetadata.THUMBNAIL_URL = FieldMetadata('thumbnail_url', str, OrderedDict([('blank', False), ('minLength', 1)]))
    FieldMetadata.FULL_SIZE_URL = FieldMetadata('full_size_url', str, OrderedDict([('blank', False), ('minLength', 1)]))

    def __init__(
        self,
        rights,
        thumbnail_url,
        full_size_url=None,
    ):
        '''
        :type rights: dressdiscover.api.models.worksheet.worksheet_feature_value_image_rights.WorksheetFeatureValueImageRights
        :type thumbnail_url: str
        :type full_size_url: str or None
        '''

        if rights is None:
            raise ValueError('rights is required')
        if not isinstance(rights, dressdiscover.api.models.worksheet.worksheet_feature_value_image_rights.WorksheetFeatureValueImageRights):
            raise TypeError("expected rights to be a dressdiscover.api.models.worksheet.worksheet_feature_value_image_rights.WorksheetFeatureValueImageRights but it is a %s" % builtins.type(rights))
        self.__rights = rights

        if thumbnail_url is None:
            raise ValueError('thumbnail_url is required')
        if not isinstance(thumbnail_url, str):
            raise TypeError("expected thumbnail_url to be a str but it is a %s" % builtins.type(thumbnail_url))
        if thumbnail_url.isspace():
            raise ValueError("expected thumbnail_url not to be blank")
        if len(thumbnail_url) < 1:
            raise ValueError("expected len(thumbnail_url) to be >= 1, was %d" % len(thumbnail_url))
        self.__thumbnail_url = thumbnail_url

        if full_size_url is not None:
            if not isinstance(full_size_url, str):
                raise TypeError("expected full_size_url to be a str but it is a %s" % builtins.type(full_size_url))
            if full_size_url.isspace():
                raise ValueError("expected full_size_url not to be blank")
            if len(full_size_url) < 1:
                raise ValueError("expected len(full_size_url) to be >= 1, was %d" % len(full_size_url))
        self.__full_size_url = full_size_url

    def __eq__(self, other):
        if self.rights != other.rights:
            return False
        if self.thumbnail_url != other.thumbnail_url:
            return False
        if self.full_size_url != other.full_size_url:
            return False
        return True

    def __hash__(self):
        return hash((self.rights, self.thumbnail_url, self.full_size_url,))

    def __iter__(self):
        return iter((self.rights, self.thumbnail_url, self.full_size_url,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('rights=' + repr(self.rights))
        field_reprs.append('thumbnail_url=' + "'" + self.thumbnail_url.encode('ascii', 'replace').decode('ascii') + "'")
        if self.full_size_url is not None:
            field_reprs.append('full_size_url=' + "'" + self.full_size_url.encode('ascii', 'replace').decode('ascii') + "'")
        return 'WorksheetFeatureValueImage(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('rights=' + repr(self.rights))
        field_reprs.append('thumbnail_url=' + "'" + self.thumbnail_url.encode('ascii', 'replace').decode('ascii') + "'")
        if self.full_size_url is not None:
            field_reprs.append('full_size_url=' + "'" + self.full_size_url.encode('ascii', 'replace').decode('ascii') + "'")
        return 'WorksheetFeatureValueImage(' + ', '.join(field_reprs) + ')'

    @classmethod
    def builder(cls):
        return cls.Builder()

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
        :rtype: dressdiscover.api.models.worksheet.worksheet_feature_value_image.WorksheetFeatureValueImage
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'rights':
                init_kwds['rights'] = dressdiscover.api.models.worksheet.worksheet_feature_value_image_rights.WorksheetFeatureValueImageRights.read(iprot)
            elif ifield_name == 'thumbnail_url':
                init_kwds['thumbnail_url'] = iprot.read_string()
            elif ifield_name == 'full_size_url':
                try:
                    init_kwds['full_size_url'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replacer(self):
        return cls.Builder.from_template(template=self)

    @property
    def rights(self):
        '''
        :rtype: dressdiscover.api.models.worksheet.worksheet_feature_value_image_rights.WorksheetFeatureValueImageRights
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
        :rtype: dressdiscover.api.models.worksheet.worksheet_feature_value_image.WorksheetFeatureValueImage
        '''

        oprot.write_struct_begin('WorksheetFeatureValueImage')

        oprot.write_field_begin(name='rights', type=12, id=None)
        self.rights.write(oprot)
        oprot.write_field_end()

        oprot.write_field_begin(name='thumbnail_url', type=11, id=None)
        oprot.write_string(self.thumbnail_url)
        oprot.write_field_end()

        if self.full_size_url is not None:
            oprot.write_field_begin(name='full_size_url', type=11, id=None)
            oprot.write_string(self.full_size_url)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
