import { WorksheetDefinition } from 'dressdiscover/gui/models/worksheet/definition/worksheet_definition';
import { WorksheetState } from 'dressdiscover/gui/models/worksheet/state/worksheet_state';

export interface WorksheetStateExporter<T> {
    export(worksheetDefinition: WorksheetDefinition, worksheetStates: WorksheetState[]): T;
}
