import { WorksheetFeatureSetId } from "./worksheet_feature_set_id";
import { WorksheetFeatureState } from "./worksheet_feature_state";

export class WorksheetFeatureSetState {
    constructor(kwds: {features: WorksheetFeatureState[], id: WorksheetFeatureSetId}) {
        this._features = WorksheetFeatureSetState._validateFeatures(kwds.features);
        this._id = WorksheetFeatureSetState._validateId(kwds.id);
    }

    get features(): WorksheetFeatureState[] {
        return this._features;
    }

    set features(features: WorksheetFeatureState[]) {
        this._features = WorksheetFeatureSetState._validateFeatures(features);
    }

    get id(): WorksheetFeatureSetId {
        return this._id;
    }

    set id(id: WorksheetFeatureSetId) {
        this._id = WorksheetFeatureSetState._validateId(id);
    }

    private static _validateFeatures(features: WorksheetFeatureState[]): WorksheetFeatureState[] {
        if (features == null) {
            throw new RangeError('features is null or undefined');
        }
        return features;
    }

    private static _validateId(id: WorksheetFeatureSetId): WorksheetFeatureSetId {
        if (id == null) {
            throw new RangeError('id is null or undefined');
        }
        return id;
    }

    deepCopy(): WorksheetFeatureSetState {
        return new WorksheetFeatureSetState({ features: function(__value0: WorksheetFeatureState[]) { let __copy0: WorksheetFeatureState[] = []; for (var __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0].deepCopy()); } return __copy0; }(this.features), id: this.id });
    }

    equals(other: WorksheetFeatureSetState): boolean {
        if (!(function(left: WorksheetFeatureState[], right: WorksheetFeatureState[]): boolean { if (left.length != right.length) { return false; } for (var elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; }(this.features, other.features))) {
            return false;
        }

        if (!(this.id === other.id)) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): WorksheetFeatureSetState {
        var features: WorksheetFeatureState[] | undefined;
        var id: WorksheetFeatureSetId | undefined;
        for (var fieldName in json) {
            if (fieldName == "features") {
                features = function(json: any[]): WorksheetFeatureState[] { var sequence: WorksheetFeatureState[] = []; for (var i = 0; i < json.length; i++) { sequence.push(WorksheetFeatureState.fromThryftJsonObject(json[i])); } return sequence; }(json[fieldName]);
            } else if (fieldName == "id") {
                id = WorksheetFeatureSetId.parse(json[fieldName]);
            }
        }
        if (features == null) {
            throw new TypeError('features is required');
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        return new WorksheetFeatureSetState({features: features, id: id});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["features"] = function (__inArray: WorksheetFeatureState[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toJsonObject()); } return __outArray; }(this.features);
        json["id"] = this.id.toString();
        return json;
    }

    toString(): string {
        return "WorksheetFeatureSetState(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["features"] = function (__inArray: WorksheetFeatureState[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJsonObject()); } return __outArray; }(this.features);
        json["id"] = this.id.toString();
        return json;
    }

    private _features: WorksheetFeatureState[];

    private _id: WorksheetFeatureSetId;
}
