import logging
from abc import ABC

from rdflib import Graph, Literal, RDF, URIRef
from rdflib.resource import Resource

from dressdiscover.cms.etl.lib.namespace import CMS


class _Model(ABC):
    def __init__(self, *, graph: Graph, uri: URIRef):
        assert isinstance(uri, URIRef)
        self._logger = logging.getLogger(self.__class__.__name__)
        self.__resource = graph.resource(uri)
        self.__resource.add(RDF.type, getattr(CMS, self.__class__.__name__))
        self.__uri = uri

    def _get_single_value(self, predicate, value_type):
        """
        Get a single Python value (int, string, etc.) for the given predicate, or None if absent.
        This model's resource must only have a single statement with that predicate
        and the statement's object must be a Literal.
        """
        for object_ in self.resource.objects(predicate):
            if not isinstance(object_, Literal):
                self._logger.warning("%s has non-Literal object_", predicate)
                continue
            value = object_.toPython()
            if not isinstance(value, value_type):
                raise ValueError("%s has unexpected type: expected=%s, actual=%s" % (
                    predicate, value_type, value.__class__.__name__))
            return value
        return None

    @property
    def resource(self) -> Resource:
        return self.__resource

    def _set_single_value(self, predicate, value):
        """
        Set a single Python value (int, string, etc.) for the given predicate.
        Checks to see whether a value has already been set. If so, removes it.
        """
        self.resource.remove(predicate)
        self.resource.add(predicate, Literal(value))

    @property
    def uri(self) -> URIRef:
        return self.__uri
