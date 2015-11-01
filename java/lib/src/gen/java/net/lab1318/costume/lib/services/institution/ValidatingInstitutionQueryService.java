package net.lab1318.costume.lib.services.institution;

@com.google.inject.Singleton
public class ValidatingInstitutionQueryService implements net.lab1318.costume.api.services.institution.InstitutionQueryService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("net.lab1318.costume.lib.services.institution.ValidatingInstitutionQueryService.delegate");

    @com.google.inject.Inject
    public ValidatingInstitutionQueryService(@com.google.inject.name.Named("net.lab1318.costume.lib.services.institution.ValidatingInstitutionQueryService.delegate") net.lab1318.costume.api.services.institution.InstitutionQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final net.lab1318.costume.api.models.institution.Institution getInstitutionById(final net.lab1318.costume.api.models.institution.InstitutionId id) throws net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.institution.NoSuchInstitutionException {
        _validateGetInstitutionByIdParameters(id);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getInstitutionById(id), "net.lab1318.costume.api.services.institution.InstitutionQueryService.getInstitutionById: missing returnValue");
    }

    protected void _validateGetInstitutionByIdParameters(final net.lab1318.costume.api.models.institution.InstitutionId id) {
        com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.services.institution.InstitutionQueryService.getInstitutionById: missing id");
    }

    @Override
    public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.institution.InstitutionEntry> getInstitutions() throws net.lab1318.costume.api.services.IoException {
        return com.google.common.base.Preconditions.checkNotNull(delegate.getInstitutions(), "net.lab1318.costume.api.services.institution.InstitutionQueryService.getInstitutions: missing returnValue");
    }

    private final net.lab1318.costume.api.services.institution.InstitutionQueryService delegate;
}
