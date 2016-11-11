import * as Backbone from "backbone";
import { WorksheetEnumFeatureState as dressdiscover_api_models_worksheet_WorksheetEnumFeatureState } from "./worksheet_enum_feature_state";
import { WorksheetTextFeatureState as dressdiscover_api_models_worksheet_WorksheetTextFeatureState } from "./worksheet_text_feature_state";

export class WorksheetFeatureState extends Backbone.Model {
    constructor(attributes?: {enum_?: dressdiscover_api_models_worksheet_WorksheetEnumFeatureState, text?: dressdiscover_api_models_worksheet_WorksheetTextFeatureState}) {
        super(attributes);
    }

    get enum_(): dressdiscover_api_models_worksheet_WorksheetEnumFeatureState {
        return this.get('enum_');
    }

    set enum_(value: dressdiscover_api_models_worksheet_WorksheetEnumFeatureState) {
        this.set('enum_', value);
    }

    get text(): dressdiscover_api_models_worksheet_WorksheetTextFeatureState {
        return this.get('text');
    }

    set text(value: dressdiscover_api_models_worksheet_WorksheetTextFeatureState) {
        this.set('text', value);
    }

    static fromThryftJSON(json: any): WorksheetFeatureState {
        var out: WorksheetFeatureState = new WorksheetFeatureState;
        for (var fieldName in json) {
            if (fieldName == "enum_") {
                out.attributes.enum_ = dressdiscover_api_models_worksheet_WorksheetEnumFeatureState.fromThryftJSON(json[fieldName]);
            } else if (fieldName == "text") {
                out.attributes.text = dressdiscover_api_models_worksheet_WorksheetTextFeatureState.fromThryftJSON(json[fieldName]);
            }
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        if (this.has("enum_")) {
            json["enum_"] = this.enum_.toThryftJSON();
        }
        if (this.has("text")) {
            json["text"] = this.text.toThryftJSON();
        }
        return json;
    }
}
