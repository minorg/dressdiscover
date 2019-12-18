from abc import ABC

from rdflib import Graph, RDF, URIRef
from rdflib.resource import Resource

from dressdiscover.cms.etl.lib.namespace import CMS


class _Model(ABC):
    def __init__(self, uri: URIRef):
        self.__graph = Graph()
        self.__resource = self.__graph.resource(uri)
        self.__resource.add(RDF.type, getattr(CMS, self.__class__.__name__))
        self.__uri = uri

    @property
    def graph(self):
        return self.__graph

    @property
    def resource(self) -> Resource:
        return self.__resource

    @property
    def uri(self) -> URIRef:
        return self.__uri
