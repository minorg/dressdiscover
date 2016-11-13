import WorksheetContentView = require("./worksheet_content_view");
import WorksheetModel = require("../../models/worksheet/worksheet_model");
import TopLevelView = require("../top_level_view");

class WorksheetView extends TopLevelView<WorksheetModel> {
    template: string;

    constructor(options?: any) {
        options["el"] = "#content";
        options["model"] = new WorksheetModel(); 
        super(options);
        this.model.fetchFromService();
    }

    onShow() {
        super.onShow();
        this.showChildView("content", new WorksheetContentView({model: this.model));
    }
}

export = WorksheetView;
