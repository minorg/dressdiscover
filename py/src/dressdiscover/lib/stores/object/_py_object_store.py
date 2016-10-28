import traceback

from org.dressdiscover.api.services import IoException
from org.dressdiscover.api.services.object import NoSuchObjectException
from org.dressdiscover.lib.stores.object import ObjectStore
from org.thryft.waf.lib.stores import InvalidModelException


class _PyObjectStore(ObjectStore):
    def getObjectById(self, logger, log_marker, object_id):
        try:
            return self._get_object_by_id(logger, log_marker, object_id)
        except (InvalidModelException, IoException, NoSuchObjectException):
            raise
        except:
            traceback.print_exc()
            raise IoException.create("Python exception")

    def getObjectsByCollectionId(self, collection_id, logger, log_marker):
        return self._get_objects_by_collection_id(collection_id, logger, log_marker)
