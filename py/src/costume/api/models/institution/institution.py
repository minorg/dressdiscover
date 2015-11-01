import __builtin__


class Institution(object):
    class Builder(object):
        def __init__(
            self,
            title=None,
        ):
            '''
            :type title: str
            '''

            self.__title = title

        def build(self):
            return Institution(title=self.__title)

        def set_title(self, title):
            '''
            :type title: str
            '''

            self.__title = title
            return self

        @property
        def title(self):
            '''
            :rtype: str
            '''

            return self.__title

        def update(self, institution):
            '''
            :type title: str
            '''

            if isinstance(institution, Institution):
                self.set_title(institution.title)
            elif isinstance(institution, dict):
                for key, value in institution.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(institution)
            return self

        @title.setter
        def title(self, title):
            '''
            :type title: str
            '''

            self.set_title(title)

    def __init__(
        self,
        title,
    ):
        '''
        :type title: str
        '''

        if title is None:
            raise ValueError('title is required')
        if not isinstance(title, basestring):
            raise TypeError("expected title to be a str but it is a %s" % getattr(__builtin__, 'type')(title))
        if len(title) < 1:
            raise ValueError("expected len(title) to be >= 1, was %d" % len(title))
        self.__title = title

    def __eq__(self, other):
        if self.title != other.title:
            return False
        return True

    def __hash__(self):
        return hash(self.title)

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        return 'Institution(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        return 'Institution(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'title': self.title}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.title,)

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: costume.api.models.institution.institution.Institution
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'title' and ifield_id == 1:
                init_kwds['title'] = iprot.read_string()
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        title=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type title: str or None
        :rtype: costume.api.models.institution.institution.Institution
        '''

        if title is None:
            title = self.title
        return self.__class__(title=title)

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
        :rtype: costume.api.models.institution.institution.Institution
        '''

        oprot.write_struct_begin('Institution')

        oprot.write_field_begin(name='title', type=11, id=1)
        oprot.write_string(self.title)
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
