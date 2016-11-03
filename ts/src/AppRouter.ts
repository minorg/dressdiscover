/// <reference path="../typings/index.d.ts" />

import Backbone = require("backbone");

class AppRouter extends Backbone.Router {
    routes = {
    };

    constructor() {
        super();
        (<any>this)._bindRoutes();
    }
}

export = AppRouter;