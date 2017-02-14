import { ModalView } from "dressdiscover/gui/qa/views/modal_view";
import { Session } from "dressdiscover/gui/qa/models/session";
import { UserIdInputViewModel } from "dressdiscover/gui/qa/view_models/user_id_input_view_model";

export class UserIdInputView extends ModalView<UserIdInputViewModel> {
    constructor(onHide: () => void, session: Session) {
        super("user_id_input_view.html", new UserIdInputViewModel(onHide, session));
    }

    show() {
        super.show(() => { $('#userIdInput').focus(); return; });
    }
}
