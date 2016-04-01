from costume.lib.stores.collection.omeka.omeka_collection_to_collection_mapper import OmekaCollectionToCollectionMapper
from net.lab1318.costume.lib.stores.collection import AbstractReadOnlyCollectionStore


class _OmekaCollectionStore(AbstractReadOnlyCollectionStore):
    def __init__(self, mapper=None):
        if mapper is None:
            mapper = OmekaCollectionToCollectionMapper()
        self.__mapper = mapper

    @property
    def _mapper(self):
        return self.__mapper
