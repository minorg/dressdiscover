import csv
from pathlib import Path
from typing import Dict, List, Tuple

from paradicms_etl._transformer import _Transformer
from rdflib import BNode, Graph, Literal, RDF, RDFS, URIRef
from rdflib.collection import Collection
from rdflib.namespace import DCTERMS, OWL

from dressdiscover_etl.models.costume_core_description import CostumeCoreDescription
from dressdiscover_etl.models.costume_core_predicate import CostumeCorePredicate
from dressdiscover_etl.models.costume_core_rights import CostumeCoreRights
from dressdiscover_etl.models.costume_core_term import CostumeCoreTerm
from dressdiscover_etl.namespace import CC
from dressdiscover_etl.models.costume_core_ontology import CostumeCoreOntology


class CostumeCoreTransformer(_Transformer):
    def __init__(self, *, ontology_version: str, **kwds):
        _Transformer.__init__(self, **kwds)
        self.__ontology_version = ontology_version

    def __parse_predicates(
        self,
        *,
        cc_predicates_csv_file_path: Path,
        terms_by_features: Dict[str, List[CostumeCoreTerm]]
    ) -> Tuple[CostumeCorePredicate, ...]:
        predicates = []

        with open(
            cc_predicates_csv_file_path, "r", encoding="UTF-8"
        ) as cc_predicates_csv_file:
            for row in csv.DictReader(cc_predicates_csv_file):
                uri = row["URI"]
                if not uri.startswith(str(CC)):
                    continue
                id = row["id"]
                try:
                    predicate_terms = tuple(terms_by_features.pop(id))
                except KeyError:
                    predicate_terms = tuple()
                predicates.append(
                    CostumeCorePredicate(
                        description_text_en=row["description_text_en"],
                        display_name_en=row["display_name_en"],
                        id=id,
                        sub_property_of_uri=row.get("sub_property_of"),
                        terms=predicate_terms,
                        uri=uri,
                    )
                )
        return tuple(sorted(predicates, key=lambda predicate: predicate.id))

    def __parse_terms(
        self, *, cc_terms_csv_file_path: Path
    ) -> Tuple[CostumeCoreTerm, ...]:
        terms = []
        with open(cc_terms_csv_file_path, "r") as cc_terms_csv_file:
            for row in csv.DictReader(cc_terms_csv_file):
                if not row["id"].startswith("CC"):
                    # All term ID's start with CC.
                    # The predicates are appended to the end of the terms spreadsheet, and don't start with CC.
                    continue

                row_copy = {}
                for key, value in row.items():
                    value = value.strip()
                    if value:
                        row_copy[key] = value
                row = row_copy

                description_text_en = row.get("description_text_en")
                if description_text_en:
                    description = CostumeCoreDescription(
                        rights=CostumeCoreRights(
                            author=row["description_rights_author"],
                            license_uri=row.get("description_rights_license"),
                            rights_statement_uri=row.get(
                                "description_rights_statement"
                            ),
                            source_name=row["description_rights_source_name"],
                            source_url=row["description_rights_source_url"],
                        ),
                        text_en=row["description_text_en"],
                    )
                else:
                    description = None

                features = row.get("features")
                if features:
                    features = tuple(features.split(","))

                term = CostumeCoreTerm(
                    aat_id=row.get("AATID"),
                    description=description,
                    display_name_en=row["display_name_en"],
                    features=features,
                    id=row["id"],
                    uri=row.get("CC_URI", str(CC[row["id"]])),
                    wikidata_id=row.get("WikidataID"),
                )
                terms.append(term)
        return tuple(sorted(terms, key=lambda term: term.id))

    def transform(
        self, *, cc_predicates_csv_file_path: Path, cc_terms_csv_file_path: Path
    ) -> Graph:
        yield CostumeCoreOntology(uri=URIRef(str(CC)), version=self.__ontology_version)

        terms = self.__parse_terms(cc_terms_csv_file_path=cc_terms_csv_file_path)
        yield from terms

        terms_by_features = {}
        for term in terms:
            if term.features:
                for feature in term.features:
                    terms_by_features.setdefault(feature, []).append(term)

        yield from self.__parse_predicates(
            cc_predicates_csv_file_path=cc_predicates_csv_file_path,
            terms_by_features=terms_by_features,
        )

        if terms_by_features:
            print(
                "Terms that have a 'features' that doesn't correspond to a predicate:"
            )
            for predicate_id, predicate_terms in terms_by_features.items():
                print(predicate_id, ", ".join(term.id for term in predicate_terms))
