import {GoogleSheetsWorksheetStateConfiguration} from "~/models/worksheet/configuration/GoogleSheetsWorksheetStateonfiguration";
import {WorksheetState} from "~/models/worksheet/state/WorksheetState";
import {WorksheetStateId} from "~/models/worksheet/state/WorksheetStateId";
import {WorksheetDefinitionQueryService} from "~/services/worksheet/definition/WorksheetDefinitionQueryService";
import {NoSuchWorksheetStateException} from "~/services/worksheet/state/NoSuchWorksheetStateException";
import {WorksheetStateCommandService} from "~/services/worksheet/state/WorksheetStateCommandService";
import {GoogleSheetsWorksheetStateExporter} from "~/components/worksheet/state/exporters/GoogleSheetsWorksheetStateExporter";
import {convertGapiErrorToException} from "~/services/GapiException";
import {GoogleSheetsWorksheetStateQueryService} from "~/services/worksheet/state/GoogleSheetsWorksheetStateQueryService";

export class GoogleSheetsWorksheetStateCommandService
  implements WorksheetStateCommandService {
  constructor(
    private readonly configuration: GoogleSheetsWorksheetStateConfiguration,
    private readonly worksheetDefinitionQueryService: WorksheetDefinitionQueryService
  ) {}

  deleteWorksheetState(kwds: {id: WorksheetStateId}): Promise<void> {
    return new Promise((resolve, reject) => {
      this.getWorksheetStates().then(
        (worksheetStates) => {
          this.replaceWorksheetStates(
            worksheetStates.filter(
              (worksheetState) => !worksheetState.id.equals(kwds.id)
            )
          ).then(
            () => resolve(),
            (reason) => reject(reason)
          );
        },
        (reason) => reject(reason)
      );
    });
  }

  putWorksheetState(kwds: {state: WorksheetState}): Promise<void> {
    return new Promise((resolve, reject) => {
      this.getWorksheetStates().then(
        (oldWorksheetStates) => {
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

          this.replaceWorksheetStates(newWorksheetStates).then(
            () => resolve(),
            (reason) => reject(reason)
          );
        },
        (reason) => reject(reason)
      );
    });
  }

  renameWorksheetState(kwds: {
    newId: WorksheetStateId;
    oldId: WorksheetStateId;
  }): Promise<void> {
    return new Promise((resolve, reject) => {
      this.getWorksheetStates().then(
        (worksheetStates) => {
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
            reject(new NoSuchWorksheetStateException({id: kwds.oldId}));
            return;
          }

          this.replaceWorksheetStates(newWorksheetStates).then(
            () => resolve(),
            (reason) => reject(reason)
          );
        },
        (reason) => reject(reason)
      );
    });
  }

  private getWorksheetStates() {
    return GoogleSheetsWorksheetStateQueryService.getWorksheetStates({
      spreadsheetId: this.configuration.spreadsheetId,
    });
  }

  private replaceFirstSheetData(stringRows: string[][]): Promise<void> {
    const spreadsheetId = this.configuration.spreadsheetId;
    const requests: gapi.client.sheets.Request[] = [];
    requests.push({
      deleteRange: {
        range: {
          sheetId: 0,
          startColumnIndex: 0,
          startRowIndex: 0,
        },
        shiftDimension: "ROWS",
      },
    });
    const rows: gapi.client.sheets.RowData[] = [];
    for (const stringRow of stringRows) {
      const values: gapi.client.sheets.CellData[] = [];
      for (const stringCell of stringRow) {
        values.push({userEnteredValue: {stringValue: stringCell}});
      }
      rows.push({values});
    }
    requests.push({appendCells: {fields: "*", rows}});

    return new Promise((resolve, reject) => {
      (GoogleSheetsWorksheetStateQueryService.getSpreadsheetsResource() as any)
        .batchUpdate({spreadsheetId}, {requests})
        .then(
          (response: any) => resolve(),
          (reason: any) => {
            reject(convertGapiErrorToException(reason));
          }
        );
    });
  }

  private replaceWorksheetStates(
    newWorksheetStates: WorksheetState[]
  ): Promise<void> {
    const self = this;
    return new Promise((resolve, reject) => {
      this.worksheetDefinitionQueryService.getWorksheetDefinition().then(
        (worksheetDefinition) => {
          self
            .replaceFirstSheetData(
              new GoogleSheetsWorksheetStateExporter().export(
                worksheetDefinition,
                newWorksheetStates
              )
            )
            .then(resolve, reject);
        },
        (reason) => reject(reason)
      );
    });
  }
}
