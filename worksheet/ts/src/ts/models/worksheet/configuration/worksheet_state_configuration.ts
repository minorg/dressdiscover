import { GoogleSheetsWorksheetStateConfiguration } from "./google_sheets_worksheet_state_configuration";
import { LocalStorageWorksheetStateConfiguration } from "./local_storage_worksheet_state_configuration";

export interface WorksheetStateConfiguration {
    readonly googleSheets?: GoogleSheetsWorksheetStateConfiguration;
    readonly localStorage?: LocalStorageWorksheetStateConfiguration;
}
