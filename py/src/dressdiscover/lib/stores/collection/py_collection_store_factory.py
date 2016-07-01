from org.dressdiscover.lib.stores.collection import CollectionStoreFactory


class PyCollectionStoreFactory(CollectionStoreFactory):
    def __init__(self, class_):
        self.__class = class_

    def createCollectionStore(self, parameters, properties, uri):
        kwds = {}
        for entry in parameters.entrySet():
            kwds[entry.getKey()] = entry.getValue()
        return self.__class(properties=properties, uri=uri, **kwds)
