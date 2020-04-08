from rdflib import Namespace
from rdflib.namespace import NamespaceManager

CC = Namespace("https://w3id.org/costumeCore/ontology/")


def bind_namespaces(namespace_manager: NamespaceManager):
    import paradicms.etl.lib.namespace
    paradicms.etl.lib.namespace.bind_namespaces(namespace_manager)
    namespace_manager.bind("cc", CC)
