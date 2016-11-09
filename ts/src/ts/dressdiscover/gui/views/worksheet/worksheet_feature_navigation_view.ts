import Backbone = require("backbone");
//import Mustache = require("mustache");
import WorksheetModel = require("../../models/worksheet/worksheet_model");
import "bootstrap-drawer/dist/css/bootstrap-drawer.css";
import "bootstrap-drawer/dist/js/drawer.min.js";

declare function require(moduleName: string): any;

class WorksheetFeatureNavigationView extends Backbone.View<WorksheetModel> {
    template: string;

    constructor(options: {model: WorksheetModel}) {
        super(options);
        this.template = require("raw!./worksheet_feature_navigation_view.html");
        this.listenTo(this.model, "change", this.render);
    }

    render() {
        // TODO: iterate through the model, creating different child views for features etc.
        this.$el.html(this.template);
        //this.$el
        //    .html(Mustache.render(this.template, this.model.toJSON()));
//            .toggleClass('completed', this.model.get('completed'));
        //this.input = this.$('.todo-input');
        return this;
    }
}

export = WorksheetFeatureNavigationView;
