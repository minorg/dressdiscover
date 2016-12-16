import __builtin__
import dressdiscover.api.models.worksheet.worksheet_feature_set_definition


class WorksheetDefinition(object):
    class Builder(object):
        def __init__(
            self,
            root_feature_set=None,
        ):
            '''
            :type root_feature_set: dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition
            '''

            self.__root_feature_set = root_feature_set

        def build(self):
            return WorksheetDefinition(root_feature_set=self.__root_feature_set)

        @property
        def root_feature_set(self):
            '''
            :rtype: dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition
            '''

            return self.__root_feature_set

        def set_root_feature_set(self, root_feature_set):
            '''
            :type root_feature_set: dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition
            '''

            if root_feature_set is None:
                raise ValueError('root_feature_set is required')
            if not isinstance(root_feature_set, dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition):
                raise TypeError("expected root_feature_set to be a dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition but it is a %s" % getattr(__builtin__, 'type')(root_feature_set))
            self.__root_feature_set = root_feature_set
            return self

        def update(self, worksheet_definition):
            '''
            :type root_feature_set: dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition
            '''

            if isinstance(worksheet_definition, WorksheetDefinition):
                self.set_root_feature_set(worksheet_definition.root_feature_set)
            elif isinstance(worksheet_definition, dict):
                for key, value in worksheet_definition.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(worksheet_definition)
            return self

        @root_feature_set.setter
        def root_feature_set(self, root_feature_set):
            '''
            :type root_feature_set: dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition
            '''

            self.set_root_feature_set(root_feature_set)

    class FieldMetadata(object):
        ROOT_FEATURE_SET = None

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
            return (cls.ROOT_FEATURE_SET,)

    FieldMetadata.ROOT_FEATURE_SET = FieldMetadata('root_feature_set', dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition, None)

    def __init__(
        self,
        root_feature_set,
    ):
        '''
        :type root_feature_set: dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition
        '''

        if root_feature_set is None:
            raise ValueError('root_feature_set is required')
        if not isinstance(root_feature_set, dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition):
            raise TypeError("expected root_feature_set to be a dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition but it is a %s" % getattr(__builtin__, 'type')(root_feature_set))
        self.__root_feature_set = root_feature_set

    def __eq__(self, other):
        if self.root_feature_set != other.root_feature_set:
            return False
        return True

    def __hash__(self):
        return hash(self.root_feature_set)

    def __iter__(self):
        return iter((self.root_feature_set,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('root_feature_set=' + repr(self.root_feature_set))
        return 'WorksheetDefinition(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('root_feature_set=' + repr(self.root_feature_set))
        return 'WorksheetDefinition(' + ', '.join(field_reprs) + ')'

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
            elif ifield_name == 'root_feature_set':
                init_kwds['root_feature_set'] = dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition.read(iprot)
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        root_feature_set=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type root_feature_set: dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition or None
        :rtype: dressdiscover.api.models.worksheet.worksheet_definition.WorksheetDefinition
        '''

        if root_feature_set is None:
            root_feature_set = self.root_feature_set
        return self.__class__(root_feature_set=root_feature_set)

    @property
    def root_feature_set(self):
        '''
        :rtype: dressdiscover.api.models.worksheet.worksheet_feature_set_definition.WorksheetFeatureSetDefinition
        '''

        return self.__root_feature_set

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_definition.WorksheetDefinition
        '''

        oprot.write_struct_begin('WorksheetDefinition')

        oprot.write_field_begin(name='root_feature_set', type=12, id=None)
        self.root_feature_set.write(oprot)
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
