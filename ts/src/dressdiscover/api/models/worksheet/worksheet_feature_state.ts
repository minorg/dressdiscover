import * as Backbone from "backbone";
import { WorksheetFeatureValueState as dressdiscover_api_models_worksheet_WorksheetFeatureValueState } from "./worksheet_feature_value_state";

export class WorksheetFeatureState extends Backbone.Model {
    constructor(attributes?: {featureValues: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureValueState}}) {
        super(attributes);
    }

    get featureValues(): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureValueState} {
        return this.get('featureValues');
    }

    set featureValues(value: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureValueState}) {
        this.set('featureValues', value);
    }

    static fromThryftJSON(json: any): WorksheetFeatureState {
        var out: WorksheetFeatureState = new WorksheetFeatureState;
        for (var fieldName in json) {
            if (fieldName == "feature_values") {
                out.attributes.featureValues = function (json: any): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureValueState} { var map: any = {}; for (var key in json) { map[key] = dressdiscover_api_models_worksheet_WorksheetFeatureValueState.fromThryftJSON(json[key]); } return map; }(json[fieldName]);
            }
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["feature_values"] = function (value: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureValueState}): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureValueState} { var outObject: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureValueState} = {}; for (var key in value) { outObject[key] = value[key].toThryftJSON(); } return outObject; }(this.featureValues);
        return json;
    }
}
