import csv
from pathlib import Path
from typing import Dict, List, Optional, Tuple
from urllib.parse import quote

from paradicms_etl._transformer import _Transformer
from paradicms_etl.models.collection import Collection
from paradicms_etl.models.image import Image
from paradicms_etl.models.image_dimensions import ImageDimensions
from paradicms_etl.models.institution import Institution
from paradicms_etl.models.object import Object
from paradicms_etl.models.property import Property
from paradicms_etl.models.property_definitions import PropertyDefinitions
from paradicms_etl.models.rights import Rights
from paradicms_etl.models.rights_value import RightsValue
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

    def __parse_rights(self, fields: Dict[str, str], key_prefix: str):
        def get_first_list_element(list_: Optional[List[str]]):
            if list_ is None:
                return None
            if not isinstance(list_, list):
                return list_
            assert len(list_) == 1
            return list_[0]

        return CostumeCoreRights(
            author=get_first_list_element(fields[f"{key_prefix}_rights_author"]),
            license_uri=get_first_list_element(
                fields.get(f"{key_prefix}_rights_license")
            ),
            rights_statement_uri=get_first_list_element(
                fields.get(f"{key_prefix}_rights_statement")
            ),
            source_name=get_first_list_element(
                fields[f"{key_prefix}_rights_source_name"]
            ),
            source_url=get_first_list_element(
                fields[f"{key_prefix}_rights_source_url"]
            ),
        )

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
                description = CostumeCoreDescription(
                    rights=self.__parse_rights(fields, "description"),
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
            inferred_uri = str(CC[fields["id"]])
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

        feature_records = tuple(
            record
            for record in records_by_table["features"]
            if "id" in record["fields"]
        )
        feature_value_records = tuple(
            record
            for record in records_by_table["feature_values"]
            if "id" in record["fields"]
        )
        image_records = tuple(
            record
            for record in records_by_table["images"]
            if "filename" in record["fields"]
        )
        rights_licenses_records = tuple(
            record
            for record in records_by_table["rights_licenses"]
            if "Nickname" in record["fields"]
        )

        terms = self.__parse_terms(
            feature_records=feature_records,
            feature_value_records=feature_value_records,
        )
        yield from terms

        terms_by_features = {}
        for term in terms:
            if term.features:
                for feature in term.features:
                    terms_by_features.setdefault(feature, []).append(term)

        terms_by_features_left = terms_by_features.copy()
        predicates = self.__parse_predicates(
            feature_records=feature_records, terms_by_features=terms_by_features_left,
        )
        yield from predicates

        if terms_by_features_left:
            print(
                "Terms that have a 'features' that doesn't correspond to a predicate:"
            )
            for predicate_id, predicate_terms in terms_by_features_left.items():
                print(predicate_id, ", ".join(term.id for term in predicate_terms))

        yield from self.__transform_to_paradicms_models(
            feature_records=feature_records,
            feature_value_records=feature_value_records,
            image_records=image_records,
            predicates=predicates,
            rights_licenses_records=rights_licenses_records,
            terms=terms,
        )

    def __transform_to_paradicms_models(
        self,
        *,
        feature_records,
        feature_value_records,
        image_records,
        predicates: Tuple[CostumeCorePredicate, ...],
        rights_licenses_records,
        terms: Tuple[CostumeCoreTerm, ...],
    ):
        yield from PropertyDefinitions.as_tuple()

        institution = Institution(
            name="Costume Core Ontology",
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
        image_records_by_id = {
            image_record["id"]: image_record for image_record in image_records
        }
        predicates_by_id = {predicate.id: predicate for predicate in predicates}

        yielded_collection_uris = set()

        for term in terms:
            # A term can belong to multiple predicates/collections, so yield them separately
            if not term.features:
                continue  # Doesn't belong to any predicates/collections

            feature_value_record = feature_value_records_by_id[term.id]

            term_predicates = tuple(
                predicates_by_id[feature_id] for feature_id in term.features
            )

            for predicate in term_predicates:
                collection_uri = URIRef(predicate.uri)
                if collection_uri in yielded_collection_uris:
                    continue

                feature_record = feature_records_by_id[predicate.id]
                collection = Collection(
                    institution_uri=institution.uri,
                    title=predicate.display_name_en,
                    uri=collection_uri,
                )
                yield collection
                yielded_collection_uris.add(collection_uri)

            object_properties = []
            if term.description:
                object_properties.append(
                    Property(PropertyDefinitions.DESCRIPTION, term.description.text_en)
                )
                object_properties.append(
                    property(
                        PropertyDefinitions.CREATOR, term.description.rights.author
                    )
                )

            object_ = Object(
                abstract=term.description.text_en if term.description else None,
                collection_uris=tuple(
                    term_predicate.uri for term_predicate in term_predicates
                ),
                institution_uri=institution.uri,
                rights=self.__transform_to_paradicms_rights(
                    term.description.rights,
                    rights_licenses_records=rights_licenses_records,
                )
                if term.description
                else None,
                title=term.display_name_en,
                uri=URIRef(term.uri),
            )
            yield object_

            image_record_id = feature_value_record["fields"].get("image_filename")
            if not image_record_id:
                self._logger.debug(
                    "feature value record %s has no image_filename",
                    feature_value_record["fields"]["id"],
                )
                continue
            image_record_id = image_record_id[0]
            assert image_record_id

            image_record = image_records_by_id[image_record_id]
            image_filename = image_record["fields"]["filename"]

            image_rights = self.__transform_to_paradicms_rights(
                self.__parse_rights(feature_value_record["fields"], "image"),
                rights_licenses_records=rights_licenses_records,
            )

            original_image = Image.create(
                depicts_uri=object_.uri,
                institution_uri=institution.uri,
                rights=image_rights,
                uri=URIRef(
                    f"https://worksheet.dressdiscover.org/img/worksheet/full_size/{quote(image_filename)}"
                ),
            )
            yield original_image

            yield Image.create(
                depicts_uri=object_.uri,
                exact_dimensions=ImageDimensions(height=200, width=200),
                institution_uri=institution.uri,
                original_image_uri=original_image.uri,
                rights=image_rights,
                uri=URIRef(
                    f"https://worksheet.dressdiscover.org/img/worksheet/full_size/{quote(image_filename)}"
                ),
            )

    def __transform_to_paradicms_rights(
        self, rights: CostumeCoreRights, rights_licenses_records
    ) -> Rights:
        def uri_text(uri: str):
            for rights_license_record in rights_licenses_records:
                if rights_license_record["fields"]["URL"] == uri:
                    return rights_license_record["fields"]["Nickname"]
            return uri

        return Rights(
            creator=RightsValue(text=rights.author),
            holder=RightsValue(text=rights.source_name, uri=rights.source_url),
            license=RightsValue(
                text=uri_text(rights.license_uri), uri=rights.license_uri
            )
            if rights.license_uri
            else None,
            statement=RightsValue(
                text=uri_text(rights.rights_statement_uri),
                uri=rights.rights_statement_uri,
            )
            if rights.rights_statement_uri
            else None,
        )
