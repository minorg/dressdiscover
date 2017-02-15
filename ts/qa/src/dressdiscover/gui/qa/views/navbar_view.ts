import { NavbarViewModel } from "dressdiscover/gui/qa/view_models/navbar_view_model";
import { View } from "dressdiscover/gui/qa/views/view";

export class NavbarView extends View<NavbarViewModel>  {
    constructor() {
        super(new NavbarViewModel());
        this._html = View._requireHtml("navbar_view.html");
    }

    get html() {
        return this._html;
    }

    private _html: string;
}
