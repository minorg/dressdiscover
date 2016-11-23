import _ = require("underscore");
import { Application } from "dressdiscover/gui/application";
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
                "click #footer-ok-button": "onOkButtonClick",
                "keyup #newAccessionNumberInput": "onNewAccessionNumberInputKeyup"
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
    }

    onCloseButtonClick() {
        Application.instance.modalRegion.empty();
        Application.instance.router.navigate("", { trigger: true });
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
        Application.instance.modalRegion.empty();
        Application.instance.router.navigate("worksheet/" + accessionNumber, { trigger: true });
    }

    onNewAccessionNumberInputKeyup(event: any) {
        if (event.keyCode == 13) {
            this.onOkButtonClick();
        }
    }

    onShow() {
        this.ui.accessionNumberSelect.selectpicker("show");

        (Application.instance.modalRegion as any).$el.on('shown.bs.modal', { view: this }, (event: any) => {
            if (event.data.view.ui.newAccessionNumberInput.focus) {
                event.data.view.ui.newAccessionNumberInput.focus();
            }
        });
    }

    serializeData(): any {
        return { "availableAccessionNumbers": this._availableAccessionNumbers };
    }

    private _availableAccessionNumbers: string[];
}