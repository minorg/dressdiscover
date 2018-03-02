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
        console.info("Open button");
    }

    onClickStartButton() {
        console.info("Start button");
    }

    onKeypressNewStateId(d, e) {
        if (e.keyCode != 13) {
            return true;
        }
        this.onClickStartButton();
        return false;
    }

    readonly existingStateIds: string[];
    readonly newStateId = ko.observable<string>();
    readonly openButtonVisible: KnockoutComputed<boolean>;
    readonly selectedExistingStateId = ko.observable<string>();
}