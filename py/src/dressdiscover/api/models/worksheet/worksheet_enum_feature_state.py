from itertools import ifilterfalse
import __builtin__


class WorksheetEnumFeatureState(object):
    class Builder(object):
        def __init__(
            self,
            selected_values=None,
        ):
            '''
            :type selected_values: tuple(str)
            '''

            self.__selected_values = selected_values

        def build(self):
            return WorksheetEnumFeatureState(selected_values=self.__selected_values)

        @property
        def selected_values(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__selected_values

        def set_selected_values(self, selected_values):
            '''
            :type selected_values: tuple(str)
            '''

            if selected_values is None:
                raise ValueError('selected_values is required')
            if not (isinstance(selected_values, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), selected_values))) == 0):
                raise TypeError("expected selected_values to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(selected_values))
            if len(selected_values) < 1:
                raise ValueError("expected len(selected_values) to be >= 1, was %d" % len(selected_values))
            self.__selected_values = selected_values
            return self

        def update(self, worksheet_enum_feature_state):
            '''
            :type selected_values: tuple(str)
            '''

            if isinstance(worksheet_enum_feature_state, WorksheetEnumFeatureState):
                self.set_selected_values(worksheet_enum_feature_state.selected_values)
            elif isinstance(worksheet_enum_feature_state, dict):
                for key, value in worksheet_enum_feature_state.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(worksheet_enum_feature_state)
            return self

        @selected_values.setter
        def selected_values(self, selected_values):
            '''
            :type selected_values: tuple(str)
            '''

            self.set_selected_values(selected_values)

    class FieldMetadata(object):
        SELECTED_VALUES = None

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
            return (cls.SELECTED_VALUES,)

    FieldMetadata.SELECTED_VALUES = FieldMetadata('selected_values', tuple, {u'minLength': 1})

    def __init__(
        self,
        selected_values,
    ):
        '''
        :type selected_values: tuple(str)
        '''

        if selected_values is None:
            raise ValueError('selected_values is required')
        if not (isinstance(selected_values, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), selected_values))) == 0):
            raise TypeError("expected selected_values to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(selected_values))
        if len(selected_values) < 1:
            raise ValueError("expected len(selected_values) to be >= 1, was %d" % len(selected_values))
        self.__selected_values = selected_values

    def __eq__(self, other):
        if self.selected_values != other.selected_values:
            return False
        return True

    def __hash__(self):
        return hash(self.selected_values)

    def __iter__(self):
        return iter((self.selected_values,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('selected_values=' + repr(self.selected_values))
        return 'WorksheetEnumFeatureState(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('selected_values=' + repr(self.selected_values))
        return 'WorksheetEnumFeatureState(' + ', '.join(field_reprs) + ')'

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_enum_feature_state.WorksheetEnumFeatureState
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'selected_values':
                init_kwds['selected_values'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        selected_values=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type selected_values: tuple(str) or None
        :rtype: dressdiscover.api.models.worksheet.worksheet_enum_feature_state.WorksheetEnumFeatureState
        '''

        if selected_values is None:
            selected_values = self.selected_values
        return self.__class__(selected_values=selected_values)

    @property
    def selected_values(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__selected_values

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_enum_feature_state.WorksheetEnumFeatureState
        '''

        oprot.write_struct_begin('WorksheetEnumFeatureState')

        oprot.write_field_begin(name='selected_values', type=15, id=None)
        oprot.write_list_begin(11, len(self.selected_values))
        for _0 in self.selected_values:
            oprot.write_string(_0)
        oprot.write_list_end()
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
