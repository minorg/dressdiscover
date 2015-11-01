import __builtin__
import costume.api.models.institution.institution_id


class Object(object):
    class Builder(object):
        def __init__(
            self,
            collection_id=None,
            institution_id=None,
            title=None,
            description=None,
            provenance=None,
            source_id=None,
            summary=None,
            thumbnail_url=None,
            url=None,
        ):
            '''
            :type collection_id: str
            :type institution_id: costume.api.models.institution.institution_id.InstitutionId
            :type title: str
            :type description: str or None
            :type provenance: str or None
            :type source_id: str or None
            :type summary: str or None
            :type thumbnail_url: str or None
            :type url: str or None
            '''

            self.__collection_id = collection_id
            self.__institution_id = institution_id
            self.__title = title
            self.__description = description
            self.__provenance = provenance
            self.__source_id = source_id
            self.__summary = summary
            self.__thumbnail_url = thumbnail_url
            self.__url = url

        def build(self):
            return Object(collection_id=self.__collection_id, institution_id=self.__institution_id, title=self.__title, description=self.__description, provenance=self.__provenance, source_id=self.__source_id, summary=self.__summary, thumbnail_url=self.__thumbnail_url, url=self.__url)

        @property
        def collection_id(self):
            '''
            :rtype: str
            '''

            return self.__collection_id

        @property
        def description(self):
            '''
            :rtype: str
            '''

            return self.__description

        @property
        def institution_id(self):
            '''
            :rtype: costume.api.models.institution.institution_id.InstitutionId
            '''

            return self.__institution_id

        @property
        def provenance(self):
            '''
            :rtype: str
            '''

            return self.__provenance

        def set_collection_id(self, collection_id):
            '''
            :type collection_id: str
            '''

            self.__collection_id = collection_id
            return self

        def set_description(self, description):
            '''
            :type description: str or None
            '''

            self.__description = description
            return self

        def set_institution_id(self, institution_id):
            '''
            :type institution_id: costume.api.models.institution.institution_id.InstitutionId
            '''

            self.__institution_id = institution_id
            return self

        def set_provenance(self, provenance):
            '''
            :type provenance: str or None
            '''

            self.__provenance = provenance
            return self

        def set_source_id(self, source_id):
            '''
            :type source_id: str or None
            '''

            self.__source_id = source_id
            return self

        def set_summary(self, summary):
            '''
            :type summary: str or None
            '''

            self.__summary = summary
            return self

        def set_thumbnail_url(self, thumbnail_url):
            '''
            :type thumbnail_url: str or None
            '''

            self.__thumbnail_url = thumbnail_url
            return self

        def set_title(self, title):
            '''
            :type title: str
            '''

            self.__title = title
            return self

        def set_url(self, url):
            '''
            :type url: str or None
            '''

            self.__url = url
            return self

        @property
        def source_id(self):
            '''
            :rtype: str
            '''

            return self.__source_id

        @property
        def summary(self):
            '''
            :rtype: str
            '''

            return self.__summary

        @property
        def thumbnail_url(self):
            '''
            :rtype: str
            '''

            return self.__thumbnail_url

        @property
        def title(self):
            '''
            :rtype: str
            '''

            return self.__title

        def update(self, object):
            '''
            :type collection_id: str
            :type institution_id: costume.api.models.institution.institution_id.InstitutionId
            :type title: str
            :type description: str or None
            :type provenance: str or None
            :type source_id: str or None
            :type summary: str or None
            :type thumbnail_url: str or None
            :type url: str or None
            '''

            if isinstance(object, Object):
                self.set_collection_id(object.collection_id)
                self.set_institution_id(object.institution_id)
                self.set_title(object.title)
                self.set_description(object.description)
                self.set_provenance(object.provenance)
                self.set_source_id(object.source_id)
                self.set_summary(object.summary)
                self.set_thumbnail_url(object.thumbnail_url)
                self.set_url(object.url)
            elif isinstance(object, dict):
                for key, value in object.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(object)
            return self

        @property
        def url(self):
            '''
            :rtype: str
            '''

            return self.__url

        @collection_id.setter
        def collection_id(self, collection_id):
            '''
            :type collection_id: str
            '''

            self.set_collection_id(collection_id)

        @description.setter
        def description(self, description):
            '''
            :type description: str or None
            '''

            self.set_description(description)

        @institution_id.setter
        def institution_id(self, institution_id):
            '''
            :type institution_id: costume.api.models.institution.institution_id.InstitutionId
            '''

            self.set_institution_id(institution_id)

        @provenance.setter
        def provenance(self, provenance):
            '''
            :type provenance: str or None
            '''

            self.set_provenance(provenance)

        @source_id.setter
        def source_id(self, source_id):
            '''
            :type source_id: str or None
            '''

            self.set_source_id(source_id)

        @summary.setter
        def summary(self, summary):
            '''
            :type summary: str or None
            '''

            self.set_summary(summary)

        @thumbnail_url.setter
        def thumbnail_url(self, thumbnail_url):
            '''
            :type thumbnail_url: str or None
            '''

            self.set_thumbnail_url(thumbnail_url)

        @title.setter
        def title(self, title):
            '''
            :type title: str
            '''

            self.set_title(title)

        @url.setter
        def url(self, url):
            '''
            :type url: str or None
            '''

            self.set_url(url)

    def __init__(
        self,
        collection_id,
        institution_id,
        title,
        description=None,
        provenance=None,
        source_id=None,
        summary=None,
        thumbnail_url=None,
        url=None,
    ):
        '''
        :type collection_id: str
        :type institution_id: costume.api.models.institution.institution_id.InstitutionId
        :type title: str
        :type description: str or None
        :type provenance: str or None
        :type source_id: str or None
        :type summary: str or None
        :type thumbnail_url: str or None
        :type url: str or None
        '''

        if collection_id is None:
            raise ValueError('collection_id is required')
        if not isinstance(collection_id, basestring):
            raise TypeError("expected collection_id to be a str but it is a %s" % getattr(__builtin__, 'type')(collection_id))
        self.__collection_id = collection_id

        if institution_id is None:
            raise ValueError('institution_id is required')
        if not isinstance(institution_id, costume.api.models.institution.institution_id.InstitutionId):
            raise TypeError("expected institution_id to be a costume.api.models.institution.institution_id.InstitutionId but it is a %s" % getattr(__builtin__, 'type')(institution_id))
        self.__institution_id = institution_id

        if title is None:
            raise ValueError('title is required')
        if not isinstance(title, basestring):
            raise TypeError("expected title to be a str but it is a %s" % getattr(__builtin__, 'type')(title))
        if len(title) < 1:
            raise ValueError("expected len(title) to be >= 1, was %d" % len(title))
        self.__title = title

        if description is not None:
            if not isinstance(description, basestring):
                raise TypeError("expected description to be a str but it is a %s" % getattr(__builtin__, 'type')(description))
        self.__description = description

        if provenance is not None:
            if not isinstance(provenance, basestring):
                raise TypeError("expected provenance to be a str but it is a %s" % getattr(__builtin__, 'type')(provenance))
        self.__provenance = provenance

        if source_id is not None:
            if not isinstance(source_id, basestring):
                raise TypeError("expected source_id to be a str but it is a %s" % getattr(__builtin__, 'type')(source_id))
        self.__source_id = source_id

        if summary is not None:
            if not isinstance(summary, basestring):
                raise TypeError("expected summary to be a str but it is a %s" % getattr(__builtin__, 'type')(summary))
        self.__summary = summary

        if thumbnail_url is not None:
            if not isinstance(thumbnail_url, basestring):
                raise TypeError("expected thumbnail_url to be a str but it is a %s" % getattr(__builtin__, 'type')(thumbnail_url))
        self.__thumbnail_url = thumbnail_url

        if url is not None:
            if not isinstance(url, basestring):
                raise TypeError("expected url to be a str but it is a %s" % getattr(__builtin__, 'type')(url))
        self.__url = url

    def __eq__(self, other):
        if self.collection_id != other.collection_id:
            return False
        if self.institution_id != other.institution_id:
            return False
        if self.title != other.title:
            return False
        if self.description != other.description:
            return False
        if self.provenance != other.provenance:
            return False
        if self.source_id != other.source_id:
            return False
        if self.summary != other.summary:
            return False
        if self.thumbnail_url != other.thumbnail_url:
            return False
        if self.url != other.url:
            return False
        return True

    def __hash__(self):
        return hash((self.collection_id,self.institution_id,self.title,self.description,self.provenance,self.source_id,self.summary,self.thumbnail_url,self.url,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('collection_id=' + "'" + self.collection_id.encode('ascii', 'replace') + "'")
        field_reprs.append('institution_id=' + repr(self.institution_id))
        field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        if self.description is not None:
            field_reprs.append('description=' + "'" + self.description.encode('ascii', 'replace') + "'")
        if self.provenance is not None:
            field_reprs.append('provenance=' + "'" + self.provenance.encode('ascii', 'replace') + "'")
        if self.source_id is not None:
            field_reprs.append('source_id=' + "'" + self.source_id.encode('ascii', 'replace') + "'")
        if self.summary is not None:
            field_reprs.append('summary=' + "'" + self.summary.encode('ascii', 'replace') + "'")
        if self.thumbnail_url is not None:
            field_reprs.append('thumbnail_url=' + "'" + self.thumbnail_url.encode('ascii', 'replace') + "'")
        if self.url is not None:
            field_reprs.append('url=' + "'" + self.url.encode('ascii', 'replace') + "'")
        return 'Object(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('collection_id=' + "'" + self.collection_id.encode('ascii', 'replace') + "'")
        field_reprs.append('institution_id=' + repr(self.institution_id))
        field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        if self.description is not None:
            field_reprs.append('description=' + "'" + self.description.encode('ascii', 'replace') + "'")
        if self.provenance is not None:
            field_reprs.append('provenance=' + "'" + self.provenance.encode('ascii', 'replace') + "'")
        if self.source_id is not None:
            field_reprs.append('source_id=' + "'" + self.source_id.encode('ascii', 'replace') + "'")
        if self.summary is not None:
            field_reprs.append('summary=' + "'" + self.summary.encode('ascii', 'replace') + "'")
        if self.thumbnail_url is not None:
            field_reprs.append('thumbnail_url=' + "'" + self.thumbnail_url.encode('ascii', 'replace') + "'")
        if self.url is not None:
            field_reprs.append('url=' + "'" + self.url.encode('ascii', 'replace') + "'")
        return 'Object(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'collection_id': self.collection_id, 'institution_id': self.institution_id, 'title': self.title, 'description': self.description, 'provenance': self.provenance, 'source_id': self.source_id, 'summary': self.summary, 'thumbnail_url': self.thumbnail_url, 'url': self.url}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.collection_id, self.institution_id, self.title, self.description, self.provenance, self.source_id, self.summary, self.thumbnail_url, self.url,)

    @property
    def collection_id(self):
        '''
        :rtype: str
        '''

        return self.__collection_id

    @property
    def description(self):
        '''
        :rtype: str
        '''

        return self.__description

    @property
    def institution_id(self):
        '''
        :rtype: costume.api.models.institution.institution_id.InstitutionId
        '''

        return self.__institution_id

    @property
    def provenance(self):
        '''
        :rtype: str
        '''

        return self.__provenance

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: costume.api.models.object.object.Object
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'collection_id' and ifield_id == 1:
                init_kwds['collection_id'] = iprot.read_string()
            elif ifield_name == 'institution_id' and ifield_id == 2:
                init_kwds['institution_id'] = costume.api.models.institution.institution_id.InstitutionId.value_of(iprot.read_string().strip().upper())
            elif ifield_name == 'title' and ifield_id == 3:
                init_kwds['title'] = iprot.read_string()
            elif ifield_name == 'description' and ifield_id == 4:
                try:
                    init_kwds['description'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'provenance' and ifield_id == 5:
                try:
                    init_kwds['provenance'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'source_id' and ifield_id == 6:
                try:
                    init_kwds['source_id'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'summary' and ifield_id == 7:
                try:
                    init_kwds['summary'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'thumbnail_url' and ifield_id == 8:
                try:
                    init_kwds['thumbnail_url'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'url' and ifield_id == 9:
                try:
                    init_kwds['url'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        collection_id=None,
        institution_id=None,
        title=None,
        description=None,
        provenance=None,
        source_id=None,
        summary=None,
        thumbnail_url=None,
        url=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type collection_id: str or None
        :type institution_id: costume.api.models.institution.institution_id.InstitutionId or None
        :type title: str or None
        :type description: str or None
        :type provenance: str or None
        :type source_id: str or None
        :type summary: str or None
        :type thumbnail_url: str or None
        :type url: str or None
        :rtype: costume.api.models.object.object.Object
        '''

        if collection_id is None:
            collection_id = self.collection_id
        if institution_id is None:
            institution_id = self.institution_id
        if title is None:
            title = self.title
        if description is None:
            description = self.description
        if provenance is None:
            provenance = self.provenance
        if source_id is None:
            source_id = self.source_id
        if summary is None:
            summary = self.summary
        if thumbnail_url is None:
            thumbnail_url = self.thumbnail_url
        if url is None:
            url = self.url
        return self.__class__(collection_id=collection_id, institution_id=institution_id, title=title, description=description, provenance=provenance, source_id=source_id, summary=summary, thumbnail_url=thumbnail_url, url=url)

    @property
    def source_id(self):
        '''
        :rtype: str
        '''

        return self.__source_id

    @property
    def summary(self):
        '''
        :rtype: str
        '''

        return self.__summary

    @property
    def thumbnail_url(self):
        '''
        :rtype: str
        '''

        return self.__thumbnail_url

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
        :rtype: costume.api.models.object.object.Object
        '''

        oprot.write_struct_begin('Object')

        oprot.write_field_begin(name='collection_id', type=11, id=1)
        oprot.write_string(self.collection_id)
        oprot.write_field_end()

        oprot.write_field_begin(name='institution_id', type=11, id=2)
        oprot.write_string(str(self.institution_id))
        oprot.write_field_end()

        oprot.write_field_begin(name='title', type=11, id=3)
        oprot.write_string(self.title)
        oprot.write_field_end()

        if self.description is not None:
            oprot.write_field_begin(name='description', type=11, id=4)
            oprot.write_string(self.description)
            oprot.write_field_end()

        if self.provenance is not None:
            oprot.write_field_begin(name='provenance', type=11, id=5)
            oprot.write_string(self.provenance)
            oprot.write_field_end()

        if self.source_id is not None:
            oprot.write_field_begin(name='source_id', type=11, id=6)
            oprot.write_string(self.source_id)
            oprot.write_field_end()

        if self.summary is not None:
            oprot.write_field_begin(name='summary', type=11, id=7)
            oprot.write_string(self.summary)
            oprot.write_field_end()

        if self.thumbnail_url is not None:
            oprot.write_field_begin(name='thumbnail_url', type=11, id=8)
            oprot.write_string(self.thumbnail_url)
            oprot.write_field_end()

        if self.url is not None:
            oprot.write_field_begin(name='url', type=11, id=9)
            oprot.write_string(self.url)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
