import __builtin__
import costume.api.models.institution.institution_id


class Collection(object):
    class Builder(object):
        def __init__(
            self,
            institution_id=None,
            title=None,
        ):
            '''
            :type institution_id: costume.api.models.institution.institution_id.InstitutionId
            :type title: str
            '''

            self.__institution_id = institution_id
            self.__title = title

        def build(self):
            return Collection(institution_id=self.__institution_id, title=self.__title)

        @property
        def institution_id(self):
            '''
            :rtype: costume.api.models.institution.institution_id.InstitutionId
            '''

            return self.__institution_id

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

        def update(self, collection):
            '''
            :type institution_id: costume.api.models.institution.institution_id.InstitutionId
            :type title: str
            '''

            if isinstance(collection, Collection):
                self.set_institution_id(collection.institution_id)
                self.set_title(collection.title)
            elif isinstance(collection, dict):
                for key, value in collection.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(collection)
            return self

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
    ):
        '''
        :type institution_id: costume.api.models.institution.institution_id.InstitutionId
        :type title: str
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

    def __eq__(self, other):
        if self.institution_id != other.institution_id:
            return False
        if self.title != other.title:
            return False
        return True

    def __hash__(self):
        return hash((self.institution_id,self.title,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('institution_id=' + repr(self.institution_id))
        field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        return 'Collection(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('institution_id=' + repr(self.institution_id))
        field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        return 'Collection(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'institution_id': self.institution_id, 'title': self.title}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.institution_id, self.title,)

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
        :rtype: costume.api.models.collection.collection.Collection
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'institution_id' and ifield_id == 1:
                init_kwds['institution_id'] = costume.api.models.institution.institution_id.InstitutionId.value_of(iprot.read_string().strip().upper())
            elif ifield_name == 'title' and ifield_id == 2:
                init_kwds['title'] = iprot.read_string()
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        institution_id=None,
        title=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type institution_id: costume.api.models.institution.institution_id.InstitutionId or None
        :type title: str or None
        :rtype: costume.api.models.collection.collection.Collection
        '''

        if institution_id is None:
            institution_id = self.institution_id
        if title is None:
            title = self.title
        return self.__class__(institution_id=institution_id, title=title)

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
        :rtype: costume.api.models.collection.collection.Collection
        '''

        oprot.write_struct_begin('Collection')

        oprot.write_field_begin(name='institution_id', type=11, id=1)
        oprot.write_string(str(self.institution_id))
        oprot.write_field_end()

        oprot.write_field_begin(name='title', type=11, id=2)
        oprot.write_string(self.title)
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
