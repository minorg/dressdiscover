import __builtin__
import costume.api.models.location.location_set
import costume.api.models.model_metadata
import costume.api.models.work_type.work_type_set


class Collection(object):
    class Builder(object):
        def __init__(
            self,
            institution_id=None,
            model_metadata=None,
            title=None,
            description=None,
            external=None,
            hidden=None,
            locations=None,
            work_types=None,
        ):
            '''
            :type institution_id: str
            :type model_metadata: costume.api.models.model_metadata.ModelMetadata
            :type title: str
            :type description: str or None
            :type external: bool or None
            :type hidden: bool or None
            :type locations: costume.api.models.location.location_set.LocationSet or None
            :type work_types: costume.api.models.work_type.work_type_set.WorkTypeSet or None
            '''

            self.__institution_id = institution_id
            self.__model_metadata = model_metadata
            self.__title = title
            self.__description = description
            self.__external = external
            self.__hidden = hidden
            self.__locations = locations
            self.__work_types = work_types

        def build(self):
            return Collection(institution_id=self.__institution_id, model_metadata=self.__model_metadata, title=self.__title, description=self.__description, external=self.__external, hidden=self.__hidden, locations=self.__locations, work_types=self.__work_types)

        @property
        def description(self):
            '''
            :rtype: str
            '''

            return self.__description

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
        def institution_id(self):
            '''
            :rtype: str
            '''

            return self.__institution_id

        @property
        def locations(self):
            '''
            :rtype: costume.api.models.location.location_set.LocationSet
            '''

            return self.__locations

        @property
        def model_metadata(self):
            '''
            :rtype: costume.api.models.model_metadata.ModelMetadata
            '''

            return self.__model_metadata

        def set_description(self, description):
            '''
            :type description: str or None
            '''

            self.__description = description
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

        def set_institution_id(self, institution_id):
            '''
            :type institution_id: str
            '''

            self.__institution_id = institution_id
            return self

        def set_locations(self, locations):
            '''
            :type locations: costume.api.models.location.location_set.LocationSet or None
            '''

            self.__locations = locations
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

        def set_work_types(self, work_types):
            '''
            :type work_types: costume.api.models.work_type.work_type_set.WorkTypeSet or None
            '''

            self.__work_types = work_types
            return self

        @property
        def title(self):
            '''
            :rtype: str
            '''

            return self.__title

        def update(self, collection):
            '''
            :type institution_id: str
            :type model_metadata: costume.api.models.model_metadata.ModelMetadata
            :type title: str
            :type description: str or None
            :type external: bool or None
            :type hidden: bool or None
            :type locations: costume.api.models.location.location_set.LocationSet or None
            :type work_types: costume.api.models.work_type.work_type_set.WorkTypeSet or None
            '''

            if isinstance(collection, Collection):
                self.set_institution_id(collection.institution_id)
                self.set_model_metadata(collection.model_metadata)
                self.set_title(collection.title)
                self.set_description(collection.description)
                self.set_external(collection.external)
                self.set_hidden(collection.hidden)
                self.set_locations(collection.locations)
                self.set_work_types(collection.work_types)
            elif isinstance(collection, dict):
                for key, value in collection.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(collection)
            return self

        @property
        def work_types(self):
            '''
            :rtype: costume.api.models.work_type.work_type_set.WorkTypeSet
            '''

            return self.__work_types

        @description.setter
        def description(self, description):
            '''
            :type description: str or None
            '''

            self.set_description(description)

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

        @institution_id.setter
        def institution_id(self, institution_id):
            '''
            :type institution_id: str
            '''

            self.set_institution_id(institution_id)

        @locations.setter
        def locations(self, locations):
            '''
            :type locations: costume.api.models.location.location_set.LocationSet or None
            '''

            self.set_locations(locations)

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

        @work_types.setter
        def work_types(self, work_types):
            '''
            :type work_types: costume.api.models.work_type.work_type_set.WorkTypeSet or None
            '''

            self.set_work_types(work_types)

    def __init__(
        self,
        institution_id,
        model_metadata,
        title,
        description=None,
        external=None,
        hidden=None,
        locations=None,
        work_types=None,
    ):
        '''
        :type institution_id: str
        :type model_metadata: costume.api.models.model_metadata.ModelMetadata
        :type title: str
        :type description: str or None
        :type external: bool or None
        :type hidden: bool or None
        :type locations: costume.api.models.location.location_set.LocationSet or None
        :type work_types: costume.api.models.work_type.work_type_set.WorkTypeSet or None
        '''

        if institution_id is None:
            raise ValueError('institution_id is required')
        if not isinstance(institution_id, basestring):
            raise TypeError("expected institution_id to be a str but it is a %s" % getattr(__builtin__, 'type')(institution_id))
        self.__institution_id = institution_id

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

        if description is not None:
            if not isinstance(description, basestring):
                raise TypeError("expected description to be a str but it is a %s" % getattr(__builtin__, 'type')(description))
            if len(description) < 1:
                raise ValueError("expected len(description) to be >= 1, was %d" % len(description))
        self.__description = description

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

        if work_types is not None:
            if not isinstance(work_types, costume.api.models.work_type.work_type_set.WorkTypeSet):
                raise TypeError("expected work_types to be a costume.api.models.work_type.work_type_set.WorkTypeSet but it is a %s" % getattr(__builtin__, 'type')(work_types))
        self.__work_types = work_types

    def __eq__(self, other):
        if self.institution_id != other.institution_id:
            return False
        if self.model_metadata != other.model_metadata:
            return False
        if self.title != other.title:
            return False
        if self.description != other.description:
            return False
        if self.external != other.external:
            return False
        if self.hidden != other.hidden:
            return False
        if self.locations != other.locations:
            return False
        if self.work_types != other.work_types:
            return False
        return True

    def __hash__(self):
        return hash((self.institution_id,self.model_metadata,self.title,self.description,self.external,self.hidden,self.locations,self.work_types,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('institution_id=' + "'" + self.institution_id.encode('ascii', 'replace') + "'")
        field_reprs.append('model_metadata=' + repr(self.model_metadata))
        field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        if self.description is not None:
            field_reprs.append('description=' + "'" + self.description.encode('ascii', 'replace') + "'")
        if self.external is not None:
            field_reprs.append('external=' + repr(self.external))
        if self.hidden is not None:
            field_reprs.append('hidden=' + repr(self.hidden))
        if self.locations is not None:
            field_reprs.append('locations=' + repr(self.locations))
        if self.work_types is not None:
            field_reprs.append('work_types=' + repr(self.work_types))
        return 'Collection(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('institution_id=' + "'" + self.institution_id.encode('ascii', 'replace') + "'")
        field_reprs.append('model_metadata=' + repr(self.model_metadata))
        field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        if self.description is not None:
            field_reprs.append('description=' + "'" + self.description.encode('ascii', 'replace') + "'")
        if self.external is not None:
            field_reprs.append('external=' + repr(self.external))
        if self.hidden is not None:
            field_reprs.append('hidden=' + repr(self.hidden))
        if self.locations is not None:
            field_reprs.append('locations=' + repr(self.locations))
        if self.work_types is not None:
            field_reprs.append('work_types=' + repr(self.work_types))
        return 'Collection(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'institution_id': self.institution_id, 'model_metadata': self.model_metadata, 'title': self.title, 'description': self.description, 'external': self.external, 'hidden': self.hidden, 'locations': self.locations, 'work_types': self.work_types}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.institution_id, self.model_metadata, self.title, self.description, self.external, self.hidden, self.locations, self.work_types,)

    @property
    def description(self):
        '''
        :rtype: str
        '''

        return self.__description

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
    def institution_id(self):
        '''
        :rtype: str
        '''

        return self.__institution_id

    @property
    def locations(self):
        '''
        :rtype: costume.api.models.location.location_set.LocationSet
        '''

        return self.__locations

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
        :rtype: costume.api.models.collection.collection.Collection
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'institution_id' and ifield_id == 1:
                init_kwds['institution_id'] = iprot.read_string()
            elif ifield_name == 'model_metadata' and ifield_id == 3:
                init_kwds['model_metadata'] = costume.api.models.model_metadata.ModelMetadata.read(iprot)
            elif ifield_name == 'title' and ifield_id == 2:
                init_kwds['title'] = iprot.read_string()
            elif ifield_name == 'description' and ifield_id == 4:
                try:
                    init_kwds['description'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'external' and ifield_id == 7:
                try:
                    init_kwds['external'] = iprot.read_bool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'hidden' and ifield_id == 5:
                try:
                    init_kwds['hidden'] = iprot.read_bool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'locations' and ifield_id == 8:
                init_kwds['locations'] = costume.api.models.location.location_set.LocationSet.read(iprot)
            elif ifield_name == 'work_types' and ifield_id == 6:
                init_kwds['work_types'] = costume.api.models.work_type.work_type_set.WorkTypeSet.read(iprot)
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        institution_id=None,
        model_metadata=None,
        title=None,
        description=None,
        external=None,
        hidden=None,
        locations=None,
        work_types=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type institution_id: str or None
        :type model_metadata: costume.api.models.model_metadata.ModelMetadata or None
        :type title: str or None
        :type description: str or None
        :type external: bool or None
        :type hidden: bool or None
        :type locations: costume.api.models.location.location_set.LocationSet or None
        :type work_types: costume.api.models.work_type.work_type_set.WorkTypeSet or None
        :rtype: costume.api.models.collection.collection.Collection
        '''

        if institution_id is None:
            institution_id = self.institution_id
        if model_metadata is None:
            model_metadata = self.model_metadata
        if title is None:
            title = self.title
        if description is None:
            description = self.description
        if external is None:
            external = self.external
        if hidden is None:
            hidden = self.hidden
        if locations is None:
            locations = self.locations
        if work_types is None:
            work_types = self.work_types
        return self.__class__(institution_id=institution_id, model_metadata=model_metadata, title=title, description=description, external=external, hidden=hidden, locations=locations, work_types=work_types)

    @property
    def title(self):
        '''
        :rtype: str
        '''

        return self.__title

    @property
    def work_types(self):
        '''
        :rtype: costume.api.models.work_type.work_type_set.WorkTypeSet
        '''

        return self.__work_types

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.models.collection.collection.Collection
        '''

        oprot.write_struct_begin('Collection')

        oprot.write_field_begin(name='institution_id', type=11, id=1)
        oprot.write_string(self.institution_id)
        oprot.write_field_end()

        oprot.write_field_begin(name='model_metadata', type=12, id=3)
        self.model_metadata.write(oprot)
        oprot.write_field_end()

        oprot.write_field_begin(name='title', type=11, id=2)
        oprot.write_string(self.title)
        oprot.write_field_end()

        if self.description is not None:
            oprot.write_field_begin(name='description', type=11, id=4)
            oprot.write_string(self.description)
            oprot.write_field_end()

        if self.external is not None:
            oprot.write_field_begin(name='external', type=2, id=7)
            oprot.write_bool(self.external)
            oprot.write_field_end()

        if self.hidden is not None:
            oprot.write_field_begin(name='hidden', type=2, id=5)
            oprot.write_bool(self.hidden)
            oprot.write_field_end()

        if self.locations is not None:
            oprot.write_field_begin(name='locations', type=12, id=8)
            self.locations.write(oprot)
            oprot.write_field_end()

        if self.work_types is not None:
            oprot.write_field_begin(name='work_types', type=12, id=6)
            self.work_types.write(oprot)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
