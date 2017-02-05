from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.models.worksheet.worksheet_feature_id
import dressdiscover.api.models.worksheet.worksheet_feature_value_definition


class WorksheetFeatureDefinition(object):
    class Builder(object):
        def __init__(
            self,
            id=None,  # @ReservedAssignment
            display_name=None,
            values_=None,
        ):
            '''
            :type id: str
            :type display_name: str or None
            :type values_: tuple(dressdiscover.api.models.worksheet.worksheet_feature_value_definition.WorksheetFeatureValueDefinition) or None
            '''

            self.__id = id
            self.__display_name = display_name
            self.__values_ = values_

        def build(self):
            return WorksheetFeatureDefinition(id=self.__id, display_name=self.__display_name, values_=self.__values_)

        @property
        def display_name(self):
            '''
            :rtype: str
            '''

            return self.__display_name

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
                if not isinstance(display_name, basestring):
                    raise TypeError("expected display_name to be a str but it is a %s" % getattr(__builtin__, 'type')(display_name))
                if display_name.isspace():
                    raise ValueError("expected display_name not to be blank")
                if len(display_name) < 1:
                    raise ValueError("expected len(display_name) to be >= 1, was %d" % len(display_name))
            self.__display_name = display_name
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

        def set_values_(self, values_):
            '''
            :type values_: tuple(dressdiscover.api.models.worksheet.worksheet_feature_value_definition.WorksheetFeatureValueDefinition) or None
            '''

            if values_ is not None:
                if not (isinstance(values_, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.worksheet.worksheet_feature_value_definition.WorksheetFeatureValueDefinition), values_))) == 0):
                    raise TypeError("expected values_ to be a tuple(dressdiscover.api.models.worksheet.worksheet_feature_value_definition.WorksheetFeatureValueDefinition) but it is a %s" % getattr(__builtin__, 'type')(values_))
                if len(values_) < 1:
                    raise ValueError("expected len(values_) to be >= 1, was %d" % len(values_))
            self.__values_ = values_
            return self

        def update(self, worksheet_feature_definition):
            '''
            :type id: str
            :type display_name: str or None
            :type values_: tuple(dressdiscover.api.models.worksheet.worksheet_feature_value_definition.WorksheetFeatureValueDefinition) or None
            '''

            if isinstance(worksheet_feature_definition, WorksheetFeatureDefinition):
                self.set_id(worksheet_feature_definition.id)
                self.set_display_name(worksheet_feature_definition.display_name)
                self.set_values_(worksheet_feature_definition.values_)
            elif isinstance(worksheet_feature_definition, dict):
                for key, value in worksheet_feature_definition.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(worksheet_feature_definition)
            return self

        @property
        def values_(self):
            '''
            :rtype: tuple(dressdiscover.api.models.worksheet.worksheet_feature_value_definition.WorksheetFeatureValueDefinition)
            '''

            return self.__values_

        @display_name.setter
        def display_name(self, display_name):
            '''
            :type display_name: str or None
            '''

            self.set_display_name(display_name)

        @id.setter
        def id(self, id):  # @ReservedAssignment
            '''
            :type id: str
            '''

            self.set_id(id)

        @values_.setter
        def values_(self, values_):
            '''
            :type values_: tuple(dressdiscover.api.models.worksheet.worksheet_feature_value_definition.WorksheetFeatureValueDefinition) or None
            '''

            self.set_values_(values_)

    class FieldMetadata(object):
        ID = None
        DISPLAY_NAME = None
        VALUES_ = None

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
            return (cls.ID, cls.DISPLAY_NAME, cls.VALUES_,)

    FieldMetadata.ID = FieldMetadata('id', dressdiscover.api.models.worksheet.worksheet_feature_id.WorksheetFeatureId, None)
    FieldMetadata.DISPLAY_NAME = FieldMetadata('display_name', str, {u'blank': False, u'minLength': 1})
    FieldMetadata.VALUES_ = FieldMetadata('values_', tuple, {u'minLength': 1})

    def __init__(
        self,
        id,  # @ReservedAssignment
        display_name=None,
        values_=None,
    ):
        '''
        :type id: str
        :type display_name: str or None
        :type values_: tuple(dressdiscover.api.models.worksheet.worksheet_feature_value_definition.WorksheetFeatureValueDefinition) or None
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, basestring):
            raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))
        self.__id = id

        if display_name is not None:
            if not isinstance(display_name, basestring):
                raise TypeError("expected display_name to be a str but it is a %s" % getattr(__builtin__, 'type')(display_name))
            if display_name.isspace():
                raise ValueError("expected display_name not to be blank")
            if len(display_name) < 1:
                raise ValueError("expected len(display_name) to be >= 1, was %d" % len(display_name))
        self.__display_name = display_name

        if values_ is not None:
            if not (isinstance(values_, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.worksheet.worksheet_feature_value_definition.WorksheetFeatureValueDefinition), values_))) == 0):
                raise TypeError("expected values_ to be a tuple(dressdiscover.api.models.worksheet.worksheet_feature_value_definition.WorksheetFeatureValueDefinition) but it is a %s" % getattr(__builtin__, 'type')(values_))
            if len(values_) < 1:
                raise ValueError("expected len(values_) to be >= 1, was %d" % len(values_))
        self.__values_ = values_

    def __eq__(self, other):
        if self.id != other.id:
            return False
        if self.display_name != other.display_name:
            return False
        if self.values_ != other.values_:
            return False
        return True

    def __hash__(self):
        return hash((self.id,self.display_name,self.values_,))

    def __iter__(self):
        return iter((self.id, self.display_name, self.values_,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        if self.display_name is not None:
            field_reprs.append('display_name=' + "'" + self.display_name.encode('ascii', 'replace') + "'")
        if self.values_ is not None:
            field_reprs.append('values_=' + repr(self.values_))
        return 'WorksheetFeatureDefinition(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        if self.display_name is not None:
            field_reprs.append('display_name=' + "'" + self.display_name.encode('ascii', 'replace') + "'")
        if self.values_ is not None:
            field_reprs.append('values_=' + repr(self.values_))
        return 'WorksheetFeatureDefinition(' + ', '.join(field_reprs) + ')'

    @property
    def display_name(self):
        '''
        :rtype: str
        '''

        return self.__display_name

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
        :rtype: dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition
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
            elif ifield_name == 'values_':
                init_kwds['values_'] = tuple([dressdiscover.api.models.worksheet.worksheet_feature_value_definition.WorksheetFeatureValueDefinition.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        id=None,  # @ReservedAssignment
        display_name=None,
        values_=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type id: str or None
        :type display_name: str or None
        :type values_: tuple(dressdiscover.api.models.worksheet.worksheet_feature_value_definition.WorksheetFeatureValueDefinition) or None
        :rtype: dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition
        '''

        if id is None:
            id = self.id  # @ReservedAssignment
        if display_name is None:
            display_name = self.display_name
        if values_ is None:
            values_ = self.values_
        return self.__class__(id=id, display_name=display_name, values_=values_)

    @property
    def values_(self):
        '''
        :rtype: tuple(dressdiscover.api.models.worksheet.worksheet_feature_value_definition.WorksheetFeatureValueDefinition)
        '''

        return self.__values_

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_feature_definition.WorksheetFeatureDefinition
        '''

        oprot.write_struct_begin('WorksheetFeatureDefinition')

        oprot.write_field_begin(name='id', type=11, id=None)
        oprot.write_string(self.id)
        oprot.write_field_end()

        if self.display_name is not None:
            oprot.write_field_begin(name='display_name', type=11, id=None)
            oprot.write_string(self.display_name)
            oprot.write_field_end()

        if self.values_ is not None:
            oprot.write_field_begin(name='values_', type=15, id=None)
            oprot.write_list_begin(12, len(self.values_))
            for _0 in self.values_:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
