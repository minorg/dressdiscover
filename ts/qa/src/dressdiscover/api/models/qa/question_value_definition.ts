export class QuestionValueDefinition {
    constructor(public id: string) {
    }

    static fromThryftJSON(json: any): QuestionValueDefinition {
        var id: string | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = json[fieldName];
            }
        }
        if (id == null) {
            throw new Error('id is required');
        }
        return new QuestionValueDefinition(id);
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id;
        return json;
    }
}
