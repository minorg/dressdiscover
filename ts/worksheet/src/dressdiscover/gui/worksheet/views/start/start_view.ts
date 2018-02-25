import { StartViewModel } from 'dressdiscover/gui/worksheet/view_models/start/start_view_model';
import { TopLevelView } from 'dressdiscover/gui/worksheet/views/top_level/top_level_view';

export class StartView extends TopLevelView<StartViewModel> {
    constructor() {
        super({
            contentHtmlFileName: "start/start_view.html",
            title: "Start",
            viewModel: new StartViewModel()
        });
    }
}