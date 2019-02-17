import {
    GoogleSheetsWorksheetStateConfiguration,
} from 'dressdiscover/api/models/worksheet/configuration/google_sheets_worksheet_state_configuration';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/state/worksheet_state_id';
import { IoException } from 'dressdiscover/api/services/io_exception';
import { NoSuchWorksheetStateException } from 'dressdiscover/api/services/worksheet/state/no_such_worksheet_state_exception';
import { WorksheetStateQueryService } from 'dressdiscover/api/services/worksheet/state/worksheet_state_query_service';
import { CsvWorksheetStateImporter } from 'dressdiscover/gui/components/worksheet/state/importers/CsvWorksheetStateImporter';
import * as _ from 'lodash';

export class GoogleSheetsWorksheetStateQueryService implements WorksheetStateQueryService {
    constructor(private readonly configuration: GoogleSheetsWorksheetStateConfiguration) {
    }

    static getFirstSheetData(kwds: { spreadsheetId: string }): Promise<string[][]> {
        return new Promise((resolve, reject) => {
            gapi.client.spreadsheets.get(kwds).then((response) => {
                const sheets = response.result.sheets;
                if (!sheets || !sheets.length) {
                    resolve([]);
                    return;
                }

                const firstSheet = sheets[0];
                if (!firstSheet.data) {
                    resolve([]);
                    return;
                }

                const firstSheetData = firstSheet.data[0];

                const rowData = firstSheetData.rowData;
                if (!rowData) {
                    resolve([]);
                    return;
                }

                const stringRows: string[][] = [];
                for (const rowDatum of rowData) {
                    if (!rowDatum.values) {
                        continue;
                    }
                    const stringRow: string[] = [];
                    for (const cellDatum of rowDatum.values) {
                        const value = cellDatum.effectiveValue;
                        let stringValue: string;
                        if (!value) {
                            stringValue = "";
                        } else if (!_.isUndefined(value.boolValue)) {
                            stringValue = value.boolValue ? "true" : "false";
                        } else if (!_.isUndefined(value.errorValue)) {
                            stringValue = "error";
                        } else if (!_.isUndefined(value.formulaValue)) {
                            stringValue = "formula";
                        } else if (!_.isUndefined(value.numberValue)) {
                            stringValue = value.numberValue.toString();
                        } else if (!_.isUndefined(value.stringValue)) {
                            stringValue = value.stringValue;
                        } else {
                            stringValue = "";
                        }
                        stringRow.push(stringValue);
                    }
                    stringRows.push(stringRow);
                }
                resolve(stringRows);
            }, (reason: any) => {
                reject(new IoException(reason.toString()));
            });
        });
    }

    getWorksheetState(kwds: { id: WorksheetStateId; }): Promise<WorksheetState> {
        const spreadsheetId = this.configuration.spreadsheetId;
        return new Promise((resolve, reject) => {
            GoogleSheetsWorksheetStateQueryService.getFirstSheetData({ spreadsheetId }).then((stringRows) => {
                const worksheetStates = new CsvWorksheetStateImporter().importCsvRows(stringRows);
                for (const worksheetState of worksheetStates) {
                    if (worksheetState.id.equals(kwds.id)) {
                        resolve(worksheetState);
                        return;
                    }
                }
                reject(new NoSuchWorksheetStateException(kwds));
            }, (reason: any) => reject(reason));
        });
    }

    getWorksheetStateIds(): Promise<WorksheetStateId[]> {
        const spreadsheetId = this.configuration.spreadsheetId;
        return new Promise((resolve, reject) => {
            GoogleSheetsWorksheetStateQueryService.getFirstSheetData({ spreadsheetId }).then((stringRows) => {
                const worksheetStates = new CsvWorksheetStateImporter().importCsvRows(stringRows);
                return worksheetStates.map((worksheetState) => worksheetState.id);
            }, (reason: any) => reject(reason));
        });
    }
}
