export class WorksheetFeatureSetId {
    public static parse(id: string): WorksheetFeatureSetId {
        if (id.trim().length === 0) {
            throw new RangeError("id is empty");
        }
        return new WorksheetFeatureSetId(id);
    }

    public equals(other?: WorksheetFeatureSetId): boolean {
        if (typeof(other) === "undefined") {
            return false;
        }
        return this.id === other.id;
    }

    public toString(): string {
        return this.id;
    }

    private constructor(private readonly id: string) {
    }
}
