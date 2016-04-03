from costume.lib.stores.collection.omeka.omeka_collection_to_collection_mapper import OmekaCollectionToCollectionMapper
from net.lab1318.costume.lib.stores.collection import AbstractReadOnlyCollectionStore


class _OmekaCollectionStore(AbstractReadOnlyCollectionStore):
    def __init__(self, uri, mapper=None):
        if mapper is None:
            mapper = OmekaCollectionToCollectionMapper()
        self.__mapper = mapper
        self.__uri = uri

    @property
    def _mapper(self):
        return self.__mapper

    @property
    def _uri(self):
        return self.__uri
