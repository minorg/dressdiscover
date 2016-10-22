package org.dressdiscover.lib.services.object;

@com.google.inject.Singleton
public class ValidatingObjectQueryService implements org.dressdiscover.api.services.object.ObjectQueryService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.object.ValidatingObjectQueryService.delegate");

    @com.google.inject.Inject
    public ValidatingObjectQueryService(@com.google.inject.name.Named("org.dressdiscover.lib.services.object.ValidatingObjectQueryService.delegate") org.dressdiscover.api.services.object.ObjectQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final org.dressdiscover.api.models.object.Object getObjectById(final org.dressdiscover.api.models.object.ObjectId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.collection.NoSuchCollectionException, org.dressdiscover.api.services.institution.NoSuchInstitutionException, org.dressdiscover.api.services.object.NoSuchObjectException {
        _validateGetObjectByIdParameters(id);
        return org.dressdiscover.api.services.object.ObjectQueryService.Messages.GetObjectByIdResponse.DefaultConstructionValidator.getInstance().validateReturnValue(delegate.getObjectById(id));
    }

    protected void _validateGetObjectByIdParameters(final org.dressdiscover.api.models.object.ObjectId id) {
        org.dressdiscover.api.services.object.ObjectQueryService.Messages.GetObjectByIdRequest.DefaultConstructionValidator.getInstance().validateId(id);
    }

    @Override
    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.Object> getObjectsByCollectionId(final org.dressdiscover.api.models.collection.CollectionId id) throws org.dressdiscover.api.services.IoException {
        _validateGetObjectsByCollectionIdParameters(id);
        return org.dressdiscover.api.services.object.ObjectQueryService.Messages.GetObjectsByCollectionIdResponse.DefaultConstructionValidator.getInstance().validateReturnValue(delegate.getObjectsByCollectionId(id));
    }

    protected void _validateGetObjectsByCollectionIdParameters(final org.dressdiscover.api.models.collection.CollectionId id) {
        org.dressdiscover.api.services.object.ObjectQueryService.Messages.GetObjectsByCollectionIdRequest.DefaultConstructionValidator.getInstance().validateId(id);
    }

    private final org.dressdiscover.api.services.object.ObjectQueryService delegate;
}
