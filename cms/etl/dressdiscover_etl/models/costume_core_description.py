from typing import NamedTuple

from dressdiscover_etl.models.costume_core_rights import CostumeCoreRights


class CostumeCoreDescription(NamedTuple):
    rights: CostumeCoreRights
    text_en: str
