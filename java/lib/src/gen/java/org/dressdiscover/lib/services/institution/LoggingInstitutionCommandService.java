package org.dressdiscover.lib.services.institution;

@com.google.inject.Singleton
public class LoggingInstitutionCommandService implements org.dressdiscover.api.services.institution.InstitutionCommandService {
    public static class Markers {
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

    public void deleteInstitutionById(final org.dressdiscover.api.models.institution.InstitutionId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("delete_institution_by_id(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(Messages.DeleteInstitutionByIdRequest.create(id));
        __logMessageStringBuilder.append(")");

        try {
            delegate.deleteInstitutionById(id);

            logger.info(Markers.DELETE_INSTITUTION_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.DELETE_INSTITUTION_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final org.dressdiscover.api.services.institution.NoSuchInstitutionException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.DELETE_INSTITUTION_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final RuntimeException e) {
            __logMessageStringBuilder.append(" -> ");
            __logMessageArgs.add(e);
            logger.error(Markers.DELETE_INSTITUTION_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public void putInstitution(final org.dressdiscover.api.models.institution.InstitutionId id, final org.dressdiscover.api.models.institution.Institution institution) throws org.dressdiscover.api.services.IoException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("put_institution(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(Messages.PutInstitutionRequest.create(id, institution));
        __logMessageStringBuilder.append(")");

        try {
            delegate.putInstitution(id, institution);

            logger.info(Markers.PUT_INSTITUTION, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.PUT_INSTITUTION, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final RuntimeException e) {
            __logMessageStringBuilder.append(" -> ");
            __logMessageArgs.add(e);
            logger.error(Markers.PUT_INSTITUTION, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingInstitutionCommandService.class);
    private final org.dressdiscover.api.services.institution.InstitutionCommandService delegate;
}
