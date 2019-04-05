import { WorksheetStateId } from "../../../models/worksheet/state/worksheet_state_id";

export class DuplicateWorksheetStateException {
    constructor(kwds: {id: WorksheetStateId}) {
        this.id = DuplicateWorksheetStateException.validateId(kwds.id);
    }

    public deepCopy(): DuplicateWorksheetStateException {
        return new DuplicateWorksheetStateException({ id: this.id });
    }

    public equals(other: DuplicateWorksheetStateException): boolean {
        if (!(this.id.equals(other.id))) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): DuplicateWorksheetStateException {
        let id: WorksheetStateId | undefined;
        for (const fieldName in json) {
            if (fieldName === "id") {
                id = WorksheetStateId.parse(json[fieldName]);
            }
        }
        if (id == null) {
            throw new TypeError("id is required");
        }
        return new DuplicateWorksheetStateException({id});
    }

    public toJsonObject(): {id: string} {
        return {
            id: this.id.toString()
        };
    }

    public toString(): string {
        return "DuplicateWorksheetStateException(" + JSON.stringify(this.toThryftJsonObject()) + ")";
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
