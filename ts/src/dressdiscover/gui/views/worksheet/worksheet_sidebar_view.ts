import _ = require("underscore");
import Marionette = require("backbone.marionette");
import { WorksheetModel } from "dressdiscover/gui/models/worksheet/worksheet_model";
import { WorksheetNavigationView } from "dressdiscover/gui/views/worksheet/navigation/worksheet_navigation_view";
import { WorksheetOutputView } from "dressdiscover/gui/views/worksheet/output/worksheet_output_view";

declare function require(moduleName: string): any;

export class WorksheetSidebarView extends Marionette.LayoutView<WorksheetModel> {
    constructor(options?: any) {
        super(_.extend(options, {
            regions: {
                navigation: "#navigation",
                output: "#output"
            },
            template: _.template(require("raw!./worksheet_sidebar_view.html"))
        }));
    }

    onBeforeShow() {
        this.showChildView("navigation", new WorksheetNavigationView({ collection: this.model.rootFeatureSets }));
        this.showChildView("output", new WorksheetOutputView({ model: this.model }));
    }
}
