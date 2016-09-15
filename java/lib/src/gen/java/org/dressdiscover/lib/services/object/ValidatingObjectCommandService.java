package org.dressdiscover.lib.services.object;

@com.google.inject.Singleton
public class ValidatingObjectCommandService implements org.dressdiscover.api.services.object.ObjectCommandService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.object.ValidatingObjectCommandService.delegate");

    @com.google.inject.Inject
    public ValidatingObjectCommandService(@com.google.inject.name.Named("org.dressdiscover.lib.services.object.ValidatingObjectCommandService.delegate") org.dressdiscover.api.services.object.ObjectCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final com.google.common.primitives.UnsignedInteger deleteObjectsByCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.collection.NoSuchCollectionException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        _validateDeleteObjectsByCollectionIdParameters(collectionId);
        return org.dressdiscover.api.services.object.ObjectCommandService.Messages.DeleteObjectsByCollectionIdResponse.DefaultConstructionValidator.getInstance().validateReturnValue(delegate.deleteObjectsByCollectionId(collectionId));
    }

    protected void _validateDeleteObjectsByCollectionIdParameters(final org.dressdiscover.api.models.collection.CollectionId collectionId) {
        org.dressdiscover.api.services.object.ObjectCommandService.Messages.DeleteObjectsByCollectionIdRequest.DefaultConstructionValidator.getInstance().validateCollectionId(collectionId);
    }

    @Override
    public final void putObject(final org.dressdiscover.api.models.object.ObjectId id, final org.dressdiscover.api.models.object.Object object) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.collection.NoSuchCollectionException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        _validatePutObjectParameters(id, object);
        delegate.putObject(id, object);
    }

    protected void _validatePutObjectParameters(final org.dressdiscover.api.models.object.ObjectId id, final org.dressdiscover.api.models.object.Object object) {
        org.dressdiscover.api.services.object.ObjectCommandService.Messages.PutObjectRequest.DefaultConstructionValidator.getInstance().validateId(id);
        org.dressdiscover.api.services.object.ObjectCommandService.Messages.PutObjectRequest.DefaultConstructionValidator.getInstance().validateObject(object);
    }

    @Override
    public final void putObjects(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectEntry> objects) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.collection.NoSuchCollectionException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        _validatePutObjectsParameters(objects);
        delegate.putObjects(objects);
    }

    protected void _validatePutObjectsParameters(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectEntry> objects) {
        org.dressdiscover.api.services.object.ObjectCommandService.Messages.PutObjectsRequest.DefaultConstructionValidator.getInstance().validateObjects(objects);
    }

    @Override
    public final void resummarizeObjects() throws org.dressdiscover.api.services.IoException {
        delegate.resummarizeObjects();
    }

    private final org.dressdiscover.api.services.object.ObjectCommandService delegate;
}
