import Backbone = require("backbone");
import WorksheetModel = require("../../models/worksheet/worksheet_model");
import WorksheetFeatureSetNavigationView = require("./worksheet_feature_set_navigation_view");
import _ = require("underscore");
import "bootstrap-drawer/dist/css/bootstrap-drawer.css";
import "bootstrap-drawer/dist/js/drawer.min.js";

declare function require(moduleName: string): any;

class WorksheetNavigationView extends Backbone.View<WorksheetModel> {
    template: string;

    constructor(options: {model: WorksheetModel}) {
        super(options);
        this.template = require("raw!./worksheet_navigation_view.html");
        _.bindAll(this, "onFeaturesButtonClick");
    }

    onFeaturesButtonClick() {
        if (this._featuresDrawerEl.hasClass("open")) {
            this._featuresButtonEl.text(">> Features");
        } else {
            this._featuresButtonEl.text("<< Features");
        }
        return true;
    }

    render() {
        this.$el.html(this.template);

        this._featuresButtonEl = this.$el.find("#features-button");
        this._featuresButtonEl.on("click", this.onFeaturesButtonClick);

        this._featuresDrawerEl = this.$el.find("#features-drawer");

        const featureSetsEl = this.$el.find("#feature-sets");
        for (let featureSetModel of this.model.featureSets.models) {
            featureSetsEl.append(new WorksheetFeatureSetNavigationView({ model: featureSetModel }).render().el);
        }

        return this;
    }

    private _featuresButtonEl: JQuery;
    private _featuresDrawerEl: JQuery;
}

export = WorksheetNavigationView;
