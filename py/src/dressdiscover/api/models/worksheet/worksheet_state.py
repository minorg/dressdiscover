import __builtin__
import dressdiscover.api.models.worksheet.worksheet_accession_number
import dressdiscover.api.models.worksheet.worksheet_feature_set_state


class WorksheetState(object):
    class Builder(object):
        def __init__(
            self,
            accession_number=None,
            root_feature_set=None,
        ):
            '''
            :type accession_number: str
            :type root_feature_set: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState or None
            '''

            self.__accession_number = accession_number
            self.__root_feature_set = root_feature_set

        def build(self):
            return WorksheetState(accession_number=self.__accession_number, root_feature_set=self.__root_feature_set)

        @property
        def accession_number(self):
            '''
            :rtype: str
            '''

            return self.__accession_number

        @property
        def root_feature_set(self):
            '''
            :rtype: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState
            '''

            return self.__root_feature_set

        def set_accession_number(self, accession_number):
            '''
            :type accession_number: str
            '''

            if accession_number is None:
                raise ValueError('accession_number is required')
            if not isinstance(accession_number, basestring):
                raise TypeError("expected accession_number to be a str but it is a %s" % getattr(__builtin__, 'type')(accession_number))
            self.__accession_number = accession_number
            return self

        def set_root_feature_set(self, root_feature_set):
            '''
            :type root_feature_set: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState or None
            '''

            if root_feature_set is not None:
                if not isinstance(root_feature_set, dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState):
                    raise TypeError("expected root_feature_set to be a dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState but it is a %s" % getattr(__builtin__, 'type')(root_feature_set))
            self.__root_feature_set = root_feature_set
            return self

        def update(self, worksheet_state):
            '''
            :type accession_number: str
            :type root_feature_set: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState or None
            '''

            if isinstance(worksheet_state, WorksheetState):
                self.set_accession_number(worksheet_state.accession_number)
                self.set_root_feature_set(worksheet_state.root_feature_set)
            elif isinstance(worksheet_state, dict):
                for key, value in worksheet_state.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(worksheet_state)
            return self

        @accession_number.setter
        def accession_number(self, accession_number):
            '''
            :type accession_number: str
            '''

            self.set_accession_number(accession_number)

        @root_feature_set.setter
        def root_feature_set(self, root_feature_set):
            '''
            :type root_feature_set: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState or None
            '''

            self.set_root_feature_set(root_feature_set)

    class FieldMetadata(object):
        ACCESSION_NUMBER = None
        ROOT_FEATURE_SET = None

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
            return (cls.ACCESSION_NUMBER, cls.ROOT_FEATURE_SET,)

    FieldMetadata.ACCESSION_NUMBER = FieldMetadata('accession_number', dressdiscover.api.models.worksheet.worksheet_accession_number.WorksheetAccessionNumber, None)
    FieldMetadata.ROOT_FEATURE_SET = FieldMetadata('root_feature_set', dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState, None)

    def __init__(
        self,
        accession_number,
        root_feature_set=None,
    ):
        '''
        :type accession_number: str
        :type root_feature_set: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState or None
        '''

        if accession_number is None:
            raise ValueError('accession_number is required')
        if not isinstance(accession_number, basestring):
            raise TypeError("expected accession_number to be a str but it is a %s" % getattr(__builtin__, 'type')(accession_number))
        self.__accession_number = accession_number

        if root_feature_set is not None:
            if not isinstance(root_feature_set, dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState):
                raise TypeError("expected root_feature_set to be a dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState but it is a %s" % getattr(__builtin__, 'type')(root_feature_set))
        self.__root_feature_set = root_feature_set

    def __eq__(self, other):
        if self.accession_number != other.accession_number:
            return False
        if self.root_feature_set != other.root_feature_set:
            return False
        return True

    def __hash__(self):
        return hash((self.accession_number,self.root_feature_set,))

    def __iter__(self):
        return iter((self.accession_number, self.root_feature_set,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('accession_number=' + "'" + self.accession_number.encode('ascii', 'replace') + "'")
        if self.root_feature_set is not None:
            field_reprs.append('root_feature_set=' + repr(self.root_feature_set))
        return 'WorksheetState(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('accession_number=' + "'" + self.accession_number.encode('ascii', 'replace') + "'")
        if self.root_feature_set is not None:
            field_reprs.append('root_feature_set=' + repr(self.root_feature_set))
        return 'WorksheetState(' + ', '.join(field_reprs) + ')'

    @property
    def accession_number(self):
        '''
        :rtype: str
        '''

        return self.__accession_number

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
            elif ifield_name == 'accession_number':
                init_kwds['accession_number'] = iprot.read_string()
            elif ifield_name == 'root_feature_set':
                init_kwds['root_feature_set'] = dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState.read(iprot)
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        accession_number=None,
        root_feature_set=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type accession_number: str or None
        :type root_feature_set: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState or None
        :rtype: dressdiscover.api.models.worksheet.worksheet_state.WorksheetState
        '''

        if accession_number is None:
            accession_number = self.accession_number
        if root_feature_set is None:
            root_feature_set = self.root_feature_set
        return self.__class__(accession_number=accession_number, root_feature_set=root_feature_set)

    @property
    def root_feature_set(self):
        '''
        :rtype: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState
        '''

        return self.__root_feature_set

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_state.WorksheetState
        '''

        oprot.write_struct_begin('WorksheetState')

        oprot.write_field_begin(name='accession_number', type=11, id=None)
        oprot.write_string(self.accession_number)
        oprot.write_field_end()

        if self.root_feature_set is not None:
            oprot.write_field_begin(name='root_feature_set', type=12, id=None)
            self.root_feature_set.write(oprot)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
