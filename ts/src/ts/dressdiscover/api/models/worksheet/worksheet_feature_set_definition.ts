import * as Backbone from "backbone";
import { WorksheetFeatureDefinition as dressdiscover_api_models_worksheet_WorksheetFeatureDefinition } from "./worksheet_feature_definition";

export class WorksheetFeatureSetDefinition extends Backbone.Model {
    constructor(attributes?: {displayName: string, features: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureDefinition}}) {
        super(attributes);
    }

    get displayName(): string {
        return this.get('displayName');
    }

    set displayName(value: string) {
        this.set('displayName', value);
    }

    get features(): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureDefinition} {
        return this.get('features');
    }

    set features(value: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureDefinition}) {
        this.set('features', value);
    }

    static fromThryftJSON(json: any): WorksheetFeatureSetDefinition {
        var out: WorksheetFeatureSetDefinition = new WorksheetFeatureSetDefinition;
        for (var fieldName in json) {
            if (fieldName == "display_name") {
                out.attributes.displayName = json[fieldName];
            } else if (fieldName == "features") {
                out.attributes.features = function (json: any): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureDefinition} { var map: any = {}; for (var key in json) { map[key] = dressdiscover_api_models_worksheet_WorksheetFeatureDefinition.fromThryftJSON(json[key]); } return map; }(json[fieldName]);
            }
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["display_name"] = this.displayName;
        json["features"] = function (value: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureDefinition}): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureDefinition} { var outObject: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureDefinition} = {}; for (var key in value) { outObject[key] = value[key].toThryftJSON(); } return outObject; }(this.features);
        return json;
    }
}
