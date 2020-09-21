from paradicms_etl.models.property_definition import PropertyDefinition
from rdflib import URIRef

from dressdiscover_etl.models.costume_core_predicates import COSTUME_CORE_PREDICATES
from dressdiscover_etl.models.costume_core_terms_by_features import (
    COSTUME_CORE_TERMS_BY_FEATURES,
)
from dressdiscover_etl.namespace import CC

COSTUME_CORE_PROPERTY_DEFINITIONS = tuple(
    PropertyDefinition(
        faceted=costume_core_predicate.id in COSTUME_CORE_TERMS_BY_FEATURES,
        label=costume_core_predicate.display_name_en,
        uri=URIRef(costume_core_predicate.uri),
    )
    for costume_core_predicate in COSTUME_CORE_PREDICATES
    if costume_core_predicate.uri.startswith(str(CC))
)
