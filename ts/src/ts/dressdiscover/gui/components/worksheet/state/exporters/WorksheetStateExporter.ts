import { WorksheetDefinition } from 'dressdiscover/api/models/worksheet/definition/worksheet_definition';
import { WorksheetState } from 'dressdiscover/api/models/worksheet/state/worksheet_state';

export interface WorksheetStateExporter<T> {
    export(worksheetDefinition: WorksheetDefinition, worksheetStates: WorksheetState[]): T;
}
