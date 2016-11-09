import * as Backbone from "backbone";
import { WorksheetFeatureState as dressdiscover_api_models_worksheet_WorksheetFeatureState } from "./worksheet_feature_state";

export class WorksheetFeatureSetState extends Backbone.Model {
    constructor(attributes?: {features?: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureState}}) {
        super(attributes);
    }

    get features(): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureState} {
        return this.get('features');
    }

    set features(value: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureState}) {
        this.set('features', value);
    }

    static fromThryftJSON(json: any): WorksheetFeatureSetState {
        var out: WorksheetFeatureSetState = new WorksheetFeatureSetState;
        for (var fieldName in json) {
            if (fieldName == "features") {
                out.attributes.features = function (json: any): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureState} { var map: any = {}; for (var key in json) { map[key] = dressdiscover_api_models_worksheet_WorksheetFeatureState.fromThryftJSON(json[key]); } return map; }(json[fieldName]);
            }
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        if (this.has("features")) {
            json["features"] = function (value: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureState}): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureState} { var outObject: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureState} = {}; for (var key in value) { outObject[key] = value[key].toThryftJSON(); } return outObject; }(this.features);
        }
        return json;
    }
}
