from org.dressdiscover.lib.stores.collection import CollectionStore


class _PyCollectionStore(CollectionStore):
    def getCollectionById(self, collectionId, logger, logMarker):
        return self._get_collection_by_id(collectionId, logger, logMarker)

    def getCollectionsByInstitutionId(self, institutionId, logger, logMarker):
        return self._get_collections_by_institution_id(institutionId, logger, logMarker)
