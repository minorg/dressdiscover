import __builtin__


class UserBookmark(object):
    class Builder(object):
        def __init__(
            self,
            object_id=None,
            user_id=None,
            folder=None,
        ):
            '''
            :type object_id: str
            :type user_id: str
            :type folder: str or None
            '''

            self.__object_id = object_id
            self.__user_id = user_id
            self.__folder = folder

        def build(self):
            return UserBookmark(object_id=self.__object_id, user_id=self.__user_id, folder=self.__folder)

        @property
        def folder(self):
            '''
            :rtype: str
            '''

            return self.__folder

        @property
        def object_id(self):
            '''
            :rtype: str
            '''

            return self.__object_id

        def set_folder(self, folder):
            '''
            :type folder: str or None
            '''

            self.__folder = folder
            return self

        def set_object_id(self, object_id):
            '''
            :type object_id: str
            '''

            self.__object_id = object_id
            return self

        def set_user_id(self, user_id):
            '''
            :type user_id: str
            '''

            self.__user_id = user_id
            return self

        def update(self, user_bookmark):
            '''
            :type object_id: str
            :type user_id: str
            :type folder: str or None
            '''

            if isinstance(user_bookmark, UserBookmark):
                self.set_object_id(user_bookmark.object_id)
                self.set_user_id(user_bookmark.user_id)
                self.set_folder(user_bookmark.folder)
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

        @object_id.setter
        def object_id(self, object_id):
            '''
            :type object_id: str
            '''

            self.set_object_id(object_id)

        @user_id.setter
        def user_id(self, user_id):
            '''
            :type user_id: str
            '''

            self.set_user_id(user_id)

    def __init__(
        self,
        object_id,
        user_id,
        folder=None,
    ):
        '''
        :type object_id: str
        :type user_id: str
        :type folder: str or None
        '''

        if object_id is None:
            raise ValueError('object_id is required')
        if not isinstance(object_id, basestring):
            raise TypeError("expected object_id to be a str but it is a %s" % getattr(__builtin__, 'type')(object_id))
        self.__object_id = object_id

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

    def __eq__(self, other):
        if self.object_id != other.object_id:
            return False
        if self.user_id != other.user_id:
            return False
        if self.folder != other.folder:
            return False
        return True

    def __hash__(self):
        return hash((self.object_id,self.user_id,self.folder,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('object_id=' + "'" + self.object_id.encode('ascii', 'replace') + "'")
        field_reprs.append('user_id=' + "'" + self.user_id.encode('ascii', 'replace') + "'")
        if self.folder is not None:
            field_reprs.append('folder=' + "'" + self.folder.encode('ascii', 'replace') + "'")
        return 'UserBookmark(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('object_id=' + "'" + self.object_id.encode('ascii', 'replace') + "'")
        field_reprs.append('user_id=' + "'" + self.user_id.encode('ascii', 'replace') + "'")
        if self.folder is not None:
            field_reprs.append('folder=' + "'" + self.folder.encode('ascii', 'replace') + "'")
        return 'UserBookmark(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'object_id': self.object_id, 'user_id': self.user_id, 'folder': self.folder}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.object_id, self.user_id, self.folder,)

    @property
    def folder(self):
        '''
        :rtype: str
        '''

        return self.__folder

    @property
    def object_id(self):
        '''
        :rtype: str
        '''

        return self.__object_id

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: costume.api.models.user.user_bookmark.UserBookmark
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'object_id':
                init_kwds['object_id'] = iprot.read_string()
            elif ifield_name == 'user_id':
                init_kwds['user_id'] = iprot.read_string()
            elif ifield_name == 'folder':
                try:
                    init_kwds['folder'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        object_id=None,
        user_id=None,
        folder=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type object_id: str or None
        :type user_id: str or None
        :type folder: str or None
        :rtype: costume.api.models.user.user_bookmark.UserBookmark
        '''

        if object_id is None:
            object_id = self.object_id
        if user_id is None:
            user_id = self.user_id
        if folder is None:
            folder = self.folder
        return self.__class__(object_id=object_id, user_id=user_id, folder=folder)

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
        :rtype: costume.api.models.user.user_bookmark.UserBookmark
        '''

        oprot.write_struct_begin('UserBookmark')

        oprot.write_field_begin(name='object_id', type=11, id=None)
        oprot.write_string(self.object_id)
        oprot.write_field_end()

        oprot.write_field_begin(name='user_id', type=11, id=None)
        oprot.write_string(self.user_id)
        oprot.write_field_end()

        if self.folder is not None:
            oprot.write_field_begin(name='folder', type=11, id=None)
            oprot.write_string(self.folder)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
