import _ = require("underscore");
import { AppRadio } from "dressdiscover/gui/app_radio";
import Marionette = require("backbone.marionette");
import { WorksheetFeatureInputEvent } from "dressdiscover/gui/events/worksheet/worksheet_feature_input_event";
import { WorksheetTextFeatureModel } from "dressdiscover/gui/models/worksheet/worksheet_text_feature_model";
import "../../../../../../node_modules/backbone.stickit/backbone.stickit.js";

declare function require(moduleName: string): any;

export class WorksheetTextFeatureInputView extends Marionette.ItemView<WorksheetTextFeatureModel> {
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
        AppRadio.channel.trigger(WorksheetFeatureInputEvent.NAME, new WorksheetFeatureInputEvent({ feature: this.model }));
    }

    serializeData(): any {
        return { "displayName": this.model.displayName };
    }
}
