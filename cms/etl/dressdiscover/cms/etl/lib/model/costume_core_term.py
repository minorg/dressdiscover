from typing import Optional

from dressdiscover.cms.etl.lib.model.costume_core_description import CostumeCoreDescription


class CostumeCoreTerm:
    def __init__(self, *, description: CostumeCoreDescription, display_name_en: str, id: str, uri: str,
                 aat_id: Optional[str] = None,
                 wikidata_id: Optional[str]):
        self.__aat_id = aat_id
        self.__description = description
        self.__display_name_en = display_name_en
        self.__id = id
        self.__uri = uri
        self.__wikidata_id = wikidata_id

    @property
    def aat_id(self):
        return self.__aat_id

    @property
    def description(self):
        return self.__description

    @property
    def display_name_en(self):
        return self.__display_name_en

    @property
    def id(self):
        return self.__id

    @property
    def uri(self):
        return self.__uri

    @property
    def wikidata_id(self):
        return self.__wikidata_id
