from typing import NamedTuple, Optional

from models.quote_repr_string import quote_repr_string


class CostumeCoreRights(NamedTuple):
    author: str
    license_uri: Optional[str]
    rights_statement_uri: Optional[str]
    source_name: str
    source_url: str

    def __repr__(self):
        return f"{self.__class__.__name__}(author='{self.author}', license_uri={quote_repr_string(self.license_uri)}, rights_statement_uri={quote_repr_string(self.rights_statement_uri)}, source_name='{self.source_name}', source_url='{self.source_url}')"
