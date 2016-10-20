import __builtin__
import dressdiscover.api.models.sort_order
import dressdiscover.api.services.object.object_summary_sort_field


class ObjectSummarySort(object):
    class Builder(object):
        def __init__(
            self,
            field=None,
            order=None,
        ):
            '''
            :type field: dressdiscover.api.services.object.object_summary_sort_field.ObjectSummarySortField
            :type order: dressdiscover.api.models.sort_order.SortOrder
            '''

            self.__field = field
            self.__order = order

        def build(self):
            return ObjectSummarySort(field=self.__field, order=self.__order)

        @property
        def field(self):
            '''
            :rtype: dressdiscover.api.services.object.object_summary_sort_field.ObjectSummarySortField
            '''

            return self.__field

        @property
        def order(self):
            '''
            :rtype: dressdiscover.api.models.sort_order.SortOrder
            '''

            return self.__order

        def set_field(self, field):
            '''
            :type field: dressdiscover.api.services.object.object_summary_sort_field.ObjectSummarySortField
            '''

            if field is None:
                raise ValueError('field is required')
            if not isinstance(field, dressdiscover.api.services.object.object_summary_sort_field.ObjectSummarySortField):
                raise TypeError("expected field to be a dressdiscover.api.services.object.object_summary_sort_field.ObjectSummarySortField but it is a %s" % getattr(__builtin__, 'type')(field))
            self.__field = field
            return self

        def set_order(self, order):
            '''
            :type order: dressdiscover.api.models.sort_order.SortOrder
            '''

            if order is None:
                raise ValueError('order is required')
            if not isinstance(order, dressdiscover.api.models.sort_order.SortOrder):
                raise TypeError("expected order to be a dressdiscover.api.models.sort_order.SortOrder but it is a %s" % getattr(__builtin__, 'type')(order))
            self.__order = order
            return self

        def update(self, object_summary_sort):
            '''
            :type field: dressdiscover.api.services.object.object_summary_sort_field.ObjectSummarySortField
            :type order: dressdiscover.api.models.sort_order.SortOrder
            '''

            if isinstance(object_summary_sort, ObjectSummarySort):
                self.set_field(object_summary_sort.field)
                self.set_order(object_summary_sort.order)
            elif isinstance(object_summary_sort, dict):
                for key, value in object_summary_sort.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(object_summary_sort)
            return self

        @field.setter
        def field(self, field):
            '''
            :type field: dressdiscover.api.services.object.object_summary_sort_field.ObjectSummarySortField
            '''

            self.set_field(field)

        @order.setter
        def order(self, order):
            '''
            :type order: dressdiscover.api.models.sort_order.SortOrder
            '''

            self.set_order(order)

    class FieldMetadata(object):
        FIELD = None
        ORDER = None

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
            return (cls.FIELD, cls.ORDER,)

    FieldMetadata.FIELD = FieldMetadata('field', dressdiscover.api.services.object.object_summary_sort_field.ObjectSummarySortField, None)
    FieldMetadata.ORDER = FieldMetadata('order', dressdiscover.api.models.sort_order.SortOrder, None)

    def __init__(
        self,
        field,
        order,
    ):
        '''
        :type field: dressdiscover.api.services.object.object_summary_sort_field.ObjectSummarySortField
        :type order: dressdiscover.api.models.sort_order.SortOrder
        '''

        if field is None:
            raise ValueError('field is required')
        if not isinstance(field, dressdiscover.api.services.object.object_summary_sort_field.ObjectSummarySortField):
            raise TypeError("expected field to be a dressdiscover.api.services.object.object_summary_sort_field.ObjectSummarySortField but it is a %s" % getattr(__builtin__, 'type')(field))
        self.__field = field

        if order is None:
            raise ValueError('order is required')
        if not isinstance(order, dressdiscover.api.models.sort_order.SortOrder):
            raise TypeError("expected order to be a dressdiscover.api.models.sort_order.SortOrder but it is a %s" % getattr(__builtin__, 'type')(order))
        self.__order = order

    def __eq__(self, other):
        if self.field != other.field:
            return False
        if self.order != other.order:
            return False
        return True

    def __hash__(self):
        return hash((self.field,self.order,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('field=' + repr(self.field))
        field_reprs.append('order=' + repr(self.order))
        return 'ObjectSummarySort(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('field=' + repr(self.field))
        field_reprs.append('order=' + repr(self.order))
        return 'ObjectSummarySort(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'field': self.field, 'order': self.order}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.field, self.order,)

    @property
    def field(self):
        '''
        :rtype: dressdiscover.api.services.object.object_summary_sort_field.ObjectSummarySortField
        '''

        return self.__field

    @property
    def order(self):
        '''
        :rtype: dressdiscover.api.models.sort_order.SortOrder
        '''

        return self.__order

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.services.object.object_summary_sort.ObjectSummarySort
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'field':
                init_kwds['field'] = dressdiscover.api.services.object.object_summary_sort_field.ObjectSummarySortField.value_of(iprot.read_string().strip().upper())
            elif ifield_name == 'order':
                init_kwds['order'] = dressdiscover.api.models.sort_order.SortOrder.value_of(iprot.read_string().strip().upper())
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        field=None,
        order=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type field: dressdiscover.api.services.object.object_summary_sort_field.ObjectSummarySortField or None
        :type order: dressdiscover.api.models.sort_order.SortOrder or None
        :rtype: dressdiscover.api.services.object.object_summary_sort.ObjectSummarySort
        '''

        if field is None:
            field = self.field
        if order is None:
            order = self.order
        return self.__class__(field=field, order=order)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.services.object.object_summary_sort.ObjectSummarySort
        '''

        oprot.write_struct_begin('ObjectSummarySort')

        oprot.write_field_begin(name='field', type=11, id=None)
        oprot.write_string(str(self.field))
        oprot.write_field_end()

        oprot.write_field_begin(name='order', type=11, id=None)
        oprot.write_string(str(self.order))
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
