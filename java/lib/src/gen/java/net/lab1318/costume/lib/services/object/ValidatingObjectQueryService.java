package net.lab1318.costume.lib.services.object;

@com.google.inject.Singleton
public class ValidatingObjectQueryService implements net.lab1318.costume.api.services.object.ObjectQueryService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("net.lab1318.costume.lib.services.object.ValidatingObjectQueryService.delegate");

    @com.google.inject.Inject
    public ValidatingObjectQueryService(@com.google.inject.name.Named("net.lab1318.costume.lib.services.object.ValidatingObjectQueryService.delegate") net.lab1318.costume.api.services.object.ObjectQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final net.lab1318.costume.api.models.object.Object getObjectById(final net.lab1318.costume.api.models.object.ObjectId id) throws net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.object.NoSuchObjectException {
        _validateGetObjectByIdParameters(id);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getObjectById(id), "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectById: missing returnValue");
    }

    protected void _validateGetObjectByIdParameters(final net.lab1318.costume.api.models.object.ObjectId id) {
        com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectById: missing id");
    }

    @Override
    public final com.google.common.primitives.UnsignedInteger getObjectCount() throws net.lab1318.costume.api.services.IoException {
        return com.google.common.base.Preconditions.checkNotNull(delegate.getObjectCount(), "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectCount: missing returnValue");
    }

    @Override
    public final com.google.common.primitives.UnsignedInteger getObjectCountByCollectionId(final net.lab1318.costume.api.models.collection.CollectionId collectionId) throws net.lab1318.costume.api.services.IoException {
        _validateGetObjectCountByCollectionIdParameters(collectionId);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getObjectCountByCollectionId(collectionId), "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectCountByCollectionId: missing returnValue");
    }

    protected void _validateGetObjectCountByCollectionIdParameters(final net.lab1318.costume.api.models.collection.CollectionId collectionId) {
        com.google.common.base.Preconditions.checkNotNull(collectionId, "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectCountByCollectionId: missing collectionId");
    }

    @Override
    public final com.google.common.primitives.UnsignedInteger getObjectCountByInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) throws net.lab1318.costume.api.services.IoException {
        _validateGetObjectCountByInstitutionIdParameters(institutionId);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getObjectCountByInstitutionId(institutionId), "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectCountByInstitutionId: missing returnValue");
    }

    protected void _validateGetObjectCountByInstitutionIdParameters(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
        com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectCountByInstitutionId: missing institutionId");
    }

    @Override
    public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> getObjects(final com.google.common.primitives.UnsignedInteger from, final com.google.common.primitives.UnsignedInteger size) throws net.lab1318.costume.api.services.IoException {
        _validateGetObjectsParameters(from, size);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getObjects(from, size), "net.lab1318.costume.api.services.object.ObjectQueryService.getObjects: missing returnValue");
    }

    protected void _validateGetObjectsParameters(final com.google.common.primitives.UnsignedInteger from, final com.google.common.primitives.UnsignedInteger size) {
        com.google.common.base.Preconditions.checkNotNull(from, "net.lab1318.costume.api.services.object.ObjectQueryService.getObjects: missing from");
        com.google.common.base.Preconditions.checkNotNull(size, "net.lab1318.costume.api.services.object.ObjectQueryService.getObjects: missing size");
    }

    @Override
    public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> getObjectsByCollectionId(final net.lab1318.costume.api.models.collection.CollectionId collectionId, final com.google.common.primitives.UnsignedInteger from, final com.google.common.primitives.UnsignedInteger size) throws net.lab1318.costume.api.services.IoException {
        _validateGetObjectsByCollectionIdParameters(collectionId, from, size);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getObjectsByCollectionId(collectionId, from, size), "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectsByCollectionId: missing returnValue");
    }

    protected void _validateGetObjectsByCollectionIdParameters(final net.lab1318.costume.api.models.collection.CollectionId collectionId, final com.google.common.primitives.UnsignedInteger from, final com.google.common.primitives.UnsignedInteger size) {
        com.google.common.base.Preconditions.checkNotNull(collectionId, "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectsByCollectionId: missing collectionId");
        com.google.common.base.Preconditions.checkNotNull(from, "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectsByCollectionId: missing from");
        com.google.common.base.Preconditions.checkNotNull(size, "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectsByCollectionId: missing size");
    }

    @Override
    public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> getObjectsByInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final com.google.common.primitives.UnsignedInteger from, final com.google.common.primitives.UnsignedInteger size) throws net.lab1318.costume.api.services.IoException {
        _validateGetObjectsByInstitutionIdParameters(institutionId, from, size);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getObjectsByInstitutionId(institutionId, from, size), "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectsByInstitutionId: missing returnValue");
    }

    protected void _validateGetObjectsByInstitutionIdParameters(final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final com.google.common.primitives.UnsignedInteger from, final com.google.common.primitives.UnsignedInteger size) {
        com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectsByInstitutionId: missing institutionId");
        com.google.common.base.Preconditions.checkNotNull(from, "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectsByInstitutionId: missing from");
        com.google.common.base.Preconditions.checkNotNull(size, "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectsByInstitutionId: missing size");
    }

    private final net.lab1318.costume.api.services.object.ObjectQueryService delegate;
}
