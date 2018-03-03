import { WorksheetFeatureSetId } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_id';
import { WorksheetStateViewModel } from 'dressdiscover/gui/worksheet/view_models/state/worksheet_state_view_model';
import { AbstractStateView } from 'dressdiscover/gui/worksheet/views/state/abstract_state_view';
import * as ko from 'knockout';

export class WorksheetStateView extends AbstractStateView<WorksheetStateViewModel> {
    constructor(viewModel: WorksheetStateViewModel) {
        super({
            contentHtmlFileName: "state/worksheet_state_view.html",
            viewModel: viewModel
        });

        this.nextButtonVisible = ko.computed<boolean>({
            owner: this,
            read: () => !!this.featureSetIdSelected()
        });
    }

    readonly featureSetIdSelected = ko.observable<WorksheetFeatureSetId>();
    readonly nextButtonVisible: KnockoutComputed<boolean>;
}
