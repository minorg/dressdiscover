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
        {
            if (id == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.institution.ValidatingInstitutionQueryService.getInstitutionById: id is missing");
            }
        }
        final org.dressdiscover.api.models.institution.Institution __returnValue = delegate.getInstitutionById(id);
        {
            if (__returnValue == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.institution.ValidatingInstitutionQueryService.getInstitutionById: __returnValue is missing");
            }
        }
        return __returnValue;
    }

    @Override
    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.institution.InstitutionEntry> getInstitutions() throws org.dressdiscover.api.services.IoException {

        final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.institution.InstitutionEntry> __returnValue = delegate.getInstitutions();
        {
            if (__returnValue == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.institution.ValidatingInstitutionQueryService.getInstitutions: __returnValue is missing");
            }
        }
        return __returnValue;
    }

    @Override
    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.institution.Institution> getInstitutionsByIds(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.institution.InstitutionId> ids) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        {
            if (ids == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.institution.ValidatingInstitutionQueryService.getInstitutionsByIds: ids is missing");
            }
        }
        final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.institution.Institution> __returnValue = delegate.getInstitutionsByIds(ids);
        {
            if (__returnValue == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.institution.ValidatingInstitutionQueryService.getInstitutionsByIds: __returnValue is missing");
            }
        }
        return __returnValue;
    }

    private final org.dressdiscover.api.services.institution.InstitutionQueryService delegate;
}
