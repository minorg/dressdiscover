import {
    DeleteWorksheetStateConfirmationModalViewModel,
} from 'dressdiscover/gui/worksheet/view_models/start/delete_worksheet_state_confirmation_modal_view_model';
import { ModalView } from 'dressdiscover/gui/worksheet/views/modal/modal_view';

export class DeleteWorksheetStateConfirmationModalView extends ModalView<DeleteWorksheetStateConfirmationModalViewModel> {
    public constructor(viewModel: DeleteWorksheetStateConfirmationModalViewModel) {
        super({
            contentHtmlFileName: "start/delete_worksheet_state_confirmation_modal_view.html",
            viewModel: viewModel
        });
    }
}