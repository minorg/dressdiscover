import _ = require("underscore");
import Marionette = require("backbone.marionette");
import { WorksheetFeatureSetsNavigationView } from "dressdiscover/gui/views/worksheet/navigation/worksheet_feature_sets_navigation_view";
import { WorksheetModel } from "dressdiscover/gui/models/worksheet/worksheet_model";

declare function require(moduleName: string): any;

export class WorksheetNavigationView extends Marionette.LayoutView<WorksheetModel> {
    constructor(options: any) {
        super(_.extend(options, {
            regions: {
                rootFeatureSets: "#root-feature-sets"
            },
            template: _.template(require("raw!./worksheet_navigation_view.html"))
        }));
    }

    onRender() {
        this.showChildView("rootFeatureSets", new WorksheetFeatureSetsNavigationView({ collection: this.model.rootFeatureSets }));
    }
}
