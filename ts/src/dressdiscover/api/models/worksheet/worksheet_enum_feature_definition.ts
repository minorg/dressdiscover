import * as Backbone from "backbone";
import { WorksheetEnumFeatureValueDefinition } from "./worksheet_enum_feature_value_definition";

export class WorksheetEnumFeatureDefinition extends Backbone.Model {
    validation = {
        values_: {
            "fn": function(value: any, attr: any, computedState: any) {
                if (!(value instanceof Backbone.Collection)) {
                    return "expected WorksheetEnumFeatureDefinition.values_ to be a Backbone.Collection";
                }
                if (value.model !== WorksheetEnumFeatureValueDefinition) {
                    return "expected WorksheetEnumFeatureDefinition.values_ to be a Backbone.Collection with model=WorksheetEnumFeatureValueDefinition";
                }
                for (let __model0 of value.models) {
                    if (!__model0.isValid(true)) {
                        return __model0.validationError;
                    }
                }

                return undefined;
            },
            "minLength": 1, "required": true
        }
    }

    validationError: any;

    constructor(attributes?: {values_: Backbone.Collection<WorksheetEnumFeatureValueDefinition>}, options?: any) {
        super(attributes, options);
    }

    get values_(): Backbone.Collection<WorksheetEnumFeatureValueDefinition> {
        return this.get('values_');
    }

    set values_(value: Backbone.Collection<WorksheetEnumFeatureValueDefinition>) {
        this.set('values_', value, { validate: true });
    }

    static fromThryftJSON(json: any): WorksheetEnumFeatureDefinition {
        var out: WorksheetEnumFeatureDefinition = new WorksheetEnumFeatureDefinition;
        for (var fieldName in json) {
            if (fieldName == "values_") {
                out.attributes.values_ = function(json: any[]): Backbone.Collection<WorksheetEnumFeatureValueDefinition> { var sequence: WorksheetEnumFeatureValueDefinition[] = []; for (var i = 0; i < json.length; i++) { sequence.push(WorksheetEnumFeatureValueDefinition.fromThryftJSON(json[i])); } return new Backbone.Collection<WorksheetEnumFeatureValueDefinition>(sequence); }(json[fieldName]);
            }
        }
        if (!out.isValid(true)) {
            throw new Error(out.validationError);
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["values_"] = function (__inArray: WorksheetEnumFeatureValueDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJSON()); } return __outArray; }(this.values_.models);
        return json;
    }
}
