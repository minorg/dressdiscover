import "./top_level_view.css";
import Backbone = require("backbone");
import Marionette = require("backbone.marionette");
import NavbarView = require("./navbar_view");

class TopLevelView<TModel extends Backbone.Model> extends Marionette.LayoutView<TModel> {
    constructor(options: any) {
        options['el'] = "#app";
        options['regions'] = {
            content: "#content",
            navbar: "#navbar"
        };
        super(options);
    }    

    onShow() {
        this.showChildView("navbar", new NavbarView());
    }
}

export = TopLevelView;
