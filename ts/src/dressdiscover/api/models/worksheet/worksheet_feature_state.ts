import * as Backbone from "backbone";
import { WorksheetEnumFeatureState } from "./worksheet_enum_feature_state";
import { WorksheetTextFeatureState } from "./worksheet_text_feature_state";

export class WorksheetFeatureState extends Backbone.Model {
    constructor(attributes?: {enum_?: WorksheetEnumFeatureState, text?: WorksheetTextFeatureState}) {
        super(attributes);
    }

    get enum_(): WorksheetEnumFeatureState {
        return this.get('enum_');
    }

    set enum_(value: WorksheetEnumFeatureState) {
        this.set('enum_', value);
    }

    get text(): WorksheetTextFeatureState {
        return this.get('text');
    }

    set text(value: WorksheetTextFeatureState) {
        this.set('text', value);
    }

    static fromThryftJSON(json: any): WorksheetFeatureState {
        var out: WorksheetFeatureState = new WorksheetFeatureState;
        for (var fieldName in json) {
            if (fieldName == "enum_") {
                out.attributes.enum_ = WorksheetEnumFeatureState.fromThryftJSON(json[fieldName]);
            } else if (fieldName == "text") {
                out.attributes.text = WorksheetTextFeatureState.fromThryftJSON(json[fieldName]);
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
