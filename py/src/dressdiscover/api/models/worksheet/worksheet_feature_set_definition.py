from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.models.worksheet.worksheet_feature_definition
import dressdiscover.api.models.worksheet.worksheet_feature_set_id


class WorksheetFeatureSetDefinition(object):
    class Builder(object):
        def __init__(
            self,
            id=None,  # @ReservedAssignment
            child_feature_sets=None,
            display_name=None,
            features=None,
        ):
            '''
            :type id: str
            :type child_feature_sets: tuple(dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition) or None
            :type display_name: str or None
            :type features: tuple(dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition) or None
            '''

            self.__id = id
            self.__child_feature_sets = child_feature_sets
            self.__display_name = display_name
            self.__features = features

        def build(self):
            return WorksheetFeatureSetDefinition(id=self.__id, child_feature_sets=self.__child_feature_sets, display_name=self.__display_name, features=self.__features)

        @property
        def child_feature_sets(self):
            '''
            :rtype: tuple(dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition)
            '''

            return self.__child_feature_sets

        @property
        def display_name(self):
            '''
            :rtype: str
            '''

            return self.__display_name

        @property
        def features(self):
            '''
            :rtype: tuple(dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition)
            '''

            return self.__features

        @property
        def id(self):  # @ReservedAssignment
            '''
            :rtype: str
            '''

            return self.__id

        def set_child_feature_sets(self, child_feature_sets):
            '''
            :type child_feature_sets: tuple(dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition) or None
            '''

            if child_feature_sets is not None:
                if not (isinstance(child_feature_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition), child_feature_sets))) == 0):
                    raise TypeError("expected child_feature_sets to be a tuple(dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition) but it is a %s" % getattr(__builtin__, 'type')(child_feature_sets))
                if len(child_feature_sets) < 1:
                    raise ValueError("expected len(child_feature_sets) to be >= 1, was %d" % len(child_feature_sets))
            self.__child_feature_sets = child_feature_sets
            return self

        def set_display_name(self, display_name):
            '''
            :type display_name: str or None
            '''

            if display_name is not None:
                if not isinstance(display_name, basestring):
                    raise TypeError("expected display_name to be a str but it is a %s" % getattr(__builtin__, 'type')(display_name))
                if display_name.isspace():
                    raise ValueError("expected display_name not to be blank")
                if len(display_name) < 1:
                    raise ValueError("expected len(display_name) to be >= 1, was %d" % len(display_name))
            self.__display_name = display_name
            return self

        def set_features(self, features):
            '''
            :type features: tuple(dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition) or None
            '''

            if features is not None:
                if not (isinstance(features, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition), features))) == 0):
                    raise TypeError("expected features to be a tuple(dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition) but it is a %s" % getattr(__builtin__, 'type')(features))
                if len(features) < 1:
                    raise ValueError("expected len(features) to be >= 1, was %d" % len(features))
            self.__features = features
            return self

        def set_id(self, id):  # @ReservedAssignment
            '''
            :type id: str
            '''

            if id is None:
                raise ValueError('id is required')
            if not isinstance(id, basestring):
                raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))
            self.__id = id
            return self

        def update(self, worksheet_feature_set_definition):
            '''
            :type id: str
            :type child_feature_sets: tuple(dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition) or None
            :type display_name: str or None
            :type features: tuple(dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition) or None
            '''

            if isinstance(worksheet_feature_set_definition, WorksheetFeatureSetDefinition):
                self.set_id(worksheet_feature_set_definition.id)
                self.set_child_feature_sets(worksheet_feature_set_definition.child_feature_sets)
                self.set_display_name(worksheet_feature_set_definition.display_name)
                self.set_features(worksheet_feature_set_definition.features)
            elif isinstance(worksheet_feature_set_definition, dict):
                for key, value in worksheet_feature_set_definition.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(worksheet_feature_set_definition)
            return self

        @child_feature_sets.setter
        def child_feature_sets(self, child_feature_sets):
            '''
            :type child_feature_sets: tuple(dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition) or None
            '''

            self.set_child_feature_sets(child_feature_sets)

        @display_name.setter
        def display_name(self, display_name):
            '''
            :type display_name: str or None
            '''

            self.set_display_name(display_name)

        @features.setter
        def features(self, features):
            '''
            :type features: tuple(dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition) or None
            '''

            self.set_features(features)

        @id.setter
        def id(self, id):  # @ReservedAssignment
            '''
            :type id: str
            '''

            self.set_id(id)

    class FieldMetadata(object):
        ID = None
        CHILD_FEATURE_SETS = None
        DISPLAY_NAME = None
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
            return (cls.ID, cls.CHILD_FEATURE_SETS, cls.DISPLAY_NAME, cls.FEATURES,)

    FieldMetadata.ID = FieldMetadata('id', dressdiscover.api.models.worksheet.worksheet_feature_set_id.WorksheetFeatureSetId, None)
    FieldMetadata.CHILD_FEATURE_SETS = FieldMetadata('child_feature_sets', tuple, {u'minLength': 1})
    FieldMetadata.DISPLAY_NAME = FieldMetadata('display_name', str, {u'blank': False, u'minLength': 1})
    FieldMetadata.FEATURES = FieldMetadata('features', tuple, {u'minLength': 1})

    def __init__(
        self,
        id,  # @ReservedAssignment
        child_feature_sets=None,
        display_name=None,
        features=None,
    ):
        '''
        :type id: str
        :type child_feature_sets: tuple(dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition) or None
        :type display_name: str or None
        :type features: tuple(dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition) or None
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, basestring):
            raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))
        self.__id = id

        if child_feature_sets is not None:
            if not (isinstance(child_feature_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition), child_feature_sets))) == 0):
                raise TypeError("expected child_feature_sets to be a tuple(dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition) but it is a %s" % getattr(__builtin__, 'type')(child_feature_sets))
            if len(child_feature_sets) < 1:
                raise ValueError("expected len(child_feature_sets) to be >= 1, was %d" % len(child_feature_sets))
        self.__child_feature_sets = child_feature_sets

        if display_name is not None:
            if not isinstance(display_name, basestring):
                raise TypeError("expected display_name to be a str but it is a %s" % getattr(__builtin__, 'type')(display_name))
            if display_name.isspace():
                raise ValueError("expected display_name not to be blank")
            if len(display_name) < 1:
                raise ValueError("expected len(display_name) to be >= 1, was %d" % len(display_name))
        self.__display_name = display_name

        if features is not None:
            if not (isinstance(features, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition), features))) == 0):
                raise TypeError("expected features to be a tuple(dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition) but it is a %s" % getattr(__builtin__, 'type')(features))
            if len(features) < 1:
                raise ValueError("expected len(features) to be >= 1, was %d" % len(features))
        self.__features = features

    def __eq__(self, other):
        if self.id != other.id:
            return False
        if self.child_feature_sets != other.child_feature_sets:
            return False
        if self.display_name != other.display_name:
            return False
        if self.features != other.features:
            return False
        return True

    def __hash__(self):
        return hash((self.id,self.child_feature_sets,self.display_name,self.features,))

    def __iter__(self):
        return iter((self.id, self.child_feature_sets, self.display_name, self.features,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        if self.child_feature_sets is not None:
            field_reprs.append('child_feature_sets=' + repr(self.child_feature_sets))
        if self.display_name is not None:
            field_reprs.append('display_name=' + "'" + self.display_name.encode('ascii', 'replace') + "'")
        if self.features is not None:
            field_reprs.append('features=' + repr(self.features))
        return 'WorksheetFeatureSetDefinition(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        if self.child_feature_sets is not None:
            field_reprs.append('child_feature_sets=' + repr(self.child_feature_sets))
        if self.display_name is not None:
            field_reprs.append('display_name=' + "'" + self.display_name.encode('ascii', 'replace') + "'")
        if self.features is not None:
            field_reprs.append('features=' + repr(self.features))
        return 'WorksheetFeatureSetDefinition(' + ', '.join(field_reprs) + ')'

    @property
    def child_feature_sets(self):
        '''
        :rtype: tuple(dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition)
        '''

        return self.__child_feature_sets

    @property
    def display_name(self):
        '''
        :rtype: str
        '''

        return self.__display_name

    @property
    def features(self):
        '''
        :rtype: tuple(dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition)
        '''

        return self.__features

    @property
    def id(self):  # @ReservedAssignment
        '''
        :rtype: str
        '''

        return self.__id

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'id':
                init_kwds['id'] = iprot.read_string()
            elif ifield_name == 'child_feature_sets':
                init_kwds['child_feature_sets'] = tuple([dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'display_name':
                try:
                    init_kwds['display_name'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'features':
                init_kwds['features'] = tuple([dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        id=None,  # @ReservedAssignment
        child_feature_sets=None,
        display_name=None,
        features=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type id: str or None
        :type child_feature_sets: tuple(dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition) or None
        :type display_name: str or None
        :type features: tuple(dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition) or None
        :rtype: dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition
        '''

        if id is None:
            id = self.id  # @ReservedAssignment
        if child_feature_sets is None:
            child_feature_sets = self.child_feature_sets
        if display_name is None:
            display_name = self.display_name
        if features is None:
            features = self.features
        return self.__class__(id=id, child_feature_sets=child_feature_sets, display_name=display_name, features=features)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition
        '''

        oprot.write_struct_begin('WorksheetFeatureSetDefinition')

        oprot.write_field_begin(name='id', type=11, id=None)
        oprot.write_string(self.id)
        oprot.write_field_end()

        if self.child_feature_sets is not None:
            oprot.write_field_begin(name='child_feature_sets', type=15, id=None)
            oprot.write_list_begin(12, len(self.child_feature_sets))
            for _0 in self.child_feature_sets:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.display_name is not None:
            oprot.write_field_begin(name='display_name', type=11, id=None)
            oprot.write_string(self.display_name)
            oprot.write_field_end()

        if self.features is not None:
            oprot.write_field_begin(name='features', type=15, id=None)
            oprot.write_list_begin(12, len(self.features))
            for _0 in self.features:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
