//import Backbone = require("backbone");
import Marionette = require("backbone.marionette");
import WorksheetFeatureSetModel = require("../../../models/worksheet/worksheet_feature_set_model");
import WorksheetFeatureSetNavigationView = require("./worksheet_feature_set_navigation_view");
import _ = require("underscore");

declare function require(moduleName: string): any;

class WorksheetNavigationView extends Marionette.CollectionView<WorksheetFeatureSetModel, WorksheetFeatureSetNavigationView> {
    constructor(options: any) {
        options.childView = WorksheetFeatureSetNavigationView;
        options.tagName = "ul";
        options.template = _.template(require("raw!./worksheet_navigation_view.html"));
        super(options);
    }
}

export = WorksheetNavigationView;
