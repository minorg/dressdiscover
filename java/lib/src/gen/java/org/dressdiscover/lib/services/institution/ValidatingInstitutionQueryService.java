package org.dressdiscover.lib.services.institution;

@com.google.inject.Singleton
public class ValidatingInstitutionQueryService implements net.lab1318.costume.api.services.institution.InstitutionQueryService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("net.lab1318.costume.lib.services.institution.ValidatingInstitutionQueryService.delegate");

    @com.google.inject.Inject
    public ValidatingInstitutionQueryService(@com.google.inject.name.Named("net.lab1318.costume.lib.services.institution.ValidatingInstitutionQueryService.delegate") net.lab1318.costume.api.services.institution.InstitutionQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final net.lab1318.costume.api.models.institution.Institution getInstitutionById(final org.dressdiscover.api.models.institution.InstitutionId id) throws net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.institution.NoSuchInstitutionException {
        _validateGetInstitutionByIdParameters(id);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getInstitutionById(id), "net.lab1318.costume.api.services.institution.InstitutionQueryService.getInstitutionById: missing returnValue");
    }

    protected void _validateGetInstitutionByIdParameters(final org.dressdiscover.api.models.institution.InstitutionId id) {
        com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.services.institution.InstitutionQueryService.getInstitutionById: missing id");
    }

    @Override
    public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionEntry> getInstitutions() throws net.lab1318.costume.api.services.IoException {
        return com.google.common.base.Preconditions.checkNotNull(delegate.getInstitutions(), "net.lab1318.costume.api.services.institution.InstitutionQueryService.getInstitutions: missing returnValue");
    }

    @Override
    public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.Institution> getInstitutionsByIds(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.institution.InstitutionId> ids) throws net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.institution.NoSuchInstitutionException {
        _validateGetInstitutionsByIdsParameters(ids);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getInstitutionsByIds(ids), "net.lab1318.costume.api.services.institution.InstitutionQueryService.getInstitutionsByIds: missing returnValue");
    }

    protected void _validateGetInstitutionsByIdsParameters(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.institution.InstitutionId> ids) {
        com.google.common.base.Preconditions.checkNotNull(ids, "net.lab1318.costume.api.services.institution.InstitutionQueryService.getInstitutionsByIds: missing ids");
    }

    private final net.lab1318.costume.api.services.institution.InstitutionQueryService delegate;
}
