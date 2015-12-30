import __builtin__
import costume.api.models.component.component_term
import costume.api.models.structure.structure_set


class Component(object):
    class Builder(object):
        def __init__(
            self,
            term=None,
            structures=None,
        ):
            '''
            :type term: costume.api.models.component.component_term.ComponentTerm
            :type structures: costume.api.models.structure.structure_set.StructureSet or None
            '''

            self.__term = term
            self.__structures = structures

        def build(self):
            return Component(term=self.__term, structures=self.__structures)

        def set_structures(self, structures):
            '''
            :type structures: costume.api.models.structure.structure_set.StructureSet or None
            '''

            self.__structures = structures
            return self

        def set_term(self, term):
            '''
            :type term: costume.api.models.component.component_term.ComponentTerm
            '''

            self.__term = term
            return self

        @property
        def structures(self):
            '''
            :rtype: costume.api.models.structure.structure_set.StructureSet
            '''

            return self.__structures

        @property
        def term(self):
            '''
            :rtype: costume.api.models.component.component_term.ComponentTerm
            '''

            return self.__term

        def update(self, component):
            '''
            :type term: costume.api.models.component.component_term.ComponentTerm
            :type structures: costume.api.models.structure.structure_set.StructureSet or None
            '''

            if isinstance(component, Component):
                self.set_term(component.term)
                self.set_structures(component.structures)
            elif isinstance(component, dict):
                for key, value in component.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(component)
            return self

        @structures.setter
        def structures(self, structures):
            '''
            :type structures: costume.api.models.structure.structure_set.StructureSet or None
            '''

            self.set_structures(structures)

        @term.setter
        def term(self, term):
            '''
            :type term: costume.api.models.component.component_term.ComponentTerm
            '''

            self.set_term(term)

    def __init__(
        self,
        term,
        structures=None,
    ):
        '''
        :type term: costume.api.models.component.component_term.ComponentTerm
        :type structures: costume.api.models.structure.structure_set.StructureSet or None
        '''

        if term is None:
            raise ValueError('term is required')
        if not isinstance(term, costume.api.models.component.component_term.ComponentTerm):
            raise TypeError("expected term to be a costume.api.models.component.component_term.ComponentTerm but it is a %s" % getattr(__builtin__, 'type')(term))
        self.__term = term

        if structures is not None:
            if not isinstance(structures, costume.api.models.structure.structure_set.StructureSet):
                raise TypeError("expected structures to be a costume.api.models.structure.structure_set.StructureSet but it is a %s" % getattr(__builtin__, 'type')(structures))
        self.__structures = structures

    def __eq__(self, other):
        if self.term != other.term:
            return False
        if self.structures != other.structures:
            return False
        return True

    def __hash__(self):
        return hash((self.term,self.structures,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('term=' + repr(self.term))
        if self.structures is not None:
            field_reprs.append('structures=' + repr(self.structures))
        return 'Component(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('term=' + repr(self.term))
        if self.structures is not None:
            field_reprs.append('structures=' + repr(self.structures))
        return 'Component(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'term': self.term, 'structures': self.structures}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.term, self.structures,)

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: costume.api.models.component.component.Component
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'term' and ifield_id == 1:
                init_kwds['term'] = costume.api.models.component.component_term.ComponentTerm.read(iprot)
            elif ifield_name == 'structures' and ifield_id == 2:
                init_kwds['structures'] = costume.api.models.structure.structure_set.StructureSet.read(iprot)
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        term=None,
        structures=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type term: costume.api.models.component.component_term.ComponentTerm or None
        :type structures: costume.api.models.structure.structure_set.StructureSet or None
        :rtype: costume.api.models.component.component.Component
        '''

        if term is None:
            term = self.term
        if structures is None:
            structures = self.structures
        return self.__class__(term=term, structures=structures)

    @property
    def structures(self):
        '''
        :rtype: costume.api.models.structure.structure_set.StructureSet
        '''

        return self.__structures

    @property
    def term(self):
        '''
        :rtype: costume.api.models.component.component_term.ComponentTerm
        '''

        return self.__term

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.models.component.component.Component
        '''

        oprot.write_struct_begin('Component')

        oprot.write_field_begin(name='term', type=12, id=1)
        self.term.write(oprot)
        oprot.write_field_end()

        if self.structures is not None:
            oprot.write_field_begin(name='structures', type=12, id=2)
            self.structures.write(oprot)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
