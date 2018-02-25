import { Application } from 'dressdiscover/gui/worksheet/application';
import { TopLevelViewModel } from 'dressdiscover/gui/worksheet/view_models/top_level/top_level_view_model';
import * as ko from 'knockout';
import * as _ from 'underscore';

export class StartViewModel extends TopLevelViewModel {
    constructor() {
        super();

        this.existingAccessionNumbers = [""].concat(Application.instance.services.worksheetStateQueryService.getWorksheetAccessionNumbersSync());

        _.bindAll(this, "onClickOpenButton", "onClickStartButton", "onKeypressNewAccessionNumber");

        this.openButtonVisible = ko.pureComputed<boolean>({
            owner: this,
            read: () => {
                return this.selectedExistingAccessionNumber().length > 0;
            }
        });
    }

    onClickOpenButton() {
        console.info("Open button");
    }

    onClickStartButton() {
        console.info("Start button");
    }

    onKeypressNewAccessionNumber(d, e) {
        if (e.keyCode != 13) {
            return true;
        }
        this.onClickStartButton();
        return false;
    }

    readonly existingAccessionNumbers: string[];
    readonly newAccessionNumber = ko.observable<string>();
    readonly openButtonVisible: KnockoutComputed<boolean>;
    readonly selectedExistingAccessionNumber = ko.observable<string>("");
}