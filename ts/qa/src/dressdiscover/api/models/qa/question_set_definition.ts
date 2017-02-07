import { QuestionDefinition } from "./question_definition";

export class QuestionSetDefinition {
    constructor(public features: QuestionDefinition[]) {
    }

    static fromThryftJSON(json: any): QuestionSetDefinition {
        var features: QuestionDefinition[] | undefined;
        for (var fieldName in json) {
            if (fieldName == "features") {
                features = function(json: any[]): QuestionDefinition[] { var sequence: QuestionDefinition[] = []; for (var i = 0; i < json.length; i++) { sequence.push(QuestionDefinition.fromThryftJSON(json[i])); } return sequence; }(json[fieldName]);
            }
        }
        if (features == null) {
            throw new Error('features is required');
        }
        return new QuestionSetDefinition(features);
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["features"] = function (__inArray: QuestionDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJSON()); } return __outArray; }(this.features);
        return json;
    }
}
