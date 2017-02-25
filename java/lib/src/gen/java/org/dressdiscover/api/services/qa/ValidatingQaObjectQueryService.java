package org.dressdiscover.api.services.qa;

@com.google.inject.Singleton
public class ValidatingQaObjectQueryService implements org.dressdiscover.api.services.qa.QaObjectQueryService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.api.services.qa.ValidatingQaObjectQueryService.delegate");

    @com.google.inject.Inject
    public ValidatingQaObjectQueryService(@com.google.inject.name.Named("org.dressdiscover.api.services.qa.ValidatingQaObjectQueryService.delegate") org.dressdiscover.api.services.qa.QaObjectQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final org.dressdiscover.api.models.qa.QaObject getObjectById(final org.dressdiscover.api.models.qa.QaObjectId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.qa.NoSuchObjectException {
        _validateGetObjectByIdParameters(id);
        return org.dressdiscover.api.services.qa.QaObjectQueryService.Messages.GetObjectByIdResponse.DefaultConstructionValidator.getInstance().validateReturnValue(delegate.getObjectById(id));
    }

    protected void _validateGetObjectByIdParameters(final org.dressdiscover.api.models.qa.QaObjectId id) {
        org.dressdiscover.api.services.qa.QaObjectQueryService.Messages.GetObjectByIdRequest.DefaultConstructionValidator.getInstance().validateId(id);
    }

    @Override
    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> getObjects() throws org.dressdiscover.api.services.IoException {
        return org.dressdiscover.api.services.qa.QaObjectQueryService.Messages.GetObjectsResponse.DefaultConstructionValidator.getInstance().validateReturnValue(delegate.getObjects());
    }

    private final org.dressdiscover.api.services.qa.QaObjectQueryService delegate;
}
