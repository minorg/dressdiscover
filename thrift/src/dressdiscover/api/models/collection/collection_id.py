import os.path, sys
sys.path.append(os.path.join(os.path.dirname(__file__), '..'))
from _id import _Id


class CollectionId(_Id):
    def java_read_protocol_throws_checked(self):
        return ['org.dressdiscover.api.models.collection.InvalidCollectionIdException']

    def java_qname(self):
        return 'org.dressdiscover.api.models.collection.CollectionId'

    def py_qname(self):
        return 'dressdiscover.api.models.collection.CollectionId'

    def py_read_protocol(self):
        qname = self.py_qname()
        return "%(qname)s.parse(iprot.read_string())" % locals()

    def py_read_protocol_throws(self):
        return ['dressdiscover.api.models.collection.InvalidCollectionIdException']

    def py_repr(self):
        return """\
from dressdiscover.api.models.collection.invalid_collection_id_exception import InvalidCollectionIdException
from dressdiscover.api.models.institution.institution_id import InstitutionId
from dressdiscover.api.models.institution.invalid_institution_id_exception import InvalidInstitutionIdException


class CollectionId(str):
    @classmethod
    def parse(cls, str_):
        if len(str_) == 0:
            raise InvalidCollectionIdException("empty")
        split = str_.split('/')
        if len(split) != 2:
            raise InvalidCollectionIdException("malformed collection ID: " + str_)
        try:
            institution_id = InstitutionId.parse(split[0].strip())
        except InvalidInstitutionIdException, e:
            raise InvalidCollectionIdException(str(e))
        unqualified_collection_id = split[1].strip()
        if len(unqualified_collection_id) == 0:
            raise InvalidCollectionIdException("empty collection id")
        parsed = cls(str_)
        parsed.__institution_id = institution_id
        parsed.__unqualified_collection_id = unqualified_collection_id
        return parsed

    @property
    def institution_id(self):
        return self.__institution_id

    @property
    def unqualified_collection_id(self):
        return self.__unqualified_collection_id
"""
