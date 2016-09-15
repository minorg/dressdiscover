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
        _validateGetCollectionByIdParameters(id);
        return org.dressdiscover.api.services.collection.CollectionQueryService.Messages.GetCollectionByIdResponse.DefaultConstructionValidator.getInstance().validateReturnValue(delegate.getCollectionById(id));
    }

    protected void _validateGetCollectionByIdParameters(final org.dressdiscover.api.models.collection.CollectionId id) {
        org.dressdiscover.api.services.collection.CollectionQueryService.Messages.GetCollectionByIdRequest.DefaultConstructionValidator.getInstance().validateId(id);
    }

    @Override
    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.collection.Collection> getCollectionsByIds(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.collection.CollectionId> ids) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.collection.NoSuchCollectionException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        _validateGetCollectionsByIdsParameters(ids);
        return org.dressdiscover.api.services.collection.CollectionQueryService.Messages.GetCollectionsByIdsResponse.DefaultConstructionValidator.getInstance().validateReturnValue(delegate.getCollectionsByIds(ids));
    }

    protected void _validateGetCollectionsByIdsParameters(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.collection.CollectionId> ids) {
        org.dressdiscover.api.services.collection.CollectionQueryService.Messages.GetCollectionsByIdsRequest.DefaultConstructionValidator.getInstance().validateIds(ids);
    }

    @Override
    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.collection.CollectionEntry> getCollectionsByInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        _validateGetCollectionsByInstitutionIdParameters(institutionId);
        return org.dressdiscover.api.services.collection.CollectionQueryService.Messages.GetCollectionsByInstitutionIdResponse.DefaultConstructionValidator.getInstance().validateReturnValue(delegate.getCollectionsByInstitutionId(institutionId));
    }

    protected void _validateGetCollectionsByInstitutionIdParameters(final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
        org.dressdiscover.api.services.collection.CollectionQueryService.Messages.GetCollectionsByInstitutionIdRequest.DefaultConstructionValidator.getInstance().validateInstitutionId(institutionId);
    }

    private final org.dressdiscover.api.services.collection.CollectionQueryService delegate;
}
