from typing import NamedTuple, Optional, Tuple

from dressdiscover.cms.etl.model.costume_core_description import CostumeCoreDescription


class CostumeCoreTerm(NamedTuple):
    description: CostumeCoreDescription
    display_name_en: str
    id: str
    uri: str
    aat_id: Optional[str] = None
    features: Optional[Tuple[str, ...]] = None
    wikidata_id: Optional[str] = None

    def __repr__(self):
        def quote_string(value: Optional[str]):
            if value is None:
                return None
            return "'" + value + "'"

        if self.features:
            features = f"({', '.join(quote_string(feature) for feature in self.features)})"
        else:
            features = None

        return f"{self.__class__.__name__}(aat_id={quote_string(self.aat_id)}, description={repr(self.description)}, display_name_en='''{self.display_name_en}''', features={features}, id='{self.id}', uri='{self.uri}', wikidata_id={quote_string(self.wikidata_id)})"
