import {GoogleSheetsWorksheetStateConfiguration} from "./GoogleSheetsWorksheetStateonfiguration";
import {LocalStorageWorksheetStateConfiguration} from "./LocalStorageWorksheetStateConfiguration";

export interface WorksheetStateConfiguration {
  readonly googleSheets?: GoogleSheetsWorksheetStateConfiguration;
  readonly localStorage?: LocalStorageWorksheetStateConfiguration;
}
