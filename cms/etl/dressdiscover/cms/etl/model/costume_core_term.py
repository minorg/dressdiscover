from typing import NamedTuple, Optional

from dressdiscover.cms.etl.model.costume_core_description import CostumeCoreDescription


class CostumeCoreTerm(NamedTuple):
    description: CostumeCoreDescription
    display_name_en: str
    id: str
    uri: str
    aat_id: Optional[str] = None
    features: Optional[str] = None
    wikidata_id: Optional[str] = None

    def __repr__(self):
        def quote_string(value: Optional[str]):
            if value is None:
                return None
            return "'" + value + "'"

        return f"{self.__class__.__name__}(aat_id={quote_string(self.aat_id)}, description={repr(self.description)}, display_name_en='''{self.display_name_en}''', features={quote_string(self.features)}, id='{self.id}', uri='{self.uri}', wikidata_id={quote_string(self.wikidata_id)})"
