import * as Backbone from "backbone";
import { WorksheetEnumFeatureValueDefinition } from "./worksheet_enum_feature_value_definition";

export class WorksheetEnumFeatureDefinition extends Backbone.Model {
    constructor(attributes?: {values_: Backbone.Collection<WorksheetEnumFeatureValueDefinition>}) {
        if (!attributes) {
            attributes = {};
        }
        attributes["validation"] = {
            values_: {
                "fn": function(value, attr, computedState) {
                    if (!(value instanceof Backbone.Collection)) {
                        return "expected dressdiscover.api.models.worksheet.WorksheetEnumFeatureDefinition.values_ to be a Backbone.Collection";
                    }
                    if (value.model !== dressdiscover.api.models.worksheet.WorksheetEnumFeatureValueDefinition) {
                        return "expected dressdiscover.api.models.worksheet.WorksheetEnumFeatureDefinition.values_ to be a Backbone.Collection with model=dressdiscover.api.models.worksheet.WorksheetEnumFeatureValueDefinition";
                    }
                    if (!value.isValid(true)) {
                        return value.validationError;
                    }
                },
                "minLength": 1, "required": true
            }
        }
        super(attributes);
    }

    get values_(): Backbone.Collection<WorksheetEnumFeatureValueDefinition> {
        return this.get('values_');
    }

    set values_(value: Backbone.Collection<WorksheetEnumFeatureValueDefinition>) {
        this.set('values_', value);
    }

    static fromThryftJSON(json: any): WorksheetEnumFeatureDefinition {
        var out: WorksheetEnumFeatureDefinition = new WorksheetEnumFeatureDefinition;
        for (var fieldName in json) {
            if (fieldName == "values_") {
                out.attributes.values_ = function(json: any[]): Backbone.Collection<WorksheetEnumFeatureValueDefinition> { var sequence: WorksheetEnumFeatureValueDefinition[] = []; for (var i = 0; i < json.length; i++) { sequence.push(WorksheetEnumFeatureValueDefinition.fromThryftJSON(json[i])); } return new Backbone.Collection<WorksheetEnumFeatureValueDefinition>(sequence); }(json[fieldName]);
            }
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["values_"] = function (__inArray: WorksheetEnumFeatureValueDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJSON()); } return __outArray; }(this.values_.models);
        return json;
    }
}
