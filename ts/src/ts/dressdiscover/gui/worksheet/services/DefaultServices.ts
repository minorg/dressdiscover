import {
    LoggingWorksheetDefinitionQueryService,
} from 'dressdiscover/api/services/worksheet/definition/logging_worksheet_definition_query_service';
import {
    WorksheetDefinitionQueryService,
} from 'dressdiscover/api/services/worksheet/definition/worksheet_definition_query_service';
import {
    LoggingWorksheetStateCommandService,
} from 'dressdiscover/api/services/worksheet/state/logging_worksheet_state_command_service';
import {
    LoggingWorksheetStateQueryService,
} from 'dressdiscover/api/services/worksheet/state/logging_worksheet_state_query_service';
import { WorksheetStateCommandService } from 'dressdiscover/api/services/worksheet/state/worksheet_state_command_service';
import { WorksheetStateQueryService } from 'dressdiscover/api/services/worksheet/state/worksheet_state_query_service';
import {
    LocalWorksheetDefinitionQueryService,
} from 'dressdiscover/gui/worksheet/services/worksheet/definition/LocalWorksheetDefinitionQueryService';
import {
    LocalWorksheetStateCommandService,
} from 'dressdiscover/gui/worksheet/services/worksheet/state/LocalWorksheetStateCommandService';
import {
    LocalWorksheetStateQueryService,
} from 'dressdiscover/gui/worksheet/services/worksheet/state/LocalWorksheetStateQueryService';

import { Services } from './Services';

export class DefaultServices implements Services {
    static readonly instance = new DefaultServices;

    readonly worksheetDefinitionQueryService: WorksheetDefinitionQueryService = new LoggingWorksheetDefinitionQueryService(new LocalWorksheetDefinitionQueryService());
    readonly worksheetStateCommandService: WorksheetStateCommandService = new LoggingWorksheetStateCommandService(new LocalWorksheetStateCommandService);
    readonly worksheetStateQueryService: WorksheetStateQueryService = new LoggingWorksheetStateQueryService(new LocalWorksheetStateQueryService);
}
