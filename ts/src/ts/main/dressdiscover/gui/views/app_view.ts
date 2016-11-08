import Backbone = require("backbone");
import AppModel = require("../models/app_model");
import AppRouter = require("../app_router");

class AppView extends Backbone.View<AppModel> {
    model: AppModel;

    constructor(options?: any) {
        super(options);
        this.setElement($('#app'), true);

        new AppRouter();
        if (!Backbone.history.start()) {
            console.error("didn't route");
        }
    }
}

export = AppView;
