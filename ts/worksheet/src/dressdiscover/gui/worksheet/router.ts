import * as Backbone from "backbone";
import _ = require("underscore");
import { Application } from "dressdiscover/gui/worksheet/application";
import { Worksheet } from "dressdiscover/gui/worksheet/models/worksheet";
import { WorksheetAccessionNumberPickerView } from "dressdiscover/gui/worksheet/views/worksheet_accession_number_picker_view";
import { WorksheetTopLevelView } from "dressdiscover/gui/worksheet/views/worksheet_top_level_view";

export class Router extends Backbone.Router {
    routes = {
        "": this.worksheet,
        "worksheet(/:accessionNumber)": this.worksheet,
    };

    constructor() {
        super();
        (<any>this)._bindRoutes();
        _.bindAll(this, "worksheet");
    }

    worksheet(accessionNumber: string | undefined) {
        if (!accessionNumber) {
            Application.instance.modalRegion.show(new WorksheetAccessionNumberPickerView({ availableAccessionNumbers: Application.instance.services.worksheetQueryService.getWorksheetAccessionNumbersSync() }));
            return; // Will re-route with a value set
        }
        new WorksheetTopLevelView({ model: Worksheet.fetchFromService({ accessionNumber: accessionNumber }) }).render();
    }
}
