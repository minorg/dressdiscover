from net.lab1318.costume.lib.stores.object import ObjectStore

from costume.lib.stores.object.omeka.omeka_item_to_object_mapper import OmekaItemToObjectMapper


class _OmekaObjectStore(ObjectStore):
    def __init__(self, uri, mapper=None):
        if mapper is None:
            mapper = OmekaItemToObjectMapper()
        self.__mapper = mapper
        self.__uri = uri

    @property
    def _mapper(self):
        return self.__mapper

    @property
    def _uri(self):
        return self.__uri
