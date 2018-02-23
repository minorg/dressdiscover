from collections import OrderedDict
import builtins
import dressdiscover.api.models.worksheet.worksheet_rights
import thryft.waf.api.models.non_blank_string


class WorksheetFeatureValueDescription(object):
    class Builder(object):
        def __init__(
            self,
            rights=None,
            text=None,
        ):
            '''
            :type rights: dressdiscover.api.models.worksheet.worksheet_rights.WorksheetRights
            :type text: str
            '''

            self.__rights = rights
            self.__text = text

        def build(self):
            return WorksheetFeatureValueDescription(rights=self.__rights, text=self.__text)

        @classmethod
        def from_template(cls, template):
            '''
            :type template: dressdiscover.api.models.worksheet.worksheet_feature_value_description.WorksheetFeatureValueDescription
            :rtype: dressdiscover.api.models.worksheet.worksheet_feature_value_description.WorksheetFeatureValueDescription
            '''

            builder = cls()
            builder.rights = rights
            builder.text = text
            return builder

        @property
        def rights(self):
            '''
            :rtype: dressdiscover.api.models.worksheet.worksheet_rights.WorksheetRights
            '''

            return self.__rights

        def set_rights(self, rights):
            '''
            :type rights: dressdiscover.api.models.worksheet.worksheet_rights.WorksheetRights
            '''

            if rights is None:
                raise ValueError('rights is required')
            if not isinstance(rights, dressdiscover.api.models.worksheet.worksheet_rights.WorksheetRights):
                raise TypeError("expected rights to be a dressdiscover.api.models.worksheet.worksheet_rights.WorksheetRights but it is a %s" % builtins.type(rights))
            self.__rights = rights
            return self

        def set_text(self, text):
            '''
            :type text: str
            '''

            if text is None:
                raise ValueError('text is required')
            if not isinstance(text, str):
                raise TypeError("expected text to be a str but it is a %s" % builtins.type(text))
            self.__text = text
            return self

        @property
        def text(self):
            '''
            :rtype: str
            '''

            return self.__text

        def update(self, worksheet_feature_value_description):
            '''
            :type rights: dressdiscover.api.models.worksheet.worksheet_rights.WorksheetRights
            :type text: str
            '''

            if isinstance(worksheet_feature_value_description, WorksheetFeatureValueDescription):
                self.set_rights(worksheet_feature_value_description.rights)
                self.set_text(worksheet_feature_value_description.text)
            elif isinstance(worksheet_feature_value_description, dict):
                for key, value in worksheet_feature_value_description.items():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(worksheet_feature_value_description)
            return self

        @rights.setter
        def rights(self, rights):
            '''
            :type rights: dressdiscover.api.models.worksheet.worksheet_rights.WorksheetRights
            '''

            self.set_rights(rights)

        @text.setter
        def text(self, text):
            '''
            :type text: str
            '''

            self.set_text(text)

    class FieldMetadata(object):
        RIGHTS = None
        TEXT = None

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
            return (cls.RIGHTS, cls.TEXT,)

    FieldMetadata.RIGHTS = FieldMetadata('rights', dressdiscover.api.models.worksheet.worksheet_rights.WorksheetRights, None)
    FieldMetadata.TEXT = FieldMetadata('text', thryft.waf.api.models.non_blank_string.NonBlankString, None)

    def __init__(
        self,
        rights,
        text,
    ):
        '''
        :type rights: dressdiscover.api.models.worksheet.worksheet_rights.WorksheetRights
        :type text: str
        '''

        if rights is None:
            raise ValueError('rights is required')
        if not isinstance(rights, dressdiscover.api.models.worksheet.worksheet_rights.WorksheetRights):
            raise TypeError("expected rights to be a dressdiscover.api.models.worksheet.worksheet_rights.WorksheetRights but it is a %s" % builtins.type(rights))
        self.__rights = rights

        if text is None:
            raise ValueError('text is required')
        if not isinstance(text, str):
            raise TypeError("expected text to be a str but it is a %s" % builtins.type(text))
        self.__text = text

    def __eq__(self, other):
        if self.rights != other.rights:
            return False
        if self.text != other.text:
            return False
        return True

    def __hash__(self):
        return hash((self.rights, self.text,))

    def __iter__(self):
        return iter((self.rights, self.text,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('rights=' + repr(self.rights))
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace').decode('ascii') + "'")
        return 'WorksheetFeatureValueDescription(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('rights=' + repr(self.rights))
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace').decode('ascii') + "'")
        return 'WorksheetFeatureValueDescription(' + ', '.join(field_reprs) + ')'

    @classmethod
    def builder(cls):
        return cls.Builder()

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_feature_value_description.WorksheetFeatureValueDescription
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'rights':
                init_kwds['rights'] = dressdiscover.api.models.worksheet.worksheet_rights.WorksheetRights.read(iprot)
            elif ifield_name == 'text':
                init_kwds['text'] = iprot.read_string()
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replacer(self):
        return cls.Builder.from_template(template=self)

    @property
    def rights(self):
        '''
        :rtype: dressdiscover.api.models.worksheet.worksheet_rights.WorksheetRights
        '''

        return self.__rights

    @property
    def text(self):
        '''
        :rtype: str
        '''

        return self.__text

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_feature_value_description.WorksheetFeatureValueDescription
        '''

        oprot.write_struct_begin('WorksheetFeatureValueDescription')

        oprot.write_field_begin(name='rights', type=12, id=None)
        self.rights.write(oprot)
        oprot.write_field_end()

        oprot.write_field_begin(name='text', type=11, id=None)
        oprot.write_string(self.text)
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
