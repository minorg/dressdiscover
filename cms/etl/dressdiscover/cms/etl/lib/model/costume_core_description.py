from dressdiscover.cms.etl.lib.model.costume_core_rights import CostumeCoreRights


class CostumeCoreDescription:
    def __init__(self, *, rights: CostumeCoreRights, text_en: str):
        self.__rights = rights
        self.__text_en = text_en

    @property
    def rights(self) -> CostumeCoreRights:
        return self.__rights

    def __repr__(self):
        return f"{self.__class__.__name__}(rights={repr(self.rights)}, text_en='''{self.text_en}''')"

    @property
    def text_en(self) -> str:
        return self.__text_en
