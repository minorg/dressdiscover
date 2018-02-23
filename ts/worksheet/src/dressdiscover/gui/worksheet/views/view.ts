import { ViewModel } from 'dressdiscover/gui/view_models/view_model';

declare function require(moduleName: string): any;

export abstract class View<ViewModelT extends ViewModel> {
    constructor(kwds: { viewModel: ViewModelT }) {
        this._viewModel = kwds.viewModel;
    }

    protected static _requireHtml(htmlFileName: string): string {
        return require("raw-loader!./" + htmlFileName)
    }

    get viewModel() {
        return this._viewModel;
    }

    private _viewModel: ViewModelT;
}