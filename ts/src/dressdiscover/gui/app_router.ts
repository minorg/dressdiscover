import * as Backbone from "backbone";
import _ = require("underscore");
import { WorksheetModel } from "dressdiscover/gui/models/worksheet/worksheet_model";
import { WorksheetTopLevelView } from "./views/worksheet/worksheet_top_level_view";

export class AppRouter extends Backbone.Router {
    routes = {
        "": this.defaultRoute,
        "worksheet": this.worksheet,
    };

    constructor() {
        super();
        (<any>this)._bindRoutes();
        _.bindAll(this, "defaultRoute", "worksheet");
    }

    defaultRoute(path: string = '') {
        this.navigate("worksheet", { trigger: true });
    }

    worksheet(path: string = '') {
        new WorksheetTopLevelView({ model: WorksheetModel.fetchFromService({ accessionNumber: "test" }) }).render();
    }
}
