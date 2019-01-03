export class WorksheetExtentId {
    public static parse(id: string): WorksheetExtentId {
        if (id.trim().length == 0) {
            throw new RangeError("id is empty");
        }
        return new WorksheetExtentId(id);
    }

    public equals(other?: WorksheetExtentId): boolean {
        if (typeof(other) === "undefined") {
            return false;
        }
        return this._id == other._id;
    }

    public toString(): string {
        return this._id;
    }

    private constructor(id: string) {
        this._id = id;
    }

    private _id: string;
}
