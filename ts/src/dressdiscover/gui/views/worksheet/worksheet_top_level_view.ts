import { AppRadio } from "dressdiscover/gui/app_radio";
import { TopLevelView } from "dressdiscover/gui/views/top_level_view";
import { Worksheet } from "dressdiscover/gui/models/worksheet/worksheet";
import { WorksheetFeatureInputEvent } from "dressdiscover/gui/events/worksheet/worksheet_feature_input_event";
import { WorksheetTwoColumnView } from "./worksheet_two_column_view";

export class WorksheetTopLevelView extends TopLevelView<Worksheet> {
    initialize() {
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
