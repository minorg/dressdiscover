import { WorksheetContentView } from "./worksheet_content_view";
import { WorksheetModel } from "dressdiscover/gui/models/worksheet/worksheet_model";
import { TopLevelView } from "dressdiscover/gui/views/top_level_view";

export class WorksheetView extends TopLevelView<WorksheetModel> {
    constructor() {
        super({ model: new WorksheetModel() });
    }

    initialize() {
        this.model.fetchFromService();
    }

    onRender() {
        super.onRender();
        this.showChildView("content", new WorksheetContentView({ model: this.model }));
    }
}
``