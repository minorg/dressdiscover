import os.path, sys
sys.path.append(os.path.join(os.path.dirname(__file__), '..'))
from _id import _Id


class InstitutionId(_Id):
    def java_read_protocol_throws_checked(self):
        return ['org.dressdiscover.api.models.institution.InvalidInstitutionIdException']

    def java_qname(self):
        return 'org.dressdiscover.api.models.institution.InstitutionId'
