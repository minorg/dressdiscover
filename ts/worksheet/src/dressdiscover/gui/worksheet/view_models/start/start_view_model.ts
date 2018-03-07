import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/worksheet_state_id';
import { Application } from 'dressdiscover/gui/worksheet/application';
import { TopLevelViewModel } from 'dressdiscover/gui/worksheet/view_models/top_level/top_level_view_model';
import * as ko from 'knockout';
import * as moment from 'moment';

export class StartViewModel extends TopLevelViewModel {
    constructor() {
        super({ title: "Start" });

        this.existingStateIds = Application.instance.services.worksheetStateQueryService.getWorksheetStateIdsSync();

        this.openButtonEnabled = ko.pureComputed<boolean>({
            owner: this,
            read: () => {
                return !!this.selectedExistingStateId();
            }
        });
    }

    onClickOpenButton() {
        Application.instance.services.worksheetStateQueryService.getWorksheetStateAsync({
            error: Application.instance.errorHandler.handleAsyncError,
            id: this.selectedExistingStateId(),
            success: this._goToFirstState
        });
    }

    onClickStartButton() {
        let newStateIdStem = this.newStateId();
        if (!newStateIdStem) {
            newStateIdStem = "New object " + moment().format("YYYY-MM-DD");
        }
        let newStateIdSuffix = 0;
        let newStateId = newStateIdStem;
        while (_.some(this.existingStateIds, (stateId) => stateId.toString() == newStateId)) {
            newStateId = newStateIdStem + " (" + (++newStateIdSuffix) + ")";
        }
        const newState = new WorksheetState({ featureSets: [], id: WorksheetStateId.parse(newStateId) });
        const self = this;
        Application.instance.services.worksheetStateCommandService.putWorksheetStateAsync({
            error: Application.instance.errorHandler.handleAsyncError,
            state: newState,
            success: () => {
                self._goToFirstState(newState);
            }
        });
    }

    private _goToFirstState(worksheetState: WorksheetState): void {
        Application.instance.session.worksheetState(worksheetState);
        Application.instance.router.goToState(Application.instance.session.worksheetStateMachine.firstStateMark);
    }

    onKeypressNewStateId(d, e) {
        if (e.keyCode != 13) {
            return true;
        }
        this.onClickStartButton();
        return false;
    }

    readonly existingStateIds: WorksheetStateId[];
    readonly newStateId = ko.observable<string>();
    readonly openButtonEnabled: KnockoutComputed<boolean>;
    readonly selectedExistingStateId = ko.observable<WorksheetStateId>();
}