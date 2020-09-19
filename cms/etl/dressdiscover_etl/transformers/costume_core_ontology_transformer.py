import csv
from pathlib import Path
from typing import Dict, List, Optional, Tuple
from urllib.parse import quote

from paradicms_etl._transformer import _Transformer
from paradicms_etl.models.collection import Collection
from paradicms_etl.models.institution import Institution
from paradicms_etl.models.object import Object
from paradicms_etl.models.property_definitions import PropertyDefinitions
from paradicms_etl.models.rights import Rights
from rdflib import Graph, URIRef

from dressdiscover_etl.models.costume_core_description import CostumeCoreDescription
from dressdiscover_etl.models.costume_core_ontology import CostumeCoreOntology
from dressdiscover_etl.models.costume_core_predicate import CostumeCorePredicate
from dressdiscover_etl.models.costume_core_rights import CostumeCoreRights
from dressdiscover_etl.models.costume_core_term import CostumeCoreTerm
from dressdiscover_etl.namespace import CC


class CostumeCoreOntologyTransformer(_Transformer):
    def __init__(self, *, ontology_version: str, **kwds):
        _Transformer.__init__(self, **kwds)
        self.__ontology_version = ontology_version

    def __parse_predicates(
        self, *, feature_records, terms_by_features: Dict[str, List[CostumeCoreTerm]]
    ) -> Tuple[CostumeCorePredicate, ...]:
        predicates = []

        for feature_record in feature_records:
            fields = feature_record["fields"]
            try:
                uri = fields["URI"]
            except KeyError:
                continue
            if not uri.startswith(str(CC)):
                continue
            id = fields["id"].lstrip()
            try:
                predicate_terms = tuple(terms_by_features.pop(id))
            except KeyError:
                predicate_terms = tuple()
            predicates.append(
                CostumeCorePredicate(
                    description_text_en=fields["description_text_en"],
                    display_name_en=fields["display_name_en"],
                    id=id,
                    sub_property_of_uri=fields.get("sub_property_of"),
                    terms=predicate_terms,
                    uri=uri,
                )
            )
        return tuple(sorted(predicates, key=lambda predicate: predicate.id))

    def __parse_terms(
        self, *, feature_records, feature_value_records
    ) -> Tuple[CostumeCoreTerm, ...]:
        terms = []
        for feature_value_record in feature_value_records:
            fields = feature_value_record["fields"]

            if not fields["id"].startswith("CC"):
                # All term ID's start with CC.
                # The predicates are appended to the end of the terms spreadsheet, and don't start with CC.
                continue

            if "display_name_en" not in fields:
                continue

            description_text_en = fields.get("description_text_en")
            if description_text_en:

                def get_first_list_element(list_: Optional[List[str]]):
                    if list_ is None:
                        return None
                    assert isinstance(list_, list)
                    assert len(list_) == 1
                    return list_[0]

                description = CostumeCoreDescription(
                    rights=CostumeCoreRights(
                        author=fields["description_rights_author"],
                        license_uri=get_first_list_element(
                            fields.get("description_rights_license")
                        ),
                        rights_statement_uri=get_first_list_element(
                            fields.get("description_rights_statement")
                        ),
                        source_name=fields["description_rights_source_name"],
                        source_url=fields["description_rights_source_url"],
                    ),
                    text_en=fields["description_text_en"],
                )
            else:
                description = None

            features = []
            for feature_record_id in fields.get("features", []):
                for feature_record in feature_records:
                    if feature_record["id"] == feature_record_id:
                        features.append(feature_record["fields"]["id"])
                        break
            features = tuple(features)

            cc_uri = fields.get("CC_URI")
            inferred_uri = str(CC[quote(fields["display_name_en"])])
            if cc_uri is None:
                uri = inferred_uri
            elif cc_uri != inferred_uri:
                self._logger.warning(
                    "CC_URI (%s) does not match inferred URI (%s)", cc_uri, inferred_uri
                )
                uri = inferred_uri

            term = CostumeCoreTerm(
                aat_id=fields.get("AATID"),
                description=description,
                display_name_en=fields["display_name_en"],
                features=features,
                id=fields["id"],
                uri=inferred_uri,
                wikidata_id=fields.get("WikidataID"),
            )
            terms.append(term)
        return tuple(sorted(terms, key=lambda term: term.id))

    def transform(self, *, records_by_table: Dict[str, Tuple]) -> Graph:
        yield CostumeCoreOntology(uri=URIRef(str(CC)), version=self.__ontology_version)

        terms = self.__parse_terms(
            feature_records=records_by_table["features"],
            feature_value_records=records_by_table["feature_values"],
        )
        yield from terms

        terms_by_features = {}
        for term in terms:
            if term.features:
                for feature in term.features:
                    terms_by_features.setdefault(feature, []).append(term)

        terms_by_features_left = terms_by_features.copy()
        predicates = self.__parse_predicates(
            feature_records=records_by_table["features"],
            terms_by_features=terms_by_features_left,
        )
        yield from predicates

        if terms_by_features_left:
            print(
                "Terms that have a 'features' that doesn't correspond to a predicate:"
            )
            for predicate_id, predicate_terms in terms_by_features_left.items():
                print(predicate_id, ", ".join(term.id for term in predicate_terms))

        yield from self.__transform_paradicms_models(
            feature_records=records_by_table["features"],
            feature_value_records=records_by_table["feature_values"],
            predicates=predicates,
            terms=terms,
        )

    def __transform_paradicms_models(
        self,
        *,
        feature_records,
        feature_value_records,
        predicates: Tuple[CostumeCorePredicate, ...],
        terms: Tuple[CostumeCoreTerm, ...],
    ):
        yield from PropertyDefinitions.as_tuple()

        institution = Institution(
            name="Costume Core Ontology",
            rights=Rights(
                holder="Arden Kirkland", statements=("Copyright Arden Kirkland",),
            ),
            uri=URIRef("http://www.ardenkirkland.com/costumecore/"),
        )
        yield institution

        feature_records_by_id = {
            feature_record["fields"]["id"]: feature_record
            for feature_record in feature_records
        }
        feature_value_records_by_id = {
            feature_value_record["fields"]["id"]: feature_value_record
            for feature_value_record in feature_value_records
        }
        predicates_by_id = {predicate.id: predicate for predicate in predicates}

        for predicate in predicates:
            feature_record = feature_records_by_id[predicate.id]
            collection = Collection(
                institution_uri=institution.uri,
                title=predicate.display_name_en,
                uri=URIRef(predicate.uri),
            )
            yield collection

        for term in terms:
            # A term can belong to multiple predicates/collections, so yield them separately
            if not term.features:
                continue  # Doesn't belong to any predicates/collections

            feature_value_record = feature_value_records_by_id[term.id]

            term_predicates = tuple(
                predicates_by_id[feature_id] for feature_id in term.features
            )

            yield Object(
                collection_uris=tuple(
                    term_predicate.uri for term_predicate in term_predicates
                ),
                institution_uri=institution.uri,
                title=term.display_name_en,
                uri=URIRef(term.uri),
            )
