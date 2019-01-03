import { WorksheetExtentDefinition } from "./worksheet_extent_definition";
import { WorksheetFeatureDefinition } from "./worksheet_feature_definition";
import { WorksheetFeatureSetDefinition } from "./worksheet_feature_set_definition";
import { WorksheetFeatureValueDefinition } from "./worksheet_feature_value_definition";

export class WorksheetDefinition {
    constructor(kwds: {featureSets: WorksheetFeatureSetDefinition[], featureValues: WorksheetFeatureValueDefinition[], features: WorksheetFeatureDefinition[], extents?: WorksheetExtentDefinition[]}) {
        this._featureSets = WorksheetDefinition._validateFeatureSets(kwds.featureSets);
        this._featureValues = WorksheetDefinition._validateFeatureValues(kwds.featureValues);
        this._features = WorksheetDefinition._validateFeatures(kwds.features);
        if (kwds.extents != null) {
            this._extents = WorksheetDefinition._validateExtents(kwds.extents);
        } else {
            this._extents = undefined;
        }
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

    get extents(): WorksheetExtentDefinition[] | undefined {
        return this._extents;
    }

    set extents(extents: WorksheetExtentDefinition[] | undefined) {
        this._extents = WorksheetDefinition._validateExtents(extents);
    }

    private static _validateExtents(extents: WorksheetExtentDefinition[] | undefined): WorksheetExtentDefinition[] | undefined {
        if (extents != null) {
            if (extents.length < 1) {
                throw new RangeError("expected len(extents) to be >= 1, was " + extents.length);
            }
        }
        return extents;
    }

    private static _validateFeatureSets(featureSets: WorksheetFeatureSetDefinition[]): WorksheetFeatureSetDefinition[] {
        if (featureSets == null) {
            throw new RangeError('featureSets is null or undefined');
        }
        if (featureSets.length < 1) {
            throw new RangeError("expected len(featureSets) to be >= 1, was " + featureSets.length);
        }
        return featureSets;
    }

    private static _validateFeatureValues(featureValues: WorksheetFeatureValueDefinition[]): WorksheetFeatureValueDefinition[] {
        if (featureValues == null) {
            throw new RangeError('featureValues is null or undefined');
        }
        if (featureValues.length < 1) {
            throw new RangeError("expected len(featureValues) to be >= 1, was " + featureValues.length);
        }
        return featureValues;
    }

    private static _validateFeatures(features: WorksheetFeatureDefinition[]): WorksheetFeatureDefinition[] {
        if (features == null) {
            throw new RangeError('features is null or undefined');
        }
        if (features.length < 1) {
            throw new RangeError("expected len(features) to be >= 1, was " + features.length);
        }
        return features;
    }

    deepCopy(): WorksheetDefinition {
        return new WorksheetDefinition({ featureSets: function(__value0: WorksheetFeatureSetDefinition[]) { let __copy0: WorksheetFeatureSetDefinition[] = []; for (let __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0].deepCopy()); } return __copy0; }(this.featureSets), featureValues: function(__value0: WorksheetFeatureValueDefinition[]) { let __copy0: WorksheetFeatureValueDefinition[] = []; for (let __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0].deepCopy()); } return __copy0; }(this.featureValues), features: function(__value0: WorksheetFeatureDefinition[]) { let __copy0: WorksheetFeatureDefinition[] = []; for (let __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0].deepCopy()); } return __copy0; }(this.features), extents: (this.extents ? (function(__value0: WorksheetExtentDefinition[]) { let __copy0: WorksheetExtentDefinition[] = []; for (let __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0].deepCopy()); } return __copy0; }(this.extents)) : undefined) });
    }

    equals(other: WorksheetDefinition): boolean {
        if (!(function(left: WorksheetFeatureSetDefinition[], right: WorksheetFeatureSetDefinition[]): boolean { if (left.length != right.length) { return false; } for (let elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; }(this.featureSets, other.featureSets))) {
            return false;
        }

        if (!(function(left: WorksheetFeatureValueDefinition[], right: WorksheetFeatureValueDefinition[]): boolean { if (left.length != right.length) { return false; } for (let elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; }(this.featureValues, other.featureValues))) {
            return false;
        }

        if (!(function(left: WorksheetFeatureDefinition[], right: WorksheetFeatureDefinition[]): boolean { if (left.length != right.length) { return false; } for (let elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; }(this.features, other.features))) {
            return false;
        }

        if (!((!((typeof (this.extents)) === "undefined") && !((typeof (other.extents)) === "undefined")) ? (function(left: WorksheetExtentDefinition[], right: WorksheetExtentDefinition[]): boolean { if (left.length != right.length) { return false; } for (let elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; }((this.extents as WorksheetExtentDefinition[]), (other.extents as WorksheetExtentDefinition[]))) : (((typeof (this.extents)) === "undefined") && ((typeof (other.extents)) === "undefined")))) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): WorksheetDefinition {
        let featureSets: WorksheetFeatureSetDefinition[] | undefined;
        let featureValues: WorksheetFeatureValueDefinition[] | undefined;
        let features: WorksheetFeatureDefinition[] | undefined;
        let extents: WorksheetExtentDefinition[] | undefined;
        for (let fieldName in json) {
            if (fieldName == "feature_sets") {
                featureSets = function(json: any[]): WorksheetFeatureSetDefinition[] { let sequence: WorksheetFeatureSetDefinition[] = []; for (let i = 0; i < json.length; i++) { sequence.push(WorksheetFeatureSetDefinition.fromThryftJsonObject(json[i])); } return sequence; }(json[fieldName]);
            } else if (fieldName == "feature_values") {
                featureValues = function(json: any[]): WorksheetFeatureValueDefinition[] { let sequence: WorksheetFeatureValueDefinition[] = []; for (let i = 0; i < json.length; i++) { sequence.push(WorksheetFeatureValueDefinition.fromThryftJsonObject(json[i])); } return sequence; }(json[fieldName]);
            } else if (fieldName == "features") {
                features = function(json: any[]): WorksheetFeatureDefinition[] { let sequence: WorksheetFeatureDefinition[] = []; for (let i = 0; i < json.length; i++) { sequence.push(WorksheetFeatureDefinition.fromThryftJsonObject(json[i])); } return sequence; }(json[fieldName]);
            } else if (fieldName == "extents") {
                extents = function(json: any[]): WorksheetExtentDefinition[] { let sequence: WorksheetExtentDefinition[] = []; for (let i = 0; i < json.length; i++) { sequence.push(WorksheetExtentDefinition.fromThryftJsonObject(json[i])); } return sequence; }(json[fieldName]);
            }
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
        return new WorksheetDefinition({featureSets: featureSets, featureValues: featureValues, features: features, extents: extents});
    }

    toJsonObject(): any {
        const json: {[index: string]: any} = {};
        json["feature_sets"] = function (__inArray: WorksheetFeatureSetDefinition[]): any[] { let __outArray: any[] = []; for (let __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toJsonObject()); } return __outArray; }(this.featureSets);
        json["feature_values"] = function (__inArray: WorksheetFeatureValueDefinition[]): any[] { let __outArray: any[] = []; for (let __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toJsonObject()); } return __outArray; }(this.featureValues);
        json["features"] = function (__inArray: WorksheetFeatureDefinition[]): any[] { let __outArray: any[] = []; for (let __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toJsonObject()); } return __outArray; }(this.features);
        if (this.extents != null) {
            json["extents"] = function (__inArray: WorksheetExtentDefinition[]): any[] { let __outArray: any[] = []; for (let __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toJsonObject()); } return __outArray; }(this.extents);
        }
        return json;
    }

    toString(): string {
        return "WorksheetDefinition(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        const json: {[index: string]: any} = {};
        json["feature_sets"] = function (__inArray: WorksheetFeatureSetDefinition[]): any[] { let __outArray: any[] = []; for (let __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJsonObject()); } return __outArray; }(this.featureSets);
        json["feature_values"] = function (__inArray: WorksheetFeatureValueDefinition[]): any[] { let __outArray: any[] = []; for (let __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJsonObject()); } return __outArray; }(this.featureValues);
        json["features"] = function (__inArray: WorksheetFeatureDefinition[]): any[] { let __outArray: any[] = []; for (let __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJsonObject()); } return __outArray; }(this.features);
        if (this.extents != null) {
            json["extents"] = function (__inArray: WorksheetExtentDefinition[]): any[] { let __outArray: any[] = []; for (let __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJsonObject()); } return __outArray; }(this.extents);
        }
        return json;
    }

    private _extents?: WorksheetExtentDefinition[];

    private _featureSets: WorksheetFeatureSetDefinition[];

    private _featureValues: WorksheetFeatureValueDefinition[];

    private _features: WorksheetFeatureDefinition[];
}
