import { AsyncError } from 'dressdiscover/gui/worksheet/services/async_error';
import { ErrorModalViewModel } from 'dressdiscover/gui/worksheet/view_models/modal/error_modal_view_model';
import { ModalView } from 'dressdiscover/gui/worksheet/views/modal/modal_view';

export class ErrorModalView extends ModalView<ErrorModalViewModel> {
    public constructor(viewModel: ErrorModalViewModel) {
        super({
            contentHtmlFileName: "modal/error_modal_view.html",
            viewModel: viewModel
        });
    }

    static fromAsyncError(errorKwds: AsyncError) {
        var message: string;
        if (typeof errorKwds.errorThrown === "string") {
            message = errorKwds.errorThrown as string;
        } else if (errorKwds.errorThrown.toString) {
            message = errorKwds.errorThrown.toString();
        } else {
            message = "Server communication error"
        }
        if (message.length == 0) {
            message = "Server communication error";
        }

        return new ErrorModalView(new ErrorModalViewModel({
            message: message,
            title: "Error"
        }));
    }

    static fromSyncError(errorThrown: object) {
        return new ErrorModalView(new ErrorModalViewModel({
            message: errorThrown.toString(),
            title: "Error"
        }));
    }
}