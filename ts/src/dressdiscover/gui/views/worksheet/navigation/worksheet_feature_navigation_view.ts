import _ = require("underscore");
import Marionette = require("backbone.marionette");
import { WorksheetFeatureModel } from "dressdiscover/gui/models/worksheet/worksheet_feature_model";

declare function require(moduleName: string): any;

export class WorksheetFeatureNavigationView extends Marionette.ItemView<WorksheetFeatureModel> {
    constructor(options: any) {
        super(_.extend(options, {
            attributes: { role: "presentation"},
            className: "list-group-item",
            events: {
                "click a": "onClick"
            },
            tagName: "li",
            template: _.template(require("raw!./worksheet_feature_navigation_view.html"))
        }));
        //_.bindAll(this, "onClick");
    }

    onClick() {
        this.model.selected = true;
    }

    serializeData(): any {
        return { "displayName": this.model.definition.displayName, "id": this.model.definition.id };
    }
}
