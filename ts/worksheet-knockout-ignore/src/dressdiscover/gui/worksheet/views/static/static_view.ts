import { Breadcrumb } from 'dressdiscover/gui/worksheet/models/breadcrumb';
import { TopLevelViewModel } from 'dressdiscover/gui/worksheet/view_models/top_level/top_level_view_model';
import { TopLevelView } from 'dressdiscover/gui/worksheet/views/top_level/top_level_view';

export class StaticView extends TopLevelView<TopLevelViewModel> {
    constructor(kwds: { contentHtmlFileName: string, title: string }) {
        super({
            contentHtmlFileName: kwds.contentHtmlFileName,
            viewModel: new TopLevelViewModel({ breadcrumbs: [new Breadcrumb(kwds.title)], title: kwds.title })
        });
    }
}
