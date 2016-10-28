from org.dressdiscover.lib.stores.object import ObjectStore


class _PyObjectStore(ObjectStore):
    def getObjectById(self, logger, log_marker, object_id):
        return self._get_object_by_id(logger, log_marker, object_id)

    def getObjectsByCollectionId(self, collection_id, logger, log_marker):
        return self._get_objects_by_collection_id(collection_id, logger, log_marker)
