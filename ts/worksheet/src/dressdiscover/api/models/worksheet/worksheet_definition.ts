import { WorksheetExtentDefinition } from "./worksheet_extent_definition";
import { WorksheetFeatureDefinition } from "./worksheet_feature_definition";
import { WorksheetFeatureSetDefinition } from "./worksheet_feature_set_definition";
import { WorksheetFeatureValueDefinition } from "./worksheet_feature_value_definition";

export class WorksheetDefinition {
    constructor(kwds: {extents: WorksheetExtentDefinition[], featureSets: WorksheetFeatureSetDefinition[], featureValues: WorksheetFeatureValueDefinition[], features: WorksheetFeatureDefinition[]}) {
        this._extents = WorksheetDefinition._validateExtents(kwds.extents);
        this._featureSets = WorksheetDefinition._validateFeatureSets(kwds.featureSets);
        this._featureValues = WorksheetDefinition._validateFeatureValues(kwds.featureValues);
        this._features = WorksheetDefinition._validateFeatures(kwds.features);
    }

    get extents(): WorksheetExtentDefinition[] {
        return this._extents;
    }

    set extents(extents: WorksheetExtentDefinition[]) {
        this._extents = WorksheetDefinition._validateExtents(extents);
    }

    get featureSets(): WorksheetFeatureSetDefinition[] {
        return this._featureSets;
    }

    set featureSets(featureSets: WorksheetFeatureSetDefinition[]) {
        this._featureSets = WorksheetDefinition._validateFeatureSets(featureSets);
    }

    get featureValues(): WorksheetFeatureValueDefinition[] {
        return this._featureValues;
    }

    set featureValues(featureValues: WorksheetFeatureValueDefinition[]) {
        this._featureValues = WorksheetDefinition._validateFeatureValues(featureValues);
    }

    get features(): WorksheetFeatureDefinition[] {
        return this._features;
    }

    set features(features: WorksheetFeatureDefinition[]) {
        this._features = WorksheetDefinition._validateFeatures(features);
    }

    private static _validateExtents(extents: WorksheetExtentDefinition[]): WorksheetExtentDefinition[] {
        return extents;
    }

    private static _validateFeatureSets(featureSets: WorksheetFeatureSetDefinition[]): WorksheetFeatureSetDefinition[] {
        return featureSets;
    }

    private static _validateFeatureValues(featureValues: WorksheetFeatureValueDefinition[]): WorksheetFeatureValueDefinition[] {
        return featureValues;
    }

    private static _validateFeatures(features: WorksheetFeatureDefinition[]): WorksheetFeatureDefinition[] {
        return features;
    }

