class CostumeCorePredicate:
    def __init__(self, *, id: str, display_name_en: str, uri: str):
        self.__id = id
        self.__display_name_en = display_name_en
        self.__uri = uri

    @property
    def id(self) -> str:
        return self.__id

    @property
    def display_name_en(self) -> str:
        return self.__display_name_en

    @property
    def uri(self) -> str:
        return self.__uri
