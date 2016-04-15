from net.lab1318.costume.lib.stores.object import ObjectStoreFactoryRegistry, \
    ObjectStoreFactory

from costume.lib.stores.object.omeka.omeka_api_object_store import OmekaApiObjectStore
from costume.lib.stores.object.omeka.omeka_fs_object_store import OmekaFsObjectStore
from net.lab1318.costume.lib.python import PythonInterpreterFactory


injector = PythonInterpreterFactory.getInstance().getInjector()
object_store_factory_registry = injector.getInstance(ObjectStoreFactoryRegistry)


class __PyObjectStoreFactory(ObjectStoreFactory):
    def __init__(self, class_):
        self.__class_ = class_

    def createObjectStore(self, parameters, properties, uri):
        kwds = {}
        for entry in parameters.entrySet():
            kwds[entry.getKey()] = entry.getValue()
        return self.__class(properties=properties, uri=uri, **kwds)


object_store_factory_registry.registerObjectStoreFactory(__PyObjectStoreFactory(OmekaApiObjectStore), 'omekaapi')
object_store_factory_registry.registerObjectStoreFactory(__PyObjectStoreFactory(OmekaFsObjectStore), 'omekafs')
