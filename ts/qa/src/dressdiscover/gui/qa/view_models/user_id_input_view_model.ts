import * as ko from "knockout";
import { ModalView } from "dressdiscover/gui/qa/views/modal_view";
import { ViewModel } from "dressdiscover/gui/qa/view_models/view_model";

export class UserIdInputViewModel extends ViewModel {
    constructor(onHide: () => void) {
        super();
        this._onHide = onHide;
    }

    submit() {
        alert(this.userId());
        ModalView.hide();
        this._onHide();
    }

    userId = ko.observable<string>("");
    userIdComplete = ko.pureComputed(() => {
        return this.userId().length > 0;
    }, this);

    private _onHide: () => void;
}
