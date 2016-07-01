import __builtin__
import dressdiscover.api.models.object.object_query


class UserBookmark(object):
    class Builder(object):
        def __init__(
            self,
            name=None,
            user_id=None,
            folder=None,
            object_id=None,
            object_query=None,
        ):
            '''
            :type name: str
            :type user_id: str
            :type folder: str or None
            :type object_id: str or None
            :type object_query: dressdiscover.api.models.object.object_query.ObjectQuery or None
            '''

            self.__name = name
            self.__user_id = user_id
            self.__folder = folder
            self.__object_id = object_id
            self.__object_query = object_query

        def build(self):
            return UserBookmark(name=self.__name, user_id=self.__user_id, folder=self.__folder, object_id=self.__object_id, object_query=self.__object_query)

        @property
        def folder(self):
            '''
            :rtype: str
            '''

            return self.__folder

        @property
        def name(self):
            '''
            :rtype: str
            '''

            return self.__name

        @property
        def object_id(self):
            '''
            :rtype: str
            '''

            return self.__object_id

        @property
        def object_query(self):
            '''
            :rtype: dressdiscover.api.models.object.object_query.ObjectQuery
            '''

            return self.__object_query

        def set_folder(self, folder):
            '''
            :type folder: str or None
            '''

            self.__folder = folder
            return self

        def set_name(self, name):
            '''
            :type name: str
            '''

            self.__name = name
            return self

        def set_object_id(self, object_id):
            '''
            :type object_id: str or None
            '''

            self.__object_id = object_id
            return self

        def set_object_query(self, object_query):
            '''
            :type object_query: dressdiscover.api.models.object.object_query.ObjectQuery or None
            '''

            self.__object_query = object_query
            return self

        def set_user_id(self, user_id):
            '''
            :type user_id: str
            '''

            self.__user_id = user_id
            return self

        def update(self, user_bookmark):
            '''
            :type name: str
            :type user_id: str
            :type folder: str or None
            :type object_id: str or None
            :type object_query: dressdiscover.api.models.object.object_query.ObjectQuery or None
            '''

            if isinstance(user_bookmark, UserBookmark):
                self.set_name(user_bookmark.name)
                self.set_user_id(user_bookmark.user_id)
                self.set_folder(user_bookmark.folder)
                self.set_object_id(user_bookmark.object_id)
                self.set_object_query(user_bookmark.object_query)
            elif isinstance(user_bookmark, dict):
                for key, value in user_bookmark.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(user_bookmark)
            return self

        @property
        def user_id(self):
            '''
            :rtype: str
            '''

            return self.__user_id

        @folder.setter
        def folder(self, folder):
            '''
            :type folder: str or None
            '''

            self.set_folder(folder)

        @name.setter
        def name(self, name):
            '''
            :type name: str
            '''

            self.set_name(name)

        @object_id.setter
        def object_id(self, object_id):
            '''
            :type object_id: str or None
            '''

            self.set_object_id(object_id)

        @object_query.setter
        def object_query(self, object_query):
            '''
            :type object_query: dressdiscover.api.models.object.object_query.ObjectQuery or None
            '''

            self.set_object_query(object_query)

        @user_id.setter
        def user_id(self, user_id):
            '''
            :type user_id: str
            '''

            self.set_user_id(user_id)

    def __init__(
        self,
        name,
        user_id,
        folder=None,
        object_id=None,
        object_query=None,
    ):
        '''
        :type name: str
        :type user_id: str
        :type folder: str or None
        :type object_id: str or None
        :type object_query: dressdiscover.api.models.object.object_query.ObjectQuery or None
        '''

        if name is None:
            raise ValueError('name is required')
        if not isinstance(name, basestring):
            raise TypeError("expected name to be a str but it is a %s" % getattr(__builtin__, 'type')(name))
        if len(name) < 1:
            raise ValueError("expected len(name) to be >= 1, was %d" % len(name))
        self.__name = name

        if user_id is None:
            raise ValueError('user_id is required')
        if not isinstance(user_id, basestring):
            raise TypeError("expected user_id to be a str but it is a %s" % getattr(__builtin__, 'type')(user_id))
        self.__user_id = user_id

        if folder is not None:
            if not isinstance(folder, basestring):
                raise TypeError("expected folder to be a str but it is a %s" % getattr(__builtin__, 'type')(folder))
            if len(folder) < 1:
                raise ValueError("expected len(folder) to be >= 1, was %d" % len(folder))
        self.__folder = folder

        if object_id is not None:
            if not isinstance(object_id, basestring):
                raise TypeError("expected object_id to be a str but it is a %s" % getattr(__builtin__, 'type')(object_id))
        self.__object_id = object_id

        if object_query is not None:
            if not isinstance(object_query, dressdiscover.api.models.object.object_query.ObjectQuery):
                raise TypeError("expected object_query to be a dressdiscover.api.models.object.object_query.ObjectQuery but it is a %s" % getattr(__builtin__, 'type')(object_query))
        self.__object_query = object_query

    def __eq__(self, other):
        if self.name != other.name:
            return False
        if self.user_id != other.user_id:
            return False
        if self.folder != other.folder:
            return False
        if self.object_id != other.object_id:
            return False
        if self.object_query != other.object_query:
            return False
        return True

    def __hash__(self):
        return hash((self.name,self.user_id,self.folder,self.object_id,self.object_query,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('name=' + "'" + self.name.encode('ascii', 'replace') + "'")
        field_reprs.append('user_id=' + "'" + self.user_id.encode('ascii', 'replace') + "'")
        if self.folder is not None:
            field_reprs.append('folder=' + "'" + self.folder.encode('ascii', 'replace') + "'")
        if self.object_id is not None:
            field_reprs.append('object_id=' + "'" + self.object_id.encode('ascii', 'replace') + "'")
        if self.object_query is not None:
            field_reprs.append('object_query=' + repr(self.object_query))
        return 'UserBookmark(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('name=' + "'" + self.name.encode('ascii', 'replace') + "'")
        field_reprs.append('user_id=' + "'" + self.user_id.encode('ascii', 'replace') + "'")
        if self.folder is not None:
            field_reprs.append('folder=' + "'" + self.folder.encode('ascii', 'replace') + "'")
        if self.object_id is not None:
            field_reprs.append('object_id=' + "'" + self.object_id.encode('ascii', 'replace') + "'")
        if self.object_query is not None:
            field_reprs.append('object_query=' + repr(self.object_query))
        return 'UserBookmark(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'name': self.name, 'user_id': self.user_id, 'folder': self.folder, 'object_id': self.object_id, 'object_query': self.object_query}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.name, self.user_id, self.folder, self.object_id, self.object_query,)

    @property
    def folder(self):
        '''
        :rtype: str
        '''

        return self.__folder

    @property
    def name(self):
        '''
        :rtype: str
        '''

        return self.__name

    @property
    def object_id(self):
        '''
        :rtype: str
        '''

        return self.__object_id

    @property
    def object_query(self):
        '''
        :rtype: dressdiscover.api.models.object.object_query.ObjectQuery
        '''

        return self.__object_query

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.user.user_bookmark.UserBookmark
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'name':
                init_kwds['name'] = iprot.read_string()
            elif ifield_name == 'user_id':
                init_kwds['user_id'] = iprot.read_string()
            elif ifield_name == 'folder':
                try:
                    init_kwds['folder'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'object_id':
                try:
                    init_kwds['object_id'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'object_query':
                init_kwds['object_query'] = dressdiscover.api.models.object.object_query.ObjectQuery.read(iprot)
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        name=None,
        user_id=None,
        folder=None,
        object_id=None,
        object_query=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type name: str or None
        :type user_id: str or None
        :type folder: str or None
        :type object_id: str or None
        :type object_query: dressdiscover.api.models.object.object_query.ObjectQuery or None
        :rtype: dressdiscover.api.models.user.user_bookmark.UserBookmark
        '''

        if name is None:
            name = self.name
        if user_id is None:
            user_id = self.user_id
        if folder is None:
            folder = self.folder
        if object_id is None:
            object_id = self.object_id
        if object_query is None:
            object_query = self.object_query
        return self.__class__(name=name, user_id=user_id, folder=folder, object_id=object_id, object_query=object_query)

    @property
    def user_id(self):
        '''
        :rtype: str
        '''

        return self.__user_id

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.user.user_bookmark.UserBookmark
        '''

        oprot.write_struct_begin('UserBookmark')

        oprot.write_field_begin(name='name', type=11, id=None)
        oprot.write_string(self.name)
        oprot.write_field_end()

        oprot.write_field_begin(name='user_id', type=11, id=None)
        oprot.write_string(self.user_id)
        oprot.write_field_end()

        if self.folder is not None:
            oprot.write_field_begin(name='folder', type=11, id=None)
            oprot.write_string(self.folder)
            oprot.write_field_end()

        if self.object_id is not None:
            oprot.write_field_begin(name='object_id', type=11, id=None)
            oprot.write_string(self.object_id)
            oprot.write_field_end()

        if self.object_query is not None:
            oprot.write_field_begin(name='object_query', type=12, id=None)
            self.object_query.write(oprot)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
