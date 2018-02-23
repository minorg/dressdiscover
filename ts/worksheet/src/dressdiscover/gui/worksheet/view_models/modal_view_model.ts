import { ViewModel } from 'dressdiscover/gui/worksheet/view_models/view_model';
import { ModalView } from 'dressdiscover/gui/worksheet/views/modal_view';

export class ModalViewModel extends ViewModel {
    constructor() {
        super()
    }

    onClickCloseButton() {
        ModalView.hide();
    }
}
