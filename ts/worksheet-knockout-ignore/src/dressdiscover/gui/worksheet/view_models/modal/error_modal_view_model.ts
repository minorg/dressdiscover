import { ModalViewModel } from 'dressdiscover/gui/worksheet/view_models/modal/modal_view_model';

export class ErrorModalViewModel extends ModalViewModel {
    constructor(kwds: { message: string, title: string}) {
        super();
        this.message = kwds.message;
        this.title = kwds.title;
    }

    readonly message: string;
    readonly title: string;
}