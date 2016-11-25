import $ = require("jquery");
import _ = require("underscore");
import Backbone = require("backbone");
import Marionette = require("backbone.marionette");
import { Radio } from "dressdiscover/gui/radio";
import { Router } from "dressdiscover/gui/router";
import { ModalRegion } from "dressdiscover/gui/modal_region";

import "../../../node_modules/bootstrap-select/dist/css/bootstrap-select.min.css";
import "../../../node_modules/bootstrap-select/dist/js/bootstrap-select.min.js";
import "../../../node_modules/bootstrap-treeview/dist/bootstrap-treeview.min.css";
import "../../../node_modules/bootstrap-treeview/dist/bootstrap-treeview.min.js";

export class Application extends Marionette.Application {
    onStart() {
        this._modalRegion = new ModalRegion();
        this._radio = new Radio()
        this._router = new Router();
        if (!Backbone.history.start({ hashChange: true, pushState: false } as any)) {
            console.error("didn't route");
        }
    }

    static get instance() {
        return Application._instance;
    }

    get radio() {
        return this._radio;
    }

    get modalRegion() {
        return this._modalRegion;
    }

    get router() {
        return this._router;
    }

    private static _instance: Application = new Application();
    private _modalRegion: ModalRegion;
    private _radio: Radio;
    private _router: Router;
}

$(() => {
    _.extend(Backbone.Model.prototype, (Backbone as any).Validation.mixin);
    Application.instance.start();
});
