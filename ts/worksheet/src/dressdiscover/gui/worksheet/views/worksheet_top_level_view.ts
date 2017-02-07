import { Application } from "dressdiscover/gui/worksheet/application";
import { TopLevelView } from "dressdiscover/gui/worksheet/views/top_level_view";
import { Worksheet } from "dressdiscover/gui/worksheet/models/worksheet";
import { WorksheetFeatureInputEvent } from "dressdiscover/gui/worksheet/events/worksheet_feature_input_event";
import { WorksheetTwoColumnView } from "./worksheet_two_column_view";

export class WorksheetTopLevelView extends TopLevelView<Worksheet> {
    initialize() {
        this.listenTo(Application.instance.radio.globalChannel, WorksheetFeatureInputEvent.NAME, this.onFeatureInput);
    }

    onFeatureInput(event: WorksheetFeatureInputEvent) {
        this.model.putToService();
    }

    onRender() {
        super.onRender();
        this.showChildView("content", new WorksheetTwoColumnView({ model: this.model }));
    }
}
