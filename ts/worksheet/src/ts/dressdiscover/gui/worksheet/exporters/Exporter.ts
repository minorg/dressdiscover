import { WorksheetStateWrapper } from '../models/worksheet/WorksheetStateWrapper';

export interface Exporter<T> {
    export(worksheetState: WorksheetStateWrapper): T;
}
