package org.dressdiscover.lib.services.object;

@com.google.inject.Singleton
public class ValidatingObjectQueryService implements org.dressdiscover.api.services.object.ObjectQueryService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.object.ValidatingObjectQueryService.delegate");

    @com.google.inject.Inject
    public ValidatingObjectQueryService(@com.google.inject.name.Named("org.dressdiscover.lib.services.object.ValidatingObjectQueryService.delegate") org.dressdiscover.api.services.object.ObjectQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final org.dressdiscover.api.models.object.Object getObjectById(final org.dressdiscover.api.models.object.ObjectId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.collection.NoSuchCollectionException, org.dressdiscover.api.services.institution.NoSuchInstitutionException, org.dressdiscover.api.services.object.NoSuchObjectException {
        org.dressdiscover.api.services.object.ObjectQueryService.Messages.GetObjectByIdRequest.UncheckedValidator.validate(id);
        final org.dressdiscover.api.models.object.Object __returnValue = delegate.getObjectById(id);
        org.dressdiscover.api.services.object.ObjectQueryService.Messages.GetObjectByIdResponse.UncheckedValidator.validateReturnValue(__returnValue);
        return __returnValue;
    }

    private final org.dressdiscover.api.services.object.ObjectQueryService delegate;
}
