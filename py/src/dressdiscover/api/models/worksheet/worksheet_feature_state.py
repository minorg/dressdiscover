import __builtin__
import dressdiscover.api.models.worksheet.worksheet_enum_feature_state
import dressdiscover.api.models.worksheet.worksheet_text_feature_state


class WorksheetFeatureState(object):
    class Builder(object):
        def __init__(
            self,
            enum_=None,
            text=None,
        ):
            '''
            :type enum_: dressdiscover.api.models.worksheet.worksheet_enum_feature_state.WorksheetEnumFeatureState or None
            :type text: dressdiscover.api.models.worksheet.worksheet_text_feature_state.WorksheetTextFeatureState or None
            '''

            self.__enum_ = enum_
            self.__text = text

        def build(self):
            return WorksheetFeatureState(enum_=self.__enum_, text=self.__text)

        @property
        def enum_(self):
            '''
            :rtype: dressdiscover.api.models.worksheet.worksheet_enum_feature_state.WorksheetEnumFeatureState
            '''

            return self.__enum_

        def set_enum_(self, enum_):
            '''
            :type enum_: dressdiscover.api.models.worksheet.worksheet_enum_feature_state.WorksheetEnumFeatureState or None
            '''

            if enum_ is not None:
                if not isinstance(enum_, dressdiscover.api.models.worksheet.worksheet_enum_feature_state.WorksheetEnumFeatureState):
                    raise TypeError("expected enum_ to be a dressdiscover.api.models.worksheet.worksheet_enum_feature_state.WorksheetEnumFeatureState but it is a %s" % getattr(__builtin__, 'type')(enum_))
            self.__enum_ = enum_
            return self

        def set_text(self, text):
            '''
            :type text: dressdiscover.api.models.worksheet.worksheet_text_feature_state.WorksheetTextFeatureState or None
            '''

            if text is not None:
                if not isinstance(text, dressdiscover.api.models.worksheet.worksheet_text_feature_state.WorksheetTextFeatureState):
                    raise TypeError("expected text to be a dressdiscover.api.models.worksheet.worksheet_text_feature_state.WorksheetTextFeatureState but it is a %s" % getattr(__builtin__, 'type')(text))
            self.__text = text
            return self

        @property
        def text(self):
            '''
            :rtype: dressdiscover.api.models.worksheet.worksheet_text_feature_state.WorksheetTextFeatureState
            '''

            return self.__text

        def update(self, worksheet_feature_state):
            '''
            :type enum_: dressdiscover.api.models.worksheet.worksheet_enum_feature_state.WorksheetEnumFeatureState or None
            :type text: dressdiscover.api.models.worksheet.worksheet_text_feature_state.WorksheetTextFeatureState or None
            '''

            if isinstance(worksheet_feature_state, WorksheetFeatureState):
                self.set_enum_(worksheet_feature_state.enum_)
                self.set_text(worksheet_feature_state.text)
            elif isinstance(worksheet_feature_state, dict):
                for key, value in worksheet_feature_state.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(worksheet_feature_state)
            return self

        @enum_.setter
        def enum_(self, enum_):
            '''
            :type enum_: dressdiscover.api.models.worksheet.worksheet_enum_feature_state.WorksheetEnumFeatureState or None
            '''

            self.set_enum_(enum_)

        @text.setter
        def text(self, text):
            '''
            :type text: dressdiscover.api.models.worksheet.worksheet_text_feature_state.WorksheetTextFeatureState or None
            '''

            self.set_text(text)

    class FieldMetadata(object):
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
            return (cls.ENUM_, cls.TEXT,)

    FieldMetadata.ENUM_ = FieldMetadata('enum_', dressdiscover.api.models.worksheet.worksheet_enum_feature_state.WorksheetEnumFeatureState, None)
    FieldMetadata.TEXT = FieldMetadata('text', dressdiscover.api.models.worksheet.worksheet_text_feature_state.WorksheetTextFeatureState, None)

    def __init__(
        self,
        enum_=None,
        text=None,
    ):
        '''
        :type enum_: dressdiscover.api.models.worksheet.worksheet_enum_feature_state.WorksheetEnumFeatureState or None
        :type text: dressdiscover.api.models.worksheet.worksheet_text_feature_state.WorksheetTextFeatureState or None
        '''

        if enum_ is not None:
            if not isinstance(enum_, dressdiscover.api.models.worksheet.worksheet_enum_feature_state.WorksheetEnumFeatureState):
                raise TypeError("expected enum_ to be a dressdiscover.api.models.worksheet.worksheet_enum_feature_state.WorksheetEnumFeatureState but it is a %s" % getattr(__builtin__, 'type')(enum_))
        self.__enum_ = enum_

        if text is not None:
            if not isinstance(text, dressdiscover.api.models.worksheet.worksheet_text_feature_state.WorksheetTextFeatureState):
                raise TypeError("expected text to be a dressdiscover.api.models.worksheet.worksheet_text_feature_state.WorksheetTextFeatureState but it is a %s" % getattr(__builtin__, 'type')(text))
        self.__text = text

    def __eq__(self, other):
        if self.enum_ != other.enum_:
            return False
        if self.text != other.text:
            return False
        return True

    def __hash__(self):
        return hash((self.enum_,self.text,))

    def __iter__(self):
        return iter((self.enum_, self.text,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.enum_ is not None:
            field_reprs.append('enum_=' + repr(self.enum_))
        if self.text is not None:
            field_reprs.append('text=' + repr(self.text))
        return 'WorksheetFeatureState(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.enum_ is not None:
            field_reprs.append('enum_=' + repr(self.enum_))
        if self.text is not None:
            field_reprs.append('text=' + repr(self.text))
        return 'WorksheetFeatureState(' + ', '.join(field_reprs) + ')'

    @property
    def enum_(self):
        '''
        :rtype: dressdiscover.api.models.worksheet.worksheet_enum_feature_state.WorksheetEnumFeatureState
        '''

        return self.__enum_

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'enum_':
                init_kwds['enum_'] = dressdiscover.api.models.worksheet.worksheet_enum_feature_state.WorksheetEnumFeatureState.read(iprot)
            elif ifield_name == 'text':
                init_kwds['text'] = dressdiscover.api.models.worksheet.worksheet_text_feature_state.WorksheetTextFeatureState.read(iprot)
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        enum_=None,
        text=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type enum_: dressdiscover.api.models.worksheet.worksheet_enum_feature_state.WorksheetEnumFeatureState or None
        :type text: dressdiscover.api.models.worksheet.worksheet_text_feature_state.WorksheetTextFeatureState or None
        :rtype: dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState
        '''

        if enum_ is None:
            enum_ = self.enum_
        if text is None:
            text = self.text
        return self.__class__(enum_=enum_, text=text)

    @property
    def text(self):
        '''
        :rtype: dressdiscover.api.models.worksheet.worksheet_text_feature_state.WorksheetTextFeatureState
        '''

        return self.__text

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState
        '''

        oprot.write_struct_begin('WorksheetFeatureState')

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
