import Backbone = require("backbone");
import Marionette = require("backbone.marionette");
import AppRouter = require("./app_router");
import AppView = require("./views/app_view");

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
