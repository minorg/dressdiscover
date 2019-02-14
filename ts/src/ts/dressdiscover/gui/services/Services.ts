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
  BundledWorksheetDefinitionQueryService,
} from 'dressdiscover/gui/services/worksheet/definition/BundledWorksheetDefinitionQueryService';
import {
  LocalStorageWorksheetStateCommandService,
} from 'dressdiscover/gui/services/worksheet/state/LocalStorageWorksheetStateCommandService';
import {
  LocalStorageWorksheetStateQueryService,
} from 'dressdiscover/gui/services/worksheet/state/LocalStorageWorksheetStateQueryService';
import { WorksheetStateServices } from 'dressdiscover/gui/services/worksheet/state/WorksheetStateServices';

export class Services {
    constructor(kwds?: { worksheetDefinitionQueryService?: WorksheetDefinitionQueryService, worksheetStateServices?: WorksheetStateServices }) {
        kwds = kwds || {};
        this.worksheetDefinitionQueryService = new LoggingWorksheetDefinitionQueryService(kwds.worksheetDefinitionQueryService || new BundledWorksheetDefinitionQueryService());
        this.worksheetStateCommandService = new LoggingWorksheetStateCommandService((kwds.worksheetStateServices && kwds.worksheetStateServices.worksheetStateCommandService) || new LocalStorageWorksheetStateCommandService());
        this.worksheetStateQueryService = new LoggingWorksheetStateQueryService((kwds.worksheetStateServices && kwds.worksheetStateServices.worksheetStateQueryService) || new LocalStorageWorksheetStateQueryService());
    }

    static readonly default = new Services();

    readonly worksheetDefinitionQueryService: WorksheetDefinitionQueryService;
    readonly worksheetStateCommandService: WorksheetStateCommandService;
    readonly worksheetStateQueryService: WorksheetStateQueryService;
}
