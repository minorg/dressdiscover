import { AlertViewModel } from 'dressdiscover/gui/worksheet/view_models/top_level/alert_view_model';
import { ViewModel } from 'dressdiscover/gui/worksheet/view_models/view_model';

export class TopLevelViewModel extends ViewModel {
    constructor(kwds: {
        title: string
    }) {
        super();
        this.title = kwds.title;
    }

    get alerts() {
        return this._alertViewModel;
    }

    private _alertViewModel = new AlertViewModel();
    title: string;
}
