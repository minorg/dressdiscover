import { ModalViewModel } from 'dressdiscover/gui/worksheet/view_models/modal/modal_view_model';
import { View } from 'dressdiscover/gui/worksheet/views/view';
import * as ko from 'knockout';

export abstract class ModalView<ViewModelT extends ModalViewModel> extends View<ViewModelT> {
    constructor(kwds: {
        contentHtmlFileName: string,
        viewModel: ViewModelT,
        modalOptions?: any
    }) {
        super({ viewModel: kwds.viewModel });
        this._contentHtml = View._requireHtml(kwds.contentHtmlFileName);
        //this._modalOptions = { backdrop: 'static', show: true, keyboard: false };
        this._modalOptions = {};
        if (kwds.modalOptions) {
            for (let key of kwds.modalOptions) {
                this._modalOptions[key] = kwds.modalOptions[key];
            }
        }
    }

    static hide() {
        ($('#modal') as any).modal('hide');
    }

    protected _onHidden(modalEl: JQuery) {
        ko.cleanNode(modalEl.get()[0]);
        modalEl.unbind();
    }

    protected _onShown(modalEl: JQuery) {
    }

    show(kwds?: { onHidden: () => void, onShown?: (modalEl: JQuery) => void }) {
        const modalEl = $("#modal");
        const modalContentEl = modalEl.find(".modal-content");

        modalContentEl.html(this._contentHtml);
        ko.applyBindings(this.viewModel, modalContentEl[0]);

        const self = this;
        modalEl.on('shown.bs.modal', function (e) {
            self._onShown(modalEl);

            if (kwds && kwds.onShown) {
                kwds.onShown(modalEl);
            }
        });

        modalEl.on('hidden.bs.modal', function (e) {
            self._onHidden(modalEl);

            if (kwds && kwds.onHidden) {
                kwds.onHidden();
            }
        });

        (modalEl as any).modal(this._modalOptions);
    }

    private _contentHtml: any;
    private _modalOptions = {};
}
