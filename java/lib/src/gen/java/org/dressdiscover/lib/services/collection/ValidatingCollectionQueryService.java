package org.dressdiscover.lib.services.collection;

@com.google.inject.Singleton
public class ValidatingCollectionQueryService implements org.dressdiscover.api.services.collection.CollectionQueryService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.collection.ValidatingCollectionQueryService.delegate");

    @com.google.inject.Inject
    public ValidatingCollectionQueryService(@com.google.inject.name.Named("org.dressdiscover.lib.services.collection.ValidatingCollectionQueryService.delegate") org.dressdiscover.api.services.collection.CollectionQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final org.dressdiscover.api.models.collection.Collection getCollectionById(final org.dressdiscover.api.models.collection.CollectionId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.collection.NoSuchCollectionException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        {
            if (id == null) {
                throw new NullPointerException("org.dressdiscover.api.services.collection.ValidatingCollectionQueryService.getCollectionById: id is null");
            }
        }
        final org.dressdiscover.api.models.collection.Collection __returnValue = delegate.getCollectionById(id);
        {
            if (__returnValue == null) {
                throw new NullPointerException("org.dressdiscover.api.services.collection.ValidatingCollectionQueryService.getCollectionById: __returnValue is null");
            }
        }
        return __returnValue;
    }

    @Override
    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.collection.Collection> getCollectionsByIds(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.collection.CollectionId> ids) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.collection.NoSuchCollectionException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        {
            if (ids == null) {
                throw new NullPointerException("org.dressdiscover.api.services.collection.ValidatingCollectionQueryService.getCollectionsByIds: ids is null");
            }
        }
        final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.collection.Collection> __returnValue = delegate.getCollectionsByIds(ids);
        {
            if (__returnValue == null) {
                throw new NullPointerException("org.dressdiscover.api.services.collection.ValidatingCollectionQueryService.getCollectionsByIds: __returnValue is null");
            }
        }
        return __returnValue;
    }

    @Override
    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.collection.CollectionEntry> getCollectionsByInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        {
            if (institutionId == null) {
                throw new NullPointerException("org.dressdiscover.api.services.collection.ValidatingCollectionQueryService.getCollectionsByInstitutionId: institutionId is null");
            }
        }
        final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.collection.CollectionEntry> __returnValue = delegate.getCollectionsByInstitutionId(institutionId);
        {
            if (__returnValue == null) {
                throw new NullPointerException("org.dressdiscover.api.services.collection.ValidatingCollectionQueryService.getCollectionsByInstitutionId: __returnValue is null");
            }
        }
        return __returnValue;
    }

    private final org.dressdiscover.api.services.collection.CollectionQueryService delegate;
}
