import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/worksheet_state_id';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';
import { Application } from 'dressdiscover/gui/worksheet/application';
import { TopLevelViewModel } from 'dressdiscover/gui/worksheet/view_models/top_level/top_level_view_model';
import * as ko from 'knockout';
import * as _ from 'underscore';

export class StartViewModel extends TopLevelViewModel {
    constructor() {
        super();

        this.existingStateIds = Application.instance.services.worksheetStateQueryService.getWorksheetStateIdsSync();

        _.bindAll(this, "onClickOpenButton", "onClickStartButton", "onKeypressNewStateId");

        this.openButtonVisible = ko.pureComputed<boolean>({
            owner: this,
            read: () => {
                return !!this.selectedExistingStateId() && this.selectedExistingStateId().length > 0;
            }
        });
    }

    onClickOpenButton() {
        Application.instance.services.worksheetStateQueryService.getWorksheetStateAsync({
            error: Application.instance.errorHandler.handleAsyncError,
            id: WorksheetStateId.parse(this.selectedExistingStateId()),
            success: this._goToFirstState
        });
    }

    onClickStartButton() {
        let newStateId = this.newStateId();
        if (!newStateId) {
            newStateId = "New object " + new Date().toISOString();
        }
        const newState = new WorksheetState({ featureSets: [], id: WorksheetStateId.parse(newStateId) });
        const self = this;
        Application.instance.services.worksheetStateCommandService.putWorksheetStateAsync({
            error: Application.instance.errorHandler.handleAsyncError,
            state: newState,
            success:() => {
                self._goToFirstState(newState);
            }
        });
    }

    private _goToFirstState(worksheetState: WorksheetState): void {
        Application.instance.session.worksheetState(worksheetState);
        Application.instance.router.goToState(new WorksheetStateMark({
            worksheetStateId: worksheetState.id
        }));
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
    readonly openButtonVisible: KnockoutComputed<boolean>;
    readonly selectedExistingStateId = ko.observable<string>();
}