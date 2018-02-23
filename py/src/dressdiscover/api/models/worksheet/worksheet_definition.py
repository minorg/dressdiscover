from collections import OrderedDict
from itertools import filterfalse
import builtins
import dressdiscover.api.models.worksheet.worksheet_feature_definition
import dressdiscover.api.models.worksheet.worksheet_feature_set_definition


class WorksheetDefinition(object):
    class Builder(object):
        def __init__(
            self,
            feature_sets=None,
            features=None,
        ):
            '''
            :type feature_sets: tuple(dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition)
            :type features: tuple(dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition)
            '''

            self.__feature_sets = feature_sets
            self.__features = features

        def build(self):
            return WorksheetDefinition(feature_sets=self.__feature_sets, features=self.__features)

        @property
        def feature_sets(self):
            '''
            :rtype: tuple(dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition)
            '''

            return self.__feature_sets

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
            builder.features = features
            return builder

        def set_feature_sets(self, feature_sets):
            '''
            :type feature_sets: tuple(dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition)
            '''

            if feature_sets is None:
                raise ValueError('feature_sets is required')
            if not (isinstance(feature_sets, tuple) and len(list(filterfalse(lambda _: isinstance(_, dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition), feature_sets))) == 0):
                raise TypeError("expected feature_sets to be a tuple(dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition) but it is a %s" % builtins.type(feature_sets))
            self.__feature_sets = feature_sets
            return self

        def set_features(self, features):
            '''
            :type features: tuple(dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition)
            '''

            if features is None:
                raise ValueError('features is required')
            if not (isinstance(features, tuple) and len(list(filterfalse(lambda _: isinstance(_, dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition), features))) == 0):
                raise TypeError("expected features to be a tuple(dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition) but it is a %s" % builtins.type(features))
            self.__features = features
            return self

        def update(self, worksheet_definition):
            '''
            :type feature_sets: tuple(dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition)
            :type features: tuple(dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition)
            '''

            if isinstance(worksheet_definition, WorksheetDefinition):
                self.set_feature_sets(worksheet_definition.feature_sets)
                self.set_features(worksheet_definition.features)
            elif isinstance(worksheet_definition, dict):
                for key, value in worksheet_definition.items():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(worksheet_definition)
            return self

        @feature_sets.setter
        def feature_sets(self, feature_sets):
            '''
            :type feature_sets: tuple(dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition)
            '''

            self.set_feature_sets(feature_sets)

        @features.setter
        def features(self, features):
            '''
            :type features: tuple(dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition)
            '''

            self.set_features(features)

    class FieldMetadata(object):
        FEATURE_SETS = None
        FEATURES = None

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
            return (cls.FEATURE_SETS, cls.FEATURES,)

    FieldMetadata.FEATURE_SETS = FieldMetadata('feature_sets', tuple, None)
    FieldMetadata.FEATURES = FieldMetadata('features', tuple, None)

    def __init__(
        self,
        feature_sets,
        features,
    ):
        '''
        :type feature_sets: tuple(dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition)
        :type features: tuple(dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition)
        '''

        if feature_sets is None:
            raise ValueError('feature_sets is required')
        if not (isinstance(feature_sets, tuple) and len(list(filterfalse(lambda _: isinstance(_, dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition), feature_sets))) == 0):
            raise TypeError("expected feature_sets to be a tuple(dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition) but it is a %s" % builtins.type(feature_sets))
        self.__feature_sets = feature_sets

        if features is None:
            raise ValueError('features is required')
        if not (isinstance(features, tuple) and len(list(filterfalse(lambda _: isinstance(_, dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition), features))) == 0):
            raise TypeError("expected features to be a tuple(dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition) but it is a %s" % builtins.type(features))
        self.__features = features

    def __eq__(self, other):
        if self.feature_sets != other.feature_sets:
            return False
        if self.features != other.features:
            return False
        return True

    def __hash__(self):
        return hash((self.feature_sets, self.features,))

    def __iter__(self):
        return iter((self.feature_sets, self.features,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('feature_sets=' + repr(self.feature_sets))
        field_reprs.append('features=' + repr(self.features))
        return 'WorksheetDefinition(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('feature_sets=' + repr(self.feature_sets))
        field_reprs.append('features=' + repr(self.features))
        return 'WorksheetDefinition(' + ', '.join(field_reprs) + ')'

    @classmethod
    def builder(cls):
        return cls.Builder()

    @property
    def feature_sets(self):
        '''
        :rtype: tuple(dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition)
        '''

        return self.__feature_sets

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
            elif ifield_name == 'features':
                init_kwds['features'] = tuple([dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
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

        oprot.write_field_begin(name='features', type=15, id=None)
        oprot.write_list_begin(12, len(self.features))
        for _0 in self.features:
            _0.write(oprot)
        oprot.write_list_end()
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
