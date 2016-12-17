import _ = require("underscore");
import { Application } from "dressdiscover/gui/application";
import Marionette = require("backbone.marionette");
import { WorksheetFeatureValue } from "dressdiscover/gui/models/worksheet/worksheet_feature_value";
import { WorksheetFeatureInputEvent } from "dressdiscover/gui/events/worksheet/worksheet_feature_input_event";
import "../../../../../../node_modules/magnify/dist/css/magnify.css";
import "../../../../../../node_modules/magnify/dist/js/jquery.magnify.js";
import "./worksheet_feature_value_input_view.less";

declare function require(moduleName: string): any;

export class WorksheetFeatureValueInputView extends Marionette.ItemView<WorksheetFeatureValue> {
    constructor(options?: any) {    
        super(_.extend(options, {
            events: {
                "click a.thumbnail": "onClick",
                "click div.checkbox": "onClick"
            },
            template: _.template(require("raw!./worksheet_feature_value_input_view.html")),
        }));
        this.listenTo(this.model, "change:selected", this.onModelChangeSelected);
    }

    initialize() {
        this.ui = { checkbox: "input", image: "img" };
    }

    onClick() {
        this.model.selected = !this.model.selected;
        this.ui.checkbox[0].checked = this.model.selected;
        Application.instance.radio.globalChannel.trigger(WorksheetFeatureInputEvent.NAME, new WorksheetFeatureInputEvent({ feature: this.model.parentFeature }));
    }

    onModelChangeSelected() {
        this.ui.checkbox[0].checked = this.model.selected;
    }

    serializeData(): any {
        let data = this.model.definition.toJSON();
        data["displayName"] = this.model.displayName;
        data["image"] = this.model.definition.image ? this.model.definition.image.toJSON() : null;
        return data;
    }

    onRender() {
        this.ui.checkbox[0].checked = this.model.selected;
        this.ui.image.magnify();
    }
}
