package org.dressdiscover.api.services.worksheet;

@com.google.inject.Singleton
public class LoggingWorksheetDefinitionQueryService implements org.dressdiscover.api.services.worksheet.WorksheetDefinitionQueryService {
    public final static class WorksheetDefinitionQueryServiceLogMarkers {
        public final static org.slf4j.Marker GET_WORKSHEET_DEFINITION = org.slf4j.MarkerFactory.getMarker("GET_WORKSHEET_DEFINITION");

        public final static org.slf4j.Marker WORKSHEET_DEFINITION_QUERY_SERVICE = org.slf4j.MarkerFactory.getMarker("WORKSHEET_DEFINITION_QUERY_SERVICE");
        static {
            WORKSHEET_DEFINITION_QUERY_SERVICE.add(GET_WORKSHEET_DEFINITION);
        }
    }

    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.api.services.worksheet.LoggingWorksheetDefinitionQueryService.delegate");

    @com.google.inject.Inject
    public LoggingWorksheetDefinitionQueryService(@com.google.inject.name.Named("org.dressdiscover.api.services.worksheet.LoggingWorksheetDefinitionQueryService.delegate") final org.dressdiscover.api.services.worksheet.WorksheetDefinitionQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public org.dressdiscover.api.models.worksheet.WorksheetDefinition getWorksheetDefinition() throws org.dressdiscover.api.services.IoException {
        final Object[] __logMessageArgs = new Object[1];

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(WorksheetDefinitionQueryServiceLogMarkers.GET_WORKSHEET_DEFINITION, LogMessages.GET_WORKSHEET_DEFINITION, __logMessageArgs);

        try {
            final org.dressdiscover.api.models.worksheet.WorksheetDefinition __returnValue = delegate.getWorksheetDefinition();

            __logMessageArgs[__logMessageArgs.length - 1] = __returnValue;
            logger.info(WorksheetDefinitionQueryServiceLogMarkers.GET_WORKSHEET_DEFINITION, LogMessages.GET_WORKSHEET_DEFINITION, __logMessageArgs);

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(WorksheetDefinitionQueryServiceLogMarkers.GET_WORKSHEET_DEFINITION, LogMessages.GET_WORKSHEET_DEFINITION, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(WorksheetDefinitionQueryServiceLogMarkers.GET_WORKSHEET_DEFINITION, LogMessages.GET_WORKSHEET_DEFINITION, __logMessageArgs);
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingWorksheetDefinitionQueryService.class);
    private final org.dressdiscover.api.services.worksheet.WorksheetDefinitionQueryService delegate;

    private final static class LogMessages {
        public final static String GET_WORKSHEET_DEFINITION = "get_worksheet_definition() -> {}";
    }

    public final static String PRE_RETURN_VALUE = "...";
}
