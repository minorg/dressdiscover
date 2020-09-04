import { WorksheetDefinition } from '~/models/worksheet/definition/worksheet_definition';
import { WorksheetState } from '~/models/worksheet/state/worksheet_state';

export interface WorksheetStateExporter<T> {
    export(worksheetDefinition: WorksheetDefinition, worksheetStates: WorksheetState[]): T;
}
