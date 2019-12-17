from abc import ABC
from typing import Optional

from rdflib import Graph, Literal, RDFS, URIRef
from rdflib.resource import Resource


class _Model(ABC):
    def __init__(self, uri: URIRef):
        self.__graph = Graph()
        self.__resource = self.__graph.resource(uri)
        self.__uri = uri

    @property
    def resource(self) -> Resource:
        return self.__resource

    @property
    def label(self) -> Optional[str]:
        raise NotImplementedError
        # return self.resource.objects(RDFS.label)

    @label.setter
    def label(self, value):
        self.resource.add(RDFS.label, Literal(value))

    @property
    def uri(self) -> URIRef:
        return self.__uri
