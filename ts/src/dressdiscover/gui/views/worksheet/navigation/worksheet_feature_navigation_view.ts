import _ = require("underscore");
import { AppRadio } from "dressdiscover/gui/app_radio";
import Marionette = require("backbone.marionette");
import { WorksheetFeatureModel } from "dressdiscover/gui/models/worksheet/worksheet_feature_model";
import { WorksheetFeatureNavigationEvent } from "dressdiscover/gui/events/worksheet/worksheet_feature_navigation_event";

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
    }

    onClick() {
        this.model.selected = true;
        AppRadio.channel.trigger(WorksheetFeatureNavigationEvent.NAME, new WorksheetFeatureNavigationEvent({ feature: this.model }));
    }

    serializeData(): any {
        return { "displayName": this.model.displayName };
    }
}
