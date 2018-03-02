import { WorksheetFeatureSetState } from "./worksheet_feature_set_state";

export class WorksheetState {
    constructor(kwds: {id: string, featureSets?: {[index: string]: WorksheetFeatureSetState}}) {
        this._id = WorksheetState._validateId(kwds.id);
        if (kwds.featureSets != null) {
            this._featureSets = WorksheetState._validateFeatureSets(kwds.featureSets);
        } else {
            this._featureSets = undefined;
        }
    }

    get id(): string {
        return this._id;
    }

    set id(id: string) {
        this._id = WorksheetState._validateId(id);
    }

    get featureSets(): {[index: string]: WorksheetFeatureSetState} | undefined {
        return this._featureSets;
    }

    set featureSets(featureSets: {[index: string]: WorksheetFeatureSetState} | undefined) {
        this._featureSets = WorksheetState._validateFeatureSets(featureSets);
    }

    private static _validateFeatureSets(featureSets: {[index: string]: WorksheetFeatureSetState} | undefined): {[index: string]: WorksheetFeatureSetState} | undefined {
        if (featureSets != null) {

        }
        return featureSets;
    }

    private static _validateId(id: string): string {
        if (id == null) {
            throw new RangeError('id is null or undefined');
        }
        if (id.trim().length == 0) {
            throw new RangeError('id is blank');
        }
        if (id.length < 1) {
            throw new RangeError("expected len(id) to be >= 1, was " + id.length);
        }
        return id;
    }

    deepCopy(): WorksheetState {
        return new WorksheetState({ id: this.id, featureSets: (this.featureSets ? (function(__value0: {[index: string]: WorksheetFeatureSetState}) { let __copy0: {[index: string]: WorksheetFeatureSetState} = {}; for (var __key0 in __value0) { __copy0[__key0] = __value0[__key0].deepCopy(); } return __copy0; }(this.featureSets)) : undefined) });
    }

    equals(other: WorksheetState): boolean {
        if (!(this.id === other.id)) {
            return false;
        }

        if (!((!((typeof (this.featureSets)) === "undefined") && !((typeof (other.featureSets)) === "undefined")) ? (function(left: {[index: string]: WorksheetFeatureSetState}, right: {[index: string]: WorksheetFeatureSetState}): boolean { for (var leftKey in left) { var keyFound = false; for (var rightKey in right) { if (leftKey === rightKey) { if (!(left[leftKey].equals(right[rightKey]))) { return false; } keyFound = true; break; } } if (!keyFound) { return false; } } return true; }((this.featureSets as {[index: string]: WorksheetFeatureSetState}), (other.featureSets as {[index: string]: WorksheetFeatureSetState}))) : (((typeof (this.featureSets)) === "undefined") && ((typeof (other.featureSets)) === "undefined")))) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): WorksheetState {
        var id: string | undefined;
        var featureSets: {[index: string]: WorksheetFeatureSetState} | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = json[fieldName];
            } else if (fieldName == "feature_sets") {
                featureSets = function (json: any): {[index: string]: WorksheetFeatureSetState} { var map: any = {}; for (var key in json) { map[key] = WorksheetFeatureSetState.fromThryftJsonObject(json[key]); } return map; }(json[fieldName]);
            }
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        return new WorksheetState({id: id, featureSets: featureSets});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id;
        if (this.featureSets != null) {
            json["feature_sets"] = function (value: {[index: string]: WorksheetFeatureSetState}): {[index: string]: WorksheetFeatureSetState} { var outObject: {[index: string]: WorksheetFeatureSetState} = {}; for (var key in value) { outObject[key] = value[key].toJsonObject(); } return outObject; }(this.featureSets);
        }
        return json;
    }

    toString(): string {
        return "WorksheetState(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id;
        if (this.featureSets != null) {
            json["feature_sets"] = function (value: {[index: string]: WorksheetFeatureSetState}): {[index: string]: WorksheetFeatureSetState} { var outObject: {[index: string]: WorksheetFeatureSetState} = {}; for (var key in value) { outObject[key] = value[key].toThryftJsonObject(); } return outObject; }(this.featureSets);
        }
        return json;
    }

    private _featureSets?: {[index: string]: WorksheetFeatureSetState};

    private _id: string;
}
