import { WorksheetFeatureSetState } from "./worksheet_feature_set_state";

export class WorksheetState {
    constructor(kwds: {accessionNumber: string, featureSets?: {[index: string]: WorksheetFeatureSetState}}) {
        this.accessionNumber = kwds.accessionNumber;
        if (kwds.featureSets != null) {
            this.featureSets = kwds.featureSets;
        }
    }

    get accessionNumber(): string {
        return this._accessionNumber;
    }

    set accessionNumber(accessionNumber: string) {
        if (accessionNumber.trim().length == 0) {
            throw new RangeError('accessionNumber is blank');
        }
        if (accessionNumber.length < 1) {
            throw new RangeError("expected len(accessionNumber) to be >= 1, was " + accessionNumber.length);
        }
        this._accessionNumber = accessionNumber;
    }

    get featureSets(): {[index: string]: WorksheetFeatureSetState} | undefined {
        return this._featureSets;
    }

    set featureSets(featureSets: {[index: string]: WorksheetFeatureSetState} | undefined) {
        if (featureSets != null) {
            if (featureSets.length < 1) {
                throw new RangeError("expected len(featureSets) to be >= 1, was " + featureSets.length);
            }
        }
        this._featureSets = featureSets;
    }

    deepCopy(): WorksheetState {
        return new WorksheetState({ accessionNumber: this.accessionNumber, featureSets: (this.featureSets ? (function(__value0: {[index: string]: WorksheetFeatureSetState}) { let __copy0: {[index: string]: WorksheetFeatureSetState} = {}; for (var __key0 in __value0) { __copy0[__key0] = __value0[__key0].deepCopy(); } return __copy0; }(this.featureSets)) : undefined) });
    }

    equals(other: WorksheetState): boolean {
        if (!(this.accessionNumber === other.accessionNumber)) {
            return false;
        }

        if (!((!((typeof (this.featureSets)) === "undefined") && !((typeof (other.featureSets)) === "undefined")) ? (function(left: {[index: string]: WorksheetFeatureSetState}, right: {[index: string]: WorksheetFeatureSetState}): boolean { for (var leftKey in left) { var keyFound = false; for (var rightKey in right) { if (leftKey === rightKey) { if (!(left[leftKey].equals(right[rightKey]))) { return false; } keyFound = true; break; } } if (!keyFound) { return false; } } return true; }((this.featureSets as {[index: string]: WorksheetFeatureSetState}), (other.featureSets as {[index: string]: WorksheetFeatureSetState}))) : (((typeof (this.featureSets)) === "undefined") && ((typeof (other.featureSets)) === "undefined")))) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): WorksheetState {
        var accessionNumber: string | undefined;
        var featureSets: {[index: string]: WorksheetFeatureSetState} | undefined;
        for (var fieldName in json) {
            if (fieldName == "accession_number") {
                accessionNumber = json[fieldName];
            } else if (fieldName == "feature_sets") {
                featureSets = function (json: any): {[index: string]: WorksheetFeatureSetState} { var map: any = {}; for (var key in json) { map[key] = WorksheetFeatureSetState.fromThryftJsonObject(json[key]); } return map; }(json[fieldName]);
            }
        }
        if (accessionNumber == null) {
            throw new TypeError('accessionNumber is required');
        }
        return new WorksheetState({accessionNumber: accessionNumber, featureSets: featureSets});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["accession_number"] = this.accessionNumber;
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
        json["accession_number"] = this.accessionNumber;
        if (this.featureSets != null) {
            json["feature_sets"] = function (value: {[index: string]: WorksheetFeatureSetState}): {[index: string]: WorksheetFeatureSetState} { var outObject: {[index: string]: WorksheetFeatureSetState} = {}; for (var key in value) { outObject[key] = value[key].toThryftJsonObject(); } return outObject; }(this.featureSets);
        }
        return json;
    }

    private _accessionNumber: string = "";

    private _featureSets?: {[index: string]: WorksheetFeatureSetState} = undefined;
}
