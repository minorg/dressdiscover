import { FeatureStateViewModel } from 'dressdiscover/gui/worksheet/view_models/state/feature_state_view_model';
import { TopLevelView } from 'dressdiscover/gui/worksheet/views/top_level/top_level_view';

export class FeatureStateView extends TopLevelView<FeatureStateViewModel> {
    constructor(viewModel: FeatureStateViewModel) {
        super({
            contentHtmlFileName: "feature_state/feature_state_view.html",
            title: "Worksheet '" + viewModel.worksheetState.id + "', Feature set '" + viewModel.featureSetDefinition.id + "', Feature '" + viewModel.featureDefinition + "'",
            viewModel: viewModel
        });
    }
}
