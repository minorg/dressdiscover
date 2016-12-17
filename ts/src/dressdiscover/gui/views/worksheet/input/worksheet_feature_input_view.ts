﻿import * as _ from "underscore";
import * as Marionette from "backbone.marionette";
import { Application } from "dressdiscover/gui/application";
import { WorksheetFeature } from "dressdiscover/gui/models/worksheet/worksheet_feature";
import { WorksheetFeatureValuesInputView } from "dressdiscover/gui/views/worksheet/input/worksheet_feature_values_input_view";
import { WorksheetFeatureInputEvent } from "dressdiscover/gui/events/worksheet/worksheet_feature_input_event";
import "./worksheet_feature_input_view.less";

declare function require(moduleName: string): any;

export class WorksheetFeatureInputView extends Marionette.LayoutView<WorksheetFeature> {
    bindings = {
        "#text": "text"
    };

    constructor(options: any) {
        super(_.extend(options, {
            events: {
                "click #reset-button": "onClickResetButton"
            },
            regions: {
                values: "#values"
            },
            template: _.template(require("raw!./worksheet_feature_input_view.html"))
        }));
    }

    initialize() {
        this.listenTo(this.model, "change:text", this.onTextChange);
    }

    onBeforeDestroy() {
        (this as any).unstickit();
    }

    onClickResetButton() {
        this.model.text = undefined;

        if (this.model.values_) {
            for (let value of this.model.values_.models) {
                value.selected = false;
            }
        }

        Application.instance.radio.globalChannel.trigger(WorksheetFeatureInputEvent.NAME, new WorksheetFeatureInputEvent({ feature: this.model }));
    }

    onRender() {
        (this as any).stickit();
        this.showChildView("values", new WorksheetFeatureValuesInputView({ collection: this.model.values_ }));
    }

    onTextChange() {
        Application.instance.radio.globalChannel.trigger(WorksheetFeatureInputEvent.NAME, new WorksheetFeatureInputEvent({ feature: this.model }));
    }

    serializeData(): any {
        return { "displayName": this.model.displayName };
    }
}
