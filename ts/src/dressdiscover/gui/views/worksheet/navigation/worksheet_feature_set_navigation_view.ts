import Backbone = require("backbone");
import Mustache = require("mustache");
import WorksheetFeatureNavigationView = require("./worksheet_feature_navigation_view");
import WorksheetFeatureSetModel = require("../../../models/worksheet/worksheet_feature_set_model");

declare function require(moduleName: string): any;

class WorksheetFeatureSetNavigationView extends Backbone.View<WorksheetFeatureSetModel> {
    template: string;

    constructor(options: { model: WorksheetFeatureSetModel, tagName?: string }) {
        options.tagName = "li";
        super(options);
        this.template = require("raw!./worksheet_feature_set_navigation_view.html");
    }

    render() {
        this.$el.attr("role", "presentation");
        this.$el.addClass("list-group-item");
        this.$el.html(Mustache.render(this.template, this.model.definition.toJSON()));

        const childrenEl = this.$el.find("#children");
        for (let featureModel of this.model.features.models) {
            featuresEl.append(new WorksheetFeatureNavigationView({ model: featureModel }).render().el);
        }

        return this;
    }
}

export = WorksheetFeatureSetNavigationView;
