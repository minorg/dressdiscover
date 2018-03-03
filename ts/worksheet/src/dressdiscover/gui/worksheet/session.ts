import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import { WorksheetStateMachine } from 'dressdiscover/gui/worksheet/models/worksheet_state_machine';
import * as ko from 'knockout';

export class Session {
    constructor() {
        this.worksheetStateMachine = new WorksheetStateMachine(this.worksheetState);
    }

    readonly worksheetState = ko.observable<WorksheetState>();
    readonly worksheetStateMachine: WorksheetStateMachine;
}
