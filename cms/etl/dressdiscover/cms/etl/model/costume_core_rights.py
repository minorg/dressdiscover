from typing import NamedTuple, Optional


class CostumeCoreRights(NamedTuple):
    author: str
    license_uri: Optional[str]
    rights_statement_uri: Optional[str]
    source_name: str
    source_url: str

    def __repr__(self):
        def quote_string(value: Optional[str]):
            if value is None:
                return None
            return "'" + value + "'"

        return f"{self.__class__.__name__}(author='{self.author}', license_uri={quote_string(self.license_uri)}, rights_statement_uri={quote_string(self.rights_statement_uri)}, source_name='{self.source_name}', source_url='{self.source_url}')"
