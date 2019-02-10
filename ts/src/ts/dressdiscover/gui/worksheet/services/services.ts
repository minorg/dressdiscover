import {
    WorksheetDefinitionQueryService,
} from 'dressdiscover/api/services/worksheet/definition/worksheet_definition_query_service';
import { WorksheetStateCommandService } from 'dressdiscover/api/services/worksheet/state/worksheet_state_command_service';
import { WorksheetStateQueryService } from 'dressdiscover/api/services/worksheet/state/worksheet_state_query_service';

export interface Services {
    readonly worksheetDefinitionQueryService: WorksheetDefinitionQueryService;
    readonly worksheetStateCommandService: WorksheetStateCommandService;
    readonly worksheetStateQueryService: WorksheetStateQueryService;
}
