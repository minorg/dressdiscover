from collections import OrderedDict
from itertools import filterfalse
import builtins
import dressdiscover.api.models.worksheet.worksheet_extent_id_set
import dressdiscover.api.models.worksheet.worksheet_feature_set_id
import thryft.waf.api.models.non_blank_string


class WorksheetFeatureSetDefinition(object):
    class Builder(object):
        def __init__(
            self,
            id=None,  # @ReservedAssignment
            display_name=None,
            extent_ids=None,
            feature_ids=None,
        ):
            '''
            :type id: str
            :type display_name: str or None
            :type extent_ids: frozenset(str) or None
            :type feature_ids: tuple(str) or None
            '''

            self.__id = id
            self.__display_name = display_name
            self.__extent_ids = extent_ids
            self.__feature_ids = feature_ids

        def build(self):
            return WorksheetFeatureSetDefinition(id=self.__id, display_name=self.__display_name, extent_ids=self.__extent_ids, feature_ids=self.__feature_ids)

        @property
        def display_name(self):
            '''
            :rtype: str
            '''

            return self.__display_name

        @property
        def extent_ids(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__extent_ids

        @property
        def feature_ids(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__feature_ids

        @classmethod
        def from_template(cls, template):
            '''
            :type template: dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition
            :rtype: dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition
            '''

            builder = cls()
            builder.id = id
            builder.display_name = display_name
            builder.extent_ids = extent_ids
            builder.feature_ids = feature_ids
            return builder

        @property
        def id(self):  # @ReservedAssignment
            '''
            :rtype: str
            '''

            return self.__id

        def set_display_name(self, display_name):
            '''
            :type display_name: str or None
            '''

            if display_name is not None:
                if not isinstance(display_name, str):
                    raise TypeError("expected display_name to be a str but it is a %s" % builtins.type(display_name))
            self.__display_name = display_name
            return self

        def set_extent_ids(self, extent_ids):
            '''
            :type extent_ids: frozenset(str) or None
            '''

            if extent_ids is not None:
                if not (isinstance(extent_ids, frozenset) and len(list(filterfalse(lambda _: isinstance(_, str), extent_ids))) == 0):
                    raise TypeError("expected extent_ids to be a frozenset(str) but it is a %s" % builtins.type(extent_ids))
            self.__extent_ids = extent_ids
            return self

        def set_feature_ids(self, feature_ids):
            '''
            :type feature_ids: tuple(str) or None
            '''

            if feature_ids is not None:
                if not (isinstance(feature_ids, tuple) and len(list(filterfalse(lambda _: isinstance(_, str), feature_ids))) == 0):
                    raise TypeError("expected feature_ids to be a tuple(str) but it is a %s" % builtins.type(feature_ids))
                if len(feature_ids) < 1:
                    raise ValueError("expected len(feature_ids) to be >= 1, was %d" % len(feature_ids))
            self.__feature_ids = feature_ids
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

        def update(self, worksheet_feature_set_definition):
            '''
            :type id: str
            :type display_name: str or None
            :type extent_ids: frozenset(str) or None
            :type feature_ids: tuple(str) or None
            '''

            if isinstance(worksheet_feature_set_definition, WorksheetFeatureSetDefinition):
                self.set_id(worksheet_feature_set_definition.id)
                self.set_display_name(worksheet_feature_set_definition.display_name)
                self.set_extent_ids(worksheet_feature_set_definition.extent_ids)
                self.set_feature_ids(worksheet_feature_set_definition.feature_ids)
            elif isinstance(worksheet_feature_set_definition, dict):
                for key, value in worksheet_feature_set_definition.items():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(worksheet_feature_set_definition)
            return self

        @display_name.setter
        def display_name(self, display_name):
            '''
            :type display_name: str or None
            '''

            self.set_display_name(display_name)

        @extent_ids.setter
        def extent_ids(self, extent_ids):
            '''
            :type extent_ids: frozenset(str) or None
            '''

            self.set_extent_ids(extent_ids)

        @feature_ids.setter
        def feature_ids(self, feature_ids):
            '''
            :type feature_ids: tuple(str) or None
            '''

            self.set_feature_ids(feature_ids)

        @id.setter
        def id(self, id):  # @ReservedAssignment
            '''
            :type id: str
            '''

            self.set_id(id)

    class FieldMetadata(object):
        ID = None
        DISPLAY_NAME = None
        EXTENT_IDS = None
        FEATURE_IDS = None

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
            return (cls.ID, cls.DISPLAY_NAME, cls.EXTENT_IDS, cls.FEATURE_IDS,)

    FieldMetadata.ID = FieldMetadata('id', dressdiscover.api.models.worksheet.worksheet_feature_set_id.WorksheetFeatureSetId, None)
    FieldMetadata.DISPLAY_NAME = FieldMetadata('display_name', thryft.waf.api.models.non_blank_string.NonBlankString, None)
    FieldMetadata.EXTENT_IDS = FieldMetadata('extent_ids', dressdiscover.api.models.worksheet.worksheet_extent_id_set.WorksheetExtentIdSet, None)
    FieldMetadata.FEATURE_IDS = FieldMetadata('feature_ids', tuple, OrderedDict([('minLength', 1)]))

    def __init__(
        self,
        id,  # @ReservedAssignment
        display_name=None,
        extent_ids=None,
        feature_ids=None,
    ):
        '''
        :type id: str
        :type display_name: str or None
        :type extent_ids: frozenset(str) or None
        :type feature_ids: tuple(str) or None
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, str):
            raise TypeError("expected id to be a str but it is a %s" % builtins.type(id))
        self.__id = id

        if display_name is not None:
            if not isinstance(display_name, str):
                raise TypeError("expected display_name to be a str but it is a %s" % builtins.type(display_name))
        self.__display_name = display_name

        if extent_ids is not None:
            if not (isinstance(extent_ids, frozenset) and len(list(filterfalse(lambda _: isinstance(_, str), extent_ids))) == 0):
                raise TypeError("expected extent_ids to be a frozenset(str) but it is a %s" % builtins.type(extent_ids))
        self.__extent_ids = extent_ids

        if feature_ids is not None:
            if not (isinstance(feature_ids, tuple) and len(list(filterfalse(lambda _: isinstance(_, str), feature_ids))) == 0):
                raise TypeError("expected feature_ids to be a tuple(str) but it is a %s" % builtins.type(feature_ids))
            if len(feature_ids) < 1:
                raise ValueError("expected len(feature_ids) to be >= 1, was %d" % len(feature_ids))
        self.__feature_ids = feature_ids

    def __eq__(self, other):
        if self.id != other.id:
            return False
        if self.display_name != other.display_name:
            return False
        if self.extent_ids != other.extent_ids:
            return False
        if self.feature_ids != other.feature_ids:
            return False
        return True

    def __hash__(self):
        return hash((self.id, self.display_name, self.extent_ids, self.feature_ids,))

    def __iter__(self):
        return iter((self.id, self.display_name, self.extent_ids, self.feature_ids,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace').decode('ascii') + "'")
        if self.display_name is not None:
            field_reprs.append('display_name=' + "'" + self.display_name.encode('ascii', 'replace').decode('ascii') + "'")
        if self.extent_ids is not None:
            field_reprs.append('extent_ids=' + repr(self.extent_ids))
        if self.feature_ids is not None:
            field_reprs.append('feature_ids=' + repr(self.feature_ids))
        return 'WorksheetFeatureSetDefinition(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace').decode('ascii') + "'")
        if self.display_name is not None:
            field_reprs.append('display_name=' + "'" + self.display_name.encode('ascii', 'replace').decode('ascii') + "'")
        if self.extent_ids is not None:
            field_reprs.append('extent_ids=' + repr(self.extent_ids))
        if self.feature_ids is not None:
            field_reprs.append('feature_ids=' + repr(self.feature_ids))
        return 'WorksheetFeatureSetDefinition(' + ', '.join(field_reprs) + ')'

    @classmethod
    def builder(cls):
        return cls.Builder()

    @property
    def display_name(self):
        '''
        :rtype: str
        '''

        return self.__display_name

    @property
    def extent_ids(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__extent_ids

    @property
    def feature_ids(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__feature_ids

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
            elif ifield_name == 'display_name':
                try:
                    init_kwds['display_name'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'extent_ids':
                init_kwds['extent_ids'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'feature_ids':
                init_kwds['feature_ids'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replacer(self):
        return cls.Builder.from_template(template=self)

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

        if self.display_name is not None:
            oprot.write_field_begin(name='display_name', type=11, id=None)
            oprot.write_string(self.display_name)
            oprot.write_field_end()

        if self.extent_ids is not None:
            oprot.write_field_begin(name='extent_ids', type=14, id=None)
            oprot.write_set_begin(11, len(self.extent_ids))
            for _0 in self.extent_ids:
                oprot.write_string(_0)
            oprot.write_set_end()
            oprot.write_field_end()

        if self.feature_ids is not None:
            oprot.write_field_begin(name='feature_ids', type=15, id=None)
            oprot.write_list_begin(11, len(self.feature_ids))
            for _0 in self.feature_ids:
                oprot.write_string(_0)
            oprot.write_list_end()
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
