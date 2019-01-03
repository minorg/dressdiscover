import { Breadcrumb } from 'dressdiscover/gui/worksheet/models/breadcrumb';
import { AlertViewModel } from 'dressdiscover/gui/worksheet/view_models/top_level/alert_view_model';
import { ViewModel } from 'dressdiscover/gui/worksheet/view_models/view_model';

export class TopLevelViewModel extends ViewModel {
    constructor(kwds: {
        breadcrumbs: Breadcrumb[],
        title: string
    }) {
        super();
        this.breadcrumbs = kwds.breadcrumbs;
        this.title = kwds.title;
    }

    get alerts() {
        return this._alertViewModel;
    }

    private _alertViewModel = new AlertViewModel();
    breadcrumbs: Breadcrumb[];
    title: string;
}
