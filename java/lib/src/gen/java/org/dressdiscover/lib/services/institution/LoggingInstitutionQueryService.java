package org.dressdiscover.lib.services.institution;

@com.google.inject.Singleton
public class LoggingInstitutionQueryService implements org.dressdiscover.api.services.institution.InstitutionQueryService {
    public static class Markers {
        public final static org.slf4j.Marker GET_INSTITUTION_BY_ID = org.slf4j.MarkerFactory.getMarker("GET_INSTITUTION_BY_ID");
        public final static org.slf4j.Marker GET_INSTITUTIONS = org.slf4j.MarkerFactory.getMarker("GET_INSTITUTIONS");
        public final static org.slf4j.Marker GET_INSTITUTIONS_BY_IDS = org.slf4j.MarkerFactory.getMarker("GET_INSTITUTIONS_BY_IDS");

        public final static org.slf4j.Marker INSTITUTION_QUERY_SERVICE = org.slf4j.MarkerFactory.getMarker("INSTITUTION_QUERY_SERVICE");
        static {
            INSTITUTION_QUERY_SERVICE.add(GET_INSTITUTION_BY_ID);
            INSTITUTION_QUERY_SERVICE.add(GET_INSTITUTIONS);
            INSTITUTION_QUERY_SERVICE.add(GET_INSTITUTIONS_BY_IDS);
        }
    }

    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.institution.LoggingInstitutionQueryService.delegate");

    @com.google.inject.Inject
    public LoggingInstitutionQueryService(@com.google.inject.name.Named("org.dressdiscover.lib.services.institution.LoggingInstitutionQueryService.delegate") final org.dressdiscover.api.services.institution.InstitutionQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    public org.dressdiscover.api.models.institution.Institution getInstitutionById(final org.dressdiscover.api.models.institution.InstitutionId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("get_institution_by_id(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(Messages.GetInstitutionByIdRequest.create(id));
        __logMessageStringBuilder.append(")");

        try {
            org.dressdiscover.api.models.institution.Institution __returnValue = delegate.getInstitutionById(id);

            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(__returnValue);

            logger.info(Markers.GET_INSTITUTION_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_INSTITUTION_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final org.dressdiscover.api.services.institution.NoSuchInstitutionException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_INSTITUTION_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.institution.InstitutionEntry> getInstitutions() throws org.dressdiscover.api.services.IoException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("get_institutions(");
        __logMessageStringBuilder.append(")");

        try {
            com.google.common.collect.ImmutableList<org.dressdiscover.api.models.institution.InstitutionEntry> __returnValue = delegate.getInstitutions();

            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(__returnValue);

            logger.info(Markers.GET_INSTITUTIONS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_INSTITUTIONS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.institution.Institution> getInstitutionsByIds(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.institution.InstitutionId> ids) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("get_institutions_by_ids(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(Messages.GetInstitutionsByIdsRequest.create(ids));
        __logMessageStringBuilder.append(")");

        try {
            com.google.common.collect.ImmutableList<org.dressdiscover.api.models.institution.Institution> __returnValue = delegate.getInstitutionsByIds(ids);

            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(__returnValue);

            logger.info(Markers.GET_INSTITUTIONS_BY_IDS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_INSTITUTIONS_BY_IDS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final org.dressdiscover.api.services.institution.NoSuchInstitutionException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_INSTITUTIONS_BY_IDS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingInstitutionQueryService.class);
    private final org.dressdiscover.api.services.institution.InstitutionQueryService delegate;
}
