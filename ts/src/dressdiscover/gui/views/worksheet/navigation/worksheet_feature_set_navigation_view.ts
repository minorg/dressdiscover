﻿//import Backbone = require("backbone");
import _ = require("underscore");
import Marionette = require("backbone.marionette");
import { WorksheetFeatureNavigationView } from "./worksheet_feature_navigation_view";
import { WorksheetFeatureSetModel } from "dressdiscover/gui/models/worksheet/worksheet_feature_set_model";

declare function require(moduleName: string): any;

export class WorksheetFeatureSetNavigationView extends Marionette.ItemView<WorksheetFeatureSetModel> {
    constructor(options: any) {
        super(_.extend(options, {
            attributes: { role: "presentation" },
            className: "list-group-item",
            tagName: "li",
            template: _.template(require("raw!./worksheet_feature_set_navigation_view.html"))
        }));
    }

    initialize() {
        this.ui = { children: "#children" };
    }

    onRender() {
        if (this.model.childFeatureSets) {
            for (let childFeatureSet of this.model.childFeatureSets.models) {
                this.ui.children.append(new WorksheetFeatureSetNavigationView({ model: childFeatureSet }).render().el);
            }
        }

        if (this.model.features) {
            for (let feature of this.model.features.models) {
                this.ui.children.append(new WorksheetFeatureNavigationView({ model: feature }).render().el);
            }
        }
    }

    serializeData(): any {
        return { "displayName": this.model.definition.displayName, "id": this.model.definition.id };
    }
}
