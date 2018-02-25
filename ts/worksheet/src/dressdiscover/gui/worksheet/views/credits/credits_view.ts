import { TopLevelViewModel } from 'dressdiscover/gui/worksheet/view_models/top_level/top_level_view_model';
import { TopLevelView } from 'dressdiscover/gui/worksheet/views/top_level/top_level_view';

export class CreditsView extends TopLevelView<TopLevelViewModel> {
    constructor() {
        super({
            contentHtmlFileName: "credits_view.html",
            title: "Credits",
            viewModel: new TopLevelViewModel()
        });
    }
}
