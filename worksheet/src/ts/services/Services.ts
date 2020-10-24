import {WorksheetConfiguration} from '~/models/worksheet/configuration/WorksheetConfiguration';
import {UserSettingsCommandService} from '~/services/user/UserSettingsCommandService';
import {UserSettingsQueryService} from '~/services/user/UserSettingsQueryService';
import {WorksheetDefinitionQueryService,} from '~/services/worksheet/definition/WorksheetDefinitionQueryService';
import {WorksheetStateCommandService} from '~/services/worksheet/state/WorksheetStateCommandService';
import {WorksheetStateQueryService} from '~/services/worksheet/state/WorksheetStateQueryService';
import {DefaultWorksheetConfiguration,} from '~/models/worksheet/configuration/DefaultWorksheetConfiguration';
import {LocalStorageUserSettingsCommandService,} from '~/services/user/LocalStorageUserSettingsCommandService';
import {LocalStorageUserSettingsQueryService} from '~/services/user/LocalStorageUserSettingsQueryService';
import {BundledWorksheetDefinitionQueryService,} from '~/services/worksheet/definition/BundledWorksheetDefinitionQueryService';
import {GoogleSheetsWorksheetStateCommandService,} from '~/services/worksheet/state/GoogleSheetsWorksheetStateCommandService';
import {GoogleSheetsWorksheetStateQueryService,} from '~/services/worksheet/state/GoogleSheetsWorksheetStateQueryService';
import {LocalStorageWorksheetStateCommandService,} from '~/services/worksheet/state/LocalStorageWorksheetStateCommandService';
import {LocalStorageWorksheetStateQueryService,} from '~/services/worksheet/state/LocalStorageWorksheetStateQueryService';

export class Services {
  constructor(readonly configuration: WorksheetConfiguration) {
    this.userSettingsCommandService = new LocalStorageUserSettingsCommandService();
    this.userSettingsQueryService = new LocalStorageUserSettingsQueryService();

    if (configuration.definition.bundled) {
      this.worksheetDefinitionQueryService = new BundledWorksheetDefinitionQueryService();
    } else {
      throw new RangeError();
    }

    if (configuration.state.googleSheets) {
      this.worksheetStateCommandService = new GoogleSheetsWorksheetStateCommandService(configuration.state.googleSheets, this.worksheetDefinitionQueryService);
      this.worksheetStateQueryService = new GoogleSheetsWorksheetStateQueryService(configuration.state.googleSheets);
    } else if (configuration.state.localStorage) {
      this.worksheetStateCommandService = new LocalStorageWorksheetStateCommandService();
      this.worksheetStateQueryService = new LocalStorageWorksheetStateQueryService();
    } else {
      throw new RangeError();
    }
  }

  static readonly default = new Services(DefaultWorksheetConfiguration.instance);

  readonly userSettingsCommandService: UserSettingsCommandService;
  readonly userSettingsQueryService: UserSettingsQueryService;
  readonly worksheetDefinitionQueryService: WorksheetDefinitionQueryService;
  readonly worksheetStateCommandService: WorksheetStateCommandService;
  readonly worksheetStateQueryService: WorksheetStateQueryService;
}
