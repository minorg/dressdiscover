import Backbone = require("backbone");
import Marionette = require("backbone.marionette");
import { AppRouter } from "dressdiscover/gui/app_router";

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
    app = new Application();
    app.start();
});
