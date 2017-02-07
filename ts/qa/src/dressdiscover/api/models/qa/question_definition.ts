import { QuestionValueDefinition } from "./question_value_definition";

export class QuestionDefinition {
    constructor(private id: string, private values_?: QuestionValueDefinition[]) {
    }




    static fromThryftJSON(json: any): QuestionDefinition {
        id: string;
        values_?: QuestionValueDefinition[];
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = json[fieldName];
            } else if (fieldName == "values_") {
                values_ = function(json: any[]): QuestionValueDefinition[] { var sequence: QuestionValueDefinition[] = []; for (var i = 0; i < json.length; i++) { sequence.push(QuestionValueDefinition.fromThryftJSON(json[i])); } return sequence; }(json[fieldName]);
            }
        }
        return new QuestionDefinition(id, values_);
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id;
        if (this.has("values_")) {
            json["values_"] = function (__inArray: QuestionValueDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJSON()); } return __outArray; }(this.values_.models);
        }
        return json;
    }
}
