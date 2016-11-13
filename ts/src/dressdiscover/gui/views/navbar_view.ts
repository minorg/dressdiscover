import Backbone = require("backbone");
import Marionette = require("backbone.marionette");

declare function require(moduleName: string): any;

class NavbarView extends Marionette.ItemView<Backbone.Model> {
    template: string = require("raw!./navbar_view.html");
}

export = NavbarView;
