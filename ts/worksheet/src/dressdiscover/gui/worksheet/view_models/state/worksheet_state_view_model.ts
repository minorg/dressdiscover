import { WorksheetFeatureSetId } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_id';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';
import { AbstractStateViewModel } from 'dressdiscover/gui/worksheet/view_models/state/abstract_state_view_model';
import * as ko from 'knockout';

export class WorksheetStateViewModel extends AbstractStateViewModel {
    constructor(kwds: { currentStateMark: WorksheetStateMark }) {
        super(kwds);

        if (this.currentStateMark.review) {
            this.nextButtonVisible = ko.observable<boolean>(false);
            this.previousButtonVisible = ko.observable<boolean>(true);
        } else {
            this.nextButtonVisible = ko.computed<boolean>({
                owner: this,
                read: () => !!this.featureSetIdSelected()
            });
            this.previousButtonVisible = ko.observable<boolean>(false);
        }
    }

    readonly featureSetIdSelected = ko.observable<WorksheetFeatureSetId>();
    readonly nextButtonVisible: KnockoutObservable<boolean>;
    readonly previousButtonVisible: KnockoutObservable<boolean>;
}