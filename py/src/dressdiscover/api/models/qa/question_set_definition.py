from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.models.qa.question_definition


class QuestionSetDefinition(object):
    class Builder(object):
        def __init__(
            self,
            features=None,
        ):
            '''
            :type features: tuple(dressdiscover.api.models.qa.question_definition.QuestionDefinition)
            '''

            self.__features = features

        def build(self):
            return QuestionSetDefinition(features=self.__features)

        @property
        def features(self):
            '''
            :rtype: tuple(dressdiscover.api.models.qa.question_definition.QuestionDefinition)
            '''

            return self.__features

        def set_features(self, features):
            '''
            :type features: tuple(dressdiscover.api.models.qa.question_definition.QuestionDefinition)
            '''

            if features is None:
                raise ValueError('features is required')
            if not (isinstance(features, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.qa.question_definition.QuestionDefinition), features))) == 0):
                raise TypeError("expected features to be a tuple(dressdiscover.api.models.qa.question_definition.QuestionDefinition) but it is a %s" % getattr(__builtin__, 'type')(features))
            if len(features) < 1:
                raise ValueError("expected len(features) to be >= 1, was %d" % len(features))
            self.__features = features
            return self

        def update(self, question_set_definition):
            '''
            :type features: tuple(dressdiscover.api.models.qa.question_definition.QuestionDefinition)
            '''

            if isinstance(question_set_definition, QuestionSetDefinition):
                self.set_features(question_set_definition.features)
            elif isinstance(question_set_definition, dict):
                for key, value in question_set_definition.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(question_set_definition)
            return self

        @features.setter
        def features(self, features):
            '''
            :type features: tuple(dressdiscover.api.models.qa.question_definition.QuestionDefinition)
            '''

            self.set_features(features)

    class FieldMetadata(object):
        FEATURES = None

        def __init__(self, name, type_, validation):
            object.__init__(self)
            self.__name = name
            self.__type = type_
            self.__validation = validation

        @property
        def name(self):
            return self.__name

        def __repr__(self):
            return self.__name

        def __str__(self):
            return self.__name

        @property
        def type(self):
            return self.__type

        @property
        def validation(self):
            return self.__validation

        @classmethod
        def values(cls):
            return (cls.FEATURES,)

    FieldMetadata.FEATURES = FieldMetadata('features', tuple, {u'minLength': 1})

    def __init__(
        self,
        features,
    ):
        '''
        :type features: tuple(dressdiscover.api.models.qa.question_definition.QuestionDefinition)
        '''

        if features is None:
            raise ValueError('features is required')
        if not (isinstance(features, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, dressdiscover.api.models.qa.question_definition.QuestionDefinition), features))) == 0):
            raise TypeError("expected features to be a tuple(dressdiscover.api.models.qa.question_definition.QuestionDefinition) but it is a %s" % getattr(__builtin__, 'type')(features))
        if len(features) < 1:
            raise ValueError("expected len(features) to be >= 1, was %d" % len(features))
        self.__features = features

    def __eq__(self, other):
        if self.features != other.features:
            return False
        return True

    def __hash__(self):
        return hash(self.features)

    def __iter__(self):
        return iter((self.features,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('features=' + repr(self.features))
        return 'QuestionSetDefinition(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('features=' + repr(self.features))
        return 'QuestionSetDefinition(' + ', '.join(field_reprs) + ')'

    @property
    def features(self):
        '''
        :rtype: tuple(dressdiscover.api.models.qa.question_definition.QuestionDefinition)
        '''

        return self.__features

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.qa.question_set_definition.QuestionSetDefinition
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'features':
                init_kwds['features'] = tuple([dressdiscover.api.models.qa.question_definition.QuestionDefinition.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        features=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type features: tuple(dressdiscover.api.models.qa.question_definition.QuestionDefinition) or None
        :rtype: dressdiscover.api.models.qa.question_set_definition.QuestionSetDefinition
        '''

        if features is None:
            features = self.features
        return self.__class__(features=features)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.qa.question_set_definition.QuestionSetDefinition
        '''

        oprot.write_struct_begin('QuestionSetDefinition')

        oprot.write_field_begin(name='features', type=15, id=None)
        oprot.write_list_begin(12, len(self.features))
        for _0 in self.features:
            _0.write(oprot)
        oprot.write_list_end()
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
