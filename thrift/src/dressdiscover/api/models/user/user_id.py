import os.path, sys
sys.path.append(os.path.join(os.path.dirname(__file__), '..'))
from _id import _Id


class UserId(_Id):
    def java_read_protocol_throws_checked(self):
        return ['net.lab1318.costume.api.models.user.InvalidUserIdException']

    def java_qname(self):
        return 'net.lab1318.costume.api.models.user.UserId'

    def sql_name(self):
        return 'INTEGER'
