import { WorksheetFeatureDefinition } from "./worksheet_feature_definition";
import { WorksheetFeatureSetDefinition } from "./worksheet_feature_set_definition";

export class WorksheetDefinition {
    constructor(kwds: {featureSets: WorksheetFeatureSetDefinition[], features: WorksheetFeatureDefinition[]}) {
        this._featureSets = WorksheetDefinition._validateFeatureSets(kwds.featureSets);
        this._features = WorksheetDefinition._validateFeatures(kwds.features);
    }

    get featureSets(): WorksheetFeatureSetDefinition[] {
        return this._featureSets;
    }

    set featureSets(featureSets: WorksheetFeatureSetDefinition[]) {
        this._featureSets = WorksheetDefinition._validateFeatureSets(featureSets);
    }

    get features(): WorksheetFeatureDefinition[] {
        return this._features;
    }

    set features(features: WorksheetFeatureDefinition[]) {
        this._features = WorksheetDefinition._validateFeatures(features);
    }

    private static _validateFeatureSets(featureSets: WorksheetFeatureSetDefinition[]): WorksheetFeatureSetDefinition[] {
        return featureSets;
    }

    private static _validateFeatures(features: WorksheetFeatureDefinition[]): WorksheetFeatureDefinition[] {
        return features;
    }

    deepCopy(): WorksheetDefinition {
        return new WorksheetDefinition({ featureSets: function(__value0: WorksheetFeatureSetDefinition[]) { let __copy0: WorksheetFeatureSetDefinition[] = []; for (var __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0].deepCopy()); } return __copy0; }(this.featureSets), features: function(__value0: WorksheetFeatureDefinition[]) { let __copy0: WorksheetFeatureDefinition[] = []; for (var __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0].deepCopy()); } return __copy0; }(this.features) });
    }

    equals(other: WorksheetDefinition): boolean {
        if (!(function(left: WorksheetFeatureSetDefinition[], right: WorksheetFeatureSetDefinition[]): boolean { if (left.length != right.length) { return false; } for (var elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; }(this.featureSets, other.featureSets))) {
            return false;
        }

        if (!(function(left: WorksheetFeatureDefinition[], right: WorksheetFeatureDefinition[]): boolean { if (left.length != right.length) { return false; } for (var elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; }(this.features, other.features))) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): WorksheetDefinition {
        var featureSets: WorksheetFeatureSetDefinition[] | undefined;
        var features: WorksheetFeatureDefinition[] | undefined;
        for (var fieldName in json) {
            if (fieldName == "feature_sets") {
                featureSets = function(json: any[]): WorksheetFeatureSetDefinition[] { var sequence: WorksheetFeatureSetDefinition[] = []; for (var i = 0; i < json.length; i++) { sequence.push(WorksheetFeatureSetDefinition.fromThryftJsonObject(json[i])); } return sequence; }(json[fieldName]);
            } else if (fieldName == "features") {
                features = function(json: any[]): WorksheetFeatureDefinition[] { var sequence: WorksheetFeatureDefinition[] = []; for (var i = 0; i < json.length; i++) { sequence.push(WorksheetFeatureDefinition.fromThryftJsonObject(json[i])); } return sequence; }(json[fieldName]);
            }
        }
        if (featureSets == null) {
            throw new TypeError('featureSets is required');
        }
        if (features == null) {
            throw new TypeError('features is required');
        }
        return new WorksheetDefinition({featureSets: featureSets, features: features});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["feature_sets"] = function (__inArray: WorksheetFeatureSetDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toJsonObject()); } return __outArray; }(this.featureSets);
        json["features"] = function (__inArray: WorksheetFeatureDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toJsonObject()); } return __outArray; }(this.features);
        return json;
    }

    toString(): string {
        return "WorksheetDefinition(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["feature_sets"] = function (__inArray: WorksheetFeatureSetDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJsonObject()); } return __outArray; }(this.featureSets);
        json["features"] = function (__inArray: WorksheetFeatureDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJsonObject()); } return __outArray; }(this.features);
        return json;
    }

    private _featureSets: WorksheetFeatureSetDefinition[];

    private _features: WorksheetFeatureDefinition[];
}
