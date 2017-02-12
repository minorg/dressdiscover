from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.models.qa.question_set_id


class QuestionSet(object):
    class Builder(object):
        def __init__(
            self,
            id=None,  # @ReservedAssignment
            question_ids=None,
            title=None,
        ):
            '''
            :type id: str
            :type question_ids: tuple(str)
            :type title: str
            '''

            self.__id = id
            self.__question_ids = question_ids
            self.__title = title

        def build(self):
            return QuestionSet(id=self.__id, question_ids=self.__question_ids, title=self.__title)

        @property
        def id(self):  # @ReservedAssignment
            '''
            :rtype: str
            '''

            return self.__id

        @property
        def question_ids(self):
            '''
            :rtype: tuple(str)
            '''

            return self.__question_ids

        def set_id(self, id):  # @ReservedAssignment
            '''
            :type id: str
            '''

            if id is None:
                raise ValueError('id is required')
            if not isinstance(id, basestring):
                raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))
            self.__id = id
            return self

        def set_question_ids(self, question_ids):
            '''
            :type question_ids: tuple(str)
            '''

            if question_ids is None:
                raise ValueError('question_ids is required')
            if not (isinstance(question_ids, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), question_ids))) == 0):
                raise TypeError("expected question_ids to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(question_ids))
            if len(question_ids) < 1:
                raise ValueError("expected len(question_ids) to be >= 1, was %d" % len(question_ids))
            self.__question_ids = question_ids
            return self

        def set_title(self, title):
            '''
            :type title: str
            '''

            if title is None:
                raise ValueError('title is required')
            if not isinstance(title, basestring):
                raise TypeError("expected title to be a str but it is a %s" % getattr(__builtin__, 'type')(title))
            if title.isspace():
                raise ValueError("expected title not to be blank")
            if len(title) < 1:
                raise ValueError("expected len(title) to be >= 1, was %d" % len(title))
            self.__title = title
            return self

        @property
        def title(self):
            '''
            :rtype: str
            '''

            return self.__title

        def update(self, question_set):
            '''
            :type id: str
            :type question_ids: tuple(str)
            :type title: str
            '''

            if isinstance(question_set, QuestionSet):
                self.set_id(question_set.id)
                self.set_question_ids(question_set.question_ids)
                self.set_title(question_set.title)
            elif isinstance(question_set, dict):
                for key, value in question_set.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(question_set)
            return self

        @id.setter
        def id(self, id):  # @ReservedAssignment
            '''
            :type id: str
            '''

            self.set_id(id)

        @question_ids.setter
        def question_ids(self, question_ids):
            '''
            :type question_ids: tuple(str)
            '''

            self.set_question_ids(question_ids)

        @title.setter
        def title(self, title):
            '''
            :type title: str
            '''

            self.set_title(title)

    class FieldMetadata(object):
        ID = None
        QUESTION_IDS = None
        TITLE = None

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
            return (cls.ID, cls.QUESTION_IDS, cls.TITLE,)

    FieldMetadata.ID = FieldMetadata('id', dressdiscover.api.models.qa.question_set_id.QuestionSetId, None)
    FieldMetadata.QUESTION_IDS = FieldMetadata('question_ids', tuple, {u'minLength': 1})
    FieldMetadata.TITLE = FieldMetadata('title', str, {u'blank': False, u'minLength': 1})

    def __init__(
        self,
        id,  # @ReservedAssignment
        question_ids,
        title,
    ):
        '''
        :type id: str
        :type question_ids: tuple(str)
        :type title: str
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, basestring):
            raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))
        self.__id = id

        if question_ids is None:
            raise ValueError('question_ids is required')
        if not (isinstance(question_ids, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), question_ids))) == 0):
            raise TypeError("expected question_ids to be a tuple(str) but it is a %s" % getattr(__builtin__, 'type')(question_ids))
        if len(question_ids) < 1:
            raise ValueError("expected len(question_ids) to be >= 1, was %d" % len(question_ids))
        self.__question_ids = question_ids

        if title is None:
            raise ValueError('title is required')
        if not isinstance(title, basestring):
            raise TypeError("expected title to be a str but it is a %s" % getattr(__builtin__, 'type')(title))
        if title.isspace():
            raise ValueError("expected title not to be blank")
        if len(title) < 1:
            raise ValueError("expected len(title) to be >= 1, was %d" % len(title))
        self.__title = title

    def __eq__(self, other):
        if self.id != other.id:
            return False
        if self.question_ids != other.question_ids:
            return False
        if self.title != other.title:
            return False
        return True

    def __hash__(self):
        return hash((self.id,self.question_ids,self.title,))

    def __iter__(self):
        return iter((self.id, self.question_ids, self.title,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        field_reprs.append('question_ids=' + repr(self.question_ids))
        field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        return 'QuestionSet(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        field_reprs.append('question_ids=' + repr(self.question_ids))
        field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        return 'QuestionSet(' + ', '.join(field_reprs) + ')'

    @property
    def id(self):  # @ReservedAssignment
        '''
        :rtype: str
        '''

        return self.__id

    @property
    def question_ids(self):
        '''
        :rtype: tuple(str)
        '''

        return self.__question_ids

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.qa.question_set.QuestionSet
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'id':
                init_kwds['id'] = iprot.read_string()
            elif ifield_name == 'question_ids':
                init_kwds['question_ids'] = tuple([iprot.read_string() for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))
            elif ifield_name == 'title':
                init_kwds['title'] = iprot.read_string()
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        id=None,  # @ReservedAssignment
        question_ids=None,
        title=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type id: str or None
        :type question_ids: tuple(str) or None
        :type title: str or None
        :rtype: dressdiscover.api.models.qa.question_set.QuestionSet
        '''

        if id is None:
            id = self.id  # @ReservedAssignment
        if question_ids is None:
            question_ids = self.question_ids
        if title is None:
            title = self.title
        return self.__class__(id=id, question_ids=question_ids, title=title)

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
        :rtype: dressdiscover.api.models.qa.question_set.QuestionSet
        '''

        oprot.write_struct_begin('QuestionSet')

        oprot.write_field_begin(name='id', type=11, id=None)
        oprot.write_string(self.id)
        oprot.write_field_end()

        oprot.write_field_begin(name='question_ids', type=15, id=None)
        oprot.write_list_begin(11, len(self.question_ids))
        for _0 in self.question_ids:
            oprot.write_string(_0)
        oprot.write_list_end()
        oprot.write_field_end()

        oprot.write_field_begin(name='title', type=11, id=None)
        oprot.write_string(self.title)
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
