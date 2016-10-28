from org.dressdiscover.lib.stores.collection import CollectionStoreFactory


class PyCollectionStoreFactory(CollectionStoreFactory):
    def __init__(self, collection_store_class):
        self.__collection_store_class = collection_store_class

    def createCollectionStore(self, configuration):
        if configuration.parameters is not None:
            kwds = dict((entry.key, entry.value) for entry in configuration.parameters.get().entrySet())
        else:
            kwds = {}
        return self.__collection_store_class(**kwds)
