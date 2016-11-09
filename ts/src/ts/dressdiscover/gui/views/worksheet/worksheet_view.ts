import Backbone = require("backbone");
import Mustache = require("mustache");
import _ = require("underscore");
//import * as $ from "jquery";
import WorksheetModel = require("../../models/worksheet/worksheet_model");
import "bootstrap-drawer/dist/css/bootstrap-drawer.css";
import "bootstrap-drawer/dist/js/drawer.min.js";

declare function require(moduleName: string): any;

class WorksheetView extends Backbone.View<WorksheetModel> {
    template: string;

    constructor(options?: any) {
        super(options);
        this.model = new WorksheetModel();
        this.setElement($('#content'), true);
        this.template = require("raw!./worksheet_view.html");

        this.listenTo(this.model, "change", this.render);
        this.model.fetchFromService();
    }

    render() {
        // TODO: iterate through the model, creating different child views for features etc.
        this.$el
            .html(Mustache.render(this.template, this.model.toJSON()));
//            .toggleClass('completed', this.model.get('completed'));
        //this.input = this.$('.todo-input');
        return this;
    }
}

export = WorksheetView;
