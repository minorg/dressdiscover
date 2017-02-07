export class QuestionValueDefinition {
    constructor(private id: string) {
    }

    static fromThryftJSON(json: any): QuestionValueDefinition {
        id: string;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = json[fieldName];
            }
        }
        return new QuestionValueDefinition(id);
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id;
        return json;
    }
}
