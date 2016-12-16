from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.models.worksheet.worksheet_enum_feature_value_definition


class WorksheetEnumFeatureDefinition(object):
    class Builder(object):
        def __init__(
            self,
            values_=None,
        ):
            '''
            :type values_: tuple(dressdiscover.api.models.worksheet.worksheet_enum_feature_value_definition.WorksheetEnumFeatureValueDefinition)
            '''

            self.__values_ = values_

        def build(self):
            return WorksheetEnumFeatureDefinition(values_=self.__values_)

        def set_values_(self, values_):
            '''
            :type values_: tuple(dressdiscover.api.models.worksheet.worksheet_enum_feature_value_definition.WorksheetEnumFeatureValueDefinition)
            '''

            if values_ is None:
                raise ValueError('values_ is required')
            if not (isinstance(values_, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.worksheet.worksheet_enum_feature_value_definition.WorksheetEnumFeatureValueDefinition), values_))) == 0):
                raise TypeError("expected values_ to be a tuple(dressdiscover.api.models.worksheet.worksheet_enum_feature_value_definition.WorksheetEnumFeatureValueDefinition) but it is a %s" % getattr(__builtin__, 'type')(values_))
            if len(values_) < 1:
                raise ValueError("expected len(values_) to be >= 1, was %d" % len(values_))
            self.__values_ = values_
            return self

        def update(self, worksheet_enum_feature_definition):
            '''
            :type values_: tuple(dressdiscover.api.models.worksheet.worksheet_enum_feature_value_definition.WorksheetEnumFeatureValueDefinition)
            '''

            if isinstance(worksheet_enum_feature_definition, WorksheetEnumFeatureDefinition):
                self.set_values_(worksheet_enum_feature_definition.values_)
            elif isinstance(worksheet_enum_feature_definition, dict):
                for key, value in worksheet_enum_feature_definition.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(worksheet_enum_feature_definition)
            return self

        @property
        def values_(self):
            '''
            :rtype: tuple(dressdiscover.api.models.worksheet.worksheet_enum_feature_value_definition.WorksheetEnumFeatureValueDefinition)
            '''

            return self.__values_

        @values_.setter
        def values_(self, values_):
            '''
            :type values_: tuple(dressdiscover.api.models.worksheet.worksheet_enum_feature_value_definition.WorksheetEnumFeatureValueDefinition)
            '''

            self.set_values_(values_)

    class FieldMetadata(object):
        VALUES_ = None

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
            return (cls.VALUES_,)

    FieldMetadata.VALUES_ = FieldMetadata('values_', tuple, {u'minLength': 1})

    def __init__(
        self,
        values_,
    ):
        '''
        :type values_: tuple(dressdiscover.api.models.worksheet.worksheet_enum_feature_value_definition.WorksheetEnumFeatureValueDefinition)
        '''

        if values_ is None:
            raise ValueError('values_ is required')
        if not (isinstance(values_, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.worksheet.worksheet_enum_feature_value_definition.WorksheetEnumFeatureValueDefinition), values_))) == 0):
            raise TypeError("expected values_ to be a tuple(dressdiscover.api.models.worksheet.worksheet_enum_feature_value_definition.WorksheetEnumFeatureValueDefinition) but it is a %s" % getattr(__builtin__, 'type')(values_))
        if len(values_) < 1:
            raise ValueError("expected len(values_) to be >= 1, was %d" % len(values_))
        self.__values_ = values_

    def __eq__(self, other):
        if self.values_ != other.values_:
            return False
        return True

    def __hash__(self):
        return hash(self.values_)

    def __iter__(self):
        return iter((self.values_,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('values_=' + repr(self.values_))
        return 'WorksheetEnumFeatureDefinition(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('values_=' + repr(self.values_))
        return 'WorksheetEnumFeatureDefinition(' + ', '.join(field_reprs) + ')'

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_enum_feature_definition.WorksheetEnumFeatureDefinition
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'values_':
                init_kwds['values_'] = tuple([dressdiscover.api.models.worksheet.worksheet_enum_feature_value_definition.WorksheetEnumFeatureValueDefinition.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        values_=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type values_: tuple(dressdiscover.api.models.worksheet.worksheet_enum_feature_value_definition.WorksheetEnumFeatureValueDefinition) or None
        :rtype: dressdiscover.api.models.worksheet.worksheet_enum_feature_definition.WorksheetEnumFeatureDefinition
        '''

        if values_ is None:
            values_ = self.values_
        return self.__class__(values_=values_)

    @property
    def values_(self):
        '''
        :rtype: tuple(dressdiscover.api.models.worksheet.worksheet_enum_feature_value_definition.WorksheetEnumFeatureValueDefinition)
        '''

        return self.__values_

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_enum_feature_definition.WorksheetEnumFeatureDefinition
        '''

        oprot.write_struct_begin('WorksheetEnumFeatureDefinition')

        oprot.write_field_begin(name='values_', type=15, id=None)
        oprot.write_list_begin(12, len(self.values_))
        for _0 in self.values_:
            _0.write(oprot)
        oprot.write_list_end()
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
