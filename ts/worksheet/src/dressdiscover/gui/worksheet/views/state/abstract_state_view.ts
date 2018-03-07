import { AbstractStateViewModel } from 'dressdiscover/gui/worksheet/view_models/state/abstract_state_view_model';
import { TopLevelView } from 'dressdiscover/gui/worksheet/views/top_level/top_level_view';
import { View } from 'dressdiscover/gui/worksheet/views/view';
import * as Hammer from 'hammerjs';
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
            viewModel: kwds.viewModel
        });

        this._stateContentHtml = View._requireHtml(kwds.contentHtmlFileName);
    }

    show(ready?: () => void) {
        super.show(() => {
            const contentEl = $("#state-content");
            ko.cleanNode(contentEl[0]);
            contentEl.html(this._stateContentHtml);
            ko.applyBindings(this.viewModel, contentEl[0]);

            const hammer = new Hammer($("#content")[0]);
            const self = this;
            hammer.on("swipeleft", (ev) => {
                if (self.viewModel.previousButtonEnabled()) {
                    self.viewModel.onClickPreviousButton();
                }
            });
            hammer.on("swiperight", (ev) => {
                if (self.viewModel.nextButtonEnabled()) {
                    self.viewModel.onClickNextButton();
                }
            });

            if (ready) {
                ready();
            }
        });
    }

    private _stateContentHtml: string;
}