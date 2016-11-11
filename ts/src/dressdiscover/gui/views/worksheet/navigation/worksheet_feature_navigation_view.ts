import Backbone = require("backbone");
import Mustache = require("mustache");
import _ = require("underscore");
import WorksheetFeatureModel = require("../../../models/worksheet/worksheet_feature_model");

declare function require(moduleName: string): any;

class WorksheetFeatureNavigationView extends Backbone.View<WorksheetFeatureModel> {
    template: string;

    constructor(options: { model: WorksheetFeatureModel, tagName?: string }) {
        options.tagName = "li";
        super(options);
        this.template = require("raw!./worksheet_feature_navigation_view.html");
        _.bindAll(this, "onClick");
    }

    onClick(): void {
        alert("Clicked a feature");
    }

    render() {
        this.$el.attr("role", "presentation");
        this.$el.addClass("list-group-item");
        this.$el.html(Mustache.render(this.template, this.model.definition.toJSON()));
        this.$el.find("a").on("click", this.onClick);
        return this;
    }
}

export = WorksheetFeatureNavigationView;
