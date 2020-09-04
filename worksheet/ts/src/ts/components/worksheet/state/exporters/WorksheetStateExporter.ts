import { WorksheetDefinition } from '~/models/worksheet/definition/WorksheetDefinition';
import { WorksheetState } from '~/models/worksheet/state/WorksheetState';

export interface WorksheetStateExporter<T> {
    export(worksheetDefinition: WorksheetDefinition, worksheetStates: WorksheetState[]): T;
}
