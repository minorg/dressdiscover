import { WorksheetConfiguration } from 'dressdiscover/api/models/worksheet/configuration/worksheet_configuration';
import { LoggingUserSettingsCommandService } from 'dressdiscover/api/services/user/logging_user_settings_command_service';
import { LoggingUserSettingsQueryService } from 'dressdiscover/api/services/user/logging_user_settings_query_service';
import { UserSettingsCommandService } from 'dressdiscover/api/services/user/user_settings_command_service';
import { UserSettingsQueryService } from 'dressdiscover/api/services/user/user_settings_query_service';
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
  DefaultWorksheetConfiguration,
} from 'dressdiscover/gui/models/worksheet/configuration/DefaultWorksheetConfiguration';
import {
  LocalStorageUserSettingsCommandService,
} from 'dressdiscover/gui/services/user/LocalStorageUserSettingsCommandService';
import { LocalStorageUserSettingsQueryService } from 'dressdiscover/gui/services/user/LocalStorageUserSettingsQueryService';
import {
  BundledWorksheetDefinitionQueryService,
} from 'dressdiscover/gui/services/worksheet/definition/BundledWorksheetDefinitionQueryService';
import {
  GoogleSheetsWorksheetStateCommandService,
} from 'dressdiscover/gui/services/worksheet/state/GoogleSheetsWorksheetStateCommandService';
import {
  GoogleSheetsWorksheetStateQueryService,
} from 'dressdiscover/gui/services/worksheet/state/GoogleSheetsWorksheetStateQueryService';
import {
  LocalStorageWorksheetStateCommandService,
} from 'dressdiscover/gui/services/worksheet/state/LocalStorageWorksheetStateCommandService';
import {
  LocalStorageWorksheetStateQueryService,
} from 'dressdiscover/gui/services/worksheet/state/LocalStorageWorksheetStateQueryService';

export class Services {
  constructor(readonly configuration: WorksheetConfiguration) {
    this.userSettingsCommandService = new LoggingUserSettingsCommandService(new LocalStorageUserSettingsCommandService());
    this.userSettingsQueryService = new LoggingUserSettingsQueryService(new LocalStorageUserSettingsQueryService());

    let worksheetDefinitionQueryService: WorksheetDefinitionQueryService;
    if (configuration.definition.bundled) {
      worksheetDefinitionQueryService = new BundledWorksheetDefinitionQueryService();
    } else {
      throw new RangeError();
    }
    this.worksheetDefinitionQueryService = new LoggingWorksheetDefinitionQueryService(worksheetDefinitionQueryService);

    let worksheetStateCommandService: WorksheetStateCommandService;
    let worksheetStateQueryService: WorksheetStateQueryService;
    if (configuration.state.googleSheets) {
      worksheetStateCommandService = new GoogleSheetsWorksheetStateCommandService(configuration.state.googleSheets, this.worksheetDefinitionQueryService);
      worksheetStateQueryService = new GoogleSheetsWorksheetStateQueryService(configuration.state.googleSheets);
    } else if (configuration.state.localStorage) {
      worksheetStateCommandService = new LocalStorageWorksheetStateCommandService();
      worksheetStateQueryService = new LocalStorageWorksheetStateQueryService();
    } else {
      throw new RangeError();
    }
    this.worksheetStateCommandService = new LoggingWorksheetStateCommandService(worksheetStateCommandService);
    this.worksheetStateQueryService = new LoggingWorksheetStateQueryService(worksheetStateQueryService);
  }

  static readonly default = new Services(DefaultWorksheetConfiguration.instance);

  readonly userSettingsCommandService: UserSettingsCommandService;
  readonly userSettingsQueryService: UserSettingsQueryService;
  readonly worksheetDefinitionQueryService: WorksheetDefinitionQueryService;
  readonly worksheetStateCommandService: WorksheetStateCommandService;
  readonly worksheetStateQueryService: WorksheetStateQueryService;
}
