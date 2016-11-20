import _ = require("underscore");
import { AppRadio } from "dressdiscover/gui/app_radio";
import Marionette = require("backbone.marionette");
import { WorksheetEnumFeatureValueModel } from "dressdiscover/gui/models/worksheet/worksheet_enum_feature_value_model";
import { WorksheetFeatureInputEvent } from "dressdiscover/gui/events/worksheet/worksheet_feature_input_event";

declare function require(moduleName: string): any;

export class WorksheetEnumFeatureValueInputView extends Marionette.ItemView<WorksheetEnumFeatureValueModel> {
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
        this.ui = { checkbox: "#feature-value-checkbox" };
    }

    onClick() {
        this.model.selected = !this.model.selected;
        this.ui.checkbox[0].checked = this.model.selected;
        AppRadio.channel.trigger(WorksheetFeatureInputEvent.NAME, new WorksheetFeatureInputEvent({ feature: this.model.parentFeature }));
    }    

    serializeData(): any {
        let data = this.model.definition.toJSON();
        data["displayName"] = this.model.displayName;
        data['image'] = this.model.definition.image ? this.model.definition.image.toJSON() : null;
        return data;
    }

    onRender() {
        this.ui.checkbox[0].checked = this.model.selected;
    }
}
