﻿import {
    GoogleSheetsWorksheetStateConfiguration,
} from 'dressdiscover/api/models/worksheet/configuration/google_sheets_worksheet_state_configuration';
import { WorksheetState } from 'dressdiscover/api/models/worksheet/state/worksheet_state';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/state/worksheet_state_id';
import { NoSuchWorksheetStateException } from 'dressdiscover/api/services/worksheet/state/no_such_worksheet_state_exception';
import { WorksheetStateCommandService } from 'dressdiscover/api/services/worksheet/state/worksheet_state_command_service';
import { CsvWorksheetStateExporter } from 'dressdiscover/gui/components/worksheet/state/exporters/CsvWorksheetStateExporter';
import {
    GoogleSheetsWorksheetStateQueryService,
} from 'dressdiscover/gui/services/worksheet/state/GoogleSheetsWorksheetStateQueryService';

export class GoogleSheetsWorksheetStateCommandService implements WorksheetStateCommandService {
    constructor(private readonly configuration: GoogleSheetsWorksheetStateConfiguration) {
    }

    deleteWorksheetState(kwds: { id: WorksheetStateId; }): Promise<void> {
        return new Promise((resolve, reject) => {
            this.getWorksheetStates().then((worksheetStates) => {
                this.replaceWorksheetStates(worksheetStates.filter((worksheetState) => !worksheetState.id.equals(kwds.id))).then(() => resolve(), (reason) => reject(reason));
            }, (reason) => reject(reason));
        });
    }

    putWorksheetState(kwds: { state: WorksheetState; }): Promise<void> {
        return new Promise((resolve, reject) => {
            this.getWorksheetStates().then((oldWorksheetStates) => {
                const newWorksheetStates: WorksheetState[] = [];
                let replaced: boolean = false;
                for (const oldWorksheetState of oldWorksheetStates) {
                    if (!replaced && oldWorksheetState.id.equals(kwds.state.id)) {
                        newWorksheetStates.push(kwds.state);
                        replaced = true;
                    } else {
                        newWorksheetStates.push(oldWorksheetState);
                    }
                }
                if (!replaced) {
                    newWorksheetStates.push(kwds.state);
                }

                this.replaceWorksheetStates(newWorksheetStates).then(() => resolve(), (reason) => reject(reason));
            }, (reason) => reject(reason));
        });
    }

    renameWorksheetState(kwds: { newId: WorksheetStateId; oldId: WorksheetStateId; }): Promise<void> {
        return new Promise((resolve, reject) => {
            this.getWorksheetStates().then((worksheetStates) => {
                const newWorksheetStates: WorksheetState[] = [];
                let renamed: boolean = false;
                for (const worksheetState of worksheetStates) {
                    if (!renamed && worksheetState.id.equals(kwds.oldId)) {
                        worksheetState.id = kwds.newId;
                        renamed = true;
                    }
                    newWorksheetStates.push(worksheetState);
                }
                if (!renamed) {
                    reject(new NoSuchWorksheetStateException({ id: kwds.oldId }));
                    return;
                }

                this.replaceWorksheetStates(newWorksheetStates).then(() => resolve(), (reason) => reject(reason));
            }, (reason) => reject(reason));
        });
    }

    private getWorksheetStates() {
        return GoogleSheetsWorksheetStateQueryService.getWorksheetStates({ spreadsheetId: this.configuration.spreadsheetId });
    }

    private replaceFirstSheetData(stringRows: string[][]): Promise<void> {
        const spreadsheetId = this.configuration.spreadsheetId;
        const requests: gapi.client.sheets.Request[] = [];
        requests.push({
            deleteRange: {}
        });
        const rows: gapi.client.sheets.RowData[] = [];
        for (const stringRow of stringRows) {
            const values: gapi.client.sheets.CellData[] = [];
            for (const stringCell of stringRow) {
                values.push({ userEnteredValue: { stringValue: stringCell } });
            }
            rows.push({ values });
        }
        requests.push({ appendCells: { rows } });

        return new Promise((resolve, reject) => {
            (gapi.client.spreadsheets as any).batchUpdate({ spreadsheetId }, { requests })
                .then((response: any) => resolve(), (reason: any) => reject(reason));
        });
    }

    private replaceWorksheetStates(newWorksheetStates: WorksheetState[]): Promise<void> {
        return this.replaceFirstSheetData(new CsvWorksheetStateExporter().export(newWorksheetStates));
    }
}
