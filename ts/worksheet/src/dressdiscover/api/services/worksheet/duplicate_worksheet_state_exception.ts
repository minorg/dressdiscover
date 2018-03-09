import { WorksheetStateId } from "../../models/worksheet/worksheet_state_id";

export class DuplicateWorksheetStateException {
    constructor(kwds: {id: WorksheetStateId}) {
        this._id = DuplicateWorksheetStateException._validateId(kwds.id);
    }

    get id(): WorksheetStateId {
        return this._id;
    }

    set id(id: WorksheetStateId) {
        this._id = DuplicateWorksheetStateException._validateId(id);
    }

    private static _validateId(id: WorksheetStateId): WorksheetStateId {
        if (id == null) {
            throw new RangeError('id is null or undefined');
        }
        return id;
    }

    deepCopy(): DuplicateWorksheetStateException {
        return new DuplicateWorksheetStateException({ id: this.id });
    }

    equals(other: DuplicateWorksheetStateException): boolean {
        if (!(this.id.equals(other.id))) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): DuplicateWorksheetStateException {
        var id: WorksheetStateId | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = WorksheetStateId.parse(json[fieldName]);
            }
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        return new DuplicateWorksheetStateException({id: id});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id.toString();
        return json;
    }

    toString(): string {
        return "DuplicateWorksheetStateException(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id.toString();
        return json;
    }

    private _id: WorksheetStateId;
}
