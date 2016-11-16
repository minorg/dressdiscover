import _ = require("underscore");
import Marionette = require("backbone.marionette");
import { WorksheetModel } from "dressdiscover/gui/models/worksheet/worksheet_model";
import { WorksheetInputView } from "./input/worksheet_input_view";
import { WorksheetNavigationView } from "./navigation/worksheet_navigation_view";
import "./worksheet_content_view.less";

declare function require(moduleName: string): any;

export class WorksheetContentView extends Marionette.LayoutView<WorksheetModel> {
    constructor(options: any) {
        super(_.extend(options, {
            regions: {
                leftColumn: "#left-column",
                rightColumn: "#right-column"
            },
            template: _.template(require("raw!./worksheet_content_view.html"))
        }));
    }

    onBeforeShow() {
        this.showChildView("leftColumn", new WorksheetNavigationView({ collection: this.model.rootFeatureSets }));
        this.showChildView("rightColumn", WorksheetInputView.create(this.model.selectedFeature));
    }
}
