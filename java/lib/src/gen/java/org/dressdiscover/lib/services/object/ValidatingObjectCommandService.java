package org.dressdiscover.lib.services.object;

@com.google.inject.Singleton
public class ValidatingObjectCommandService implements org.dressdiscover.api.services.object.ObjectCommandService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.object.ValidatingObjectCommandService.delegate");

    @com.google.inject.Inject
    public ValidatingObjectCommandService(@com.google.inject.name.Named("org.dressdiscover.lib.services.object.ValidatingObjectCommandService.delegate") org.dressdiscover.api.services.object.ObjectCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final int deleteObjectsByCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.collection.NoSuchCollectionException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        {
            if (collectionId == null) {
                throw new NullPointerException("org.dressdiscover.api.services.object.ValidatingObjectCommandService.deleteObjectsByCollectionId: collectionId is null");
            }
        }
        return delegate.deleteObjectsByCollectionId(collectionId);
    }

    @Override
    public final void putObject(final org.dressdiscover.api.models.object.ObjectId id, final org.dressdiscover.api.models.object.Object object) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.collection.NoSuchCollectionException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        {
            if (id == null) {
                throw new NullPointerException("org.dressdiscover.api.services.object.ValidatingObjectCommandService.putObject: id is null");
            }
        }
        {
            if (object == null) {
                throw new NullPointerException("org.dressdiscover.api.services.object.ValidatingObjectCommandService.putObject: object is null");
            }
        }
        delegate.putObject(id, object);
    }

    @Override
    public final void putObjects(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectEntry> objects) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.collection.NoSuchCollectionException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        {
            if (objects == null) {
                throw new NullPointerException("org.dressdiscover.api.services.object.ValidatingObjectCommandService.putObjects: objects is null");
            }
        }
        delegate.putObjects(objects);
    }

    @Override
    public final void resummarizeObjects() throws org.dressdiscover.api.services.IoException {

        delegate.resummarizeObjects();
    }

    private final org.dressdiscover.api.services.object.ObjectCommandService delegate;
}
