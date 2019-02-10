import { WorksheetDescription } from "./worksheet_description";
import { WorksheetFeatureId } from "./worksheet_feature_id";
import { WorksheetFeatureSetId } from "./worksheet_feature_set_id";

export class WorksheetFeatureSetDefinition {
    constructor(kwds: {featureIds: WorksheetFeatureId[], id: WorksheetFeatureSetId, description?: WorksheetDescription, displayName?: string}) {
        this.featureIdsPrivate = WorksheetFeatureSetDefinition.validateFeatureIds(kwds.featureIds);
        this.idPrivate = WorksheetFeatureSetDefinition.validateId(kwds.id);
        if (kwds.description != null) {
            this.descriptionPrivate = WorksheetFeatureSetDefinition.validateDescription(kwds.description);
        } else {
            this.descriptionPrivate = undefined;
        }
        if (kwds.displayName != null) {
            this.displayNamePrivate = WorksheetFeatureSetDefinition.validateDisplayName(kwds.displayName);
        } else {
            this.displayNamePrivate = undefined;
        }
    }

    get featureIds(): WorksheetFeatureId[] {
        return this.featureIdsPrivate;
    }

    set featureIds(featureIds: WorksheetFeatureId[]) {
        this.featureIdsPrivate = WorksheetFeatureSetDefinition.validateFeatureIds(featureIds);
    }

    get id(): WorksheetFeatureSetId {
        return this.idPrivate;
    }

    set id(id: WorksheetFeatureSetId) {
        this.idPrivate = WorksheetFeatureSetDefinition.validateId(id);
    }

    get description(): WorksheetDescription | undefined {
        return this.descriptionPrivate;
    }

    set description(description: WorksheetDescription | undefined) {
        this.descriptionPrivate = WorksheetFeatureSetDefinition.validateDescription(description);
    }

    get displayName(): string | undefined {
        return this.displayNamePrivate;
    }

    set displayName(displayName: string | undefined) {
        this.displayNamePrivate = WorksheetFeatureSetDefinition.validateDisplayName(displayName);
    }

    public deepCopy(): WorksheetFeatureSetDefinition {
        return new WorksheetFeatureSetDefinition({ featureIds: (this.featureIds).map((value0) => value0), id: this.id, description: (this.description ? (this.description.deepCopy()) : undefined), displayName: this.displayName });
    }

    public equals(other: WorksheetFeatureSetDefinition): boolean {
        if (!(((left: WorksheetFeatureId[], right: WorksheetFeatureId[]): boolean => { if (left.length !== right.length) { return false; } for (let elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; })(this.featureIds, other.featureIds))) {
            return false;
        }

        if (!(this.id.equals(other.id))) {
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

    public static fromThryftJsonObject(json: any): WorksheetFeatureSetDefinition {
        let featureIds: WorksheetFeatureId[] | undefined;
        let id: WorksheetFeatureSetId | undefined;
        let description: WorksheetDescription | undefined;
        let displayName: string | undefined;
        for (const fieldName in json) {
            if (fieldName === "feature_ids") {
                featureIds = (json[fieldName]).map((element: any) => WorksheetFeatureId.parse(element));
            } else if (fieldName === "id") {
                id = WorksheetFeatureSetId.parse(json[fieldName]);
            } else if (fieldName === "description") {
                description = WorksheetDescription.fromThryftJsonObject(json[fieldName]);
            } else if (fieldName === "display_name") {
                displayName = json[fieldName];
            }
        }
        if (featureIds == null) {
            throw new TypeError("featureIds is required");
        }
        if (id == null) {
            throw new TypeError("id is required");
        }
        return new WorksheetFeatureSetDefinition({featureIds, id, description, displayName});
    }

    public toJsonObject(): any {
        const json: {[index: string]: any} = {};
        json.feature_ids = (this.featureIds).map((inElement) => inElement.toString());
        json.id = this.id.toString();
        if (this.description != null) {
            json.description = this.description.toJsonObject();
        }
        if (this.displayName != null) {
            json.display_name = this.displayName;
        }
        return json;
    }

    public toString(): string {
        return "WorksheetFeatureSetDefinition(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): any {
        const json: {[index: string]: any} = {};
        json.feature_ids = (this.featureIds).map((inElement) => inElement.toString());
        json.id = this.id.toString();
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

    private descriptionPrivate?: WorksheetDescription;

    private displayNamePrivate?: string;

    private featureIdsPrivate: WorksheetFeatureId[];

    private idPrivate: WorksheetFeatureSetId;
}
