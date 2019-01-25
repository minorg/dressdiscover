import {
    LoggingWorksheetDefinitionQueryService,
} from 'dressdiscover/api/services/worksheet/logging_worksheet_definition_query_service';
import {
    LoggingWorksheetStateCommandService,
} from 'dressdiscover/api/services/worksheet/logging_worksheet_state_command_service';
import {
    LoggingWorksheetStateQueryService,
} from 'dressdiscover/api/services/worksheet/logging_worksheet_state_query_service';
import { WorksheetDefinitionQueryService } from 'dressdiscover/api/services/worksheet/worksheet_definition_query_service';
import { WorksheetStateCommandService } from 'dressdiscover/api/services/worksheet/worksheet_state_command_service';
import { WorksheetStateQueryService } from 'dressdiscover/api/services/worksheet/worksheet_state_query_service';
import {
    LocalWorksheetDefinitionQueryService,
} from 'dressdiscover/gui/worksheet/services/worksheet/LocalWorksheetDefinitionQueryService';
import {
    LocalWorksheetStateCommandService,
} from 'dressdiscover/gui/worksheet/services/worksheet/LocalWorksheetStateCommandService';
import {
    LocalWorksheetStateQueryService,
} from 'dressdiscover/gui/worksheet/services/worksheet/LocalWorksheetStateQueryService';

export class Services {
    readonly worksheetDefinitionQueryService: WorksheetDefinitionQueryService = new LoggingWorksheetDefinitionQueryService(new LocalWorksheetDefinitionQueryService());
    readonly worksheetStateCommandService: WorksheetStateCommandService = new LoggingWorksheetStateCommandService(new LocalWorksheetStateCommandService);
    readonly worksheetStateQueryService: WorksheetStateQueryService = new LoggingWorksheetStateQueryService(new LocalWorksheetStateQueryService);
}
