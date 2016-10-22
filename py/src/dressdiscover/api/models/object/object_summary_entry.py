import __builtin__
import dressdiscover.api.models.object.object_id
import dressdiscover.api.models.object.object_summary


class ObjectSummaryEntry(object):
    class Builder(object):
        def __init__(
            self,
            id=None,  # @ReservedAssignment
            model=None,
        ):
            '''
            :type id: str
            :type model: dressdiscover.api.models.object.object_summary.ObjectSummary
            '''

            self.__id = id
            self.__model = model

        def build(self):
            return ObjectSummaryEntry(id=self.__id, model=self.__model)

        @property
        def id(self):  # @ReservedAssignment
            '''
            :rtype: str
            '''

            return self.__id

        @property
        def model(self):
            '''
            :rtype: dressdiscover.api.models.object.object_summary.ObjectSummary
            '''

            return self.__model

        def set_id(self, id):  # @ReservedAssignment
            '''
            :type id: str
            '''

            if id is None:
                raise ValueError('id is required')
            if not isinstance(id, dressdiscover.api.models.object.object_id.ObjectId):
                raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))
            self.__id = id
            return self

        def set_model(self, model):
            '''
            :type model: dressdiscover.api.models.object.object_summary.ObjectSummary
            '''

            if model is None:
                raise ValueError('model is required')
            if not isinstance(model, dressdiscover.api.models.object.object_summary.ObjectSummary):
                raise TypeError("expected model to be a dressdiscover.api.models.object.object_summary.ObjectSummary but it is a %s" % getattr(__builtin__, 'type')(model))
            self.__model = model
            return self

        def update(self, object_summary_entry):
            '''
            :type id: str
            :type model: dressdiscover.api.models.object.object_summary.ObjectSummary
            '''

            if isinstance(object_summary_entry, ObjectSummaryEntry):
                self.set_id(object_summary_entry.id)
                self.set_model(object_summary_entry.model)
            elif isinstance(object_summary_entry, dict):
                for key, value in object_summary_entry.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(object_summary_entry)
            return self

        @id.setter
        def id(self, id):  # @ReservedAssignment
            '''
            :type id: str
            '''

            self.set_id(id)

        @model.setter
        def model(self, model):
            '''
            :type model: dressdiscover.api.models.object.object_summary.ObjectSummary
            '''

            self.set_model(model)

    class FieldMetadata(object):
        ID = None
        MODEL = None

        def __init__(self, name, type_, validation):
            object.__init__(self)
            self.__name = name
            self.__type = type_
            self.__validation = validation

        def __repr__(self):
            return self.__name

        @property
        def type(self):
            return self.__type

        @property
        def validation(self):
            return self.__validation

        @classmethod
        def values(cls):
            return (cls.ID, cls.MODEL,)

    FieldMetadata.ID = FieldMetadata('id', dressdiscover.api.models.object.object_id.ObjectId, None)
    FieldMetadata.MODEL = FieldMetadata('model', dressdiscover.api.models.object.object_summary.ObjectSummary, None)

    def __init__(
        self,
        id,  # @ReservedAssignment
        model,
    ):
        '''
        :type id: str
        :type model: dressdiscover.api.models.object.object_summary.ObjectSummary
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, dressdiscover.api.models.object.object_id.ObjectId):
            raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))
        self.__id = id

        if model is None:
            raise ValueError('model is required')
        if not isinstance(model, dressdiscover.api.models.object.object_summary.ObjectSummary):
            raise TypeError("expected model to be a dressdiscover.api.models.object.object_summary.ObjectSummary but it is a %s" % getattr(__builtin__, 'type')(model))
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
        return iter((self.id, self.model,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        field_reprs.append('model=' + repr(self.model))
        return 'ObjectSummaryEntry(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        field_reprs.append('model=' + repr(self.model))
        return 'ObjectSummaryEntry(' + ', '.join(field_reprs) + ')'

    @property
    def id(self):  # @ReservedAssignment
        '''
        :rtype: str
        '''

        return self.__id

    @property
    def model(self):
        '''
        :rtype: dressdiscover.api.models.object.object_summary.ObjectSummary
        '''

        return self.__model

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.object.object_summary_entry.ObjectSummaryEntry
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'id':
                init_kwds['id'] = dressdiscover.api.models.object.object_id.ObjectId.parse(iprot.read_string())
            elif ifield_name == 'model':
                init_kwds['model'] = dressdiscover.api.models.object.object_summary.ObjectSummary.read(iprot)
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

        :type id: str or None
        :type model: dressdiscover.api.models.object.object_summary.ObjectSummary or None
        :rtype: dressdiscover.api.models.object.object_summary_entry.ObjectSummaryEntry
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
        :rtype: dressdiscover.api.models.object.object_summary_entry.ObjectSummaryEntry
        '''

        oprot.write_struct_begin('ObjectSummaryEntry')

        oprot.write_field_begin(name='id', type=11, id=None)
        oprot.write_string(self.id)
        oprot.write_field_end()

        oprot.write_field_begin(name='model', type=12, id=None)
        self.model.write(oprot)
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
