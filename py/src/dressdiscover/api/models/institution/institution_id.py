from dressdiscover.api.models.institution.invalid_institution_id_exception import InvalidInstitutionIdException


class InstitutionId(str):
    @classmethod
    def parse(cls, str_):
        if len(str_) == 0:
            raise InvalidInstitutionIdException("empty")
        return cls(str_)

