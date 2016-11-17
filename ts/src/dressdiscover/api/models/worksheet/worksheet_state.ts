import * as Backbone from "backbone";
import { WorksheetFeatureSetState } from "./worksheet_feature_set_state";

export class WorksheetState extends Backbone.Model {
    constructor(attributes?: {rootFeatureSets?: {[index: string]: WorksheetFeatureSetState}}) {
        if (!attributes) {
            attributes = {};
        }
        attributes["validation"] = {
            root_feature_sets: {
                "fn": function(value, attr, computedState) {
                    if (typeof attr !== "undefined" && attr !== "null") {
                        if (typeof value !== "object") {
                            return "expected dressdiscover.api.models.worksheet.WorksheetState.root_feature_sets to be an object";
                        }
                        for (var __key in value) {
                            var __value = value[__key];
                            if (typeof __key !== "string") {
                                return "expected dressdiscover.api.models.worksheet.WorksheetState.root_feature_sets key to be a string";
                            }
                            if (!(__value instanceof dressdiscover.api.models.worksheet.WorksheetFeatureSetState)) {
                                return "expected dressdiscover.api.models.worksheet.WorksheetState.root_feature_sets value to be a dressdiscover.api.models.worksheet.WorksheetFeatureSetState";
                            }
                            if (!__value.isValid(true)) {
                                return __value.validationError;
                            }
                        }
                    }
                },
                "minLength": 1, "required": false
            }
        }
        super(attributes);
    }

    get rootFeatureSets(): {[index: string]: WorksheetFeatureSetState} {
        return this.get('rootFeatureSets');
    }

    set rootFeatureSets(value: {[index: string]: WorksheetFeatureSetState}) {
        this.set('rootFeatureSets', value);
    }

    static fromThryftJSON(json: any): WorksheetState {
        var out: WorksheetState = new WorksheetState;
        for (var fieldName in json) {
            if (fieldName == "root_feature_sets") {
                out.attributes.rootFeatureSets = function (json: any): {[index: string]: WorksheetFeatureSetState} { var map: any = {}; for (var key in json) { map[key] = WorksheetFeatureSetState.fromThryftJSON(json[key]); } return map; }(json[fieldName]);
            }
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        if (this.has("rootFeatureSets")) {
            json["root_feature_sets"] = function (value: {[index: string]: WorksheetFeatureSetState}): {[index: string]: WorksheetFeatureSetState} { var outObject: {[index: string]: WorksheetFeatureSetState} = {}; for (var key in value) { outObject[key] = value[key].toThryftJSON(); } return outObject; }(this.rootFeatureSets);
        }
        return json;
    }
}
