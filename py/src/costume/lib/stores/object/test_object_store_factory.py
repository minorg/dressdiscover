from net.lab1318.costume.lib.stores.object import ObjectStoreFactory, \
    ObjectStoreFactoryRegistry


class TestObjectStoreFactory(ObjectStoreFactory):
    def createObjectStore(self, url):
        return None


ObjectStoreFactoryRegistry.getInstance().registerObjectStoreFactory(TestObjectStoreFactory(), 'test')  # @UndefinedVariable
