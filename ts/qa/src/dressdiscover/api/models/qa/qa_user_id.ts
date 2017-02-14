export class QaUserId {
    public static parse(id: string): QaUserId {
        if (id.trim().length == 0) {
            throw new RangeError('id is not the right length');
        }
        return new QaUserId(id);
    }

    public toString(): string {
        return this._id;
    }

    private constructor(id: string) {
        this._id = id;
    }

    private _id: string;
}
