import __builtin__
import costume.api.models.sort_order
import costume.api.services.object.object_sort_field


class ObjectSort(object):
    class Builder(object):
        def __init__(
            self,
            field=None,
            order=None,
        ):
            '''
            :type field: costume.api.services.object.object_sort_field.ObjectSortField
            :type order: costume.api.models.sort_order.SortOrder
            '''

            self.__field = field
            self.__order = order

        def build(self):
            return ObjectSort(field=self.__field, order=self.__order)

        @property
        def field(self):
            '''
            :rtype: costume.api.services.object.object_sort_field.ObjectSortField
            '''

            return self.__field

        @property
        def order(self):
            '''
            :rtype: costume.api.models.sort_order.SortOrder
            '''

            return self.__order

        def set_field(self, field):
            '''
            :type field: costume.api.services.object.object_sort_field.ObjectSortField
            '''

            self.__field = field
            return self

        def set_order(self, order):
            '''
            :type order: costume.api.models.sort_order.SortOrder
            '''

            self.__order = order
            return self

        def update(self, object_sort):
            '''
            :type field: costume.api.services.object.object_sort_field.ObjectSortField
            :type order: costume.api.models.sort_order.SortOrder
            '''

            if isinstance(object_sort, ObjectSort):
                self.set_field(object_sort.field)
                self.set_order(object_sort.order)
            elif isinstance(object_sort, dict):
                for key, value in object_sort.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(object_sort)
            return self

        @field.setter
        def field(self, field):
            '''
            :type field: costume.api.services.object.object_sort_field.ObjectSortField
            '''

            self.set_field(field)

        @order.setter
        def order(self, order):
            '''
            :type order: costume.api.models.sort_order.SortOrder
            '''

            self.set_order(order)

    def __init__(
        self,
        field,
        order,
    ):
        '''
        :type field: costume.api.services.object.object_sort_field.ObjectSortField
        :type order: costume.api.models.sort_order.SortOrder
        '''

        if field is None:
            raise ValueError('field is required')
        if not isinstance(field, costume.api.services.object.object_sort_field.ObjectSortField):
            raise TypeError("expected field to be a costume.api.services.object.object_sort_field.ObjectSortField but it is a %s" % getattr(__builtin__, 'type')(field))
        self.__field = field

        if order is None:
            raise ValueError('order is required')
        if not isinstance(order, costume.api.models.sort_order.SortOrder):
            raise TypeError("expected order to be a costume.api.models.sort_order.SortOrder but it is a %s" % getattr(__builtin__, 'type')(order))
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
        return 'ObjectSort(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('field=' + repr(self.field))
        field_reprs.append('order=' + repr(self.order))
        return 'ObjectSort(' + ', '.join(field_reprs) + ')'

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
        :rtype: costume.api.services.object.object_sort_field.ObjectSortField
        '''

        return self.__field

    @property
    def order(self):
        '''
        :rtype: costume.api.models.sort_order.SortOrder
        '''

        return self.__order

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: costume.api.services.object.object_sort.ObjectSort
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'field':
                init_kwds['field'] = costume.api.services.object.object_sort_field.ObjectSortField.value_of(iprot.read_string().strip().upper())
            elif ifield_name == 'order':
                init_kwds['order'] = costume.api.models.sort_order.SortOrder.value_of(iprot.read_string().strip().upper())
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

        :type field: costume.api.services.object.object_sort_field.ObjectSortField or None
        :type order: costume.api.models.sort_order.SortOrder or None
        :rtype: costume.api.services.object.object_sort.ObjectSort
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
        :rtype: costume.api.services.object.object_sort.ObjectSort
        '''

        oprot.write_struct_begin('ObjectSort')

        oprot.write_field_begin(name='field', type=11, id=None)
        oprot.write_string(str(self.field))
        oprot.write_field_end()

        oprot.write_field_begin(name='order', type=11, id=None)
        oprot.write_string(str(self.order))
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
