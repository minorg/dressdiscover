from dataclasses import dataclass
from typing import Optional, Tuple

from dataclasses_json import LetterCase, dataclass_json
from paradicms_etl._model import _Model
from rdflib import BNode, Graph, Literal, OWL, RDF, RDFS, URIRef
from rdflib.collection import Collection
from rdflib.namespace import DCTERMS
from rdflib.resource import Resource

from dressdiscover_etl.models.costume_core_term import CostumeCoreTerm


@dataclass_json(letter_case=LetterCase.CAMEL)
@dataclass(frozen=True)
class CostumeCorePredicate(_Model):
    description_text_en: str
    display_name_en: str
    id: str
    sub_property_of_uri: Optional[str]
    uri: str
    terms: Optional[Tuple[CostumeCoreTerm, ...]] = None

    @property
    def label(self):
        return self.display_name_en

    def to_rdf(self, *, graph: Graph, **kwds) -> Resource:
        assert self.terms is not None
        resource = graph.resource(URIRef(self.uri))
        resource.add(RDF.type, OWL.ObjectProperty)
        resource.add(RDFS.comment, Literal(self.description_text_en, lang="en"))
        resource.add(RDFS.label, Literal(self.label, lang="en"))
        resource.add(DCTERMS.identifier, Literal(self.id))
        if self.sub_property_of_uri:
            resource.add(RDFS.subPropertyOf, URIRef(self.sub_property_of_uri))
        if self.terms:
            range_class_resource = graph.resource(BNode())
            range_class_resource.add(RDF.type, OWL.Class)
            range_individuals_collection = Collection(graph, BNode())
            for predicate_term in self.terms:
                range_individuals_collection.append(URIRef(predicate_term.uri))
            range_class_resource.add(OWL.oneOf, range_individuals_collection.uri)
            resource.add(RDFS.range, range_class_resource)
