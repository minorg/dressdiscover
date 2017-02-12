﻿import { NavbarView } from "dressdiscover/gui/qa/views/navbar_view";
import { View } from "dressdiscover/gui/qa/views/view";
import { ViewModel } from "dressdiscover/gui/qa/view_models/view_model";

export class TopLevelView<ViewModelT extends ViewModel> extends View<ViewModelT> {
    constructor(contentHtmlFileName: string, viewModel: ViewModelT) {
        super(viewModel);
        this._contentHtml = View._requireHtml(contentHtmlFileName);
        this._frameHtml = View._requireHtml("top_level_view.html");
    }

    show() {
        const self = this;
        const navbarHtml = new NavbarView().html;
        $("#app").html(this._frameHtml).ready(() => {
            $("#navbar").html(navbarHtml);
            $("#content").html(self._contentHtml);
        });
    }

    private _contentHtml: string;
    private _frameHtml: string;
}
