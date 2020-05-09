class CostumeCorePredicate:
    def __init__(self, *, display_name_en: str, id: str, uri: str):
        self.__display_name_en = display_name_en
        self.__id = id
        self.__uri = uri

    @property
    def id(self) -> str:
        return self.__id

    @property
    def display_name_en(self) -> str:
        return self.__display_name_en

    def __repr__(self):
        return f"{self.__class__.__name__}(display_name_en='''{self.display_name_en}''', id='{self.id}', uri='{self.uri}')"

    @property
    def uri(self) -> str:
        return self.__uri
