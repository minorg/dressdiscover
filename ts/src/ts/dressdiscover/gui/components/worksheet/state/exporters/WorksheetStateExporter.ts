import { WorksheetState } from 'dressdiscover/api/models/worksheet/state/worksheet_state';

export interface WorksheetStateExporter<T> {
    export(worksheetStates: WorksheetState[]): T;
}
