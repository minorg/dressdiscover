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
} from 'dressdiscover/gui/worksheet/services/local_worksheet_definition_query_service';
import {
    LocalWorksheetStateCommandService,
} from 'dressdiscover/gui/worksheet/services/local_worksheet_state_command_service';
import { LocalWorksheetStateQueryService } from 'dressdiscover/gui/worksheet/services/local_worksheet_state_query_service';

export class Services {
    get worksheetDefinitionQueryService(): WorksheetDefinitionQueryService {
        return this._worksheetDefinitionQueryService;
    }

    get worksheetStateCommandService(): WorksheetStateCommandService {
        return this._worksheetStateCommandService;
    }

    get worksheetStateQueryService(): WorksheetStateQueryService {
        return this._worksheetStateQueryService;
    }

    private _worksheetDefinitionQueryService: WorksheetDefinitionQueryService = new LoggingWorksheetDefinitionQueryService(new LocalWorksheetDefinitionQueryService());
    private _worksheetStateCommandService: WorksheetStateCommandService = new LoggingWorksheetStateCommandService(new LocalWorksheetStateCommandService);
    private _worksheetStateQueryService: WorksheetStateQueryService = new LoggingWorksheetStateQueryService(new LocalWorksheetStateQueryService);
}
