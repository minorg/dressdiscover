import "./top_level_view.css";
import _ = require("underscore");
import Backbone = require("backbone");
import Marionette = require("backbone.marionette");
import { NavbarView } from "./navbar_view";

declare function require(moduleName: string): any;

export class TopLevelView<TModel extends Backbone.Model> extends Marionette.LayoutView<TModel> {
    constructor(options: any) {
        super(_.extend(options, {
            el: "#app",
            regions: {
                content: "#content",
                navbar: "#navbar"
            },
            template: _.template(require("raw!./top_level_view.html"))
        }));
    }    

    onRender() {
        this.showChildView("navbar", new NavbarView());
    }
}
