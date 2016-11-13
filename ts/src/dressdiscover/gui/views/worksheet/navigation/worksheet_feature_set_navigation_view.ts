//import Backbone = require("backbone");
import _ = require("underscore");
import Marionette = require("backbone.marionette");
import WorksheetFeatureNavigationView = require("./worksheet_feature_navigation_view");
import WorksheetFeatureSetModel = require("../../../models/worksheet/worksheet_feature_set_model");

declare function require(moduleName: string): any;

class WorksheetFeatureSetNavigationView extends Marionette.ItemView<WorksheetFeatureSetModel> {
    constructor(options: any) {
        options.className = "list-group-item";
        options.tagName = "li";
        options.template = _.template(require("raw!./worksheet_feature_set_navigation_view.html"));
        super(options);
    }

    onRender() {
        this.$el.attr("role", "presentation");

        const childrenEl = this.$el.find("#children");

        if (this.model.childFeatureSets) {
            for (let childFeatureSetModel of this.model.childFeatureSets.models) {
                childrenEl.append(new WorksheetFeatureSetNavigationView({ model: childFeatureSetModel }).render().el);
            }
        }

        if (this.model.features) {
            for (let featureModel of this.model.features.models) {
                childrenEl.append(new WorksheetFeatureNavigationView({ model: featureModel }).render().el);
            }
        }
    }

    serializeData(): any {
        return { "displayName": this.model.definition.displayName, "id": this.model.definition.id };
    }
}

export = WorksheetFeatureSetNavigationView;
