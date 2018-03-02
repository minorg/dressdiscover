import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';

export class Session {
    readonly worksheetState = ko.observable<WorksheetState>();
}
