package org.dressdiscover.lib.services.collection;

@com.google.inject.Singleton
public class ValidatingCollectionCommandService implements org.dressdiscover.api.services.collection.CollectionCommandService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.collection.ValidatingCollectionCommandService.delegate");

    @com.google.inject.Inject
    public ValidatingCollectionCommandService(@com.google.inject.name.Named("org.dressdiscover.lib.services.collection.ValidatingCollectionCommandService.delegate") org.dressdiscover.api.services.collection.CollectionCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final void deleteCollectionById(final org.dressdiscover.api.models.collection.CollectionId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.collection.NoSuchCollectionException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        _validateDeleteCollectionByIdParameters(id);
        delegate.deleteCollectionById(id);
    }

    protected void _validateDeleteCollectionByIdParameters(final org.dressdiscover.api.models.collection.CollectionId id) {
        com.google.common.base.Preconditions.checkNotNull(id, "org.dressdiscover.api.services.collection.CollectionCommandService.deleteCollectionById: missing id");
    }

    @Override
    public final void deleteCollectionsByInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        _validateDeleteCollectionsByInstitutionIdParameters(institutionId);
        delegate.deleteCollectionsByInstitutionId(institutionId);
    }

    protected void _validateDeleteCollectionsByInstitutionIdParameters(final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
        com.google.common.base.Preconditions.checkNotNull(institutionId, "org.dressdiscover.api.services.collection.CollectionCommandService.deleteCollectionsByInstitutionId: missing institutionId");
    }

    @Override
    public final void putCollection(final org.dressdiscover.api.models.collection.CollectionId id, final org.dressdiscover.api.models.collection.Collection collection) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        _validatePutCollectionParameters(id, collection);
        delegate.putCollection(id, collection);
    }

    protected void _validatePutCollectionParameters(final org.dressdiscover.api.models.collection.CollectionId id, final org.dressdiscover.api.models.collection.Collection collection) {
        com.google.common.base.Preconditions.checkNotNull(id, "org.dressdiscover.api.services.collection.CollectionCommandService.putCollection: missing id");
        com.google.common.base.Preconditions.checkNotNull(collection, "org.dressdiscover.api.services.collection.CollectionCommandService.putCollection: missing collection");
    }

    private final org.dressdiscover.api.services.collection.CollectionCommandService delegate;
}
