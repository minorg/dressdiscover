import { StateViewModel } from 'dressdiscover/gui/worksheet/view_models/state/state_view_model';
import { TopLevelView } from 'dressdiscover/gui/worksheet/views/top_level/top_level_view';

export class StateView extends TopLevelView<StateViewModel> {
    constructor(viewModel: StateViewModel) {
        super({
            contentHtmlFileName: "state/state_view.html",
            title: "Worksheet " + viewModel.state.id,
            viewModel: viewModel
        });
    }
}
