from itertools import ifilterfalse
import __builtin__


class WorksheetFeatureState(object):
    class Builder(object):
        def __init__(
            self,
            selected_values=None,
            text=None,
        ):
            '''
            :type selected_values: tuple(str) or None
            :type text: str or None
            '''

            self.__selected_values = selected_values
            self.__text = text

        def build(self):
            return WorksheetFeatureState(selected_values=self.__selected_values, text=self.__text)

        @property
        def selected_values(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__selected_values

        def set_selected_values(self, selected_values):
            '''
            :type selected_values: tuple(str) or None
            '''

            if selected_values is not None:
                if not (isinstance(selected_values, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), selected_values))) == 0):
                    raise TypeError("expected selected_values to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(selected_values))
                if len(selected_values) < 1:
                    raise ValueError("expected len(selected_values) to be >= 1, was %d" % len(selected_values))
            self.__selected_values = selected_values
            return self

        def set_text(self, text):
            '''
            :type text: str or None
            '''

            if text is not None:
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

        def update(self, worksheet_feature_state):
            '''
            :type selected_values: tuple(str) or None
            :type text: str or None
            '''

            if isinstance(worksheet_feature_state, WorksheetFeatureState):
                self.set_selected_values(worksheet_feature_state.selected_values)
                self.set_text(worksheet_feature_state.text)
            elif isinstance(worksheet_feature_state, dict):
                for key, value in worksheet_feature_state.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(worksheet_feature_state)
            return self

        @selected_values.setter
        def selected_values(self, selected_values):
            '''
            :type selected_values: tuple(str) or None
            '''

            self.set_selected_values(selected_values)

        @text.setter
        def text(self, text):
            '''
            :type text: str or None
            '''

            self.set_text(text)

    class FieldMetadata(object):
        SELECTED_VALUES = None
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
            return (cls.SELECTED_VALUES, cls.TEXT,)

    FieldMetadata.SELECTED_VALUES = FieldMetadata('selected_values', tuple, {u'minLength': 1})
    FieldMetadata.TEXT = FieldMetadata('text', str, {u'blank': False, u'minLength': 1})

    def __init__(
        self,
        selected_values=None,
        text=None,
    ):
        '''
        :type selected_values: tuple(str) or None
        :type text: str or None
        '''

        if selected_values is not None:
            if not (isinstance(selected_values, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), selected_values))) == 0):
                raise TypeError("expected selected_values to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(selected_values))
            if len(selected_values) < 1:
                raise ValueError("expected len(selected_values) to be >= 1, was %d" % len(selected_values))
        self.__selected_values = selected_values

        if text is not None:
            if not isinstance(text, basestring):
                raise TypeError("expected text to be a str but it is a %s" % getattr(__builtin__, 'type')(text))
            if text.isspace():
                raise ValueError("expected text not to be blank")
            if len(text) < 1:
                raise ValueError("expected len(text) to be >= 1, was %d" % len(text))
        self.__text = text

    def __eq__(self, other):
        if self.selected_values != other.selected_values:
            return False
        if self.text != other.text:
            return False
        return True

    def __hash__(self):
        return hash((self.selected_values,self.text,))

    def __iter__(self):
        return iter((self.selected_values, self.text,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.selected_values is not None:
            field_reprs.append('selected_values=' + repr(self.selected_values))
        if self.text is not None:
            field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        return 'WorksheetFeatureState(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.selected_values is not None:
            field_reprs.append('selected_values=' + repr(self.selected_values))
        if self.text is not None:
            field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        return 'WorksheetFeatureState(' + ', '.join(field_reprs) + ')'

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
            elif ifield_name == 'selected_values':
                init_kwds['selected_values'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'text':
                try:
                    init_kwds['text'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        selected_values=None,
        text=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type selected_values: tuple(str) or None
        :type text: str or None
        :rtype: dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState
        '''

        if selected_values is None:
            selected_values = self.selected_values
        if text is None:
            text = self.text
        return self.__class__(selected_values=selected_values, text=text)

    @property
    def selected_values(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__selected_values

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
        :rtype: dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState
        '''

        oprot.write_struct_begin('WorksheetFeatureState')

        if self.selected_values is not None:
            oprot.write_field_begin(name='selected_values', type=15, id=None)
            oprot.write_list_begin(11, len(self.selected_values))
            for _0 in self.selected_values:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.text is not None:
            oprot.write_field_begin(name='text', type=11, id=None)
            oprot.write_string(self.text)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
