import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import { Application } from 'dressdiscover/gui/worksheet/application';
import { WorksheetStateMachine } from 'dressdiscover/gui/worksheet/models/worksheet_state_machine';
import * as ko from 'knockout';

export class Session {
    constructor() {
        this.worksheetStateMachine = new WorksheetStateMachine(this.worksheetState);

        const self = this;
        this.worksheetState.subscribe((newWorksheetState) => {
            if (!newWorksheetState) {
                self._lastWorksheetState = newWorksheetState;
                return;
            }
            if (self._lastWorksheetState && !self._lastWorksheetState.equals(newWorksheetState)) {
                console.info("Putting state, last = " + self._lastWorksheetState.toString() + ", new = " + newWorksheetState.toString());
                Application.instance.services.worksheetStateCommandService.putWorksheetStateSync({ state: newWorksheetState });
            }
            self._lastWorksheetState = newWorksheetState;
        });
    }

    private _lastWorksheetState: WorksheetState | null = null;
    readonly worksheetState = ko.observable<WorksheetState>();
    readonly worksheetStateMachine: WorksheetStateMachine;
}
