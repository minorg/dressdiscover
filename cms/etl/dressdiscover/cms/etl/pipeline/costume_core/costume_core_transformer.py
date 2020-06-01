import csv
from pathlib import Path

from paradicms_etl.pipeline._transformer import _Transformer
from rdflib import BNode, Graph, Literal, RDF, RDFS, URIRef
from rdflib.collection import Collection
from rdflib.namespace import DCTERMS, OWL

from dressdiscover.cms.etl.model.costume_core_description import CostumeCoreDescription
from dressdiscover.cms.etl.model.costume_core_predicate import CostumeCorePredicate
from dressdiscover.cms.etl.model.costume_core_rights import CostumeCoreRights
from dressdiscover.cms.etl.model.costume_core_term import CostumeCoreTerm
from dressdiscover.cms.etl.namespace import CC


class CostumeCoreTransformer(_Transformer):
    def transform(self, *, cc_predicates_csv_file_path: Path, cc_terms_csv_file_path: Path) -> Graph:
        predicates = []
        with open(cc_predicates_csv_file_path, "r") as cc_predicates_csv_file:
            for row in csv.DictReader(cc_predicates_csv_file):
                predicates.append(
                    CostumeCorePredicate(display_name_en=row["display_name_en"], id=row["id"], uri=row["URI"]))

        terms = []
        terms_by_features = {}
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
                    description = \
                        CostumeCoreDescription(
                            rights=CostumeCoreRights(
                                author=row["description_rights_author"],
                                license_uri=row.get("description_rights_license"),
                                rights_statement_uri=row.get("description_rights_statement"),
                                source_name=row["description_rights_source_name"],
                                source_url=row["description_rights_source_url"],
                            ),
                            text_en=row["description_text_en"]
                        )
                else:
                    description = None

                features = row.get("features")
                if features:
                    # Only use the first one right now
                    features = features.split(",")[0]

                term = \
                    CostumeCoreTerm(
                        aat_id=row.get("AATID"),
                        description=description,
                        display_name_en=row["display_name_en"],
                        features=features,
                        id=row["id"],
                        uri=row.get("CC_URI", str(CC[row["id"]])),
                        wikidata_id=row.get("WikidataID")
                    )
                terms.append(term)
                if term.features:
                    terms_by_features.setdefault(term.features, []).append(term)

        graph = Graph()
        graph.namespace_manager.bind("cc", CC)
        graph.namespace_manager.bind("owl", OWL)

        for predicate in predicates:
            try:
                predicate_terms = tuple(terms_by_features.pop(predicate.id))
            except KeyError:
                predicate_terms = tuple()

            if predicate.uri.startswith(str(CC)):
                resource = graph.resource(URIRef(predicate.uri))
                resource.add(RDF.type, RDF.Property)
                resource.add(RDFS.label, Literal(predicate.display_name_en, lang="en"))
                resource.add(DCTERMS.identifier, Literal(predicate.id))
                if predicate_terms:
                    range_class_resource = graph.resource(BNode())
                    range_class_resource.add(RDF.type, OWL.Class)
                    range_individuals_collection = Collection(graph, BNode())
                    for predicate_term in predicate_terms:
                        range_individuals_collection.append(URIRef(predicate_term.uri))
                    range_class_resource.add(OWL.oneOf, range_individuals_collection.uri)
                    resource.add(RDFS.range, range_class_resource)

        if terms_by_features:
            print("Terms that have a 'features' that doesn't correspond to a predicate:")
            for predicate_id, predicate_terms in terms_by_features.items():
                print(predicate_id, ", ".join(term.id for term in predicate_terms))
        for term in terms:
            resource = graph.resource(URIRef(term.uri))
            resource.add(RDFS.label, Literal(term.display_name_en, lang="en"))
            resource.add(DCTERMS.identifier, Literal(term.id))
            if term.description:
                resource.add(DCTERMS.description, Literal(term.description.text_en, lang="en"))
                description_resource = graph.resource(BNode())
                resource.add(DCTERMS.description, description_resource)
                description_resource.add(RDFS.label, Literal(term.description.text_en, lang="en"))
                description_resource.add(DCTERMS.creator, Literal(term.description.rights.author))
                source_resource = graph.resource(URIRef(term.description.rights.source_url))
                # source_resource.add(RDFS.label, Literal(term.description.rights.source_name))
                description_resource.add(DCTERMS.source, source_resource)
                if term.description.rights.license_uri:
                    description_resource.add(DCTERMS.license, URIRef(term.description.rights.license_uri))
                if term.description.rights.rights_statement_uri:
                    description_resource.add(DCTERMS.rights, URIRef(term.description.rights.rights_statement_uri))
            if term.aat_id:
                resource.add(OWL.sameAs, URIRef("http://vocab.getty.edu/aat/" + term.aat_id))
            if term.wikidata_id:
                resource.add(OWL.sameAs, URIRef("http://www.wikidata.org/entity/" + term.wikidata_id))

        return {
            "graph": graph,
            "predicates": tuple(predicates),
            "terms": tuple(terms)
        }
