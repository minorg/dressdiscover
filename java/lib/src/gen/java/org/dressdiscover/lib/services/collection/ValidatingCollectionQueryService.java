package org.dressdiscover.lib.services.collection;

@com.google.inject.Singleton
public class ValidatingCollectionQueryService implements org.dressdiscover.api.services.collection.CollectionQueryService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.collection.ValidatingCollectionQueryService.delegate");

    @com.google.inject.Inject
    public ValidatingCollectionQueryService(@com.google.inject.name.Named("org.dressdiscover.lib.services.collection.ValidatingCollectionQueryService.delegate") org.dressdiscover.api.services.collection.CollectionQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final org.dressdiscover.api.models.collection.Collection getCollectionById(final net.lab1318.costume.api.models.collection.CollectionId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.collection.NoSuchCollectionException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        _validateGetCollectionByIdParameters(id);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getCollectionById(id), "org.dressdiscover.api.services.collection.CollectionQueryService.getCollectionById: missing returnValue");
    }

    protected void _validateGetCollectionByIdParameters(final net.lab1318.costume.api.models.collection.CollectionId id) {
        com.google.common.base.Preconditions.checkNotNull(id, "org.dressdiscover.api.services.collection.CollectionQueryService.getCollectionById: missing id");
    }

    @Override
    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.collection.Collection> getCollectionsByIds(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.collection.CollectionId> ids) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.collection.NoSuchCollectionException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        _validateGetCollectionsByIdsParameters(ids);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getCollectionsByIds(ids), "org.dressdiscover.api.services.collection.CollectionQueryService.getCollectionsByIds: missing returnValue");
    }

    protected void _validateGetCollectionsByIdsParameters(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.collection.CollectionId> ids) {
        com.google.common.base.Preconditions.checkNotNull(ids, "org.dressdiscover.api.services.collection.CollectionQueryService.getCollectionsByIds: missing ids");
    }

    @Override
    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.collection.CollectionEntry> getCollectionsByInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        _validateGetCollectionsByInstitutionIdParameters(institutionId);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getCollectionsByInstitutionId(institutionId), "org.dressdiscover.api.services.collection.CollectionQueryService.getCollectionsByInstitutionId: missing returnValue");
    }

    protected void _validateGetCollectionsByInstitutionIdParameters(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
        com.google.common.base.Preconditions.checkNotNull(institutionId, "org.dressdiscover.api.services.collection.CollectionQueryService.getCollectionsByInstitutionId: missing institutionId");
    }

    private final org.dressdiscover.api.services.collection.CollectionQueryService delegate;
}
