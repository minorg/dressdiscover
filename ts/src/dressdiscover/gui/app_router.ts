import * as Backbone from "backbone";
import _ = require("underscore");
import { Worksheet } from "dressdiscover/gui/models/worksheet/worksheet";
import { WorksheetTopLevelView } from "./views/worksheet/worksheet_top_level_view";

export class AppRouter extends Backbone.Router {
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
            accessionNumber = "test";
        }
        console.info("Accession number: " + accessionNumber);
        new WorksheetTopLevelView({ model: Worksheet.fetchFromService({ accessionNumber: accessionNumber }) }).render();
    }
}
