import __builtin__
import dressdiscover.api.models.worksheet.worksheet_enum_feature_value_image


class WorksheetEnumFeatureValueDefinition(object):
    class Builder(object):
        def __init__(
            self,
            id=None,  # @ReservedAssignment
            display_name=None,
            image=None,
        ):
            '''
            :type id: str
            :type display_name: str or None
            :type image: dressdiscover.api.models.worksheet.worksheet_enum_feature_value_image.WorksheetEnumFeatureValueImage or None
            '''

            self.__id = id
            self.__display_name = display_name
            self.__image = image

        def build(self):
            return WorksheetEnumFeatureValueDefinition(id=self.__id, display_name=self.__display_name, image=self.__image)

        @property
        def display_name(self):
            '''
            :rtype: str
            '''

            return self.__display_name

        @property
        def id(self):  # @ReservedAssignment
            '''
            :rtype: str
            '''

            return self.__id

        @property
        def image(self):
            '''
            :rtype: dressdiscover.api.models.worksheet.worksheet_enum_feature_value_image.WorksheetEnumFeatureValueImage
            '''

            return self.__image

        def set_display_name(self, display_name):
            '''
            :type display_name: str or None
            '''

            if display_name is not None:
                if not isinstance(display_name, basestring):
                    raise TypeError("expected display_name to be a str but it is a %s" % getattr(__builtin__, 'type')(display_name))
                if display_name.isspace():
                    raise ValueError("expected display_name not to be blank")
                if len(display_name) < 1:
                    raise ValueError("expected len(display_name) to be >= 1, was %d" % len(display_name))
            self.__display_name = display_name
            return self

        def set_id(self, id):  # @ReservedAssignment
            '''
            :type id: str
            '''

            if id is None:
                raise ValueError('id is required')
            if not isinstance(id, basestring):
                raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))
            self.__id = id
            return self

        def set_image(self, image):
            '''
            :type image: dressdiscover.api.models.worksheet.worksheet_enum_feature_value_image.WorksheetEnumFeatureValueImage or None
            '''

            if image is not None:
                if not isinstance(image, dressdiscover.api.models.worksheet.worksheet_enum_feature_value_image.WorksheetEnumFeatureValueImage):
                    raise TypeError("expected image to be a dressdiscover.api.models.worksheet.worksheet_enum_feature_value_image.WorksheetEnumFeatureValueImage but it is a %s" % getattr(__builtin__, 'type')(image))
            self.__image = image
            return self

        def update(self, worksheet_enum_feature_value_definition):
            '''
            :type id: str
            :type display_name: str or None
            :type image: dressdiscover.api.models.worksheet.worksheet_enum_feature_value_image.WorksheetEnumFeatureValueImage or None
            '''

            if isinstance(worksheet_enum_feature_value_definition, WorksheetEnumFeatureValueDefinition):
                self.set_id(worksheet_enum_feature_value_definition.id)
                self.set_display_name(worksheet_enum_feature_value_definition.display_name)
                self.set_image(worksheet_enum_feature_value_definition.image)
            elif isinstance(worksheet_enum_feature_value_definition, dict):
                for key, value in worksheet_enum_feature_value_definition.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(worksheet_enum_feature_value_definition)
            return self

        @display_name.setter
        def display_name(self, display_name):
            '''
            :type display_name: str or None
            '''

            self.set_display_name(display_name)

        @id.setter
        def id(self, id):  # @ReservedAssignment
            '''
            :type id: str
            '''

            self.set_id(id)

        @image.setter
        def image(self, image):
            '''
            :type image: dressdiscover.api.models.worksheet.worksheet_enum_feature_value_image.WorksheetEnumFeatureValueImage or None
            '''

            self.set_image(image)

    class FieldMetadata(object):
        ID = None
        DISPLAY_NAME = None
        IMAGE = None

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
            return (cls.ID, cls.DISPLAY_NAME, cls.IMAGE,)

    FieldMetadata.ID = FieldMetadata('id', dressdiscover.api.models.worksheet.worksheet_enum_feature_value_id.WorksheetEnumFeatureValueId, None)
    FieldMetadata.DISPLAY_NAME = FieldMetadata('display_name', str, {u'blank': False, u'minLength': 1})
    FieldMetadata.IMAGE = FieldMetadata('image', dressdiscover.api.models.worksheet.worksheet_enum_feature_value_image.WorksheetEnumFeatureValueImage, None)

    def __init__(
        self,
        id,  # @ReservedAssignment
        display_name=None,
        image=None,
    ):
        '''
        :type id: str
        :type display_name: str or None
        :type image: dressdiscover.api.models.worksheet.worksheet_enum_feature_value_image.WorksheetEnumFeatureValueImage or None
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, basestring):
            raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))
        self.__id = id

        if display_name is not None:
            if not isinstance(display_name, basestring):
                raise TypeError("expected display_name to be a str but it is a %s" % getattr(__builtin__, 'type')(display_name))
            if display_name.isspace():
                raise ValueError("expected display_name not to be blank")
            if len(display_name) < 1:
                raise ValueError("expected len(display_name) to be >= 1, was %d" % len(display_name))
        self.__display_name = display_name

        if image is not None:
            if not isinstance(image, dressdiscover.api.models.worksheet.worksheet_enum_feature_value_image.WorksheetEnumFeatureValueImage):
                raise TypeError("expected image to be a dressdiscover.api.models.worksheet.worksheet_enum_feature_value_image.WorksheetEnumFeatureValueImage but it is a %s" % getattr(__builtin__, 'type')(image))
        self.__image = image

    def __eq__(self, other):
        if self.id != other.id:
            return False
        if self.display_name != other.display_name:
            return False
        if self.image != other.image:
            return False
        return True

    def __hash__(self):
        return hash((self.id,self.display_name,self.image,))

    def __iter__(self):
        return iter((self.id, self.display_name, self.image,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        if self.display_name is not None:
            field_reprs.append('display_name=' + "'" + self.display_name.encode('ascii', 'replace') + "'")
        if self.image is not None:
            field_reprs.append('image=' + repr(self.image))
        return 'WorksheetEnumFeatureValueDefinition(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        if self.display_name is not None:
            field_reprs.append('display_name=' + "'" + self.display_name.encode('ascii', 'replace') + "'")
        if self.image is not None:
            field_reprs.append('image=' + repr(self.image))
        return 'WorksheetEnumFeatureValueDefinition(' + ', '.join(field_reprs) + ')'

    @property
    def display_name(self):
        '''
        :rtype: str
        '''

        return self.__display_name

    @property
    def id(self):  # @ReservedAssignment
        '''
        :rtype: str
        '''

        return self.__id

    @property
    def image(self):
        '''
        :rtype: dressdiscover.api.models.worksheet.worksheet_enum_feature_value_image.WorksheetEnumFeatureValueImage
        '''

        return self.__image

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_enum_feature_value_definition.WorksheetEnumFeatureValueDefinition
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'id':
                init_kwds['id'] = iprot.read_string()
            elif ifield_name == 'display_name':
                try:
                    init_kwds['display_name'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'image':
                init_kwds['image'] = dressdiscover.api.models.worksheet.worksheet_enum_feature_value_image.WorksheetEnumFeatureValueImage.read(iprot)
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        id=None,  # @ReservedAssignment
        display_name=None,
        image=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type id: str or None
        :type display_name: str or None
        :type image: dressdiscover.api.models.worksheet.worksheet_enum_feature_value_image.WorksheetEnumFeatureValueImage or None
        :rtype: dressdiscover.api.models.worksheet.worksheet_enum_feature_value_definition.WorksheetEnumFeatureValueDefinition
        '''

        if id is None:
            id = self.id  # @ReservedAssignment
        if display_name is None:
            display_name = self.display_name
        if image is None:
            image = self.image
        return self.__class__(id=id, display_name=display_name, image=image)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_enum_feature_value_definition.WorksheetEnumFeatureValueDefinition
        '''

        oprot.write_struct_begin('WorksheetEnumFeatureValueDefinition')

        oprot.write_field_begin(name='id', type=11, id=None)
        oprot.write_string(self.id)
        oprot.write_field_end()

        if self.display_name is not None:
            oprot.write_field_begin(name='display_name', type=11, id=None)
            oprot.write_string(self.display_name)
            oprot.write_field_end()

        if self.image is not None:
            oprot.write_field_begin(name='image', type=12, id=None)
            self.image.write(oprot)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
