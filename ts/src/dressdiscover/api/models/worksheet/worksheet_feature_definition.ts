import * as Backbone from "backbone";
import { WorksheetFeatureType as dressdiscover_api_models_worksheet_WorksheetFeatureType } from "./worksheet_feature_type";
import { WorksheetFeatureValueDefinition as dressdiscover_api_models_worksheet_WorksheetFeatureValueDefinition } from "./worksheet_feature_value_definition";

export class WorksheetFeatureDefinition extends Backbone.Model {
    constructor(attributes?: {id: string, type: dressdiscover_api_models_worksheet_WorksheetFeatureType, displayName?: string, featureValues?: Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetFeatureValueDefinition>}) {
        super(attributes);
    }

    get id(): string {
        return this.get('id');
    }

    set id(value: string) {
        this.set('id', value);
    }

    get type(): dressdiscover_api_models_worksheet_WorksheetFeatureType {
        return this.get('type');
    }

    set type(value: dressdiscover_api_models_worksheet_WorksheetFeatureType) {
        this.set('type', value);
    }

    get displayName(): string {
        return this.get('displayName');
    }

    set displayName(value: string) {
        this.set('displayName', value);
    }

    get featureValues(): Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetFeatureValueDefinition> {
        return this.get('featureValues');
    }

    set featureValues(value: Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetFeatureValueDefinition>) {
        this.set('featureValues', value);
    }

    static fromThryftJSON(json: any): WorksheetFeatureDefinition {
        var out: WorksheetFeatureDefinition = new WorksheetFeatureDefinition;
        for (var fieldName in json) {
            if (fieldName == "id") {
                out.attributes.id = json[fieldName];
            } else if (fieldName == "type") {
                out.attributes.type = dressdiscover_api_models_worksheet_WorksheetFeatureType[json[fieldName]];
            } else if (fieldName == "display_name") {
                out.attributes.displayName = json[fieldName];
            } else if (fieldName == "feature_values") {
                out.attributes.featureValues = function(json: any[]): Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetFeatureValueDefinition> { var sequence: dressdiscover_api_models_worksheet_WorksheetFeatureValueDefinition[] = []; for (var i = 0; i < json.length; i++) { sequence.push(dressdiscover_api_models_worksheet_WorksheetFeatureValueDefinition.fromThryftJSON(json[i])); } return new Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetFeatureValueDefinition>(sequence); }(json[fieldName]);
            }
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id;
        json["type"] = dressdiscover_api_models_worksheet_WorksheetFeatureType[this.type];
        if (this.has("displayName")) {
            json["display_name"] = this.displayName;
        }
        if (this.has("featureValues")) {
            json["feature_values"] = function (__inArray: dressdiscover_api_models_worksheet_WorksheetFeatureValueDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJSON()); } return __outArray; }(this.featureValues.models);
        }
        return json;
    }
}
