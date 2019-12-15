import traceback

from org.dressdiscover.api.services import IoException
from org.dressdiscover.api.services.collection import NoSuchCollectionException
from org.dressdiscover.lib.stores.collection import CollectionStore
from org.thryft.waf.lib.stores import InvalidModelException


class _PyCollectionStore(CollectionStore):
    def getCollectionById(self, collectionId, logger, logMarker):
        try:
            return self._get_collection_by_id(collectionId, logger, logMarker)
        except (InvalidModelException, IoException, NoSuchCollectionException):
            raise
        except:
            traceback.print_exc()
            raise IoException.create("Python exception")

    def getCollectionsByInstitutionId(self, institutionId, logger, logMarker):
        try:
            return self._get_collections_by_institution_id(institutionId, logger, logMarker)
        except IoException:
            raise
        except:
            traceback.print_exc()
            raise IoException.create("Python exception")
