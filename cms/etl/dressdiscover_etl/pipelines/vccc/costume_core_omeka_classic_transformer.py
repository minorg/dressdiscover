from typing import Tuple

from paradicms_etl.models.property import Property
from paradicms_etl.models.property_definition import PropertyDefinition
from paradicms_etl.models.property_definitions import PropertyDefinitions
from paradicms_etl.namespace import VRA
from paradicms_etl.pipelines.omeka_classic.omeka_classic_transformer import (
    OmekaClassicTransformer,
)
from rdflib import Literal, URIRef, XSD
from rdflib.namespace import DCTERMS

from dressdiscover_etl.models import costume_core_predicates
from dressdiscover_etl.models.costume_core_terms_by_features import (
    COSTUME_CORE_TERMS_BY_FEATURES,
)
from dressdiscover_etl.models.costume_core_predicates import COSTUME_CORE_PREDICATES
from dressdiscover_etl.namespace import CC


class CostumeCoreOmekaClassicTransformer(OmekaClassicTransformer):
    __UNKNOWN_ITM_KEYS = set()
    __UNKNOWN_CC_TERMS = {}

    def transform(self, **kwds):
        for costume_core_predicate in COSTUME_CORE_PREDICATES:
            if not costume_core_predicate.uri.startswith(str(CC)):
                continue
            yield PropertyDefinition(
                faceted=costume_core_predicate.id in COSTUME_CORE_TERMS_BY_FEATURES,
                key=costume_core_predicate.id,
                label_plural=costume_core_predicate.display_name_en,
                label_singular=costume_core_predicate.display_name_en,
                uri=URIRef(costume_core_predicate.uri),
            )

        yield from OmekaClassicTransformer.transform(self, **kwds)

    def _transform_item_type_metadata(self, element_text_tree) -> Tuple[Property, ...]:
        # "Item Type Metadata" is a catch-all element set for all user-defined elements.
        itm_element_text_tree = element_text_tree.pop("Item Type Metadata", None)
        if not itm_element_text_tree:
            return ()

        properties = []
        for key, property_definition in (
            ("Date Earliest", PropertyDefinitions.EARLIEST_DATE),
            ("Date Latest", PropertyDefinitions.LATEST_DATE),
        ):
            for value in itm_element_text_tree.pop(key, []):
                try:
                    value = int(value)
                except ValueError:
                    continue
                properties.append(Property(key=property_definition.key, value=value))

            for key, property_definition in (
                ("Category", PropertyDefinitions.SUBJECT),
                ("Culture", PropertyDefinitions.CULTURAL_CONTEXT),
                ("Description Main", PropertyDefinitions.DESCRIPTION),
                ("Source Identifier", PropertyDefinitions.IDENTIFIER),
                ("Technique", PropertyDefinitions.TECHNIQUE),
            ):
                for value in itm_element_text_tree.pop(key, []):
                    properties.append(
                        Property(key=property_definition.key, value=value)
                    )

            for key, predicate in (
                ("Classification", costume_core_predicates.classification),
                ("Closure Placement", costume_core_predicates.closurePlacement),
                ("Closure Type", costume_core_predicates.closure),
                ("Collar", costume_core_predicates.collar),
                ("Color Main", costume_core_predicates.colorMain),
                ("Color Secondary", costume_core_predicates.colorSecondary),
                ("Condition Term", costume_core_predicates.condition),
                ("Costume Component", costume_core_predicates.costumeComponents),
                ("Function", costume_core_predicates.function),
                ("Gender", costume_core_predicates.gender),
                ("Pattern", costume_core_predicates.pattern),
                ("Sleeve Length", costume_core_predicates.sleeveLength),
                ("Socio-Economic Class", costume_core_predicates.socioEconomicClass),
                ("Structure Neckline", costume_core_predicates.neckline),
                # ("Structure Silhouette", costume_core_predicates.silhouette),
                ("Structure Skirt", costume_core_predicates.skirtType),
                ("Structure Sleeves", costume_core_predicates.sleeveType),
                ("Structure Pants", costume_core_predicates.pantsType),
                ("Structure Waist", costume_core_predicates.waistline),
                ("Work Type", costume_core_predicates.workType),
            ):
                terms = COSTUME_CORE_TERMS_BY_FEATURES.get(predicate.id, [])
                # if not terms:
                #     self._logger.warning("no terms for Costume Core predicate %s", predicate.id)
                for value in itm_element_text_tree.pop(key, []):
                    term = next(
                        (term for term in terms if term.display_name_en == value), None
                    )
                    if term is not None:
                        pass
                        # model.resource.add(URIRef(predicate.uri), URIRef(term.uri))
                    elif terms:
                        unknown_predicate_terms = self.__UNKNOWN_CC_TERMS.setdefault(
                            predicate.id, set()
                        )
                        if value not in unknown_predicate_terms:
                            # print(predicate.id + ',' + value)
                            unknown_predicate_terms.add(value)
                    properties.append(Property(predicate.id, value))
                    # model.resource.add(URIRef(predicate.uri), Literal(value))

            for key in (
                "CSV File",
                "Compression",
                "Mannequin",
                "ObjectVR Link",
                "Private Information",
                "Storage Layer",
                "Storage Location",
                "Treatment",
                "URL",
                "View Type",
            ):
                itm_element_text_tree.pop(key, None)  # Ignore

            if itm_element_text_tree:
                for key, value in itm_element_text_tree.items():
                    if len(key) == 1:
                        # Ignore "A", "B", ...
                        continue
                    if key in self.__UNKNOWN_ITM_KEYS:
                        continue
                    # print(key, '=', value)
                    # self._logger.warning("unknown Item Type Metadata key %s = %s", key, value)
                    self.__UNKNOWN_ITM_KEYS.add(key)

        return tuple(properties)
