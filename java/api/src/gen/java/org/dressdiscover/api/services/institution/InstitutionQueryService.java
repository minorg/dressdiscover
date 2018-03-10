package org.dressdiscover.api.services.institution;

public interface InstitutionQueryService {
    public enum FunctionMetadata {
        GET_INSTITUTION_BY_ID("get_institution_by_id"),
        GET_INSTITUTIONS("get_institutions"),
        GET_INSTITUTIONS_BY_IDS("get_institutions_by_ids");

        public String getThriftName() {
            return thriftName;
        }

        private FunctionMetadata(final String thriftName) {
            this.thriftName = thriftName;
        }

        private final String thriftName;
    }

    public org.dressdiscover.api.models.institution.Institution getInstitutionById(final org.dressdiscover.api.models.institution.InstitutionId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException;

    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.institution.InstitutionEntry> getInstitutions() throws org.dressdiscover.api.services.IoException;

    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.institution.Institution> getInstitutionsByIds(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.institution.InstitutionId> ids) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException;
}
