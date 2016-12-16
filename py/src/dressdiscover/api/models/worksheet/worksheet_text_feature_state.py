import __builtin__


class WorksheetTextFeatureState(object):
    class Builder(object):
        def __init__(
            self,
            text=None,
        ):
            '''
            :type text: str
            '''

            self.__text = text

        def build(self):
            return WorksheetTextFeatureState(text=self.__text)

        def set_text(self, text):
            '''
            :type text: str
            '''

            if text is None:
                raise ValueError('text is required')
            if not isinstance(text, basestring):
                raise TypeError("expected text to be a str but it is a %s" % getattr(__builtin__, 'type')(text))
            if text.isspace():
                raise ValueError("expected text not to be blank")
            if len(text) < 1:
                raise ValueError("expected len(text) to be >= 1, was %d" % len(text))
            self.__text = text
            return self

        @property
        def text(self):
            '''
            :rtype: str
            '''

            return self.__text

        def update(self, worksheet_text_feature_state):
            '''
            :type text: str
            '''

            if isinstance(worksheet_text_feature_state, WorksheetTextFeatureState):
                self.set_text(worksheet_text_feature_state.text)
            elif isinstance(worksheet_text_feature_state, dict):
                for key, value in worksheet_text_feature_state.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(worksheet_text_feature_state)
            return self

        @text.setter
        def text(self, text):
            '''
            :type text: str
            '''

            self.set_text(text)

    class FieldMetadata(object):
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
            return (cls.TEXT,)

    FieldMetadata.TEXT = FieldMetadata('text', str, {u'blank': False, u'minLength': 1})

    def __init__(
        self,
        text,
    ):
        '''
        :type text: str
        '''

        if text is None:
            raise ValueError('text is required')
        if not isinstance(text, basestring):
            raise TypeError("expected text to be a str but it is a %s" % getattr(__builtin__, 'type')(text))
        if text.isspace():
            raise ValueError("expected text not to be blank")
        if len(text) < 1:
            raise ValueError("expected len(text) to be >= 1, was %d" % len(text))
        self.__text = text

    def __eq__(self, other):
        if self.text != other.text:
            return False
        return True

    def __hash__(self):
        return hash(self.text)

    def __iter__(self):
        return iter((self.text,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        return 'WorksheetTextFeatureState(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        return 'WorksheetTextFeatureState(' + ', '.join(field_reprs) + ')'

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_text_feature_state.WorksheetTextFeatureState
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'text':
                init_kwds['text'] = iprot.read_string()
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        text=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type text: str or None
        :rtype: dressdiscover.api.models.worksheet.worksheet_text_feature_state.WorksheetTextFeatureState
        '''

        if text is None:
            text = self.text
        return self.__class__(text=text)

    @property
    def text(self):
        '''
        :rtype: str
        '''

        return self.__text

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_text_feature_state.WorksheetTextFeatureState
        '''

        oprot.write_struct_begin('WorksheetTextFeatureState')

        oprot.write_field_begin(name='text', type=11, id=None)
        oprot.write_string(self.text)
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
