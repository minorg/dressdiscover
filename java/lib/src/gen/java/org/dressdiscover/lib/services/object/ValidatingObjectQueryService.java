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
        {
            if (id == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.object.ValidatingObjectQueryService.getObjectById: id is missing");
            }
        }
        final org.dressdiscover.api.models.object.Object __returnValue = delegate.getObjectById(id);
        {
            if (__returnValue == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.object.ValidatingObjectQueryService.getObjectById: __returnValue is missing");
            }
        }
        return __returnValue;
    }

    private final org.dressdiscover.api.services.object.ObjectQueryService delegate;
}
