from collections import OrderedDict
from itertools import filterfalse
import builtins
import dressdiscover.api.models.worksheet.worksheet_extent_definition
import dressdiscover.api.models.worksheet.worksheet_feature_definition
import dressdiscover.api.models.worksheet.worksheet_feature_set_definition
import dressdiscover.api.models.worksheet.worksheet_feature_value_definition


class WorksheetDefinition(object):
    class Builder(object):
        def __init__(
            self,
            feature_sets=None,
            feature_values=None,
            features=None,
            extents=None,
        ):
            '''
            :type feature_sets: tuple(dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition)
            :type feature_values: tuple(dressdiscover.api.models.worksheet.worksheet_feature_value_definition.WorksheetFeatureValueDefinition)
            :type features: tuple(dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition)
            :type extents: tuple(dressdiscover.api.models.worksheet.worksheet_extent_definition.WorksheetExtentDefinition) or None
            '''

            self.__feature_sets = feature_sets
            self.__feature_values = feature_values
            self.__features = features
            self.__extents = extents

        def build(self):
            return WorksheetDefinition(feature_sets=self.__feature_sets, feature_values=self.__feature_values, features=self.__features, extents=self.__extents)

        @property
        def extents(self):
            '''
            :rtype: tuple(dressdiscover.api.models.worksheet.worksheet_extent_definition.WorksheetExtentDefinition)
            '''

            return self.__extents

        @property
        def feature_sets(self):
            '''
            :rtype: tuple(dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition)
            '''

            return self.__feature_sets

        @property
        def feature_values(self):
            '''
            :rtype: tuple(dressdiscover.api.models.worksheet.worksheet_feature_value_definition.WorksheetFeatureValueDefinition)
            '''

            return self.__feature_values

        @property
        def features(self):
            '''
            :rtype: tuple(dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition)
            '''

            return self.__features

        @classmethod
        def from_template(cls, template):
            '''
            :type template: dressdiscover.api.models.worksheet.worksheet_definition.WorksheetDefinition
            :rtype: dressdiscover.api.models.worksheet.worksheet_definition.WorksheetDefinition
            '''

            builder = cls()
            builder.feature_sets = feature_sets
            builder.feature_values = feature_values
            builder.features = features
            builder.extents = extents
            return builder

        def set_extents(self, extents):
            '''
            :type extents: tuple(dressdiscover.api.models.worksheet.worksheet_extent_definition.WorksheetExtentDefinition) or None
            '''

            if extents is not None:
                if not (isinstance(extents, tuple) and len(list(filterfalse(lambda _: isinstance(_, dressdiscover.api.models.worksheet.worksheet_extent_definition.WorksheetExtentDefinition), extents))) == 0):
                    raise TypeError("expected extents to be a tuple(dressdiscover.api.models.worksheet.worksheet_extent_definition.WorksheetExtentDefinition) but it is a %s" % builtins.type(extents))
                if len(extents) < 1:
                    raise ValueError("expected len(extents) to be >= 1, was %d" % len(extents))
            self.__extents = extents
            return self

        def set_feature_sets(self, feature_sets):
            '''
            :type feature_sets: tuple(dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition)
            '''

            if feature_sets is None:
                raise ValueError('feature_sets is required')
            if not (isinstance(feature_sets, tuple) and len(list(filterfalse(lambda _: isinstance(_, dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition), feature_sets))) == 0):
                raise TypeError("expected feature_sets to be a tuple(dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition) but it is a %s" % builtins.type(feature_sets))
            if len(feature_sets) < 1:
                raise ValueError("expected len(feature_sets) to be >= 1, was %d" % len(feature_sets))
            self.__feature_sets = feature_sets
            return self

        def set_feature_values(self, feature_values):
            '''
            :type feature_values: tuple(dressdiscover.api.models.worksheet.worksheet_feature_value_definition.WorksheetFeatureValueDefinition)
            '''

            if feature_values is None:
                raise ValueError('feature_values is required')
            if not (isinstance(feature_values, tuple) and len(list(filterfalse(lambda _: isinstance(_, dressdiscover.api.models.worksheet.worksheet_feature_value_definition.WorksheetFeatureValueDefinition), feature_values))) == 0):
                raise TypeError("expected feature_values to be a tuple(dressdiscover.api.models.worksheet.worksheet_feature_value_definition.WorksheetFeatureValueDefinition) but it is a %s" % builtins.type(feature_values))
            if len(feature_values) < 1:
                raise ValueError("expected len(feature_values) to be >= 1, was %d" % len(feature_values))
            self.__feature_values = feature_values
            return self

        def set_features(self, features):
            '''
            :type features: tuple(dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition)
            '''

            if features is None:
                raise ValueError('features is required')
            if not (isinstance(features, tuple) and len(list(filterfalse(lambda _: isinstance(_, dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition), features))) == 0):
                raise TypeError("expected features to be a tuple(dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition) but it is a %s" % builtins.type(features))
            if len(features) < 1:
                raise ValueError("expected len(features) to be >= 1, was %d" % len(features))
            self.__features = features
            return self

        def update(self, worksheet_definition):
            '''
            :type feature_sets: tuple(dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition)
            :type feature_values: tuple(dressdiscover.api.models.worksheet.worksheet_feature_value_definition.WorksheetFeatureValueDefinition)
            :type features: tuple(dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition)
            :type extents: tuple(dressdiscover.api.models.worksheet.worksheet_extent_definition.WorksheetExtentDefinition) or None
            '''

            if isinstance(worksheet_definition, WorksheetDefinition):
                self.set_feature_sets(worksheet_definition.feature_sets)
                self.set_feature_values(worksheet_definition.feature_values)
                self.set_features(worksheet_definition.features)
                self.set_extents(worksheet_definition.extents)
            elif isinstance(worksheet_definition, dict):
                for key, value in worksheet_definition.items():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(worksheet_definition)
            return self

        @extents.setter
        def extents(self, extents):
            '''
            :type extents: tuple(dressdiscover.api.models.worksheet.worksheet_extent_definition.WorksheetExtentDefinition) or None
            '''

            self.set_extents(extents)

        @feature_sets.setter
        def feature_sets(self, feature_sets):
            '''
            :type feature_sets: tuple(dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition)
            '''

            self.set_feature_sets(feature_sets)

        @feature_values.setter
        def feature_values(self, feature_values):
            '''
            :type feature_values: tuple(dressdiscover.api.models.worksheet.worksheet_feature_value_definition.WorksheetFeatureValueDefinition)
            '''

            self.set_feature_values(feature_values)

        @features.setter
        def features(self, features):
            '''
            :type features: tuple(dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition)
            '''

            self.set_features(features)

    class FieldMetadata(object):
        FEATURE_SETS = None
        FEATURE_VALUES = None
        FEATURES = None
        EXTENTS = None

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
            return (cls.FEATURE_SETS, cls.FEATURE_VALUES, cls.FEATURES, cls.EXTENTS,)

    FieldMetadata.FEATURE_SETS = FieldMetadata('feature_sets', tuple, OrderedDict([('minLength', 1)]))
    FieldMetadata.FEATURE_VALUES = FieldMetadata('feature_values', tuple, OrderedDict([('minLength', 1)]))
    FieldMetadata.FEATURES = FieldMetadata('features', tuple, OrderedDict([('minLength', 1)]))
    FieldMetadata.EXTENTS = FieldMetadata('extents', tuple, OrderedDict([('minLength', 1)]))

    def __init__(
        self,
        feature_sets,
        feature_values,
        features,
        extents=None,
    ):
        '''
        :type feature_sets: tuple(dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition)
        :type feature_values: tuple(dressdiscover.api.models.worksheet.worksheet_feature_value_definition.WorksheetFeatureValueDefinition)
        :type features: tuple(dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition)
        :type extents: tuple(dressdiscover.api.models.worksheet.worksheet_extent_definition.WorksheetExtentDefinition) or None
        '''

        if feature_sets is None:
            raise ValueError('feature_sets is required')
        if not (isinstance(feature_sets, tuple) and len(list(filterfalse(lambda _: isinstance(_, dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition), feature_sets))) == 0):
            raise TypeError("expected feature_sets to be a tuple(dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition) but it is a %s" % builtins.type(feature_sets))
        if len(feature_sets) < 1:
            raise ValueError("expected len(feature_sets) to be >= 1, was %d" % len(feature_sets))
        self.__feature_sets = feature_sets

        if feature_values is None:
            raise ValueError('feature_values is required')
        if not (isinstance(feature_values, tuple) and len(list(filterfalse(lambda _: isinstance(_, dressdiscover.api.models.worksheet.worksheet_feature_value_definition.WorksheetFeatureValueDefinition), feature_values))) == 0):
            raise TypeError("expected feature_values to be a tuple(dressdiscover.api.models.worksheet.worksheet_feature_value_definition.WorksheetFeatureValueDefinition) but it is a %s" % builtins.type(feature_values))
        if len(feature_values) < 1:
            raise ValueError("expected len(feature_values) to be >= 1, was %d" % len(feature_values))
        self.__feature_values = feature_values

        if features is None:
            raise ValueError('features is required')
        if not (isinstance(features, tuple) and len(list(filterfalse(lambda _: isinstance(_, dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition), features))) == 0):
            raise TypeError("expected features to be a tuple(dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition) but it is a %s" % builtins.type(features))
        if len(features) < 1:
            raise ValueError("expected len(features) to be >= 1, was %d" % len(features))
        self.__features = features

        if extents is not None:
            if not (isinstance(extents, tuple) and len(list(filterfalse(lambda _: isinstance(_, dressdiscover.api.models.worksheet.worksheet_extent_definition.WorksheetExtentDefinition), extents))) == 0):
                raise TypeError("expected extents to be a tuple(dressdiscover.api.models.worksheet.worksheet_extent_definition.WorksheetExtentDefinition) but it is a %s" % builtins.type(extents))
            if len(extents) < 1:
                raise ValueError("expected len(extents) to be >= 1, was %d" % len(extents))
        self.__extents = extents

    def __eq__(self, other):
        if self.feature_sets != other.feature_sets:
            return False
        if self.feature_values != other.feature_values:
            return False
        if self.features != other.features:
            return False
        if self.extents != other.extents:
            return False
        return True

    def __hash__(self):
        return hash((self.feature_sets, self.feature_values, self.features, self.extents,))

    def __iter__(self):
        return iter((self.feature_sets, self.feature_values, self.features, self.extents,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('feature_sets=' + repr(self.feature_sets))
        field_reprs.append('feature_values=' + repr(self.feature_values))
        field_reprs.append('features=' + repr(self.features))
        if self.extents is not None:
            field_reprs.append('extents=' + repr(self.extents))
        return 'WorksheetDefinition(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('feature_sets=' + repr(self.feature_sets))
        field_reprs.append('feature_values=' + repr(self.feature_values))
        field_reprs.append('features=' + repr(self.features))
        if self.extents is not None:
            field_reprs.append('extents=' + repr(self.extents))
        return 'WorksheetDefinition(' + ', '.join(field_reprs) + ')'

    @classmethod
    def builder(cls):
        return cls.Builder()

    @property
    def extents(self):
        '''
        :rtype: tuple(dressdiscover.api.models.worksheet.worksheet_extent_definition.WorksheetExtentDefinition)
        '''

        return self.__extents

    @property
    def feature_sets(self):
        '''
        :rtype: tuple(dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition)
        '''

        return self.__feature_sets

    @property
    def feature_values(self):
        '''
        :rtype: tuple(dressdiscover.api.models.worksheet.worksheet_feature_value_definition.WorksheetFeatureValueDefinition)
        '''

        return self.__feature_values

    @property
    def features(self):
        '''
        :rtype: tuple(dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition)
        '''

        return self.__features

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_definition.WorksheetDefinition
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'feature_sets':
                init_kwds['feature_sets'] = tuple([dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'feature_values':
                init_kwds['feature_values'] = tuple([dressdiscover.api.models.worksheet.worksheet_feature_value_definition.WorksheetFeatureValueDefinition.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'features':
                init_kwds['features'] = tuple([dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'extents':
                init_kwds['extents'] = tuple([dressdiscover.api.models.worksheet.worksheet_extent_definition.WorksheetExtentDefinition.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replacer(self):
        return cls.Builder.from_template(template=self)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_definition.WorksheetDefinition
        '''

        oprot.write_struct_begin('WorksheetDefinition')

        oprot.write_field_begin(name='feature_sets', type=15, id=None)
        oprot.write_list_begin(12, len(self.feature_sets))
        for _0 in self.feature_sets:
            _0.write(oprot)
        oprot.write_list_end()
        oprot.write_field_end()

        oprot.write_field_begin(name='feature_values', type=15, id=None)
        oprot.write_list_begin(12, len(self.feature_values))
        for _0 in self.feature_values:
            _0.write(oprot)
        oprot.write_list_end()
        oprot.write_field_end()

        oprot.write_field_begin(name='features', type=15, id=None)
        oprot.write_list_begin(12, len(self.features))
        for _0 in self.features:
            _0.write(oprot)
        oprot.write_list_end()
        oprot.write_field_end()

        if self.extents is not None:
            oprot.write_field_begin(name='extents', type=15, id=None)
            oprot.write_list_begin(12, len(self.extents))
            for _0 in self.extents:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
