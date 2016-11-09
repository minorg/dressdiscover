import Backbone = require("backbone");
import WorksheetModel = require("../../models/worksheet/worksheet_model");
import WorksheetFeatureSetNavigationView = require("./worksheet_feature_set_navigation_view");
import "bootstrap-drawer/dist/css/bootstrap-drawer.css";
import "bootstrap-drawer/dist/js/drawer.min.js";

declare function require(moduleName: string): any;

class WorksheetNavigationView extends Backbone.View<WorksheetModel> {
    template: string;

    constructor(options: {model: WorksheetModel}) {
        super(options);
        this.template = require("raw!./worksheet_navigation_view.html");
    }

    render() {
        this.$el.html(this.template);

        const featureSetsEl = this.$el.find("#feature-sets");
        for (let featureSetModel of this.model.featureSets.models) {
            const featureSetEl = new WorksheetFeatureSetNavigationView({ model: featureSetModel }).render().el;
            featureSetsEl.append(featureSetEl);
        }
        return this;
    }
}

export = WorksheetNavigationView;
