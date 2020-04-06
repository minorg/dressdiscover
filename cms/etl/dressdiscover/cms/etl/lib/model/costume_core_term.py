from typing import Optional

from dressdiscover.cms.etl.lib.model.costume_core_description import CostumeCoreDescription


class CostumeCoreTerm:
    def __init__(self, *, description: CostumeCoreDescription, display_name_en: str, id: str, uri: str,
                 aat_id: Optional[str] = None,
                 features: Optional[str] = None,
                 wikidata_id: Optional[str] = None):
        self.__aat_id = aat_id
        self.__description = description
        self.__display_name_en = display_name_en
        self.__features = features
        self.__id = id
        self.__uri = uri
        self.__wikidata_id = wikidata_id

    @property
    def aat_id(self) -> Optional[str]:
        return self.__aat_id

    @property
    def description(self) -> CostumeCoreDescription:
        return self.__description

    @property
    def display_name_en(self) -> str:
        return self.__display_name_en

    @property
    def features(self) -> Optional[str]:
        return self.__features

    @property
    def id(self) -> str:
        return self.__id

    def __repr__(self):
        def quote_string(value: Optional[str]):
            if value is None:
                return None
            return "'" + value + "'"

        return f"{self.__class__.__name__}(aat_id={quote_string(self.aat_id)}, description={repr(self.description)}, display_name_en='''{self.display_name_en}''', features={quote_string(self.features)}, id='{self.id}', uri='{self.uri}', wikidata_id={quote_string(self.wikidata_id)})"

    @property
    def uri(self) -> str:
        return self.__uri

    @property
    def wikidata_id(self) -> Optional[str]:
        return self.__wikidata_id
