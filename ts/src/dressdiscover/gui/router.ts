import * as Backbone from "backbone";
import _ = require("underscore");
import { Application } from "dressdiscover/gui/application";
import { Services } from "dressdiscover/gui/services/services";
import { Worksheet } from "dressdiscover/gui/models/worksheet/worksheet";
import { WorksheetAccessionNumberPickerView } from "./views/worksheet/worksheet_accession_number_picker_view";
import { WorksheetTopLevelView } from "./views/worksheet/worksheet_top_level_view";

export class Router extends Backbone.Router {
    routes = {
        "": this.defaultRoute,
        "worksheet(/:accessionNumber)": this.worksheet,
    };

    constructor() {
        super();
        (<any>this)._bindRoutes();
        _.bindAll(this, "defaultRoute", "worksheet");
    }

    defaultRoute() {
        this.navigate("worksheet", { trigger: true });
    }

    worksheet(accessionNumber: string | undefined) {
        if (!accessionNumber) {
            Application.instance.modalRegion.show(new WorksheetAccessionNumberPickerView({ availableAccessionNumbers: Services.instance.worksheetQueryService.getWorksheetAccessionNumbersSync() }));
            return; // Will re-route with a value set
        }
        console.info("Accession number: " + accessionNumber);
        new WorksheetTopLevelView({ model: Worksheet.fetchFromService({ accessionNumber: accessionNumber }) }).render();
    }
}
