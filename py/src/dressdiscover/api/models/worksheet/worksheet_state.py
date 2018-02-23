from collections import OrderedDict
from itertools import filterfalse
import builtins
import dressdiscover.api.models.worksheet.worksheet_accession_number
import dressdiscover.api.models.worksheet.worksheet_feature_set_state


class WorksheetState(object):
    class Builder(object):
        def __init__(
            self,
            accession_number=None,
            feature_sets=None,
        ):
            '''
            :type accession_number: str
            :type feature_sets: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState) or None
            '''

            self.__accession_number = accession_number
            self.__feature_sets = feature_sets

        def build(self):
            return WorksheetState(accession_number=self.__accession_number, feature_sets=self.__feature_sets)

        @property
        def accession_number(self):
            '''
            :rtype: str
            '''

            return self.__accession_number

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
            builder.accession_number = accession_number
            builder.feature_sets = feature_sets
            return builder

        def set_accession_number(self, accession_number):
            '''
            :type accession_number: str
            '''

            if accession_number is None:
                raise ValueError('accession_number is required')
            if not isinstance(accession_number, str):
                raise TypeError("expected accession_number to be a str but it is a %s" % builtins.type(accession_number))
            self.__accession_number = accession_number
            return self

        def set_feature_sets(self, feature_sets):
            '''
            :type feature_sets: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState) or None
            '''

            if feature_sets is not None:
                if not (isinstance(feature_sets, dict) and len(list(filterfalse(lambda __item: isinstance(__item[0], str) and isinstance(__item[1], dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState), feature_sets.items()))) == 0):
                    raise TypeError("expected feature_sets to be a dict(str: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState) but it is a %s" % builtins.type(feature_sets))
                if len(feature_sets) < 1:
                    raise ValueError("expected len(feature_sets) to be >= 1, was %d" % len(feature_sets))
            self.__feature_sets = feature_sets
            return self

        def update(self, worksheet_state):
            '''
            :type accession_number: str
            :type feature_sets: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState) or None
            '''

            if isinstance(worksheet_state, WorksheetState):
                self.set_accession_number(worksheet_state.accession_number)
                self.set_feature_sets(worksheet_state.feature_sets)
            elif isinstance(worksheet_state, dict):
                for key, value in worksheet_state.items():
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

        @feature_sets.setter
        def feature_sets(self, feature_sets):
            '''
            :type feature_sets: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState) or None
            '''

            self.set_feature_sets(feature_sets)

    class FieldMetadata(object):
        ACCESSION_NUMBER = None
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
            return (cls.ACCESSION_NUMBER, cls.FEATURE_SETS,)

    FieldMetadata.ACCESSION_NUMBER = FieldMetadata('accession_number', dressdiscover.api.models.worksheet.worksheet_accession_number.WorksheetAccessionNumber, None)
    FieldMetadata.FEATURE_SETS = FieldMetadata('feature_sets', dict, OrderedDict([('minLength', 1)]))

    def __init__(
        self,
        accession_number,
        feature_sets=None,
    ):
        '''
        :type accession_number: str
        :type feature_sets: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState) or None
        '''

        if accession_number is None:
            raise ValueError('accession_number is required')
        if not isinstance(accession_number, str):
            raise TypeError("expected accession_number to be a str but it is a %s" % builtins.type(accession_number))
        self.__accession_number = accession_number

        if feature_sets is not None:
            if not (isinstance(feature_sets, dict) and len(list(filterfalse(lambda __item: isinstance(__item[0], str) and isinstance(__item[1], dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState), feature_sets.items()))) == 0):
                raise TypeError("expected feature_sets to be a dict(str: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState) but it is a %s" % builtins.type(feature_sets))
            if len(feature_sets) < 1:
                raise ValueError("expected len(feature_sets) to be >= 1, was %d" % len(feature_sets))
        self.__feature_sets = feature_sets.copy() if feature_sets is not None else None

    def __eq__(self, other):
        if self.accession_number != other.accession_number:
            return False
        if self.feature_sets != other.feature_sets:
            return False
        return True

    def __hash__(self):
        return hash((self.accession_number, self.feature_sets,))

    def __iter__(self):
        return iter((self.accession_number, self.feature_sets,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('accession_number=' + "'" + self.accession_number.encode('ascii', 'replace').decode('ascii') + "'")
        if self.feature_sets is not None:
            field_reprs.append('feature_sets=' + repr(self.feature_sets))
        return 'WorksheetState(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('accession_number=' + "'" + self.accession_number.encode('ascii', 'replace').decode('ascii') + "'")
        if self.feature_sets is not None:
            field_reprs.append('feature_sets=' + repr(self.feature_sets))
        return 'WorksheetState(' + ', '.join(field_reprs) + ')'

    @property
    def accession_number(self):
        '''
        :rtype: str
        '''

        return self.__accession_number

    @classmethod
    def builder(cls):
        return cls.Builder()

    @property
    def feature_sets(self):
        '''
        :rtype: dict(str: dressdiscover.api.models.worksheet.worksheet_feature_set_state.WorksheetFeatureSetState)
        '''

        return self.__feature_sets.copy() if self.__feature_sets is not None else None

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

        oprot.write_field_begin(name='accession_number', type=11, id=None)
        oprot.write_string(self.accession_number)
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
