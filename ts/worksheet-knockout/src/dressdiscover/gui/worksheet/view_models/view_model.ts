import { Hrefs } from 'dressdiscover/gui/worksheet/hrefs';

export class ViewModel {
    get hrefs() {
        return this._hrefs;
    }

    private _hrefs = new Hrefs();
}
