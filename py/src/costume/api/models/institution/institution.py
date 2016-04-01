import __builtin__
import costume.api.models.location.location_set
import costume.api.models.rights.rights_set


class Institution(object):
    class Builder(object):
        def __init__(
            self,
            title=None,
            collection_store_url=None,
            data_rights=None,
            external=None,
            hidden=None,
            locations=None,
            url=None,
        ):
            '''
            :type title: str
            :type collection_store_url: str or None
            :type data_rights: costume.api.models.rights.rights_set.RightsSet or None
            :type external: bool or None
            :type hidden: bool or None
            :type locations: costume.api.models.location.location_set.LocationSet or None
            :type url: str or None
            '''

            self.__title = title
            self.__collection_store_url = collection_store_url
            self.__data_rights = data_rights
            self.__external = external
            self.__hidden = hidden
            self.__locations = locations
            self.__url = url

        def build(self):
            return Institution(title=self.__title, collection_store_url=self.__collection_store_url, data_rights=self.__data_rights, external=self.__external, hidden=self.__hidden, locations=self.__locations, url=self.__url)

        @property
        def collection_store_url(self):
            '''
            :rtype: str
            '''

            return self.__collection_store_url

        @property
        def data_rights(self):
            '''
            :rtype: costume.api.models.rights.rights_set.RightsSet
            '''

            return self.__data_rights

        @property
        def external(self):
            '''
            :rtype: bool
            '''

            return self.__external

        @property
        def hidden(self):
            '''
            :rtype: bool
            '''

            return self.__hidden

        @property
        def locations(self):
            '''
            :rtype: costume.api.models.location.location_set.LocationSet
            '''

            return self.__locations

        def set_collection_store_url(self, collection_store_url):
            '''
            :type collection_store_url: str or None
            '''

            self.__collection_store_url = collection_store_url
            return self

        def set_data_rights(self, data_rights):
            '''
            :type data_rights: costume.api.models.rights.rights_set.RightsSet or None
            '''

            self.__data_rights = data_rights
            return self

        def set_external(self, external):
            '''
            :type external: bool or None
            '''

            self.__external = external
            return self

        def set_hidden(self, hidden):
            '''
            :type hidden: bool or None
            '''

            self.__hidden = hidden
            return self

        def set_locations(self, locations):
            '''
            :type locations: costume.api.models.location.location_set.LocationSet or None
            '''

            self.__locations = locations
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
        def title(self):
            '''
            :rtype: str
            '''

            return self.__title

        def update(self, institution):
            '''
            :type title: str
            :type collection_store_url: str or None
            :type data_rights: costume.api.models.rights.rights_set.RightsSet or None
            :type external: bool or None
            :type hidden: bool or None
            :type locations: costume.api.models.location.location_set.LocationSet or None
            :type url: str or None
            '''

            if isinstance(institution, Institution):
                self.set_title(institution.title)
                self.set_collection_store_url(institution.collection_store_url)
                self.set_data_rights(institution.data_rights)
                self.set_external(institution.external)
                self.set_hidden(institution.hidden)
                self.set_locations(institution.locations)
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

        @collection_store_url.setter
        def collection_store_url(self, collection_store_url):
            '''
            :type collection_store_url: str or None
            '''

            self.set_collection_store_url(collection_store_url)

        @data_rights.setter
        def data_rights(self, data_rights):
            '''
            :type data_rights: costume.api.models.rights.rights_set.RightsSet or None
            '''

            self.set_data_rights(data_rights)

        @external.setter
        def external(self, external):
            '''
            :type external: bool or None
            '''

            self.set_external(external)

        @hidden.setter
        def hidden(self, hidden):
            '''
            :type hidden: bool or None
            '''

            self.set_hidden(hidden)

        @locations.setter
        def locations(self, locations):
            '''
            :type locations: costume.api.models.location.location_set.LocationSet or None
            '''

            self.set_locations(locations)

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
        title,
        collection_store_url=None,
        data_rights=None,
        external=None,
        hidden=None,
        locations=None,
        url=None,
    ):
        '''
        :type title: str
        :type collection_store_url: str or None
        :type data_rights: costume.api.models.rights.rights_set.RightsSet or None
        :type external: bool or None
        :type hidden: bool or None
        :type locations: costume.api.models.location.location_set.LocationSet or None
        :type url: str or None
        '''

        if title is None:
            raise ValueError('title is required')
        if not isinstance(title, basestring):
            raise TypeError("expected title to be a str but it is a %s" % getattr(__builtin__, 'type')(title))
        self.__title = title

        if collection_store_url is not None:
            if not isinstance(collection_store_url, basestring):
                raise TypeError("expected collection_store_url to be a str but it is a %s" % getattr(__builtin__, 'type')(collection_store_url))
        self.__collection_store_url = collection_store_url

        if data_rights is not None:
            if not isinstance(data_rights, costume.api.models.rights.rights_set.RightsSet):
                raise TypeError("expected data_rights to be a costume.api.models.rights.rights_set.RightsSet but it is a %s" % getattr(__builtin__, 'type')(data_rights))
        self.__data_rights = data_rights

        if external is not None:
            if not isinstance(external, bool):
                raise TypeError("expected external to be a bool but it is a %s" % getattr(__builtin__, 'type')(external))
        self.__external = external

        if hidden is not None:
            if not isinstance(hidden, bool):
                raise TypeError("expected hidden to be a bool but it is a %s" % getattr(__builtin__, 'type')(hidden))
        self.__hidden = hidden

        if locations is not None:
            if not isinstance(locations, costume.api.models.location.location_set.LocationSet):
                raise TypeError("expected locations to be a costume.api.models.location.location_set.LocationSet but it is a %s" % getattr(__builtin__, 'type')(locations))
        self.__locations = locations

        if url is not None:
            if not isinstance(url, basestring):
                raise TypeError("expected url to be a str but it is a %s" % getattr(__builtin__, 'type')(url))
        self.__url = url

    def __eq__(self, other):
        if self.title != other.title:
            return False
        if self.collection_store_url != other.collection_store_url:
            return False
        if self.data_rights != other.data_rights:
            return False
        if self.external != other.external:
            return False
        if self.hidden != other.hidden:
            return False
        if self.locations != other.locations:
            return False
        if self.url != other.url:
            return False
        return True

    def __hash__(self):
        return hash((self.title,self.collection_store_url,self.data_rights,self.external,self.hidden,self.locations,self.url,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        if self.collection_store_url is not None:
            field_reprs.append('collection_store_url=' + "'" + self.collection_store_url.encode('ascii', 'replace') + "'")
        if self.data_rights is not None:
            field_reprs.append('data_rights=' + repr(self.data_rights))
        if self.external is not None:
            field_reprs.append('external=' + repr(self.external))
        if self.hidden is not None:
            field_reprs.append('hidden=' + repr(self.hidden))
        if self.locations is not None:
            field_reprs.append('locations=' + repr(self.locations))
        if self.url is not None:
            field_reprs.append('url=' + "'" + self.url.encode('ascii', 'replace') + "'")
        return 'Institution(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        if self.collection_store_url is not None:
            field_reprs.append('collection_store_url=' + "'" + self.collection_store_url.encode('ascii', 'replace') + "'")
        if self.data_rights is not None:
            field_reprs.append('data_rights=' + repr(self.data_rights))
        if self.external is not None:
            field_reprs.append('external=' + repr(self.external))
        if self.hidden is not None:
            field_reprs.append('hidden=' + repr(self.hidden))
        if self.locations is not None:
            field_reprs.append('locations=' + repr(self.locations))
        if self.url is not None:
            field_reprs.append('url=' + "'" + self.url.encode('ascii', 'replace') + "'")
        return 'Institution(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'title': self.title, 'collection_store_url': self.collection_store_url, 'data_rights': self.data_rights, 'external': self.external, 'hidden': self.hidden, 'locations': self.locations, 'url': self.url}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.title, self.collection_store_url, self.data_rights, self.external, self.hidden, self.locations, self.url,)

    @property
    def collection_store_url(self):
        '''
        :rtype: str
        '''

        return self.__collection_store_url

    @property
    def data_rights(self):
        '''
        :rtype: costume.api.models.rights.rights_set.RightsSet
        '''

        return self.__data_rights

    @property
    def external(self):
        '''
        :rtype: bool
        '''

        return self.__external

    @property
    def hidden(self):
        '''
        :rtype: bool
        '''

        return self.__hidden

    @property
    def locations(self):
        '''
        :rtype: costume.api.models.location.location_set.LocationSet
        '''

        return self.__locations

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
            elif ifield_name == 'title' and ifield_id == 1:
                init_kwds['title'] = iprot.read_string()
            elif ifield_name == 'collection_store_url' and ifield_id == 9:
                try:
                    init_kwds['collection_store_url'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'data_rights' and ifield_id == 5:
                init_kwds['data_rights'] = costume.api.models.rights.rights_set.RightsSet.read(iprot)
            elif ifield_name == 'external' and ifield_id == 7:
                try:
                    init_kwds['external'] = iprot.read_bool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'hidden' and ifield_id == 6:
                try:
                    init_kwds['hidden'] = iprot.read_bool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'locations' and ifield_id == 8:
                init_kwds['locations'] = costume.api.models.location.location_set.LocationSet.read(iprot)
            elif ifield_name == 'url' and ifield_id == 3:
                try:
                    init_kwds['url'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        title=None,
        collection_store_url=None,
        data_rights=None,
        external=None,
        hidden=None,
        locations=None,
        url=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type title: str or None
        :type collection_store_url: str or None
        :type data_rights: costume.api.models.rights.rights_set.RightsSet or None
        :type external: bool or None
        :type hidden: bool or None
        :type locations: costume.api.models.location.location_set.LocationSet or None
        :type url: str or None
        :rtype: costume.api.models.institution.institution.Institution
        '''

        if title is None:
            title = self.title
        if collection_store_url is None:
            collection_store_url = self.collection_store_url
        if data_rights is None:
            data_rights = self.data_rights
        if external is None:
            external = self.external
        if hidden is None:
            hidden = self.hidden
        if locations is None:
            locations = self.locations
        if url is None:
            url = self.url
        return self.__class__(title=title, collection_store_url=collection_store_url, data_rights=data_rights, external=external, hidden=hidden, locations=locations, url=url)

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

        oprot.write_field_begin(name='title', type=11, id=1)
        oprot.write_string(self.title)
        oprot.write_field_end()

        if self.collection_store_url is not None:
            oprot.write_field_begin(name='collection_store_url', type=11, id=9)
            oprot.write_string(self.collection_store_url)
            oprot.write_field_end()

        if self.data_rights is not None:
            oprot.write_field_begin(name='data_rights', type=12, id=5)
            self.data_rights.write(oprot)
            oprot.write_field_end()

        if self.external is not None:
            oprot.write_field_begin(name='external', type=2, id=7)
            oprot.write_bool(self.external)
            oprot.write_field_end()

        if self.hidden is not None:
            oprot.write_field_begin(name='hidden', type=2, id=6)
            oprot.write_bool(self.hidden)
            oprot.write_field_end()

        if self.locations is not None:
            oprot.write_field_begin(name='locations', type=12, id=8)
            self.locations.write(oprot)
            oprot.write_field_end()

        if self.url is not None:
            oprot.write_field_begin(name='url', type=11, id=3)
            oprot.write_string(self.url)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
