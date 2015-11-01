package net.lab1318.costume.lib.services.object;

@com.google.inject.Singleton
public class ValidatingObjectQueryService implements net.lab1318.costume.api.services.object.ObjectQueryService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("net.lab1318.costume.lib.services.object.ValidatingObjectQueryService.delegate");

    @com.google.inject.Inject
    public ValidatingObjectQueryService(@com.google.inject.name.Named("net.lab1318.costume.lib.services.object.ValidatingObjectQueryService.delegate") net.lab1318.costume.api.services.object.ObjectQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final net.lab1318.costume.api.models.object.Object getObjectById(final net.lab1318.costume.api.models.object.ObjectId id) throws net.lab1318.costume.api.services.object.InvalidObjectIdException, net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.object.NoSuchObjectException {
        _validateGetObjectByIdParameters(id);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getObjectById(id), "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectById: missing returnValue");
    }

    protected void _validateGetObjectByIdParameters(final net.lab1318.costume.api.models.object.ObjectId id) {
        com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectById: missing id");
    }

    @Override
    public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> getObjects() throws net.lab1318.costume.api.services.IoException {
        return com.google.common.base.Preconditions.checkNotNull(delegate.getObjects(), "net.lab1318.costume.api.services.object.ObjectQueryService.getObjects: missing returnValue");
    }

    @Override
    public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> getObjectsByCollectionId(final net.lab1318.costume.api.models.collection.CollectionId collectionId) throws net.lab1318.costume.api.services.IoException {
        _validateGetObjectsByCollectionIdParameters(collectionId);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getObjectsByCollectionId(collectionId), "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectsByCollectionId: missing returnValue");
    }

    protected void _validateGetObjectsByCollectionIdParameters(final net.lab1318.costume.api.models.collection.CollectionId collectionId) {
        com.google.common.base.Preconditions.checkNotNull(collectionId, "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectsByCollectionId: missing collectionId");
    }

    @Override
    public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> getObjectsByInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) throws net.lab1318.costume.api.services.IoException {
        _validateGetObjectsByInstitutionIdParameters(institutionId);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getObjectsByInstitutionId(institutionId), "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectsByInstitutionId: missing returnValue");
    }

    protected void _validateGetObjectsByInstitutionIdParameters(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
        com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectsByInstitutionId: missing institutionId");
    }

    private final net.lab1318.costume.api.services.object.ObjectQueryService delegate;
}
