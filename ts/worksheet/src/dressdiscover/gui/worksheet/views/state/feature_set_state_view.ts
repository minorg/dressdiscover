import { FeatureSetStateViewModel } from 'dressdiscover/gui/worksheet/view_models/state/feature_set_state_view_model';
import { AbstractStateView } from 'dressdiscover/gui/worksheet/views/state/abstract_state_view';

export class FeatureSetStateView extends AbstractStateView<FeatureSetStateViewModel> {
    constructor(viewModel: FeatureSetStateViewModel) {
        super({
            contentHtmlFileName: "state/feature_state_view.html",
            viewModel: viewModel
        });
    }
}
