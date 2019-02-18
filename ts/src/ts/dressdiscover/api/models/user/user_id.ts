export class UserId {
    public static parse(id: string): UserId {
        if (id.trim().length === 0) {
            throw new RangeError("id is empty");
        }
        return new UserId(id);
    }

    public equals(other?: UserId): boolean {
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
