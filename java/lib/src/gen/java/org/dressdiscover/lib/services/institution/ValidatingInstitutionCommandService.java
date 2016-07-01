package org.dressdiscover.lib.services.institution;

@com.google.inject.Singleton
public class ValidatingInstitutionCommandService implements org.dressdiscover.api.services.institution.InstitutionCommandService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.institution.ValidatingInstitutionCommandService.delegate");

    @com.google.inject.Inject
    public ValidatingInstitutionCommandService(@com.google.inject.name.Named("org.dressdiscover.lib.services.institution.ValidatingInstitutionCommandService.delegate") org.dressdiscover.api.services.institution.InstitutionCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final void deleteInstitutionById(final net.lab1318.costume.api.models.institution.InstitutionId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        _validateDeleteInstitutionByIdParameters(id);
        delegate.deleteInstitutionById(id);
    }

    protected void _validateDeleteInstitutionByIdParameters(final net.lab1318.costume.api.models.institution.InstitutionId id) {
        com.google.common.base.Preconditions.checkNotNull(id, "org.dressdiscover.api.services.institution.InstitutionCommandService.deleteInstitutionById: missing id");
    }

    @Override
    public final void putInstitution(final net.lab1318.costume.api.models.institution.InstitutionId id, final org.dressdiscover.api.models.institution.Institution institution) throws org.dressdiscover.api.services.IoException {
        _validatePutInstitutionParameters(id, institution);
        delegate.putInstitution(id, institution);
    }

    protected void _validatePutInstitutionParameters(final net.lab1318.costume.api.models.institution.InstitutionId id, final org.dressdiscover.api.models.institution.Institution institution) {
        com.google.common.base.Preconditions.checkNotNull(id, "org.dressdiscover.api.services.institution.InstitutionCommandService.putInstitution: missing id");
        com.google.common.base.Preconditions.checkNotNull(institution, "org.dressdiscover.api.services.institution.InstitutionCommandService.putInstitution: missing institution");
    }

    private final org.dressdiscover.api.services.institution.InstitutionCommandService delegate;
}
