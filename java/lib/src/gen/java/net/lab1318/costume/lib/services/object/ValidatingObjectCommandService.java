package net.lab1318.costume.lib.services.object;

@com.google.inject.Singleton
public class ValidatingObjectCommandService implements net.lab1318.costume.api.services.object.ObjectCommandService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("net.lab1318.costume.lib.services.object.ValidatingObjectCommandService.delegate");

    @com.google.inject.Inject
    public ValidatingObjectCommandService(@com.google.inject.name.Named("net.lab1318.costume.lib.services.object.ValidatingObjectCommandService.delegate") net.lab1318.costume.api.services.object.ObjectCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final com.google.common.primitives.UnsignedInteger deleteObjects() throws net.lab1318.costume.api.services.IoException {
        return com.google.common.base.Preconditions.checkNotNull(delegate.deleteObjects(), "net.lab1318.costume.api.services.object.ObjectCommandService.deleteObjects: missing returnValue");
    }

    @Override
    public final com.google.common.primitives.UnsignedInteger deleteObjectsByCollectionId(final net.lab1318.costume.api.models.collection.CollectionId collectionId) throws net.lab1318.costume.api.services.IoException {
        _validateDeleteObjectsByCollectionIdParameters(collectionId);
        return com.google.common.base.Preconditions.checkNotNull(delegate.deleteObjectsByCollectionId(collectionId), "net.lab1318.costume.api.services.object.ObjectCommandService.deleteObjectsByCollectionId: missing returnValue");
    }

    protected void _validateDeleteObjectsByCollectionIdParameters(final net.lab1318.costume.api.models.collection.CollectionId collectionId) {
        com.google.common.base.Preconditions.checkNotNull(collectionId, "net.lab1318.costume.api.services.object.ObjectCommandService.deleteObjectsByCollectionId: missing collectionId");
    }

    @Override
    public final com.google.common.primitives.UnsignedInteger deleteObjectsByInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) throws net.lab1318.costume.api.services.IoException {
        _validateDeleteObjectsByInstitutionIdParameters(institutionId);
        return com.google.common.base.Preconditions.checkNotNull(delegate.deleteObjectsByInstitutionId(institutionId), "net.lab1318.costume.api.services.object.ObjectCommandService.deleteObjectsByInstitutionId: missing returnValue");
    }

    protected void _validateDeleteObjectsByInstitutionIdParameters(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
        com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.services.object.ObjectCommandService.deleteObjectsByInstitutionId: missing institutionId");
    }

    @Override
    public final void putObject(final net.lab1318.costume.api.models.object.ObjectId id, final net.lab1318.costume.api.models.object.Object object) throws net.lab1318.costume.api.services.IoException {
        _validatePutObjectParameters(id, object);
        delegate.putObject(id, object);
    }

    protected void _validatePutObjectParameters(final net.lab1318.costume.api.models.object.ObjectId id, final net.lab1318.costume.api.models.object.Object object) {
        com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.services.object.ObjectCommandService.putObject: missing id");
        com.google.common.base.Preconditions.checkNotNull(object, "net.lab1318.costume.api.services.object.ObjectCommandService.putObject: missing object");
    }

    @Override
    public final void putObjects(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> objects) throws net.lab1318.costume.api.services.IoException {
        _validatePutObjectsParameters(objects);
        delegate.putObjects(objects);
    }

    protected void _validatePutObjectsParameters(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> objects) {
        com.google.common.base.Preconditions.checkNotNull(objects, "net.lab1318.costume.api.services.object.ObjectCommandService.putObjects: missing objects");
    }

    @Override
    public final void resummarizeObjects() throws net.lab1318.costume.api.services.IoException {
        delegate.resummarizeObjects();
    }

    private final net.lab1318.costume.api.services.object.ObjectCommandService delegate;
}
