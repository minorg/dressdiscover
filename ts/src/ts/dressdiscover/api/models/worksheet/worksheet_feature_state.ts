import * as Backbone from "backbone";
import { WorksheetFeatureValueState as dressdiscover_api_models_worksheet_WorksheetFeatureValueState } from "./worksheet_feature_value_state";

export class WorksheetFeatureState extends Backbone.Model {
    constructor(attributes?: {feature_values: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureValueState}}) {
        super(attributes);
    }

    get feature_values(): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureValueState} {
        return this.get('feature_values');
    }

    set feature_values(value: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureValueState}) {
        this.set('feature_values', value);
    }

    static fromThryftJSON(json: any): WorksheetFeatureState {
        var out: WorksheetFeatureState = new WorksheetFeatureState;
        for (var fieldName in json) {
            if (fieldName == "feature_values") {
                out.attributes.feature_values = function (json: any): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureValueState} { var map: any = {}; for (var key in json) { map[key] = dressdiscover_api_models_worksheet_WorksheetFeatureValueState.fromThryftJSON(json[key]); } return map; }(json[fieldName]);
            }
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["feature_values"] = function (value: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureValueState}): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureValueState} { var outObject: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureValueState} = {}; for (var key in value) { outObject[key] = value[key].toThryftJSON(); } return outObject; }(this.feature_values);
        return json;
    }
}
