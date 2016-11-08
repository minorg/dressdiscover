import Backbone = require("backbone");
import Mustache = require("mustache");
import AppModel = require("../models/app_model");
import AppRouter = require("../app_router");

declare function require(moduleName: string): any;

class AppView extends Backbone.View<AppModel> {
    model: AppModel;

    constructor(options?: any) {
        super(options);
        this.setElement($('#app'), true);

        const router = new AppRouter();
        if (!Backbone.history.start()) {
            console.error("didn't route");
        }
    }
}

export = AppView;
