import * as Backbone from "backbone";
import { WorksheetFeatureDefinition as dressdiscover_api_models_worksheet_WorksheetFeatureDefinition } from "./worksheet_feature_definition";

export class WorksheetFeatureSetDefinition extends Backbone.Model {
    constructor(attributes?: {id: string, childFeatureSets?: Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetFeatureSetDefinition>, displayName?: string, features?: Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetFeatureDefinition>}) {
        super(attributes);
    }

    get id(): string {
        return this.get('id');
    }

    set id(value: string) {
        this.set('id', value);
    }

    get childFeatureSets(): Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetFeatureSetDefinition> {
        return this.get('childFeatureSets');
    }

    set childFeatureSets(value: Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetFeatureSetDefinition>) {
        this.set('childFeatureSets', value);
    }

    get displayName(): string {
        return this.get('displayName');
    }

    set displayName(value: string) {
        this.set('displayName', value);
    }

    get features(): Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetFeatureDefinition> {
        return this.get('features');
    }

    set features(value: Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetFeatureDefinition>) {
        this.set('features', value);
    }

    static fromThryftJSON(json: any): WorksheetFeatureSetDefinition {
        var out: WorksheetFeatureSetDefinition = new WorksheetFeatureSetDefinition;
        for (var fieldName in json) {
            if (fieldName == "id") {
                out.attributes.id = json[fieldName];
            } else if (fieldName == "child_feature_sets") {
                out.attributes.childFeatureSets = function(json: any[]): Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetFeatureSetDefinition> { var sequence: dressdiscover_api_models_worksheet_WorksheetFeatureSetDefinition[] = []; for (var i = 0; i < json.length; i++) { sequence.push(dressdiscover_api_models_worksheet_WorksheetFeatureSetDefinition.fromThryftJSON(json[i])); } return new Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetFeatureSetDefinition>(sequence); }(json[fieldName]);
            } else if (fieldName == "display_name") {
                out.attributes.displayName = json[fieldName];
            } else if (fieldName == "features") {
                out.attributes.features = function(json: any[]): Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetFeatureDefinition> { var sequence: dressdiscover_api_models_worksheet_WorksheetFeatureDefinition[] = []; for (var i = 0; i < json.length; i++) { sequence.push(dressdiscover_api_models_worksheet_WorksheetFeatureDefinition.fromThryftJSON(json[i])); } return new Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetFeatureDefinition>(sequence); }(json[fieldName]);
            }
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id;
        if (this.has("childFeatureSets")) {
            json["child_feature_sets"] = function (__inArray: dressdiscover_api_models_worksheet_WorksheetFeatureSetDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJSON()); } return __outArray; }(this.childFeatureSets.models);
        }
        if (this.has("displayName")) {
            json["display_name"] = this.displayName;
        }
        if (this.has("features")) {
            json["features"] = function (__inArray: dressdiscover_api_models_worksheet_WorksheetFeatureDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJSON()); } return __outArray; }(this.features.models);
        }
        return json;
    }
}
