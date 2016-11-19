import { AppRadio } from "dressdiscover/gui/app_radio";
import { TopLevelView } from "dressdiscover/gui/views/top_level_view";
import { WorksheetModel } from "dressdiscover/gui/models/worksheet/worksheet_model";
import { WorksheetFeatureInputEvent } from "dressdiscover/gui/events/worksheet/worksheet_feature_input_event";
import { WorksheetTwoColumnView } from "./worksheet_two_column_view";
import "./worksheet.less";

export class WorksheetTopLevelView extends TopLevelView<WorksheetModel> {
    constructor() {
        super({ model: new WorksheetModel() });
    }

    initialize() {
        this.model.fetchFromService();

        this.listenTo(AppRadio.channel, WorksheetFeatureInputEvent.NAME, this.onFeatureInput);
    }

    onFeatureInput(event: WorksheetFeatureInputEvent) {
        this.model.putToService();
    }

    onRender() {
        super.onRender();
        this.showChildView("content", new WorksheetTwoColumnView({ model: this.model }));
    }
}
