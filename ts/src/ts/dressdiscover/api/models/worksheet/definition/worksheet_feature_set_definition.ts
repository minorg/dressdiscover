import { WorksheetDescription } from "./worksheet_description";
import { WorksheetFeatureId } from "../worksheet_feature_id";
import { WorksheetFeatureSetId } from "../worksheet_feature_set_id";

export class WorksheetFeatureSetDefinition {
    constructor(kwds: {displayNameEn: string, featureIds: WorksheetFeatureId[], id: WorksheetFeatureSetId, description?: WorksheetDescription}) {
        this.displayNameEn = WorksheetFeatureSetDefinition.validateDisplayNameEn(kwds.displayNameEn);
        this.featureIds = WorksheetFeatureSetDefinition.validateFeatureIds(kwds.featureIds);
        this.id = WorksheetFeatureSetDefinition.validateId(kwds.id);
        if (kwds.description != null) {
            this.description = WorksheetFeatureSetDefinition.validateDescription(kwds.description);
        } else {
            this.description = undefined;
        }
    }

    public deepCopy(): WorksheetFeatureSetDefinition {
        return new WorksheetFeatureSetDefinition({ displayNameEn: this.displayNameEn, featureIds: (this.featureIds).map((value0) => value0), id: this.id, description: (this.description ? (this.description.deepCopy()) : undefined) });
    }

    public equals(other: WorksheetFeatureSetDefinition): boolean {
        if (!(this.displayNameEn === other.displayNameEn)) {
            return false;
        }

        if (!(((left: WorksheetFeatureId[], right: WorksheetFeatureId[]): boolean => { if (left.length !== right.length) { return false; } for (let elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; })(this.featureIds, other.featureIds))) {
            return false;
        }

        if (!(this.id.equals(other.id))) {
            return false;
        }

        if (!((!((typeof (this.description)) === "undefined") && !((typeof (other.description)) === "undefined")) ? ((this.description as WorksheetDescription).equals((other.description as WorksheetDescription))) : (((typeof (this.description)) === "undefined") && ((typeof (other.description)) === "undefined")))) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): WorksheetFeatureSetDefinition {
        let displayNameEn: string | undefined;
        let featureIds: WorksheetFeatureId[] | undefined;
        let id: WorksheetFeatureSetId | undefined;
        let description: WorksheetDescription | undefined;
        for (const fieldName in json) {
            if (fieldName === "display_name_en") {
                displayNameEn = json[fieldName];
            } else if (fieldName === "feature_ids") {
                featureIds = (json[fieldName]).map((element: any) => WorksheetFeatureId.parse(element));
            } else if (fieldName === "id") {
                id = WorksheetFeatureSetId.parse(json[fieldName]);
            } else if (fieldName === "description") {
                description = WorksheetDescription.fromThryftJsonObject(json[fieldName]);
            }
        }
        if (displayNameEn == null) {
            throw new TypeError("displayNameEn is required");
        }
        if (featureIds == null) {
            throw new TypeError("featureIds is required");
        }
        if (id == null) {
            throw new TypeError("id is required");
        }
        return new WorksheetFeatureSetDefinition({displayNameEn, featureIds, id, description});
    }

    public toJsonObject(): {description: {rights: {author: string, license: string, source_name: string, source_url: string}, text_en: string} | undefined, display_name_en: string, feature_ids: Array<string>, id: string} {
        return {
            description: this.description != null ? this.description.toJsonObject() : undefined,
            display_name_en: this.displayNameEn,
            feature_ids: (this.featureIds).map((inElement) => inElement.toString()),
            id: this.id.toString()
        };
    }

    public toString(): string {
        return "WorksheetFeatureSetDefinition(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): {description: {rights: {author: string, license: string, source_name: string, source_url: string}, text_en: string} | undefined, display_name_en: string, feature_ids: Array<string>, id: string} {
        return {
            description: this.description != null ? this.description.toThryftJsonObject() : undefined,
            display_name_en: this.displayNameEn,
            feature_ids: (this.featureIds).map((inElement) => inElement.toString()),
            id: this.id.toString()
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

    private static validateFeatureIds(featureIds: WorksheetFeatureId[]): WorksheetFeatureId[] {
        if (featureIds == null) {
            throw new RangeError("featureIds is null or undefined");
        }
        if (featureIds.length < 1) {
            throw new RangeError("expected len(featureIds) to be >= 1, was " + featureIds.length);
        }
        return featureIds;
    }

    private static validateId(id: WorksheetFeatureSetId): WorksheetFeatureSetId {
        if (id == null) {
            throw new RangeError("id is null or undefined");
        }
        return id;
    }

    public readonly description?: WorksheetDescription;

    public readonly displayNameEn: string;

    public readonly featureIds: WorksheetFeatureId[];

    public readonly id: WorksheetFeatureSetId;
}
