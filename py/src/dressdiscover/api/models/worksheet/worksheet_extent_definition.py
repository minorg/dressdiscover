from collections import OrderedDict
import builtins
import dressdiscover.api.models.worksheet.worksheet_extent_id
import thryft.waf.api.models.non_blank_string


class WorksheetExtentDefinition(object):
    class Builder(object):
        def __init__(
            self,
            id=None,  # @ReservedAssignment
            display_name=None,
        ):
            '''
            :type id: str
            :type display_name: str or None
            '''

            self.__id = id
            self.__display_name = display_name

        def build(self):
            return WorksheetExtentDefinition(id=self.__id, display_name=self.__display_name)

        @property
        def display_name(self):
            '''
            :rtype: str
            '''

            return self.__display_name

        @classmethod
        def from_template(cls, template):
            '''
            :type template: dressdiscover.api.models.worksheet.worksheet_extent_definition.WorksheetExtentDefinition
            :rtype: dressdiscover.api.models.worksheet.worksheet_extent_definition.WorksheetExtentDefinition
            '''

            builder = cls()
            builder.id = id
            builder.display_name = display_name
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

        def update(self, worksheet_extent_definition):
            '''
            :type id: str
            :type display_name: str or None
            '''

            if isinstance(worksheet_extent_definition, WorksheetExtentDefinition):
                self.set_id(worksheet_extent_definition.id)
                self.set_display_name(worksheet_extent_definition.display_name)
            elif isinstance(worksheet_extent_definition, dict):
                for key, value in worksheet_extent_definition.items():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(worksheet_extent_definition)
            return self

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

    class FieldMetadata(object):
        ID = None
        DISPLAY_NAME = None

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
            return (cls.ID, cls.DISPLAY_NAME,)

    FieldMetadata.ID = FieldMetadata('id', dressdiscover.api.models.worksheet.worksheet_extent_id.WorksheetExtentId, None)
    FieldMetadata.DISPLAY_NAME = FieldMetadata('display_name', thryft.waf.api.models.non_blank_string.NonBlankString, None)

    def __init__(
        self,
        id,  # @ReservedAssignment
        display_name=None,
    ):
        '''
        :type id: str
        :type display_name: str or None
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

    def __eq__(self, other):
        if self.id != other.id:
            return False
        if self.display_name != other.display_name:
            return False
        return True

    def __hash__(self):
        return hash((self.id, self.display_name,))

    def __iter__(self):
        return iter((self.id, self.display_name,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace').decode('ascii') + "'")
        if self.display_name is not None:
            field_reprs.append('display_name=' + "'" + self.display_name.encode('ascii', 'replace').decode('ascii') + "'")
        return 'WorksheetExtentDefinition(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace').decode('ascii') + "'")
        if self.display_name is not None:
            field_reprs.append('display_name=' + "'" + self.display_name.encode('ascii', 'replace').decode('ascii') + "'")
        return 'WorksheetExtentDefinition(' + ', '.join(field_reprs) + ')'

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
        :rtype: dressdiscover.api.models.worksheet.worksheet_extent_definition.WorksheetExtentDefinition
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
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replacer(self):
        return cls.Builder.from_template(template=self)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_extent_definition.WorksheetExtentDefinition
        '''

        oprot.write_struct_begin('WorksheetExtentDefinition')

        oprot.write_field_begin(name='id', type=11, id=None)
        oprot.write_string(self.id)
        oprot.write_field_end()

        if self.display_name is not None:
            oprot.write_field_begin(name='display_name', type=11, id=None)
            oprot.write_string(self.display_name)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self