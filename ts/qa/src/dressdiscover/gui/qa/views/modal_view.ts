import * as ko from "knockout";
import { View } from "dressdiscover/gui/qa/views/view";
import { ViewModel } from "dressdiscover/gui/qa/view_models/view_model";

export abstract class ModalView<ViewModelT extends ViewModel> extends View<ViewModelT> {
    constructor(htmlFileName: string, viewModel: ViewModelT) {
        super(htmlFileName, viewModel);
    }

    static hide() {
        ($('#modal') as any).modal('hide');
    }

    show() {
        const el = $("#modal");
        el.html(this.html);
        (el as any).modal({ show: true, keyboard: false });
        const self = this;
        el.ready(() => {
            ko.applyBindings(self.viewModel, el.get()[0]);
        });
    }
}
