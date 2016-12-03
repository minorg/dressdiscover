import * as _ from "underscore";
import * as Marionette from "backbone.marionette";
import { Application } from "dressdiscover/gui/application";
import { WorksheetEnumFeature } from "dressdiscover/gui/models/worksheet/worksheet_enum_feature";
import { WorksheetEnumFeatureValuesInputView } from "dressdiscover/gui/views/worksheet/input/worksheet_enum_feature_values_input_view";
import { WorksheetFeatureInputEvent } from "dressdiscover/gui/events/worksheet/worksheet_feature_input_event";
import "./worksheet_enum_feature_input_view.less";


declare function require(moduleName: string): any;

export class WorksheetEnumFeatureInputView extends Marionette.LayoutView<WorksheetEnumFeature> {
    constructor(options: any) {
        super(_.extend(options, {
            events: {
                "click #reset-button": "onClickResetButton"
            },
            regions: {
                values: "#values"
            },
            template: _.template(require("raw!./worksheet_enum_feature_input_view.html"))
        }));
    }

    onClickResetButton() {
        for (let value of this.model.values_.models) {
            value.selected = false;
        }
        Application.instance.radio.globalChannel.trigger(WorksheetFeatureInputEvent.NAME, new WorksheetFeatureInputEvent({ feature: this.model }));
    }

    onRender() {
        this.showChildView("values", new WorksheetEnumFeatureValuesInputView({ collection: this.model.values_ }));
    }

    serializeData(): any {
        return { "displayName": this.model.displayName };
    }
}
