import _ = require("underscore");
import Backbone = require("backbone");
import Marionette = require("backbone.marionette");
import { AppRouter } from "dressdiscover/gui/app_router";
import "../../../node_modules/backbone.validation/dist/backbone-validation.js";
import { WorksheetEnumFeatureValueImage } from "dressdiscover/api/models/worksheet/worksheet_enum_feature_value_image";

class Application extends Marionette.Application {
    onStart() {
        new AppRouter();
        if (!Backbone.history.start()) {
            console.error("didn't route");
        }
    }
}

declare let app: Application;

$(() => {
    _.extend(Backbone.Model.prototype, (Backbone as any).Validation.mixin);
    let model = new WorksheetEnumFeatureValueImage();
    if (model.isValid(true)) {
        console.info("valid");
        model.rights = "";
        if (model.isValid(true)) {
            console.info("valid 2");
        }
    } else {
        console.info("invalid " + model.validationError);
    }
    app = new Application();
    app.start();
});
