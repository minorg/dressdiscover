from org.dressdiscover.lib.stores.object import ObjectStoreFactory


class PyObjectStoreFactory(ObjectStoreFactory):
    def __init__(self, object_store_class):
        self.__object_store_class = object_store_class

    def createObjectStore(self, configuration):
        if configuration.parameters is not None:
            kwds = dict((entry.key, entry.value) for entry in configuration.parameters.get().entrySet())
        else:
            kwds = {}
        return self.__object_store_class(**kwds)
