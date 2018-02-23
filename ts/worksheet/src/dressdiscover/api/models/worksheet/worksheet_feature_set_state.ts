import { WorksheetFeatureState } from "./worksheet_feature_state";

export class WorksheetFeatureSetState {
    constructor(kwds?: {features?: {[index: string]: WorksheetFeatureState}}) {
        if (!kwds) {
            return;
        }
        if (kwds.features != null) {
            this.features = kwds.features;
        }
    }

    get features(): {[index: string]: WorksheetFeatureState} | undefined {
        return this._features;
    }

    set features(features: {[index: string]: WorksheetFeatureState} | undefined) {
        if (features != null) {
            if (features.length < 1) {
                throw new RangeError("expected len(features) to be >= 1, was " + features.length);
            }
        }
        this._features = features;
    }

    deepCopy(): WorksheetFeatureSetState {
        return new WorksheetFeatureSetState({ features: (this.features ? (function(__value0: {[index: string]: WorksheetFeatureState}) { let __copy0: {[index: string]: WorksheetFeatureState} = {}; for (var __key0 in __value0) { __copy0[__key0] = __value0[__key0].deepCopy(); } return __copy0; }(this.features)) : undefined) });
    }

    equals(other: WorksheetFeatureSetState): boolean {
        if (!((!((typeof (this.features)) === "undefined") && !((typeof (other.features)) === "undefined")) ? (function(left: {[index: string]: WorksheetFeatureState}, right: {[index: string]: WorksheetFeatureState}): boolean { for (var leftKey in left) { var keyFound = false; for (var rightKey in right) { if (leftKey === rightKey) { if (!(left[leftKey].equals(right[rightKey]))) { return false; } keyFound = true; break; } } if (!keyFound) { return false; } } return true; }((this.features as {[index: string]: WorksheetFeatureState}), (other.features as {[index: string]: WorksheetFeatureState}))) : (((typeof (this.features)) === "undefined") && ((typeof (other.features)) === "undefined")))) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): WorksheetFeatureSetState {
        var features: {[index: string]: WorksheetFeatureState} | undefined;
        for (var fieldName in json) {
            if (fieldName == "features") {
                features = function (json: any): {[index: string]: WorksheetFeatureState} { var map: any = {}; for (var key in json) { map[key] = WorksheetFeatureState.fromThryftJsonObject(json[key]); } return map; }(json[fieldName]);
            }
        }

        return new WorksheetFeatureSetState({features: features});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        if (this.features != null) {
            json["features"] = function (value: {[index: string]: WorksheetFeatureState}): {[index: string]: WorksheetFeatureState} { var outObject: {[index: string]: WorksheetFeatureState} = {}; for (var key in value) { outObject[key] = value[key].toJsonObject(); } return outObject; }(this.features);
        }
        return json;
    }

    toString(): string {
        return "WorksheetFeatureSetState(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        var json: {[index: string]: any} = {};
        if (this.features != null) {
            json["features"] = function (value: {[index: string]: WorksheetFeatureState}): {[index: string]: WorksheetFeatureState} { var outObject: {[index: string]: WorksheetFeatureState} = {}; for (var key in value) { outObject[key] = value[key].toThryftJsonObject(); } return outObject; }(this.features);
        }
        return json;
    }

    private _features?: {[index: string]: WorksheetFeatureState} = undefined;
}
