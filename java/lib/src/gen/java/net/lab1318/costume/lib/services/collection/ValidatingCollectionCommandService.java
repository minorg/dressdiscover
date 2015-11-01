package net.lab1318.costume.lib.services.collection;

@com.google.inject.Singleton
public class ValidatingCollectionCommandService implements net.lab1318.costume.api.services.collection.CollectionCommandService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("net.lab1318.costume.lib.services.collection.ValidatingCollectionCommandService.delegate");

    @com.google.inject.Inject
    public ValidatingCollectionCommandService(@com.google.inject.name.Named("net.lab1318.costume.lib.services.collection.ValidatingCollectionCommandService.delegate") net.lab1318.costume.api.services.collection.CollectionCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final void deleteCollections() throws net.lab1318.costume.api.services.IoException {
        delegate.deleteCollections();
    }

    @Override
    public final net.lab1318.costume.api.models.collection.CollectionId postCollection(final net.lab1318.costume.api.models.collection.Collection collection) throws net.lab1318.costume.api.services.IoException {
        _validatePostCollectionParameters(collection);
        return com.google.common.base.Preconditions.checkNotNull(delegate.postCollection(collection), "net.lab1318.costume.api.services.collection.CollectionCommandService.postCollection: missing returnValue");
    }

    protected void _validatePostCollectionParameters(final net.lab1318.costume.api.models.collection.Collection collection) {
        com.google.common.base.Preconditions.checkNotNull(collection, "net.lab1318.costume.api.services.collection.CollectionCommandService.postCollection: missing collection");
    }

    private final net.lab1318.costume.api.services.collection.CollectionCommandService delegate;
}
