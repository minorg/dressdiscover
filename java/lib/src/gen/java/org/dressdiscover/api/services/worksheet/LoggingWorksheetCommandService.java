package org.dressdiscover.api.services.worksheet;

@com.google.inject.Singleton
public class LoggingWorksheetCommandService implements org.dressdiscover.api.services.worksheet.WorksheetCommandService {
    public final static class WorksheetCommandServiceLogMarkers {
        public final static org.slf4j.Marker DELETE_WORKSHEET_STATE = org.slf4j.MarkerFactory.getMarker("DELETE_WORKSHEET_STATE");
        public final static org.slf4j.Marker PUT_WORKSHEET_STATE = org.slf4j.MarkerFactory.getMarker("PUT_WORKSHEET_STATE");

        public final static org.slf4j.Marker WORKSHEET_COMMAND_SERVICE = org.slf4j.MarkerFactory.getMarker("WORKSHEET_COMMAND_SERVICE");
        static {
            WORKSHEET_COMMAND_SERVICE.add(DELETE_WORKSHEET_STATE);
            WORKSHEET_COMMAND_SERVICE.add(PUT_WORKSHEET_STATE);
        }
    }

    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.api.services.worksheet.LoggingWorksheetCommandService.delegate");

    @com.google.inject.Inject
    public LoggingWorksheetCommandService(@com.google.inject.name.Named("org.dressdiscover.api.services.worksheet.LoggingWorksheetCommandService.delegate") final org.dressdiscover.api.services.worksheet.WorksheetCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public void deleteWorksheetState(final String accessionNumber) throws org.dressdiscover.api.services.IoException {
        final Object[] __logMessageArgs = new Object[2];
        __logMessageArgs[0] = Messages.DeleteWorksheetStateRequest.create(accessionNumber);

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(WorksheetCommandServiceLogMarkers.DELETE_WORKSHEET_STATE, LogMessages.DELETE_WORKSHEET_STATE, __logMessageArgs);

        try {
            delegate.deleteWorksheetState(accessionNumber);

            __logMessageArgs[__logMessageArgs.length - 1] = VOID_RETURN_VALUE;
            logger.info(WorksheetCommandServiceLogMarkers.DELETE_WORKSHEET_STATE, LogMessages.DELETE_WORKSHEET_STATE, __logMessageArgs);
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(WorksheetCommandServiceLogMarkers.DELETE_WORKSHEET_STATE, LogMessages.DELETE_WORKSHEET_STATE, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(WorksheetCommandServiceLogMarkers.DELETE_WORKSHEET_STATE, LogMessages.DELETE_WORKSHEET_STATE, __logMessageArgs);
            throw e;
        }
    }

    @Override
    public void putWorksheetState(final org.dressdiscover.api.models.worksheet.WorksheetState state) throws org.dressdiscover.api.services.IoException {
        final Object[] __logMessageArgs = new Object[2];
        __logMessageArgs[0] = Messages.PutWorksheetStateRequest.create(state);

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(WorksheetCommandServiceLogMarkers.PUT_WORKSHEET_STATE, LogMessages.PUT_WORKSHEET_STATE, __logMessageArgs);

        try {
            delegate.putWorksheetState(state);

            __logMessageArgs[__logMessageArgs.length - 1] = VOID_RETURN_VALUE;
            logger.info(WorksheetCommandServiceLogMarkers.PUT_WORKSHEET_STATE, LogMessages.PUT_WORKSHEET_STATE, __logMessageArgs);
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(WorksheetCommandServiceLogMarkers.PUT_WORKSHEET_STATE, LogMessages.PUT_WORKSHEET_STATE, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(WorksheetCommandServiceLogMarkers.PUT_WORKSHEET_STATE, LogMessages.PUT_WORKSHEET_STATE, __logMessageArgs);
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingWorksheetCommandService.class);
    private final org.dressdiscover.api.services.worksheet.WorksheetCommandService delegate;

    private final static class LogMessages {
        public final static String DELETE_WORKSHEET_STATE = "delete_worksheet_state({}) -> {}";
        public final static String PUT_WORKSHEET_STATE = "put_worksheet_state({}) -> {}";
    }

    public final static String PRE_RETURN_VALUE = "...";
    public final static String VOID_RETURN_VALUE = "void";
}
