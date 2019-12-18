from abc import ABC
from typing import Optional

from rdflib import Graph, Literal, URIRef
from rdflib.namespace import DC
from rdflib.resource import Resource


class _Model(ABC):
    def __init__(self, uri: URIRef):
        self.__graph = Graph()
        self.__resource = self.__graph.resource(uri)
        self.__uri = uri

    @property
    def description(self) -> Optional[str]:
        raise NotImplementedError

    @description.setter
    def description(self, value):
        self.resource.add(DC.description, Literal(value))

    @property
    def graph(self):
        return self.__graph

    @property
    def title(self) -> Optional[str]:
        raise NotImplementedError

    @title.setter
    def title(self, value):
        self.resource.add(DC.title, Literal(value))

    @property
    def resource(self) -> Resource:
        return self.__resource

    @property
    def uri(self) -> URIRef:
        return self.__uri
