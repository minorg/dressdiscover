/// <reference path="../typings/index.d.ts" />

import Backbone = require("backbone");

export class AppRouter extends Backbone.Router {
    routes = {
    };

    constructor() {
        super();
        (<any>this)._bindRoutes();
    }
}
