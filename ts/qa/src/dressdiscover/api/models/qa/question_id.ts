export class QuestionId {
    public static parse(id: string): QuestionId {
        if (id.trim().length != 24) {
            throw new RangeError('id is not the right length');
        }
        return new QuestionId(id);
    }

    public toString(): string {
        return this._id;
    }

    private constructor(id: string) {
        this._id = id;
    }

    private _id: string;
}
