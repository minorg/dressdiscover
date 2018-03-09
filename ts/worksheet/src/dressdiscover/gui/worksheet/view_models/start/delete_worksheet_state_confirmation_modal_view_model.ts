import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/worksheet_state_id';
import { ModalViewModel } from 'dressdiscover/gui/worksheet/view_models/modal/modal_view_model';
import { ModalView } from 'dressdiscover/gui/worksheet/views/modal/modal_view';

export class DeleteWorksheetStateConfirmationModalViewModel extends ModalViewModel {
    constructor(readonly worksheetStateId: WorksheetStateId) {
        super();
    }

    onClickDeleteButton() {
        this.delete = true;
        ModalView.hide();
    }

    delete: boolean = false;
}