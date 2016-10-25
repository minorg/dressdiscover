from org.dressdiscover.lib.stores.object import ObjectStoreFactory


class PyObjectStoreFactory(ObjectStoreFactory):
    def __init__(self, object_store_class):
        self.__object_store_class = object_store_class

    def createObjectStore(self, configuration):
        return self.__object_store_class(**configuration.parameters)
