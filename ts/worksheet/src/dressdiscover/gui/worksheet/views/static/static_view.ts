import { TopLevelViewModel } from 'dressdiscover/gui/worksheet/view_models/top_level/top_level_view_model';
import { TopLevelView } from 'dressdiscover/gui/worksheet/views/top_level/top_level_view';

export class StaticView extends TopLevelView<TopLevelViewModel> {
    constructor(kwds: { contentHtmlFileName: string, title: string }) {
        super({
            contentHtmlFileName: kwds.contentHtmlFileName,
            title: kwds.title,
            viewModel: new TopLevelViewModel()
        });
    }
}
