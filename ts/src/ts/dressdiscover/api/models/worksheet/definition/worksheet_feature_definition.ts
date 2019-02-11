import { WorksheetDescription } from "./worksheet_description";
import { WorksheetFeatureId } from "../worksheet_feature_id";
import { WorksheetFeatureValueId } from "../worksheet_feature_value_id";

export class WorksheetFeatureDefinition {
    constructor(kwds: {id: WorksheetFeatureId, valueIds: WorksheetFeatureValueId[], description?: WorksheetDescription, displayName?: string}) {
        this.idPrivate = WorksheetFeatureDefinition.validateId(kwds.id);
        this.valueIdsPrivate = WorksheetFeatureDefinition.validateValueIds(kwds.valueIds);
        if (kwds.description != null) {
            this.descriptionPrivate = WorksheetFeatureDefinition.validateDescription(kwds.description);
        } else {
            this.descriptionPrivate = undefined;
        }
        if (kwds.displayName != null) {
            this.displayNamePrivate = WorksheetFeatureDefinition.validateDisplayName(kwds.displayName);
        } else {
            this.displayNamePrivate = undefined;
        }
    }

    public deepCopy(): WorksheetFeatureDefinition {
        return new WorksheetFeatureDefinition({ id: this.id, valueIds: (this.valueIds).map((value0) => value0), description: (this.description ? (this.description.deepCopy()) : undefined), displayName: this.displayName });
    }

    public equals(other: WorksheetFeatureDefinition): boolean {
        if (!(this.id.equals(other.id))) {
            return false;
        }

        if (!(((left: WorksheetFeatureValueId[], right: WorksheetFeatureValueId[]): boolean => { if (left.length !== right.length) { return false; } for (let elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; })(this.valueIds, other.valueIds))) {
            return false;
        }

        if (!((!((typeof (this.description)) === "undefined") && !((typeof (other.description)) === "undefined")) ? ((this.description as WorksheetDescription).equals((other.description as WorksheetDescription))) : (((typeof (this.description)) === "undefined") && ((typeof (other.description)) === "undefined")))) {
            return false;
        }

        if (!((!((typeof (this.displayName)) === "undefined") && !((typeof (other.displayName)) === "undefined")) ? ((this.displayName as string) === (other.displayName as string)) : (((typeof (this.displayName)) === "undefined") && ((typeof (other.displayName)) === "undefined")))) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): WorksheetFeatureDefinition {
        let id: WorksheetFeatureId | undefined;
        let valueIds: WorksheetFeatureValueId[] | undefined;
        let description: WorksheetDescription | undefined;
        let displayName: string | undefined;
        for (const fieldName in json) {
            if (fieldName === "id") {
                id = WorksheetFeatureId.parse(json[fieldName]);
            } else if (fieldName === "value_ids") {
                valueIds = (json[fieldName]).map((element: any) => WorksheetFeatureValueId.parse(element));
            } else if (fieldName === "description") {
                description = WorksheetDescription.fromThryftJsonObject(json[fieldName]);
            } else if (fieldName === "display_name") {
                displayName = json[fieldName];
            }
        }
        if (id == null) {
            throw new TypeError("id is required");
        }
        if (valueIds == null) {
            throw new TypeError("valueIds is required");
        }
        return new WorksheetFeatureDefinition({id, valueIds, description, displayName});
    }

    public toJsonObject(): any {
        const json: {[index: string]: any} = {};
        json.id = this.id.toString();
        json.value_ids = (this.valueIds).map((inElement) => inElement.toString());
        if (this.description != null) {
            json.description = this.description.toJsonObject();
        }
        if (this.displayName != null) {
            json.display_name = this.displayName;
        }
        return json;
    }

    public toString(): string {
        return "WorksheetFeatureDefinition(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): any {
        const json: {[index: string]: any} = {};
        json.id = this.id.toString();
        json.value_ids = (this.valueIds).map((inElement) => inElement.toString());
        if (this.description != null) {
            json.description = this.description.toThryftJsonObject();
        }
        if (this.displayName != null) {
            json.display_name = this.displayName;
        }
        return json;
    }

    private static validateDescription(description: WorksheetDescription | undefined): WorksheetDescription | undefined {
        return description;
    }

    private static validateDisplayName(displayName: string | undefined): string | undefined {
        if (displayName != null) {
            if (displayName.trim().length === 0) {
                throw new RangeError("displayName is blank");
            }
            if (displayName.length < 1) {
                throw new RangeError("expected len(displayName) to be >= 1, was " + displayName.length);
            }
        }
        return displayName;
    }

    private static validateId(id: WorksheetFeatureId): WorksheetFeatureId {
        if (id == null) {
            throw new RangeError("id is null or undefined");
        }
        return id;
    }

    private static validateValueIds(valueIds: WorksheetFeatureValueId[]): WorksheetFeatureValueId[] {
        if (valueIds == null) {
            throw new RangeError("valueIds is null or undefined");
        }
        if (valueIds.length < 1) {
            throw new RangeError("expected len(valueIds) to be >= 1, was " + valueIds.length);
        }
        return valueIds;
    }

    public readonly description?: WorksheetDescription;

    public readonly displayName?: string;

    public readonly id: WorksheetFeatureId;

    public readonly valueIds: WorksheetFeatureValueId[];
}
