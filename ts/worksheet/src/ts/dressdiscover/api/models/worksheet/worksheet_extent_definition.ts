import { WorksheetDescription } from "./worksheet_description";
import { WorksheetExtentId } from "./worksheet_extent_id";

export class WorksheetExtentDefinition {
    constructor(kwds: {id: WorksheetExtentId, description?: WorksheetDescription, displayName?: string}) {
        this.idPrivate = WorksheetExtentDefinition.validateId(kwds.id);
        if (kwds.description != null) {
            this.descriptionPrivate = WorksheetExtentDefinition.validateDescription(kwds.description);
        } else {
            this.descriptionPrivate = undefined;
        }
        if (kwds.displayName != null) {
            this.displayNamePrivate = WorksheetExtentDefinition.validateDisplayName(kwds.displayName);
        } else {
            this.displayNamePrivate = undefined;
        }
    }

    get id(): WorksheetExtentId {
        return this.idPrivate;
    }

    set id(id: WorksheetExtentId) {
        this.idPrivate = WorksheetExtentDefinition.validateId(id);
    }

    get description(): WorksheetDescription | undefined {
        return this.descriptionPrivate;
    }

    set description(description: WorksheetDescription | undefined) {
        this.descriptionPrivate = WorksheetExtentDefinition.validateDescription(description);
    }

    get displayName(): string | undefined {
        return this.displayNamePrivate;
    }

    set displayName(displayName: string | undefined) {
        this.displayNamePrivate = WorksheetExtentDefinition.validateDisplayName(displayName);
    }

    public deepCopy(): WorksheetExtentDefinition {
        return new WorksheetExtentDefinition({ id: this.id, description: (this.description ? (this.description.deepCopy()) : undefined), displayName: this.displayName });
    }

    public equals(other: WorksheetExtentDefinition): boolean {
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

    public static fromThryftJsonObject(json: any): WorksheetExtentDefinition {
        let id: WorksheetExtentId | undefined;
        let description: WorksheetDescription | undefined;
        let displayName: string | undefined;
        for (const fieldName in json) {
            if (fieldName === "id") {
                id = WorksheetExtentId.parse(json[fieldName]);
            } else if (fieldName === "description") {
                description = WorksheetDescription.fromThryftJsonObject(json[fieldName]);
            } else if (fieldName === "display_name") {
                displayName = json[fieldName];
            }
        }
        if (id == null) {
            throw new TypeError("id is required");
        }
        return new WorksheetExtentDefinition({id, description, displayName});
    }

    public toJsonObject(): any {
        const json: {[index: string]: any} = {};
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
        return "WorksheetExtentDefinition(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): any {
        const json: {[index: string]: any} = {};
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

    private static validateId(id: WorksheetExtentId): WorksheetExtentId {
        if (id == null) {
            throw new RangeError("id is null or undefined");
        }
        return id;
    }

    private descriptionPrivate?: WorksheetDescription;

    private displayNamePrivate?: string;

    private idPrivate: WorksheetExtentId;
}
