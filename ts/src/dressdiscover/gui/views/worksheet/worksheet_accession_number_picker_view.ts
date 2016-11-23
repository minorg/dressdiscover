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
            accessionNumberSelect: "#accessionNumberSelect",
            alert: "#alert",
            newAccessionNumberInput: "#newAccessionNumberInput"
        };

        (app.modalRegion as any).$el.on('shown.bs.modal', { view: this }, (event: any) => {
            event.data.view.ui.newAccessionNumberInput.focus();
        });
    }

    onCloseButtonClick() {
        app.modalRegion.empty();
        app.router.navigate("", { trigger: true });
    }

    onOkButtonClick() {
        let accessionNumber: string = this.ui.accessionNumberSelect.val();
        if (!accessionNumber) {
            accessionNumber = this.ui.newAccessionNumberInput.val();
            if (!accessionNumber || accessionNumber.length == 0) {
                const alert = this.ui.alert;
                alert.fadeTo(1000, 500).slideUp(500, () => {
                    alert.slideUp(500);
                });
                return;
            }
        }        
        app.modalRegion.empty();
        app.router.navigate("worksheet/" + accessionNumber, { trigger: true });
    }

    serializeData(): any {
        return { "availableAccessionNumbers": this._availableAccessionNumbers };
    }

    private _availableAccessionNumbers: string[];
}