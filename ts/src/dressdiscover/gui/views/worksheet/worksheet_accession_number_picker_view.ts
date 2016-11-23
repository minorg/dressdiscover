import _ = require("underscore");
import { app } from "dressdiscover/gui/app";
import Backbone = require("backbone");
import Marionette = require("backbone.marionette");
import "./worksheet_accession_number_picker_view.less";

declare function require(moduleName: string): any;

export class WorksheetAccessionNumberPickerView extends Marionette.ItemView<Backbone.Model> {
    constructor(kwds: { availableAccessionNumbers: string[] }) {
        super({
            events: {
                "click #footer-close-button": "onCloseButtonClick",
                "click #header-close-button": "onCloseButtonClick",
                "click #footer-ok-button": "onOkButtonClick"
            },
            model: new Backbone.Model(),
            template: _.template(require("raw!./worksheet_accession_number_picker_view.html"))
        } as any);
        this._availableAccessionNumbers = kwds.availableAccessionNumbers;
    }

    initialize() {
        this.ui = {
            availableAccessionNumbersDropdown: "#availableAccessionNumbers.dropdown",
            availableAccessionNumbersDropdownMenu: "#availableAccessionNumbers .dropdown-menu",
            newAccessionNumber: "#newAccessionNumber"
        };
    }

    onCloseButtonClick() {
        app.modalRegion.empty();
        app.router.navigate("", { trigger: true });
    }

    onOkButtonClick() {
        app.modalRegion.empty();
        app.router.navigate("worksheet/test", { trigger: true });
    }

    serializeData(): any {
        return { "availableAccessionNumbers": this._availableAccessionNumbers };
    }

    private _availableAccessionNumbers: string[];
}