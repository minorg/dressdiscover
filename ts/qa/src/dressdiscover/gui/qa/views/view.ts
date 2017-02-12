import { ViewModel } from "dressdiscover/gui/qa/view_models/view_model";

declare function require(moduleName: string): any;

export class View<ViewModelT extends ViewModel> {
    constructor(viewModel: ViewModelT) {
        this._viewModel = viewModel;
    }

    protected static _requireHtml(htmlFileName: string): string {
        return require("raw!./" + htmlFileName)
    }

    get viewModel() {
        return this._viewModel;
    }

    private _viewModel: ViewModelT;
}