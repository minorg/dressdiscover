import { FeatureSetStateViewModel } from 'dressdiscover/gui/worksheet/view_models/state/feature_set_state_view_model';
import { TopLevelView } from 'dressdiscover/gui/worksheet/views/top_level/top_level_view';

export class FeatureSetStateView extends TopLevelView<FeatureSetStateViewModel> {
    constructor(viewModel: FeatureSetStateViewModel) {
        super({
            contentHtmlFileName: "feature_state/feature_state_view.html",
            title: "Worksheet '" + viewModel.worksheetState.id + "', Feature set '" + viewModel.featureSetDefinition.id + "'",
            viewModel: viewModel
        });
    }
}
