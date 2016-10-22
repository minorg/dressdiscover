import os.path, sys
sys.path.append(os.path.join(os.path.dirname(__file__), '..'))
from _id import _Id


class InstitutionId(_Id):
    def java_read_protocol_throws_checked(self):
        return ['org.dressdiscover.api.models.institution.InvalidInstitutionIdException']

    def java_qname(self):
        return 'org.dressdiscover.api.models.institution.InstitutionId'

    def py_qname(self):
        return 'dressdiscover.api.models.institution.InstitutionId'

    def py_read_protocol(self):
        qname = self.py_qname()
        return "%(qname)s.parse(iprot.read_string())" % locals()

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
