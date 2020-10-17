from typing import Dict, Optional, Tuple

from paradicms_etl.models.property_definition import PropertyDefinition
from rdflib import URIRef

from dressdiscover_etl.models.costume_core_predicate import CostumeCorePredicate
from dressdiscover_etl.models.costume_core_predicates import COSTUME_CORE_PREDICATES
from dressdiscover_etl.models.costume_core_term import CostumeCoreTerm
from dressdiscover_etl.models.costume_core_terms import COSTUME_CORE_TERMS
from dressdiscover_etl.namespace import CC


class CostumeCore:
    def __init__(
        self,
        *,
        predicates: Optional[Tuple[CostumeCorePredicate, ...]] = None,
        terms: Optional[Tuple[CostumeCoreTerm, ...]] = None
    ):
        if predicates is None:
            predicates = COSTUME_CORE_PREDICATES
        self.__predicates = predicates

        self.__predicates_by_label = {
            predicate.label: predicate for predicate in predicates
        }

        if terms is None:
            terms = COSTUME_CORE_TERMS
        self.__terms = terms

        self.__terms_by_id = {term.id: term for term in terms}

        terms_by_predicate_id = {}
        for costume_core_term in COSTUME_CORE_TERMS:
            if costume_core_term.features:
                for feature in costume_core_term.features:
                    terms_by_predicate_id.setdefault(feature, []).append(
                        costume_core_term
                    )
        self.__terms_by_predicate_id = terms_by_predicate_id

        self.__property_definitions = tuple(
            PropertyDefinition(
                faceted=costume_core_predicate.id in terms_by_predicate_id,
                label=costume_core_predicate.label,
                uri=URIRef(costume_core_predicate.uri),
            )
            for costume_core_predicate in COSTUME_CORE_PREDICATES
            # if costume_core_predicate.uri.startswith(str(CC))
        )

    @property
    def predicates(self) -> Tuple[CostumeCorePredicate, ...]:
        return self.__predicates

    @property
    def predicates_by_label(self) -> Dict[str, CostumeCorePredicate]:
        return self.__predicates_by_label

    @property
    def property_definitions(self) -> Tuple[PropertyDefinition, ...]:
        return self.__property_definitions

    @property
    def terms(self) -> Tuple[CostumeCoreTerm, ...]:
        return self.__terms

    @property
    def terms_by_id(self) -> Dict[str, CostumeCoreTerm]:
        return self.__terms_by_id

    @property
    def terms_by_predicate_id(self) -> Dict[str, CostumeCoreTerm]:
        return self.__terms_by_predicate_id
