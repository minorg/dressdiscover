export class NoSuchQuestionSetException {
    private _id?: string;

    constructor(id?: string) {
        this.id = id;
    }

    get id(): string | undefined {
        return this._id;
    }

    set id(id: string | undefined) {
        if (id != null) {
            if (id.trim().length == 0) {
                throw new RangeError('id is blank');
            }
            if (id.length > 36) {
                throw new RangeError("expected len(id) to be <= 36, was " + id.length)
            }
            if (id.length < 36) {
                throw new RangeError("expected len(id) to be >= 36, was " + id.length)
            }
        }
        this._id = id;
    }

    static fromThryftJSON(json: any): NoSuchQuestionSetException {
        var id: string | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = json[fieldName];
            }
        }

        return new NoSuchQuestionSetException(id);
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        if (this.id != null) {
            json["id"] = this.id;
        }
        return json;
    }
}
