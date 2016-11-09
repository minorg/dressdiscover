import * as Backbone from "backbone";
import { WorksheetFeatureType as dressdiscover_api_models_worksheet_WorksheetFeatureType } from "./worksheet_feature_type";
import { WorksheetFeatureValueDefinition as dressdiscover_api_models_worksheet_WorksheetFeatureValueDefinition } from "./worksheet_feature_value_definition";

export class WorksheetFeatureDefinition extends Backbone.Model {
    constructor(attributes?: {display_name: string, type: dressdiscover_api_models_worksheet_WorksheetFeatureType, feature_values?: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureValueDefinition}}) {
        super(attributes);
    }

    get display_name(): string {
        return this.get('display_name');
    }

    set display_name(value: string) {
        this.set('display_name', value);
    }

    get type(): dressdiscover_api_models_worksheet_WorksheetFeatureType {
        return this.get('type');
    }

    set type(value: dressdiscover_api_models_worksheet_WorksheetFeatureType) {
        this.set('type', value);
    }

    get feature_values(): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureValueDefinition} {
        return this.get('feature_values');
    }

    set feature_values(value: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureValueDefinition}) {
        this.set('feature_values', value);
    }

    static fromThryftJSON(json: any): WorksheetFeatureDefinition {
        var out: WorksheetFeatureDefinition = new WorksheetFeatureDefinition;
        for (var fieldName in json) {
            if (fieldName == "display_name") {
                out.attributes.display_name = json[fieldName];
            } else if (fieldName == "type") {
                out.attributes.type = dressdiscover_api_models_worksheet_WorksheetFeatureType[json[fieldName]];
            } else if (fieldName == "feature_values") {
                out.attributes.feature_values = function (json: any): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureValueDefinition} { var map: any = {}; for (var key in json) { map[key] = dressdiscover_api_models_worksheet_WorksheetFeatureValueDefinition.fromThryftJSON(json[key]); } return map; }(json[fieldName]);
            }
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["display_name"] = this.display_name;
        json["type"] = dressdiscover_api_models_worksheet_WorksheetFeatureType[this.type];
        if (this.has("feature_values")) {
            json["feature_values"] = function (value: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureValueDefinition}): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureValueDefinition} { var outObject: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureValueDefinition} = {}; for (var key in value) { outObject[key] = value[key].toThryftJSON(); } return outObject; }(this.feature_values);
        }
        return json;
    }
}
