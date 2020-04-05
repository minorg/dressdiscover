from typing import Optional


class CostumeCoreRights:
    def __init__(self, author: str, license_uri: Optional[str], rights_statement_uri: Optional[str], source_name: str,
                 source_url: str):
        self.__author = author
        self.__license_uri = license_uri
        self.__rights_statement_uri = rights_statement_uri
        self.__source_name = source_name
        self.__source_url = source_url

    @property
    def author(self):
        return self.__author

    @property
    def license_uri(self):
        return self.__license_uri

    @property
    def rights_statement_uri(self):
        return self.__rights_statement_uri

    @property
    def source_name(self):
        return self.__source_name

    @property
    def source_url(self):
        return self.__source_url
