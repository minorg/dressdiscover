import * as ko from "knockout";
import { View } from "dressdiscover/gui/qa/views/view";
import { ViewModel } from "dressdiscover/gui/qa/view_models/view_model";

export abstract class ModalView<ViewModelT extends ViewModel> extends View<ViewModelT> {
    constructor(htmlFileName: string, viewModel: ViewModelT) {
        super(viewModel);
        this._html = View._requireHtml(htmlFileName);
    }

    static hide() {
        ($('#modal') as any).modal('hide');
    }

    show(onShown: ()=>void | undefined) {
        const self = this;
        const el = $("#modal");
        el.html(this._html);
        el.on('shown.bs.modal', function (e) {
            ko.applyBindings(self.viewModel, el.get()[0]);
            if (onShown) {
                onShown();
            }
        });
        (el as any).modal({ backdrop: 'static', show: true, keyboard: false });
    }

    private _html: string;
}
