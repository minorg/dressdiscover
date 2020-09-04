import { WorksheetStateId } from "../../../models/worksheet/state/worksheet_state_id";

export class NoSuchWorksheetStateException {
    constructor(kwds: {id: WorksheetStateId}) {
        this.id = NoSuchWorksheetStateException.validateId(kwds.id);
    }

    public deepCopy(): NoSuchWorksheetStateException {
        return new NoSuchWorksheetStateException({ id: this.id });
    }

    public equals(other: NoSuchWorksheetStateException): boolean {
        if (!(this.id.equals(other.id))) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): NoSuchWorksheetStateException {
        let id: WorksheetStateId | undefined;
        for (const fieldName in json) {
            if (fieldName === "id") {
                id = WorksheetStateId.parse(json[fieldName]);
            }
        }
        if (id == null) {
            throw new TypeError("id is required");
        }
        return new NoSuchWorksheetStateException({id});
    }

    public toJsonObject(): {id: string} {
        return {
            id: this.id.toString()
        };
    }

    public toString(): string {
        return "NoSuchWorksheetStateException(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): {id: string} {
        return {
            id: this.id.toString()
        };
    }

    private static validateId(id: WorksheetStateId): WorksheetStateId {
        if (id == null) {
            throw new RangeError("id is null or undefined");
        }
        return id;
    }

    public readonly id: WorksheetStateId;
}
