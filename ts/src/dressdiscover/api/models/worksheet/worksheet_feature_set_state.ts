import * as Backbone from "backbone";
import { WorksheetFeatureState as dressdiscover_api_models_worksheet_WorksheetFeatureState } from "./worksheet_feature_state";

export class WorksheetFeatureSetState extends Backbone.Model {
    constructor(attributes?: {childFeatureSets?: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState}, features?: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureState}}) {
        super(attributes);
    }

    get childFeatureSets(): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState} {
        return this.get('childFeatureSets');
    }

    set childFeatureSets(value: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState}) {
        this.set('childFeatureSets', value);
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
            if (fieldName == "child_feature_sets") {
                out.attributes.childFeatureSets = function (json: any): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState} { var map: any = {}; for (var key in json) { map[key] = dressdiscover_api_models_worksheet_WorksheetFeatureSetState.fromThryftJSON(json[key]); } return map; }(json[fieldName]);
            } else if (fieldName == "features") {
                out.attributes.features = function (json: any): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureState} { var map: any = {}; for (var key in json) { map[key] = dressdiscover_api_models_worksheet_WorksheetFeatureState.fromThryftJSON(json[key]); } return map; }(json[fieldName]);
            }
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        if (this.has("childFeatureSets")) {
            json["child_feature_sets"] = function (value: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState}): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState} { var outObject: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState} = {}; for (var key in value) { outObject[key] = value[key].toThryftJSON(); } return outObject; }(this.childFeatureSets);
        }
        if (this.has("features")) {
            json["features"] = function (value: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureState}): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureState} { var outObject: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureState} = {}; for (var key in value) { outObject[key] = value[key].toThryftJSON(); } return outObject; }(this.features);
        }
        return json;
    }
}
