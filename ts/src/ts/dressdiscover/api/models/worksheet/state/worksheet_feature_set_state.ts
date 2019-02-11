import { WorksheetFeatureSetId } from "../worksheet_feature_set_id";
import { WorksheetFeatureState } from "./worksheet_feature_state";

export class WorksheetFeatureSetState {
    constructor(kwds: {features: WorksheetFeatureState[], id: WorksheetFeatureSetId}) {
        this.features = WorksheetFeatureSetState.validateFeatures(kwds.features);
        this.id = WorksheetFeatureSetState.validateId(kwds.id);
    }

    public deepCopy(): WorksheetFeatureSetState {
        return new WorksheetFeatureSetState({ features: (this.features).map((value0) => value0.deepCopy()), id: this.id });
    }

    public equals(other: WorksheetFeatureSetState): boolean {
        if (!(((left: WorksheetFeatureState[], right: WorksheetFeatureState[]): boolean => { if (left.length !== right.length) { return false; } for (let elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; })(this.features, other.features))) {
            return false;
        }

        if (!(this.id.equals(other.id))) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): WorksheetFeatureSetState {
        let features: WorksheetFeatureState[] | undefined;
        let id: WorksheetFeatureSetId | undefined;
        for (const fieldName in json) {
            if (fieldName === "features") {
                features = (json[fieldName]).map((element: any) => WorksheetFeatureState.fromThryftJsonObject(element));
            } else if (fieldName === "id") {
                id = WorksheetFeatureSetId.parse(json[fieldName]);
            }
        }
        if (features == null) {
            throw new TypeError("features is required");
        }
        if (id == null) {
            throw new TypeError("id is required");
        }
        return new WorksheetFeatureSetState({features, id});
    }

    public toJsonObject(): any {
        const json: {[index: string]: any} = {};
        json.features = (this.features).map((inElement) => inElement.toJsonObject());
        json.id = this.id.toString();
        return json;
    }

    public toString(): string {
        return "WorksheetFeatureSetState(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): any {
        const json: {[index: string]: any} = {};
        json.features = (this.features).map((inElement) => inElement.toThryftJsonObject());
        json.id = this.id.toString();
        return json;
    }

    private static validateFeatures(features: WorksheetFeatureState[]): WorksheetFeatureState[] {
        if (features == null) {
            throw new RangeError("features is null or undefined");
        }
        return features;
    }

    private static validateId(id: WorksheetFeatureSetId): WorksheetFeatureSetId {
        if (id == null) {
            throw new RangeError("id is null or undefined");
        }
        return id;
    }

    public readonly features: WorksheetFeatureState[];

    public readonly id: WorksheetFeatureSetId;
}
