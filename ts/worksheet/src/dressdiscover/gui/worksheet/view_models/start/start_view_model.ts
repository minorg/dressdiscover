import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/worksheet_state_id';
import { Application } from 'dressdiscover/gui/worksheet/application';
import {
    DeleteWorksheetStateConfirmationModalViewModel,
} from 'dressdiscover/gui/worksheet/view_models/start/delete_worksheet_state_confirmation_modal_view_model';
import { TopLevelViewModel } from 'dressdiscover/gui/worksheet/view_models/top_level/top_level_view_model';
import {
    DeleteWorksheetStateConfirmationModalView,
} from 'dressdiscover/gui/worksheet/views/start/delete_worksheet_state_confirmation_modal_view';
import * as ko from 'knockout';
import _ = require('lodash');
import * as moment from 'moment';

export class StartViewModel extends TopLevelViewModel {
    constructor() {
        super({ breadcrumbs: [], title: "Start" });

        this.existingStateIds(Application.instance.services.worksheetStateQueryService.getWorksheetStateIdsSync());
    }

    onClickDeleteButton(worksheetStateId: WorksheetStateId) {
        const modalViewModel = new DeleteWorksheetStateConfirmationModalViewModel(worksheetStateId);
        const self = this;
        new DeleteWorksheetStateConfirmationModalView(modalViewModel).show({
            onHidden: () => {
                if (modalViewModel.delete) {
                    Application.instance.services.worksheetStateCommandService.deleteWorksheetStateAsync({
                        error: Application.instance.errorHandler.handleAsyncError,
                        id: worksheetStateId,
                        success: () => {
                            self.existingStateIds(Application.instance.services.worksheetStateQueryService.getWorksheetStateIdsSync());
                        }
                    })
                }
            }
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

    readonly existingStateIds = ko.observableArray<WorksheetStateId>([]);
    readonly newStateId = ko.observable<string>();
}