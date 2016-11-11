import * as Backbone from "backbone";
import { WorksheetEnumFeatureValueDefinition as dressdiscover_api_models_worksheet_WorksheetEnumFeatureValueDefinition } from "./worksheet_enum_feature_value_definition";

export class WorksheetEnumFeatureDefinition extends Backbone.Model {
    constructor(attributes?: {values_?: Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetEnumFeatureValueDefinition>}) {
        super(attributes);
    }

    get values_(): Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetEnumFeatureValueDefinition> {
        return this.get('values_');
    }

    set values_(value: Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetEnumFeatureValueDefinition>) {
        this.set('values_', value);
    }

    static fromThryftJSON(json: any): WorksheetEnumFeatureDefinition {
        var out: WorksheetEnumFeatureDefinition = new WorksheetEnumFeatureDefinition;
        for (var fieldName in json) {
            if (fieldName == "values_") {
                out.attributes.values_ = function(json: any[]): Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetEnumFeatureValueDefinition> { var sequence: dressdiscover_api_models_worksheet_WorksheetEnumFeatureValueDefinition[] = []; for (var i = 0; i < json.length; i++) { sequence.push(dressdiscover_api_models_worksheet_WorksheetEnumFeatureValueDefinition.fromThryftJSON(json[i])); } return new Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetEnumFeatureValueDefinition>(sequence); }(json[fieldName]);
            }
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        if (this.has("values_")) {
            json["values_"] = function (__inArray: dressdiscover_api_models_worksheet_WorksheetEnumFeatureValueDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJSON()); } return __outArray; }(this.values_.models);
        }
        return json;
    }
}
