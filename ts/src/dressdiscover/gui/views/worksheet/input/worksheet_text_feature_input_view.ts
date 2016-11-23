import _ = require("underscore");
import { Application } from "dressdiscover/gui/application";
import Marionette = require("backbone.marionette");
import { WorksheetFeatureInputEvent } from "dressdiscover/gui/events/worksheet/worksheet_feature_input_event";
import { WorksheetTextFeature } from "dressdiscover/gui/models/worksheet/worksheet_text_feature";
import "../../../../../../node_modules/backbone.stickit/backbone.stickit.js";

declare function require(moduleName: string): any;

export class WorksheetTextFeatureInputView extends Marionette.ItemView<WorksheetTextFeature> {
    bindings = {
        "#text": "text"
    };

    constructor(options: any) {
        super(_.extend(options, {
            template: _.template(require("raw!./worksheet_text_feature_input_view.html"))
        }));
    }

    initialize() {
        this.listenTo(this.model, "change:text", this.onTextChange);
    }

    onBeforeDestroy() {
        (this as any).unstickit();
    }

    onRender() {
        (this as any).stickit();
    }

    onTextChange() {
        Application.instance.radio.globalChannel.trigger(WorksheetFeatureInputEvent.NAME, new WorksheetFeatureInputEvent({ feature: this.model }));
    }

    serializeData(): any {
        return { "displayName": this.model.displayName };
    }
}
