from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.models.worksheet.worksheet_feature_state


class WorksheetFeatureSetState(object):
    class Builder(object):
        def __init__(
            self,
            child_feature_sets=None,
            features=None,
        ):
            '''
            :type child_feature_sets: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState) or None
            :type features: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState) or None
            '''

            self.__child_feature_sets = child_feature_sets
            self.__features = features

        def build(self):
            return WorksheetFeatureSetState(child_feature_sets=self.__child_feature_sets, features=self.__features)

        @property
        def child_feature_sets(self):
            '''
            :rtype: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState)
            '''

            return self.__child_feature_sets.copy() if self.__child_feature_sets is not None else None

        @property
        def features(self):
            '''
            :rtype: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState)
            '''

            return self.__features.copy() if self.__features is not None else None

        def set_child_feature_sets(self, child_feature_sets):
            '''
            :type child_feature_sets: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState) or None
            '''

            if child_feature_sets is not None:
                if not (isinstance(child_feature_sets, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState), child_feature_sets.iteritems()))) == 0):
                    raise TypeError("expected child_feature_sets to be a dict(str: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState) but it is a %s" % getattr(__builtin__, 'type')(child_feature_sets))
                if len(child_feature_sets) < 1:
                    raise ValueError("expected len(child_feature_sets) to be >= 1, was %d" % len(child_feature_sets))
            self.__child_feature_sets = child_feature_sets
            return self

        def set_features(self, features):
            '''
            :type features: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState) or None
            '''

            if features is not None:
                if not (isinstance(features, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState), features.iteritems()))) == 0):
                    raise TypeError("expected features to be a dict(str: dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState) but it is a %s" % getattr(__builtin__, 'type')(features))
                if len(features) < 1:
                    raise ValueError("expected len(features) to be >= 1, was %d" % len(features))
            self.__features = features
            return self

        def update(self, worksheet_feature_set_state):
            '''
            :type child_feature_sets: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState) or None
            :type features: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState) or None
            '''

            if isinstance(worksheet_feature_set_state, WorksheetFeatureSetState):
                self.set_child_feature_sets(worksheet_feature_set_state.child_feature_sets)
                self.set_features(worksheet_feature_set_state.features)
            elif isinstance(worksheet_feature_set_state, dict):
                for key, value in worksheet_feature_set_state.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(worksheet_feature_set_state)
            return self

        @child_feature_sets.setter
        def child_feature_sets(self, child_feature_sets):
            '''
            :type child_feature_sets: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState) or None
            '''

            self.set_child_feature_sets(child_feature_sets)

        @features.setter
        def features(self, features):
            '''
            :type features: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState) or None
            '''

            self.set_features(features)

    class FieldMetadata(object):
        CHILD_FEATURE_SETS = None
        FEATURES = None

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
            return (cls.CHILD_FEATURE_SETS, cls.FEATURES,)

    FieldMetadata.CHILD_FEATURE_SETS = FieldMetadata('child_feature_sets', dict, {u'minLength': 1})
    FieldMetadata.FEATURES = FieldMetadata('features', dict, {u'minLength': 1})

    def __init__(
        self,
        child_feature_sets=None,
        features=None,
    ):
        '''
        :type child_feature_sets: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState) or None
        :type features: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState) or None
        '''

        if child_feature_sets is not None:
            if not (isinstance(child_feature_sets, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState), child_feature_sets.iteritems()))) == 0):
                raise TypeError("expected child_feature_sets to be a dict(str: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState) but it is a %s" % getattr(__builtin__, 'type')(child_feature_sets))
            if len(child_feature_sets) < 1:
                raise ValueError("expected len(child_feature_sets) to be >= 1, was %d" % len(child_feature_sets))
        self.__child_feature_sets = child_feature_sets.copy() if child_feature_sets is not None else None

        if features is not None:
            if not (isinstance(features, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState), features.iteritems()))) == 0):
                raise TypeError("expected features to be a dict(str: dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState) but it is a %s" % getattr(__builtin__, 'type')(features))
            if len(features) < 1:
                raise ValueError("expected len(features) to be >= 1, was %d" % len(features))
        self.__features = features.copy() if features is not None else None

    def __eq__(self, other):
        if self.child_feature_sets != other.child_feature_sets:
            return False
        if self.features != other.features:
            return False
        return True

    def __hash__(self):
        return hash((self.child_feature_sets,self.features,))

    def __iter__(self):
        return iter((self.child_feature_sets, self.features,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.child_feature_sets is not None:
            field_reprs.append('child_feature_sets=' + repr(self.child_feature_sets))
        if self.features is not None:
            field_reprs.append('features=' + repr(self.features))
        return 'WorksheetFeatureSetState(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.child_feature_sets is not None:
            field_reprs.append('child_feature_sets=' + repr(self.child_feature_sets))
        if self.features is not None:
            field_reprs.append('features=' + repr(self.features))
        return 'WorksheetFeatureSetState(' + ', '.join(field_reprs) + ')'

    @property
    def child_feature_sets(self):
        '''
        :rtype: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState)
        '''

        return self.__child_feature_sets.copy() if self.__child_feature_sets is not None else None

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
            elif ifield_name == 'child_feature_sets':
                init_kwds['child_feature_sets'] = dict([(iprot.read_string(), dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState.read(iprot)) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            elif ifield_name == 'features':
                init_kwds['features'] = dict([(iprot.read_string(), dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState.read(iprot)) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        child_feature_sets=None,
        features=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type child_feature_sets: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState) or None
        :type features: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_state.WorksheetFeatureState) or None
        :rtype: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState
        '''

        if child_feature_sets is None:
            child_feature_sets = self.child_feature_sets
        if features is None:
            features = self.features
        return self.__class__(child_feature_sets=child_feature_sets, features=features)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState
        '''

        oprot.write_struct_begin('WorksheetFeatureSetState')

        if self.child_feature_sets is not None:
            oprot.write_field_begin(name='child_feature_sets', type=13, id=None)
            oprot.write_map_begin(11, len(self.child_feature_sets), 12)
            for __key0, __value0 in self.child_feature_sets.iteritems():
                oprot.write_string(__key0)
                __value0.write(oprot)
            oprot.write_map_end()
            oprot.write_field_end()

        if self.features is not None:
            oprot.write_field_begin(name='features', type=13, id=None)
            oprot.write_map_begin(11, len(self.features), 12)
            for __key0, __value0 in self.features.iteritems():
                oprot.write_string(__key0)
                __value0.write(oprot)
            oprot.write_map_end()
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
