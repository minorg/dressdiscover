from dressdiscover.cms.etl.lib.model.costume_core_rights import CostumeCoreRights


class CostumeCoreDescription:
    def __init__(self, rights: CostumeCoreRights, text_en: str):
        self.__rights = rights
        self.__text_en = text_en

    @property
    def rights(self):
        return self.__rights

    @property
    def text_en(self):
        return self.__text_en
