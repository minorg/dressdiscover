import os.path, sys
sys.path.append(os.path.join(os.path.dirname(__file__), '..'))
from _id import _Id


class UserId(_Id):
    def java_qname(self, **kwds):
        return 'org.dressdiscover.api.models.user.UserId'

    def java_read_protocol_throws_checked(self):
        return ['org.dressdiscover.api.models.user.InvalidUserIdException']
