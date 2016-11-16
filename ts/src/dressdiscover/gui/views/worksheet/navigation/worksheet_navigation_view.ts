import _ = require("underscore");
import Marionette = require("backbone.marionette");
import { WorksheetFeatureSetModel } from "dressdiscover/gui/models/worksheet/worksheet_feature_set_model";
import { WorksheetFeatureSetNavigationView } from "./worksheet_feature_set_navigation_view";

declare function require(moduleName: string): any;

export class WorksheetNavigationView extends Marionette.CollectionView<WorksheetFeatureSetModel, WorksheetFeatureSetNavigationView> {
    constructor(options: any) {
        super(_.extend(options, {
            childView: WorksheetFeatureSetNavigationView,
            tagName: "ul",
            template: _.template(require("raw!./worksheet_navigation_view.html"))
        }));
    }
}
