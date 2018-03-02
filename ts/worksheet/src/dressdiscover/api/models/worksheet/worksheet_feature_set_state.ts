import { WorksheetFeatureSetId } from "./worksheet_feature_set_id";
import { WorksheetFeatureState } from "./worksheet_feature_state";

export class WorksheetFeatureSetState {
    constructor(kwds: {features: WorksheetFeatureState, id: WorksheetFeatureSetId}) {
        this._features = WorksheetFeatureSetState._validateFeatures(kwds.features);
        this._id = WorksheetFeatureSetState._validateId(kwds.id);
    }

    get features(): WorksheetFeatureState {
        return this._features;
    }

    set features(features: WorksheetFeatureState) {
        this._features = WorksheetFeatureSetState._validateFeatures(features);
    }

    get id(): WorksheetFeatureSetId {
        return this._id;
    }

    set id(id: WorksheetFeatureSetId) {
        this._id = WorksheetFeatureSetState._validateId(id);
    }

    private static _validateFeatures(features: WorksheetFeatureState): WorksheetFeatureState {
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
        return new WorksheetFeatureSetState({ features: this.features.deepCopy(), id: this.id });
    }

    equals(other: WorksheetFeatureSetState): boolean {
        if (!(this.features.equals(other.features))) {
            return false;
        }

        if (!(this.id === other.id)) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): WorksheetFeatureSetState {
        var features: WorksheetFeatureState | undefined;
        var id: WorksheetFeatureSetId | undefined;
        for (var fieldName in json) {
            if (fieldName == "features") {
                features = WorksheetFeatureState.fromThryftJsonObject(json[fieldName]);
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
        json["features"] = this.features.toJsonObject();
        json["id"] = this.id.toString();
        return json;
    }

    toString(): string {
        return "WorksheetFeatureSetState(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["features"] = this.features.toThryftJsonObject();
        json["id"] = this.id.toString();
        return json;
    }

    private _features: WorksheetFeatureState;

    private _id: WorksheetFeatureSetId;
}
