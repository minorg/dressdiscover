from org.dressdiscover.lib.stores.collection import CollectionStoreFactory


class PyCollectionStoreFactory(CollectionStoreFactory):
    def __init__(self, collection_store_class):
        self.__collection_store_class = collection_store_class

    def createCollectionStore(self, configuration):
        return self.__collection_store_class(**configuration.parameters)
