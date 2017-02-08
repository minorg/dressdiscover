from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.models.qa.qa_image
import dressdiscover.api.models.qa.qa_object_id


class QaObject(object):
    class Builder(object):
        def __init__(
            self,
            id=None,  # @ReservedAssignment
            image=None,
            question_set_ids=None,
        ):
            '''
            :type id: str
            :type image: dressdiscover.api.models.qa.qa_image.QaImage
            :type question_set_ids: frozenset(str)
            '''

            self.__id = id
            self.__image = image
            self.__question_set_ids = question_set_ids

        def build(self):
            return QaObject(id=self.__id, image=self.__image, question_set_ids=self.__question_set_ids)

        @property
        def id(self):  # @ReservedAssignment
            '''
            :rtype: str
            '''

            return self.__id

        @property
        def image(self):
            '''
            :rtype: dressdiscover.api.models.qa.qa_image.QaImage
            '''

            return self.__image

        @property
        def question_set_ids(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__question_set_ids

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

        def set_image(self, image):
            '''
            :type image: dressdiscover.api.models.qa.qa_image.QaImage
            '''

            if image is None:
                raise ValueError('image is required')
            if not isinstance(image, dressdiscover.api.models.qa.qa_image.QaImage):
                raise TypeError("expected image to be a dressdiscover.api.models.qa.qa_image.QaImage but it is a %s" % getattr(__builtin__, 'type')(image))
            self.__image = image
            return self

        def set_question_set_ids(self, question_set_ids):
            '''
            :type question_set_ids: frozenset(str)
            '''

            if question_set_ids is None:
                raise ValueError('question_set_ids is required')
            if not (isinstance(question_set_ids, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), question_set_ids))) == 0):
                raise TypeError("expected question_set_ids to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(question_set_ids))
            self.__question_set_ids = question_set_ids
            return self

        def update(self, qa_object):
            '''
            :type id: str
            :type image: dressdiscover.api.models.qa.qa_image.QaImage
            :type question_set_ids: frozenset(str)
            '''

            if isinstance(qa_object, QaObject):
                self.set_id(qa_object.id)
                self.set_image(qa_object.image)
                self.set_question_set_ids(qa_object.question_set_ids)
            elif isinstance(qa_object, dict):
                for key, value in qa_object.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(qa_object)
            return self

        @id.setter
        def id(self, id):  # @ReservedAssignment
            '''
            :type id: str
            '''

            self.set_id(id)

        @image.setter
        def image(self, image):
            '''
            :type image: dressdiscover.api.models.qa.qa_image.QaImage
            '''

            self.set_image(image)

        @question_set_ids.setter
        def question_set_ids(self, question_set_ids):
            '''
            :type question_set_ids: frozenset(str)
            '''

            self.set_question_set_ids(question_set_ids)

    class FieldMetadata(object):
        ID = None
        IMAGE = None
        QUESTION_SET_IDS = None

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
            return (cls.ID, cls.IMAGE, cls.QUESTION_SET_IDS,)

    FieldMetadata.ID = FieldMetadata('id', dressdiscover.api.models.qa.qa_object_id.QaObjectId, None)
    FieldMetadata.IMAGE = FieldMetadata('image', dressdiscover.api.models.qa.qa_image.QaImage, None)
    FieldMetadata.QUESTION_SET_IDS = FieldMetadata('question_set_ids', frozenset, None)

    def __init__(
        self,
        id,  # @ReservedAssignment
        image,
        question_set_ids,
    ):
        '''
        :type id: str
        :type image: dressdiscover.api.models.qa.qa_image.QaImage
        :type question_set_ids: frozenset(str)
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, basestring):
            raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))
        self.__id = id

        if image is None:
            raise ValueError('image is required')
        if not isinstance(image, dressdiscover.api.models.qa.qa_image.QaImage):
            raise TypeError("expected image to be a dressdiscover.api.models.qa.qa_image.QaImage but it is a %s" % getattr(__builtin__, 'type')(image))
        self.__image = image

        if question_set_ids is None:
            raise ValueError('question_set_ids is required')
        if not (isinstance(question_set_ids, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), question_set_ids))) == 0):
            raise TypeError("expected question_set_ids to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(question_set_ids))
        self.__question_set_ids = question_set_ids

    def __eq__(self, other):
        if self.id != other.id:
            return False
        if self.image != other.image:
            return False
        if self.question_set_ids != other.question_set_ids:
            return False
        return True

    def __hash__(self):
        return hash((self.id,self.image,self.question_set_ids,))

    def __iter__(self):
        return iter((self.id, self.image, self.question_set_ids,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        field_reprs.append('image=' + repr(self.image))
        field_reprs.append('question_set_ids=' + repr(self.question_set_ids))
        return 'QaObject(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        field_reprs.append('image=' + repr(self.image))
        field_reprs.append('question_set_ids=' + repr(self.question_set_ids))
        return 'QaObject(' + ', '.join(field_reprs) + ')'

    @property
    def id(self):  # @ReservedAssignment
        '''
        :rtype: str
        '''

        return self.__id

    @property
    def image(self):
        '''
        :rtype: dressdiscover.api.models.qa.qa_image.QaImage
        '''

        return self.__image

    @property
    def question_set_ids(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__question_set_ids

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.qa.qa_object.QaObject
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'id':
                init_kwds['id'] = iprot.read_string()
            elif ifield_name == 'image':
                init_kwds['image'] = dressdiscover.api.models.qa.qa_image.QaImage.read(iprot)
            elif ifield_name == 'question_set_ids':
                init_kwds['question_set_ids'] = frozenset([iprot.read_string() for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        id=None,  # @ReservedAssignment
        image=None,
        question_set_ids=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type id: str or None
        :type image: dressdiscover.api.models.qa.qa_image.QaImage or None
        :type question_set_ids: frozenset(str) or None
        :rtype: dressdiscover.api.models.qa.qa_object.QaObject
        '''

        if id is None:
            id = self.id  # @ReservedAssignment
        if image is None:
            image = self.image
        if question_set_ids is None:
            question_set_ids = self.question_set_ids
        return self.__class__(id=id, image=image, question_set_ids=question_set_ids)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.qa.qa_object.QaObject
        '''

        oprot.write_struct_begin('QaObject')

        oprot.write_field_begin(name='id', type=11, id=None)
        oprot.write_string(self.id)
        oprot.write_field_end()

        oprot.write_field_begin(name='image', type=12, id=None)
        self.image.write(oprot)
        oprot.write_field_end()

        oprot.write_field_begin(name='question_set_ids', type=14, id=None)
        oprot.write_set_begin(11, len(self.question_set_ids))
        for _0 in self.question_set_ids:
            oprot.write_string(_0)
        oprot.write_set_end()
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
