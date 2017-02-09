import { ModalView } from "dressdiscover/gui/qa/views/modal_view";
import { UserIdInputViewModel } from "dressdiscover/gui/qa/view_models/user_id_input_view_model";

export class UserIdInputView extends ModalView<UserIdInputViewModel> {
    constructor() {
        super("user_id_input_view.html", new UserIdInputViewModel());
    }
}
