import * as Backbone from "backbone";
import { WorksheetFeatureDefinition as dressdiscover_api_models_worksheet_WorksheetFeatureDefinition } from "./worksheet_feature_definition";

export class WorksheetFeatureSetDefinition extends Backbone.Model {
    constructor(attributes?: {features: Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetFeatureDefinition>, id: string, displayName?: string}) {
        super(attributes);
    }

    get features(): Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetFeatureDefinition> {
        return this.get('features');
    }

    set features(value: Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetFeatureDefinition>) {
        this.set('features', value);
    }

    get id(): string {
        return this.get('id');
    }

    set id(value: string) {
        this.set('id', value);
    }

    get displayName(): string {
        return this.get('displayName');
    }

    set displayName(value: string) {
        this.set('displayName', value);
    }

    static fromThryftJSON(json: any): WorksheetFeatureSetDefinition {
        var out: WorksheetFeatureSetDefinition = new WorksheetFeatureSetDefinition;
        for (var fieldName in json) {
            if (fieldName == "features") {
                out.attributes.features = function(json: any[]): Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetFeatureDefinition> { var sequence: dressdiscover_api_models_worksheet_WorksheetFeatureDefinition[] = []; for (var i = 0; i < json.length; i++) { sequence.push(dressdiscover_api_models_worksheet_WorksheetFeatureDefinition.fromThryftJSON(json[i])); } return new Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetFeatureDefinition>(sequence); }(json[fieldName]);
            } else if (fieldName == "id") {
                out.attributes.id = json[fieldName];
            } else if (fieldName == "display_name") {
                out.attributes.displayName = json[fieldName];
            }
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["features"] = function (__inArray: dressdiscover_api_models_worksheet_WorksheetFeatureDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJSON()); } return __outArray; }(this.features.models);
        json["id"] = this.id;
        if (this.has("displayName")) {
            json["display_name"] = this.displayName;
        }
        return json;
    }
}
