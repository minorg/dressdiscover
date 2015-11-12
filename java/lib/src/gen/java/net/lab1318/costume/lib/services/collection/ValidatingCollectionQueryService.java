package net.lab1318.costume.lib.services.collection;

@com.google.inject.Singleton
public class ValidatingCollectionQueryService implements net.lab1318.costume.api.services.collection.CollectionQueryService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("net.lab1318.costume.lib.services.collection.ValidatingCollectionQueryService.delegate");

    @com.google.inject.Inject
    public ValidatingCollectionQueryService(@com.google.inject.name.Named("net.lab1318.costume.lib.services.collection.ValidatingCollectionQueryService.delegate") net.lab1318.costume.api.services.collection.CollectionQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final net.lab1318.costume.api.models.collection.Collection getCollectionById(final net.lab1318.costume.api.models.collection.CollectionId id) throws net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.collection.NoSuchCollectionException {
        _validateGetCollectionByIdParameters(id);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getCollectionById(id), "net.lab1318.costume.api.services.collection.CollectionQueryService.getCollectionById: missing returnValue");
    }

    protected void _validateGetCollectionByIdParameters(final net.lab1318.costume.api.models.collection.CollectionId id) {
        com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.services.collection.CollectionQueryService.getCollectionById: missing id");
    }

    @Override
    public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.collection.CollectionEntry> getCollections() throws net.lab1318.costume.api.services.IoException {
        return com.google.common.base.Preconditions.checkNotNull(delegate.getCollections(), "net.lab1318.costume.api.services.collection.CollectionQueryService.getCollections: missing returnValue");
    }

    @Override
    public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.collection.Collection> getCollectionsByIds(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.collection.CollectionId> ids) throws net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.collection.NoSuchCollectionException {
        _validateGetCollectionsByIdsParameters(ids);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getCollectionsByIds(ids), "net.lab1318.costume.api.services.collection.CollectionQueryService.getCollectionsByIds: missing returnValue");
    }

    protected void _validateGetCollectionsByIdsParameters(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.collection.CollectionId> ids) {
        com.google.common.base.Preconditions.checkNotNull(ids, "net.lab1318.costume.api.services.collection.CollectionQueryService.getCollectionsByIds: missing ids");
    }

    @Override
    public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.collection.CollectionEntry> getCollectionsByInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) throws net.lab1318.costume.api.services.IoException {
        _validateGetCollectionsByInstitutionIdParameters(institutionId);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getCollectionsByInstitutionId(institutionId), "net.lab1318.costume.api.services.collection.CollectionQueryService.getCollectionsByInstitutionId: missing returnValue");
    }

    protected void _validateGetCollectionsByInstitutionIdParameters(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
        com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.services.collection.CollectionQueryService.getCollectionsByInstitutionId: missing institutionId");
    }

    private final net.lab1318.costume.api.services.collection.CollectionQueryService delegate;
}
