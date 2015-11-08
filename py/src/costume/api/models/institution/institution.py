import __builtin__
import costume.api.models.model_metadata
import costume.api.models.rights.rights_set


class Institution(object):
    class Builder(object):
        def __init__(
            self,
            data_rights=None,
            model_metadata=None,
            title=None,
            url=None,
        ):
            '''
            :type data_rights: costume.api.models.rights.rights_set.RightsSet
            :type model_metadata: costume.api.models.model_metadata.ModelMetadata
            :type title: str
            :type url: str
            '''

            self.__data_rights = data_rights
            self.__model_metadata = model_metadata
            self.__title = title
            self.__url = url

        def build(self):
            return Institution(data_rights=self.__data_rights, model_metadata=self.__model_metadata, title=self.__title, url=self.__url)

        @property
        def data_rights(self):
            '''
            :rtype: costume.api.models.rights.rights_set.RightsSet
            '''

            return self.__data_rights

        @property
        def model_metadata(self):
            '''
            :rtype: costume.api.models.model_metadata.ModelMetadata
            '''

            return self.__model_metadata

        def set_data_rights(self, data_rights):
            '''
            :type data_rights: costume.api.models.rights.rights_set.RightsSet
            '''

            self.__data_rights = data_rights
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
            :type data_rights: costume.api.models.rights.rights_set.RightsSet
            :type model_metadata: costume.api.models.model_metadata.ModelMetadata
            :type title: str
            :type url: str
            '''

            if isinstance(institution, Institution):
                self.set_data_rights(institution.data_rights)
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

        @data_rights.setter
        def data_rights(self, data_rights):
            '''
            :type data_rights: costume.api.models.rights.rights_set.RightsSet
            '''

            self.set_data_rights(data_rights)

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
        data_rights,
        model_metadata,
        title,
        url,
    ):
        '''
        :type data_rights: costume.api.models.rights.rights_set.RightsSet
        :type model_metadata: costume.api.models.model_metadata.ModelMetadata
        :type title: str
        :type url: str
        '''

        if data_rights is None:
            raise ValueError('data_rights is required')
        if not isinstance(data_rights, costume.api.models.rights.rights_set.RightsSet):
            raise TypeError("expected data_rights to be a costume.api.models.rights.rights_set.RightsSet but it is a %s" % getattr(__builtin__, 'type')(data_rights))
        self.__data_rights = data_rights

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
        if self.data_rights != other.data_rights:
            return False
        if self.model_metadata != other.model_metadata:
            return False
        if self.title != other.title:
            return False
        if self.url != other.url:
            return False
        return True

    def __hash__(self):
        return hash((self.data_rights,self.model_metadata,self.title,self.url,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('data_rights=' + repr(self.data_rights))
        field_reprs.append('model_metadata=' + repr(self.model_metadata))
        field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        field_reprs.append('url=' + "'" + self.url.encode('ascii', 'replace') + "'")
        return 'Institution(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('data_rights=' + repr(self.data_rights))
        field_reprs.append('model_metadata=' + repr(self.model_metadata))
        field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        field_reprs.append('url=' + "'" + self.url.encode('ascii', 'replace') + "'")
        return 'Institution(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'data_rights': self.data_rights, 'model_metadata': self.model_metadata, 'title': self.title, 'url': self.url}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.data_rights, self.model_metadata, self.title, self.url,)

    @property
    def data_rights(self):
        '''
        :rtype: costume.api.models.rights.rights_set.RightsSet
        '''

        return self.__data_rights

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
            elif ifield_name == 'data_rights' and ifield_id == 5:
                init_kwds['data_rights'] = costume.api.models.rights.rights_set.RightsSet.read(iprot)
            elif ifield_name == 'model_metadata' and ifield_id == 4:
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
        data_rights=None,
        model_metadata=None,
        title=None,
        url=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type data_rights: costume.api.models.rights.rights_set.RightsSet or None
        :type model_metadata: costume.api.models.model_metadata.ModelMetadata or None
        :type title: str or None
        :type url: str or None
        :rtype: costume.api.models.institution.institution.Institution
        '''

        if data_rights is None:
            data_rights = self.data_rights
        if model_metadata is None:
            model_metadata = self.model_metadata
        if title is None:
            title = self.title
        if url is None:
            url = self.url
        return self.__class__(data_rights=data_rights, model_metadata=model_metadata, title=title, url=url)

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

        oprot.write_field_begin(name='data_rights', type=12, id=5)
        self.data_rights.write(oprot)
        oprot.write_field_end()

        oprot.write_field_begin(name='model_metadata', type=12, id=4)
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
