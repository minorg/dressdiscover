import _ = require("underscore");
import { AppRadio } from "dressdiscover/gui/app_radio";
import Marionette = require("backbone.marionette");
import { WorksheetEnumFeatureModel } from "dressdiscover/gui/models/worksheet/worksheet_enum_feature_model";
import { WorksheetEnumFeatureValueModel } from "dressdiscover/gui/models/worksheet/worksheet_enum_feature_value_model";
import { WorksheetFeatureInputEvent } from "dressdiscover/gui/events/worksheet/worksheet_feature_input_event";

declare function require(moduleName: string): any;

export class WorksheetEnumFeatureValueInputView extends Marionette.ItemView<WorksheetEnumFeatureValueModel> {
    constructor(options: { parentFeature: WorksheetEnumFeatureModel, [index: string]: any }) {    
        super(_.extend(_.omit(options, "parentFeature"), {
            events: {
                "click input": "onClick",
                "click a": "onClick"
            },
            template: _.template(require("raw!./worksheet_enum_feature_value_input_view.html")),
        }));
        this._parentFeature = options.parentFeature;
    }

    initialize() {
        this.ui = { checkbox: "input" };
    }

    onClick() {
        this.model.selected = !this.model.selected;
        this.ui.checkbox[0].checked = this.model.selected;
        AppRadio.channel.trigger(WorksheetFeatureInputEvent.NAME, new WorksheetFeatureInputEvent({ feature: this._parentFeature }));
    }    

    serializeData(): any {
        let data = this.model.definition.toJSON();
        if (!data["displayName"]) {
            data["displayName"] = undefined;
        }
        data['image'] = this.model.definition.image ? this.model.definition.image.toJSON() : null;
        return data;
    }

    onRender() {
        this.ui.checkbox[0].checked = this.model.selected;
    }

    private _parentFeature: WorksheetEnumFeatureModel;
}
