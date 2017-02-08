export class QuestionValueDefinition {
    private _id: string;

    constructor(id: string) {
        this.id = id;
    }

    get id(): string {
        return this._id;
    }

    set id(id: string) {
        this._id = id;
    }

    static fromThryftJSON(json: any): QuestionValueDefinition {
        var id: string | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = json[fieldName];
            }
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        return new QuestionValueDefinition(id);
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id;
        return json;
    }
}
