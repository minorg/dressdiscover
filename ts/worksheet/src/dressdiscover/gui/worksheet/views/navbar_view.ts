import _ = require("underscore");
import Backbone = require("backbone");
import Marionette = require("backbone.marionette");

declare function require(moduleName: string): any;

export class NavbarView extends Marionette.ItemView<Backbone.Model> {
    template: any = _.template(require("raw!./navbar_view.html"));
}
