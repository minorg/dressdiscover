import { FeatureStateViewModel } from 'dressdiscover/gui/worksheet/view_models/state/feature_state_view_model';
import { AbstractStateView } from 'dressdiscover/gui/worksheet/views/state/abstract_state_view';

export class FeatureStateView extends AbstractStateView<FeatureStateViewModel> {
    constructor(viewModel: FeatureStateViewModel) {
        super({
            contentHtmlFileName: "feature_state/feature_state_view.html",
            viewModel: viewModel
        });
    }
}
