//import Backbone = require("backbone");
import Marionette = require("backbone.marionette");
import WorksheetFeatureSetModel = require("../../../models/worksheet/worksheet_feature_set_model");
import WorksheetFeatureSetNavigationView = require("./worksheet_feature_set_navigation_view");
import _ = require("underscore");

declare function require(moduleName: string): any;

class WorksheetNavigationView extends Marionette.CollectionView<WorksheetFeatureSetModel, WorksheetFeatureSetNavigationView> {
    constructor(options: any) {
        super(_.extend(options, {
            childView: WorksheetFeatureSetNavigationView,
            tagName: "ul",
            template: _.template(require("raw!./worksheet_navigation_view.html"))
        }));
    }
}

export = WorksheetNavigationView;
