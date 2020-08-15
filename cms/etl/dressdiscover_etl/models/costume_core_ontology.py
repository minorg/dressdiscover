from dataclasses import dataclass

from paradicms_etl._model import _Model
from rdflib import Graph, Literal, OWL, URIRef
from rdflib.namespace import DCTERMS, RDF, RDFS
from rdflib.resource import Resource

from namespace import CC


@dataclass(frozen=True)
class CostumeCoreOntology(_Model):
    version: str

    def to_rdf(self, *, graph: Graph) -> Resource:
        graph.namespace_manager.bind("cc", CC)
        graph.namespace_manager.bind("owl", OWL)

        # Annotation properties
        for annotation_property_local in ("creator", "description", "identifier", "license", "rights", "source"):
            graph.add((DCTERMS[annotation_property_local], RDF.type, OWL.AnnotationProperty))

        ontology_resource = graph.resource(URIRef(str(CC)[:-1]))
        ontology_resource.add(RDF.type, OWL.Ontology)
        ontology_resource.add(OWL.versionIRI, CC[self.__ontology_version])
        ontology_resource.add(OWL.versionInfo, Literal(self.__ontology_version))
        ontology_resource.add(DCTERMS.title, Literal("Costume Core Ontology"))
        ontology_resource.add(DCTERMS.creator, Literal("Arden Kirkland"))
        ontology_resource.add(DCTERMS.contributor, Literal("Minor Gordon"))
        ontology_resource.add(DCTERMS.rights, Literal(
            "This ontology is distributed under a Creative Commons BY SA 4.0 license  - https://creativecommons.org/licenses/by-sa/4.0/"))
        ontology_resource.add(RDFS.comment, Literal(
            "The Costume Core ontology is for describing artifacts of historic clothing, and is meant to build upon VRA Core and Dublin Core. Work to develop this ontology was part of the Costume Core Toolkit project, funded by a Visual Resources Association Foundation Project Grant in 2019-2020. More information is at http://ardenkirkland.com/costumecore"))

        return ontology_resource
