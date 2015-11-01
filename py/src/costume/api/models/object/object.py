import __builtin__
import costume.api.models.institution.institution_id


class Object(object):
    class Builder(object):
        def __init__(
            self,
            institution_id=None,
            title=None,
            collection_id=None,
            description=None,
        ):
            '''
            :type institution_id: costume.api.models.institution.institution_id.InstitutionId
            :type title: str
            :type collection_id: str or None
            :type description: str or None
            '''

            self.__institution_id = institution_id
            self.__title = title
            self.__collection_id = collection_id
            self.__description = description

        def build(self):
            return Object(institution_id=self.__institution_id, title=self.__title, collection_id=self.__collection_id, description=self.__description)

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

        def set_collection_id(self, collection_id):
            '''
            :type collection_id: str or None
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

        def set_title(self, title):
            '''
            :type title: str
            '''

            self.__title = title
            return self

        @property
        def title(self):
            '''
            :rtype: str
            '''

            return self.__title

        def update(self, object):
            '''
            :type institution_id: costume.api.models.institution.institution_id.InstitutionId
            :type title: str
            :type collection_id: str or None
            :type description: str or None
            '''

            if isinstance(object, Object):
                self.set_institution_id(object.institution_id)
                self.set_title(object.title)
                self.set_collection_id(object.collection_id)
                self.set_description(object.description)
            elif isinstance(object, dict):
                for key, value in object.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(object)
            return self

        @collection_id.setter
        def collection_id(self, collection_id):
            '''
            :type collection_id: str or None
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

        @title.setter
        def title(self, title):
            '''
            :type title: str
            '''

            self.set_title(title)

    def __init__(
        self,
        institution_id,
        title,
        collection_id=None,
        description=None,
    ):
        '''
        :type institution_id: costume.api.models.institution.institution_id.InstitutionId
        :type title: str
        :type collection_id: str or None
        :type description: str or None
        '''

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

        if collection_id is not None:
            if not isinstance(collection_id, basestring):
                raise TypeError("expected collection_id to be a str but it is a %s" % getattr(__builtin__, 'type')(collection_id))
        self.__collection_id = collection_id

        if description is not None:
            if not isinstance(description, basestring):
                raise TypeError("expected description to be a str but it is a %s" % getattr(__builtin__, 'type')(description))
        self.__description = description

    def __eq__(self, other):
        if self.institution_id != other.institution_id:
            return False
        if self.title != other.title:
            return False
        if self.collection_id != other.collection_id:
            return False
        if self.description != other.description:
            return False
        return True

    def __hash__(self):
        return hash((self.institution_id,self.title,self.collection_id,self.description,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('institution_id=' + repr(self.institution_id))
        field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        if self.collection_id is not None:
            field_reprs.append('collection_id=' + "'" + self.collection_id.encode('ascii', 'replace') + "'")
        if self.description is not None:
            field_reprs.append('description=' + "'" + self.description.encode('ascii', 'replace') + "'")
        return 'Object(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('institution_id=' + repr(self.institution_id))
        field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        if self.collection_id is not None:
            field_reprs.append('collection_id=' + "'" + self.collection_id.encode('ascii', 'replace') + "'")
        if self.description is not None:
            field_reprs.append('description=' + "'" + self.description.encode('ascii', 'replace') + "'")
        return 'Object(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'institution_id': self.institution_id, 'title': self.title, 'collection_id': self.collection_id, 'description': self.description}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.institution_id, self.title, self.collection_id, self.description,)

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
            elif ifield_name == 'institution_id' and ifield_id == 1:
                init_kwds['institution_id'] = costume.api.models.institution.institution_id.InstitutionId.value_of(iprot.read_string().strip().upper())
            elif ifield_name == 'title' and ifield_id == 3:
                init_kwds['title'] = iprot.read_string()
            elif ifield_name == 'collection_id' and ifield_id == 2:
                try:
                    init_kwds['collection_id'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'description' and ifield_id == 4:
                try:
                    init_kwds['description'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        institution_id=None,
        title=None,
        collection_id=None,
        description=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type institution_id: costume.api.models.institution.institution_id.InstitutionId or None
        :type title: str or None
        :type collection_id: str or None
        :type description: str or None
        :rtype: costume.api.models.object.object.Object
        '''

        if institution_id is None:
            institution_id = self.institution_id
        if title is None:
            title = self.title
        if collection_id is None:
            collection_id = self.collection_id
        if description is None:
            description = self.description
        return self.__class__(institution_id=institution_id, title=title, collection_id=collection_id, description=description)

    @property
    def title(self):
        '''
        :rtype: str
        '''

        return self.__title

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.models.object.object.Object
        '''

        oprot.write_struct_begin('Object')

        oprot.write_field_begin(name='institution_id', type=11, id=1)
        oprot.write_string(str(self.institution_id))
        oprot.write_field_end()

        oprot.write_field_begin(name='title', type=11, id=3)
        oprot.write_string(self.title)
        oprot.write_field_end()

        if self.collection_id is not None:
            oprot.write_field_begin(name='collection_id', type=11, id=2)
            oprot.write_string(self.collection_id)
            oprot.write_field_end()

        if self.description is not None:
            oprot.write_field_begin(name='description', type=11, id=4)
            oprot.write_string(self.description)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
