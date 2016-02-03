import os.path, sys
sys.path.append(os.path.join(os.path.dirname(__file__), '..'))
from _id import _Id


class UserBookmarkId(_Id):
    def java_read_protocol_throws_checked(self):
        return ['net.lab1318.costume.api.models.user.InvalidUserBookmarkIdException']

    def java_qname(self):
        return 'net.lab1318.costume.api.models.user.UserBookmarkId'

    def sql_name(self):
        return 'INTEGER'
