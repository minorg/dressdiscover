export class WorksheetFeatureId {
    public static parse(id: string): WorksheetFeatureId {
        if (id.trim().length == 0) {
            throw new RangeError("id is empty");
        }
        return new WorksheetFeatureId(id);
    }

    public equals(other?: WorksheetFeatureId): boolean {
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
