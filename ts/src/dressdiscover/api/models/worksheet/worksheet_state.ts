import * as Backbone from "backbone";
import { WorksheetFeatureState as dressdiscover_api_models_worksheet_WorksheetFeatureState } from "./worksheet_feature_state";

export class WorksheetState extends Backbone.Model {
    constructor(attributes?: {features: Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetFeatureState>}) {
        super(attributes);
    }

    get features(): Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetFeatureState> {
        return this.get('features');
    }

    set features(value: Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetFeatureState>) {
        this.set('features', value);
    }

    static fromThryftJSON(json: any): WorksheetState {
        var out: WorksheetState = new WorksheetState;
        for (var fieldName in json) {
            if (fieldName == "features") {
                out.attributes.features = function(json: any[]): Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetFeatureState> { var sequence: dressdiscover_api_models_worksheet_WorksheetFeatureState[] = []; for (var i = 0; i < json.length; i++) { sequence.push(dressdiscover_api_models_worksheet_WorksheetFeatureState.fromThryftJSON(json[i])); } return new Backbone.Collection<dressdiscover_api_models_worksheet_WorksheetFeatureState>(sequence); }(json[fieldName]);
            }
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["features"] = function (__inArray: dressdiscover_api_models_worksheet_WorksheetFeatureState[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJSON()); } return __outArray; }(this.features.models);
        return json;
    }
}
