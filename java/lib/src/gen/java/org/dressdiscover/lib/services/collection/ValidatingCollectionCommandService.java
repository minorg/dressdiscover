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
        {
            if (id == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.collection.ValidatingCollectionCommandService.deleteCollectionById: id is missing");
            }
        }
        delegate.deleteCollectionById(id);
    }

    @Override
    public final void deleteCollectionsByInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        {
            if (institutionId == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.collection.ValidatingCollectionCommandService.deleteCollectionsByInstitutionId: institutionId is missing");
            }
        }
        delegate.deleteCollectionsByInstitutionId(institutionId);
    }

    @Override
    public final void putCollection(final org.dressdiscover.api.models.collection.Collection collection, final org.dressdiscover.api.models.collection.CollectionId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        {
            if (collection == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.collection.ValidatingCollectionCommandService.putCollection: collection is missing");
            }
        }
        {
            if (id == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.collection.ValidatingCollectionCommandService.putCollection: id is missing");
            }
        }
        delegate.putCollection(collection, id);
    }

    private final org.dressdiscover.api.services.collection.CollectionCommandService delegate;
}
