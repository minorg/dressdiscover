﻿import * as Backbone from "backbone";
import _ = require("underscore");
import { Application } from "dressdiscover/gui/application";
import { Worksheet } from "dressdiscover/gui/models/worksheet/worksheet";
import { WorksheetAccessionNumberPickerView } from "dressdiscover/gui/views/worksheet/worksheet_accession_number_picker_view";
import { WorksheetTopLevelView } from "dressdiscover/gui/views/worksheet/worksheet_top_level_view";

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
