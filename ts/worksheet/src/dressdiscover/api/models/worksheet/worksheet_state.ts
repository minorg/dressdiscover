import { WorksheetFeatureSetState } from "./worksheet_feature_set_state";
import { WorksheetStateId } from "./worksheet_state_id";

export class WorksheetState {
    constructor(kwds: {featureSets: WorksheetFeatureSetState[], id: WorksheetStateId}) {
        this._featureSets = WorksheetState._validateFeatureSets(kwds.featureSets);
        this._id = WorksheetState._validateId(kwds.id);
    }

    get featureSets(): WorksheetFeatureSetState[] {
        return this._featureSets;
    }

    set featureSets(featureSets: WorksheetFeatureSetState[]) {
        this._featureSets = WorksheetState._validateFeatureSets(featureSets);
    }

    get id(): WorksheetStateId {
        return this._id;
    }

    set id(id: WorksheetStateId) {
        this._id = WorksheetState._validateId(id);
    }

    private static _validateFeatureSets(featureSets: WorksheetFeatureSetState[]): WorksheetFeatureSetState[] {
        if (featureSets == null) {
            throw new RangeError('featureSets is null or undefined');
        }
        return featureSets;
    }

    private static _validateId(id: WorksheetStateId): WorksheetStateId {
        if (id == null) {
            throw new RangeError('id is null or undefined');
        }
        return id;
    }

    deepCopy(): WorksheetState {
        return new WorksheetState({ featureSets: function(__value0: WorksheetFeatureSetState[]) { let __copy0: WorksheetFeatureSetState[] = []; for (var __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0].deepCopy()); } return __copy0; }(this.featureSets), id: this.id });
    }

    equals(other: WorksheetState): boolean {
        if (!(function(left: WorksheetFeatureSetState[], right: WorksheetFeatureSetState[]): boolean { if (left.length != right.length) { return false; } for (var elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; }(this.featureSets, other.featureSets))) {
            return false;
        }

        if (!(this.id.equals(other.id))) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): WorksheetState {
        var featureSets: WorksheetFeatureSetState[] | undefined;
        var id: WorksheetStateId | undefined;
        for (var fieldName in json) {
            if (fieldName == "feature_sets") {
                featureSets = function(json: any[]): WorksheetFeatureSetState[] { var sequence: WorksheetFeatureSetState[] = []; for (var i = 0; i < json.length; i++) { sequence.push(WorksheetFeatureSetState.fromThryftJsonObject(json[i])); } return sequence; }(json[fieldName]);
            } else if (fieldName == "id") {
                id = WorksheetStateId.parse(json[fieldName]);
            }
        }
        if (featureSets == null) {
            throw new TypeError('featureSets is required');
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        return new WorksheetState({featureSets: featureSets, id: id});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["feature_sets"] = function (__inArray: WorksheetFeatureSetState[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toJsonObject()); } return __outArray; }(this.featureSets);
        json["id"] = this.id.toString();
        return json;
    }

    toString(): string {
        return "WorksheetState(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["feature_sets"] = function (__inArray: WorksheetFeatureSetState[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJsonObject()); } return __outArray; }(this.featureSets);
        json["id"] = this.id.toString();
        return json;
    }

    private _featureSets: WorksheetFeatureSetState[];

    private _id: WorksheetStateId;
}
