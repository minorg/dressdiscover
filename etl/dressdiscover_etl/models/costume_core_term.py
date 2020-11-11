from dataclasses import dataclass
from typing import NamedTuple, Optional, Tuple

from dataclasses_json import LetterCase, dataclass_json
from paradicms_etl._model import _Model
from rdflib import BNode, Graph, Literal, RDF, RDFS, URIRef
from rdflib.namespace import DCTERMS, OWL
from rdflib.resource import Resource

from dressdiscover_etl.models.costume_core_description import CostumeCoreDescription
from dressdiscover_etl.models.quote_repr_string import quote_repr_string


@dataclass_json(letter_case=LetterCase.CAMEL)
@dataclass(frozen=True)
class CostumeCoreTerm(_Model):
    description: CostumeCoreDescription
    display_name_en: str
    id: str
    uri: str
    aat_id: Optional[str] = None
    features: Optional[Tuple[str, ...]] = None
    wikidata_id: Optional[str] = None

    @property
    def label(self):
        return self.display_name_en

    def __repr__(self):
        if self.features:
            features = f"({', '.join(quote_repr_string(feature) for feature in self.features)},)"
        else:
            features = None

        return f"{self.__class__.__name__}(aat_id={quote_repr_string(self.aat_id)}, description={repr(self.description)}, display_name_en='''{self.display_name_en.encode('unicode-escape').decode('ascii')}''', features={features}, id='{self.id}', uri='{self.uri}', wikidata_id={quote_repr_string(self.wikidata_id)})"

    def to_rdf(self, *, graph: Graph, **kwds) -> Resource:
        resource = graph.resource(URIRef(self.uri))
        resource.add(RDFS.label, Literal(self.label, lang="en"))
        resource.add(DCTERMS.identifier, Literal(self.id))
        resource.add(RDF.type, OWL.NamedIndividual)
        if self.description:
            resource.add(
                DCTERMS.description, Literal(self.description.text_en, lang="en")
            )
            description_resource = graph.resource(BNode())
            resource.add(DCTERMS.description, description_resource)
            description_resource.add(
                RDFS.label, Literal(self.description.text_en, lang="en")
            )
            description_resource.add(
                DCTERMS.creator, Literal(self.description.rights.author)
            )
            source_resource = graph.resource(URIRef(self.description.rights.source_url))
            # source_resource.add(RDFS.label, Literal(self.description.rights.source_name))
            description_resource.add(DCTERMS.source, source_resource)
            if self.description.rights.license_uri:
                description_resource.add(
                    DCTERMS.license, URIRef(self.description.rights.license_uri)
                )
            if self.description.rights.rights_statement_uri:
                description_resource.add(
                    DCTERMS.rights, URIRef(self.description.rights.rights_statement_uri)
                )
        same_as_uris = []
        if self.aat_id:
            same_as_uris.append(URIRef("http://vocab.getty.edu/aat/" + self.aat_id))
        if self.wikidata_id:
            same_as_uris.append(
                URIRef("http://www.wikidata.org/entity/" + self.wikidata_id)
            )
        for same_as_uri in same_as_uris:
            resource.add(OWL.sameAs, same_as_uri)
            graph.add((same_as_uri, OWL.sameAs, resource.identifier))
            graph.add((same_as_uri, RDF.type, OWL.NamedIndividual))
        return resource
