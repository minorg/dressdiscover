package net.lab1318.costume.lib.services.object;

@com.google.inject.Singleton
public class ValidatingObjectCommandService implements net.lab1318.costume.api.services.object.ObjectCommandService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("net.lab1318.costume.lib.services.object.ValidatingObjectCommandService.delegate");

    @com.google.inject.Inject
    public ValidatingObjectCommandService(@com.google.inject.name.Named("net.lab1318.costume.lib.services.object.ValidatingObjectCommandService.delegate") net.lab1318.costume.api.services.object.ObjectCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final void deleteObjects() throws net.lab1318.costume.api.services.IoException {
        delegate.deleteObjects();
    }

    @Override
    public final void deleteObjectsByCollectionId(final net.lab1318.costume.api.models.collection.CollectionId collectionId) throws net.lab1318.costume.api.services.IoException {
        _validateDeleteObjectsByCollectionIdParameters(collectionId);
        delegate.deleteObjectsByCollectionId(collectionId);
    }

    protected void _validateDeleteObjectsByCollectionIdParameters(final net.lab1318.costume.api.models.collection.CollectionId collectionId) {
        com.google.common.base.Preconditions.checkNotNull(collectionId, "net.lab1318.costume.api.services.object.ObjectCommandService.deleteObjectsByCollectionId: missing collectionId");
    }

    @Override
    public final void deleteObjectsByInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) throws net.lab1318.costume.api.services.IoException {
        _validateDeleteObjectsByInstitutionIdParameters(institutionId);
        delegate.deleteObjectsByInstitutionId(institutionId);
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

    private final net.lab1318.costume.api.services.object.ObjectCommandService delegate;
}