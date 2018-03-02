from collections import OrderedDict
from itertools import filterfalse
import builtins
import dressdiscover.api.models.worksheet.worksheet_feature_set_state
import dressdiscover.api.models.worksheet.worksheet_state_id


class WorksheetState(object):
    class Builder(object):
        def __init__(
            self,
            id=None,  # @ReservedAssignment
            feature_sets=None,
        ):
            '''
            :type id: str
            :type feature_sets: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState) or None
            '''

            self.__id = id
            self.__feature_sets = feature_sets

        def build(self):
            return WorksheetState(id=self.__id, feature_sets=self.__feature_sets)

        @property
        def feature_sets(self):
            '''
            :rtype: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState)
            '''

            return self.__feature_sets.copy() if self.__feature_sets is not None else None

        @classmethod
        def from_template(cls, template):
            '''
            :type template: dressdiscover.api.models.worksheet.worksheet_state.WorksheetState
            :rtype: dressdiscover.api.models.worksheet.worksheet_state.WorksheetState
            '''

            builder = cls()
            builder.id = id
            builder.feature_sets = feature_sets
            return builder

        @property
        def id(self):  # @ReservedAssignment
            '''
            :rtype: str
            '''

            return self.__id

        def set_feature_sets(self, feature_sets):
            '''
            :type feature_sets: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState) or None
            '''

            if feature_sets is not None:
                if not (isinstance(feature_sets, dict) and len(list(filterfalse(lambda __item: isinstance(__item[0], str) and isinstance(__item[1], dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState), feature_sets.items()))) == 0):
                    raise TypeError("expected feature_sets to be a dict(str: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState) but it is a %s" % builtins.type(feature_sets))
            self.__feature_sets = feature_sets
            return self

        def set_id(self, id):  # @ReservedAssignment
            '''
            :type id: str
            '''

            if id is None:
                raise ValueError('id is required')
            if not isinstance(id, str):
                raise TypeError("expected id to be a str but it is a %s" % builtins.type(id))
            self.__id = id
            return self

        def update(self, worksheet_state):
            '''
            :type id: str
            :type feature_sets: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState) or None
            '''

            if isinstance(worksheet_state, WorksheetState):
                self.set_id(worksheet_state.id)
                self.set_feature_sets(worksheet_state.feature_sets)
            elif isinstance(worksheet_state, dict):
                for key, value in worksheet_state.items():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(worksheet_state)
            return self

        @feature_sets.setter
        def feature_sets(self, feature_sets):
            '''
            :type feature_sets: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState) or None
            '''

            self.set_feature_sets(feature_sets)

        @id.setter
        def id(self, id):  # @ReservedAssignment
            '''
            :type id: str
            '''

            self.set_id(id)

    class FieldMetadata(object):
        ID = None
        FEATURE_SETS = None

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
            return (cls.ID, cls.FEATURE_SETS,)

    FieldMetadata.ID = FieldMetadata('id', dressdiscover.api.models.worksheet.worksheet_state_id.WorksheetStateId, None)
    FieldMetadata.FEATURE_SETS = FieldMetadata('feature_sets', dict, None)

    def __init__(
        self,
        id,  # @ReservedAssignment
        feature_sets=None,
    ):
        '''
        :type id: str
        :type feature_sets: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState) or None
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, str):
            raise TypeError("expected id to be a str but it is a %s" % builtins.type(id))
        self.__id = id

        if feature_sets is not None:
            if not (isinstance(feature_sets, dict) and len(list(filterfalse(lambda __item: isinstance(__item[0], str) and isinstance(__item[1], dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState), feature_sets.items()))) == 0):
                raise TypeError("expected feature_sets to be a dict(str: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState) but it is a %s" % builtins.type(feature_sets))
        self.__feature_sets = feature_sets.copy() if feature_sets is not None else None

    def __eq__(self, other):
        if self.id != other.id:
            return False
        if self.feature_sets != other.feature_sets:
            return False
        return True

    def __hash__(self):
        return hash((self.id, self.feature_sets,))

    def __iter__(self):
        return iter((self.id, self.feature_sets,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace').decode('ascii') + "'")
        if self.feature_sets is not None:
            field_reprs.append('feature_sets=' + repr(self.feature_sets))
        return 'WorksheetState(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace').decode('ascii') + "'")
        if self.feature_sets is not None:
            field_reprs.append('feature_sets=' + repr(self.feature_sets))
        return 'WorksheetState(' + ', '.join(field_reprs) + ')'

    @classmethod
    def builder(cls):
        return cls.Builder()

    @property
    def feature_sets(self):
        '''
        :rtype: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState)
        '''

        return self.__feature_sets.copy() if self.__feature_sets is not None else None

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
        :rtype: dressdiscover.api.models.worksheet.worksheet_state.WorksheetState
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'id':
                init_kwds['id'] = iprot.read_string()
            elif ifield_name == 'feature_sets':
                init_kwds['feature_sets'] = dict([(iprot.read_string(), dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState.read(iprot)) for _ in xrange(iprot.read_map_begin()[2])] + (iprot.read_map_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replacer(self):
        return cls.Builder.from_template(template=self)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_state.WorksheetState
        '''

        oprot.write_struct_begin('WorksheetState')

        oprot.write_field_begin(name='id', type=11, id=None)
        oprot.write_string(self.id)
        oprot.write_field_end()

        if self.feature_sets is not None:
            oprot.write_field_begin(name='feature_sets', type=13, id=None)
            oprot.write_map_begin(11, len(self.feature_sets), 12)
            for __key0, __value0 in self.feature_sets.items():
                oprot.write_string(__key0)
                __value0.write(oprot)
            oprot.write_map_end()
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
