/// <reference path="../../../../../typings/index.d.ts" />

import Backbone = require("backbone");
import WorksheetView = require("./views/worksheet/worksheet_view");

class AppRouter extends Backbone.Router {
    routes = {
        "worksheet": this.worksheet,
        "*path": this.defaultRoute
    };

    constructor() {
        super();
        (<any>this)._bindRoutes();
        _.bindAll(this, "defaultRoute", "worksheet");
    }

    defaultRoute(path: string = '') {
        this.navigate("worksheet");
    }

    worksheet(path: string = ''): void {
        new WorksheetView().render();
    }
}

export = AppRouter;
