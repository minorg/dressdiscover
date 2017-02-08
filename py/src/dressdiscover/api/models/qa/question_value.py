import __builtin__
import dressdiscover.api.models.qa.qa_image
import dressdiscover.api.models.qa.question_value_id


class QuestionValue(object):
    class Builder(object):
        def __init__(
            self,
            id=None,  # @ReservedAssignment
            text=None,
            image=None,
        ):
            '''
            :type id: str
            :type text: str
            :type image: dressdiscover.api.models.qa.qa_image.QaImage or None
            '''

            self.__id = id
            self.__text = text
            self.__image = image

        def build(self):
            return QuestionValue(id=self.__id, text=self.__text, image=self.__image)

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
            :type image: dressdiscover.api.models.qa.qa_image.QaImage or None
            '''

            if image is not None:
                if not isinstance(image, dressdiscover.api.models.qa.qa_image.QaImage):
                    raise TypeError("expected image to be a dressdiscover.api.models.qa.qa_image.QaImage but it is a %s" % getattr(__builtin__, 'type')(image))
            self.__image = image
            return self

        def set_text(self, text):
            '''
            :type text: str
            '''

            if text is None:
                raise ValueError('text is required')
            if not isinstance(text, basestring):
                raise TypeError("expected text to be a str but it is a %s" % getattr(__builtin__, 'type')(text))
            if text.isspace():
                raise ValueError("expected text not to be blank")
            if len(text) < 1:
                raise ValueError("expected len(text) to be >= 1, was %d" % len(text))
            self.__text = text
            return self

        @property
        def text(self):
            '''
            :rtype: str
            '''

            return self.__text

        def update(self, question_value):
            '''
            :type id: str
            :type text: str
            :type image: dressdiscover.api.models.qa.qa_image.QaImage or None
            '''

            if isinstance(question_value, QuestionValue):
                self.set_id(question_value.id)
                self.set_text(question_value.text)
                self.set_image(question_value.image)
            elif isinstance(question_value, dict):
                for key, value in question_value.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(question_value)
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
            :type image: dressdiscover.api.models.qa.qa_image.QaImage or None
            '''

            self.set_image(image)

        @text.setter
        def text(self, text):
            '''
            :type text: str
            '''

            self.set_text(text)

    class FieldMetadata(object):
        ID = None
        TEXT = None
        IMAGE = None

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
            return (cls.ID, cls.TEXT, cls.IMAGE,)

    FieldMetadata.ID = FieldMetadata('id', dressdiscover.api.models.qa.question_value_id.QuestionValueId, None)
    FieldMetadata.TEXT = FieldMetadata('text', str, {u'blank': False, u'minLength': 1})
    FieldMetadata.IMAGE = FieldMetadata('image', dressdiscover.api.models.qa.qa_image.QaImage, None)

    def __init__(
        self,
        id,  # @ReservedAssignment
        text,
        image=None,
    ):
        '''
        :type id: str
        :type text: str
        :type image: dressdiscover.api.models.qa.qa_image.QaImage or None
        '''

        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, basestring):
            raise TypeError("expected id to be a str but it is a %s" % getattr(__builtin__, 'type')(id))
        self.__id = id

        if text is None:
            raise ValueError('text is required')
        if not isinstance(text, basestring):
            raise TypeError("expected text to be a str but it is a %s" % getattr(__builtin__, 'type')(text))
        if text.isspace():
            raise ValueError("expected text not to be blank")
        if len(text) < 1:
            raise ValueError("expected len(text) to be >= 1, was %d" % len(text))
        self.__text = text

        if image is not None:
            if not isinstance(image, dressdiscover.api.models.qa.qa_image.QaImage):
                raise TypeError("expected image to be a dressdiscover.api.models.qa.qa_image.QaImage but it is a %s" % getattr(__builtin__, 'type')(image))
        self.__image = image

    def __eq__(self, other):
        if self.id != other.id:
            return False
        if self.text != other.text:
            return False
        if self.image != other.image:
            return False
        return True

    def __hash__(self):
        return hash((self.id,self.text,self.image,))

    def __iter__(self):
        return iter((self.id, self.text, self.image,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        if self.image is not None:
            field_reprs.append('image=' + repr(self.image))
        return 'QuestionValue(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        if self.image is not None:
            field_reprs.append('image=' + repr(self.image))
        return 'QuestionValue(' + ', '.join(field_reprs) + ')'

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

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.qa.question_value.QuestionValue
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'id':
                init_kwds['id'] = iprot.read_string()
            elif ifield_name == 'text':
                init_kwds['text'] = iprot.read_string()
            elif ifield_name == 'image':
                init_kwds['image'] = dressdiscover.api.models.qa.qa_image.QaImage.read(iprot)
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        id=None,  # @ReservedAssignment
        text=None,
        image=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type id: str or None
        :type text: str or None
        :type image: dressdiscover.api.models.qa.qa_image.QaImage or None
        :rtype: dressdiscover.api.models.qa.question_value.QuestionValue
        '''

        if id is None:
            id = self.id  # @ReservedAssignment
        if text is None:
            text = self.text
        if image is None:
            image = self.image
        return self.__class__(id=id, text=text, image=image)

    @property
    def text(self):
        '''
        :rtype: str
        '''

        return self.__text

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.qa.question_value.QuestionValue
        '''

        oprot.write_struct_begin('QuestionValue')

        oprot.write_field_begin(name='id', type=11, id=None)
        oprot.write_string(self.id)
        oprot.write_field_end()

        oprot.write_field_begin(name='text', type=11, id=None)
        oprot.write_string(self.text)
        oprot.write_field_end()

        if self.image is not None:
            oprot.write_field_begin(name='image', type=12, id=None)
            self.image.write(oprot)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
