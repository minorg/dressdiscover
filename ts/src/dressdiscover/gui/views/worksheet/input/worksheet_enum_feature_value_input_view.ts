import _ = require("underscore");
import { Application } from "dressdiscover/gui/application";
import Marionette = require("backbone.marionette");
import { WorksheetEnumFeatureValue } from "dressdiscover/gui/models/worksheet/worksheet_enum_feature_value";
import { WorksheetFeatureInputEvent } from "dressdiscover/gui/events/worksheet/worksheet_feature_input_event";
import "./worksheet_enum_feature_value_input_view.less";

declare function require(moduleName: string): any;

export class WorksheetEnumFeatureValueInputView extends Marionette.ItemView<WorksheetEnumFeatureValue> {
    constructor(options?: any) {    
        super(_.extend(options, {
            events: {
                "click #feature-value-link": "onClick",
                "click #feature-value-checkbox": "onClick"
            },
            template: _.template(require("raw!./worksheet_enum_feature_value_input_view.html")),
        }));
    }

    initialize() {
        this.ui = { checkbox: "#feature-value-checkbox", image: "#feature-value-img" };
    }

    onClick() {
        this.model.selected = !this.model.selected;
        this.ui.checkbox[0].checked = this.model.selected;
        Application.instance.radio.globalChannel.trigger(WorksheetFeatureInputEvent.NAME, new WorksheetFeatureInputEvent({ feature: this.model.parentFeature }));
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
