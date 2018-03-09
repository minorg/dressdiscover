import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/worksheet_state_id';
import { Application } from 'dressdiscover/gui/worksheet/application';
import { TopLevelViewModel } from 'dressdiscover/gui/worksheet/view_models/top_level/top_level_view_model';
import * as ko from 'knockout';
import _ = require('lodash');
import * as moment from 'moment';

class ExistingWorksheetState {
    constructor(private readonly parent: StartViewModel, id: WorksheetStateId) {
        this.id(id);

        this.renameConfirmButtonEnabled = ko.computed({
            owner: this,
            read: () => {
                if (!this.newId()) {
                    return false;
                }
                return this.newId().length > 0;
            }
        });
    }

    onClickDeleteButton() {
        this.deleting(true);
        this.renaming(null);
    }

    onClickDeleteCancelButton() {
        this.deleting(null);
    }

    onClickDeleteConfirmButton() {
        if (!this.deleting()) {
            return;
        }
        const self = this;
        Application.instance.services.worksheetStateCommandService.deleteWorksheetStateAsync({
            error: Application.instance.errorHandler.handleAsyncError,
            id: this.id(),
            success: () => {
                self.parent.refreshExistingWorksheetStates();
            }
        })
    }

    onClickRenameButton() {
        this.deleting(null);
        this.renaming(true);
        $(".rename-input").focus();
    }

    onClickRenameCancelButton() {
        this.renaming(null);
    }

    onClickRenameConfirmButton() {
        if (!this.renaming()) {
            return;
        }
        const newIdString = this.newId();
        if (!newIdString || newIdString.length == 0) {
            return;
        }
        const newId = WorksheetStateId.parse(newIdString);

        const self = this;
        Application.instance.services.worksheetStateCommandService.renameWorksheetStateAsync({
            error: Application.instance.errorHandler.handleAsyncError,
            oldId: this.id(),
            newId: newId,
            success: () => {
                self.id(newId);
                self.parent.refreshExistingWorksheetStates();
            }
        });
    }

    onKeypressNewId(d, e) {
        if (e.keyCode === 13) {
            if (this.renameConfirmButtonEnabled()) {
                this.onClickRenameConfirmButton();
            } else {
                this.onClickRenameCancelButton();
            }
            return false;
        }
        return true;
    }

    deleting = ko.observable<boolean>();
    id = ko.observable<WorksheetStateId>();
    newId = ko.observable<string>();
    renameConfirmButtonEnabled: KnockoutComputed<boolean>;
    renaming = ko.observable<boolean>();
}

export class StartViewModel extends TopLevelViewModel {
    constructor() {
        super({ breadcrumbs: [], title: "Start" });

        this.refreshExistingWorksheetStates();
    }

    onClickStartButton() {
        let newWorksheetStateIdStem = this.newWorksheetStateId();
        if (!newWorksheetStateIdStem) {
            newWorksheetStateIdStem = "New object " + moment().format("YYYY-MM-DD");
        }
        let newWorksheetStateIdSuffix = 0;
        let newWorksheetStateId = newWorksheetStateIdStem;
        while (_.some(this.existingWorksheetStates(), (existingWorksheetState) => existingWorksheetState.id.toString() == newWorksheetStateId)) {
            newWorksheetStateId = newWorksheetStateIdStem + " (" + (++newWorksheetStateIdSuffix) + ")";
        }
        const newState = new WorksheetState({ featureSets: [], id: WorksheetStateId.parse(newWorksheetStateId) });
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

    onKeypressNewWorksheetStateId(d, e) {
        if (e.keyCode != 13) {
            return true;
        }
        this.onClickStartButton();
        return false;
    }

    refreshExistingWorksheetStates() {
        const result: ExistingWorksheetState[] = [];
        const worksheetStateIds = Application.instance.services.worksheetStateQueryService.getWorksheetStateIdsSync();
        worksheetStateIds.sort((left, right) => left.toString().localeCompare(right.toString()));
        for (let worksheetStateId of worksheetStateIds) {
            result.push(new ExistingWorksheetState(this, worksheetStateId));
        }
        this.existingWorksheetStates(result);
    }

    readonly existingWorksheetStates = ko.observableArray<ExistingWorksheetState>([]);
    readonly newWorksheetStateId = ko.observable<string>();
}