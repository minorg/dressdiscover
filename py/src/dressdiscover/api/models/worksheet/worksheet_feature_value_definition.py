from collections import OrderedDict
import builtins
import dressdiscover.api.models.worksheet.worksheet_feature_value_id
import dressdiscover.api.models.worksheet.worksheet_feature_value_image


class WorksheetFeatureValueDefinition(object):
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
            :type image: dressdiscover.api.models.worksheet.worksheet_feature_value_image.WorksheetFeatureValueImage or None
            '''

            self.__id = id
            self.__display_name = display_name
            self.__image = image

        def build(self):
            return WorksheetFeatureValueDefinition(id=self.__id, display_name=self.__display_name, image=self.__image)

        @property
        def display_name(self):
            '''
            :rtype: str
            '''

            return self.__display_name

        @classmethod
        def from_template(cls, template):
            '''
            :type template: dressdiscover.api.models.worksheet.worksheet_feature_value_definition.WorksheetFeatureValueDefinition
            :rtype: dressdiscover.api.models.worksheet.worksheet_feature_value_definition.WorksheetFeatureValueDefinition
            '''

            builder = cls()
            builder.id = id
            builder.display_name = display_name
            builder.image = image
            return builder

        @property
        def id(self):  # @ReservedAssignment
            '''
            :rtype: str
            '''

            return self.__id

        @property
        def image(self):
            '''
            :rtype: dressdiscover.api.models.worksheet.worksheet_feature_value_image.WorksheetFeatureValueImage
            '''

            return self.__image

        def set_display_name(self, display_name):
            '''
            :type display_name: str or None
            '''

            if display_name is not None:
                if not isinstance(display_name, str):
                    raise TypeError("expected display_name to be a str but it is a %s" % builtins.type(display_name))
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
            if not isinstance(id, str):
                raise TypeError("expected id to be a str but it is a %s" % builtins.type(id))
            self.__id = id
            return self

        def set_image(self, image):
            '''
            :type image: dressdiscover.api.models.worksheet.worksheet_feature_value_image.WorksheetFeatureValueImage or None
            '''

            if image is not None:
                if not isinstance(image, dressdiscover.api.models.worksheet.worksheet_feature_value_image.WorksheetFeatureValueImage):
                    raise TypeError("expected image to be a dressdiscover.api.models.worksheet.worksheet_feature_value_image.WorksheetFeatureValueImage but it is a %s" % builtins.type(image))
            self.__image = image
            return self

        def update(self, worksheet_feature_value_definition):
            '''
            :type id: str
            :type display_name: str or None
            :type image: dressdiscover.api.models.worksheet.worksheet_feature_value_image.WorksheetFeatureValueImage or None
            '''

            if isinstance(worksheet_feature_value_definition, WorksheetFeatureValueDefinition):
                self.set_id(worksheet_feature_value_definition.id)
                self.set_display_name(worksheet_feature_value_definition.display_name)
                self.set_image(worksheet_feature_value_definition.image)
            elif isinstance(worksheet_feature_value_definition, dict):
                for key, value in worksheet_feature_value_definition.items():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(worksheet_feature_value_definition)
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
            :type image: dressdiscover.api.models.worksheet.worksheet_feature_value_image.WorksheetFeatureValueImage or None
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
            return (cls.ID, cls.DISPLAY_NAME, cls.IMAGE,)

    FieldMetadata.ID = FieldMetadata('id', dressdiscover.api.models.worksheet.worksheet_feature_value_id.WorksheetFeatureValueId, None)
    FieldMetadata.DISPLAY_NAME = FieldMetadata('display_name', str, OrderedDict([('blank', False), ('minLength', 1)]))
    FieldMetadata.IMAGE = FieldMetadata('image', dressdiscover.api.models.worksheet.worksheet_feature_value_image.WorksheetFeatureValueImage, None)

    def __init__(
        self,
        id,  # @ReservedAssignment
        display_name=None,
        image=None,
    ):
        '''
        :type id: str
        :type display_name: str or None
        :type image: dressdiscover.api.models.worksheet.worksheet_feature_value_image.WorksheetFeatureValueImage or None
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, str):
            raise TypeError("expected id to be a str but it is a %s" % builtins.type(id))
        self.__id = id

        if display_name is not None:
            if not isinstance(display_name, str):
                raise TypeError("expected display_name to be a str but it is a %s" % builtins.type(display_name))
            if display_name.isspace():
                raise ValueError("expected display_name not to be blank")
            if len(display_name) < 1:
                raise ValueError("expected len(display_name) to be >= 1, was %d" % len(display_name))
        self.__display_name = display_name

        if image is not None:
            if not isinstance(image, dressdiscover.api.models.worksheet.worksheet_feature_value_image.WorksheetFeatureValueImage):
                raise TypeError("expected image to be a dressdiscover.api.models.worksheet.worksheet_feature_value_image.WorksheetFeatureValueImage but it is a %s" % builtins.type(image))
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
        return hash((self.id, self.display_name, self.image,))

    def __iter__(self):
        return iter((self.id, self.display_name, self.image,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace').decode('ascii') + "'")
        if self.display_name is not None:
            field_reprs.append('display_name=' + "'" + self.display_name.encode('ascii', 'replace').decode('ascii') + "'")
        if self.image is not None:
            field_reprs.append('image=' + repr(self.image))
        return 'WorksheetFeatureValueDefinition(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace').decode('ascii') + "'")
        if self.display_name is not None:
            field_reprs.append('display_name=' + "'" + self.display_name.encode('ascii', 'replace').decode('ascii') + "'")
        if self.image is not None:
            field_reprs.append('image=' + repr(self.image))
        return 'WorksheetFeatureValueDefinition(' + ', '.join(field_reprs) + ')'

    @classmethod
    def builder(cls):
        return cls.Builder()

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
        :rtype: dressdiscover.api.models.worksheet.worksheet_feature_value_image.WorksheetFeatureValueImage
        '''

        return self.__image

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_feature_value_definition.WorksheetFeatureValueDefinition
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
                init_kwds['image'] = dressdiscover.api.models.worksheet.worksheet_feature_value_image.WorksheetFeatureValueImage.read(iprot)
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replacer(self):
        return cls.Builder.from_template(template=self)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_feature_value_definition.WorksheetFeatureValueDefinition
        '''

        oprot.write_struct_begin('WorksheetFeatureValueDefinition')

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
