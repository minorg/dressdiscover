import WorksheetContentView = require("./worksheet_content_view");
import WorksheetModel = require("../../models/worksheet/worksheet_model");
import TopLevelView = require("../top_level_view");

class WorksheetView extends TopLevelView<WorksheetModel> {
    constructor(options?: any) {
        if (!options) {
            options = {};
        }
        options["model"] = new WorksheetModel(); 
        super(options);
        this.model.fetchFromService();
    }

    onRender() {
        super.onRender();
        this.showChildView("content", new WorksheetContentView({ model: this.model }));
    }
}

export = WorksheetView;
