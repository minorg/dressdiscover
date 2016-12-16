from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.vocabularies.costume_core.closure.closure_set
import dressdiscover.api.vocabularies.costume_core.color.color_set
import dressdiscover.api.vocabularies.costume_core.component.component_set
import dressdiscover.api.vocabularies.costume_core.condition.condition
import dressdiscover.api.vocabularies.costume_core.gender.gender
import dressdiscover.api.vocabularies.costume_core.structure.structure_set
import dressdiscover.api.vocabularies.costume_core.view_type.view_type


class CostumeCoreObject(object):
    class Builder(object):
        def __init__(
            self,
            closure_sets=None,
            color_sets=None,
            component_sets=None,
            condition=None,
            gender=None,
            quantity=None,
            structure_sets=None,
            view_type=None,
        ):
            '''
            :type closure_sets: tuple(dressdiscover.api.vocabularies.costume_core.closure.closure_set.ClosureSet) or None
            :type color_sets: tuple(dressdiscover.api.vocabularies.costume_core.color.color_set.ColorSet) or None
            :type component_sets: tuple(dressdiscover.api.vocabularies.costume_core.component.component_set.ComponentSet) or None
            :type condition: dressdiscover.api.vocabularies.costume_core.condition.condition.Condition or None
            :type gender: dressdiscover.api.vocabularies.costume_core.gender.gender.Gender or None
            :type quantity: int or None
            :type structure_sets: tuple(dressdiscover.api.vocabularies.costume_core.structure.structure_set.StructureSet) or None
            :type view_type: dressdiscover.api.vocabularies.costume_core.view_type.view_type.ViewType or None
            '''

            self.__closure_sets = closure_sets
            self.__color_sets = color_sets
            self.__component_sets = component_sets
            self.__condition = condition
            self.__gender = gender
            self.__quantity = quantity
            self.__structure_sets = structure_sets
            self.__view_type = view_type

        def build(self):
            return CostumeCoreObject(closure_sets=self.__closure_sets, color_sets=self.__color_sets, component_sets=self.__component_sets, condition=self.__condition, gender=self.__gender, quantity=self.__quantity, structure_sets=self.__structure_sets, view_type=self.__view_type)

        @property
        def closure_sets(self):
            '''
            :rtype: tuple(dressdiscover.api.vocabularies.costume_core.closure.closure_set.ClosureSet)
            '''

            return self.__closure_sets

        @property
        def color_sets(self):
            '''
            :rtype: tuple(dressdiscover.api.vocabularies.costume_core.color.color_set.ColorSet)
            '''

            return self.__color_sets

        @property
        def component_sets(self):
            '''
            :rtype: tuple(dressdiscover.api.vocabularies.costume_core.component.component_set.ComponentSet)
            '''

            return self.__component_sets

        @property
        def condition(self):
            '''
            :rtype: dressdiscover.api.vocabularies.costume_core.condition.condition.Condition
            '''

            return self.__condition

        @property
        def gender(self):
            '''
            :rtype: dressdiscover.api.vocabularies.costume_core.gender.gender.Gender
            '''

            return self.__gender

        @property
        def quantity(self):
            '''
            :rtype: int
            '''

            return self.__quantity

        def set_closure_sets(self, closure_sets):
            '''
            :type closure_sets: tuple(dressdiscover.api.vocabularies.costume_core.closure.closure_set.ClosureSet) or None
            '''

            if closure_sets is not None:
                if not (isinstance(closure_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.costume_core.closure.closure_set.ClosureSet), closure_sets))) == 0):
                    raise TypeError("expected closure_sets to be a tuple(dressdiscover.api.vocabularies.costume_core.closure.closure_set.ClosureSet) but it is a %s" % getattr(__builtin__, 'type')(closure_sets))
                if len(closure_sets) < 1:
                    raise ValueError("expected len(closure_sets) to be >= 1, was %d" % len(closure_sets))
            self.__closure_sets = closure_sets
            return self

        def set_color_sets(self, color_sets):
            '''
            :type color_sets: tuple(dressdiscover.api.vocabularies.costume_core.color.color_set.ColorSet) or None
            '''

            if color_sets is not None:
                if not (isinstance(color_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.costume_core.color.color_set.ColorSet), color_sets))) == 0):
                    raise TypeError("expected color_sets to be a tuple(dressdiscover.api.vocabularies.costume_core.color.color_set.ColorSet) but it is a %s" % getattr(__builtin__, 'type')(color_sets))
                if len(color_sets) < 1:
                    raise ValueError("expected len(color_sets) to be >= 1, was %d" % len(color_sets))
            self.__color_sets = color_sets
            return self

        def set_component_sets(self, component_sets):
            '''
            :type component_sets: tuple(dressdiscover.api.vocabularies.costume_core.component.component_set.ComponentSet) or None
            '''

            if component_sets is not None:
                if not (isinstance(component_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.costume_core.component.component_set.ComponentSet), component_sets))) == 0):
                    raise TypeError("expected component_sets to be a tuple(dressdiscover.api.vocabularies.costume_core.component.component_set.ComponentSet) but it is a %s" % getattr(__builtin__, 'type')(component_sets))
                if len(component_sets) < 1:
                    raise ValueError("expected len(component_sets) to be >= 1, was %d" % len(component_sets))
            self.__component_sets = component_sets
            return self

        def set_condition(self, condition):
            '''
            :type condition: dressdiscover.api.vocabularies.costume_core.condition.condition.Condition or None
            '''

            if condition is not None:
                if not isinstance(condition, dressdiscover.api.vocabularies.costume_core.condition.condition.Condition):
                    raise TypeError("expected condition to be a dressdiscover.api.vocabularies.costume_core.condition.condition.Condition but it is a %s" % getattr(__builtin__, 'type')(condition))
            self.__condition = condition
            return self

        def set_gender(self, gender):
            '''
            :type gender: dressdiscover.api.vocabularies.costume_core.gender.gender.Gender or None
            '''

            if gender is not None:
                if not isinstance(gender, dressdiscover.api.vocabularies.costume_core.gender.gender.Gender):
                    raise TypeError("expected gender to be a dressdiscover.api.vocabularies.costume_core.gender.gender.Gender but it is a %s" % getattr(__builtin__, 'type')(gender))
            self.__gender = gender
            return self

        def set_quantity(self, quantity):
            '''
            :type quantity: int or None
            '''

            if quantity is not None:
                if not isinstance(quantity, int):
                    raise TypeError("expected quantity to be a int but it is a %s" % getattr(__builtin__, 'type')(quantity))
                if quantity < 1:
                    raise ValueError("expected quantity to be >= 1, was %s" % quantity)
            self.__quantity = quantity
            return self

        def set_structure_sets(self, structure_sets):
            '''
            :type structure_sets: tuple(dressdiscover.api.vocabularies.costume_core.structure.structure_set.StructureSet) or None
            '''

            if structure_sets is not None:
                if not (isinstance(structure_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.costume_core.structure.structure_set.StructureSet), structure_sets))) == 0):
                    raise TypeError("expected structure_sets to be a tuple(dressdiscover.api.vocabularies.costume_core.structure.structure_set.StructureSet) but it is a %s" % getattr(__builtin__, 'type')(structure_sets))
                if len(structure_sets) < 1:
                    raise ValueError("expected len(structure_sets) to be >= 1, was %d" % len(structure_sets))
            self.__structure_sets = structure_sets
            return self

        def set_view_type(self, view_type):
            '''
            :type view_type: dressdiscover.api.vocabularies.costume_core.view_type.view_type.ViewType or None
            '''

            if view_type is not None:
                if not isinstance(view_type, dressdiscover.api.vocabularies.costume_core.view_type.view_type.ViewType):
                    raise TypeError("expected view_type to be a dressdiscover.api.vocabularies.costume_core.view_type.view_type.ViewType but it is a %s" % getattr(__builtin__, 'type')(view_type))
            self.__view_type = view_type
            return self

        @property
        def structure_sets(self):
            '''
            :rtype: tuple(dressdiscover.api.vocabularies.costume_core.structure.structure_set.StructureSet)
            '''

            return self.__structure_sets

        def update(self, costume_core_object):
            '''
            :type closure_sets: tuple(dressdiscover.api.vocabularies.costume_core.closure.closure_set.ClosureSet) or None
            :type color_sets: tuple(dressdiscover.api.vocabularies.costume_core.color.color_set.ColorSet) or None
            :type component_sets: tuple(dressdiscover.api.vocabularies.costume_core.component.component_set.ComponentSet) or None
            :type condition: dressdiscover.api.vocabularies.costume_core.condition.condition.Condition or None
            :type gender: dressdiscover.api.vocabularies.costume_core.gender.gender.Gender or None
            :type quantity: int or None
            :type structure_sets: tuple(dressdiscover.api.vocabularies.costume_core.structure.structure_set.StructureSet) or None
            :type view_type: dressdiscover.api.vocabularies.costume_core.view_type.view_type.ViewType or None
            '''

            if isinstance(costume_core_object, CostumeCoreObject):
                self.set_closure_sets(costume_core_object.closure_sets)
                self.set_color_sets(costume_core_object.color_sets)
                self.set_component_sets(costume_core_object.component_sets)
                self.set_condition(costume_core_object.condition)
                self.set_gender(costume_core_object.gender)
                self.set_quantity(costume_core_object.quantity)
                self.set_structure_sets(costume_core_object.structure_sets)
                self.set_view_type(costume_core_object.view_type)
            elif isinstance(costume_core_object, dict):
                for key, value in costume_core_object.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(costume_core_object)
            return self

        @property
        def view_type(self):
            '''
            :rtype: dressdiscover.api.vocabularies.costume_core.view_type.view_type.ViewType
            '''

            return self.__view_type

        @closure_sets.setter
        def closure_sets(self, closure_sets):
            '''
            :type closure_sets: tuple(dressdiscover.api.vocabularies.costume_core.closure.closure_set.ClosureSet) or None
            '''

            self.set_closure_sets(closure_sets)

        @color_sets.setter
        def color_sets(self, color_sets):
            '''
            :type color_sets: tuple(dressdiscover.api.vocabularies.costume_core.color.color_set.ColorSet) or None
            '''

            self.set_color_sets(color_sets)

        @component_sets.setter
        def component_sets(self, component_sets):
            '''
            :type component_sets: tuple(dressdiscover.api.vocabularies.costume_core.component.component_set.ComponentSet) or None
            '''

            self.set_component_sets(component_sets)

        @condition.setter
        def condition(self, condition):
            '''
            :type condition: dressdiscover.api.vocabularies.costume_core.condition.condition.Condition or None
            '''

            self.set_condition(condition)

        @gender.setter
        def gender(self, gender):
            '''
            :type gender: dressdiscover.api.vocabularies.costume_core.gender.gender.Gender or None
            '''

            self.set_gender(gender)

        @quantity.setter
        def quantity(self, quantity):
            '''
            :type quantity: int or None
            '''

            self.set_quantity(quantity)

        @structure_sets.setter
        def structure_sets(self, structure_sets):
            '''
            :type structure_sets: tuple(dressdiscover.api.vocabularies.costume_core.structure.structure_set.StructureSet) or None
            '''

            self.set_structure_sets(structure_sets)

        @view_type.setter
        def view_type(self, view_type):
            '''
            :type view_type: dressdiscover.api.vocabularies.costume_core.view_type.view_type.ViewType or None
            '''

            self.set_view_type(view_type)

    class FieldMetadata(object):
        CLOSURE_SETS = None
        COLOR_SETS = None
        COMPONENT_SETS = None
        CONDITION = None
        GENDER = None
        QUANTITY = None
        STRUCTURE_SETS = None
        VIEW_TYPE = None

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
            return (cls.CLOSURE_SETS, cls.COLOR_SETS, cls.COMPONENT_SETS, cls.CONDITION, cls.GENDER, cls.QUANTITY, cls.STRUCTURE_SETS, cls.VIEW_TYPE,)

    FieldMetadata.CLOSURE_SETS = FieldMetadata('closure_sets', tuple, {u'minLength': 1})
    FieldMetadata.COLOR_SETS = FieldMetadata('color_sets', tuple, {u'minLength': 1})
    FieldMetadata.COMPONENT_SETS = FieldMetadata('component_sets', tuple, {u'minLength': 1})
    FieldMetadata.CONDITION = FieldMetadata('condition', dressdiscover.api.vocabularies.costume_core.condition.condition.Condition, None)
    FieldMetadata.GENDER = FieldMetadata('gender', dressdiscover.api.vocabularies.costume_core.gender.gender.Gender, None)
    FieldMetadata.QUANTITY = FieldMetadata('quantity', int, {u'min': 1})
    FieldMetadata.STRUCTURE_SETS = FieldMetadata('structure_sets', tuple, {u'minLength': 1})
    FieldMetadata.VIEW_TYPE = FieldMetadata('view_type', dressdiscover.api.vocabularies.costume_core.view_type.view_type.ViewType, None)

    def __init__(
        self,
        closure_sets=None,
        color_sets=None,
        component_sets=None,
        condition=None,
        gender=None,
        quantity=None,
        structure_sets=None,
        view_type=None,
    ):
        '''
        :type closure_sets: tuple(dressdiscover.api.vocabularies.costume_core.closure.closure_set.ClosureSet) or None
        :type color_sets: tuple(dressdiscover.api.vocabularies.costume_core.color.color_set.ColorSet) or None
        :type component_sets: tuple(dressdiscover.api.vocabularies.costume_core.component.component_set.ComponentSet) or None
        :type condition: dressdiscover.api.vocabularies.costume_core.condition.condition.Condition or None
        :type gender: dressdiscover.api.vocabularies.costume_core.gender.gender.Gender or None
        :type quantity: int or None
        :type structure_sets: tuple(dressdiscover.api.vocabularies.costume_core.structure.structure_set.StructureSet) or None
        :type view_type: dressdiscover.api.vocabularies.costume_core.view_type.view_type.ViewType or None
        '''

        if closure_sets is not None:
            if not (isinstance(closure_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.costume_core.closure.closure_set.ClosureSet), closure_sets))) == 0):
                raise TypeError("expected closure_sets to be a tuple(dressdiscover.api.vocabularies.costume_core.closure.closure_set.ClosureSet) but it is a %s" % getattr(__builtin__, 'type')(closure_sets))
            if len(closure_sets) < 1:
                raise ValueError("expected len(closure_sets) to be >= 1, was %d" % len(closure_sets))
        self.__closure_sets = closure_sets

        if color_sets is not None:
            if not (isinstance(color_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.costume_core.color.color_set.ColorSet), color_sets))) == 0):
                raise TypeError("expected color_sets to be a tuple(dressdiscover.api.vocabularies.costume_core.color.color_set.ColorSet) but it is a %s" % getattr(__builtin__, 'type')(color_sets))
            if len(color_sets) < 1:
                raise ValueError("expected len(color_sets) to be >= 1, was %d" % len(color_sets))
        self.__color_sets = color_sets

        if component_sets is not None:
            if not (isinstance(component_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.costume_core.component.component_set.ComponentSet), component_sets))) == 0):
                raise TypeError("expected component_sets to be a tuple(dressdiscover.api.vocabularies.costume_core.component.component_set.ComponentSet) but it is a %s" % getattr(__builtin__, 'type')(component_sets))
            if len(component_sets) < 1:
                raise ValueError("expected len(component_sets) to be >= 1, was %d" % len(component_sets))
        self.__component_sets = component_sets

        if condition is not None:
            if not isinstance(condition, dressdiscover.api.vocabularies.costume_core.condition.condition.Condition):
                raise TypeError("expected condition to be a dressdiscover.api.vocabularies.costume_core.condition.condition.Condition but it is a %s" % getattr(__builtin__, 'type')(condition))
        self.__condition = condition

        if gender is not None:
            if not isinstance(gender, dressdiscover.api.vocabularies.costume_core.gender.gender.Gender):
                raise TypeError("expected gender to be a dressdiscover.api.vocabularies.costume_core.gender.gender.Gender but it is a %s" % getattr(__builtin__, 'type')(gender))
        self.__gender = gender

        if quantity is not None:
            if not isinstance(quantity, int):
                raise TypeError("expected quantity to be a int but it is a %s" % getattr(__builtin__, 'type')(quantity))
            if quantity < 1:
                raise ValueError("expected quantity to be >= 1, was %s" % quantity)
        self.__quantity = quantity

        if structure_sets is not None:
            if not (isinstance(structure_sets, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.vocabularies.costume_core.structure.structure_set.StructureSet), structure_sets))) == 0):
                raise TypeError("expected structure_sets to be a tuple(dressdiscover.api.vocabularies.costume_core.structure.structure_set.StructureSet) but it is a %s" % getattr(__builtin__, 'type')(structure_sets))
            if len(structure_sets) < 1:
                raise ValueError("expected len(structure_sets) to be >= 1, was %d" % len(structure_sets))
        self.__structure_sets = structure_sets

        if view_type is not None:
            if not isinstance(view_type, dressdiscover.api.vocabularies.costume_core.view_type.view_type.ViewType):
                raise TypeError("expected view_type to be a dressdiscover.api.vocabularies.costume_core.view_type.view_type.ViewType but it is a %s" % getattr(__builtin__, 'type')(view_type))
        self.__view_type = view_type

    def __eq__(self, other):
        if self.closure_sets != other.closure_sets:
            return False
        if self.color_sets != other.color_sets:
            return False
        if self.component_sets != other.component_sets:
            return False
        if self.condition != other.condition:
            return False
        if self.gender != other.gender:
            return False
        if self.quantity != other.quantity:
            return False
        if self.structure_sets != other.structure_sets:
            return False
        if self.view_type != other.view_type:
            return False
        return True

    def __hash__(self):
        return hash((self.closure_sets,self.color_sets,self.component_sets,self.condition,self.gender,self.quantity,self.structure_sets,self.view_type,))

    def __iter__(self):
        return iter((self.closure_sets, self.color_sets, self.component_sets, self.condition, self.gender, self.quantity, self.structure_sets, self.view_type,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.closure_sets is not None:
            field_reprs.append('closure_sets=' + repr(self.closure_sets))
        if self.color_sets is not None:
            field_reprs.append('color_sets=' + repr(self.color_sets))
        if self.component_sets is not None:
            field_reprs.append('component_sets=' + repr(self.component_sets))
        if self.condition is not None:
            field_reprs.append('condition=' + repr(self.condition))
        if self.gender is not None:
            field_reprs.append('gender=' + repr(self.gender))
        if self.quantity is not None:
            field_reprs.append('quantity=' + repr(self.quantity))
        if self.structure_sets is not None:
            field_reprs.append('structure_sets=' + repr(self.structure_sets))
        if self.view_type is not None:
            field_reprs.append('view_type=' + repr(self.view_type))
        return 'CostumeCoreObject(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.closure_sets is not None:
            field_reprs.append('closure_sets=' + repr(self.closure_sets))
        if self.color_sets is not None:
            field_reprs.append('color_sets=' + repr(self.color_sets))
        if self.component_sets is not None:
            field_reprs.append('component_sets=' + repr(self.component_sets))
        if self.condition is not None:
            field_reprs.append('condition=' + repr(self.condition))
        if self.gender is not None:
            field_reprs.append('gender=' + repr(self.gender))
        if self.quantity is not None:
            field_reprs.append('quantity=' + repr(self.quantity))
        if self.structure_sets is not None:
            field_reprs.append('structure_sets=' + repr(self.structure_sets))
        if self.view_type is not None:
            field_reprs.append('view_type=' + repr(self.view_type))
        return 'CostumeCoreObject(' + ', '.join(field_reprs) + ')'

    @property
    def closure_sets(self):
        '''
        :rtype: tuple(dressdiscover.api.vocabularies.costume_core.closure.closure_set.ClosureSet)
        '''

        return self.__closure_sets

    @property
    def color_sets(self):
        '''
        :rtype: tuple(dressdiscover.api.vocabularies.costume_core.color.color_set.ColorSet)
        '''

        return self.__color_sets

    @property
    def component_sets(self):
        '''
        :rtype: tuple(dressdiscover.api.vocabularies.costume_core.component.component_set.ComponentSet)
        '''

        return self.__component_sets

    @property
    def condition(self):
        '''
        :rtype: dressdiscover.api.vocabularies.costume_core.condition.condition.Condition
        '''

        return self.__condition

    @property
    def gender(self):
        '''
        :rtype: dressdiscover.api.vocabularies.costume_core.gender.gender.Gender
        '''

        return self.__gender

    @property
    def quantity(self):
        '''
        :rtype: int
        '''

        return self.__quantity

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.vocabularies.costume_core.costume_core_object.CostumeCoreObject
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'closure_sets' and ifield_id == 1:
                init_kwds['closure_sets'] = tuple([dressdiscover.api.vocabularies.costume_core.closure.closure_set.ClosureSet.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'color_sets' and ifield_id == 2:
                init_kwds['color_sets'] = tuple([dressdiscover.api.vocabularies.costume_core.color.color_set.ColorSet.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'component_sets' and ifield_id == 3:
                init_kwds['component_sets'] = tuple([dressdiscover.api.vocabularies.costume_core.component.component_set.ComponentSet.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'condition' and ifield_id == 4:
                try:
                    init_kwds['condition'] = dressdiscover.api.vocabularies.costume_core.condition.condition.Condition.value_of(iprot.read_string().strip().upper())
                except (TypeError,):
                    pass
            elif ifield_name == 'gender' and ifield_id == 5:
                try:
                    init_kwds['gender'] = dressdiscover.api.vocabularies.costume_core.gender.gender.Gender.value_of(iprot.read_string().strip().upper())
                except (TypeError,):
                    pass
            elif ifield_name == 'quantity' and ifield_id == 8:
                try:
                    init_kwds['quantity'] = iprot.read_i32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'structure_sets' and ifield_id == 6:
                init_kwds['structure_sets'] = tuple([dressdiscover.api.vocabularies.costume_core.structure.structure_set.StructureSet.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'view_type' and ifield_id == 7:
                try:
                    init_kwds['view_type'] = dressdiscover.api.vocabularies.costume_core.view_type.view_type.ViewType.value_of(iprot.read_string().strip().upper())
                except (TypeError,):
                    pass
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        closure_sets=None,
        color_sets=None,
        component_sets=None,
        condition=None,
        gender=None,
        quantity=None,
        structure_sets=None,
        view_type=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type closure_sets: tuple(dressdiscover.api.vocabularies.costume_core.closure.closure_set.ClosureSet) or None
        :type color_sets: tuple(dressdiscover.api.vocabularies.costume_core.color.color_set.ColorSet) or None
        :type component_sets: tuple(dressdiscover.api.vocabularies.costume_core.component.component_set.ComponentSet) or None
        :type condition: dressdiscover.api.vocabularies.costume_core.condition.condition.Condition or None
        :type gender: dressdiscover.api.vocabularies.costume_core.gender.gender.Gender or None
        :type quantity: int or None
        :type structure_sets: tuple(dressdiscover.api.vocabularies.costume_core.structure.structure_set.StructureSet) or None
        :type view_type: dressdiscover.api.vocabularies.costume_core.view_type.view_type.ViewType or None
        :rtype: dressdiscover.api.vocabularies.costume_core.costume_core_object.CostumeCoreObject
        '''

        if closure_sets is None:
            closure_sets = self.closure_sets
        if color_sets is None:
            color_sets = self.color_sets
        if component_sets is None:
            component_sets = self.component_sets
        if condition is None:
            condition = self.condition
        if gender is None:
            gender = self.gender
        if quantity is None:
            quantity = self.quantity
        if structure_sets is None:
            structure_sets = self.structure_sets
        if view_type is None:
            view_type = self.view_type
        return self.__class__(closure_sets=closure_sets, color_sets=color_sets, component_sets=component_sets, condition=condition, gender=gender, quantity=quantity, structure_sets=structure_sets, view_type=view_type)

    @property
    def structure_sets(self):
        '''
        :rtype: tuple(dressdiscover.api.vocabularies.costume_core.structure.structure_set.StructureSet)
        '''

        return self.__structure_sets

    @property
    def view_type(self):
        '''
        :rtype: dressdiscover.api.vocabularies.costume_core.view_type.view_type.ViewType
        '''

        return self.__view_type

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.vocabularies.costume_core.costume_core_object.CostumeCoreObject
        '''

        oprot.write_struct_begin('CostumeCoreObject')

        if self.closure_sets is not None:
            oprot.write_field_begin(name='closure_sets', type=15, id=1)
            oprot.write_list_begin(12, len(self.closure_sets))
            for _0 in self.closure_sets:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.color_sets is not None:
            oprot.write_field_begin(name='color_sets', type=15, id=2)
            oprot.write_list_begin(12, len(self.color_sets))
            for _0 in self.color_sets:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.component_sets is not None:
            oprot.write_field_begin(name='component_sets', type=15, id=3)
            oprot.write_list_begin(12, len(self.component_sets))
            for _0 in self.component_sets:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.condition is not None:
            oprot.write_field_begin(name='condition', type=11, id=4)
            oprot.write_string(str(self.condition))
            oprot.write_field_end()

        if self.gender is not None:
            oprot.write_field_begin(name='gender', type=11, id=5)
            oprot.write_string(str(self.gender))
            oprot.write_field_end()

        if self.quantity is not None:
            oprot.write_field_begin(name='quantity', type=8, id=8)
            oprot.write_i32(self.quantity)
            oprot.write_field_end()

        if self.structure_sets is not None:
            oprot.write_field_begin(name='structure_sets', type=15, id=6)
            oprot.write_list_begin(12, len(self.structure_sets))
            for _0 in self.structure_sets:
                _0.write(oprot)
            oprot.write_list_end()
            oprot.write_field_end()

        if self.view_type is not None:
            oprot.write_field_begin(name='view_type', type=11, id=7)
            oprot.write_string(str(self.view_type))
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
