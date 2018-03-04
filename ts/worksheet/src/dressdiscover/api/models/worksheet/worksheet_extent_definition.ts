import { WorksheetExtentId } from "./worksheet_extent_id";

export class WorksheetExtentDefinition {
    constructor(kwds: {id: WorksheetExtentId, displayName?: string}) {
        this._id = WorksheetExtentDefinition._validateId(kwds.id);
        if (kwds.displayName != null) {
            this._displayName = WorksheetExtentDefinition._validateDisplayName(kwds.displayName);
        } else {
            this._displayName = undefined;
        }
    }

    get id(): WorksheetExtentId {
        return this._id;
    }

    set id(id: WorksheetExtentId) {
        this._id = WorksheetExtentDefinition._validateId(id);
    }

    get displayName(): string | undefined {
        return this._displayName;
    }

    set displayName(displayName: string | undefined) {
        this._displayName = WorksheetExtentDefinition._validateDisplayName(displayName);
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

    private static _validateId(id: WorksheetExtentId): WorksheetExtentId {
        if (id == null) {
            throw new RangeError('id is null or undefined');
        }
        return id;
    }

    deepCopy(): WorksheetExtentDefinition {
        return new WorksheetExtentDefinition({ id: this.id, displayName: this.displayName });
    }

    equals(other: WorksheetExtentDefinition): boolean {
        if (!(this.id.equals(other.id))) {
            return false;
        }

        if (!((!((typeof (this.displayName)) === "undefined") && !((typeof (other.displayName)) === "undefined")) ? ((this.displayName as string) === (other.displayName as string)) : (((typeof (this.displayName)) === "undefined") && ((typeof (other.displayName)) === "undefined")))) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): WorksheetExtentDefinition {
        var id: WorksheetExtentId | undefined;
        var displayName: string | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = WorksheetExtentId.parse(json[fieldName]);
            } else if (fieldName == "display_name") {
                displayName = json[fieldName];
            }
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        return new WorksheetExtentDefinition({id: id, displayName: displayName});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id.toString();
        if (this.displayName != null) {
            json["display_name"] = this.displayName;
        }
        return json;
    }

    toString(): string {
        return "WorksheetExtentDefinition(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id.toString();
        if (this.displayName != null) {
            json["display_name"] = this.displayName;
        }
        return json;
    }

    private _displayName?: string;

    private _id: WorksheetExtentId;
}
