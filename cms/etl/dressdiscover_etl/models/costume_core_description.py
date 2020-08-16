from typing import NamedTuple

from dressdiscover_etl.models.costume_core_rights import CostumeCoreRights
from dressdiscover_etl.models.quote_repr_string import quote_repr_string


class CostumeCoreDescription(NamedTuple):
    rights: CostumeCoreRights
    text_en: str

    def __repr__(self):
        return f"{self.__class__.__name__}(rights={repr(self.rights)}, text_en={quote_repr_string(self.text_en.encode('unicode-escape').decode('ascii'))})"
