package org.dressdiscover.lib.services.institution;

@com.google.inject.Singleton
public class LoggingInstitutionCommandService implements org.dressdiscover.api.services.institution.InstitutionCommandService {
    public final static class InstitutionCommandServiceLogMarkers {
        public final static org.slf4j.Marker DELETE_INSTITUTION_BY_ID = org.slf4j.MarkerFactory.getMarker("DELETE_INSTITUTION_BY_ID");
        public final static org.slf4j.Marker PUT_INSTITUTION = org.slf4j.MarkerFactory.getMarker("PUT_INSTITUTION");

        public final static org.slf4j.Marker INSTITUTION_COMMAND_SERVICE = org.slf4j.MarkerFactory.getMarker("INSTITUTION_COMMAND_SERVICE");
        static {
            INSTITUTION_COMMAND_SERVICE.add(DELETE_INSTITUTION_BY_ID);
            INSTITUTION_COMMAND_SERVICE.add(PUT_INSTITUTION);
        }
    }

    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.institution.LoggingInstitutionCommandService.delegate");

    @com.google.inject.Inject
    public LoggingInstitutionCommandService(@com.google.inject.name.Named("org.dressdiscover.lib.services.institution.LoggingInstitutionCommandService.delegate") final org.dressdiscover.api.services.institution.InstitutionCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public void deleteInstitutionById(final org.dressdiscover.api.models.institution.InstitutionId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        final Object[] __logMessageArgs = new Object[2];
        __logMessageArgs[0] = Messages.DeleteInstitutionByIdRequest.create(id);

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(InstitutionCommandServiceLogMarkers.DELETE_INSTITUTION_BY_ID, LogMessages.DELETE_INSTITUTION_BY_ID, __logMessageArgs);

        try {
            delegate.deleteInstitutionById(id);

            __logMessageArgs[__logMessageArgs.length - 1] = VOID_RETURN_VALUE;
            logger.info(InstitutionCommandServiceLogMarkers.DELETE_INSTITUTION_BY_ID, LogMessages.DELETE_INSTITUTION_BY_ID, __logMessageArgs);
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(InstitutionCommandServiceLogMarkers.DELETE_INSTITUTION_BY_ID, LogMessages.DELETE_INSTITUTION_BY_ID, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.institution.NoSuchInstitutionException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(InstitutionCommandServiceLogMarkers.DELETE_INSTITUTION_BY_ID, LogMessages.DELETE_INSTITUTION_BY_ID, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(InstitutionCommandServiceLogMarkers.DELETE_INSTITUTION_BY_ID, LogMessages.DELETE_INSTITUTION_BY_ID, __logMessageArgs);
            throw e;
        }
    }

    @Override
    public void putInstitution(final org.dressdiscover.api.models.institution.InstitutionId id, final org.dressdiscover.api.models.institution.Institution institution) throws org.dressdiscover.api.services.IoException {
        final Object[] __logMessageArgs = new Object[2];
        __logMessageArgs[0] = Messages.PutInstitutionRequest.create(id, institution);

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(InstitutionCommandServiceLogMarkers.PUT_INSTITUTION, LogMessages.PUT_INSTITUTION, __logMessageArgs);

        try {
            delegate.putInstitution(id, institution);

            __logMessageArgs[__logMessageArgs.length - 1] = VOID_RETURN_VALUE;
            logger.info(InstitutionCommandServiceLogMarkers.PUT_INSTITUTION, LogMessages.PUT_INSTITUTION, __logMessageArgs);
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(InstitutionCommandServiceLogMarkers.PUT_INSTITUTION, LogMessages.PUT_INSTITUTION, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(InstitutionCommandServiceLogMarkers.PUT_INSTITUTION, LogMessages.PUT_INSTITUTION, __logMessageArgs);
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingInstitutionCommandService.class);
    private final org.dressdiscover.api.services.institution.InstitutionCommandService delegate;

    private final static class LogMessages {
        public final static String DELETE_INSTITUTION_BY_ID = "delete_institution_by_id({}) -> {}";
        public final static String PUT_INSTITUTION = "put_institution({}) -> {}";
    }

    public final static String PRE_RETURN_VALUE = "...";
    public final static String VOID_RETURN_VALUE = "void";
}
