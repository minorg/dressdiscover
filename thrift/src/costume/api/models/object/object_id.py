import os.path, sys
sys.path.append(os.path.join(os.path.dirname(__file__), '..'))
from _id import _Id


class ObjectId(_Id):
    def elastic_search_mapping_dict(self):
        return {'index': 'not_analyzed', 'type': 'string'}

    def java_read_protocol_throws_checked(self):
        return ['net.lab1318.costume.api.models.object.InvalidObjectIdException']

    def java_qname(self, boxed=False):
        return 'net.lab1318.costume.api.models.object.ObjectId'
