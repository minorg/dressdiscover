package net.lab1318.costume.lib.services.collection;

@com.google.inject.Singleton
public class ValidatingCollectionCommandService implements net.lab1318.costume.api.services.collection.CollectionCommandService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("net.lab1318.costume.lib.services.collection.ValidatingCollectionCommandService.delegate");

    @com.google.inject.Inject
    public ValidatingCollectionCommandService(@com.google.inject.name.Named("net.lab1318.costume.lib.services.collection.ValidatingCollectionCommandService.delegate") net.lab1318.costume.api.services.collection.CollectionCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final void deleteCollectionById(final net.lab1318.costume.api.models.collection.CollectionId id) throws net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.collection.NoSuchCollectionException, net.lab1318.costume.api.services.institution.NoSuchInstitutionException {
        _validateDeleteCollectionByIdParameters(id);
        delegate.deleteCollectionById(id);
    }

    protected void _validateDeleteCollectionByIdParameters(final net.lab1318.costume.api.models.collection.CollectionId id) {
        com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.services.collection.CollectionCommandService.deleteCollectionById: missing id");
    }

    @Override
    public final void deleteCollectionsByInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) throws net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.institution.NoSuchInstitutionException {
        _validateDeleteCollectionsByInstitutionIdParameters(institutionId);
        delegate.deleteCollectionsByInstitutionId(institutionId);
    }

    protected void _validateDeleteCollectionsByInstitutionIdParameters(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
        com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.services.collection.CollectionCommandService.deleteCollectionsByInstitutionId: missing institutionId");
    }

    @Override
    public final void putCollection(final net.lab1318.costume.api.models.collection.CollectionId id, final net.lab1318.costume.api.models.collection.Collection collection) throws net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.institution.NoSuchInstitutionException {
        _validatePutCollectionParameters(id, collection);
        delegate.putCollection(id, collection);
    }

    protected void _validatePutCollectionParameters(final net.lab1318.costume.api.models.collection.CollectionId id, final net.lab1318.costume.api.models.collection.Collection collection) {
        com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.services.collection.CollectionCommandService.putCollection: missing id");
        com.google.common.base.Preconditions.checkNotNull(collection, "net.lab1318.costume.api.services.collection.CollectionCommandService.putCollection: missing collection");
    }

    private final net.lab1318.costume.api.services.collection.CollectionCommandService delegate;
}
