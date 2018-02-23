package org.dressdiscover.lib.services.institution;

@com.google.inject.Singleton
public class ValidatingInstitutionQueryService implements org.dressdiscover.api.services.institution.InstitutionQueryService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.institution.ValidatingInstitutionQueryService.delegate");

    @com.google.inject.Inject
    public ValidatingInstitutionQueryService(@com.google.inject.name.Named("org.dressdiscover.lib.services.institution.ValidatingInstitutionQueryService.delegate") org.dressdiscover.api.services.institution.InstitutionQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final org.dressdiscover.api.models.institution.Institution getInstitutionById(final org.dressdiscover.api.models.institution.InstitutionId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        org.dressdiscover.api.services.institution.InstitutionQueryService.Messages.GetInstitutionByIdRequest.UncheckedValidator.validate(id);
        final org.dressdiscover.api.models.institution.Institution __returnValue = delegate.getInstitutionById(id);
        org.dressdiscover.api.services.institution.InstitutionQueryService.Messages.GetInstitutionByIdResponse.UncheckedValidator.validateReturnValue(__returnValue);
        return __returnValue;
    }

    @Override
    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.institution.InstitutionEntry> getInstitutions() throws org.dressdiscover.api.services.IoException {
        final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.institution.InstitutionEntry> __returnValue = delegate.getInstitutions();
        org.dressdiscover.api.services.institution.InstitutionQueryService.Messages.GetInstitutionsResponse.UncheckedValidator.validateReturnValue(__returnValue);
        return __returnValue;
    }

    @Override
    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.institution.Institution> getInstitutionsByIds(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.institution.InstitutionId> ids) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        org.dressdiscover.api.services.institution.InstitutionQueryService.Messages.GetInstitutionsByIdsRequest.UncheckedValidator.validate(ids);
        final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.institution.Institution> __returnValue = delegate.getInstitutionsByIds(ids);
        org.dressdiscover.api.services.institution.InstitutionQueryService.Messages.GetInstitutionsByIdsResponse.UncheckedValidator.validateReturnValue(__returnValue);
        return __returnValue;
    }

    private final org.dressdiscover.api.services.institution.InstitutionQueryService delegate;
}
