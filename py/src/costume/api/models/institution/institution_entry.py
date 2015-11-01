import __builtin__
import costume.api.models.institution.institution
import costume.api.models.institution.institution_id


class InstitutionEntry(object):
    class Builder(object):
        def __init__(
            self,
            id=None,  # @ReservedAssignment
            model=None,
        ):
            '''
            :type id: costume.api.models.institution.institution_id.InstitutionId
            :type model: costume.api.models.institution.institution.Institution
            '''

            self.__id = id
            self.__model = model

        def build(self):
            return InstitutionEntry(id=self.__id, model=self.__model)

        @property
        def id(self):  # @ReservedAssignment
            '''
            :rtype: costume.api.models.institution.institution_id.InstitutionId
            '''

            return self.__id

        @property
        def model(self):
            '''
            :rtype: costume.api.models.institution.institution.Institution
            '''

            return self.__model

        def set_id(self, id):  # @ReservedAssignment
            '''
            :type id: costume.api.models.institution.institution_id.InstitutionId
            '''

            self.__id = id
            return self

        def set_model(self, model):
            '''
            :type model: costume.api.models.institution.institution.Institution
            '''

            self.__model = model
            return self

        def update(self, institution_entry):
            '''
            :type id: costume.api.models.institution.institution_id.InstitutionId
            :type model: costume.api.models.institution.institution.Institution
            '''

            if isinstance(institution_entry, InstitutionEntry):
                self.set_id(institution_entry.id)
                self.set_model(institution_entry.model)
            elif isinstance(institution_entry, dict):
                for key, value in institution_entry.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(institution_entry)
            return self

        @id.setter
        def id(self, id):  # @ReservedAssignment
            '''
            :type id: costume.api.models.institution.institution_id.InstitutionId
            '''

            self.set_id(id)

        @model.setter
        def model(self, model):
            '''
            :type model: costume.api.models.institution.institution.Institution
            '''

            self.set_model(model)

    def __init__(
        self,
        id,  # @ReservedAssignment
        model,
    ):
        '''
        :type id: costume.api.models.institution.institution_id.InstitutionId
        :type model: costume.api.models.institution.institution.Institution
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, costume.api.models.institution.institution_id.InstitutionId):
            raise TypeError("expected id to be a costume.api.models.institution.institution_id.InstitutionId but it is a %s" % getattr(__builtin__, 'type')(id))
        self.__id = id

        if model is None:
            raise ValueError('model is required')
        if not isinstance(model, costume.api.models.institution.institution.Institution):
            raise TypeError("expected model to be a costume.api.models.institution.institution.Institution but it is a %s" % getattr(__builtin__, 'type')(model))
        self.__model = model

    def __eq__(self, other):
        if self.id != other.id:
            return False
        if self.model != other.model:
            return False
        return True

    def __hash__(self):
        return hash((self.id,self.model,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('id=' + repr(self.id))
        field_reprs.append('model=' + repr(self.model))
        return 'InstitutionEntry(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('id=' + repr(self.id))
        field_reprs.append('model=' + repr(self.model))
        return 'InstitutionEntry(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'id': self.id, 'model': self.model}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.id, self.model,)

    @property
    def id(self):  # @ReservedAssignment
        '''
        :rtype: costume.api.models.institution.institution_id.InstitutionId
        '''

        return self.__id

    @property
    def model(self):
        '''
        :rtype: costume.api.models.institution.institution.Institution
        '''

        return self.__model

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: costume.api.models.institution.institution_entry.InstitutionEntry
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'id':
                init_kwds['id'] = costume.api.models.institution.institution_id.InstitutionId.value_of(iprot.read_string().strip().upper())
            elif ifield_name == 'model':
                init_kwds['model'] = costume.api.models.institution.institution.Institution.read(iprot)
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        id=None,  # @ReservedAssignment
        model=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type id: costume.api.models.institution.institution_id.InstitutionId or None
        :type model: costume.api.models.institution.institution.Institution or None
        :rtype: costume.api.models.institution.institution_entry.InstitutionEntry
        '''

        if id is None:
            id = self.id  # @ReservedAssignment
        if model is None:
            model = self.model
        return self.__class__(id=id, model=model)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.models.institution.institution_entry.InstitutionEntry
        '''

        oprot.write_struct_begin('InstitutionEntry')

        oprot.write_field_begin(name='id', type=11, id=None)
        oprot.write_string(str(self.id))
        oprot.write_field_end()

        oprot.write_field_begin(name='model', type=12, id=None)
        self.model.write(oprot)
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
