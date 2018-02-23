import { ViewModel } from 'dressdiscover/gui/worksheet/view_models/view_model';
import * as ko from 'knockout';

export class AlertViewModel extends ViewModel {
    clear() {
        this.successAlertText(null);
        this.warningAlertText(null);
    }

    onClickCloseAlert() {
        this.clear();
    }

    success(message: string) {
        this.successAlertText(message);
        this.warningAlertText(null);
    }

    warn(message: any) {
        this.successAlertText(null);

        if (typeof message !== "string") {
            if (message.toString) {
                message = message.toString();
            }
        }
        this.warningAlertText(message);
    }

    successAlertText = ko.observable<string>();
    warningAlertText = ko.observable<string>();
}
