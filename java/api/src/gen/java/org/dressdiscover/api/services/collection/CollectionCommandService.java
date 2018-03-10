package org.dressdiscover.api.services.collection;

public interface CollectionCommandService {
    public enum FunctionMetadata {
        DELETE_COLLECTION_BY_ID("delete_collection_by_id"),
        DELETE_COLLECTIONS_BY_INSTITUTION_ID("delete_collections_by_institution_id"),
        PUT_COLLECTION("put_collection");

        public String getThriftName() {
            return thriftName;
        }

        private FunctionMetadata(final String thriftName) {
            this.thriftName = thriftName;
        }

        private final String thriftName;
    }

    public void deleteCollectionById(final org.dressdiscover.api.models.collection.CollectionId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.collection.NoSuchCollectionException, org.dressdiscover.api.services.institution.NoSuchInstitutionException;

    public void deleteCollectionsByInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException;

    public void putCollection(final org.dressdiscover.api.models.collection.Collection collection, final org.dressdiscover.api.models.collection.CollectionId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException;
}
