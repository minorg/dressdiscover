from collections import OrderedDict
from itertools import filterfalse
import builtins


class WorksheetFeatureState(object):
    class Builder(object):
        def __init__(
            self,
            selected_value_ids=None,
            text=None,
        ):
            '''
            :type selected_value_ids: tuple(str) or None
            :type text: str or None
            '''

            self.__selected_value_ids = selected_value_ids
            self.__text = text

        def build(self):
            return WorksheetFeatureState(selected_value_ids=self.__selected_value_ids, text=self.__text)

        @classmethod
        def from_template(cls, template):
            '''
            :type template: dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState
            :rtype: dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState
            '''

            builder = cls()
            builder.selected_value_ids = selected_value_ids
            builder.text = text
            return builder

        @property
        def selected_value_ids(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__selected_value_ids

        def set_selected_value_ids(self, selected_value_ids):
            '''
            :type selected_value_ids: tuple(str) or None
            '''

            if selected_value_ids is not None:
                if not (isinstance(selected_value_ids, tuple) and len(list(filterfalse(lambda _: isinstance(_, str), selected_value_ids))) == 0):
                    raise TypeError("expected selected_value_ids to be a tuple(str) but it is a %s" % builtins.type(selected_value_ids))
                if len(selected_value_ids) < 1:
                    raise ValueError("expected len(selected_value_ids) to be >= 1, was %d" % len(selected_value_ids))
            self.__selected_value_ids = selected_value_ids
            return self

        def set_text(self, text):
            '''
            :type text: str or None
            '''

            if text is not None:
                if not isinstance(text, str):
                    raise TypeError("expected text to be a str but it is a %s" % builtins.type(text))
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
            :type selected_value_ids: tuple(str) or None
            :type text: str or None
            '''

            if isinstance(worksheet_feature_state, WorksheetFeatureState):
                self.set_selected_value_ids(worksheet_feature_state.selected_value_ids)
                self.set_text(worksheet_feature_state.text)
            elif isinstance(worksheet_feature_state, dict):
                for key, value in worksheet_feature_state.items():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(worksheet_feature_state)
            return self

        @selected_value_ids.setter
        def selected_value_ids(self, selected_value_ids):
            '''
            :type selected_value_ids: tuple(str) or None
            '''

            self.set_selected_value_ids(selected_value_ids)

        @text.setter
        def text(self, text):
            '''
            :type text: str or None
            '''

            self.set_text(text)

    class FieldMetadata(object):
        SELECTED_VALUE_IDS = None
        TEXT = None

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
            return (cls.SELECTED_VALUE_IDS, cls.TEXT,)

    FieldMetadata.SELECTED_VALUE_IDS = FieldMetadata('selected_value_ids', tuple, OrderedDict([('minLength', 1)]))
    FieldMetadata.TEXT = FieldMetadata('text', str, OrderedDict([('blank', False), ('minLength', 1)]))

    def __init__(
        self,
        selected_value_ids=None,
        text=None,
    ):
        '''
        :type selected_value_ids: tuple(str) or None
        :type text: str or None
        '''

        if selected_value_ids is not None:
            if not (isinstance(selected_value_ids, tuple) and len(list(filterfalse(lambda _: isinstance(_, str), selected_value_ids))) == 0):
                raise TypeError("expected selected_value_ids to be a tuple(str) but it is a %s" % builtins.type(selected_value_ids))
            if len(selected_value_ids) < 1:
                raise ValueError("expected len(selected_value_ids) to be >= 1, was %d" % len(selected_value_ids))
        self.__selected_value_ids = selected_value_ids

        if text is not None:
            if not isinstance(text, str):
                raise TypeError("expected text to be a str but it is a %s" % builtins.type(text))
            if text.isspace():
                raise ValueError("expected text not to be blank")
            if len(text) < 1:
                raise ValueError("expected len(text) to be >= 1, was %d" % len(text))
        self.__text = text

    def __eq__(self, other):
        if self.selected_value_ids != other.selected_value_ids:
            return False
        if self.text != other.text:
            return False
        return True

    def __hash__(self):
        return hash((self.selected_value_ids, self.text,))

    def __iter__(self):
        return iter((self.selected_value_ids, self.text,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.selected_value_ids is not None:
            field_reprs.append('selected_value_ids=' + repr(self.selected_value_ids))
        if self.text is not None:
            field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace').decode('ascii') + "'")
        return 'WorksheetFeatureState(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.selected_value_ids is not None:
            field_reprs.append('selected_value_ids=' + repr(self.selected_value_ids))
        if self.text is not None:
            field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace').decode('ascii') + "'")
        return 'WorksheetFeatureState(' + ', '.join(field_reprs) + ')'

    @classmethod
    def builder(cls):
        return cls.Builder()

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
            elif ifield_name == 'selected_value_ids':
                init_kwds['selected_value_ids'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'text':
                try:
                    init_kwds['text'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replacer(self):
        return cls.Builder.from_template(template=self)

    @property
    def selected_value_ids(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__selected_value_ids

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

        if self.selected_value_ids is not None:
            oprot.write_field_begin(name='selected_value_ids', type=15, id=None)
            oprot.write_list_begin(11, len(self.selected_value_ids))
            for _0 in self.selected_value_ids:
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
