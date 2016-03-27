package net.lab1318.costume.lib.services.institution;

@com.google.inject.Singleton
public class ValidatingInstitutionCommandService implements net.lab1318.costume.api.services.institution.InstitutionCommandService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("net.lab1318.costume.lib.services.institution.ValidatingInstitutionCommandService.delegate");

    @com.google.inject.Inject
    public ValidatingInstitutionCommandService(@com.google.inject.name.Named("net.lab1318.costume.lib.services.institution.ValidatingInstitutionCommandService.delegate") net.lab1318.costume.api.services.institution.InstitutionCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final void deleteInstitutionById(final net.lab1318.costume.api.models.institution.InstitutionId id) throws net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.institution.NoSuchInstitutionException {
        _validateDeleteInstitutionByIdParameters(id);
        delegate.deleteInstitutionById(id);
    }

    protected void _validateDeleteInstitutionByIdParameters(final net.lab1318.costume.api.models.institution.InstitutionId id) {
        com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.services.institution.InstitutionCommandService.deleteInstitutionById: missing id");
    }

    @Override
    public final void putInstitution(final net.lab1318.costume.api.models.institution.InstitutionId id, final net.lab1318.costume.api.models.institution.Institution institution) throws net.lab1318.costume.api.services.IoException {
        _validatePutInstitutionParameters(id, institution);
        delegate.putInstitution(id, institution);
    }

    protected void _validatePutInstitutionParameters(final net.lab1318.costume.api.models.institution.InstitutionId id, final net.lab1318.costume.api.models.institution.Institution institution) {
        com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.services.institution.InstitutionCommandService.putInstitution: missing id");
        com.google.common.base.Preconditions.checkNotNull(institution, "net.lab1318.costume.api.services.institution.InstitutionCommandService.putInstitution: missing institution");
    }

    private final net.lab1318.costume.api.services.institution.InstitutionCommandService delegate;
}
