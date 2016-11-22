import _ = require("underscore");
import Marionette = require("backbone.marionette");
import { Worksheet } from "dressdiscover/gui/models/worksheet/worksheet";
import { WorksheetNavigationView } from "dressdiscover/gui/views/worksheet/navigation/worksheet_navigation_view";
import { WorksheetOutputView } from "dressdiscover/gui/views/worksheet/output/worksheet_output_view";

declare function require(moduleName: string): any;

export class WorksheetSidebarView extends Marionette.LayoutView<Worksheet> {
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
        this.showChildView("navigation", new WorksheetNavigationView({ model: this.model }));
        this.showChildView("output", new WorksheetOutputView({ model: this.model }));
    }
}
