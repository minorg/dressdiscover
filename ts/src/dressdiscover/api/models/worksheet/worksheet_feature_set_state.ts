import * as Backbone from "backbone";
import { WorksheetFeatureState } from "./worksheet_feature_state";

export class WorksheetFeatureSetState extends Backbone.Model {
    constructor(attributes?: {childFeatureSets?: {[index: string]: WorksheetFeatureSetState}, features?: {[index: string]: WorksheetFeatureState}}) {
        if (!attributes) {
            attributes = {};
        }
        attributes["validation"] = {
            child_feature_sets: {
                "fn": function(value, attr, computedState) {
                    if (typeof attr !== "undefined" && attr !== "null") {
                        if (typeof value !== "object") {
                            return "expected dressdiscover.api.models.worksheet.WorksheetFeatureSetState.child_feature_sets to be an object";
                        }
                        for (var __key in value) {
                            var __value = value[__key];
                            if (typeof __key !== "string") {
                                return "expected dressdiscover.api.models.worksheet.WorksheetFeatureSetState.child_feature_sets key to be a string";
                            }
                            if (!(__value instanceof dressdiscover.api.models.worksheet.WorksheetFeatureSetState)) {
                                return "expected dressdiscover.api.models.worksheet.WorksheetFeatureSetState.child_feature_sets value to be a dressdiscover.api.models.worksheet.WorksheetFeatureSetState";
                            }
                            if (!__value.isValid(true)) {
                                return __value.validationError;
                            }
                        }
                    }
                },
                "minLength": 1, "required": false
            },

            features: {
                "fn": function(value, attr, computedState) {
                    if (typeof attr !== "undefined" && attr !== "null") {
                        if (typeof value !== "object") {
                            return "expected dressdiscover.api.models.worksheet.WorksheetFeatureSetState.features to be an object";
                        }
                        for (var __key in value) {
                            var __value = value[__key];
                            if (typeof __key !== "string") {
                                return "expected dressdiscover.api.models.worksheet.WorksheetFeatureSetState.features key to be a string";
                            }
                            if (!(__value instanceof dressdiscover.api.models.worksheet.WorksheetFeatureState)) {
                                return "expected dressdiscover.api.models.worksheet.WorksheetFeatureSetState.features value to be a dressdiscover.api.models.worksheet.WorksheetFeatureState";
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

    get childFeatureSets(): {[index: string]: WorksheetFeatureSetState} {
        return this.get('childFeatureSets');
    }

    set childFeatureSets(value: {[index: string]: WorksheetFeatureSetState}) {
        this.set('childFeatureSets', value);
    }

    get features(): {[index: string]: WorksheetFeatureState} {
        return this.get('features');
    }

    set features(value: {[index: string]: WorksheetFeatureState}) {
        this.set('features', value);
    }

    static fromThryftJSON(json: any): WorksheetFeatureSetState {
        var out: WorksheetFeatureSetState = new WorksheetFeatureSetState;
        for (var fieldName in json) {
            if (fieldName == "child_feature_sets") {
                out.attributes.childFeatureSets = function (json: any): {[index: string]: WorksheetFeatureSetState} { var map: any = {}; for (var key in json) { map[key] = WorksheetFeatureSetState.fromThryftJSON(json[key]); } return map; }(json[fieldName]);
            } else if (fieldName == "features") {
                out.attributes.features = function (json: any): {[index: string]: WorksheetFeatureState} { var map: any = {}; for (var key in json) { map[key] = WorksheetFeatureState.fromThryftJSON(json[key]); } return map; }(json[fieldName]);
            }
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        if (this.has("childFeatureSets")) {
            json["child_feature_sets"] = function (value: {[index: string]: WorksheetFeatureSetState}): {[index: string]: WorksheetFeatureSetState} { var outObject: {[index: string]: WorksheetFeatureSetState} = {}; for (var key in value) { outObject[key] = value[key].toThryftJSON(); } return outObject; }(this.childFeatureSets);
        }
        if (this.has("features")) {
            json["features"] = function (value: {[index: string]: WorksheetFeatureState}): {[index: string]: WorksheetFeatureState} { var outObject: {[index: string]: WorksheetFeatureState} = {}; for (var key in value) { outObject[key] = value[key].toThryftJSON(); } return outObject; }(this.features);
        }
        return json;
    }
}
