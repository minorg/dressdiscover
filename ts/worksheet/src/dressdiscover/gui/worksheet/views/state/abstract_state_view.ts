import { AbstractStateViewModel } from 'dressdiscover/gui/worksheet/view_models/state/abstract_state_view_model';
import { TopLevelView } from 'dressdiscover/gui/worksheet/views/top_level/top_level_view';

export abstract class AbstractStateView<ViewModelT extends AbstractStateViewModel> extends TopLevelView<ViewModelT> {
    constructor(kwds: {
        contentHtmlFileName: string,
        templateHtmlFileNames?: string[],
        viewModel: ViewModelT
    }) {
        super({
            contentHtmlFileName: kwds.contentHtmlFileName,
            templateHtmlFileNames: (kwds.templateHtmlFileNames ? kwds.templateHtmlFileNames : []).concat(["state/next_previous_buttons_template.html"]),
            title: kwds.viewModel.titleTagText,
            viewModel: kwds.viewModel
        });
    }
}