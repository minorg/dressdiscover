package org.dressdiscover.lib.services.institution;

@com.google.inject.Singleton
public class ValidatingInstitutionCommandService implements org.dressdiscover.api.services.institution.InstitutionCommandService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.institution.ValidatingInstitutionCommandService.delegate");

    @com.google.inject.Inject
    public ValidatingInstitutionCommandService(@com.google.inject.name.Named("org.dressdiscover.lib.services.institution.ValidatingInstitutionCommandService.delegate") org.dressdiscover.api.services.institution.InstitutionCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final void deleteInstitutionById(final org.dressdiscover.api.models.institution.InstitutionId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        {
            if (id == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.institution.ValidatingInstitutionCommandService.deleteInstitutionById: id is missing");
            }
        }
        delegate.deleteInstitutionById(id);
    }

    @Override
    public final void putInstitution(final org.dressdiscover.api.models.institution.InstitutionId id, final org.dressdiscover.api.models.institution.Institution institution) throws org.dressdiscover.api.services.IoException {
        {
            if (id == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.institution.ValidatingInstitutionCommandService.putInstitution: id is missing");
            }
        }
        {
            if (institution == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.institution.ValidatingInstitutionCommandService.putInstitution: institution is missing");
            }
        }
        delegate.putInstitution(id, institution);
    }

    private final org.dressdiscover.api.services.institution.InstitutionCommandService delegate;
}
