import { WorksheetStateViewModel } from 'dressdiscover/gui/worksheet/view_models/state/worksheet_state_view_model';
import { AbstractStateView } from 'dressdiscover/gui/worksheet/views/state/abstract_state_view';

export class WorksheetStateView extends AbstractStateView<WorksheetStateViewModel> {
    constructor(viewModel: WorksheetStateViewModel) {
        super({
            contentHtmlFileName: "state/worksheet_state_view.html",
            templateHtmlFileNames: ["state/feature_set_state_table_template.html"],
            viewModel: viewModel
        });
    }
}
