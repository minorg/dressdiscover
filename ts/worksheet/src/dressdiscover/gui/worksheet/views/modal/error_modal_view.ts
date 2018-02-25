import { AsyncError } from 'dressdiscover/gui/worksheet/services/async_error';
import { ModalViewModel } from 'dressdiscover/gui/worksheet/view_models/modal/modal_view_model';
import { ModalView } from 'dressdiscover/gui/worksheet/views/modal/modal_view';

export class ErrorModalView extends ModalView<ModalViewModel> {
    public constructor(kwds: { message: string, title: string}) {
        super({
            contentHtmlFileName: "error_modal_view.html",
            viewModel: new ModalViewModel()
        });
        this.message = kwds.message;
        this.title = kwds.title;
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

        return new ErrorModalView({
            message: message,
            title: "Error"
        });
    }

    readonly message: string;
    readonly title: string;
}