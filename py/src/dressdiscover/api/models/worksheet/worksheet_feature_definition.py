import __builtin__
import dressdiscover.api.models.worksheet.worksheet_enum_feature_definition
import dressdiscover.api.models.worksheet.worksheet_text_feature_definition


class WorksheetFeatureDefinition(object):
    class Builder(object):
        def __init__(
            self,
            id=None,  # @ReservedAssignment
            display_name=None,
            enum_=None,
            text=None,
        ):
            '''
            :type id: str
            :type display_name: str or None
            :type enum_: dressdiscover.api.models.worksheet.worksheet_enum_feature_definition.WorksheetEnumFeatureDefinition or None
            :type text: dressdiscover.api.models.worksheet.worksheet_text_feature_definition.WorksheetTextFeatureDefinition or None
            '''

            self.__id = id
            self.__display_name = display_name
            self.__enum_ = enum_
            self.__text = text

        def build(self):
            return WorksheetFeatureDefinition(id=self.__id, display_name=self.__display_name, enum_=self.__enum_, text=self.__text)

        @property
        def display_name(self):
            '''
            :rtype: str
            '''

            return self.__display_name

        @property
        def enum_(self):
            '''
            :rtype: dressdiscover.api.models.worksheet.worksheet_enum_feature_definition.WorksheetEnumFeatureDefinition
            '''

            return self.__enum_

        @property
        def id(self):  # @ReservedAssignment
            '''
            :rtype: str
            '''

            return self.__id

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

        def set_enum_(self, enum_):
            '''
            :type enum_: dressdiscover.api.models.worksheet.worksheet_enum_feature_definition.WorksheetEnumFeatureDefinition or None
            '''

            if enum_ is not None:
                if not isinstance(enum_, dressdiscover.api.models.worksheet.worksheet_enum_feature_definition.WorksheetEnumFeatureDefinition):
                    raise TypeError("expected enum_ to be a dressdiscover.api.models.worksheet.worksheet_enum_feature_definition.WorksheetEnumFeatureDefinition but it is a %s" % getattr(__builtin__, 'type')(enum_))
            self.__enum_ = enum_
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

        def set_text(self, text):
            '''
            :type text: dressdiscover.api.models.worksheet.worksheet_text_feature_definition.WorksheetTextFeatureDefinition or None
            '''

            if text is not None:
                if not isinstance(text, dressdiscover.api.models.worksheet.worksheet_text_feature_definition.WorksheetTextFeatureDefinition):
                    raise TypeError("expected text to be a dressdiscover.api.models.worksheet.worksheet_text_feature_definition.WorksheetTextFeatureDefinition but it is a %s" % getattr(__builtin__, 'type')(text))
            self.__text = text
            return self

        @property
        def text(self):
            '''
            :rtype: dressdiscover.api.models.worksheet.worksheet_text_feature_definition.WorksheetTextFeatureDefinition
            '''

            return self.__text

        def update(self, worksheet_feature_definition):
            '''
            :type id: str
            :type display_name: str or None
            :type enum_: dressdiscover.api.models.worksheet.worksheet_enum_feature_definition.WorksheetEnumFeatureDefinition or None
            :type text: dressdiscover.api.models.worksheet.worksheet_text_feature_definition.WorksheetTextFeatureDefinition or None
            '''

            if isinstance(worksheet_feature_definition, WorksheetFeatureDefinition):
                self.set_id(worksheet_feature_definition.id)
                self.set_display_name(worksheet_feature_definition.display_name)
                self.set_enum_(worksheet_feature_definition.enum_)
                self.set_text(worksheet_feature_definition.text)
            elif isinstance(worksheet_feature_definition, dict):
                for key, value in worksheet_feature_definition.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(worksheet_feature_definition)
            return self

        @display_name.setter
        def display_name(self, display_name):
            '''
            :type display_name: str or None
            '''

            self.set_display_name(display_name)

        @enum_.setter
        def enum_(self, enum_):
            '''
            :type enum_: dressdiscover.api.models.worksheet.worksheet_enum_feature_definition.WorksheetEnumFeatureDefinition or None
            '''

            self.set_enum_(enum_)

        @id.setter
        def id(self, id):  # @ReservedAssignment
            '''
            :type id: str
            '''

            self.set_id(id)

        @text.setter
        def text(self, text):
            '''
            :type text: dressdiscover.api.models.worksheet.worksheet_text_feature_definition.WorksheetTextFeatureDefinition or None
            '''

            self.set_text(text)

    class FieldMetadata(object):
        ID = None
        DISPLAY_NAME = None
        ENUM_ = None
        TEXT = None

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
            return (cls.ID, cls.DISPLAY_NAME, cls.ENUM_, cls.TEXT,)

    FieldMetadata.ID = FieldMetadata('id', dressdiscover.api.models.worksheet.worksheet_feature_id.WorksheetFeatureId, None)
    FieldMetadata.DISPLAY_NAME = FieldMetadata('display_name', str, {u'blank': False, u'minLength': 1})
    FieldMetadata.ENUM_ = FieldMetadata('enum_', dressdiscover.api.models.worksheet.worksheet_enum_feature_definition.WorksheetEnumFeatureDefinition, None)
    FieldMetadata.TEXT = FieldMetadata('text', dressdiscover.api.models.worksheet.worksheet_text_feature_definition.WorksheetTextFeatureDefinition, None)

    def __init__(
        self,
        id,  # @ReservedAssignment
        display_name=None,
        enum_=None,
        text=None,
    ):
        '''
        :type id: str
        :type display_name: str or None
        :type enum_: dressdiscover.api.models.worksheet.worksheet_enum_feature_definition.WorksheetEnumFeatureDefinition or None
        :type text: dressdiscover.api.models.worksheet.worksheet_text_feature_definition.WorksheetTextFeatureDefinition or None
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

        if enum_ is not None:
            if not isinstance(enum_, dressdiscover.api.models.worksheet.worksheet_enum_feature_definition.WorksheetEnumFeatureDefinition):
                raise TypeError("expected enum_ to be a dressdiscover.api.models.worksheet.worksheet_enum_feature_definition.WorksheetEnumFeatureDefinition but it is a %s" % getattr(__builtin__, 'type')(enum_))
        self.__enum_ = enum_

        if text is not None:
            if not isinstance(text, dressdiscover.api.models.worksheet.worksheet_text_feature_definition.WorksheetTextFeatureDefinition):
                raise TypeError("expected text to be a dressdiscover.api.models.worksheet.worksheet_text_feature_definition.WorksheetTextFeatureDefinition but it is a %s" % getattr(__builtin__, 'type')(text))
        self.__text = text

    def __eq__(self, other):
        if self.id != other.id:
            return False
        if self.display_name != other.display_name:
            return False
        if self.enum_ != other.enum_:
            return False
        if self.text != other.text:
            return False
        return True

    def __hash__(self):
        return hash((self.id,self.display_name,self.enum_,self.text,))

    def __iter__(self):
        return iter((self.id, self.display_name, self.enum_, self.text,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        if self.display_name is not None:
            field_reprs.append('display_name=' + "'" + self.display_name.encode('ascii', 'replace') + "'")
        if self.enum_ is not None:
            field_reprs.append('enum_=' + repr(self.enum_))
        if self.text is not None:
            field_reprs.append('text=' + repr(self.text))
        return 'WorksheetFeatureDefinition(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        if self.display_name is not None:
            field_reprs.append('display_name=' + "'" + self.display_name.encode('ascii', 'replace') + "'")
        if self.enum_ is not None:
            field_reprs.append('enum_=' + repr(self.enum_))
        if self.text is not None:
            field_reprs.append('text=' + repr(self.text))
        return 'WorksheetFeatureDefinition(' + ', '.join(field_reprs) + ')'

    @property
    def display_name(self):
        '''
        :rtype: str
        '''

        return self.__display_name

    @property
    def enum_(self):
        '''
        :rtype: dressdiscover.api.models.worksheet.worksheet_enum_feature_definition.WorksheetEnumFeatureDefinition
        '''

        return self.__enum_

    @property
    def id(self):  # @ReservedAssignment
        '''
        :rtype: str
        '''

        return self.__id

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition
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
            elif ifield_name == 'enum_':
                init_kwds['enum_'] = dressdiscover.api.models.worksheet.worksheet_enum_feature_definition.WorksheetEnumFeatureDefinition.read(iprot)
            elif ifield_name == 'text':
                init_kwds['text'] = dressdiscover.api.models.worksheet.worksheet_text_feature_definition.WorksheetTextFeatureDefinition.read(iprot)
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        id=None,  # @ReservedAssignment
        display_name=None,
        enum_=None,
        text=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type id: str or None
        :type display_name: str or None
        :type enum_: dressdiscover.api.models.worksheet.worksheet_enum_feature_definition.WorksheetEnumFeatureDefinition or None
        :type text: dressdiscover.api.models.worksheet.worksheet_text_feature_definition.WorksheetTextFeatureDefinition or None
        :rtype: dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition
        '''

        if id is None:
            id = self.id  # @ReservedAssignment
        if display_name is None:
            display_name = self.display_name
        if enum_ is None:
            enum_ = self.enum_
        if text is None:
            text = self.text
        return self.__class__(id=id, display_name=display_name, enum_=enum_, text=text)

    @property
    def text(self):
        '''
        :rtype: dressdiscover.api.models.worksheet.worksheet_text_feature_definition.WorksheetTextFeatureDefinition
        '''

        return self.__text

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition
        '''

        oprot.write_struct_begin('WorksheetFeatureDefinition')

        oprot.write_field_begin(name='id', type=11, id=None)
        oprot.write_string(self.id)
        oprot.write_field_end()

        if self.display_name is not None:
            oprot.write_field_begin(name='display_name', type=11, id=None)
            oprot.write_string(self.display_name)
            oprot.write_field_end()

        if self.enum_ is not None:
            oprot.write_field_begin(name='enum_', type=12, id=None)
            self.enum_.write(oprot)
            oprot.write_field_end()

        if self.text is not None:
            oprot.write_field_begin(name='text', type=12, id=None)
            self.text.write(oprot)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
