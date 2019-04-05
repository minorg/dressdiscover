import { WorksheetDescription } from "./worksheet_description";
import { WorksheetFeatureValueId } from "../worksheet_feature_value_id";
import { WorksheetFeatureValueImage } from "./worksheet_feature_value_image";

export class WorksheetFeatureValueDefinition {
    constructor(kwds: {displayNameEn: string, id: WorksheetFeatureValueId, description?: WorksheetDescription, image?: WorksheetFeatureValueImage}) {
        this.displayNameEn = WorksheetFeatureValueDefinition.validateDisplayNameEn(kwds.displayNameEn);
        this.id = WorksheetFeatureValueDefinition.validateId(kwds.id);
        if (kwds.description != null) {
            this.description = WorksheetFeatureValueDefinition.validateDescription(kwds.description);
        } else {
            this.description = undefined;
        }
        if (kwds.image != null) {
            this.image = WorksheetFeatureValueDefinition.validateImage(kwds.image);
        } else {
            this.image = undefined;
        }
    }

    public deepCopy(): WorksheetFeatureValueDefinition {
        return new WorksheetFeatureValueDefinition({ displayNameEn: this.displayNameEn, id: this.id, description: (this.description ? (this.description.deepCopy()) : undefined), image: (this.image ? (this.image.deepCopy()) : undefined) });
    }

    public equals(other: WorksheetFeatureValueDefinition): boolean {
        if (!(this.displayNameEn === other.displayNameEn)) {
            return false;
        }

        if (!(this.id.equals(other.id))) {
            return false;
        }

        if (!((!((typeof (this.description)) === "undefined") && !((typeof (other.description)) === "undefined")) ? ((this.description as WorksheetDescription).equals((other.description as WorksheetDescription))) : (((typeof (this.description)) === "undefined") && ((typeof (other.description)) === "undefined")))) {
            return false;
        }

        if (!((!((typeof (this.image)) === "undefined") && !((typeof (other.image)) === "undefined")) ? ((this.image as WorksheetFeatureValueImage).equals((other.image as WorksheetFeatureValueImage))) : (((typeof (this.image)) === "undefined") && ((typeof (other.image)) === "undefined")))) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): WorksheetFeatureValueDefinition {
        let displayNameEn: string | undefined;
        let id: WorksheetFeatureValueId | undefined;
        let description: WorksheetDescription | undefined;
        let image: WorksheetFeatureValueImage | undefined;
        for (const fieldName in json) {
            if (fieldName === "display_name_en") {
                displayNameEn = json[fieldName];
            } else if (fieldName === "id") {
                id = WorksheetFeatureValueId.parse(json[fieldName]);
            } else if (fieldName === "description") {
                description = WorksheetDescription.fromThryftJsonObject(json[fieldName]);
            } else if (fieldName === "image") {
                image = WorksheetFeatureValueImage.fromThryftJsonObject(json[fieldName]);
            }
        }
        if (displayNameEn == null) {
            throw new TypeError("displayNameEn is required");
        }
        if (id == null) {
            throw new TypeError("id is required");
        }
        return new WorksheetFeatureValueDefinition({displayNameEn, id, description, image});
    }

    public toJsonObject(): {[index: string]: any} {
        const json: {[index: string]: any} = {};
        json.display_name_en = this.displayNameEn;
        json.id = this.id.toString();
        if (this.description != null) {
            json.description = this.description.toJsonObject();
        }
        if (this.image != null) {
            json.image = this.image.toJsonObject();
        }
        return json;
    }

    public toString(): string {
        return "WorksheetFeatureValueDefinition(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): {[index: string]: any} {
        const json: {[index: string]: any} = {};
        json.display_name_en = this.displayNameEn;
        json.id = this.id.toString();
        if (this.description != null) {
            json.description = this.description.toThryftJsonObject();
        }
        if (this.image != null) {
            json.image = this.image.toThryftJsonObject();
        }
        return json;
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

    public readonly displayNameEn: string;

    public readonly id: WorksheetFeatureValueId;

    public readonly image?: WorksheetFeatureValueImage;
}
