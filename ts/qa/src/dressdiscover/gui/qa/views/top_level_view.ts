import * as ko from "knockout";
import { NavbarView } from "dressdiscover/gui/qa/views/navbar_view";
import { View } from "dressdiscover/gui/qa/views/view";
import { ViewModel } from "dressdiscover/gui/qa/view_models/view_model";

export class TopLevelView<ViewModelT extends ViewModel> extends View<ViewModelT> {
    constructor(contentHtmlFileName: string, templateHtmlFileNames: string[], viewModel: ViewModelT) {
        super(viewModel);
        this._contentHtml = View._requireHtml(contentHtmlFileName);
        for (let templateHtmlFileName of templateHtmlFileNames) {
            this._contentHtml = View._requireHtml(templateHtmlFileName) + this._contentHtml;
        }
        this._frameHtml = View._requireHtml("top_level_view.html");
    }

    show() {
        const self = this;
        const navbarHtml = new NavbarView().html;
        $("#app").html(this._frameHtml).ready(() => {
            $("#navbar").html(navbarHtml);
            const contentEl = $("#content");
            contentEl.html(self._contentHtml);
            ko.applyBindings(self.viewModel, contentEl[0]);
        });
    }

    private _contentHtml: string;
    private _frameHtml: string;
}
