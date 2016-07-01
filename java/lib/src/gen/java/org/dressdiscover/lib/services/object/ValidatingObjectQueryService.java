package org.dressdiscover.lib.services.object;

@com.google.inject.Singleton
public class ValidatingObjectQueryService implements org.dressdiscover.api.services.object.ObjectQueryService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.object.ValidatingObjectQueryService.delegate");

    @com.google.inject.Inject
    public ValidatingObjectQueryService(@com.google.inject.name.Named("org.dressdiscover.lib.services.object.ValidatingObjectQueryService.delegate") org.dressdiscover.api.services.object.ObjectQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final org.dressdiscover.api.models.object.Object getObjectById(final net.lab1318.costume.api.models.object.ObjectId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.collection.NoSuchCollectionException, org.dressdiscover.api.services.institution.NoSuchInstitutionException, org.dressdiscover.api.services.object.NoSuchObjectException {
        _validateGetObjectByIdParameters(id);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getObjectById(id), "org.dressdiscover.api.services.object.ObjectQueryService.getObjectById: missing returnValue");
    }

    protected void _validateGetObjectByIdParameters(final net.lab1318.costume.api.models.object.ObjectId id) {
        com.google.common.base.Preconditions.checkNotNull(id, "org.dressdiscover.api.services.object.ObjectQueryService.getObjectById: missing id");
    }

    private final org.dressdiscover.api.services.object.ObjectQueryService delegate;
}
