import __builtin__
import costume.api.models.model_metadata


class Institution(object):
    class Builder(object):
        def __init__(
            self,
            copyright_notice=None,
            model_metadata=None,
            title=None,
            url=None,
        ):
            '''
            :type copyright_notice: str
            :type model_metadata: costume.api.models.model_metadata.ModelMetadata
            :type title: str
            :type url: str
            '''

            self.__copyright_notice = copyright_notice
            self.__model_metadata = model_metadata
            self.__title = title
            self.__url = url

        def build(self):
            return Institution(copyright_notice=self.__copyright_notice, model_metadata=self.__model_metadata, title=self.__title, url=self.__url)

        @property
        def copyright_notice(self):
            '''
            :rtype: str
            '''

            return self.__copyright_notice

        @property
        def model_metadata(self):
            '''
            :rtype: costume.api.models.model_metadata.ModelMetadata
            '''

            return self.__model_metadata

        def set_copyright_notice(self, copyright_notice):
            '''
            :type copyright_notice: str
            '''

            self.__copyright_notice = copyright_notice
            return self

        def set_model_metadata(self, model_metadata):
            '''
            :type model_metadata: costume.api.models.model_metadata.ModelMetadata
            '''

            self.__model_metadata = model_metadata
            return self

        def set_title(self, title):
            '''
            :type title: str
            '''

            self.__title = title
            return self

        def set_url(self, url):
            '''
            :type url: str
            '''

            self.__url = url
            return self

        @property
        def title(self):
            '''
            :rtype: str
            '''

            return self.__title

        def update(self, institution):
            '''
            :type copyright_notice: str
            :type model_metadata: costume.api.models.model_metadata.ModelMetadata
            :type title: str
            :type url: str
            '''

            if isinstance(institution, Institution):
                self.set_copyright_notice(institution.copyright_notice)
                self.set_model_metadata(institution.model_metadata)
                self.set_title(institution.title)
                self.set_url(institution.url)
            elif isinstance(institution, dict):
                for key, value in institution.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(institution)
            return self

        @property
        def url(self):
            '''
            :rtype: str
            '''

            return self.__url

        @copyright_notice.setter
        def copyright_notice(self, copyright_notice):
            '''
            :type copyright_notice: str
            '''

            self.set_copyright_notice(copyright_notice)

        @model_metadata.setter
        def model_metadata(self, model_metadata):
            '''
            :type model_metadata: costume.api.models.model_metadata.ModelMetadata
            '''

            self.set_model_metadata(model_metadata)

        @title.setter
        def title(self, title):
            '''
            :type title: str
            '''

            self.set_title(title)

        @url.setter
        def url(self, url):
            '''
            :type url: str
            '''

            self.set_url(url)

    def __init__(
        self,
        copyright_notice,
        model_metadata,
        title,
        url,
    ):
        '''
        :type copyright_notice: str
        :type model_metadata: costume.api.models.model_metadata.ModelMetadata
        :type title: str
        :type url: str
        '''

        if copyright_notice is None:
            raise ValueError('copyright_notice is required')
        if not isinstance(copyright_notice, basestring):
            raise TypeError("expected copyright_notice to be a str but it is a %s" % getattr(__builtin__, 'type')(copyright_notice))
        if len(copyright_notice) < 1:
            raise ValueError("expected len(copyright_notice) to be >= 1, was %d" % len(copyright_notice))
        self.__copyright_notice = copyright_notice

        if model_metadata is None:
            raise ValueError('model_metadata is required')
        if not isinstance(model_metadata, costume.api.models.model_metadata.ModelMetadata):
            raise TypeError("expected model_metadata to be a costume.api.models.model_metadata.ModelMetadata but it is a %s" % getattr(__builtin__, 'type')(model_metadata))
        self.__model_metadata = model_metadata

        if title is None:
            raise ValueError('title is required')
        if not isinstance(title, basestring):
            raise TypeError("expected title to be a str but it is a %s" % getattr(__builtin__, 'type')(title))
        if len(title) < 1:
            raise ValueError("expected len(title) to be >= 1, was %d" % len(title))
        self.__title = title

        if url is None:
            raise ValueError('url is required')
        if not isinstance(url, basestring):
            raise TypeError("expected url to be a str but it is a %s" % getattr(__builtin__, 'type')(url))
        self.__url = url

    def __eq__(self, other):
        if self.copyright_notice != other.copyright_notice:
            return False
        if self.model_metadata != other.model_metadata:
            return False
        if self.title != other.title:
            return False
        if self.url != other.url:
            return False
        return True

    def __hash__(self):
        return hash((self.copyright_notice,self.model_metadata,self.title,self.url,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('copyright_notice=' + "'" + self.copyright_notice.encode('ascii', 'replace') + "'")
        field_reprs.append('model_metadata=' + repr(self.model_metadata))
        field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        field_reprs.append('url=' + "'" + self.url.encode('ascii', 'replace') + "'")
        return 'Institution(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('copyright_notice=' + "'" + self.copyright_notice.encode('ascii', 'replace') + "'")
        field_reprs.append('model_metadata=' + repr(self.model_metadata))
        field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        field_reprs.append('url=' + "'" + self.url.encode('ascii', 'replace') + "'")
        return 'Institution(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'copyright_notice': self.copyright_notice, 'model_metadata': self.model_metadata, 'title': self.title, 'url': self.url}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.copyright_notice, self.model_metadata, self.title, self.url,)

    @property
    def copyright_notice(self):
        '''
        :rtype: str
        '''

        return self.__copyright_notice

    @property
    def model_metadata(self):
        '''
        :rtype: costume.api.models.model_metadata.ModelMetadata
        '''

        return self.__model_metadata

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: costume.api.models.institution.institution.Institution
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'copyright_notice' and ifield_id == 2:
                init_kwds['copyright_notice'] = iprot.read_string()
            elif ifield_name == 'model_metadata' and ifield_id == 3:
                init_kwds['model_metadata'] = costume.api.models.model_metadata.ModelMetadata.read(iprot)
            elif ifield_name == 'title' and ifield_id == 1:
                init_kwds['title'] = iprot.read_string()
            elif ifield_name == 'url' and ifield_id == 3:
                init_kwds['url'] = iprot.read_string()
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        copyright_notice=None,
        model_metadata=None,
        title=None,
        url=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type copyright_notice: str or None
        :type model_metadata: costume.api.models.model_metadata.ModelMetadata or None
        :type title: str or None
        :type url: str or None
        :rtype: costume.api.models.institution.institution.Institution
        '''

        if copyright_notice is None:
            copyright_notice = self.copyright_notice
        if model_metadata is None:
            model_metadata = self.model_metadata
        if title is None:
            title = self.title
        if url is None:
            url = self.url
        return self.__class__(copyright_notice=copyright_notice, model_metadata=model_metadata, title=title, url=url)

    @property
    def title(self):
        '''
        :rtype: str
        '''

        return self.__title

    @property
    def url(self):
        '''
        :rtype: str
        '''

        return self.__url

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.models.institution.institution.Institution
        '''

        oprot.write_struct_begin('Institution')

        oprot.write_field_begin(name='copyright_notice', type=11, id=2)
        oprot.write_string(self.copyright_notice)
        oprot.write_field_end()

        oprot.write_field_begin(name='model_metadata', type=12, id=3)
        self.model_metadata.write(oprot)
        oprot.write_field_end()

        oprot.write_field_begin(name='title', type=11, id=1)
        oprot.write_string(self.title)
        oprot.write_field_end()

        oprot.write_field_begin(name='url', type=11, id=3)
        oprot.write_string(self.url)
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
