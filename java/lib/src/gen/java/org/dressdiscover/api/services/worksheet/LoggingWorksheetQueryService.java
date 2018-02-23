package org.dressdiscover.api.services.worksheet;

@com.google.inject.Singleton
public class LoggingWorksheetQueryService implements org.dressdiscover.api.services.worksheet.WorksheetQueryService {
    public final static class WorksheetQueryServiceLogMarkers {
        public final static org.slf4j.Marker GET_WORKSHEET_ACCESSION_NUMBERS = org.slf4j.MarkerFactory.getMarker("GET_WORKSHEET_ACCESSION_NUMBERS");
        public final static org.slf4j.Marker GET_WORKSHEET_STATE = org.slf4j.MarkerFactory.getMarker("GET_WORKSHEET_STATE");

        public final static org.slf4j.Marker WORKSHEET_QUERY_SERVICE = org.slf4j.MarkerFactory.getMarker("WORKSHEET_QUERY_SERVICE");
        static {
            WORKSHEET_QUERY_SERVICE.add(GET_WORKSHEET_ACCESSION_NUMBERS);
            WORKSHEET_QUERY_SERVICE.add(GET_WORKSHEET_STATE);
        }
    }

    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.api.services.worksheet.LoggingWorksheetQueryService.delegate");

    @com.google.inject.Inject
    public LoggingWorksheetQueryService(@com.google.inject.name.Named("org.dressdiscover.api.services.worksheet.LoggingWorksheetQueryService.delegate") final org.dressdiscover.api.services.worksheet.WorksheetQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public com.google.common.collect.ImmutableList<String> getWorksheetAccessionNumbers() throws org.dressdiscover.api.services.IoException {
        final Object[] __logMessageArgs = new Object[1];

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(WorksheetQueryServiceLogMarkers.GET_WORKSHEET_ACCESSION_NUMBERS, LogMessages.GET_WORKSHEET_ACCESSION_NUMBERS, __logMessageArgs);

        try {
            final com.google.common.collect.ImmutableList<String> __returnValue = delegate.getWorksheetAccessionNumbers();

            __logMessageArgs[__logMessageArgs.length - 1] = __returnValue;
            logger.info(WorksheetQueryServiceLogMarkers.GET_WORKSHEET_ACCESSION_NUMBERS, LogMessages.GET_WORKSHEET_ACCESSION_NUMBERS, __logMessageArgs);

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(WorksheetQueryServiceLogMarkers.GET_WORKSHEET_ACCESSION_NUMBERS, LogMessages.GET_WORKSHEET_ACCESSION_NUMBERS, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(WorksheetQueryServiceLogMarkers.GET_WORKSHEET_ACCESSION_NUMBERS, LogMessages.GET_WORKSHEET_ACCESSION_NUMBERS, __logMessageArgs);
            throw e;
        }
    }

    @Override
    public org.dressdiscover.api.models.worksheet.WorksheetState getWorksheetState(final String accessionNumber) throws org.dressdiscover.api.services.IoException {
        final Object[] __logMessageArgs = new Object[2];
        __logMessageArgs[0] = Messages.GetWorksheetStateRequest.create(accessionNumber);

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(WorksheetQueryServiceLogMarkers.GET_WORKSHEET_STATE, LogMessages.GET_WORKSHEET_STATE, __logMessageArgs);

        try {
            final org.dressdiscover.api.models.worksheet.WorksheetState __returnValue = delegate.getWorksheetState(accessionNumber);

            __logMessageArgs[__logMessageArgs.length - 1] = __returnValue;
            logger.info(WorksheetQueryServiceLogMarkers.GET_WORKSHEET_STATE, LogMessages.GET_WORKSHEET_STATE, __logMessageArgs);

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(WorksheetQueryServiceLogMarkers.GET_WORKSHEET_STATE, LogMessages.GET_WORKSHEET_STATE, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(WorksheetQueryServiceLogMarkers.GET_WORKSHEET_STATE, LogMessages.GET_WORKSHEET_STATE, __logMessageArgs);
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingWorksheetQueryService.class);
    private final org.dressdiscover.api.services.worksheet.WorksheetQueryService delegate;

    private final static class LogMessages {
        public final static String GET_WORKSHEET_ACCESSION_NUMBERS = "get_worksheet_accession_numbers() -> {}";
        public final static String GET_WORKSHEET_STATE = "get_worksheet_state({}) -> {}";
    }

    public final static String PRE_RETURN_VALUE = "...";
}
