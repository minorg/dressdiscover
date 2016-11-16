import { AppRadio } from "dressdiscover/gui/app_radio";
import { WorksheetContentView } from "./worksheet_content_view";
import { WorksheetModel } from "dressdiscover/gui/models/worksheet/worksheet_model";
import { TopLevelView } from "dressdiscover/gui/views/top_level_view";
import { WorksheetFeatureSelectionEvent } from "dressdiscover/gui/events/worksheet/worksheet_feature_selection_event";

export class WorksheetView extends TopLevelView<WorksheetModel> {
    constructor() {
        super({ model: new WorksheetModel() });
    }

    initialize() {
        this.model.fetchFromService();

        this.listenTo(AppRadio.channel, WorksheetFeatureSelectionEvent.NAME, this.onFeatureSelection);
    }

    onFeatureSelection(request: WorksheetFeatureSelectionEvent) {
        alert("Feature selected: " + request.featureModel.definition.id);
    }

    onRender() {
        super.onRender();
        this.showChildView("content", new WorksheetContentView({ model: this.model }));
    }
}
``