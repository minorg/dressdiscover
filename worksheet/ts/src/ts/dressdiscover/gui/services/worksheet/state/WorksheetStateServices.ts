import { WorksheetStateCommandService } from 'dressdiscover/gui/services/worksheet/state/worksheet_state_command_service';
import { WorksheetStateQueryService } from 'dressdiscover/gui/services/worksheet/state/worksheet_state_query_service';

export interface WorksheetStateServices {
    worksheetStateCommandService: WorksheetStateCommandService;
    worksheetStateQueryService: WorksheetStateQueryService;
}
