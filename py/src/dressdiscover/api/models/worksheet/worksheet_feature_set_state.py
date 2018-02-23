from collections import OrderedDict
from itertools import filterfalse
import builtins
import dressdiscover.api.models.worksheet.worksheet_feature_state


class WorksheetFeatureSetState(object):
    class Builder(object):
        def __init__(
            self,
            features=None,
        ):
            '''
            :type features: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState) or None
            '''

            self.__features = features

        def build(self):
            return WorksheetFeatureSetState(features=self.__features)

        @property
        def features(self):
            '''
            :rtype: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState)
            '''

            return self.__features.copy() if self.__features is not None else None

        @classmethod
        def from_template(cls, template):
            '''
            :type template: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState
            :rtype: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState
            '''

            builder = cls()
            builder.features = features
            return builder

        def set_features(self, features):
            '''
            :type features: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState) or None
            '''

            if features is not None:
                if not (isinstance(features, dict) and len(list(filterfalse(lambda __item: isinstance(__item[0], str) and isinstance(__item[1], dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState), features.items()))) == 0):
                    raise TypeError("expected features to be a dict(str: dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState) but it is a %s" % builtins.type(features))
            self.__features = features
            return self

        def update(self, worksheet_feature_set_state):
            '''
            :type features: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState) or None
            '''

            if isinstance(worksheet_feature_set_state, WorksheetFeatureSetState):
                self.set_features(worksheet_feature_set_state.features)
            elif isinstance(worksheet_feature_set_state, dict):
                for key, value in worksheet_feature_set_state.items():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(worksheet_feature_set_state)
            return self

        @features.setter
        def features(self, features):
            '''
            :type features: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState) or None
            '''

            self.set_features(features)

    class FieldMetadata(object):
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
            return (cls.FEATURES,)

    FieldMetadata.FEATURES = FieldMetadata('features', dict, None)

    def __init__(
        self,
        features=None,
    ):
        '''
        :type features: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState) or None
        '''

        if features is not None:
            if not (isinstance(features, dict) and len(list(filterfalse(lambda __item: isinstance(__item[0], str) and isinstance(__item[1], dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState), features.items()))) == 0):
                raise TypeError("expected features to be a dict(str: dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState) but it is a %s" % builtins.type(features))
        self.__features = features.copy() if features is not None else None

    def __eq__(self, other):
        if self.features != other.features:
            return False
        return True

    def __hash__(self):
        return hash(self.features)

    def __iter__(self):
        return iter((self.features,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.features is not None:
            field_reprs.append('features=' + repr(self.features))
        return 'WorksheetFeatureSetState(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.features is not None:
            field_reprs.append('features=' + repr(self.features))
        return 'WorksheetFeatureSetState(' + ', '.join(field_reprs) + ')'

    @classmethod
    def builder(cls):
        return cls.Builder()

    @property
    def features(self):
        '''
        :rtype: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState)
        '''

        return self.__features.copy() if self.__features is not None else None

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'features':
                init_kwds['features'] = dict([(iprot.read_string(), dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState.read(iprot)) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replacer(self):
        return cls.Builder.from_template(template=self)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState
        '''

        oprot.write_struct_begin('WorksheetFeatureSetState')

        if self.features is not None:
            oprot.write_field_begin(name='features', type=13, id=None)
            oprot.write_map_begin(11, len(self.features), 12)
            for __key0, __value0 in self.features.items():
                oprot.write_string(__key0)
                __value0.write(oprot)
            oprot.write_map_end()
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
