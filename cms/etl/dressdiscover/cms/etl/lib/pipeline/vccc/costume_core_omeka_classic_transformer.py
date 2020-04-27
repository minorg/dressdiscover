from paradicms.etl.lib.namespace import VRA
from paradicms.etl.lib.pipeline.omeka_classic.omeka_classic_transformer import OmekaClassicTransformer
from rdflib import Literal, URIRef, XSD
from rdflib.namespace import DCTERMS

from dressdiscover.cms.etl.lib.model import costume_core_predicates
from dressdiscover.cms.etl.lib.model.costume_core_terms_by_features import COSTUME_CORE_TERMS_BY_FEATURES


class CostumeCoreOmekaClassicTransformer(OmekaClassicTransformer):
    __UNKNOWN_ITM_KEYS = set()
    __UNKNOWN_CC_TERMS = {}

    def _transform_item_type_metadata(self, element_text_tree, model):
        # "Item Type Metadata" is a catch-all element set for all user-defined elements.
        itm_element_text_tree = element_text_tree.pop("Item Type Metadata", None)
        if not itm_element_text_tree:
            return

        for key, property in (
                ("Date Earliest", VRA.earliestDate),
                ("Date Latest", VRA.latestDate),
        ):
            for value in itm_element_text_tree.pop(key, []):
                try:
                    value = int(value)
                except ValueError:
                    continue
                model.resource.add(property, Literal(value, datatype=XSD.int))

        for key, property in (
                ("Category", DCTERMS.subject),
                ("Description Main", DCTERMS.description),
                ("Source Identifier", DCTERMS.identifier),
        ):
            for value in itm_element_text_tree.pop(key, []):
                model.resource.add(property, Literal(value))

        for key, predicate in (
                ("Classification", costume_core_predicates.classification),
                ("Closure Placement", costume_core_predicates.closurePlacement),
                ("Closure Type", costume_core_predicates.closure),
                ("Collar", costume_core_predicates.collar),
                ("Color Main", costume_core_predicates.color),
                ("Color Secondary", costume_core_predicates.color),
                ("Condition Term", costume_core_predicates.condition),
                ("Costume Component", costume_core_predicates.costumeComponents),
                ("Culture", costume_core_predicates.culture),
                ("Function", costume_core_predicates.function),
                ("Gender", costume_core_predicates.gender),
                ("Pattern", costume_core_predicates.pattern),
                ("Sleeve Length", costume_core_predicates.sleeveLength),
                ("Socio-Economic Class", costume_core_predicates.socioEconomicClass),
                ("Structure Neckline", costume_core_predicates.neckline),
                ("Structure Silhouette", costume_core_predicates.silhouette),
                ("Structure Skirt", costume_core_predicates.skirtType),
                ("Structure Sleeves", costume_core_predicates.sleeveType),
                ("Structure Pants", costume_core_predicates.pantsType),
                ("Structure Waist", costume_core_predicates.waistline),
                ("Technique", costume_core_predicates.technique),
                ("Work Type", costume_core_predicates.workType),
        ):
            terms = COSTUME_CORE_TERMS_BY_FEATURES.get(predicate.id, [])
            # if not terms:
            #     self._logger.warning("no terms for Costume Core predicate %s", predicate.id)
            for value in itm_element_text_tree.pop(key, []):
                term = next((term for term in terms if term.display_name_en == value), None)
                if term is not None:
                    model.resource.add(URIRef(predicate.uri), URIRef(term.uri))
                elif terms:
                    unknown_predicate_terms = self.__UNKNOWN_CC_TERMS.setdefault(predicate.id, set())
                    if value not in unknown_predicate_terms:
                        # print(predicate.id + ',' + value)
                        unknown_predicate_terms.add(value)
                model.resource.add(URIRef(predicate.uri), Literal(value))

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
