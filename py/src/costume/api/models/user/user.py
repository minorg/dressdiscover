from datetime import datetime
import __builtin__


class User(object):
    class Builder(object):
        def __init__(
            self,
            ctime=None,
            email_address=None,
        ):
            '''
            :type ctime: datetime
            :type email_address: str
            '''

            self.__ctime = ctime
            self.__email_address = email_address

        def build(self):
            return User(ctime=self.__ctime, email_address=self.__email_address)

        @property
        def ctime(self):
            '''
            :rtype: datetime
            '''

            return self.__ctime

        @property
        def email_address(self):
            '''
            :rtype: str
            '''

            return self.__email_address

        def set_ctime(self, ctime):
            '''
            :type ctime: datetime
            '''

            self.__ctime = ctime
            return self

        def set_email_address(self, email_address):
            '''
            :type email_address: str
            '''

            self.__email_address = email_address
            return self

        def update(self, user):
            '''
            :type ctime: datetime
            :type email_address: str
            '''

            if isinstance(user, User):
                self.set_ctime(user.ctime)
                self.set_email_address(user.email_address)
            elif isinstance(user, dict):
                for key, value in user.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(user)
            return self

        @ctime.setter
        def ctime(self, ctime):
            '''
            :type ctime: datetime
            '''

            self.set_ctime(ctime)

        @email_address.setter
        def email_address(self, email_address):
            '''
            :type email_address: str
            '''

            self.set_email_address(email_address)

    def __init__(
        self,
        ctime,
        email_address,
    ):
        '''
        :type ctime: datetime
        :type email_address: str
        '''

        if ctime is None:
            raise ValueError('ctime is required')
        if not isinstance(ctime, datetime):
            raise TypeError("expected ctime to be a datetime but it is a %s" % getattr(__builtin__, 'type')(ctime))
        self.__ctime = ctime

        if email_address is None:
            raise ValueError('email_address is required')
        if not isinstance(email_address, basestring):
            raise TypeError("expected email_address to be a str but it is a %s" % getattr(__builtin__, 'type')(email_address))
        self.__email_address = email_address

    def __eq__(self, other):
        if self.ctime != other.ctime:
            return False
        if self.email_address != other.email_address:
            return False
        return True

    def __hash__(self):
        return hash((self.ctime,self.email_address,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('ctime=' + repr(self.ctime))
        field_reprs.append('email_address=' + "'" + self.email_address.encode('ascii', 'replace') + "'")
        return 'User(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('ctime=' + repr(self.ctime))
        field_reprs.append('email_address=' + "'" + self.email_address.encode('ascii', 'replace') + "'")
        return 'User(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'ctime': self.ctime, 'email_address': self.email_address}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.ctime, self.email_address,)

    @property
    def ctime(self):
        '''
        :rtype: datetime
        '''

        return self.__ctime

    @property
    def email_address(self):
        '''
        :rtype: str
        '''

        return self.__email_address

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: costume.api.models.user.user.User
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'ctime':
                init_kwds['ctime'] = iprot.read_date_time()
            elif ifield_name == 'email_address':
                init_kwds['email_address'] = iprot.read_string()
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        ctime=None,
        email_address=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type ctime: datetime or None
        :type email_address: str or None
        :rtype: costume.api.models.user.user.User
        '''

        if ctime is None:
            ctime = self.ctime
        if email_address is None:
            email_address = self.email_address
        return self.__class__(ctime=ctime, email_address=email_address)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.api.models.user.user.User
        '''

        oprot.write_struct_begin('User')

        oprot.write_field_begin(name='ctime', type=10, id=None)
        oprot.write_date_time(self.ctime)
        oprot.write_field_end()

        oprot.write_field_begin(name='email_address', type=11, id=None)
        oprot.write_string(self.email_address)
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
