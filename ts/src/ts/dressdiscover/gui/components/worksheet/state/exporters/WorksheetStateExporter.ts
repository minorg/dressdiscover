import { WorksheetStateWrapper } from 'dressdiscover/gui/models/worksheet/state/WorksheetStateWrapper';

export interface WorksheetStateExporter<T> {
    export(worksheetState: WorksheetStateWrapper): T;
}
