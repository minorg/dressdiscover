import Backbone = require("backbone");
import Marionette = require("backbone.marionette");
import WorksheetModel = require("../../models/worksheet/worksheet_model");
import WorksheetInputView = require("./input/worksheet_input_view");
import WorksheetNavigationView = require("./navigation/worksheet_navigation_view");
import "./worksheet_content_view.less";

declare function require(moduleName: string): any;

class WorksheetContentView extends Marionette.LayoutView<WorksheetModel> {
    constructor(options?: any) {
        options["regions"] = {
            leftColumn: "#left-column",
            rightColumn: "#right-column"
        }
        options["template"] = require("raw!./worksheet_content_view.html");
        super(options);
    }

    onShow() {
        this.showChildView("leftColumn", new WorksheetNavigationView({ model: this.model }));
        this.showChildView("rightColumn", new WorksheetInputView({ model: this.model }));
    }
}

export = WorksheetContentView;
