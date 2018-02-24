from collections import OrderedDict
import builtins
import thryft.waf.api.models.non_blank_string


class WorksheetRights(object):
    class Builder(object):
        def __init__(
            self,
            author=None,
            license=None,  # @ReservedAssignment
            source_name=None,
            source_url=None,
        ):
            '''
            :type author: str
            :type license: str
            :type source_name: str
            :type source_url: str
            '''

            self.__author = author
            self.__license = license
            self.__source_name = source_name
            self.__source_url = source_url

        def build(self):
            return WorksheetRights(author=self.__author, license=self.__license, source_name=self.__source_name, source_url=self.__source_url)

        @property
        def author(self):
            '''
            :rtype: str
            '''

            return self.__author

        @classmethod
        def from_template(cls, template):
            '''
            :type template: dressdiscover.api.models.worksheet.worksheet_rights.WorksheetRights
            :rtype: dressdiscover.api.models.worksheet.worksheet_rights.WorksheetRights
            '''

            builder = cls()
            builder.author = author
            builder.license = license
            builder.source_name = source_name
            builder.source_url = source_url
            return builder

        @property
        def license(self):  # @ReservedAssignment
            '''
            :rtype: str
            '''

            return self.__license

        def set_author(self, author):
            '''
            :type author: str
            '''

            if author is None:
                raise ValueError('author is required')
            if not isinstance(author, str):
                raise TypeError("expected author to be a str but it is a %s" % builtins.type(author))
            self.__author = author
            return self

        def set_license(self, license):  # @ReservedAssignment
            '''
            :type license: str
            '''

            if license is None:
                raise ValueError('license is required')
            if not isinstance(license, str):
                raise TypeError("expected license to be a str but it is a %s" % builtins.type(license))
            self.__license = license
            return self

        def set_source_name(self, source_name):
            '''
            :type source_name: str
            '''

            if source_name is None:
                raise ValueError('source_name is required')
            if not isinstance(source_name, str):
                raise TypeError("expected source_name to be a str but it is a %s" % builtins.type(source_name))
            self.__source_name = source_name
            return self

        def set_source_url(self, source_url):
            '''
            :type source_url: str
            '''

            if source_url is None:
                raise ValueError('source_url is required')
            if not isinstance(source_url, str):
                raise TypeError("expected source_url to be a str but it is a %s" % builtins.type(source_url))
            self.__source_url = source_url
            return self

        @property
        def source_name(self):
            '''
            :rtype: str
            '''

            return self.__source_name

        @property
        def source_url(self):
            '''
            :rtype: str
            '''

            return self.__source_url

        def update(self, worksheet_rights):
            '''
            :type author: str
            :type license: str
            :type source_name: str
            :type source_url: str
            '''

            if isinstance(worksheet_rights, WorksheetRights):
                self.set_author(worksheet_rights.author)
                self.set_license(worksheet_rights.license)
                self.set_source_name(worksheet_rights.source_name)
                self.set_source_url(worksheet_rights.source_url)
            elif isinstance(worksheet_rights, dict):
                for key, value in worksheet_rights.items():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(worksheet_rights)
            return self

        @author.setter
        def author(self, author):
            '''
            :type author: str
            '''

            self.set_author(author)

        @license.setter
        def license(self, license):  # @ReservedAssignment
            '''
            :type license: str
            '''

            self.set_license(license)

        @source_name.setter
        def source_name(self, source_name):
            '''
            :type source_name: str
            '''

            self.set_source_name(source_name)

        @source_url.setter
        def source_url(self, source_url):
            '''
            :type source_url: str
            '''

            self.set_source_url(source_url)

    class FieldMetadata(object):
        AUTHOR = None
        LICENSE = None
        SOURCE_NAME = None
        SOURCE_URL = None

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
            return (cls.AUTHOR, cls.LICENSE, cls.SOURCE_NAME, cls.SOURCE_URL,)

    FieldMetadata.AUTHOR = FieldMetadata('author', thryft.waf.api.models.non_blank_string.NonBlankString, None)
    FieldMetadata.LICENSE = FieldMetadata('license', thryft.waf.api.models.non_blank_string.NonBlankString, None)
    FieldMetadata.SOURCE_NAME = FieldMetadata('source_name', thryft.waf.api.models.non_blank_string.NonBlankString, None)
    FieldMetadata.SOURCE_URL = FieldMetadata('source_url', str, None)

    def __init__(
        self,
        author,
        license,  # @ReservedAssignment
        source_name,
        source_url,
    ):
        '''
        :type author: str
        :type license: str
        :type source_name: str
        :type source_url: str
        '''

        if author is None:
            raise ValueError('author is required')
        if not isinstance(author, str):
            raise TypeError("expected author to be a str but it is a %s" % builtins.type(author))
        self.__author = author

        if license is None:
            raise ValueError('license is required')
        if not isinstance(license, str):
            raise TypeError("expected license to be a str but it is a %s" % builtins.type(license))
        self.__license = license

        if source_name is None:
            raise ValueError('source_name is required')
        if not isinstance(source_name, str):
            raise TypeError("expected source_name to be a str but it is a %s" % builtins.type(source_name))
        self.__source_name = source_name

        if source_url is None:
            raise ValueError('source_url is required')
        if not isinstance(source_url, str):
            raise TypeError("expected source_url to be a str but it is a %s" % builtins.type(source_url))
        self.__source_url = source_url

    def __eq__(self, other):
        if self.author != other.author:
            return False
        if self.license != other.license:
            return False
        if self.source_name != other.source_name:
            return False
        if self.source_url != other.source_url:
            return False
        return True

    def __hash__(self):
        return hash((self.author, self.license, self.source_name, self.source_url,))

    def __iter__(self):
        return iter((self.author, self.license, self.source_name, self.source_url,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('author=' + "'" + self.author.encode('ascii', 'replace').decode('ascii') + "'")
        field_reprs.append('license=' + "'" + self.license.encode('ascii', 'replace').decode('ascii') + "'")
        field_reprs.append('source_name=' + "'" + self.source_name.encode('ascii', 'replace').decode('ascii') + "'")
        field_reprs.append('source_url=' + "'" + self.source_url.encode('ascii', 'replace').decode('ascii') + "'")
        return 'WorksheetRights(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('author=' + "'" + self.author.encode('ascii', 'replace').decode('ascii') + "'")
        field_reprs.append('license=' + "'" + self.license.encode('ascii', 'replace').decode('ascii') + "'")
        field_reprs.append('source_name=' + "'" + self.source_name.encode('ascii', 'replace').decode('ascii') + "'")
        field_reprs.append('source_url=' + "'" + self.source_url.encode('ascii', 'replace').decode('ascii') + "'")
        return 'WorksheetRights(' + ', '.join(field_reprs) + ')'

    @property
    def author(self):
        '''
        :rtype: str
        '''

        return self.__author

    @classmethod
    def builder(cls):
        return cls.Builder()

    @property
    def license(self):  # @ReservedAssignment
        '''
        :rtype: str
        '''

        return self.__license

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_rights.WorksheetRights
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'author':
                init_kwds['author'] = iprot.read_string()
            elif ifield_name == 'license':
                init_kwds['license'] = iprot.read_string()
            elif ifield_name == 'source_name':
                init_kwds['source_name'] = iprot.read_string()
            elif ifield_name == 'source_url':
                init_kwds['source_url'] = iprot.read_string()
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replacer(self):
        return cls.Builder.from_template(template=self)

    @property
    def source_name(self):
        '''
        :rtype: str
        '''

        return self.__source_name

    @property
    def source_url(self):
        '''
        :rtype: str
        '''

        return self.__source_url

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_rights.WorksheetRights
        '''

        oprot.write_struct_begin('WorksheetRights')

        oprot.write_field_begin(name='author', type=11, id=None)
        oprot.write_string(self.author)
        oprot.write_field_end()

        oprot.write_field_begin(name='license', type=11, id=None)
        oprot.write_string(self.license)
        oprot.write_field_end()

        oprot.write_field_begin(name='source_name', type=11, id=None)
        oprot.write_string(self.source_name)
        oprot.write_field_end()

        oprot.write_field_begin(name='source_url', type=11, id=None)
        oprot.write_string(self.source_url)
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
