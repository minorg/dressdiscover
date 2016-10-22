import os.path, sys
sys.path.append(os.path.join(os.path.dirname(__file__), '..'))
from _string_id import _StringId


class InstitutionId(_StringId):
    def java_read_protocol_throws_checked(self):
        return ['org.dressdiscover.api.models.institution.InvalidInstitutionIdException']

    def java_qname(self):
        return 'org.dressdiscover.api.models.institution.InstitutionId'

    def py_qname(self):
        return 'dressdiscover.api.models.institution.institution_id.InstitutionId'

    def py_read_protocol_throws(self):
        return ['dressdiscover.api.models.institution.InvalidInstitutionIdException']

    def py_repr(self):
        return """\
from dressdiscover.api.models.institution.invalid_institution_id_exception import InvalidInstitutionIdException


class InstitutionId(str):
    @classmethod
    def parse(cls, str_):
        if len(str_) == 0:
            raise InvalidInstitutionIdException("empty")
        return cls(str_)
"""
