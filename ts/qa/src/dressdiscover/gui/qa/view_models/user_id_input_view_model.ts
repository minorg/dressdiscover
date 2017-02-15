﻿import * as ko from "knockout";
import * as _ from "underscore";
import { Application } from "dressdiscover/gui/qa/application";
import { ModalView } from "dressdiscover/gui/qa/views/modal_view";
import { QaUserId } from "dressdiscover/api/models/qa/qa_user_id";
import { ViewModel } from "dressdiscover/gui/qa/view_models/view_model";

export class UserIdInputViewModel extends ViewModel {
    constructor(private onHide: () => void) {
        super();
        _.bind(this.onKeypress, this);
    }

    onKeypress(sender, event) {
        if (event.keyCode === 13) {
            this.submit();
        }
        return true;
    }

    submit() {
        Application.instance.session.currentUserId = QaUserId.parse(this.userId());
        ModalView.hide();
        this.onHide();
    }

    userId = ko.observable<string>("");
    userIdComplete = ko.pureComputed(() => {
        return this.userId().length > 0;
    }, this);
}
