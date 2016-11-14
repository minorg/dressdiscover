import _ = require("underscore");
import Marionette = require("backbone.marionette");
import WorksheetModel = require("../../models/worksheet/worksheet_model");
import WorksheetInputView = require("./input/worksheet_input_view");
import WorksheetNavigationView = require("./navigation/worksheet_navigation_view");
import "./worksheet_content_view.less";

declare function require(moduleName: string): any;

class WorksheetContentView extends Marionette.LayoutView<WorksheetModel> {
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

export = WorksheetContentView;
