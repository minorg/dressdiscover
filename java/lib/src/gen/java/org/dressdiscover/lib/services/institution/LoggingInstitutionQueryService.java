package org.dressdiscover.lib.services.institution;

@com.google.inject.Singleton
public class LoggingInstitutionQueryService implements org.dressdiscover.api.services.institution.InstitutionQueryService {
    public final static class InstitutionQueryServiceLogMarkers {
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

    @Override
    public org.dressdiscover.api.models.institution.Institution getInstitutionById(final org.dressdiscover.api.models.institution.InstitutionId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        final Object[] __logMessageArgs = new Object[2];
        __logMessageArgs[0] = Messages.GetInstitutionByIdRequest.create(id);

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(InstitutionQueryServiceLogMarkers.GET_INSTITUTION_BY_ID, LogMessages.GET_INSTITUTION_BY_ID, __logMessageArgs);

        try {
            final org.dressdiscover.api.models.institution.Institution __returnValue = delegate.getInstitutionById(id);

            __logMessageArgs[__logMessageArgs.length - 1] = __returnValue;
            logger.info(InstitutionQueryServiceLogMarkers.GET_INSTITUTION_BY_ID, LogMessages.GET_INSTITUTION_BY_ID, __logMessageArgs);

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(InstitutionQueryServiceLogMarkers.GET_INSTITUTION_BY_ID, LogMessages.GET_INSTITUTION_BY_ID, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.institution.NoSuchInstitutionException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(InstitutionQueryServiceLogMarkers.GET_INSTITUTION_BY_ID, LogMessages.GET_INSTITUTION_BY_ID, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(InstitutionQueryServiceLogMarkers.GET_INSTITUTION_BY_ID, LogMessages.GET_INSTITUTION_BY_ID, __logMessageArgs);
            throw e;
        }
    }

    @Override
    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.institution.InstitutionEntry> getInstitutions() throws org.dressdiscover.api.services.IoException {
        final Object[] __logMessageArgs = new Object[1];

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(InstitutionQueryServiceLogMarkers.GET_INSTITUTIONS, LogMessages.GET_INSTITUTIONS, __logMessageArgs);

        try {
            final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.institution.InstitutionEntry> __returnValue = delegate.getInstitutions();

            __logMessageArgs[__logMessageArgs.length - 1] = __returnValue;
            logger.info(InstitutionQueryServiceLogMarkers.GET_INSTITUTIONS, LogMessages.GET_INSTITUTIONS, __logMessageArgs);

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(InstitutionQueryServiceLogMarkers.GET_INSTITUTIONS, LogMessages.GET_INSTITUTIONS, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(InstitutionQueryServiceLogMarkers.GET_INSTITUTIONS, LogMessages.GET_INSTITUTIONS, __logMessageArgs);
            throw e;
        }
    }

    @Override
    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.institution.Institution> getInstitutionsByIds(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.institution.InstitutionId> ids) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        final Object[] __logMessageArgs = new Object[2];
        __logMessageArgs[0] = Messages.GetInstitutionsByIdsRequest.create(ids);

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(InstitutionQueryServiceLogMarkers.GET_INSTITUTIONS_BY_IDS, LogMessages.GET_INSTITUTIONS_BY_IDS, __logMessageArgs);

        try {
            final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.institution.Institution> __returnValue = delegate.getInstitutionsByIds(ids);

            __logMessageArgs[__logMessageArgs.length - 1] = __returnValue;
            logger.info(InstitutionQueryServiceLogMarkers.GET_INSTITUTIONS_BY_IDS, LogMessages.GET_INSTITUTIONS_BY_IDS, __logMessageArgs);

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(InstitutionQueryServiceLogMarkers.GET_INSTITUTIONS_BY_IDS, LogMessages.GET_INSTITUTIONS_BY_IDS, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.institution.NoSuchInstitutionException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(InstitutionQueryServiceLogMarkers.GET_INSTITUTIONS_BY_IDS, LogMessages.GET_INSTITUTIONS_BY_IDS, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(InstitutionQueryServiceLogMarkers.GET_INSTITUTIONS_BY_IDS, LogMessages.GET_INSTITUTIONS_BY_IDS, __logMessageArgs);
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingInstitutionQueryService.class);
    private final org.dressdiscover.api.services.institution.InstitutionQueryService delegate;

    private final static class LogMessages {
        public final static String GET_INSTITUTION_BY_ID = "get_institution_by_id({}) -> {}";
        public final static String GET_INSTITUTIONS = "get_institutions() -> {}";
        public final static String GET_INSTITUTIONS_BY_IDS = "get_institutions_by_ids({}) -> {}";
    }

    public final static String PRE_RETURN_VALUE = "...";
}
