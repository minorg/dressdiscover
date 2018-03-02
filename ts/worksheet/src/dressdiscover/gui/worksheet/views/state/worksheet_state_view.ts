import { WorksheetStateViewModel } from 'dressdiscover/gui/worksheet/view_models/state/worksheet_state_view_model';
import { TopLevelView } from 'dressdiscover/gui/worksheet/views/top_level/top_level_view';

export class WorksheetStateView extends TopLevelView<WorksheetStateViewModel> {
    constructor(viewModel: WorksheetStateViewModel) {
        super({
            contentHtmlFileName: "state/state_view.html",
            title: "Worksheet " + viewModel.worksheetState.id,
            viewModel: viewModel
        });
    }
}
