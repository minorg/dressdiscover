import $ = require("jquery");
import _ = require("underscore");
import Backbone = require("backbone");
import Marionette = require("backbone.marionette");
import { AppRouter } from "dressdiscover/gui/app_router";
import { ModalRegion } from "./views/modal_region";

import "../../../node_modules/backbone.validation/dist/backbone-validation.js";
import "../../../node_modules/bootstrap/dist/js/bootstrap.min.js";
import "../../../node_modules/bootstrap-treeview/src/css/bootstrap-treeview.css";
import "../../../node_modules/bootstrap-treeview/src/js/bootstrap-treeview.js";

class Application extends Marionette.Application {
    onStart() {
        this._modalRegion = new ModalRegion();
        new AppRouter();
        if (!Backbone.history.start()) {
            console.error("didn't route");
        }
    }

    get modalRegion() {
        return this._modalRegion;
    }

    private _modalRegion: ModalRegion;
}

export declare let app: Application;

$(() => {
    _.extend(Backbone.Model.prototype, (Backbone as any).Validation.mixin);
    app = new Application();
    app.start();
});
