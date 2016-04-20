from net.lab1318.costume.lib.stores.object import ObjectStore

from costume.lib.stores.object.omeka.omeka_item_to_object_mapper import OmekaItemToObjectMapper


class _OmekaObjectStore(ObjectStore):
    def __init__(self, endpoint_url, properties, uri, mapper=None):
        self.__endpoint_url = endpoint_url
        if mapper is None:
            mapper = OmekaItemToObjectMapper()
        elif isinstance(mapper, basestring):
            mapper_class_qname_split = mapper.split('.')
            mapper_class = __import__('.'.join(mapper_class_qname_split[:-1]))
            for component in mapper_class_qname_split[1:]:
                mapper_class = getattr(mapper_class, component)
            mapper = mapper_class()
        self.__mapper = mapper
        self.__uri = uri

    @property
    def _endpoint_url(self):
        return self.__endpoint_url

    @property
    def _mapper(self):
        return self.__mapper

    @property
    def _uri(self):
        return self.__uri
