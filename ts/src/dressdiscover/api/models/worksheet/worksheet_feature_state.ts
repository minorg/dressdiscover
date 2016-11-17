import * as Backbone from "backbone";
import { WorksheetEnumFeatureState } from "./worksheet_enum_feature_state";
import { WorksheetTextFeatureState } from "./worksheet_text_feature_state";

export class WorksheetFeatureState extends Backbone.Model {
    validation = {
        enum_: {
            "fn": function(value: any, attr: any, computedState: any) {
                if (typeof attr !== "undefined" && attr !== "null") {
                    if (!(value instanceof WorksheetEnumFeatureState)) {
                        return "expected WorksheetFeatureState.enum_ to be a WorksheetEnumFeatureState";
                    }
                    if (!value.isValid(true)) {
                        return value.validationError;
                    }
                }
                return undefined;
            },
            "required": false
        },

        text: {
            "fn": function(value: any, attr: any, computedState: any) {
                if (typeof attr !== "undefined" && attr !== "null") {
                    if (!(value instanceof WorksheetTextFeatureState)) {
                        return "expected WorksheetFeatureState.text to be a WorksheetTextFeatureState";
                    }
                    if (!value.isValid(true)) {
                        return value.validationError;
                    }
                }
                return undefined;
            },
            "required": false
        }
    }

    validationError: any;

    constructor(attributes?: {enum_?: WorksheetEnumFeatureState, text?: WorksheetTextFeatureState}, options?: any) {
        super(attributes, options);
    }

    get enum_(): WorksheetEnumFeatureState {
        return this.get('enum_');
    }

    set enum_(value: WorksheetEnumFeatureState) {
        this.set('enum_', value, { validate: true });
    }

    get text(): WorksheetTextFeatureState {
        return this.get('text');
    }

    set text(value: WorksheetTextFeatureState) {
        this.set('text', value, { validate: true });
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
        if (!out.isValid(true)) {
            throw new Error(out.validationError);
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
