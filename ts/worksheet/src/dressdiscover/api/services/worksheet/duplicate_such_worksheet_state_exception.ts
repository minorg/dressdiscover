import { WorksheetStateId } from "../../models/worksheet/worksheet_state_id";

export class DuplicateSuchWorksheetStateException {
    constructor(kwds: {id: WorksheetStateId}) {
        this._id = DuplicateSuchWorksheetStateException._validateId(kwds.id);
    }

    get id(): WorksheetStateId {
        return this._id;
    }

    set id(id: WorksheetStateId) {
        this._id = DuplicateSuchWorksheetStateException._validateId(id);
    }

    private static _validateId(id: WorksheetStateId): WorksheetStateId {
        if (id == null) {
            throw new RangeError('id is null or undefined');
        }
        return id;
    }

    deepCopy(): DuplicateSuchWorksheetStateException {
        return new DuplicateSuchWorksheetStateException({ id: this.id });
    }

    equals(other: DuplicateSuchWorksheetStateException): boolean {
        if (!(this.id.equals(other.id))) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): DuplicateSuchWorksheetStateException {
        var id: WorksheetStateId | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = WorksheetStateId.parse(json[fieldName]);
            }
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        return new DuplicateSuchWorksheetStateException({id: id});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id.toString();
        return json;
    }

    toString(): string {
        return "DuplicateSuchWorksheetStateException(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id.toString();
        return json;
    }

    private _id: WorksheetStateId;
}
