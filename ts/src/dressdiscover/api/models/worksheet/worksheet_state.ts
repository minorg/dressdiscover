import * as Backbone from "backbone";
import { WorksheetFeatureSetState as dressdiscover_api_models_worksheet_WorksheetFeatureSetState } from "./worksheet_feature_set_state";

export class WorksheetState extends Backbone.Model {
    constructor(attributes?: {rootFeatureSets?: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState}}) {
        super(attributes);
    }

    get rootFeatureSets(): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState} {
        return this.get('rootFeatureSets');
    }

    set rootFeatureSets(value: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState}) {
        this.set('rootFeatureSets', value);
    }

    static fromThryftJSON(json: any): WorksheetState {
        var out: WorksheetState = new WorksheetState;
        for (var fieldName in json) {
            if (fieldName == "root_feature_sets") {
                out.attributes.rootFeatureSets = function (json: any): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState} { var map: any = {}; for (var key in json) { map[key] = dressdiscover_api_models_worksheet_WorksheetFeatureSetState.fromThryftJSON(json[key]); } return map; }(json[fieldName]);
            }
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        if (this.has("rootFeatureSets")) {
            json["root_feature_sets"] = function (value: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState}): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState} { var outObject: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState} = {}; for (var key in value) { outObject[key] = value[key].toThryftJSON(); } return outObject; }(this.rootFeatureSets);
        }
        return json;
    }
}
