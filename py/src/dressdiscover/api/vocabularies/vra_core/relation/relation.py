from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.vocabularies.vra_core.relation.relation_type


class Relation(object):
    class Builder(object):
        def __init__(
            self,
            type=None,  # @ReservedAssignment
            href=None,
            relids=None,
            text=None,
        ):
            '''
            :type type: dressdiscover.api.vocabularies.vra_core.relation.relation_type.RelationType
            :type href: str or None
            :type relids: frozenset(str) or None
            :type text: str or None
            '''

            self.__type = type
            self.__href = href
            self.__relids = relids
            self.__text = text

        def build(self):
            return Relation(type=self.__type, href=self.__href, relids=self.__relids, text=self.__text)

        @property
        def href(self):
            '''
            :rtype: str
            '''

            return self.__href

        @property
        def relids(self):
            '''
            :rtype: frozenset(str)
            '''

            return self.__relids

        def set_href(self, href):
            '''
            :type href: str or None
            '''

            if href is not None:
                if not isinstance(href, basestring):
                    raise TypeError("expected href to be a str but it is a %s" % getattr(__builtin__, 'type')(href))
            self.__href = href
            return self

        def set_relids(self, relids):
            '''
            :type relids: frozenset(str) or None
            '''

            if relids is not None:
                if not (isinstance(relids, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), relids))) == 0):
                    raise TypeError("expected relids to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(relids))
                if len(relids) < 1:
                    raise ValueError("expected len(relids) to be >= 1, was %d" % len(relids))
            self.__relids = relids
            return self

        def set_text(self, text):
            '''
            :type text: str or None
            '''

            if text is not None:
                if not isinstance(text, basestring):
                    raise TypeError("expected text to be a str but it is a %s" % getattr(__builtin__, 'type')(text))
                if len(text) < 1:
                    raise ValueError("expected len(text) to be >= 1, was %d" % len(text))
            self.__text = text
            return self

        def set_type(self, type):  # @ReservedAssignment
            '''
            :type type: dressdiscover.api.vocabularies.vra_core.relation.relation_type.RelationType
            '''

            if type is None:
                raise ValueError('type is required')
            if not isinstance(type, dressdiscover.api.vocabularies.vra_core.relation.relation_type.RelationType):
                raise TypeError("expected type to be a dressdiscover.api.vocabularies.vra_core.relation.relation_type.RelationType but it is a %s" % getattr(__builtin__, 'type')(type))
            self.__type = type
            return self

        @property
        def text(self):
            '''
            :rtype: str
            '''

            return self.__text

        @property
        def type(self):  # @ReservedAssignment
            '''
            :rtype: dressdiscover.api.vocabularies.vra_core.relation.relation_type.RelationType
            '''

            return self.__type

        def update(self, relation):
            '''
            :type type: dressdiscover.api.vocabularies.vra_core.relation.relation_type.RelationType
            :type href: str or None
            :type relids: frozenset(str) or None
            :type text: str or None
            '''

            if isinstance(relation, Relation):
                self.set_type(relation.type)
                self.set_href(relation.href)
                self.set_relids(relation.relids)
                self.set_text(relation.text)
            elif isinstance(relation, dict):
                for key, value in relation.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(relation)
            return self

        @href.setter
        def href(self, href):
            '''
            :type href: str or None
            '''

            self.set_href(href)

        @relids.setter
        def relids(self, relids):
            '''
            :type relids: frozenset(str) or None
            '''

            self.set_relids(relids)

        @text.setter
        def text(self, text):
            '''
            :type text: str or None
            '''

            self.set_text(text)

        @type.setter
        def type(self, type):  # @ReservedAssignment
            '''
            :type type: dressdiscover.api.vocabularies.vra_core.relation.relation_type.RelationType
            '''

            self.set_type(type)

    class FieldMetadata(object):
        TYPE = None
        HREF = None
        RELIDS = None
        TEXT = None

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
            return (cls.TYPE, cls.HREF, cls.RELIDS, cls.TEXT,)

    FieldMetadata.TYPE = FieldMetadata('type', dressdiscover.api.vocabularies.vra_core.relation.relation_type.RelationType, None)
    FieldMetadata.HREF = FieldMetadata('href', str, None)
    FieldMetadata.RELIDS = FieldMetadata('relids', frozenset, {u'minLength': 1})
    FieldMetadata.TEXT = FieldMetadata('text', str, {u'minLength': 1})

    def __init__(
        self,
        type,  # @ReservedAssignment
        href=None,
        relids=None,
        text=None,
    ):
        '''
        :type type: dressdiscover.api.vocabularies.vra_core.relation.relation_type.RelationType
        :type href: str or None
        :type relids: frozenset(str) or None
        :type text: str or None
        '''

        if type is None:
            raise ValueError('type is required')
        if not isinstance(type, dressdiscover.api.vocabularies.vra_core.relation.relation_type.RelationType):
            raise TypeError("expected type to be a dressdiscover.api.vocabularies.vra_core.relation.relation_type.RelationType but it is a %s" % getattr(__builtin__, 'type')(type))
        self.__type = type

        if href is not None:
            if not isinstance(href, basestring):
                raise TypeError("expected href to be a str but it is a %s" % getattr(__builtin__, 'type')(href))
        self.__href = href

        if relids is not None:
            if not (isinstance(relids, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), relids))) == 0):
                raise TypeError("expected relids to be a frozenset(str) but it is a %s" % getattr(__builtin__, 'type')(relids))
            if len(relids) < 1:
                raise ValueError("expected len(relids) to be >= 1, was %d" % len(relids))
        self.__relids = relids

        if text is not None:
            if not isinstance(text, basestring):
                raise TypeError("expected text to be a str but it is a %s" % getattr(__builtin__, 'type')(text))
            if len(text) < 1:
                raise ValueError("expected len(text) to be >= 1, was %d" % len(text))
        self.__text = text

    def __eq__(self, other):
        if self.type != other.type:
            return False
        if self.href != other.href:
            return False
        if self.relids != other.relids:
            return False
        if self.text != other.text:
            return False
        return True

    def __hash__(self):
        return hash((self.type,self.href,self.relids,self.text,))

    def __iter__(self):
        return iter((self.type, self.href, self.relids, self.text,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('type=' + repr(self.type))
        if self.href is not None:
            field_reprs.append('href=' + "'" + self.href.encode('ascii', 'replace') + "'")
        if self.relids is not None:
            field_reprs.append('relids=' + repr(self.relids))
        if self.text is not None:
            field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        return 'Relation(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('type=' + repr(self.type))
        if self.href is not None:
            field_reprs.append('href=' + "'" + self.href.encode('ascii', 'replace') + "'")
        if self.relids is not None:
            field_reprs.append('relids=' + repr(self.relids))
        if self.text is not None:
            field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        return 'Relation(' + ', '.join(field_reprs) + ')'

    @property
    def href(self):
        '''
        :rtype: str
        '''

        return self.__href

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.vocabularies.vra_core.relation.relation.Relation
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'type' and ifield_id == 1:
                init_kwds['type'] = dressdiscover.api.vocabularies.vra_core.relation.relation_type.RelationType.value_of(iprot.read_string().strip().upper())
            elif ifield_name == 'href' and ifield_id == 2:
                try:
                    init_kwds['href'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'relids' and ifield_id == 3:
                init_kwds['relids'] = frozenset([dressdiscover.api.models.object.ObjectId.parse(iprot.read_string()) for _ in xrange(iprot.read_set_begin()[1])] + (iprot.read_set_end() is None and []))
            elif ifield_name == 'text' and ifield_id == 4:
                try:
                    init_kwds['text'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    @property
    def relids(self):
        '''
        :rtype: frozenset(str)
        '''

        return self.__relids

    def replace(
        self,
        type=None,  # @ReservedAssignment
        href=None,
        relids=None,
        text=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type type: dressdiscover.api.vocabularies.vra_core.relation.relation_type.RelationType or None
        :type href: str or None
        :type relids: frozenset(str) or None
        :type text: str or None
        :rtype: dressdiscover.api.vocabularies.vra_core.relation.relation.Relation
        '''

        if type is None:
            type = self.type  # @ReservedAssignment
        if href is None:
            href = self.href
        if relids is None:
            relids = self.relids
        if text is None:
            text = self.text
        return self.__class__(type=type, href=href, relids=relids, text=text)

    @property
    def text(self):
        '''
        :rtype: str
        '''

        return self.__text

    @property
    def type(self):  # @ReservedAssignment
        '''
        :rtype: dressdiscover.api.vocabularies.vra_core.relation.relation_type.RelationType
        '''

        return self.__type

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.vocabularies.vra_core.relation.relation.Relation
        '''

        oprot.write_struct_begin('Relation')

        oprot.write_field_begin(name='type', type=11, id=1)
        oprot.write_string(str(self.type))
        oprot.write_field_end()

        if self.href is not None:
            oprot.write_field_begin(name='href', type=11, id=2)
            oprot.write_string(self.href)
            oprot.write_field_end()

        if self.relids is not None:
            oprot.write_field_begin(name='relids', type=14, id=3)
            oprot.write_set_begin(11, len(self.relids))
            for _0 in self.relids:
                oprot.write_string(_0)
            oprot.write_set_end()
            oprot.write_field_end()

        if self.text is not None:
            oprot.write_field_begin(name='text', type=11, id=4)
            oprot.write_string(self.text)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
