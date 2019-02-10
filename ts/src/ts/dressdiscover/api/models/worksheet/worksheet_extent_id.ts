export class WorksheetExtentId {
    public static parse(id: string): WorksheetExtentId {
        if (id.trim().length === 0) {
            throw new RangeError("id is empty");
        }
        return new WorksheetExtentId(id);
    }

    public equals(other?: WorksheetExtentId): boolean {
        if (typeof(other) === "undefined") {
            return false;
        }
        return this.id === other.id;
    }

    public toString(): string {
        return this.id;
    }

    private constructor(id: string) {
        this.id = id;
    }

    private id: string;
}
