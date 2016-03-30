from itertools import ifilterfalse
import __builtin__
import costume.api.models.subject.subject_term


class Subject(object):
    class Builder(object):
        def __init__(
            self,
            terms=None,
        ):
            '''
            :type terms: tuple(costume.api.models.subject.subject_term.SubjectTerm)
            '''

            self.__terms = terms

        def build(self):
            return Subject(terms=self.__terms)

        def set_terms(self, terms):
            '''
            :type terms: tuple(costume.api.models.subject.subject_term.SubjectTerm)
            '''

            self.__terms = terms
            return self

        @property
        def terms(self):
            '''
            :rtype: tuple(costume.api.models.subject.subject_term.SubjectTerm)
            '''

            return self.__terms

        def update(self, subject):
            '''
            :type terms: tuple(costume.api.models.subject.subject_term.SubjectTerm)
            '''

            if isinstance(subject, Subject):
                self.set_terms(subject.terms)
            elif isinstance(subject, dict):
                for key, value in subject.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(subject)
            return self

        @terms.setter
        def terms(self, terms):
            '''
            :type terms: tuple(costume.api.models.subject.subject_term.SubjectTerm)
            '''

            self.set_terms(terms)

    def __init__(
        self,
        terms,
    ):
        '''
        :type terms: tuple(costume.api.models.subject.subject_term.SubjectTerm)
        '''

        if terms is None:
            raise ValueError('terms is required')
        if not (isinstance(terms, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, costume.api.models.subject.subject_term.SubjectTerm), terms))) == 0):
            raise TypeError("expected terms to be a tuple(costume.api.models.subject.subject_term.SubjectTerm) but it is a %s" % getattr(__builtin__, 'type')(terms))
        if len(terms) < 1:
            raise ValueError("expected len(terms) to be >= 1, was %d" % len(terms))
        self.__terms = terms

    def __eq__(self, other):
        if self.terms != other.terms:
            return False
        return True

    def __hash__(self):
        return hash(self.terms)

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('terms=' + repr(self.terms))
        return 'Subject(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('terms=' + repr(self.terms))
        return 'Subject(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'terms': self.terms}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.terms,)

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: costume.api.models.subject.subject.Subject
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'terms' and ifield_id == 1:
                init_kwds['terms'] = tuple([costume.api.models.subject.subject_term.SubjectTerm.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        terms=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type terms: tuple(costume.api.models.subject.subject_term.SubjectTerm) or None
        :rtype: costume.api.models.subject.subject.Subject
        '''

        if terms is None:
            terms = self.terms
        return self.__class__(terms=terms)

    @property
    def terms(self):
        '''
        :rtype: tuple(costume.api.models.subject.subject_term.SubjectTerm)
        '''

        return self.__terms

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.models.subject.subject.Subject
        '''

        oprot.write_struct_begin('Subject')

        oprot.write_field_begin(name='terms', type=15, id=1)
        oprot.write_list_begin(12, len(self.terms))
        for _0 in self.terms:
            _0.write(oprot)
        oprot.write_list_end()
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
