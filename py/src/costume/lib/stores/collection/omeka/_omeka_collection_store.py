from net.lab1318.costume.lib.stores.collection import AbstractReadOnlyCollectionStore

from costume.lib.stores.omeka_resource_mapper import OmekaResourceMapper


class _OmekaCollectionStore(AbstractReadOnlyCollectionStore):
    def __init__(self, endpoint_url, properties, uri, resource_mapper=None):
        self.__endpoint_url = endpoint_url
        if resource_mapper is None:
            resource_mapper = OmekaResourceMapper()
        elif isinstance(resource_mapper, basestring):
            resource_mapper_class_qname_split = resource_mapper.split('.')
            resource_mapper_class = __import__('.'.join(resource_mapper_class_qname_split[:-1]))
            for component in resource_mapper_class_qname_split[1:]:
                resource_mapper_class = getattr(resource_mapper_class, component)
            resource_mapper = resource_mapper_class()
        self.__resource_mapper = resource_mapper
        self.__uri = uri

    @property
    def _endpoint_url(self):
        return self.__endpoint_url

    @property
    def _resource_mapper(self):
        return self.__resource_mapper

    @property
    def _uri(self):
        return self.__uri
