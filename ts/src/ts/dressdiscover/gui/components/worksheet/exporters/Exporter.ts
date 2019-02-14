import { WorksheetStateWrapper } from 'dressdiscover/gui/models/worksheet/state/WorksheetStateWrapper';

export interface Exporter<T> {
    export(worksheetState: WorksheetStateWrapper): T;
}
