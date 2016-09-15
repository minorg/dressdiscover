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
        _validateGetInstitutionByIdParameters(id);
        return org.dressdiscover.api.services.institution.InstitutionQueryService.Messages.GetInstitutionByIdResponse.DefaultConstructionValidator.getInstance().validateReturnValue(delegate.getInstitutionById(id));
    }

    protected void _validateGetInstitutionByIdParameters(final org.dressdiscover.api.models.institution.InstitutionId id) {
        org.dressdiscover.api.services.institution.InstitutionQueryService.Messages.GetInstitutionByIdRequest.DefaultConstructionValidator.getInstance().validateId(id);
    }

    @Override
    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.institution.InstitutionEntry> getInstitutions() throws org.dressdiscover.api.services.IoException {
        return org.dressdiscover.api.services.institution.InstitutionQueryService.Messages.GetInstitutionsResponse.DefaultConstructionValidator.getInstance().validateReturnValue(delegate.getInstitutions());
    }

    @Override
    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.institution.Institution> getInstitutionsByIds(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.institution.InstitutionId> ids) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        _validateGetInstitutionsByIdsParameters(ids);
        return org.dressdiscover.api.services.institution.InstitutionQueryService.Messages.GetInstitutionsByIdsResponse.DefaultConstructionValidator.getInstance().validateReturnValue(delegate.getInstitutionsByIds(ids));
    }

    protected void _validateGetInstitutionsByIdsParameters(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.institution.InstitutionId> ids) {
        org.dressdiscover.api.services.institution.InstitutionQueryService.Messages.GetInstitutionsByIdsRequest.DefaultConstructionValidator.getInstance().validateIds(ids);
    }

    private final org.dressdiscover.api.services.institution.InstitutionQueryService delegate;
}
