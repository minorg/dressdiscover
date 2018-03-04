import { AbstractStateViewModel } from 'dressdiscover/gui/worksheet/view_models/state/abstract_state_view_model';
import { TopLevelView } from 'dressdiscover/gui/worksheet/views/top_level/top_level_view';
import { View } from 'dressdiscover/gui/worksheet/views/view';
import * as ko from 'knockout';

export abstract class AbstractStateView<ViewModelT extends AbstractStateViewModel> extends TopLevelView<ViewModelT> {
    constructor(kwds: {
        contentHtmlFileName: string,
        templateHtmlFileNames?: string[],
        viewModel: ViewModelT
    }) {
        super({
            contentHtmlFileName: "state/abstract_state_view.html",
            templateHtmlFileNames: (kwds.templateHtmlFileNames ? kwds.templateHtmlFileNames : []).concat([
                "state/description_template.html",
                "state/next_previous_buttons_template.html"
            ]),
            title: kwds.viewModel.titleTagText,
            viewModel: kwds.viewModel
        });

        this._stateContentHtml = View._requireHtml("state/abstract_state_view.html");
    }

    show(ready?: () => void) {
        super.show(() => {
            const contentEl = $("#state-content");
            contentEl.html(this._stateContentHtml);
            ko.applyBindings(this.viewModel, contentEl[0]);

            if (ready) {
                ready();
            }
        });
    }

    private _stateContentHtml: string;
}