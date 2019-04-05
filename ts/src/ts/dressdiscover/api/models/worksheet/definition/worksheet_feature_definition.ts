import { WorksheetDescription } from "./worksheet_description";
import { WorksheetFeatureId } from "../worksheet_feature_id";
import { WorksheetFeatureValueId } from "../worksheet_feature_value_id";

export class WorksheetFeatureDefinition {
    constructor(kwds: {displayNameEn: string, id: WorksheetFeatureId, valueIds: WorksheetFeatureValueId[], description?: WorksheetDescription}) {
        this.displayNameEn = WorksheetFeatureDefinition.validateDisplayNameEn(kwds.displayNameEn);
        this.id = WorksheetFeatureDefinition.validateId(kwds.id);
        this.valueIds = WorksheetFeatureDefinition.validateValueIds(kwds.valueIds);
        if (kwds.description != null) {
            this.description = WorksheetFeatureDefinition.validateDescription(kwds.description);
        } else {
            this.description = undefined;
        }
    }

    public deepCopy(): WorksheetFeatureDefinition {
        return new WorksheetFeatureDefinition({ displayNameEn: this.displayNameEn, id: this.id, valueIds: (this.valueIds).map((value0) => value0), description: (this.description ? (this.description.deepCopy()) : undefined) });
    }

    public equals(other: WorksheetFeatureDefinition): boolean {
        if (!(this.displayNameEn === other.displayNameEn)) {
            return false;
        }

        if (!(this.id.equals(other.id))) {
            return false;
        }

        if (!(((left: WorksheetFeatureValueId[], right: WorksheetFeatureValueId[]): boolean => { if (left.length !== right.length) { return false; } for (let elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; })(this.valueIds, other.valueIds))) {
            return false;
        }

        if (!((!((typeof (this.description)) === "undefined") && !((typeof (other.description)) === "undefined")) ? ((this.description as WorksheetDescription).equals((other.description as WorksheetDescription))) : (((typeof (this.description)) === "undefined") && ((typeof (other.description)) === "undefined")))) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): WorksheetFeatureDefinition {
        let displayNameEn: string | undefined;
        let id: WorksheetFeatureId | undefined;
        let valueIds: WorksheetFeatureValueId[] | undefined;
        let description: WorksheetDescription | undefined;
        for (const fieldName in json) {
            if (fieldName === "display_name_en") {
                displayNameEn = json[fieldName];
            } else if (fieldName === "id") {
                id = WorksheetFeatureId.parse(json[fieldName]);
            } else if (fieldName === "value_ids") {
                valueIds = (json[fieldName]).map((element: any) => WorksheetFeatureValueId.parse(element));
            } else if (fieldName === "description") {
                description = WorksheetDescription.fromThryftJsonObject(json[fieldName]);
            }
        }
        if (displayNameEn == null) {
            throw new TypeError("displayNameEn is required");
        }
        if (id == null) {
            throw new TypeError("id is required");
        }
        if (valueIds == null) {
            throw new TypeError("valueIds is required");
        }
        return new WorksheetFeatureDefinition({displayNameEn, id, valueIds, description});
    }

    public toJsonObject(): {description: {rights: {author: string, license: string, source_name: string, source_url: string}, text_en: string} | undefined, display_name_en: string, id: string, value_ids: string[]} {
        return {
            description: this.description != null ? this.description.toJsonObject() : undefined,
            display_name_en: this.displayNameEn,
            id: this.id.toString(),
            value_ids: (this.valueIds).map((inElement) => inElement.toString())
        };
    }

    public toString(): string {
        return "WorksheetFeatureDefinition(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): {description: {rights: {author: string, license: string, source_name: string, source_url: string}, text_en: string} | undefined, display_name_en: string, id: string, value_ids: string[]} {
        return {
            description: this.description != null ? this.description.toThryftJsonObject() : undefined,
            display_name_en: this.displayNameEn,
            id: this.id.toString(),
            value_ids: (this.valueIds).map((inElement) => inElement.toString())
        };
    }

    private static validateDescription(description: WorksheetDescription | undefined): WorksheetDescription | undefined {
        return description;
    }

    private static validateDisplayNameEn(displayNameEn: string): string {
        if (displayNameEn == null) {
            throw new RangeError("displayNameEn is null or undefined");
        }
        if (displayNameEn.trim().length === 0) {
            throw new RangeError("displayNameEn is blank");
        }
        if (displayNameEn.length < 1) {
            throw new RangeError("expected len(displayNameEn) to be >= 1, was " + displayNameEn.length);
        }
        return displayNameEn;
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

    public readonly displayNameEn: string;

    public readonly id: WorksheetFeatureId;

    public readonly valueIds: WorksheetFeatureValueId[];
}
