import { ViewModel } from "dressdiscover/gui/qa/view_models/view_model";

declare function require(moduleName: string): any;

export class View<ViewModelT extends ViewModel> {
    constructor(htmlFileName: string, viewModel: ViewModelT) {
        this._html = require("raw!./" + htmlFileName);
        this._viewModel = viewModel;
    }

    get html() {
        return this._html;
    }

    get viewModel() {
        return this._viewModel;
    }

    private _html: string;
    private _viewModel: ViewModelT;
}