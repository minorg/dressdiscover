import { WorksheetDescription } from "./worksheet_description";
import { WorksheetFeatureValueId } from "../worksheet_feature_value_id";
import { WorksheetFeatureValueImage } from "./worksheet_feature_value_image";

export class WorksheetFeatureValueDefinition {
    constructor(kwds: {id: WorksheetFeatureValueId, description?: WorksheetDescription, displayName?: string, image?: WorksheetFeatureValueImage}) {
        this.id = WorksheetFeatureValueDefinition.validateId(kwds.id);
        if (kwds.description != null) {
            this.description = WorksheetFeatureValueDefinition.validateDescription(kwds.description);
        } else {
            this.description = undefined;
        }
        if (kwds.displayName != null) {
            this.displayName = WorksheetFeatureValueDefinition.validateDisplayName(kwds.displayName);
        } else {
            this.displayName = undefined;
        }
        if (kwds.image != null) {
            this.image = WorksheetFeatureValueDefinition.validateImage(kwds.image);
        } else {
            this.image = undefined;
        }
    }

    public deepCopy(): WorksheetFeatureValueDefinition {
        return new WorksheetFeatureValueDefinition({ id: this.id, description: (this.description ? (this.description.deepCopy()) : undefined), displayName: this.displayName, image: (this.image ? (this.image.deepCopy()) : undefined) });
    }

    public equals(other: WorksheetFeatureValueDefinition): boolean {
        if (!(this.id.equals(other.id))) {
            return false;
        }

        if (!((!((typeof (this.description)) === "undefined") && !((typeof (other.description)) === "undefined")) ? ((this.description as WorksheetDescription).equals((other.description as WorksheetDescription))) : (((typeof (this.description)) === "undefined") && ((typeof (other.description)) === "undefined")))) {
            return false;
        }

        if (!((!((typeof (this.displayName)) === "undefined") && !((typeof (other.displayName)) === "undefined")) ? ((this.displayName as string) === (other.displayName as string)) : (((typeof (this.displayName)) === "undefined") && ((typeof (other.displayName)) === "undefined")))) {
            return false;
        }

        if (!((!((typeof (this.image)) === "undefined") && !((typeof (other.image)) === "undefined")) ? ((this.image as WorksheetFeatureValueImage).equals((other.image as WorksheetFeatureValueImage))) : (((typeof (this.image)) === "undefined") && ((typeof (other.image)) === "undefined")))) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): WorksheetFeatureValueDefinition {
        let id: WorksheetFeatureValueId | undefined;
        let description: WorksheetDescription | undefined;
        let displayName: string | undefined;
        let image: WorksheetFeatureValueImage | undefined;
        for (const fieldName in json) {
            if (fieldName === "id") {
                id = WorksheetFeatureValueId.parse(json[fieldName]);
            } else if (fieldName === "description") {
                description = WorksheetDescription.fromThryftJsonObject(json[fieldName]);
            } else if (fieldName === "display_name") {
                displayName = json[fieldName];
            } else if (fieldName === "image") {
                image = WorksheetFeatureValueImage.fromThryftJsonObject(json[fieldName]);
            }
        }
        if (id == null) {
            throw new TypeError("id is required");
        }
        return new WorksheetFeatureValueDefinition({id, description, displayName, image});
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
        if (this.image != null) {
            json.image = this.image.toJsonObject();
        }
        return json;
    }

    public toString(): string {
        return "WorksheetFeatureValueDefinition(" + JSON.stringify(this.toThryftJsonObject()) + ")";
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
        if (this.image != null) {
            json.image = this.image.toThryftJsonObject();
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

    private static validateId(id: WorksheetFeatureValueId): WorksheetFeatureValueId {
        if (id == null) {
            throw new RangeError("id is null or undefined");
        }
        return id;
    }

    private static validateImage(image: WorksheetFeatureValueImage | undefined): WorksheetFeatureValueImage | undefined {
        return image;
    }

    public readonly description?: WorksheetDescription;

    public readonly displayName?: string;

    public readonly id: WorksheetFeatureValueId;

    public readonly image?: WorksheetFeatureValueImage;
}
