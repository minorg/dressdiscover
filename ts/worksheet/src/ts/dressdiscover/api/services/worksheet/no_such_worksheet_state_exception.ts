import { WorksheetStateId } from "../../models/worksheet/worksheet_state_id";

export class NoSuchWorksheetStateException {
    constructor(kwds: {id: WorksheetStateId}) {
        this._id = NoSuchWorksheetStateException._validateId(kwds.id);
    }

    get id(): WorksheetStateId {
        return this._id;
    }

    set id(id: WorksheetStateId) {
        this._id = NoSuchWorksheetStateException._validateId(id);
    }

    private static _validateId(id: WorksheetStateId): WorksheetStateId {
        if (id == null) {
            throw new RangeError('id is null or undefined');
        }
        return id;
    }

    deepCopy(): NoSuchWorksheetStateException {
        return new NoSuchWorksheetStateException({ id: this.id });
    }

    equals(other: NoSuchWorksheetStateException): boolean {
        if (!(this.id.equals(other.id))) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): NoSuchWorksheetStateException {
        let id: WorksheetStateId | undefined;
        for (let fieldName in json) {
            if (fieldName == "id") {
                id = WorksheetStateId.parse(json[fieldName]);
            }
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        return new NoSuchWorksheetStateException({id: id});
    }

    toJsonObject(): any {
        const json: {[index: string]: any} = {};
        json["id"] = this.id.toString();
        return json;
    }

    toString(): string {
        return "NoSuchWorksheetStateException(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        const json: {[index: string]: any} = {};
        json["id"] = this.id.toString();
        return json;
    }

    private _id: WorksheetStateId;
}
