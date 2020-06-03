from typing import NamedTuple, Optional


class CostumeCorePredicate(NamedTuple):
    description_text_en: str
    display_name_en: str
    id: str
    sub_property_of_uri: Optional[str]
    uri: str
