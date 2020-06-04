from typing import NamedTuple

from dressdiscover.cms.etl.model.costume_core_rights import CostumeCoreRights


class CostumeCoreDescription(NamedTuple):
    rights: CostumeCoreRights
    text_en: str
