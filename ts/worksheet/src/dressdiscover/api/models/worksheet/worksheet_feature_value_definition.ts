import { WorksheetFeatureValueImage } from "./worksheet_feature_value_image";

export class WorksheetFeatureValueDefinition {
    constructor(kwds: {id: string, displayName?: string, image?: WorksheetFeatureValueImage}) {
        this.id = kwds.id;
        if (kwds.displayName != null) {
            this.displayName = kwds.displayName;
        }
        if (kwds.image != null) {
            this.image = kwds.image;
        }
    }

    get id(): string {
        return this._id;
    }

    set id(id: string) {
        if (id.trim().length == 0) {
            throw new RangeError('id is blank');
        }
        if (id.length < 1) {
            throw new RangeError("expected len(id) to be >= 1, was " + id.length);
        }
        this._id = id;
    }

    get displayName(): string | undefined {
        return this._displayName;
    }

    set displayName(displayName: string | undefined) {
        if (displayName != null) {
            if (displayName.trim().length == 0) {
                throw new RangeError('displayName is blank');
            }
            if (displayName.length < 1) {
                throw new RangeError("expected len(displayName) to be >= 1, was " + displayName.length);
            }
        }
        this._displayName = displayName;
    }

    get image(): WorksheetFeatureValueImage | undefined {
        return this._image;
    }

    set image(image: WorksheetFeatureValueImage | undefined) {
        if (image != null) {

        }
        this._image = image;
    }

    deepCopy(): WorksheetFeatureValueDefinition {
        return new WorksheetFeatureValueDefinition({ id: this.id, displayName: this.displayName, image: (this.image ? (this.image.deepCopy()) : undefined) });
    }

    equals(other: WorksheetFeatureValueDefinition): boolean {
        if (!(this.id === other.id)) {
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
        var id: string | undefined;
        var displayName: string | undefined;
        var image: WorksheetFeatureValueImage | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = json[fieldName];
            } else if (fieldName == "display_name") {
                displayName = json[fieldName];
            } else if (fieldName == "image") {
                image = WorksheetFeatureValueImage.fromThryftJsonObject(json[fieldName]);
            }
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        return new WorksheetFeatureValueDefinition({id: id, displayName: displayName, image: image});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id;
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
        json["id"] = this.id;
        if (this.displayName != null) {
            json["display_name"] = this.displayName;
        }
        if (this.image != null) {
            json["image"] = this.image.toThryftJsonObject();
        }
        return json;
    }

    private _displayName?: string = undefined;

    private _id: string = "";

    private _image?: WorksheetFeatureValueImage = undefined;
}
