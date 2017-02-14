import * as ko from "knockout";
import { ModalView } from "dressdiscover/gui/qa/views/modal_view";
import { QaUserId } from "dressdiscover/api/models/qa/qa_user_id";
import { Session } from "dressdiscover/gui/qa/models/session";
import { ViewModel } from "dressdiscover/gui/qa/view_models/view_model";

export class UserIdInputViewModel extends ViewModel {
    constructor(onHide: () => void, session: Session) {
        super();
        this._onHide = onHide;
        this._session = session;
    }

    submit() {
        this._session.currentUserId = QaUserId.parse(this.userId());
        ModalView.hide();
        this._onHide();
    }

    userId = ko.observable<string>("");
    userIdComplete = ko.pureComputed(() => {
        return this.userId().length > 0;
    }, this);

    private _onHide: () => void;
    private _session: Session;
}
