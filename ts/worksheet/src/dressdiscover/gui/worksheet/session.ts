import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import * as ko from 'knockout';

export class Session {
    readonly worksheetState = ko.observable<WorksheetState>();
}
