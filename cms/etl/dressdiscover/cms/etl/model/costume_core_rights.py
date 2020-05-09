from typing import Optional


class CostumeCoreRights:
    def __init__(self, *, author: str, license_uri: Optional[str], rights_statement_uri: Optional[str],
                 source_name: str,
                 source_url: str):
        self.__author = author
        self.__license_uri = license_uri
        self.__rights_statement_uri = rights_statement_uri
        self.__source_name = source_name
        self.__source_url = source_url

    @property
    def author(self) -> str:
        return self.__author

    @property
    def license_uri(self) -> Optional[str]:
        return self.__license_uri

    def __repr__(self):
        def quote_string(value: Optional[str]):
            if value is None:
                return None
            return "'" + value + "'"

        return f"{self.__class__.__name__}(author='{self.author}', license_uri={quote_string(self.license_uri)}, rights_statement_uri={quote_string(self.rights_statement_uri)}, source_name='{self.source_name}', source_url='{self.source_url}')"

    @property
    def rights_statement_uri(self) -> Optional[str]:
        return self.__rights_statement_uri

    @property
    def source_name(self) -> str:
        return self.__source_name

    @property
    def source_url(self) -> str:
        return self.__source_url
