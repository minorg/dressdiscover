from net.lab1318.costume.lib.stores.object import ObjectStoreFactory


class PyObjectStoreFactory(ObjectStoreFactory):
    def __init__(self, class_):
        self.__class = class_

    def createObjectStore(self, parameters, properties, uri):
        kwds = {}
        for entry in parameters.entrySet():
            kwds[entry.getKey()] = entry.getValue()
        return self.__class(properties=properties, uri=uri, **kwds)