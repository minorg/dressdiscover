import {GoogleSheetsWorksheetStateConfiguration} from "./GoogleSheetsWorksheetStateConfiguration";
import {LocalStorageWorksheetStateConfiguration} from "./LocalStorageWorksheetStateConfiguration";

export interface WorksheetStateConfiguration {
  readonly googleSheets?: GoogleSheetsWorksheetStateConfiguration;
  readonly localStorage?: LocalStorageWorksheetStateConfiguration;
}
