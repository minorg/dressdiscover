import os.path, sys
sys.path.append(os.path.join(os.path.dirname(__file__), '..'))
from _id import _Id


class InstitutionId(_Id):
    def java_read_protocol_throws_checked(self):
        return ['net.lab1318.costume.api.models.institution.InvalidInstitutionIdException']

    def java_qname(self, boxed=False):
        return 'net.lab1318.costume.api.models.institution.InstitutionId'
