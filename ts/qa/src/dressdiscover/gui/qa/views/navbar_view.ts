import { View } from "dressdiscover/gui/qa/views/view";
import { ViewModel } from "dressdiscover/gui/qa/view_models/view_model";

export class NavbarView extends View<ViewModel>  {
    constructor() {
        super(new ViewModel());
        this._html = View._requireHtml("navbar_view.html");
    }

    get html() {
        return this._html;
    }

    private _html: string;
}
