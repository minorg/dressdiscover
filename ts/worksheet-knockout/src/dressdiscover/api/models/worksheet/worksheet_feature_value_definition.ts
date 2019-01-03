import { WorksheetDescription } from "./worksheet_description";
import { WorksheetFeatureValueId } from "./worksheet_feature_value_id";
import { WorksheetFeatureValueImage } from "./worksheet_feature_value_image";

export class WorksheetFeatureValueDefinition {
    constructor(kwds: {id: WorksheetFeatureValueId, description?: WorksheetDescription, displayName?: string, image?: WorksheetFeatureValueImage}) {
        this._id = WorksheetFeatureValueDefinition._validateId(kwds.id);
        if (kwds.description != null) {
            this._description = WorksheetFeatureValueDefinition._validateDescription(kwds.description);
        } else {
            this._description = undefined;
        }
        if (kwds.displayName != null) {
            this._displayName = WorksheetFeatureValueDefinition._validateDisplayName(kwds.displayName);
        } else {
            this._displayName = undefined;
        }
        if (kwds.image != null) {
            this._image = WorksheetFeatureValueDefinition._validateImage(kwds.image);
        } else {
            this._image = undefined;
        }
    }

    get id(): WorksheetFeatureValueId {
        return this._id;
    }

    set id(id: WorksheetFeatureValueId) {
        this._id = WorksheetFeatureValueDefinition._validateId(id);
    }

    get description(): WorksheetDescription | undefined {
        return this._description;
    }

    set description(description: WorksheetDescription | undefined) {
        this._description = WorksheetFeatureValueDefinition._validateDescription(description);
    }

    get displayName(): string | undefined {
        return this._displayName;
    }

    set displayName(displayName: string | undefined) {
        this._displayName = WorksheetFeatureValueDefinition._validateDisplayName(displayName);
    }

    get image(): WorksheetFeatureValueImage | undefined {
        return this._image;
    }

    set image(image: WorksheetFeatureValueImage | undefined) {
        this._image = WorksheetFeatureValueDefinition._validateImage(image);
    }

    private static _validateDescription(description: WorksheetDescription | undefined): WorksheetDescription | undefined {
        if (description != null) {

        }
        return description;
    }

    private static _validateDisplayName(displayName: string | undefined): string | undefined {
        if (displayName != null) {
            if (displayName.trim().length == 0) {
                throw new RangeError('displayName is blank');
            }
            if (displayName.length < 1) {
                throw new RangeError("expected len(displayName) to be >= 1, was " + displayName.length);
            }
        }
        return displayName;
    }

    private static _validateId(id: WorksheetFeatureValueId): WorksheetFeatureValueId {
        if (id == null) {
            throw new RangeError('id is null or undefined');
        }
        return id;
    }

    private static _validateImage(image: WorksheetFeatureValueImage | undefined): WorksheetFeatureValueImage | undefined {
        if (image != null) {

        }
        return image;
    }

    deepCopy(): WorksheetFeatureValueDefinition {
        return new WorksheetFeatureValueDefinition({ id: this.id, description: (this.description ? (this.description.deepCopy()) : undefined), displayName: this.displayName, image: (this.image ? (this.image.deepCopy()) : undefined) });
    }

    equals(other: WorksheetFeatureValueDefinition): boolean {
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

    static fromThryftJsonObject(json: any): WorksheetFeatureValueDefinition {
        var id: WorksheetFeatureValueId | undefined;
        var description: WorksheetDescription | undefined;
        var displayName: string | undefined;
        var image: WorksheetFeatureValueImage | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = WorksheetFeatureValueId.parse(json[fieldName]);
            } else if (fieldName == "description") {
                description = WorksheetDescription.fromThryftJsonObject(json[fieldName]);
            } else if (fieldName == "display_name") {
                displayName = json[fieldName];
            } else if (fieldName == "image") {
                image = WorksheetFeatureValueImage.fromThryftJsonObject(json[fieldName]);
            }
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        return new WorksheetFeatureValueDefinition({id: id, description: description, displayName: displayName, image: image});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id.toString();
        if (this.description != null) {
            json["description"] = this.description.toJsonObject();
        }
        if (this.displayName != null) {
            json["display_name"] = this.displayName;
        }
        if (this.image != null) {
            json["image"] = this.image.toJsonObject();
        }
        return json;
    }

    toString(): string {
        return "WorksheetFeatureValueDefinition(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id.toString();
        if (this.description != null) {
            json["description"] = this.description.toThryftJsonObject();
        }
        if (this.displayName != null) {
            json["display_name"] = this.displayName;
        }
        if (this.image != null) {
            json["image"] = this.image.toThryftJsonObject();
        }
        return json;
    }

    private _description?: WorksheetDescription;

    private _displayName?: string;

    private _id: WorksheetFeatureValueId;

    private _image?: WorksheetFeatureValueImage;
}