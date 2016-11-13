import "./top_level_view.css";
import _ = require("underscore");
import Backbone = require("backbone");
import Marionette = require("backbone.marionette");
import NavbarView = require("./navbar_view");

declare function require(moduleName: string): any;

class TopLevelView<TModel extends Backbone.Model> extends Marionette.LayoutView<TModel> {
    constructor(options: any) {
        options["el"] = "#app";
        options["regions"] = {
            content: "#content",
            navbar: "#navbar"
        };
        options['template'] = _.template(require("raw!./top_level_view.html"));
        super(options);
    }    

    onRender() {
        this.showChildView("navbar", new NavbarView());
    }
}

export = TopLevelView;