    deepCopy(): WorksheetDefinition {
        return new WorksheetDefinition({ extents: function(__value0: WorksheetExtentDefinition[]) { let __copy0: WorksheetExtentDefinition[] = []; for (var __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0].deepCopy()); } return __copy0; }(this.extents), featureSets: function(__value0: WorksheetFeatureSetDefinition[]) { let __copy0: WorksheetFeatureSetDefinition[] = []; for (var __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0].deepCopy()); } return __copy0; }(this.featureSets), featureValues: function(__value0: WorksheetFeatureValueDefinition[]) { let __copy0: WorksheetFeatureValueDefinition[] = []; for (var __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0].deepCopy()); } return __copy0; }(this.featureValues), features: function(__value0: WorksheetFeatureDefinition[]) { let __copy0: WorksheetFeatureDefinition[] = []; for (var __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0].deepCopy()); } return __copy0; }(this.features) });
    }

    equals(other: WorksheetDefinition): boolean {
        if (!(function(left: WorksheetExtentDefinition[], right: WorksheetExtentDefinition[]): boolean { if (left.length != right.length) { return false; } for (var elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; }(this.extents, other.extents))) {
            return false;
        }

        if (!(function(left: WorksheetFeatureSetDefinition[], right: WorksheetFeatureSetDefinition[]): boolean { if (left.length != right.length) { return false; } for (var elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; }(this.featureSets, other.featureSets))) {
            return false;
        }

        if (!(function(left: WorksheetFeatureValueDefinition[], right: WorksheetFeatureValueDefinition[]): boolean { if (left.length != right.length) { return false; } for (var elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; }(this.featureValues, other.featureValues))) {
            return false;
        }

        if (!(function(left: WorksheetFeatureDefinition[], right: WorksheetFeatureDefinition[]): boolean { if (left.length != right.length) { return false; } for (var elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; }(this.features, other.features))) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): WorksheetDefinition {
        var extents: WorksheetExtentDefinition[] | undefined;
        var featureSets: WorksheetFeatureSetDefinition[] | undefined;
        var featureValues: WorksheetFeatureValueDefinition[] | undefined;
        var features: WorksheetFeatureDefinition[] | undefined;
        for (var fieldName in json) {
            if (fieldName == "extents") {
                extents = function(json: any[]): WorksheetExtentDefinition[] { var sequence: WorksheetExtentDefinition[] = []; for (var i = 0; i < json.length; i++) { sequence.push(WorksheetExtentDefinition.fromThryftJsonObject(json[i])); } return sequence; }(json[fieldName]);
            } else if (fieldName == "feature_sets") {
                featureSets = function(json: any[]): WorksheetFeatureSetDefinition[] { var sequence: WorksheetFeatureSetDefinition[] = []; for (var i = 0; i < json.length; i++) { sequence.push(WorksheetFeatureSetDefinition.fromThryftJsonObject(json[i])); } return sequence; }(json[fieldName]);
            } else if (fieldName == "feature_values") {
                featureValues = function(json: any[]): WorksheetFeatureValueDefinition[] { var sequence: WorksheetFeatureValueDefinition[] = []; for (var i = 0; i < json.length; i++) { sequence.push(WorksheetFeatureValueDefinition.fromThryftJsonObject(json[i])); } return sequence; }(json[fieldName]);
            } else if (fieldName == "features") {
                features = function(json: any[]): WorksheetFeatureDefinition[] { var sequence: WorksheetFeatureDefinition[] = []; for (var i = 0; i < json.length; i++) { sequence.push(WorksheetFeatureDefinition.fromThryftJsonObject(json[i])); } return sequence; }(json[fieldName]);
            }
        }
        if (extents == null) {
            throw new TypeError('extents is required');
        }
        if (featureSets == null) {
            throw new TypeError('featureSets is required');
        }
        if (featureValues == null) {
            throw new TypeError('featureValues is required');
        }
        if (features == null) {
            throw new TypeError('features is required');
        }
        return new WorksheetDefinition({extents: extents, featureSets: featureSets, featureValues: featureValues, features: features});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["extents"] = function (__inArray: WorksheetExtentDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toJsonObject()); } return __outArray; }(this.extents);
        json["feature_sets"] = function (__inArray: WorksheetFeatureSetDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toJsonObject()); } return __outArray; }(this.featureSets);
        json["feature_values"] = function (__inArray: WorksheetFeatureValueDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toJsonObject()); } return __outArray; }(this.featureValues);
        json["features"] = function (__inArray: WorksheetFeatureDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toJsonObject()); } return __outArray; }(this.features);
        return json;
    }

    toString(): string {
        return "WorksheetDefinition(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["extents"] = function (__inArray: WorksheetExtentDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJsonObject()); } return __outArray; }(this.extents);
        json["feature_sets"] = function (__inArray: WorksheetFeatureSetDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJsonObject()); } return __outArray; }(this.featureSets);
        json["feature_values"] = function (__inArray: WorksheetFeatureValueDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJsonObject()); } return __outArray; }(this.featureValues);
        json["features"] = function (__inArray: WorksheetFeatureDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJsonObject()); } return __outArray; }(this.features);
        return json;
    }

    private _extents: WorksheetExtentDefinition[];

    private _featureSets: WorksheetFeatureSetDefinition[];

    private _featureValues: WorksheetFeatureValueDefinition[];

    private _features: WorksheetFeatureDefinition[];
}
