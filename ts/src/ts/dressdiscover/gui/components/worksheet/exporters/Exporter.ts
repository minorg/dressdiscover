import { WorksheetStateWrapper } from '../models/worksheet/state/WorksheetStateWrapper';

export interface Exporter<T> {
    export(worksheetState: WorksheetStateWrapper): T;
}
