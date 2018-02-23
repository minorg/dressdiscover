import { AlertViewModel } from 'dressdiscover/gui/worksheet/view_models/alert_view_model';
import { NavbarViewModel } from 'dressdiscover/gui/worksheet/view_models/navbar_view_model';
import { ViewModel } from 'dressdiscover/gui/worksheet/view_models/view_model';

export class TopLevelViewModel extends ViewModel {
    get alerts() {
        return this._alertViewModel;
    }

    get navbar() {
        return this._navbarViewModel;
    }

    private _alertViewModel = new AlertViewModel();
    private _navbarViewModel = new NavbarViewModel();
}
